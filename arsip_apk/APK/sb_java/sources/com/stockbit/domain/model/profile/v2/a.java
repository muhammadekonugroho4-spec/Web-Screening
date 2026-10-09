package com.stockbit.domain.model.profile.v2;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f84797a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84798b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84799c;

    public a(String r2, String r3, String r4) {
        p.l(r2, "default");
        p.l(r3, "medium");
        p.l(r4, "thumb");
        this.f84797a = r2;
        this.f84798b = r3;
        this.f84799c = r4;
    }

    public final String a() {
        return this.f84799c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f84797a, r52.f84797a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84798b, r52.f84798b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84799c, r52.f84799c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f84797a.hashCode() * 31) + this.f84798b.hashCode()) * 31) + this.f84799c.hashCode();
    }

    public String toString() {
        return "MyProfileAvatarEntity(default=" + this.f84797a + ", medium=" + this.f84798b + ", thumb=" + this.f84799c + ")";
    }

    public /* synthetic */ a(String r2, String r3, String r4, int r5, kotlin.jvm.internal.i r6) {
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
