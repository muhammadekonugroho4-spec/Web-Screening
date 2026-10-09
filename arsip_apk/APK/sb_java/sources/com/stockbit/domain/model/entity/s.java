package com.stockbit.domain.model.entity;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes8.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final String f82849a;

    /* renamed from: b, reason: collision with root package name */
    public final int f82850b;

    /* renamed from: c, reason: collision with root package name */
    public final int f82851c;
    public final String d;

    public s(String r2, int r3, int r4, String r5) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_ID);
        this.f82849a = r2;
        this.f82850b = r3;
        this.f82851c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f82849a;
    }

    public final String b() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof s) == true) goto L8;
        return false;
    L8:
        s r52 = (s) r5;
        if (kotlin.jvm.internal.p.g(this.f82849a, r52.f82849a) == true) goto L12;
        return false;
    L12:
        if (this.f82850b == r52.f82850b) goto L15;
        return false;
    L15:
        if (this.f82851c == r52.f82851c) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int r02 = ((((this.f82849a.hashCode() * 31) + Integer.hashCode(this.f82850b)) * 31) + Integer.hashCode(this.f82851c)) * 31;
        String r1 = this.d;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "SaveStockTransfer(id=" + this.f82849a + ", totalSymbol=" + this.f82850b + ", feeSecurity=" + this.f82851c + ", verificationFeatureMethod=" + this.d + ')';
    }

    public /* synthetic */ s(String r2, int r3, int r4, String r5, int r6, kotlin.jvm.internal.i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = null;
    L14:
        this(r2, r3, r4, r5);
    }
}
