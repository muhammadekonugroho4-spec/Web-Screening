package com.stockbit.usecase.securities.model.history;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f160787a;

    /* renamed from: b, reason: collision with root package name */
    public final String f160788b;

    /* renamed from: c, reason: collision with root package name */
    public final String f160789c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f160790e;

    public i(String r2, String r3, String r4, String r5, String r6) {
        kotlin.jvm.internal.p.l(r2, "disbursedAmount");
        kotlin.jvm.internal.p.l(r3, "referenceId");
        kotlin.jvm.internal.p.l(r4, "productName");
        kotlin.jvm.internal.p.l(r5, "stampDuty");
        kotlin.jvm.internal.p.l(r6, "accruedInterest");
        this.f160787a = r2;
        this.f160788b = r3;
        this.f160789c = r4;
        this.d = r5;
        this.f160790e = r6;
    }

    public final String a() {
        return this.f160790e;
    }

    public final String b() {
        return this.f160787a;
    }

    public final String c() {
        return this.f160789c;
    }

    public final String d() {
        return this.f160788b;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (kotlin.jvm.internal.p.g(this.f160787a, r52.f160787a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f160788b, r52.f160788b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f160789c, r52.f160789c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f160790e, r52.f160790e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f160787a.hashCode() * 31) + this.f160788b.hashCode()) * 31) + this.f160789c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f160790e.hashCode();
    }

    public String toString() {
        return "HistorySBNUIState(disbursedAmount=" + this.f160787a + ", referenceId=" + this.f160788b + ", productName=" + this.f160789c + ", stampDuty=" + this.d + ", accruedInterest=" + this.f160790e + ")";
    }

    public /* synthetic */ i(String r2, String r3, String r4, String r5, String r6, int r7, kotlin.jvm.internal.i r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r7 & 16) == 0) goto L18;
        String r72 = "";
    L17:
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72);
        return;
    L18:
        r72 = r6;
        goto L17
    }
}
