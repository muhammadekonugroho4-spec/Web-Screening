package com.bumptech.glide.manager;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public final class w implements n {

    /* renamed from: a, reason: collision with root package name */
    public final Set f33248a;

    public w() {
        this.f33248a = Collections.newSetFromMap(new WeakHashMap());
    }

    public void c() {
        this.f33248a.clear();
    }

    public List f() {
        return com.bumptech.glide.util.l.j(this.f33248a);
    }

    public void k(com.bumptech.glide.request.target.h r2) {
        this.f33248a.add(r2);
    }

    public void l(com.bumptech.glide.request.target.h r2) {
        this.f33248a.remove(r2);
    }

    @Override // com.bumptech.glide.manager.n
    public void onDestroy() {
        Iterator r02 = com.bumptech.glide.util.l.j(this.f33248a).iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        ((com.bumptech.glide.request.target.h) r02.next()).onDestroy();
        goto L4
    }

    @Override // com.bumptech.glide.manager.n
    public void onStart() {
        Iterator r02 = com.bumptech.glide.util.l.j(this.f33248a).iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        ((com.bumptech.glide.request.target.h) r02.next()).onStart();
        goto L4
    }

    @Override // com.bumptech.glide.manager.n
    public void onStop() {
        Iterator r02 = com.bumptech.glide.util.l.j(this.f33248a).iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        ((com.bumptech.glide.request.target.h) r02.next()).onStop();
        goto L4
    }
}
