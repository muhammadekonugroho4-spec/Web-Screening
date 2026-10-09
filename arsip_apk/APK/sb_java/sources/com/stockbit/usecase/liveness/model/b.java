package com.stockbit.usecase.liveness.model;

import com.stockbit.usecase.liveness.model.type.LivenessRejectionUIType;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f158229a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f158230b;

    /* renamed from: c, reason: collision with root package name */
    public final LivenessRejectionUIType f158231c;

    public b(long r2, boolean r4, LivenessRejectionUIType r5) {
        p.l(r5, "reason");
        this.f158229a = r2;
        this.f158230b = r4;
        this.f158231c = r5;
    }

    public final LivenessRejectionUIType a() {
        return this.f158231c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (this.f158229a == r82.f158229a) goto L12;
        return false;
    L12:
        if (this.f158230b == r82.f158230b) goto L15;
        return false;
    L15:
        if (this.f158231c == r82.f158231c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f158229a) * 31) + Boolean.hashCode(this.f158230b)) * 31) + this.f158231c.hashCode();
    }

    public String toString() {
        return "LivenessSubmitUIState(threshold=" + this.f158229a + ", isPassed=" + this.f158230b + ", reason=" + this.f158231c + ")";
    }
}
