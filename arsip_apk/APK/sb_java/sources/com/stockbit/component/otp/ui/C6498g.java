package com.stockbit.component.otp.ui;

import com.clevertap.android.sdk.Constants;

/* renamed from: com.stockbit.component.otp.ui.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6498g {

    /* renamed from: a, reason: collision with root package name */
    public final String f73454a;

    /* renamed from: b, reason: collision with root package name */
    public final int f73455b;

    static {
    }

    public C6498g(String r2, int r3) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_TITLE);
        this.f73454a = r2;
        this.f73455b = r3;
    }

    public final int a() {
        return this.f73455b;
    }

    public final String b() {
        return this.f73454a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C6498g) == true) goto L8;
        return false;
    L8:
        C6498g r52 = (C6498g) r5;
        if (kotlin.jvm.internal.p.g(this.f73454a, r52.f73454a) == true) goto L12;
        return false;
    L12:
        if (this.f73455b == r52.f73455b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f73454a.hashCode() * 31) + Integer.hashCode(this.f73455b);
    }

    public String toString() {
        return "OTPInputLimit(title=" + this.f73454a + ", buttonText=" + this.f73455b + ')';
    }
}
