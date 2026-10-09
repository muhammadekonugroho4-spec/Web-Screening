package com.stockbit.data.repository.cryptoheader.live;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.stockbit.usecase.cryptoheader.contract.entity.b f79920a;

    /* renamed from: b, reason: collision with root package name */
    public final com.stockbit.usecase.cryptoheader.contract.entity.b f79921b;

    /* renamed from: c, reason: collision with root package name */
    public final com.stockbit.usecase.cryptoheader.contract.entity.b f79922c;
    public final com.stockbit.usecase.cryptoheader.contract.entity.b d;

    public a(com.stockbit.usecase.cryptoheader.contract.entity.b r1, com.stockbit.usecase.cryptoheader.contract.entity.b r2, com.stockbit.usecase.cryptoheader.contract.entity.b r3, com.stockbit.usecase.cryptoheader.contract.entity.b r4) {
        this.f79920a = r1;
        this.f79921b = r2;
        this.f79922c = r3;
        this.d = r4;
    }

    public final com.stockbit.usecase.cryptoheader.contract.entity.b a() {
        return this.f79921b;
    }

    public final com.stockbit.usecase.cryptoheader.contract.entity.b b() {
        return this.f79922c;
    }

    public final com.stockbit.usecase.cryptoheader.contract.entity.b c() {
        return this.f79920a;
    }

    public final com.stockbit.usecase.cryptoheader.contract.entity.b d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f79920a, r52.f79920a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f79921b, r52.f79921b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f79922c, r52.f79922c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        com.stockbit.usecase.cryptoheader.contract.entity.b r02 = this.f79920a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        com.stockbit.usecase.cryptoheader.contract.entity.b r2 = this.f79921b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        com.stockbit.usecase.cryptoheader.contract.entity.b r23 = this.f79922c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        com.stockbit.usecase.cryptoheader.contract.entity.b r25 = this.d;
        if (r25 == null) goto L19;
        r1 = r25.hashCode();
    L19:
        return r06 + r1;
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "CryptoPriceLivePatch(idrPrice=" + this.f79920a + ", idrChange=" + this.f79921b + ", idrChangePct=" + this.f79922c + ", usdPrice=" + this.d + ")";
    }

    public /* synthetic */ a(com.stockbit.usecase.cryptoheader.contract.entity.b r2, com.stockbit.usecase.cryptoheader.contract.entity.b r3, com.stockbit.usecase.cryptoheader.contract.entity.b r4, com.stockbit.usecase.cryptoheader.contract.entity.b r5, int r6, i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = null;
    L14:
        this(r2, r3, r4, r5);
    }
}
