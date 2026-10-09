package com.stockbit.usecase.foreignflow.contract.entity;

import com.google.firebase.messaging.Constants;
import java.time.LocalDate;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final LocalDate f157870a;

    /* renamed from: b, reason: collision with root package name */
    public final LocalDate f157871b;

    public a(LocalDate r2, LocalDate r3) {
        p.l(r2, Constants.MessagePayloadKeys.FROM);
        p.l(r3, "to");
        this.f157870a = r2;
        this.f157871b = r3;
    }

    public final LocalDate a() {
        return this.f157870a;
    }

    public final LocalDate b() {
        return this.f157871b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f157870a, r52.f157870a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157871b, r52.f157871b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f157870a.hashCode() * 31) + this.f157871b.hashCode();
    }

    public String toString() {
        return "ForeignFlowDateRangeEntity(from=" + this.f157870a + ", to=" + this.f157871b + ")";
    }
}
