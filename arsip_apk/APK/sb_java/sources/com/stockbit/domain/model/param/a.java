package com.stockbit.domain.model.param;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f84578a;

    /* renamed from: b, reason: collision with root package name */
    public String f84579b;

    public a(String r2, String r3) {
        p.l(r3, "category");
        this.f84578a = r2;
        this.f84579b = r3;
    }

    public final String a() {
        return this.f84579b;
    }

    public final String b() {
        return this.f84578a;
    }

    public final void c(String r2) {
        p.l(r2, "<set-?>");
        this.f84579b = r2;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f84578a, r52.f84578a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84579b, r52.f84579b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.f84578a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (r03 * 31) + this.f84579b.hashCode();
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "UnboxingListParams(lastVolume=" + this.f84578a + ", category=" + this.f84579b + ')';
    }
}
