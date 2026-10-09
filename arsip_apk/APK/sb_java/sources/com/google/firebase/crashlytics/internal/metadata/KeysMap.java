package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
class KeysMap {
    private final Map<String, String> keys;
    private final int maxEntries;
    private final int maxEntryLength;

    public KeysMap(int r2, int r3) {
        this.keys = new HashMap();
        this.maxEntries = r2;
        this.maxEntryLength = r3;
    }

    private String sanitizeKey(String r2) {
        if (r2 == null) goto L6;
        return sanitizeString(r2, this.maxEntryLength);
    L6:
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public static String sanitizeString(String r1, int r2) {
        if (r1 == null) goto L7;
        String r12 = r1.trim();
        if (r12.length() > r2) goto L6;
        return r12;
    L6:
        return r12.substring(0, r2);
    L7:
        return r1;
    }

    public synchronized Map<String, String> getKeys() {
        monitor-enter(this);
        Map<String, String> r02 = Collections.unmodifiableMap(new HashMap(this.keys));     // Catch: Throwable -> L6
        monitor-exit(this);
        return r02;
    L6:
        th = move-exception;
        throw th;
    }

    public synchronized boolean setKey(String r5, String r6) {
        monitor-enter(this);
        String r02 = sanitizeKey(r5);     // Catch: Throwable -> L11
        if (this.keys.size() >= this.maxEntries) goto L6;
    L13:
        String r52 = sanitizeString(r6, this.maxEntryLength);     // Catch: Throwable -> L11
        if (CommonUtils.nullSafeEquals(this.keys.get(r02), r52) == false) goto L17;
        monitor-exit(this);
        return false;
    L17:
        Map<String, String> r1 = this.keys;     // Catch: Throwable -> L11
        if (r6 != null) goto L20;
        r52 = "";
    L20:
        r1.put(r02, r52);     // Catch: Throwable -> L11
        monitor-exit(this);
        return true;
    L6:
        if (this.keys.containsKey(r02) == true) goto L13;
        Logger.getLogger().w("Ignored entry \"" + r5 + "\" when adding custom keys. Maximum allowable: " + this.maxEntries);     // Catch: Throwable -> L11
        monitor-exit(this);
        return false;
    L11:
        th = move-exception;
        throw th;
    }

    public synchronized void setKeys(Map<String, String> r6) {
        monitor-enter(this);
        Iterator<Map.Entry<String, String>> r62 = r6.entrySet().iterator();     // Catch: Throwable -> L12
        int r02 = 0;
    L5:
        if (r62.hasNext() == false) goto L19;
        Map.Entry<String, String> r1 = r62.next();     // Catch: Throwable -> L12
        String r2 = sanitizeKey(r1.getKey());     // Catch: Throwable -> L12
        if (this.keys.size() < this.maxEntries) goto L14;
        if (this.keys.containsKey(r2) == true) goto L14;
        r02 = r02 + 1;     // Catch: Throwable -> L12
    L14:
        String r12 = r1.getValue();     // Catch: Throwable -> L12
        Map<String, String> r3 = this.keys;     // Catch: Throwable -> L12
        if (r12 != null) goto L17;
        String r13 = "";
    L18:
        r3.put(r2, r13);     // Catch: Throwable -> L12
        goto L5
    L17:
        r13 = sanitizeString(r12, this.maxEntryLength);     // Catch: Throwable -> L12
        goto L18
    L19:
        if (r02 <= 0) goto L21;
        Logger.getLogger().w("Ignored " + r02 + " entries when adding custom keys. Maximum allowable: " + this.maxEntries);     // Catch: Throwable -> L12
    L21:
        monitor-exit(this);
        return;
    L12:
        th = move-exception;
        throw th;
    }
}
