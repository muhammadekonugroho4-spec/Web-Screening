package com.stockbit.domain.model.securities.history.detail;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f85316a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85317b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85318c;
    public final String d;

    public g(String r2, String r3, String r4, String r5) {
        p.l(r2, "accountNo");
        p.l(r3, "mainAccountNo");
        p.l(r4, "userId");
        p.l(r5, "username");
        this.f85316a = r2;
        this.f85317b = r3;
        this.f85318c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f85316a, r52.f85316a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85317b, r52.f85317b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85318c, r52.f85318c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f85316a.hashCode() * 31) + this.f85317b.hashCode()) * 31) + this.f85318c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "HistoryDetailNegoUserEntity(accountNo=" + this.f85316a + ", mainAccountNo=" + this.f85317b + ", userId=" + this.f85318c + ", username=" + this.d + ")";
    }

    public /* synthetic */ g(String r2, String r3, String r4, String r5, int r6, kotlin.jvm.internal.i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = "";
    L14:
        this(r2, r3, r4, r5);
    }
}
