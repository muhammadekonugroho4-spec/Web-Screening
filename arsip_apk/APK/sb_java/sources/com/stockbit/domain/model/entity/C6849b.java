package com.stockbit.domain.model.entity;

import java.util.List;

/* renamed from: com.stockbit.domain.model.entity.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6849b {

    /* renamed from: a, reason: collision with root package name */
    public final String f82558a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82559b;

    /* renamed from: c, reason: collision with root package name */
    public final List f82560c;

    public C6849b(String r2, String r3, List r4) {
        kotlin.jvm.internal.p.l(r3, "viewUrl");
        this.f82558a = r2;
        this.f82559b = r3;
        this.f82560c = r4;
    }

    public final List a() {
        return this.f82560c;
    }

    public final String b() {
        return this.f82559b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C6849b) == true) goto L8;
        return false;
    L8:
        C6849b r52 = (C6849b) r5;
        if (kotlin.jvm.internal.p.g(this.f82558a, r52.f82558a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f82559b, r52.f82559b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f82560c, r52.f82560c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.f82558a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = ((r03 * 31) + this.f82559b.hashCode()) * 31;
        List r2 = this.f82560c;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "AwsToken(url=" + this.f82558a + ", viewUrl=" + this.f82559b + ", fields=" + this.f82560c + ')';
    }
}
