package com.stockbit.domain.model.chat.group;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f81235a;

    /* renamed from: b, reason: collision with root package name */
    public final int f81236b;

    /* renamed from: c, reason: collision with root package name */
    public final int f81237c;
    public final String d;

    public m(int r2, int r3, int r4, String r5) {
        kotlin.jvm.internal.p.l(r5, "verifiedStatus");
        this.f81235a = r2;
        this.f81236b = r3;
        this.f81237c = r4;
        this.d = r5;
    }

    public final int a() {
        return this.f81237c;
    }

    public final int b() {
        return this.f81236b;
    }

    public final int c() {
        return this.f81235a;
    }

    public final String d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof m) == true) goto L8;
        return false;
    L8:
        m r52 = (m) r5;
        if (this.f81235a == r52.f81235a) goto L12;
        return false;
    L12:
        if (this.f81236b == r52.f81236b) goto L15;
        return false;
    L15:
        if (this.f81237c == r52.f81237c) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f81235a) * 31) + Integer.hashCode(this.f81236b)) * 31) + Integer.hashCode(this.f81237c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "MaxGroupMemberEntity(maxMember=" + this.f81235a + ", maxInviteMember=" + this.f81236b + ", maxDailyInviteMember=" + this.f81237c + ", verifiedStatus=" + this.d + ")";
    }
}
