package com.stockbit.domain.model.chat.group;

import java.util.List;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f81205a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81206b;

    /* renamed from: c, reason: collision with root package name */
    public final int f81207c;
    public final List d;

    public d(boolean r2, String r3, int r4, List r5) {
        kotlin.jvm.internal.p.l(r3, "verifiedStatus");
        kotlin.jvm.internal.p.l(r5, "eligibleRequirements");
        this.f81205a = r2;
        this.f81206b = r3;
        this.f81207c = r4;
        this.d = r5;
    }

    public final boolean a() {
        return this.f81205a;
    }

    public final List b() {
        return this.d;
    }

    public final int c() {
        return this.f81207c;
    }

    public final String d() {
        return this.f81206b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (this.f81205a == r52.f81205a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f81206b, r52.f81206b) == true) goto L15;
        return false;
    L15:
        if (this.f81207c == r52.f81207c) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f81205a) * 31) + this.f81206b.hashCode()) * 31) + Integer.hashCode(this.f81207c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "GroupCreateEligibility(canCreateGroup=" + this.f81205a + ", verifiedStatus=" + this.f81206b + ", maxInviteMembers=" + this.f81207c + ", eligibleRequirements=" + this.d + ")";
    }
}
