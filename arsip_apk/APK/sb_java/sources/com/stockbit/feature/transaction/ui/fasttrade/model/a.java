package com.stockbit.feature.transaction.ui.fasttrade.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f114044a;

    /* renamed from: b, reason: collision with root package name */
    public final String f114045b;

    /* renamed from: c, reason: collision with root package name */
    public final String f114046c;

    static {
    }

    public a(String r2, String r3, String r4) {
        p.l(r2, "lot");
        p.l(r3, FirebaseAnalytics.Param.PRICE);
        p.l(r4, "totalAmount");
        this.f114044a = r2;
        this.f114045b = r3;
        this.f114046c = r4;
    }

    public static /* synthetic */ a b(a r02, String r1, String r2, String r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r02.f114044a;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r02.f114045b;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r02.f114046c;
    L12:
        return r02.a(r1, r2, r3);
    }

    public final a a(String r2, String r3, String r4) {
        p.l(r2, "lot");
        p.l(r3, FirebaseAnalytics.Param.PRICE);
        p.l(r4, "totalAmount");
        return new a(r2, r3, r4);
    }

    public final String c() {
        return this.f114044a;
    }

    public final String d() {
        return this.f114045b;
    }

    public final String e() {
        return this.f114046c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f114044a, r52.f114044a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f114045b, r52.f114045b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f114046c, r52.f114046c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f114044a.hashCode() * 31) + this.f114045b.hashCode()) * 31) + this.f114046c.hashCode();
    }

    public String toString() {
        return "CalculatorScreenState(lot=" + this.f114044a + ", price=" + this.f114045b + ", totalAmount=" + this.f114046c + ')';
    }

    public /* synthetic */ a(String r2, String r3, String r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = "0";
    L11:
        this(r2, r3, r4);
    }
}
