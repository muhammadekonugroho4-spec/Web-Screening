package com.stockbit.usecase.securities.model.history;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f160811a;

    /* renamed from: b, reason: collision with root package name */
    public final String f160812b;

    public l(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "lightMode");
        kotlin.jvm.internal.p.l(r3, "darkMode");
        this.f160811a = r2;
        this.f160812b = r3;
    }

    public final String a() {
        return this.f160812b;
    }

    public final String b() {
        return this.f160811a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof l) == true) goto L8;
        return false;
    L8:
        l r52 = (l) r5;
        if (kotlin.jvm.internal.p.g(this.f160811a, r52.f160811a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f160812b, r52.f160812b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f160811a.hashCode() * 31) + this.f160812b.hashCode();
    }

    public String toString() {
        return "RealizedColorUIState(lightMode=" + this.f160811a + ", darkMode=" + this.f160812b + ")";
    }

    public /* synthetic */ l(String r2, String r3, int r4, kotlin.jvm.internal.i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = "";
    L8:
        this(r2, r3);
    }
}
