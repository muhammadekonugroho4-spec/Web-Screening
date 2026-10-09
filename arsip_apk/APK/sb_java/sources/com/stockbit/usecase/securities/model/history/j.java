package com.stockbit.usecase.securities.model.history;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f160791a;

    /* renamed from: b, reason: collision with root package name */
    public final String f160792b;

    public j(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "header");
        kotlin.jvm.internal.p.l(r3, "description");
        this.f160791a = r2;
        this.f160792b = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (kotlin.jvm.internal.p.g(this.f160791a, r52.f160791a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f160792b, r52.f160792b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f160791a.hashCode() * 31) + this.f160792b.hashCode();
    }

    public String toString() {
        return "HistoryTooltipUIState(header=" + this.f160791a + ", description=" + this.f160792b + ")";
    }
}
