package com.stockbit.domain.model.chat.group;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final r f81203a;

    /* renamed from: b, reason: collision with root package name */
    public final s f81204b;

    public c(r r2, s r3) {
        kotlin.jvm.internal.p.l(r2, "private");
        kotlin.jvm.internal.p.l(r3, "public");
        this.f81203a = r2;
        this.f81204b = r3;
    }

    public final r a() {
        return this.f81203a;
    }

    public final s b() {
        return this.f81204b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (kotlin.jvm.internal.p.g(this.f81203a, r52.f81203a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f81204b, r52.f81204b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f81203a.hashCode() * 31) + this.f81204b.hashCode();
    }

    public String toString() {
        return "GroupAttributeEntity(private=" + this.f81203a + ", public=" + this.f81204b + ")";
    }
}
