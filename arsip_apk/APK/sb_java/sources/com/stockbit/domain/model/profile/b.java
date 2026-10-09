package com.stockbit.domain.model.profile;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f84636a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84637b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84638c;

    public b(String r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r2, "default");
        kotlin.jvm.internal.p.l(r3, "medium");
        kotlin.jvm.internal.p.l(r4, "thumb");
        this.f84636a = r2;
        this.f84637b = r3;
        this.f84638c = r4;
    }

    public final String a() {
        return this.f84638c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (kotlin.jvm.internal.p.g(this.f84636a, r52.f84636a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f84637b, r52.f84637b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f84638c, r52.f84638c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f84636a.hashCode() * 31) + this.f84637b.hashCode()) * 31) + this.f84638c.hashCode();
    }

    public String toString() {
        return "AvatarProfileExodusEntity(default=" + this.f84636a + ", medium=" + this.f84637b + ", thumb=" + this.f84638c + ")";
    }

    public /* synthetic */ b(String r2, String r3, String r4, int r5, kotlin.jvm.internal.i r6) {
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
