package com.stockbit.domain.model.chat.group;

import java.util.List;

/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final List f81233a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f81234b;

    public l(List r2, boolean r3) {
        kotlin.jvm.internal.p.l(r2, "members");
        this.f81233a = r2;
        this.f81234b = r3;
    }

    public final List a() {
        return this.f81233a;
    }

    public final boolean b() {
        return this.f81234b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof l) == true) goto L8;
        return false;
    L8:
        l r52 = (l) r5;
        if (kotlin.jvm.internal.p.g(this.f81233a, r52.f81233a) == true) goto L12;
        return false;
    L12:
        if (this.f81234b == r52.f81234b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f81233a.hashCode() * 31) + Boolean.hashCode(this.f81234b);
    }

    public String toString() {
        return "ListGroupMemberEntity(members=" + this.f81233a + ", isMore=" + this.f81234b + ")";
    }
}
