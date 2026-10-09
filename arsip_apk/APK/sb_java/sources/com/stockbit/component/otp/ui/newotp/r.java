package com.stockbit.component.otp.ui.newotp;

/* loaded from: classes7.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f73529a;

    /* renamed from: b, reason: collision with root package name */
    public final String f73530b;

    /* renamed from: c, reason: collision with root package name */
    public final String f73531c;
    public final String d;

    static {
    }

    public r(int r2, String r3, String r4, String r5) {
        kotlin.jvm.internal.p.l(r3, "email");
        kotlin.jvm.internal.p.l(r4, "whatsapp");
        kotlin.jvm.internal.p.l(r5, "sms");
        this.f73529a = r2;
        this.f73530b = r3;
        this.f73531c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f73530b;
    }

    public final int b() {
        return this.f73529a;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f73531c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof r) == true) goto L8;
        return false;
    L8:
        r r52 = (r) r5;
        if (this.f73529a == r52.f73529a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f73530b, r52.f73530b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f73531c, r52.f73531c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f73529a) * 31) + this.f73530b.hashCode()) * 31) + this.f73531c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "OtpOptionsParam(selectedIndex=" + this.f73529a + ", email=" + this.f73530b + ", whatsapp=" + this.f73531c + ", sms=" + this.d + ')';
    }
}
