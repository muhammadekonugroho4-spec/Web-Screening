package org.greenrobot.eventbus;

import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final Method f182519a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadMode f182520b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f182521c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f182522e;

    /* renamed from: f, reason: collision with root package name */
    public String f182523f;

    public n(Method r1, Class r2, ThreadMode r3, int r4, boolean r5) {
        this.f182519a = r1;
        this.f182520b = r3;
        this.f182521c = r2;
        this.d = r4;
        this.f182522e = r5;
    }

    public final synchronized void a() {
        monitor-enter(this);
    L7:
        th = move-exception;
        throw th;
    L4:
        if (this.f182523f != null) goto L9;
        StringBuilder r02 = new StringBuilder(64);     // Catch: Throwable -> L7
        r02.append(this.f182519a.getDeclaringClass().getName());     // Catch: Throwable -> L7
        r02.append('#');     // Catch: Throwable -> L7
        r02.append(this.f182519a.getName());     // Catch: Throwable -> L7
        r02.append('(');     // Catch: Throwable -> L7
        r02.append(this.f182521c.getName());     // Catch: Throwable -> L7
        this.f182523f = r02.toString();     // Catch: Throwable -> L7
    L9:
        monitor-exit(this);
    }

    public boolean equals(Object r2) {
        if (r2 != this) goto L6;
        return true;
    L6:
        if ((r2 instanceof n) == false) goto L9;
        a();
        n r22 = (n) r2;
        r22.a();
        return this.f182523f.equals(r22.f182523f);
    L9:
        return false;
    }

    public int hashCode() {
        return this.f182519a.hashCode();
    }
}
