package com.stockbit.usecase.securities.model.portfolio;

/* renamed from: com.stockbit.usecase.securities.model.portfolio.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10932n {

    /* renamed from: a, reason: collision with root package name */
    public final String f161772a;

    /* renamed from: b, reason: collision with root package name */
    public final String f161773b;

    public C10932n(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "code");
        kotlin.jvm.internal.p.l(r3, "description");
        this.f161772a = r2;
        this.f161773b = r3;
    }

    public final String a() {
        return this.f161772a;
    }

    public final String b() {
        return this.f161773b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C10932n) == true) goto L8;
        return false;
    L8:
        C10932n r52 = (C10932n) r5;
        if (kotlin.jvm.internal.p.g(this.f161772a, r52.f161772a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f161773b, r52.f161773b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f161772a.hashCode() * 31) + this.f161773b.hashCode();
    }

    public String toString() {
        return "NotationUIState(code=" + this.f161772a + ", description=" + this.f161773b + ")";
    }
}
