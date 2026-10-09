package com.stockbit.domain.model.openingaccount;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f84531a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f84532b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f84533c;

    public f(boolean r1, boolean r2, boolean r3) {
        this.f84531a = r1;
        this.f84532b = r2;
        this.f84533c = r3;
    }

    public final boolean a() {
        return this.f84531a;
    }

    public final boolean b() {
        return this.f84532b;
    }

    public final boolean c() {
        return this.f84533c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (this.f84531a == r52.f84531a) goto L12;
        return false;
    L12:
        if (this.f84532b == r52.f84532b) goto L15;
        return false;
    L15:
        if (this.f84533c == r52.f84533c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f84531a) * 31) + Boolean.hashCode(this.f84532b)) * 31) + Boolean.hashCode(this.f84533c);
    }

    public String toString() {
        return "OAOcrResultEntity(eligible=" + this.f84531a + ", triggered=" + this.f84532b + ", used=" + this.f84533c + ")";
    }
}
