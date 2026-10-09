package com.bumptech.glide.provider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f33250a;

    /* renamed from: com.bumptech.glide.provider.a$a, reason: collision with other inner class name */
    public static final class C0337a {

        /* renamed from: a, reason: collision with root package name */
        public final Class f33251a;

        /* renamed from: b, reason: collision with root package name */
        public final com.bumptech.glide.load.a f33252b;

        public C0337a(Class r1, com.bumptech.glide.load.a r2) {
            this.f33251a = r1;
            this.f33252b = r2;
        }

        public boolean a(Class r2) {
            return this.f33251a.isAssignableFrom(r2);
        }
    }

    public a() {
        this.f33250a = new ArrayList();
    }

    public synchronized void a(Class r3, com.bumptech.glide.load.a r4) {
        monitor-enter(this);
        this.f33250a.add(new C0337a(r3, r4));     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public synchronized com.bumptech.glide.load.a b(Class r4) {
        monitor-enter(this);
        Iterator r02 = this.f33250a.iterator();     // Catch: Throwable -> L11
    L5:
        if (r02.hasNext() == false) goto L13;
        C0337a r1 = (C0337a) r02.next();     // Catch: Throwable -> L11
        if (r1.a(r4) == false) goto L5;
        com.bumptech.glide.load.a r42 = r1.f33252b;     // Catch: Throwable -> L11
        monitor-exit(this);
        return r42;
    L13:
        monitor-exit(this);
        return null;
    L11:
        th = move-exception;
        throw th;
    }
}
