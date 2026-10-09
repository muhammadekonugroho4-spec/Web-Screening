package com.stockbit.domain.model.profile;

/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f84700a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84701b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84702c;

    public n(String r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r2, "googleId");
        kotlin.jvm.internal.p.l(r3, "appleId");
        kotlin.jvm.internal.p.l(r4, "facebookId");
        this.f84700a = r2;
        this.f84701b = r3;
        this.f84702c = r4;
    }

    public final String a() {
        return this.f84702c;
    }

    public final String b() {
        return this.f84700a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof n) == true) goto L8;
        return false;
    L8:
        n r52 = (n) r5;
        if (kotlin.jvm.internal.p.g(this.f84700a, r52.f84700a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f84701b, r52.f84701b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f84702c, r52.f84702c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f84700a.hashCode() * 31) + this.f84701b.hashCode()) * 31) + this.f84702c.hashCode();
    }

    public String toString() {
        return "ProfileSnsEntity(googleId=" + this.f84700a + ", appleId=" + this.f84701b + ", facebookId=" + this.f84702c + ")";
    }

    public /* synthetic */ n(String r2, String r3, String r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = "";
    L11:
        this(r2, r3, r4);
    }
}
