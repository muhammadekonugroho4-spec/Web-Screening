package com.huawei.hmf.tasks.a;

import a.a.a.a.c.f;
import com.huawei.hmf.tasks.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class a extends b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f38869a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f38870b;

    /* renamed from: c, reason: collision with root package name */
    public Object f38871c;
    public Exception d;

    /* renamed from: e, reason: collision with root package name */
    public List f38872e;

    public a() {
        this.f38869a = new Object();
        this.f38872e = new ArrayList();
    }

    public final void a(Exception r3) {
        Object r02 = this.f38869a;
        monitor-enter(r02);
    L8:
        th = move-exception;
        throw th;
    L5:
        if (this.f38870b == false) goto L10;
    L6:
        monitor-exit(r02);     // Catch: Throwable -> L8
        return;
    L10:
        this.f38870b = true;     // Catch: Throwable -> L8
        this.d = r3;     // Catch: Throwable -> L8
        this.f38869a.notifyAll();     // Catch: Throwable -> L8
        c();     // Catch: Throwable -> L8
        goto L6
    }

    public final void b(Object r3) {
        Object r02 = this.f38869a;
        monitor-enter(r02);
    L8:
        th = move-exception;
        throw th;
    L5:
        if (this.f38870b == false) goto L10;
    L6:
        monitor-exit(r02);     // Catch: Throwable -> L8
        return;
    L10:
        this.f38870b = true;     // Catch: Throwable -> L8
        this.f38871c = r3;     // Catch: Throwable -> L8
        this.f38869a.notifyAll();     // Catch: Throwable -> L8
        c();     // Catch: Throwable -> L8
        goto L6
    }

    public final void c() {
        Object r02 = this.f38869a;
        monitor-enter(r02);
        Iterator r1 = this.f38872e.iterator();     // Catch: Throwable -> L9
        if (r1.hasNext() == true) goto L11;
        this.f38872e = null;     // Catch: Throwable -> L9
        monitor-exit(r02);     // Catch: Throwable -> L9
        return;
    L11:
        f.a(r1.next());     // Catch: Throwable -> L9
        throw null;     // Catch: Throwable -> L9 Exception -> L13 RuntimeException -> L16
    L16:
        e = move-exception;
        throw e;     // Catch: Throwable -> L9
    L13:
        e = move-exception;
        throw new RuntimeException(e);     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        throw th;
    }
}
