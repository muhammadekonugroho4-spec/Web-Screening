package com.stockbit.domain.model.profile;

/* loaded from: classes8.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final String f84738a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f84739b;

    public s(String r2, boolean r3) {
        kotlin.jvm.internal.p.l(r2, "version");
        this.f84738a = r2;
        this.f84739b = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof s) == true) goto L8;
        return false;
    L8:
        s r52 = (s) r5;
        if (kotlin.jvm.internal.p.g(this.f84738a, r52.f84738a) == true) goto L12;
        return false;
    L12:
        if (this.f84739b == r52.f84739b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f84738a.hashCode() * 31) + Boolean.hashCode(this.f84739b);
    }

    public String toString() {
        return "StreamEntity(version=" + this.f84738a + ", hasVersion2Explained=" + this.f84739b + ")";
    }

    public /* synthetic */ s(String r1, boolean r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = "";
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = false;
    L8:
        this(r1, r2);
    }
}
