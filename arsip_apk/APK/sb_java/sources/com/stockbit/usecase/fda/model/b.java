package com.stockbit.usecase.fda.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f157802a;

    /* renamed from: b, reason: collision with root package name */
    public final float f157803b;

    public b(String r2, float r3) {
        p.l(r2, "formatted");
        this.f157802a = r2;
        this.f157803b = r3;
    }

    public static /* synthetic */ b b(b r02, String r1, float r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r02.f157802a;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r02.f157803b;
    L9:
        return r02.a(r1, r2);
    }

    public final b a(String r2, float r3) {
        p.l(r2, "formatted");
        return new b(r2, r3);
    }

    public final String c() {
        return this.f157802a;
    }

    public final float d() {
        return this.f157803b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f157802a, r52.f157802a) == true) goto L12;
        return false;
    L12:
        if (Float.compare(this.f157803b, r52.f157803b) == 0) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f157802a.hashCode() * 31) + Float.hashCode(this.f157803b);
    }

    public String toString() {
        return "FDAFormattedRawUIState(formatted=" + this.f157802a + ", raw=" + this.f157803b + ")";
    }

    public /* synthetic */ b(String r1, float r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = "-";
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = 0.0f;
    L8:
        this(r1, r2);
    }
}
