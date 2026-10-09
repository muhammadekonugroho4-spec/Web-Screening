package com.koushikdutta.async.util;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;

/* loaded from: classes6.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public Hashtable f41664a;

    public e() {
        this.f41664a = new Hashtable();
    }

    public synchronized void a(String r3, Object r4) {
        monitor-enter(this);
        ArrayList r02 = b(r3);     // Catch: Throwable -> L6
        if (r02 != null) goto L8;
        r02 = new TaggedList();     // Catch: Throwable -> L6
        this.f41664a.put(r3, r02);     // Catch: Throwable -> L6
    L8:
        r02.add(r4);     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public synchronized ArrayList b(String r2) {
        monitor-enter(this);
        ArrayList r22 = (ArrayList) this.f41664a.get(r2);     // Catch: Throwable -> L6
        monitor-exit(this);
        return r22;
    L6:
        th = move-exception;
        throw th;
    }

    public Set c() {
        return this.f41664a.keySet();
    }

    public synchronized ArrayList d(String r2) {
        monitor-enter(this);
        ArrayList r22 = (ArrayList) this.f41664a.remove(r2);     // Catch: Throwable -> L6
        monitor-exit(this);
        return r22;
    L6:
        th = move-exception;
        throw th;
    }

    public synchronized boolean e(String r2, Object r3) {
        monitor-enter(this);
        TaggedList r22 = (TaggedList) this.f41664a.get(r2);     // Catch: Throwable -> L13
        boolean r02 = false;
        if (r22 != null) goto L8;
        monitor-exit(this);
        return false;
    L8:
        r22.remove(r3);     // Catch: Throwable -> L13
        if (r22.size() != 0) goto L11;
        r02 = true;
    L11:
        monitor-exit(this);
        return r02;
    L13:
        th = move-exception;
        throw th;
    }

    public synchronized Object f(String r2) {
        monitor-enter(this);
        TaggedList r22 = (TaggedList) this.f41664a.get(r2);     // Catch: Throwable -> L11
        if (r22 != null) goto L8;
        monitor-exit(this);
        return null;
    L8:
        Object r23 = r22.a();     // Catch: Throwable -> L11
        monitor-exit(this);
        return r23;
    L11:
        th = move-exception;
        throw th;
    }

    public synchronized void g(String r3, Object r4) {
        monitor-enter(this);
        TaggedList r02 = (TaggedList) this.f41664a.get(r3);     // Catch: Throwable -> L6
        if (r02 != null) goto L8;
        r02 = new TaggedList();     // Catch: Throwable -> L6
        this.f41664a.put(r3, r02);     // Catch: Throwable -> L6
    L8:
        r02.b(r4);     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }
}
