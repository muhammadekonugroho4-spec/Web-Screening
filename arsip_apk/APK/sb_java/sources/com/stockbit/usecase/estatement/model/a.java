package com.stockbit.usecase.estatement.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f157594a;

    /* renamed from: b, reason: collision with root package name */
    public final String f157595b;

    /* renamed from: c, reason: collision with root package name */
    public final String f157596c;

    public a(String r2, String r3, String r4) {
        p.l(r2, "minDate");
        p.l(r3, "todayDate");
        p.l(r4, "firstDayOfYear");
        this.f157594a = r2;
        this.f157595b = r3;
        this.f157596c = r4;
    }

    public final String a() {
        return this.f157594a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f157594a, r52.f157594a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157595b, r52.f157595b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f157596c, r52.f157596c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f157594a.hashCode() * 31) + this.f157595b.hashCode()) * 31) + this.f157596c.hashCode();
    }

    public String toString() {
        return "SelectedRangeDate(minDate=" + this.f157594a + ", todayDate=" + this.f157595b + ", firstDayOfYear=" + this.f157596c + ")";
    }
}
