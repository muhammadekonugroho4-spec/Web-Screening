package com.stockbit.usecase.company.model.ownershipallocation;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f156427a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156428b;

    /* renamed from: c, reason: collision with root package name */
    public final String f156429c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final List f156430e;

    public j(String r2, String r3, String r4, double r5, List r7) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, "ticker");
        p.l(r4, "logoUrl");
        p.l(r7, "allRelatedInvestors");
        this.f156427a = r2;
        this.f156428b = r3;
        this.f156429c = r4;
        this.d = r5;
        this.f156430e = r7;
    }

    public final List a() {
        return this.f156430e;
    }

    public final String b() {
        return this.f156427a;
    }

    public final String c() {
        return this.f156429c;
    }

    public final double d() {
        return this.d;
    }

    public final String e() {
        return this.f156428b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof j) == true) goto L8;
        return false;
    L8:
        j r82 = (j) r8;
        if (p.g(this.f156427a, r82.f156427a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f156428b, r82.f156428b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f156429c, r82.f156429c) == true) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (p.g(this.f156430e, r82.f156430e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f156427a.hashCode() * 31) + this.f156428b.hashCode()) * 31) + this.f156429c.hashCode()) * 31) + Double.hashCode(this.d)) * 31) + this.f156430e.hashCode();
    }

    public String toString() {
        return "OtherEmittenNodeUIState(id=" + this.f156427a + ", ticker=" + this.f156428b + ", logoUrl=" + this.f156429c + ", ownershipPercentage=" + this.d + ", allRelatedInvestors=" + this.f156430e + ")";
    }
}
