package com.stockbit.domain.model.auth;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f80688a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80689b;

    public n(String r1, String r2) {
        this.f80688a = r1;
        this.f80689b = r2;
    }

    public final String a() {
        return this.f80688a;
    }

    public final String b() {
        return this.f80689b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof n) == true) goto L8;
        return false;
    L8:
        n r52 = (n) r5;
        if (p.g(this.f80688a, r52.f80688a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f80689b, r52.f80689b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f80688a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f80689b;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "UnfreezeEntity(loginToken=" + this.f80688a + ", verificationToken=" + this.f80689b + ")";
    }
}
