package com.stockbit.domain.model.securities.history.detail;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f85272a;

    public b(a r2) {
        p.l(r2, "buySell");
        this.f85272a = r2;
    }

    public final a a() {
        return this.f85272a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof b) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f85272a, ((b) r4).f85272a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f85272a.hashCode();
    }

    public String toString() {
        return "HistoryDetailActionEntity(buySell=" + this.f85272a + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ b(a r1, int r2, kotlin.jvm.internal.i r3) {
        if ((r2 & 1) == 0) goto L5;
        e r32 = null;
        Object[] r33 = 0 == true ? 1 : 0;
        r1 = new a(r32, r33, 3, 0 == true ? 1 : 0);
    L5:
        this(r1);
    }
}
