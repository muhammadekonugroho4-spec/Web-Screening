package com.stockbit.usecase.chat.model.filtertype;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final int f155509a;

    /* renamed from: b, reason: collision with root package name */
    public final String f155510b;

    /* renamed from: c, reason: collision with root package name */
    public final String f155511c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f155512e;

    public b(int r2, String r3, String r4, String r5, boolean r6) {
        p.l(r3, "username");
        p.l(r4, "fullName");
        p.l(r5, "avatar");
        this.f155509a = r2;
        this.f155510b = r3;
        this.f155511c = r4;
        this.d = r5;
        this.f155512e = r6;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f155511c;
    }

    public final String c() {
        return this.f155510b;
    }

    public final boolean d() {
        return this.f155512e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f155509a == r52.f155509a) goto L12;
        return false;
    L12:
        if (p.g(this.f155510b, r52.f155510b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f155511c, r52.f155511c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f155512e == r52.f155512e) goto L23;
        return false;
    L23:
        return true;
    }

    @Override // com.stockbit.usecase.chat.model.filtertype.c
    public int getId() {
        return this.f155509a;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f155509a) * 31) + this.f155510b.hashCode()) * 31) + this.f155511c.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f155512e);
    }

    public String toString() {
        return "FilterPeopleUIState(id=" + this.f155509a + ", username=" + this.f155510b + ", fullName=" + this.f155511c + ", avatar=" + this.d + ", isVerified=" + this.f155512e + ")";
    }
}
