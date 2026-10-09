package com.stockbit.usecase.cryptotransaction.contract.entity;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f157418a;

    /* renamed from: b, reason: collision with root package name */
    public final String f157419b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f157420c;
    public final CryptoOrderStatus d;

    /* renamed from: e, reason: collision with root package name */
    public final long f157421e;

    /* renamed from: f, reason: collision with root package name */
    public final String f157422f;

    /* renamed from: g, reason: collision with root package name */
    public final String f157423g;

    public i(String r2, String r3, boolean r4, CryptoOrderStatus r5, long r6, String r8, String r9) {
        p.l(r2, "orderId");
        p.l(r3, "operationName");
        p.l(r5, NotificationCompat.CATEGORY_STATUS);
        p.l(r8, "filledQuantity");
        p.l(r9, "filledPrice");
        this.f157418a = r2;
        this.f157419b = r3;
        this.f157420c = r4;
        this.d = r5;
        this.f157421e = r6;
        this.f157422f = r8;
        this.f157423g = r9;
    }

    public final String a() {
        return this.f157423g;
    }

    public final String b() {
        return this.f157422f;
    }

    public final String c() {
        return this.f157419b;
    }

    public final CryptoOrderStatus d() {
        return this.d;
    }

    public final boolean e() {
        return this.f157420c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof i) == true) goto L8;
        return false;
    L8:
        i r82 = (i) r8;
        if (p.g(this.f157418a, r82.f157418a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157419b, r82.f157419b) == true) goto L15;
        return false;
    L15:
        if (this.f157420c == r82.f157420c) goto L18;
        return false;
    L18:
        if (this.d == r82.d) goto L21;
        return false;
    L21:
        if (this.f157421e == r82.f157421e) goto L24;
        return false;
    L24:
        if (p.g(this.f157422f, r82.f157422f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f157423g, r82.f157423g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public int hashCode() {
        return (((((((((((this.f157418a.hashCode() * 31) + this.f157419b.hashCode()) * 31) + Boolean.hashCode(this.f157420c)) * 31) + this.d.hashCode()) * 31) + Long.hashCode(this.f157421e)) * 31) + this.f157422f.hashCode()) * 31) + this.f157423g.hashCode();
    }

    public String toString() {
        return "CryptoOrderResultEntity(orderId=" + this.f157418a + ", operationName=" + this.f157419b + ", isDone=" + this.f157420c + ", status=" + this.d + ", submittedAt=" + this.f157421e + ", filledQuantity=" + this.f157422f + ", filledPrice=" + this.f157423g + ")";
    }
}
