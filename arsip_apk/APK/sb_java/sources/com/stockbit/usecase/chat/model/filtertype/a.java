package com.stockbit.usecase.chat.model.filtertype;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final int f155506a;

    /* renamed from: b, reason: collision with root package name */
    public final String f155507b;

    /* renamed from: c, reason: collision with root package name */
    public final String f155508c;

    public a(int r2, String r3, String r4) {
        p.l(r3, "symbol");
        p.l(r4, "description");
        this.f155506a = r2;
        this.f155507b = r3;
        this.f155508c = r4;
    }

    public final String a() {
        return this.f155508c;
    }

    public final String b() {
        return this.f155507b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f155506a == r52.f155506a) goto L12;
        return false;
    L12:
        if (p.g(this.f155507b, r52.f155507b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f155508c, r52.f155508c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    @Override // com.stockbit.usecase.chat.model.filtertype.c
    public int getId() {
        return this.f155506a;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f155506a) * 31) + this.f155507b.hashCode()) * 31) + this.f155508c.hashCode();
    }

    public String toString() {
        return "FilterCompanyUIState(id=" + this.f155506a + ", symbol=" + this.f155507b + ", description=" + this.f155508c + ")";
    }
}
