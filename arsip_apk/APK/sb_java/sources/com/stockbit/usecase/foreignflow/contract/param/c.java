package com.stockbit.usecase.foreignflow.contract.param;

import com.stockbit.usecase.foreignflow.contract.entity.ForeignFlowDatePreset;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final ForeignFlowDatePreset f157904a;

    public c(ForeignFlowDatePreset r2) {
        p.l(r2, "preset");
        this.f157904a = r2;
    }

    public final ForeignFlowDatePreset a() {
        return this.f157904a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof c) == true) goto L9;
        return false;
    L9:
        if (this.f157904a == ((c) r4).f157904a) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f157904a.hashCode();
    }

    public String toString() {
        return "ForeignFlowPresetDateFilter(preset=" + this.f157904a + ")";
    }
}
