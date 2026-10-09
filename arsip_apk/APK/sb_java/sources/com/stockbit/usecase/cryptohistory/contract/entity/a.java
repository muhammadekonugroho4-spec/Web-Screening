package com.stockbit.usecase.cryptohistory.contract.entity;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f157136a;

    /* renamed from: b, reason: collision with root package name */
    public final CryptoHistoryTransactionStatus f157137b;

    /* renamed from: c, reason: collision with root package name */
    public final long f157138c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final double f157139e;

    public a(String r2, CryptoHistoryTransactionStatus r3, long r4, String r6, double r7) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, NotificationCompat.CATEGORY_STATUS);
        p.l(r6, FirebaseAnalytics.Param.DESTINATION);
        this.f157136a = r2;
        this.f157137b = r3;
        this.f157138c = r4;
        this.d = r6;
        this.f157139e = r7;
    }

    public final long a() {
        return this.f157138c;
    }

    public final String b() {
        return this.d;
    }

    public final double c() {
        return this.f157139e;
    }

    public final CryptoHistoryTransactionStatus d() {
        return this.f157137b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (p.g(this.f157136a, r82.f157136a) == true) goto L12;
        return false;
    L12:
        if (this.f157137b == r82.f157137b) goto L15;
        return false;
    L15:
        if (this.f157138c == r82.f157138c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (Double.compare(this.f157139e, r82.f157139e) == 0) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f157136a.hashCode() * 31) + this.f157137b.hashCode()) * 31) + Long.hashCode(this.f157138c)) * 31) + this.d.hashCode()) * 31) + Double.hashCode(this.f157139e);
    }

    public String toString() {
        return "CryptoHistoryCashInDetailEntity(id=" + this.f157136a + ", status=" + this.f157137b + ", createdAt=" + this.f157138c + ", destination=" + this.d + ", netAmount=" + this.f157139e + ")";
    }
}
