package com.stockbit.domain.model.valueobject;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f86828a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86829b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86830c;

    public d(String r1, String r2, String r3) {
        this.f86828a = r1;
        this.f86829b = r2;
        this.f86830c = r3;
    }

    public final String a() {
        return this.f86830c;
    }

    public final String b() {
        return this.f86828a;
    }

    public final String c() {
        return this.f86829b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (kotlin.jvm.internal.p.g(this.f86828a, r52.f86828a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f86829b, r52.f86829b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f86830c, r52.f86830c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.f86828a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f86829b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f86830c;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return r05 + r1;
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "GiphyImageContent(url=" + this.f86828a + ", width=" + this.f86829b + ", height=" + this.f86830c + ')';
    }
}
