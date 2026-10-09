package com.bumptech.glide.load.resource.transcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final List f33193a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Class f33194a;

        /* renamed from: b, reason: collision with root package name */
        public final Class f33195b;

        /* renamed from: c, reason: collision with root package name */
        public final e f33196c;

        public a(Class r1, Class r2, e r3) {
            this.f33194a = r1;
            this.f33195b = r2;
            this.f33196c = r3;
        }

        public boolean a(Class r2, Class r3) {
            if (this.f33194a.isAssignableFrom(r2) == true) goto L5;
            return false;
        L5:
            if (r3.isAssignableFrom(this.f33195b) == false) goto L10;
            return true;
        L10:
            return false;
        }
    }

    public f() {
        this.f33193a = new ArrayList();
    }

    public synchronized e a(Class r4, Class r5) {
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L4:
        if (r5.isAssignableFrom(r4) == false) goto L10;
        e r42 = g.b();     // Catch: Throwable -> L8
        monitor-exit(this);
        return r42;
    L10:
        Iterator r02 = this.f33193a.iterator();     // Catch: Throwable -> L8
    L12:
        if (r02.hasNext() == false) goto L19;
        a r1 = (a) r02.next();     // Catch: Throwable -> L8
        if (r1.a(r4, r5) == false) goto L12;
        e r43 = r1.f33196c;     // Catch: Throwable -> L8
        monitor-exit(this);
        return r43;
    L19:
        throw new IllegalArgumentException("No transcoder registered to transcode from " + r4 + " to " + r5);     // Catch: Throwable -> L8
    }

    public synchronized List b(Class r5, Class r6) {
        monitor-enter(this);
        ArrayList r02 = new ArrayList();     // Catch: Throwable -> L8
        if (r6.isAssignableFrom(r5) == false) goto L10;
        r02.add(r6);     // Catch: Throwable -> L8
        monitor-exit(this);
        return r02;
    L10:
        Iterator r1 = this.f33193a.iterator();     // Catch: Throwable -> L8
    L12:
        if (r1.hasNext() == false) goto L19;
        a r2 = (a) r1.next();     // Catch: Throwable -> L8
        if (r2.a(r5, r6) == false) goto L12;
        if (r02.contains(r2.f33195b) == true) goto L12;
        r02.add(r2.f33195b);     // Catch: Throwable -> L8
        goto L12
    L19:
        monitor-exit(this);
        return r02;
    L8:
        th = move-exception;
        throw th;
    }

    public synchronized void c(Class r3, Class r4, e r5) {
        monitor-enter(this);
        this.f33193a.add(new a(r3, r4, r5));     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }
}
