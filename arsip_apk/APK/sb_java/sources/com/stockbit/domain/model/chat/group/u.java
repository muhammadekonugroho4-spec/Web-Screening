package com.stockbit.domain.model.chat.group;

import java.util.List;

/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final List f81250a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81251b;

    public u(List r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "members");
        kotlin.jvm.internal.p.l(r3, "cursor");
        this.f81250a = r2;
        this.f81251b = r3;
    }

    public final String a() {
        return this.f81251b;
    }

    public final List b() {
        return this.f81250a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof u) == true) goto L8;
        return false;
    L8:
        u r52 = (u) r5;
        if (kotlin.jvm.internal.p.g(this.f81250a, r52.f81250a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f81251b, r52.f81251b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f81250a.hashCode() * 31) + this.f81251b.hashCode();
    }

    public String toString() {
        return "SuggestedContactsEntity(members=" + this.f81250a + ", cursor=" + this.f81251b + ")";
    }
}
