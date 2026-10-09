package com.stockbit.usecase.company.model.historicaldata;

import java.time.LocalDate;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f156228a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156229b;

    /* renamed from: c, reason: collision with root package name */
    public final String f156230c;
    public final LocalDate d;

    /* renamed from: e, reason: collision with root package name */
    public final LocalDate f156231e;

    public a(String r2, String r3, String r4, LocalDate r5, LocalDate r6) {
        p.l(r2, "simplifiedDate");
        p.l(r3, "start");
        p.l(r4, "end");
        p.l(r5, "startRaw");
        p.l(r6, "endRaw");
        this.f156228a = r2;
        this.f156229b = r3;
        this.f156230c = r4;
        this.d = r5;
        this.f156231e = r6;
    }

    public final LocalDate a() {
        return this.f156231e;
    }

    public final String b() {
        return this.f156228a;
    }

    public final LocalDate c() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f156228a, r52.f156228a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f156229b, r52.f156229b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f156230c, r52.f156230c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f156231e, r52.f156231e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f156228a.hashCode() * 31) + this.f156229b.hashCode()) * 31) + this.f156230c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f156231e.hashCode();
    }

    public String toString() {
        return "HistoricalDataDateUIState(simplifiedDate=" + this.f156228a + ", start=" + this.f156229b + ", end=" + this.f156230c + ", startRaw=" + this.d + ", endRaw=" + this.f156231e + ")";
    }
}
