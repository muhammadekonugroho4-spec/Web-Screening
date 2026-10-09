package com.stockbit.usecase.cryptohistory.contract.entity;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f157140a;

    /* renamed from: b, reason: collision with root package name */
    public final CryptoHistoryTransactionStatus f157141b;

    /* renamed from: c, reason: collision with root package name */
    public final long f157142c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f157143e;

    /* renamed from: f, reason: collision with root package name */
    public final double f157144f;

    /* renamed from: g, reason: collision with root package name */
    public final double f157145g;

    /* renamed from: h, reason: collision with root package name */
    public final double f157146h;

    public b(String r2, CryptoHistoryTransactionStatus r3, long r4, String r6, String r7, double r8, double r10, double r12) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, NotificationCompat.CATEGORY_STATUS);
        p.l(r6, "source");
        p.l(r7, FirebaseAnalytics.Param.DESTINATION);
        this.f157140a = r2;
        this.f157141b = r3;
        this.f157142c = r4;
        this.d = r6;
        this.f157143e = r7;
        this.f157144f = r8;
        this.f157145g = r10;
        this.f157146h = r12;
    }

    public final long a() {
        return this.f157142c;
    }

    public final String b() {
        return this.f157143e;
    }

    public final double c() {
        return this.f157144f;
    }

    public final double d() {
        return this.f157146h;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (p.g(this.f157140a, r82.f157140a) == true) goto L12;
        return false;
    L12:
        if (this.f157141b == r82.f157141b) goto L15;
        return false;
    L15:
        if (this.f157142c == r82.f157142c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f157143e, r82.f157143e) == true) goto L24;
        return false;
    L24:
        if (Double.compare(this.f157144f, r82.f157144f) == 0) goto L27;
        return false;
    L27:
        if (Double.compare(this.f157145g, r82.f157145g) == 0) goto L30;
        return false;
    L30:
        if (Double.compare(this.f157146h, r82.f157146h) == 0) goto L32;
        return false;
    L32:
        return true;
    }

    public final CryptoHistoryTransactionStatus f() {
        return this.f157141b;
    }

    public final double g() {
        return this.f157145g;
    }

    public int hashCode() {
        return (((((((((((((this.f157140a.hashCode() * 31) + this.f157141b.hashCode()) * 31) + Long.hashCode(this.f157142c)) * 31) + this.d.hashCode()) * 31) + this.f157143e.hashCode()) * 31) + Double.hashCode(this.f157144f)) * 31) + Double.hashCode(this.f157145g)) * 31) + Double.hashCode(this.f157146h);
    }

    public String toString() {
        return "CryptoHistoryCashOutDetailEntity(id=" + this.f157140a + ", status=" + this.f157141b + ", createdAt=" + this.f157142c + ", source=" + this.d + ", destination=" + this.f157143e + ", grossAmount=" + this.f157144f + ", totalFee=" + this.f157145g + ", netAmount=" + this.f157146h + ")";
    }
}
