package com.stockbit.domain.model.chat.group;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final n f81231a;

    /* renamed from: b, reason: collision with root package name */
    public final a f81232b;

    public k(n r2, a r3) {
        kotlin.jvm.internal.p.l(r2, "members");
        kotlin.jvm.internal.p.l(r3, "admins");
        this.f81231a = r2;
        this.f81232b = r3;
    }

    public final a a() {
        return this.f81232b;
    }

    public final n b() {
        return this.f81231a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k) == true) goto L8;
        return false;
    L8:
        k r52 = (k) r5;
        if (kotlin.jvm.internal.p.g(this.f81231a, r52.f81231a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f81232b, r52.f81232b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f81231a.hashCode() * 31) + this.f81232b.hashCode();
    }

    public String toString() {
        return "GroupStatsEntity(members=" + this.f81231a + ", admins=" + this.f81232b + ")";
    }
}
