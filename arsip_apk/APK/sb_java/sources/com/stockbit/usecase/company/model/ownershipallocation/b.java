package com.stockbit.usecase.company.model.ownershipallocation;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f156398a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156399b;

    /* renamed from: c, reason: collision with root package name */
    public final String f156400c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final List f156401e;

    /* renamed from: f, reason: collision with root package name */
    public final List f156402f;

    public b(String r2, String r3, String r4, double r5, List r7, List r8) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, "ticker");
        p.l(r4, "logoUrl");
        p.l(r7, "relatedInvestors");
        p.l(r8, "allRelatedInvestors");
        this.f156398a = r2;
        this.f156399b = r3;
        this.f156400c = r4;
        this.d = r5;
        this.f156401e = r7;
        this.f156402f = r8;
    }

    public final List a() {
        return this.f156402f;
    }

    public final String b() {
        return this.f156398a;
    }

    public final String c() {
        return this.f156400c;
    }

    public final double d() {
        return this.d;
    }

    public final List e() {
        return this.f156401e;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (p.g(this.f156398a, r82.f156398a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f156399b, r82.f156399b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f156400c, r82.f156400c) == true) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (p.g(this.f156401e, r82.f156401e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f156402f, r82.f156402f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.f156399b;
    }

    public int hashCode() {
        return (((((((((this.f156398a.hashCode() * 31) + this.f156399b.hashCode()) * 31) + this.f156400c.hashCode()) * 31) + Double.hashCode(this.d)) * 31) + this.f156401e.hashCode()) * 31) + this.f156402f.hashCode();
    }

    public String toString() {
        return "EmittenNodeUIState(id=" + this.f156398a + ", ticker=" + this.f156399b + ", logoUrl=" + this.f156400c + ", ownershipPercentage=" + this.d + ", relatedInvestors=" + this.f156401e + ", allRelatedInvestors=" + this.f156402f + ")";
    }
}
