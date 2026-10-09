package com.bumptech.glide.manager;

import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public final Set f33227a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f33228b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f33229c;

    public t() {
        this.f33227a = Collections.newSetFromMap(new WeakHashMap());
        this.f33228b = new HashSet();
    }

    public boolean a(com.bumptech.glide.request.d r4) {
        boolean r02 = true;
        if (r4 != null) goto L5;
        return true;
    L5:
        boolean r1 = this.f33227a.remove(r4);
        if (this.f33228b.remove(r4) == true) goto L10;
        if (r1 == true) goto L10;
        r02 = false;
    L10:
        if (r02 == false) goto L12;
        r4.clear();
    L12:
        return r02;
    }

    public void b() {
        Iterator r02 = com.bumptech.glide.util.l.j(this.f33227a).iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        a((com.bumptech.glide.request.d) r02.next());
        goto L4
    L6:
        this.f33228b.clear();
    }

    public void c() {
        this.f33229c = true;
        Iterator r02 = com.bumptech.glide.util.l.j(this.f33227a).iterator();
    L4:
        if (r02.hasNext() == false) goto L10;
        com.bumptech.glide.request.d r1 = (com.bumptech.glide.request.d) r02.next();
        if (r1.isRunning() == true) goto L9;
        if (r1.a() == false) goto L4;
    L9:
        r1.clear();
        this.f33228b.add(r1);
        goto L4
    }

    public void d() {
        this.f33229c = true;
        Iterator r02 = com.bumptech.glide.util.l.j(this.f33227a).iterator();
    L4:
        if (r02.hasNext() == false) goto L8;
        com.bumptech.glide.request.d r1 = (com.bumptech.glide.request.d) r02.next();
        if (r1.isRunning() == false) goto L4;
        r1.pause();
        this.f33228b.add(r1);
        goto L4
    }

    public void e() {
        Iterator r02 = com.bumptech.glide.util.l.j(this.f33227a).iterator();
    L4:
        if (r02.hasNext() == false) goto L13;
        com.bumptech.glide.request.d r1 = (com.bumptech.glide.request.d) r02.next();
        if (r1.a() == true) goto L4;
        if (r1.f() == true) goto L4;
        r1.clear();
        if (this.f33229c == false) goto L11;
        this.f33228b.add(r1);
        goto L4
    L11:
        r1.i();
        goto L4
    }

    public void f() {
        this.f33229c = false;
        Iterator r02 = com.bumptech.glide.util.l.j(this.f33227a).iterator();
    L4:
        if (r02.hasNext() == false) goto L10;
        com.bumptech.glide.request.d r1 = (com.bumptech.glide.request.d) r02.next();
        if (r1.a() == true) goto L4;
        if (r1.isRunning() == true) goto L4;
        r1.i();
        goto L4
    L10:
        this.f33228b.clear();
    }

    public void g(com.bumptech.glide.request.d r3) {
        this.f33227a.add(r3);
        if (this.f33229c == true) goto L6;
        r3.i();
        return;
    L6:
        r3.clear();
        if (Log.isLoggable("RequestTracker", 2) == false) goto L9;
        Log.v("RequestTracker", "Paused, delaying request");
    L9:
        this.f33228b.add(r3);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f33227a.size() + ", isPaused=" + this.f33229c + "}";
    }
}
