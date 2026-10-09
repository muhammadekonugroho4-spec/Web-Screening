package com.stockbit.usecase.trading.contract.entity;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f163329a;

    /* renamed from: b, reason: collision with root package name */
    public final String f163330b;

    public c(String r2, String r3) {
        p.l(r2, Constants.KEY_KEY);
        p.l(r3, "value");
        this.f163329a = r2;
        this.f163330b = r3;
    }

    public final String a() {
        return this.f163329a;
    }

    public final String b() {
        return this.f163330b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f163329a, r52.f163329a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f163330b, r52.f163330b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f163329a.hashCode() * 31) + this.f163330b.hashCode();
    }

    public String toString() {
        return "UploadTokenFieldEntity(key=" + this.f163329a + ", value=" + this.f163330b + ")";
    }
}
