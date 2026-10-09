package com.stockbit.dto.cryptotransaction;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f88640a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f88641b;

    /* renamed from: c, reason: collision with root package name */
    public final CryptoCreateOrderDTO f88642c;

    public a(String r1, Boolean r2, CryptoCreateOrderDTO r3) {
        this.f88640a = r1;
        this.f88641b = r2;
        this.f88642c = r3;
    }

    public final Boolean a() {
        return this.f88641b;
    }

    public final String b() {
        return this.f88640a;
    }

    public final CryptoCreateOrderDTO c() {
        return this.f88642c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f88640a, r52.f88640a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f88641b, r52.f88641b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f88642c, r52.f88642c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.f88640a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Boolean r2 = this.f88641b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        CryptoCreateOrderDTO r23 = this.f88642c;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return r05 + r1;
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "CryptoOrderOperationDTO(name=" + this.f88640a + ", done=" + this.f88641b + ", order=" + this.f88642c + ")";
    }
}
