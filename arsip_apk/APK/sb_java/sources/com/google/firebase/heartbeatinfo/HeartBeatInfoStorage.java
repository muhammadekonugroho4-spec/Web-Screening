package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.content.SharedPreferences;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
class HeartBeatInfoStorage {
    private static final String GLOBAL = "fire-global";
    private static final String HEARTBEAT_PREFERENCES_NAME = "FirebaseHeartBeat";
    private static final int HEART_BEAT_COUNT_LIMIT = 30;
    private static final String HEART_BEAT_COUNT_TAG = "fire-count";
    private static final String LAST_STORED_DATE = "last-used-date";
    private static final String PREFERENCES_NAME = "FirebaseAppHeartBeat";
    private static HeartBeatInfoStorage instance;
    private final SharedPreferences firebaseSharedPreferences;

    static {
    }

    public HeartBeatInfoStorage(Context r3, String r4) {
        this.firebaseSharedPreferences = r3.getSharedPreferences(HEARTBEAT_PREFERENCES_NAME + r4, 0);
    }

    private synchronized void cleanUpStoredHeartBeats() {
        monitor-enter(this);
        long r02 = this.firebaseSharedPreferences.getLong(HEART_BEAT_COUNT_TAG, 0);     // Catch: Throwable -> L16
        String r2 = "";
        Iterator<Map.Entry<String, ?>> r3 = this.firebaseSharedPreferences.getAll().entrySet().iterator();     // Catch: Throwable -> L16
        String r4 = null;
    L5:
        if (r3.hasNext() == false) goto L19;
        Map.Entry<String, ?> r5 = r3.next();     // Catch: Throwable -> L16
        if ((r5.getValue() instanceof Set) == false) goto L5;
        Iterator r6 = ((Set) r5.getValue()).iterator();     // Catch: Throwable -> L16
    L10:
        if (r6.hasNext() == false) goto L5;
        String r7 = (String) r6.next();     // Catch: Throwable -> L16
        if (r4 == null) goto L18;
        if (r4.compareTo(r7) <= 0) goto L10;
    L18:
        r2 = r5.getKey();     // Catch: Throwable -> L16
        r4 = r7;
        goto L10
    L19:
        HashSet r32 = new HashSet(this.firebaseSharedPreferences.getStringSet(r2, new HashSet()));     // Catch: Throwable -> L16
        r32.remove(r4);     // Catch: Throwable -> L16
        this.firebaseSharedPreferences.edit().putStringSet(r2, r32).putLong(HEART_BEAT_COUNT_TAG, r02 - 1).commit();     // Catch: Throwable -> L16
        monitor-exit(this);
        return;
    L16:
        th = move-exception;
        throw th;
    }

    private synchronized String getFormattedDate(long r2) {
        monitor-enter(this);
        String r22 = new Date(r2).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);     // Catch: Throwable -> L6
        monitor-exit(this);
        return r22;
    L6:
        th = move-exception;
        throw th;
    }

    private synchronized String getStoredUserAgentString(String r5) {
        monitor-enter(this);
        Iterator<Map.Entry<String, ?>> r02 = this.firebaseSharedPreferences.getAll().entrySet().iterator();     // Catch: Throwable -> L16
    L5:
        if (r02.hasNext() == false) goto L18;
        Map.Entry<String, ?> r1 = r02.next();     // Catch: Throwable -> L16
        if ((r1.getValue() instanceof Set) == false) goto L5;
        Iterator r2 = ((Set) r1.getValue()).iterator();     // Catch: Throwable -> L16
    L10:
        if (r2.hasNext() == false) goto L5;
        if (r5.equals((String) r2.next()) == false) goto L10;
        String r52 = r1.getKey();     // Catch: Throwable -> L16
        monitor-exit(this);
        return r52;
    L18:
        monitor-exit(this);
        return null;
    L16:
        th = move-exception;
        throw th;
    }

    private synchronized void removeStoredDate(String r5) {
        monitor-enter(this);
        String r02 = getStoredUserAgentString(r5);     // Catch: Throwable -> L10
        if (r02 != null) goto L7;
        monitor-exit(this);
        return;
    L7:
        HashSet r1 = new HashSet(this.firebaseSharedPreferences.getStringSet(r02, new HashSet()));     // Catch: Throwable -> L10
        r1.remove(r5);     // Catch: Throwable -> L10
        if (r1.isEmpty() == false) goto L12;
        this.firebaseSharedPreferences.edit().remove(r02).commit();     // Catch: Throwable -> L10
    L13:
        monitor-exit(this);
        return;
    L12:
        this.firebaseSharedPreferences.edit().putStringSet(r02, r1).commit();     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        throw th;
    }

    private synchronized void updateStoredUserAgent(String r4, String r5) {
        monitor-enter(this);
        removeStoredDate(r5);     // Catch: Throwable -> L6
        HashSet r02 = new HashSet(this.firebaseSharedPreferences.getStringSet(r4, new HashSet()));     // Catch: Throwable -> L6
        r02.add(r5);     // Catch: Throwable -> L6
        this.firebaseSharedPreferences.edit().putStringSet(r4, r02).commit();     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public synchronized void deleteAllHeartBeats() {
        monitor-enter(this);
        SharedPreferences.Editor r02 = this.firebaseSharedPreferences.edit();     // Catch: Throwable -> L11
        Iterator<Map.Entry<String, ?>> r1 = this.firebaseSharedPreferences.getAll().entrySet().iterator();     // Catch: Throwable -> L11
        int r2 = 0;
    L5:
        if (r1.hasNext() == false) goto L14;
        Map.Entry<String, ?> r3 = r1.next();     // Catch: Throwable -> L11
        if ((r3.getValue() instanceof Set) == false) goto L5;
        Set r4 = (Set) r3.getValue();     // Catch: Throwable -> L11
        String r5 = getFormattedDate(System.currentTimeMillis());     // Catch: Throwable -> L11
        String r32 = r3.getKey();     // Catch: Throwable -> L11
        if (r4.contains(r5) == true) goto L10;
        r02.remove(r32);     // Catch: Throwable -> L11
        goto L5
    L10:
        HashSet r42 = new HashSet();     // Catch: Throwable -> L11
        r42.add(r5);     // Catch: Throwable -> L11
        r2 = r2 + 1;     // Catch: Throwable -> L11
        r02.putStringSet(r32, r42);     // Catch: Throwable -> L11
        goto L5
    L14:
        if (r2 != 0) goto L16;
        r02.remove(HEART_BEAT_COUNT_TAG);     // Catch: Throwable -> L11
    L17:
        r02.commit();     // Catch: Throwable -> L11
        monitor-exit(this);
        return;
    L16:
        r02.putLong(HEART_BEAT_COUNT_TAG, r2);     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        throw th;
    }

    public synchronized List<HeartBeatResult> getAllHeartBeats() {
        monitor-enter(this);
        ArrayList r02 = new ArrayList();     // Catch: Throwable -> L11
        Iterator<Map.Entry<String, ?>> r1 = this.firebaseSharedPreferences.getAll().entrySet().iterator();     // Catch: Throwable -> L11
    L5:
        if (r1.hasNext() == false) goto L13;
        Map.Entry<String, ?> r2 = r1.next();     // Catch: Throwable -> L11
        if ((r2.getValue() instanceof Set) == false) goto L5;
        HashSet r3 = new HashSet((Set) r2.getValue());     // Catch: Throwable -> L11
        r3.remove(getFormattedDate(System.currentTimeMillis()));     // Catch: Throwable -> L11
        if (r3.isEmpty() == true) goto L5;
        r02.add(HeartBeatResult.create(r2.getKey(), new ArrayList(r3)));     // Catch: Throwable -> L11
        goto L5
    L13:
        updateGlobalHeartBeat(System.currentTimeMillis());     // Catch: Throwable -> L11
        monitor-exit(this);
        return r02;
    L11:
        th = move-exception;
        throw th;
    }

    public int getHeartBeatCount() {
        return (int) this.firebaseSharedPreferences.getLong(HEART_BEAT_COUNT_TAG, 0);
    }

    public synchronized long getLastGlobalHeartBeat() {
        monitor-enter(this);
        long r02 = this.firebaseSharedPreferences.getLong(GLOBAL, -1);     // Catch: Throwable -> L6
        monitor-exit(this);
        return r02;
    L6:
        th = move-exception;
        throw th;
    }

    public synchronized boolean isSameDateUtc(long r1, long r3) {
        monitor-enter(this);
        boolean r12 = getFormattedDate(r1).equals(getFormattedDate(r3));     // Catch: Throwable -> L6
        monitor-exit(this);
        return r12;
    L6:
        th = move-exception;
        throw th;
    }

    public synchronized void postHeartBeatCleanUp() {
        monitor-enter(this);
        String r02 = getFormattedDate(System.currentTimeMillis());     // Catch: Throwable -> L6
        this.firebaseSharedPreferences.edit().putString(LAST_STORED_DATE, r02).commit();     // Catch: Throwable -> L6
        removeStoredDate(r02);     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public synchronized boolean shouldSendGlobalHeartBeat(long r2) {
        monitor-enter(this);
        boolean r22 = shouldSendSdkHeartBeat(GLOBAL, r2);     // Catch: Throwable -> L6
        monitor-exit(this);
        return r22;
    L6:
        th = move-exception;
        throw th;
    }

    public synchronized boolean shouldSendSdkHeartBeat(String r5, long r6) {
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L4:
        if (this.firebaseSharedPreferences.contains(r5) == true) goto L6;
        this.firebaseSharedPreferences.edit().putLong(r5, r6).commit();     // Catch: Throwable -> L10
        monitor-exit(this);
        return true;
    L6:
        if (isSameDateUtc(this.firebaseSharedPreferences.getLong(r5, -1), r6) == true) goto L12;
        this.firebaseSharedPreferences.edit().putLong(r5, r6).commit();     // Catch: Throwable -> L10
        monitor-exit(this);
        return true;
    L12:
        monitor-exit(this);
        return false;
    }

    public synchronized void storeHeartBeat(long r12, String r14) {
        monitor-enter(this);
        String r122 = getFormattedDate(r12);     // Catch: Throwable -> L16
        if (this.firebaseSharedPreferences.getString(LAST_STORED_DATE, "").equals(r122) == false) goto L18;
        String r13 = getStoredUserAgentString(r122);     // Catch: Throwable -> L16
        if (r13 != null) goto L10;
        monitor-exit(this);
        return;
    L10:
        if (r13.equals(r14) == false) goto L13;
        monitor-exit(this);
        return;
    L13:
        updateStoredUserAgent(r14, r122);     // Catch: Throwable -> L16
        monitor-exit(this);
        return;
    L18:
        long r3 = this.firebaseSharedPreferences.getLong(HEART_BEAT_COUNT_TAG, 0);     // Catch: Throwable -> L16
        if ((r3 + 1) != 30) goto L21;
        cleanUpStoredHeartBeats();     // Catch: Throwable -> L16
        r3 = this.firebaseSharedPreferences.getLong(HEART_BEAT_COUNT_TAG, 0);     // Catch: Throwable -> L16
    L21:
        HashSet r132 = new HashSet(this.firebaseSharedPreferences.getStringSet(r14, new HashSet()));     // Catch: Throwable -> L16
        r132.add(r122);     // Catch: Throwable -> L16
        SharedPreferences.Editor r133 = this.firebaseSharedPreferences.edit().putStringSet(r14, r132);     // Catch: Throwable -> L16
        r133.putLong(HEART_BEAT_COUNT_TAG, r3 + 1).putString(LAST_STORED_DATE, r122).commit();     // Catch: Throwable -> L16
        monitor-exit(this);
        return;
    L16:
        th = move-exception;
        throw th;
    }

    public synchronized void updateGlobalHeartBeat(long r3) {
        monitor-enter(this);
        this.firebaseSharedPreferences.edit().putLong(GLOBAL, r3).commit();     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public HeartBeatInfoStorage(SharedPreferences r1) {
        this.firebaseSharedPreferences = r1;
    }
}
