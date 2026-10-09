package com.stockbit.domain.model.profile;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f84697a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84698b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84699c;

    public m(boolean r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r3, "activeSince");
        kotlin.jvm.internal.p.l(r4, "expiredAt");
        this.f84697a = r2;
        this.f84698b = r3;
        this.f84699c = r4;
    }

    public final String a() {
        return this.f84698b;
    }

    public final boolean b() {
        return this.f84697a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof m) == true) goto L8;
        return false;
    L8:
        m r52 = (m) r5;
        if (this.f84697a == r52.f84697a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f84698b, r52.f84698b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f84699c, r52.f84699c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f84697a) * 31) + this.f84698b.hashCode()) * 31) + this.f84699c.hashCode();
    }

    public String toString() {
        return "ProfileProEntity(isPro=" + this.f84697a + ", activeSince=" + this.f84698b + ", expiredAt=" + this.f84699c + ")";
    }

    public /* synthetic */ m(boolean r2, String r3, String r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = false;
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
