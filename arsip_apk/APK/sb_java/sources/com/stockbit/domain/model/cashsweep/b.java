package com.stockbit.domain.model.cashsweep;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f81109a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81110b;

    public b(boolean r2, String r3) {
        p.l(r3, Constants.KEY_TEXT);
        this.f81109a = r2;
        this.f81110b = r3;
    }

    public final String a() {
        return this.f81110b;
    }

    public final boolean b() {
        return this.f81109a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f81109a == r52.f81109a) goto L12;
        return false;
    L12:
        if (p.g(this.f81110b, r52.f81110b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f81109a) * 31) + this.f81110b.hashCode();
    }

    public String toString() {
        return "BannerEntity(isShowed=" + this.f81109a + ", text=" + this.f81110b + ")";
    }
}
