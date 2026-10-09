package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class TopicsStore {
    private static final String DIVIDER_QUEUE_OPERATIONS = ",";
    static final String KEY_TOPIC_OPERATIONS_QUEUE = "topic_operation_queue";
    static final String PREFERENCES = "com.google.android.gms.appid";
    private static WeakReference<TopicsStore> topicsStoreWeakReference;
    private final SharedPreferences sharedPreferences;
    private final Executor syncExecutor;
    private SharedPreferencesQueue topicOperationsQueue;

    private TopicsStore(SharedPreferences r1, Executor r2) {
        this.syncExecutor = r2;
        this.sharedPreferences = r1;
    }

    public static synchronized void clearCaches() {
        monitor-enter(TopicsStore.class);
        WeakReference<TopicsStore> r1 = topicsStoreWeakReference;     // Catch: Throwable -> L8
        if (r1 == null) goto L10;
        r1.clear();     // Catch: Throwable -> L8
    L10:
        monitor-exit(TopicsStore.class);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public static synchronized TopicsStore getInstance(Context r3, Executor r4) {
        monitor-enter(TopicsStore.class);
        WeakReference<TopicsStore> r1 = topicsStoreWeakReference;     // Catch: Throwable -> L7
        if (r1 == null) goto L9;
        TopicsStore r12 = r1.get();     // Catch: Throwable -> L7
    L10:
        if (r12 != null) goto L12;
        r12 = new TopicsStore(r3.getSharedPreferences(PREFERENCES, 0), r4);     // Catch: Throwable -> L7
        r12.initStore();     // Catch: Throwable -> L7
        topicsStoreWeakReference = new WeakReference(r12);     // Catch: Throwable -> L7
    L12:
        monitor-exit(TopicsStore.class);
        return r12;
    L9:
        r12 = null;
    L7:
        th = move-exception;
        throw th;
    }

    private synchronized void initStore() {
        monitor-enter(this);
        this.topicOperationsQueue = SharedPreferencesQueue.createInstance(this.sharedPreferences, KEY_TOPIC_OPERATIONS_QUEUE, ",", this.syncExecutor);     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public synchronized boolean addTopicOperation(TopicOperation r2) {
        monitor-enter(this);
        boolean r22 = this.topicOperationsQueue.add(r2.serialize());     // Catch: Throwable -> L6
        monitor-exit(this);
        return r22;
    L6:
        th = move-exception;
        throw th;
    }

    public synchronized void clearTopicOperations() {
        monitor-enter(this);
        this.topicOperationsQueue.clear();     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public synchronized TopicOperation getNextTopicOperation() {
        monitor-enter(this);
        TopicOperation r02 = TopicOperation.from(this.topicOperationsQueue.peek());     // Catch: Throwable -> L6
        monitor-exit(this);
        return r02;
    L6:
        th = move-exception;
        throw th;
    }

    public synchronized List<TopicOperation> getOperations() {
        monitor-enter(this);
        List<String> r02 = this.topicOperationsQueue.toList();     // Catch: Throwable -> L8
        ArrayList r1 = new ArrayList(r02.size());     // Catch: Throwable -> L8
        Iterator<String> r03 = r02.iterator();     // Catch: Throwable -> L8
    L4:
        if (r03.hasNext() == false) goto L10;
        r1.add(TopicOperation.from(r03.next()));     // Catch: Throwable -> L8
        goto L4
    L10:
        monitor-exit(this);
        return r1;
    L8:
        th = move-exception;
        throw th;
    }

    public synchronized TopicOperation pollTopicOperation() {
        monitor-enter(this);
        TopicOperation r02 = TopicOperation.from(this.topicOperationsQueue.remove());     // Catch: Throwable -> L6 NoSuchElementException -> L8
        monitor-exit(this);
        return r02;
    L8:
        Log.e(Constants.TAG, "Polling operation queue failed");     // Catch: Throwable -> L6
        return null;
    L6:
        th = move-exception;
        throw th;
    }

    public synchronized boolean removeTopicOperation(TopicOperation r2) {
        monitor-enter(this);
        boolean r22 = this.topicOperationsQueue.remove(r2.serialize());     // Catch: Throwable -> L6
        monitor-exit(this);
        return r22;
    L6:
        th = move-exception;
        throw th;
    }
}
