package com.stockbit.usecase.company.model;

/* renamed from: com.stockbit.usecase.company.model.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10881a {

    /* renamed from: a, reason: collision with root package name */
    public final int f156165a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f156166b;

    /* renamed from: c, reason: collision with root package name */
    public final String f156167c;

    public C10881a(int r2, boolean r3, String r4) {
        kotlin.jvm.internal.p.l(r4, "value");
        this.f156165a = r2;
        this.f156166b = r3;
        this.f156167c = r4;
    }

    public final String a() {
        return this.f156167c;
    }

    public final int b() {
        return this.f156165a;
    }

    public final boolean c() {
        return this.f156166b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C10881a) == true) goto L8;
        return false;
    L8:
        C10881a r52 = (C10881a) r5;
        if (this.f156165a == r52.f156165a) goto L12;
        return false;
    L12:
        if (this.f156166b == r52.f156166b) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f156167c, r52.f156167c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f156165a) * 31) + Boolean.hashCode(this.f156166b)) * 31) + this.f156167c.hashCode();
    }

    public String toString() {
        return "AnalystConsensusItemUIState(year=" + this.f156165a + ", isEstimate=" + this.f156166b + ", value=" + this.f156167c + ")";
    }
}
