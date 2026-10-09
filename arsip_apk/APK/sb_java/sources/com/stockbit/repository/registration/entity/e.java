package com.stockbit.repository.registration.entity;

import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f130385a;

    /* renamed from: b, reason: collision with root package name */
    public final String f130386b;

    public e(String r2, String r3) {
        p.l(r2, "sessionToken");
        p.l(r3, "sendMessageLink");
        this.f130385a = r2;
        this.f130386b = r3;
    }

    public final String a() {
        return this.f130386b;
    }

    public final String b() {
        return this.f130385a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f130385a, r52.f130385a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f130386b, r52.f130386b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f130385a.hashCode() * 31) + this.f130386b.hashCode();
    }

    public String toString() {
        return "RegistrationReverseOTPPhoneRequestEntity(sessionToken=" + this.f130385a + ", sendMessageLink=" + this.f130386b + ")";
    }
}
