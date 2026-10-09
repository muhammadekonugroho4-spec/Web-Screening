package com.bumptech.glide.provider;

import com.bumptech.glide.load.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final List f33259a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f33260b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Class f33261a;

        /* renamed from: b, reason: collision with root package name */
        public final Class f33262b;

        /* renamed from: c, reason: collision with root package name */
        public final g f33263c;

        public a(Class r1, Class r2, g r3) {
            this.f33261a = r1;
            this.f33262b = r2;
            this.f33263c = r3;
        }

        public boolean a(Class r2, Class r3) {
            if (this.f33261a.isAssignableFrom(r2) == true) goto L5;
            return false;
        L5:
            if (r3.isAssignableFrom(this.f33262b) == false) goto L10;
            return true;
        L10:
            return false;
        }
    }

    public e() {
        this.f33259a = new ArrayList();
        this.f33260b = new HashMap();
    }

    public synchronized void a(String r2, g r3, Class r4, Class r5) {
        monitor-enter(this);
        c(r2).add(new a(r4, r5, r3));     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public synchronized List b(Class r6, Class r7) {
        monitor-enter(this);
        ArrayList r02 = new ArrayList();     // Catch: Throwable -> L16
        Iterator r1 = this.f33259a.iterator();     // Catch: Throwable -> L16
    L4:
        if (r1.hasNext() == false) goto L18;
        String r2 = (String) r1.next();     // Catch: Throwable -> L16
        List r22 = (List) this.f33260b.get(r2);     // Catch: Throwable -> L16
        if (r22 == null) goto L4;
        Iterator r23 = r22.iterator();     // Catch: Throwable -> L16
    L11:
        if (r23.hasNext() == false) goto L4;
        a r3 = (a) r23.next();     // Catch: Throwable -> L16
        if (r3.a(r6, r7) == false) goto L11;
        r02.add(r3.f33263c);     // Catch: Throwable -> L16
        goto L11
    L18:
        monitor-exit(this);
        return r02;
    L16:
        th = move-exception;
        throw th;
    }

    public final synchronized List c(String r3) {
        monitor-enter(this);
    L6:
        th = move-exception;
        throw th;
    L4:
        if (this.f33259a.contains(r3) == true) goto L8;
        this.f33259a.add(r3);     // Catch: Throwable -> L6
    L8:
        List r02 = (List) this.f33260b.get(r3);     // Catch: Throwable -> L6
        if (r02 != null) goto L11;
        r02 = new ArrayList();     // Catch: Throwable -> L6
        this.f33260b.put(r3, r02);     // Catch: Throwable -> L6
    L11:
        monitor-exit(this);
        return r02;
    }

    public synchronized List d(Class r6, Class r7) {
        monitor-enter(this);
        ArrayList r02 = new ArrayList();     // Catch: Throwable -> L18
        Iterator r1 = this.f33259a.iterator();     // Catch: Throwable -> L18
    L4:
        if (r1.hasNext() == false) goto L20;
        String r2 = (String) r1.next();     // Catch: Throwable -> L18
        List r22 = (List) this.f33260b.get(r2);     // Catch: Throwable -> L18
        if (r22 == null) goto L4;
        Iterator r23 = r22.iterator();     // Catch: Throwable -> L18
    L11:
        if (r23.hasNext() == false) goto L4;
        a r3 = (a) r23.next();     // Catch: Throwable -> L18
        if (r3.a(r6, r7) == false) goto L11;
        if (r02.contains(r3.f33262b) == true) goto L11;
        r02.add(r3.f33262b);     // Catch: Throwable -> L18
        goto L11
    L20:
        monitor-exit(this);
        return r02;
    L18:
        th = move-exception;
        throw th;
    }

    public synchronized void e(List r5) {
        monitor-enter(this);
        ArrayList r02 = new ArrayList(this.f33259a);     // Catch: Throwable -> L7
        this.f33259a.clear();     // Catch: Throwable -> L7
        Iterator r1 = r5.iterator();     // Catch: Throwable -> L7
    L5:
        if (r1.hasNext() == false) goto L9;
        String r2 = (String) r1.next();     // Catch: Throwable -> L7
        this.f33259a.add(r2);     // Catch: Throwable -> L7
        goto L5
    L9:
        Iterator r03 = r02.iterator();     // Catch: Throwable -> L7
    L10:
        if (r03.hasNext() == false) goto L16;
        String r12 = (String) r03.next();     // Catch: Throwable -> L7
        if (r5.contains(r12) == true) goto L10;
        this.f33259a.add(r12);     // Catch: Throwable -> L7
        goto L10
    L16:
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
