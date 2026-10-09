package com.stockbit.usecase.chat.model.newchat;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    public final b f155592a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f155593b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f155594c;

    public g(b r2, boolean r3, boolean r4) {
        p.l(r2, "member");
        this.f155592a = r2;
        this.f155593b = r3;
        this.f155594c = r4;
    }

    public static /* synthetic */ g b(g r02, b r1, boolean r2, boolean r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r02.f155592a;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r02.f155593b;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r02.f155594c;
    L12:
        return r02.a(r1, r2, r3);
    }

    public final g a(b r2, boolean r3, boolean r4) {
        p.l(r2, "member");
        return new g(r2, r3, r4);
    }

    public b c() {
        return this.f155592a;
    }

    public final boolean d() {
        return this.f155593b;
    }

    public final boolean e() {
        return this.f155594c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f155592a, r52.f155592a) == true) goto L12;
        return false;
    L12:
        if (this.f155593b == r52.f155593b) goto L15;
        return false;
    L15:
        if (this.f155594c == r52.f155594c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f155592a.hashCode() * 31) + Boolean.hashCode(this.f155593b)) * 31) + Boolean.hashCode(this.f155594c);
    }

    public String toString() {
        return "MemberSelection(member=" + this.f155592a + ", isGroupMember=" + this.f155593b + ", isSelected=" + this.f155594c + ")";
    }

    public /* synthetic */ g(b r14, boolean r15, boolean r16, int r17, i r18) {
        if ((r17 & 1) == 0) goto L5;
        r14 = new b(0, null, null, null, false, 0, false, false, false, 511, null);
    L5:
        boolean r1 = false;
        if ((r17 & 2) == 0) goto L9;
        r15 = false;
    L9:
        if ((r17 & 4) != 0) goto L12;
        r1 = r16;
    L12:
        this(r14, r15, r1);
    }
}
