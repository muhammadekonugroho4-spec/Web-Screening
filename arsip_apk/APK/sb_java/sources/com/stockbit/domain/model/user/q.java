package com.stockbit.domain.model.user;

/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final String f86670a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86671b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86672c;

    public q(String r1, String r2, String r3) {
        this.f86670a = r1;
        this.f86671b = r2;
        this.f86672c = r3;
    }

    public final String a() {
        return this.f86672c;
    }

    public final String b() {
        return this.f86670a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof q) == true) goto L8;
        return false;
    L8:
        q r52 = (q) r5;
        if (kotlin.jvm.internal.p.g(this.f86670a, r52.f86670a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f86671b, r52.f86671b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f86672c, r52.f86672c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.f86670a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f86671b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f86672c;
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
        return "UserSnsEntity(googleId=" + this.f86670a + ", appleId=" + this.f86671b + ", facebookId=" + this.f86672c + ")";
    }

    public /* synthetic */ q(String r2, String r3, String r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = null;
    L11:
        this(r2, r3, r4);
    }
}
