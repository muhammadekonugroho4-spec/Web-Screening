package com.stockbit.lib.pocket.android.data.local;

import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.datastore.core.d f120263a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.datastore.core.d f120264b;

    public d(androidx.datastore.core.d r2, androidx.datastore.core.d r3) {
        p.l(r2, "application");
        p.l(r3, "session");
        this.f120263a = r2;
        this.f120264b = r3;
    }

    public final androidx.datastore.core.d a() {
        return this.f120263a;
    }

    public final androidx.datastore.core.d b() {
        return this.f120264b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f120263a, r52.f120263a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f120264b, r52.f120264b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f120263a.hashCode() * 31) + this.f120264b.hashCode();
    }

    public String toString() {
        return "PocketDataStore(application=" + this.f120263a + ", session=" + this.f120264b + ')';
    }
}
