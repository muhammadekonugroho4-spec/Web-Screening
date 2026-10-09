package com.stockbit.domain.model.entity;

import com.clevertap.android.sdk.Constants;

/* renamed from: com.stockbit.domain.model.entity.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6850c {

    /* renamed from: a, reason: collision with root package name */
    public final String f82561a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82562b;

    public C6850c(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_KEY);
        kotlin.jvm.internal.p.l(r3, "value");
        this.f82561a = r2;
        this.f82562b = r3;
    }

    public final String a() {
        return this.f82561a;
    }

    public final String b() {
        return this.f82562b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C6850c) == true) goto L8;
        return false;
    L8:
        C6850c r52 = (C6850c) r5;
        if (kotlin.jvm.internal.p.g(this.f82561a, r52.f82561a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f82562b, r52.f82562b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f82561a.hashCode() * 31) + this.f82562b.hashCode();
    }

    public String toString() {
        return "AwsTokenField(key=" + this.f82561a + ", value=" + this.f82562b + ')';
    }
}
