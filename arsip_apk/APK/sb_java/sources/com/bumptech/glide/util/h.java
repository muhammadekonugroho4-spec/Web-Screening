package com.bumptech.glide.util;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final Map f33391a;

    /* renamed from: b, reason: collision with root package name */
    public final long f33392b;

    /* renamed from: c, reason: collision with root package name */
    public long f33393c;
    public long d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f33394a;

        /* renamed from: b, reason: collision with root package name */
        public final int f33395b;

        public a(Object r1, int r2) {
            this.f33394a = r1;
            this.f33395b = r2;
        }
    }

    public h(long r5) {
        this.f33391a = new LinkedHashMap(100, 0.75f, true);
        this.f33392b = r5;
        this.f33393c = r5;
    }

    public void b() {
        m(0);
    }

    public final void f() {
        m(this.f33393c);
    }

    public synchronized Object g(Object r2) {
        monitor-enter(this);
        a r22 = (a) this.f33391a.get(r2);     // Catch: Throwable -> L7
        if (r22 == null) goto L9;
        Object r23 = r22.f33394a;     // Catch: Throwable -> L7
    L10:
        monitor-exit(this);
        return r23;
    L9:
        r23 = null;
    L7:
        th = move-exception;
        throw th;
    }

    public synchronized long h() {
        monitor-enter(this);
        long r02 = this.f33393c;     // Catch: Throwable -> L6
        monitor-exit(this);
        return r02;
    L6:
        th = move-exception;
        throw th;
    }

    public int i(Object r1) {
        return 1;
    }

    public void j(Object r1, Object r2) {
    }

    public synchronized Object k(Object r8, Object r9) {
        monitor-enter(this);
        int r02 = i(r9);     // Catch: Throwable -> L8
        long r1 = r02;
        Object r4 = null;
        if (r1 < this.f33393c) goto L10;
        j(r8, r9);     // Catch: Throwable -> L8
        monitor-exit(this);
        return null;
    L10:
        if (r9 == null) goto L12;
        this.d += r1;
    L12:
        Map r12 = this.f33391a;     // Catch: Throwable -> L8
        if (r9 != null) goto L15;
        a r2 = null;
    L16:
        a r03 = (a) r12.put(r8, r2);     // Catch: Throwable -> L8
        if (r03 == null) goto L21;
        this.d -= r03.f33395b;
        if (r03.f33394a.equals(r9) == true) goto L21;
        j(r8, r03.f33394a);     // Catch: Throwable -> L8
    L21:
        f();     // Catch: Throwable -> L8
        if (r03 == null) goto L24;
        r4 = r03.f33394a;     // Catch: Throwable -> L8
    L24:
        monitor-exit(this);
        return r4;
    L15:
        r2 = new a(r9, r02);     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        throw th;
    }

    public synchronized Object l(Object r5) {
        monitor-enter(this);
        a r52 = (a) this.f33391a.remove(r5);     // Catch: Throwable -> L11
        if (r52 != null) goto L8;
        monitor-exit(this);
        return null;
    L8:
        this.d -= r52.f33395b;
        Object r53 = r52.f33394a;     // Catch: Throwable -> L11
        monitor-exit(this);
        return r53;
    L11:
        th = move-exception;
        throw th;
    }

    public synchronized void m(long r8) {
        monitor-enter(this);
    L13:
        if (this.d <= r8) goto L9;
        Iterator r02 = this.f33391a.entrySet().iterator();     // Catch: Throwable -> L7
        Map.Entry r1 = (Map.Entry) r02.next();     // Catch: Throwable -> L7
        a r2 = (a) r1.getValue();     // Catch: Throwable -> L7
        this.d -= r2.f33395b;
        Object r12 = r1.getKey();     // Catch: Throwable -> L7
        r02.remove();     // Catch: Throwable -> L7
        j(r12, r2.f33394a);     // Catch: Throwable -> L7
        goto L13
    L9:
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
