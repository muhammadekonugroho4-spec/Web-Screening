package com.bumptech.glide.util;

import androidx.collection.C2337a;
import androidx.collection.g0;

/* loaded from: classes4.dex */
public final class b extends C2337a {

    /* renamed from: g, reason: collision with root package name */
    public int f33380g;

    public b() {
    }

    @Override // androidx.collection.g0, java.util.Map
    public void clear() {
        this.f33380g = 0;
        super.clear();
    }

    @Override // androidx.collection.g0
    public void h(g0 r2) {
        this.f33380g = 0;
        super.h(r2);
    }

    @Override // androidx.collection.g0, java.util.Map
    public int hashCode() {
        if (this.f33380g != 0) goto L6;
        this.f33380g = super.hashCode();
    L6:
        return this.f33380g;
    }

    @Override // androidx.collection.g0
    public Object i(int r2) {
        this.f33380g = 0;
        return super.i(r2);
    }

    @Override // androidx.collection.g0
    public Object j(int r2, Object r3) {
        this.f33380g = 0;
        return super.j(r2, r3);
    }

    @Override // androidx.collection.g0, java.util.Map
    public Object put(Object r2, Object r3) {
        this.f33380g = 0;
        return super.put(r2, r3);
    }
}
