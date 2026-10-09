package com.stockbit.domains.usecase.tradingaccount.model;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f88497a;

    /* renamed from: b, reason: collision with root package name */
    public final String f88498b;

    public a(String r2, String r3) {
        p.l(r2, Constants.KEY_KEY);
        p.l(r3, "value");
        this.f88497a = r2;
        this.f88498b = r3;
    }

    public final String a() {
        return this.f88497a;
    }

    public final String b() {
        return this.f88498b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f88497a, r52.f88497a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f88498b, r52.f88498b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f88497a.hashCode() * 31) + this.f88498b.hashCode();
    }

    public String toString() {
        return "UiParamProfileUploadHeader(key=" + this.f88497a + ", value=" + this.f88498b + ")";
    }
}
