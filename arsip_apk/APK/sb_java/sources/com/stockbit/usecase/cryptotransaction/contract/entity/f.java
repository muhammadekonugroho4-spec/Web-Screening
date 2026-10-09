package com.stockbit.usecase.cryptotransaction.contract.entity;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f157404a;

    /* renamed from: b, reason: collision with root package name */
    public final List f157405b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f157406c;

    public f(String r2, List r3, Map r4) {
        p.l(r2, "version");
        p.l(r3, "schedules");
        p.l(r4, "assetGroupByAsset");
        this.f157404a = r2;
        this.f157405b = r3;
        this.f157406c = r4;
    }

    public final Map a() {
        return this.f157406c;
    }

    public final List b() {
        return this.f157405b;
    }

    public final String c() {
        return this.f157404a;
    }

    public final boolean d() {
        if (this.f157404a.length() != 0) goto L6;
        return true;
    L6:
        if (this.f157405b.isEmpty() == false) goto L9;
        return true;
    L9:
        return false;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f157404a, r52.f157404a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157405b, r52.f157405b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f157406c, r52.f157406c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f157404a.hashCode() * 31) + this.f157405b.hashCode()) * 31) + this.f157406c.hashCode();
    }

    public String toString() {
        return "CryptoChargeFormulaEntity(version=" + this.f157404a + ", schedules=" + this.f157405b + ", assetGroupByAsset=" + this.f157406c + ")";
    }
}
