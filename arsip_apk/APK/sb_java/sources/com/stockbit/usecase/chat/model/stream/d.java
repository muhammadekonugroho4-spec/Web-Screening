package com.stockbit.usecase.chat.model.stream;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f155680a;

    /* renamed from: b, reason: collision with root package name */
    public final String f155681b;

    /* renamed from: c, reason: collision with root package name */
    public final int f155682c;

    public d(int r2, String r3, int r4) {
        p.l(r3, "value");
        this.f155680a = r2;
        this.f155681b = r3;
        this.f155682c = r4;
    }

    public final int a() {
        return this.f155682c;
    }

    public final int b() {
        return this.f155680a;
    }

    public final String c() {
        return this.f155681b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (this.f155680a == r52.f155680a) goto L12;
        return false;
    L12:
        if (p.g(this.f155681b, r52.f155681b) == true) goto L15;
        return false;
    L15:
        if (this.f155682c == r52.f155682c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f155680a) * 31) + this.f155681b.hashCode()) * 31) + Integer.hashCode(this.f155682c);
    }

    public String toString() {
        return "PollingOptionUIState(id=" + this.f155680a + ", value=" + this.f155681b + ", countVoters=" + this.f155682c + ")";
    }
}
