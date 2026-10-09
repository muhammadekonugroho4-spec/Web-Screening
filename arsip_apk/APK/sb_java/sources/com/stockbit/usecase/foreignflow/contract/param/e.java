package com.stockbit.usecase.foreignflow.contract.param;

import com.clevertap.android.sdk.Constants;
import java.time.LocalDate;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    public final LocalDate f157907a;

    public e(LocalDate r2) {
        p.l(r2, Constants.KEY_DATE);
        this.f157907a = r2;
    }

    public final LocalDate a() {
        return this.f157907a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof e) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f157907a, ((e) r4).f157907a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f157907a.hashCode();
    }

    public String toString() {
        return "ForeignFlowSingleDateFilter(date=" + this.f157907a + ")";
    }
}
