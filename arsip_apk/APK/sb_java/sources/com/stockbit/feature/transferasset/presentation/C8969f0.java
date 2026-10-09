package com.stockbit.feature.transferasset.presentation;

import java.util.List;

/* renamed from: com.stockbit.feature.transferasset.presentation.f0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C8969f0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f117224a;

    /* renamed from: b, reason: collision with root package name */
    public final String f117225b;

    static {
    }

    public C8969f0(List r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "companies");
        kotlin.jvm.internal.p.l(r3, "estSettleDate");
        this.f117224a = r2;
        this.f117225b = r3;
    }

    public final List a() {
        return this.f117224a;
    }

    public final String b() {
        return this.f117225b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C8969f0) == true) goto L8;
        return false;
    L8:
        C8969f0 r52 = (C8969f0) r5;
        if (kotlin.jvm.internal.p.g(this.f117224a, r52.f117224a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f117225b, r52.f117225b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f117224a.hashCode() * 31) + this.f117225b.hashCode();
    }

    public String toString() {
        return "TransferRightWarrantInformationUIData(companies=" + this.f117224a + ", estSettleDate=" + this.f117225b + ')';
    }
}
