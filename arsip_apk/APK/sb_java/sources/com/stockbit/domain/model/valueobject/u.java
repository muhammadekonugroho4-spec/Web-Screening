package com.stockbit.domain.model.valueobject;

/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final String f87204a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87205b;

    /* renamed from: c, reason: collision with root package name */
    public final String f87206c;
    public final String d;

    public u(String r2, String r3, String r4, String r5) {
        kotlin.jvm.internal.p.l(r2, "transferId");
        kotlin.jvm.internal.p.l(r3, "sessionId");
        kotlin.jvm.internal.p.l(r4, "verificationToken");
        kotlin.jvm.internal.p.l(r5, "verificationFeature");
        this.f87204a = r2;
        this.f87205b = r3;
        this.f87206c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f87205b;
    }

    public final String b() {
        return this.f87204a;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f87206c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof u) == true) goto L8;
        return false;
    L8:
        u r52 = (u) r5;
        if (kotlin.jvm.internal.p.g(this.f87204a, r52.f87204a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f87205b, r52.f87205b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f87206c, r52.f87206c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f87204a.hashCode() * 31) + this.f87205b.hashCode()) * 31) + this.f87206c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "TransferStockVerificationSession(transferId=" + this.f87204a + ", sessionId=" + this.f87205b + ", verificationToken=" + this.f87206c + ", verificationFeature=" + this.d + ')';
    }
}
