package com.koushikdutta.async.util;

import java.util.ArrayList;

/* loaded from: classes6.dex */
public class TaggedList<T> extends ArrayList<T> {
    private Object tag;

    public TaggedList() {
    }

    public synchronized Object a() {
        monitor-enter(this);
        Object r02 = this.tag;     // Catch: Throwable -> L6
        monitor-exit(this);
        return r02;
    L6:
        th = move-exception;
        throw th;
    }

    public synchronized void b(Object r1) {
        monitor-enter(this);
        this.tag = r1;     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public synchronized void e(Object r2) {
        monitor-enter(this);
    L7:
        th = move-exception;
        throw th;
    L4:
        if (this.tag != null) goto L9;
        this.tag = r2;     // Catch: Throwable -> L7
    L9:
        monitor-exit(this);
    }
}
