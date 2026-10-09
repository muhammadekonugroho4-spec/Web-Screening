package com.stockbit.component.chart.view.networkgraph;

import com.google.firebase.messaging.Constants;

/* loaded from: classes7.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final String f69896a;

    /* renamed from: b, reason: collision with root package name */
    public final String f69897b;

    /* renamed from: c, reason: collision with root package name */
    public final InvestorType f69898c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f69899e;

    static {
    }

    public C(String r2, String r3, InvestorType r4, String r5, String r6) {
        kotlin.jvm.internal.p.l(r2, Constants.ScionAnalytics.PARAM_LABEL);
        kotlin.jvm.internal.p.l(r3, "percentage");
        this.f69896a = r2;
        this.f69897b = r3;
        this.f69898c = r4;
        this.d = r5;
        this.f69899e = r6;
    }

    public final InvestorType a() {
        return this.f69898c;
    }

    public final String b() {
        return this.f69896a;
    }

    public final String c() {
        return this.f69899e;
    }

    public final String d() {
        return this.f69897b;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C) == true) goto L8;
        return false;
    L8:
        C r52 = (C) r5;
        if (kotlin.jvm.internal.p.g(this.f69896a, r52.f69896a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f69897b, r52.f69897b) == true) goto L15;
        return false;
    L15:
        if (this.f69898c == r52.f69898c) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f69899e, r52.f69899e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        int r02 = ((this.f69896a.hashCode() * 31) + this.f69897b.hashCode()) * 31;
        InvestorType r1 = this.f69898c;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.d;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.f69899e;
        if (r15 == null) goto L15;
        r2 = r15.hashCode();
    L15:
        return r04 + r2;
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "TooltipItem(label=" + this.f69896a + ", percentage=" + this.f69897b + ", investorType=" + this.f69898c + ", ticker=" + this.d + ", logoUrl=" + this.f69899e + ')';
    }

    public /* synthetic */ C(String r2, String r3, InvestorType r4, String r5, String r6, int r7, kotlin.jvm.internal.i r8) {
        if ((r7 & 4) == 0) goto L6;
        r4 = null;
    L6:
        if ((r7 & 8) == 0) goto L9;
        r5 = null;
    L9:
        if ((r7 & 16) == 0) goto L12;
        String r72 = null;
    L13:
        this(r2, r3, r4, r5, r72);
        return;
    L12:
        r72 = r6;
        goto L13
    }
}
