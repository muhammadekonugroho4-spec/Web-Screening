package com.stockbit.usecase.fda.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f157799a;

    /* renamed from: b, reason: collision with root package name */
    public final String f157800b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f157801c;

    public a(String r2, String r3, boolean r4) {
        p.l(r2, "long");
        p.l(r3, "short");
        this.f157799a = r2;
        this.f157800b = r3;
        this.f157801c = r4;
    }

    public final String a() {
        return this.f157799a;
    }

    public final String b() {
        return this.f157800b;
    }

    public final boolean c() {
        return this.f157801c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f157799a, r52.f157799a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157800b, r52.f157800b) == true) goto L15;
        return false;
    L15:
        if (this.f157801c == r52.f157801c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f157799a.hashCode() * 31) + this.f157800b.hashCode()) * 31) + Boolean.hashCode(this.f157801c);
    }

    public String toString() {
        return "FDADateUIState(long=" + this.f157799a + ", short=" + this.f157800b + ", isHasRange=" + this.f157801c + ")";
    }

    public /* synthetic */ a(String r2, String r3, boolean r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = false;
    L11:
        this(r2, r3, r4);
    }
}
