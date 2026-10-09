package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class SharedPreferencesQueue {
    private boolean bulkOperation;
    final ArrayDeque<String> internalQueue;
    private final String itemSeparator;
    private final String queueName;
    private final SharedPreferences sharedPreferences;
    private final Executor syncExecutor;

    private SharedPreferencesQueue(SharedPreferences r2, String r3, String r4, Executor r5) {
        this.internalQueue = new ArrayDeque();
        this.bulkOperation = false;
        this.sharedPreferences = r2;
        this.queueName = r3;
        this.itemSeparator = r4;
        this.syncExecutor = r5;
    }

    public static /* synthetic */ void a(SharedPreferencesQueue r02) {
        r02.syncState();
    }

    private String checkAndSyncState(String r2) {
        if (r2 == null) goto L4;
        boolean r02 = true;
    L5:
        checkAndSyncState(r02);
        return r2;
    L4:
        r02 = false;
        goto L5
    }

    public static SharedPreferencesQueue createInstance(SharedPreferences r1, String r2, String r3, Executor r4) {
        SharedPreferencesQueue r02 = new SharedPreferencesQueue(r1, r2, r3, r4);
        r02.initQueue();
        return r02;
    }

    private void initQueue() {
        ArrayDeque<String> r02 = this.internalQueue;
        monitor-enter(r02);
        this.internalQueue.clear();     // Catch: Throwable -> L12
        String r1 = this.sharedPreferences.getString(this.queueName, "");     // Catch: Throwable -> L12
        if (TextUtils.isEmpty(r1) == false) goto L7;
    L22:
        monitor-exit(r02);     // Catch: Throwable -> L12
        return;
    L7:
        if (r1.contains(this.itemSeparator) == false) goto L22;
        String[] r12 = r1.split(this.itemSeparator, -1);     // Catch: Throwable -> L12
        if (r12.length != 0) goto L14;
        Log.e(Constants.TAG, "Corrupted queue. Please check the queue contents and item separator provided");     // Catch: Throwable -> L12
    L14:
        int r2 = r12.length;     // Catch: Throwable -> L12
        int r3 = 0;
    L15:
        if (r3 >= r2) goto L20;
        String r4 = r12[r3];     // Catch: Throwable -> L12
        if (TextUtils.isEmpty(r4) == true) goto L19;
        this.internalQueue.add(r4);     // Catch: Throwable -> L12
    L19:
        r3 = r3 + 1;     // Catch: Throwable -> L12
        goto L15
    L20:
        monitor-exit(r02);     // Catch: Throwable -> L12
        return;
    L12:
        th = move-exception;
        throw th;
    }

    private void syncState() {
        ArrayDeque<String> r02 = this.internalQueue;
        monitor-enter(r02);
        this.sharedPreferences.edit().putString(this.queueName, serialize()).commit();     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    private void syncStateAsync() {
        this.syncExecutor.execute(new F(this));
    }

    public boolean add(String r3) {
        if (TextUtils.isEmpty(r3) == false) goto L5;
        return false;
    L5:
        if (r3.contains(this.itemSeparator) == true) goto L19;
        ArrayDeque<String> r02 = this.internalQueue;
        monitor-enter(r02);
        boolean r32 = checkAndSyncState(this.internalQueue.add(r3));     // Catch: Throwable -> L12
        monitor-exit(r02);     // Catch: Throwable -> L12
        return r32;
    L12:
        th = move-exception;
        throw th;
    L19:
        return false;
    }

    public void beginTransaction() {
        this.bulkOperation = true;
    }

    public void beginTransactionSync() {
        ArrayDeque<String> r02 = this.internalQueue;
        monitor-enter(r02);
        beginTransaction();     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public void clear() {
        ArrayDeque<String> r02 = this.internalQueue;
        monitor-enter(r02);
        this.internalQueue.clear();     // Catch: Throwable -> L7
        checkAndSyncState(true);     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public void commitTransaction() {
        this.bulkOperation = false;
        syncStateAsync();
    }

    public void commitTransactionSync() {
        ArrayDeque<String> r02 = this.internalQueue;
        monitor-enter(r02);
        commitTransaction();     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public String peek() {
        ArrayDeque<String> r02 = this.internalQueue;
        monitor-enter(r02);
        String r1 = this.internalQueue.peek();     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    public boolean remove(Object r3) {
        ArrayDeque<String> r02 = this.internalQueue;
        monitor-enter(r02);
        boolean r32 = checkAndSyncState(this.internalQueue.remove(r3));     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r32;
    L7:
        th = move-exception;
        throw th;
    }

    public String serialize() {
        StringBuilder r02 = new StringBuilder();
        Iterator<String> r1 = this.internalQueue.iterator();
    L4:
        if (r1.hasNext() == false) goto L7;
        r02.append(r1.next());
        r02.append(this.itemSeparator);
        goto L4
    L7:
        return r02.toString();
    }

    public String serializeSync() {
        ArrayDeque<String> r02 = this.internalQueue;
        monitor-enter(r02);
        String r1 = serialize();     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    public int size() {
        ArrayDeque<String> r02 = this.internalQueue;
        monitor-enter(r02);
        int r1 = this.internalQueue.size();     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    public List<String> toList() {
        ArrayDeque<String> r02 = this.internalQueue;
        monitor-enter(r02);
        ArrayList r1 = new ArrayList(this.internalQueue);     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }

    private boolean checkAndSyncState(boolean r2) {
        if (r2 == true) goto L4;
    L6:
        return r2;
    L4:
        if (this.bulkOperation == true) goto L6;
        syncStateAsync();
        goto L6
    }

    public String remove() {
        ArrayDeque<String> r02 = this.internalQueue;
        monitor-enter(r02);
        String r1 = checkAndSyncState(this.internalQueue.remove());     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r1;
    L7:
        th = move-exception;
        throw th;
    }
}
