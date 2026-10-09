package com.stockbit.feature.order.ui.detailnego.model;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f101646a;

    static {
    }

    public a(String r2) {
        p.l(r2, "errorMessage");
        this.f101646a = r2;
    }

    public final String a() {
        return this.f101646a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof a) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f101646a, ((a) r4).f101646a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f101646a.hashCode();
    }

    public String toString() {
        return "MatchingPendingErrorUIState(errorMessage=" + this.f101646a + ')';
    }

    public /* synthetic */ a(String r1, int r2, i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = "";
    L5:
        this(r1);
    }
}
