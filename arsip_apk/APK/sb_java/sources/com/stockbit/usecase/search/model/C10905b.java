package com.stockbit.usecase.search.model;

import com.clevertap.android.sdk.Constants;
import com.stockbit.usecase.search.type.PercentageType;

/* renamed from: com.stockbit.usecase.search.model.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10905b {

    /* renamed from: a, reason: collision with root package name */
    public final String f159982a;

    /* renamed from: b, reason: collision with root package name */
    public final String f159983b;

    /* renamed from: c, reason: collision with root package name */
    public final String f159984c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f159985e;

    /* renamed from: f, reason: collision with root package name */
    public final PercentageType f159986f;

    public C10905b(String r2, String r3, String r4, String r5, String r6, PercentageType r7) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r3, "symbol");
        kotlin.jvm.internal.p.l(r4, Constants.KEY_TITLE);
        kotlin.jvm.internal.p.l(r5, "logo");
        kotlin.jvm.internal.p.l(r6, "percentage");
        kotlin.jvm.internal.p.l(r7, "percentageState");
        this.f159982a = r2;
        this.f159983b = r3;
        this.f159984c = r4;
        this.d = r5;
        this.f159985e = r6;
        this.f159986f = r7;
    }

    public static /* synthetic */ C10905b b(C10905b r02, String r1, String r2, String r3, String r4, String r5, PercentageType r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r02.f159982a;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r02.f159983b;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r02.f159984c;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r02.f159985e;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r02.f159986f;
    L20:
        String r72 = r5;
        PercentageType r82 = r6;
        String r52 = r3;
        String r62 = r4;
        return r02.a(r1, r2, r52, r62, r72, r82);
    }

    public final C10905b a(String r9, String r10, String r11, String r12, String r13, PercentageType r14) {
        kotlin.jvm.internal.p.l(r9, Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r10, "symbol");
        kotlin.jvm.internal.p.l(r11, Constants.KEY_TITLE);
        kotlin.jvm.internal.p.l(r12, "logo");
        kotlin.jvm.internal.p.l(r13, "percentage");
        kotlin.jvm.internal.p.l(r14, "percentageState");
        return new C10905b(r9, r10, r11, r12, r13, r14);
    }

    public final String c() {
        return this.f159982a;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f159985e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C10905b) == true) goto L8;
        return false;
    L8:
        C10905b r52 = (C10905b) r5;
        if (kotlin.jvm.internal.p.g(this.f159982a, r52.f159982a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f159983b, r52.f159983b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f159984c, r52.f159984c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f159985e, r52.f159985e) == true) goto L24;
        return false;
    L24:
        if (this.f159986f == r52.f159986f) goto L26;
        return false;
    L26:
        return true;
    }

    public final PercentageType f() {
        return this.f159986f;
    }

    public final String g() {
        return this.f159983b;
    }

    public final String h() {
        return this.f159984c;
    }

    public int hashCode() {
        return (((((((((this.f159982a.hashCode() * 31) + this.f159983b.hashCode()) * 31) + this.f159984c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f159985e.hashCode()) * 31) + this.f159986f.hashCode();
    }

    public String toString() {
        return "EmittenCatalogUIState(id=" + this.f159982a + ", symbol=" + this.f159983b + ", title=" + this.f159984c + ", logo=" + this.d + ", percentage=" + this.f159985e + ", percentageState=" + this.f159986f + ")";
    }
}
