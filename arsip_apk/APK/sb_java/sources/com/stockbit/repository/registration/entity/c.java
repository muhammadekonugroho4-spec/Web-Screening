package com.stockbit.repository.registration.entity;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f130379a;

    /* renamed from: b, reason: collision with root package name */
    public final int f130380b;

    /* renamed from: c, reason: collision with root package name */
    public final int f130381c;
    public final e d;

    public c(String r2, int r3, int r4, e r5) {
        p.l(r2, Constants.KEY_KEY);
        this.f130379a = r2;
        this.f130380b = r3;
        this.f130381c = r4;
        this.d = r5;
    }

    public final int a() {
        return this.f130381c;
    }

    public final int b() {
        return this.f130380b;
    }

    public final e c() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f130379a, r52.f130379a) == true) goto L12;
        return false;
    L12:
        if (this.f130380b == r52.f130380b) goto L15;
        return false;
    L15:
        if (this.f130381c == r52.f130381c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int r02 = ((((this.f130379a.hashCode() * 31) + Integer.hashCode(this.f130380b)) * 31) + Integer.hashCode(this.f130381c)) * 31;
        e r1 = this.d;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "RegistrationOTPPhoneRequestEntity(key=" + this.f130379a + ", remainingAttempt=" + this.f130380b + ", nextAttemptInSecond=" + this.f130381c + ", reverseOTPWhatsapp=" + this.d + ")";
    }
}
