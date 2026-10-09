package com.stockbit.domain.model.user;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f86648a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86649b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86650c;

    public k(String r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r2, "default");
        kotlin.jvm.internal.p.l(r3, "medium");
        kotlin.jvm.internal.p.l(r4, "thumb");
        this.f86648a = r2;
        this.f86649b = r3;
        this.f86650c = r4;
    }

    public final String a() {
        return this.f86648a;
    }

    public final String b() {
        return this.f86650c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k) == true) goto L8;
        return false;
    L8:
        k r52 = (k) r5;
        if (kotlin.jvm.internal.p.g(this.f86648a, r52.f86648a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f86649b, r52.f86649b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f86650c, r52.f86650c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f86648a.hashCode() * 31) + this.f86649b.hashCode()) * 31) + this.f86650c.hashCode();
    }

    public String toString() {
        return "ProfileSocialAvatarEntity(default=" + this.f86648a + ", medium=" + this.f86649b + ", thumb=" + this.f86650c + ")";
    }

    public /* synthetic */ k(String r2, String r3, String r4, int r5, kotlin.jvm.internal.i r6) {
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
