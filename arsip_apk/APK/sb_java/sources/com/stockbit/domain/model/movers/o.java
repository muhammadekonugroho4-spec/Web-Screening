package com.stockbit.domain.model.movers;

/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f84394a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84395b;

    public o(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "code");
        kotlin.jvm.internal.p.l(r3, "description");
        this.f84394a = r2;
        this.f84395b = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof o) == true) goto L8;
        return false;
    L8:
        o r52 = (o) r5;
        if (kotlin.jvm.internal.p.g(this.f84394a, r52.f84394a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f84395b, r52.f84395b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f84394a.hashCode() * 31) + this.f84395b.hashCode();
    }

    public String toString() {
        return "MoversNotationEntity(code=" + this.f84394a + ", description=" + this.f84395b + ")";
    }
}
