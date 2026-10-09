package com.stockbit.usecase.securities.model.order;

/* renamed from: com.stockbit.usecase.securities.model.order.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10918l {

    /* renamed from: a, reason: collision with root package name */
    public final C10917k f161370a;

    /* renamed from: b, reason: collision with root package name */
    public final C10917k f161371b;

    /* renamed from: c, reason: collision with root package name */
    public final C10917k f161372c;

    public C10918l(C10917k r2, C10917k r3, C10917k r4) {
        kotlin.jvm.internal.p.l(r2, "exDate");
        kotlin.jvm.internal.p.l(r3, "recordingDate");
        kotlin.jvm.internal.p.l(r4, "paymentDate");
        this.f161370a = r2;
        this.f161371b = r3;
        this.f161372c = r4;
    }

    public final C10917k a() {
        return this.f161370a;
    }

    public final C10917k b() {
        return this.f161372c;
    }

    public final C10917k c() {
        return this.f161371b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C10918l) == true) goto L8;
        return false;
    L8:
        C10918l r52 = (C10918l) r5;
        if (kotlin.jvm.internal.p.g(this.f161370a, r52.f161370a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f161371b, r52.f161371b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f161372c, r52.f161372c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f161370a.hashCode() * 31) + this.f161371b.hashCode()) * 31) + this.f161372c.hashCode();
    }

    public String toString() {
        return "DividendTimelineUIState(exDate=" + this.f161370a + ", recordingDate=" + this.f161371b + ", paymentDate=" + this.f161372c + ")";
    }
}
