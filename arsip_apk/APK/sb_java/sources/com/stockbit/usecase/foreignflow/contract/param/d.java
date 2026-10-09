package com.stockbit.usecase.foreignflow.contract.param;

import com.google.firebase.messaging.Constants;
import java.time.LocalDate;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public final LocalDate f157905a;

    /* renamed from: b, reason: collision with root package name */
    public final LocalDate f157906b;

    public d(LocalDate r2, LocalDate r3) {
        p.l(r2, Constants.MessagePayloadKeys.FROM);
        p.l(r3, "to");
        this.f157905a = r2;
        this.f157906b = r3;
    }

    public final d a(LocalDate r2, LocalDate r3) {
        p.l(r2, Constants.MessagePayloadKeys.FROM);
        p.l(r3, "to");
        return new d(r2, r3);
    }

    public final LocalDate b() {
        return this.f157905a;
    }

    public final LocalDate c() {
        return this.f157906b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f157905a, r52.f157905a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157906b, r52.f157906b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f157905a.hashCode() * 31) + this.f157906b.hashCode();
    }

    public String toString() {
        return "ForeignFlowRangeDateFilter(from=" + this.f157905a + ", to=" + this.f157906b + ")";
    }
}
