package com.stockbit.domain.model.valueobject;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f86833a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86834b;

    public f(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "link");
        kotlin.jvm.internal.p.l(r3, "token");
        this.f86833a = r2;
        this.f86834b = r3;
    }

    public final String a() {
        return this.f86833a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (kotlin.jvm.internal.p.g(this.f86833a, r52.f86833a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f86834b, r52.f86834b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f86833a.hashCode() * 31) + this.f86834b.hashCode();
    }

    public String toString() {
        return "LinkAndToken(link=" + this.f86833a + ", token=" + this.f86834b + ')';
    }

    public /* synthetic */ f(String r2, String r3, int r4, kotlin.jvm.internal.i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = "";
    L8:
        this(r2, r3);
    }
}
