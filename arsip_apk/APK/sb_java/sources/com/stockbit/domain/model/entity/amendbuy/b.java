package com.stockbit.domain.model.entity.amendbuy;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f82521a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82522b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82523c;
    public final String d;

    public b(String r1, String r2, String r3, String r4) {
        this.f82521a = r1;
        this.f82522b = r2;
        this.f82523c = r3;
        this.d = r4;
    }

    public static /* synthetic */ b b(b r02, String r1, String r2, String r3, String r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r02.f82521a;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r02.f82522b;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r02.f82523c;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        return r02.a(r1, r2, r3, r4);
    }

    public final b a(String r2, String r3, String r4, String r5) {
        return new b(r2, r3, r4, r5);
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f82522b;
    }

    public final String e() {
        return this.f82521a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f82521a, r52.f82521a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82522b, r52.f82522b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f82523c, r52.f82523c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public final String f() {
        return this.f82523c;
    }

    public int hashCode() {
        String r02 = this.f82521a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f82522b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f82523c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.d;
        if (r25 == null) goto L19;
        r1 = r25.hashCode();
    L19:
        return r06 + r1;
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "AmendBuyCompanyEntity(symbol=" + this.f82521a + ", companyType=" + this.f82522b + ", urlCompanyLogo=" + this.f82523c + ", companyName=" + this.d + ')';
    }

    public /* synthetic */ b(String r2, String r3, String r4, String r5, int r6, i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = null;
    L14:
        this(r2, r3, r4, r5);
    }
}
