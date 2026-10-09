package com.bumptech.glide.manager;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public class a implements l {

    /* renamed from: a, reason: collision with root package name */
    public final Set f33198a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f33199b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f33200c;

    public a() {
        this.f33198a = Collections.newSetFromMap(new WeakHashMap());
    }

    @Override // com.bumptech.glide.manager.l
    public void a(n r2) {
        this.f33198a.remove(r2);
    }

    @Override // com.bumptech.glide.manager.l
    public void b(n r2) {
        this.f33198a.add(r2);
        if (this.f33200c == false) goto L7;
        r2.onDestroy();
        return;
    L7:
        if (this.f33199b == false) goto L10;
        r2.onStart();
        return;
    L10:
        r2.onStop();
    }

    public void c() {
        this.f33200c = true;
        Iterator r02 = com.bumptech.glide.util.l.j(this.f33198a).iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        ((n) r02.next()).onDestroy();
        goto L4
    }

    public void d() {
        this.f33199b = true;
        Iterator r02 = com.bumptech.glide.util.l.j(this.f33198a).iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        ((n) r02.next()).onStart();
        goto L4
    }

    public void e() {
        this.f33199b = false;
        Iterator r02 = com.bumptech.glide.util.l.j(this.f33198a).iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        ((n) r02.next()).onStop();
        goto L4
    }
}
