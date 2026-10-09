package com.stockbit.domain.model.trusteddevice;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f86140a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86141b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86142c;

    public h(String r2, String r3, String r4) {
        p.l(r2, "email");
        this.f86140a = r2;
        this.f86141b = r3;
        this.f86142c = r4;
    }

    public final String a() {
        return this.f86140a;
    }

    public final String b() {
        return this.f86141b;
    }

    public final String c() {
        return this.f86142c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (p.g(this.f86140a, r52.f86140a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86141b, r52.f86141b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f86142c, r52.f86142c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = this.f86140a.hashCode() * 31;
        String r1 = this.f86141b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f86142c;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "RecoveryOTPRecipientEntity(email=" + this.f86140a + ", phone=" + this.f86141b + ", whatsapp=" + this.f86142c + ")";
    }
}
