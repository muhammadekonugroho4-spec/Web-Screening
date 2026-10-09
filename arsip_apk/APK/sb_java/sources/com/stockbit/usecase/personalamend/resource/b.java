package com.stockbit.usecase.personalamend.resource;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final String f159096a;

    /* renamed from: b, reason: collision with root package name */
    public final String f159097b;

    public b(String r2, String r3) {
        p.l(r2, Constants.KEY_TITLE);
        p.l(r3, "message");
        this.f159096a = r2;
        this.f159097b = r3;
    }

    public final String a() {
        return this.f159097b;
    }

    public final String b() {
        return this.f159096a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f159096a, r52.f159096a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f159097b, r52.f159097b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f159096a.hashCode() * 31) + this.f159097b.hashCode();
    }

    public String toString() {
        return "OTPLimit(title=" + this.f159096a + ", message=" + this.f159097b + ")";
    }
}
