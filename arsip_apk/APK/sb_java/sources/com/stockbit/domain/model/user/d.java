package com.stockbit.domain.model.user;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f86627a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86628b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86629c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f86630e;

    public d(int r2, String r3, String r4, String r5, boolean r6) {
        kotlin.jvm.internal.p.l(r3, "language");
        kotlin.jvm.internal.p.l(r4, "url");
        kotlin.jvm.internal.p.l(r5, "featureId");
        this.f86627a = r2;
        this.f86628b = r3;
        this.f86629c = r4;
        this.d = r5;
        this.f86630e = r6;
    }

    public static /* synthetic */ d b(d r02, int r1, String r2, String r3, String r4, boolean r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r02.f86627a;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r02.f86628b;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r02.f86629c;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r02.f86630e;
    L17:
        String r62 = r4;
        boolean r72 = r5;
        String r52 = r3;
        int r32 = r1;
        return r02.a(r32, r2, r52, r62, r72);
    }

    public final d a(int r8, String r9, String r10, String r11, boolean r12) {
        kotlin.jvm.internal.p.l(r9, "language");
        kotlin.jvm.internal.p.l(r10, "url");
        kotlin.jvm.internal.p.l(r11, "featureId");
        return new d(r8, r9, r10, r11, r12);
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f86628b;
    }

    public final String e() {
        return this.f86629c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (this.f86627a == r52.f86627a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f86628b, r52.f86628b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f86629c, r52.f86629c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f86630e == r52.f86630e) goto L23;
        return false;
    L23:
        return true;
    }

    public final int f() {
        return this.f86627a;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f86627a) * 31) + this.f86628b.hashCode()) * 31) + this.f86629c.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f86630e);
    }

    public String toString() {
        return "FeatureTnCLetterEntity(version=" + this.f86627a + ", language=" + this.f86628b + ", url=" + this.f86629c + ", featureId=" + this.d + ", isAccepted=" + this.f86630e + ")";
    }
}
