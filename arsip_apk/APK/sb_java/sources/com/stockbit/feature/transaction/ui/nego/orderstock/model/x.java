package com.stockbit.feature.transaction.ui.nego.orderstock.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.stockbit.feature.transaction.util.compose.j;

/* loaded from: classes9.dex */
public final class x {

    /* renamed from: h, reason: collision with root package name */
    public static final a f115016h = null;

    /* renamed from: i, reason: collision with root package name */
    public static final x f115017i = null;

    /* renamed from: a, reason: collision with root package name */
    public final com.stockbit.feature.transaction.util.compose.j f115018a;

    /* renamed from: b, reason: collision with root package name */
    public final double f115019b;

    /* renamed from: c, reason: collision with root package name */
    public final String f115020c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f115021e;

    /* renamed from: f, reason: collision with root package name */
    public final String f115022f;

    /* renamed from: g, reason: collision with root package name */
    public final String f115023g;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final x a() {
            return x.a();
        }

        public a() {
        }
    }

    static {
        f115016h = new a(null);
        f115017i = new x(new j.a(Double.valueOf(0.0d)), 0.0d, "", "", false, "", "");
    }

    public x(com.stockbit.feature.transaction.util.compose.j r2, double r3, String r5, String r6, boolean r7, String r8, String r9) {
        kotlin.jvm.internal.p.l(r2, FirebaseAnalytics.Param.PRICE);
        kotlin.jvm.internal.p.l(r5, "counterPartyId");
        kotlin.jvm.internal.p.l(r6, "counterPartyOrderId");
        kotlin.jvm.internal.p.l(r8, "reason");
        kotlin.jvm.internal.p.l(r9, "purpose");
        this.f115018a = r2;
        this.f115019b = r3;
        this.f115020c = r5;
        this.d = r6;
        this.f115021e = r7;
        this.f115022f = r8;
        this.f115023g = r9;
    }

    public static final /* synthetic */ x a() {
        return f115017i;
    }

    public static /* synthetic */ x c(x r02, com.stockbit.feature.transaction.util.compose.j r1, double r2, String r4, String r5, boolean r6, String r7, String r8, int r9, Object r10) {
        if ((r9 & 1) == 0) goto L6;
        r1 = r02.f115018a;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r2 = r02.f115019b;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = r02.f115020c;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = r02.d;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r6 = r02.f115021e;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r7 = r02.f115022f;
    L21:
        if ((r9 & 64) == 0) goto L23;
        r8 = r02.f115023g;
    L23:
        String r92 = r7;
        String r102 = r8;
        boolean r82 = r6;
        String r62 = r4;
        double r42 = r2;
        com.stockbit.feature.transaction.util.compose.j r3 = r1;
        return r02.b(r3, r42, r62, r5, r82, r92, r102);
    }

    public final x b(com.stockbit.feature.transaction.util.compose.j r11, double r12, String r14, String r15, boolean r16, String r17, String r18) {
        kotlin.jvm.internal.p.l(r11, FirebaseAnalytics.Param.PRICE);
        kotlin.jvm.internal.p.l(r14, "counterPartyId");
        kotlin.jvm.internal.p.l(r15, "counterPartyOrderId");
        kotlin.jvm.internal.p.l(r17, "reason");
        kotlin.jvm.internal.p.l(r18, "purpose");
        return new x(r11, r12, r14, r15, r16, r17, r18);
    }

    public final String d() {
        return this.f115020c;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof x) == true) goto L8;
        return false;
    L8:
        x r82 = (x) r8;
        if (kotlin.jvm.internal.p.g(this.f115018a, r82.f115018a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f115019b, r82.f115019b) == 0) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f115020c, r82.f115020c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (this.f115021e == r82.f115021e) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f115022f, r82.f115022f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f115023g, r82.f115023g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final double f() {
        return this.f115019b;
    }

    public final com.stockbit.feature.transaction.util.compose.j g() {
        return this.f115018a;
    }

    public final String h() {
        return this.f115023g;
    }

    public int hashCode() {
        return (((((((((((this.f115018a.hashCode() * 31) + Double.hashCode(this.f115019b)) * 31) + this.f115020c.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f115021e)) * 31) + this.f115022f.hashCode()) * 31) + this.f115023g.hashCode();
    }

    public final String i() {
        return this.f115022f;
    }

    public final boolean j() {
        return this.f115021e;
    }

    public String toString() {
        return "SavedFormOrderUIState(price=" + this.f115018a + ", lot=" + this.f115019b + ", counterPartyId=" + this.f115020c + ", counterPartyOrderId=" + this.d + ", isPrivateOrder=" + this.f115021e + ", reason=" + this.f115022f + ", purpose=" + this.f115023g + ')';
    }
}
