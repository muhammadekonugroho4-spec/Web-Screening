package com.stockbit.repository.registration.entity;

import com.stockbit.domain.model.auth.m;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f130376a;

    /* renamed from: b, reason: collision with root package name */
    public final m f130377b;

    /* renamed from: c, reason: collision with root package name */
    public final m f130378c;

    public b(boolean r1, m r2, m r3) {
        this.f130376a = r1;
        this.f130377b = r2;
        this.f130378c = r3;
    }

    public final m a() {
        return this.f130377b;
    }

    public final m b() {
        return this.f130378c;
    }

    public final boolean c() {
        return this.f130376a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f130376a == r52.f130376a) goto L12;
        return false;
    L12:
        if (p.g(this.f130377b, r52.f130377b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f130378c, r52.f130378c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = Boolean.hashCode(this.f130376a) * 31;
        m r1 = this.f130377b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        m r13 = this.f130378c;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "RegistrationOTPPhoneAuthEntity(success=" + this.f130376a + ", accessToken=" + this.f130377b + ", refreshToken=" + this.f130378c + ")";
    }
}
