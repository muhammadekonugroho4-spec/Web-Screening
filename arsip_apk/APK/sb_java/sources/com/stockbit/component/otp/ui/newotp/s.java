package com.stockbit.component.otp.ui.newotp;

import com.stockbit.features.model.OTPChannelValue;

/* loaded from: classes7.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final OTPChannelValue f73532a;

    /* renamed from: b, reason: collision with root package name */
    public final String f73533b;

    /* renamed from: c, reason: collision with root package name */
    public final int f73534c;

    static {
    }

    public s(OTPChannelValue r2, String r3, int r4) {
        kotlin.jvm.internal.p.l(r2, "channel");
        kotlin.jvm.internal.p.l(r3, "message");
        this.f73532a = r2;
        this.f73533b = r3;
        this.f73534c = r4;
    }

    public final OTPChannelValue a() {
        return this.f73532a;
    }

    public final int b() {
        return this.f73534c;
    }

    public final String c() {
        return this.f73533b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof s) == true) goto L8;
        return false;
    L8:
        s r52 = (s) r5;
        if (kotlin.jvm.internal.p.g(this.f73532a, r52.f73532a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f73533b, r52.f73533b) == true) goto L15;
        return false;
    L15:
        if (this.f73534c == r52.f73534c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f73532a.hashCode() * 31) + this.f73533b.hashCode()) * 31) + Integer.hashCode(this.f73534c);
    }

    public String toString() {
        return "VerificationMethod(channel=" + this.f73532a + ", message=" + this.f73533b + ", icon=" + this.f73534c + ')';
    }
}
