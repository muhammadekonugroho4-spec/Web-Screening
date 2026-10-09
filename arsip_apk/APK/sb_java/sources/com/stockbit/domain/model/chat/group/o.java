package com.stockbit.domain.model.chat.group;

import com.stockbit.domain.model.chat.user.MemberEntity;

/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final MemberEntity f81241a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f81242b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f81243c;

    public o(MemberEntity r2, boolean r3, boolean r4) {
        kotlin.jvm.internal.p.l(r2, "memberInfo");
        this.f81241a = r2;
        this.f81242b = r3;
        this.f81243c = r4;
    }

    public static /* synthetic */ o b(o r02, MemberEntity r1, boolean r2, boolean r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r02.f81241a;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r02.f81242b;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r02.f81243c;
    L12:
        return r02.a(r1, r2, r3);
    }

    public final o a(MemberEntity r2, boolean r3, boolean r4) {
        kotlin.jvm.internal.p.l(r2, "memberInfo");
        return new o(r2, r3, r4);
    }

    public final MemberEntity c() {
        return this.f81241a;
    }

    public final boolean d() {
        return this.f81242b;
    }

    public final boolean e() {
        return this.f81243c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof o) == true) goto L8;
        return false;
    L8:
        o r52 = (o) r5;
        if (kotlin.jvm.internal.p.g(this.f81241a, r52.f81241a) == true) goto L12;
        return false;
    L12:
        if (this.f81242b == r52.f81242b) goto L15;
        return false;
    L15:
        if (this.f81243c == r52.f81243c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f81241a.hashCode() * 31) + Boolean.hashCode(this.f81242b)) * 31) + Boolean.hashCode(this.f81243c);
    }

    public String toString() {
        return "MemberUserEntity(memberInfo=" + this.f81241a + ", isGroupMember=" + this.f81242b + ", isInviteable=" + this.f81243c + ")";
    }

    public /* synthetic */ o(MemberEntity r20, boolean r21, boolean r22, int r23, kotlin.jvm.internal.i r24) {
        if ((r23 & 1) == 0) goto L5;
        MemberEntity r1 = new MemberEntity(0, null, null, null, false, false, false, false, false, 0, 0, false, false, 0, null, 32767, null);
    L6:
        boolean r2 = false;
        if ((r23 & 2) == 0) goto L9;
        boolean r02 = false;
    L11:
        if ((r23 & 4) != 0) goto L14;
        r2 = r22;
    L14:
        this(r1, r02, r2);
        return;
    L9:
        r02 = r21;
        goto L11
    L5:
        r1 = r20;
        goto L6
    }
}
