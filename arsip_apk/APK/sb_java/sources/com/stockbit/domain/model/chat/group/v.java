package com.stockbit.domain.model.chat.group;

import java.util.List;

/* loaded from: classes8.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final List f81252a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f81253b;

    public v(List r2, boolean r3) {
        kotlin.jvm.internal.p.l(r2, "members");
        this.f81252a = r2;
        this.f81253b = r3;
    }

    public final List a() {
        return this.f81252a;
    }

    public final boolean b() {
        return this.f81253b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof v) == true) goto L8;
        return false;
    L8:
        v r52 = (v) r5;
        if (kotlin.jvm.internal.p.g(this.f81252a, r52.f81252a) == true) goto L12;
        return false;
    L12:
        if (this.f81253b == r52.f81253b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f81252a.hashCode() * 31) + Boolean.hashCode(this.f81253b);
    }

    public String toString() {
        return "SuggestedMembersEntity(members=" + this.f81252a + ", isMore=" + this.f81253b + ")";
    }
}
