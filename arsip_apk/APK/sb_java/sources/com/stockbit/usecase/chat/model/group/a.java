package com.stockbit.usecase.chat.model.group;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f155534a;

    /* renamed from: b, reason: collision with root package name */
    public final int f155535b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f155536c;
    public final com.stockbit.usecase.chat.model.newchat.b d;

    /* renamed from: e, reason: collision with root package name */
    public final String f155537e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f155538f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f155539g;

    public a(int r1, int r2, boolean r3, com.stockbit.usecase.chat.model.newchat.b r4, String r5, boolean r6, boolean r7) {
        this.f155534a = r1;
        this.f155535b = r2;
        this.f155536c = r3;
        this.d = r4;
        this.f155537e = r5;
        this.f155538f = r6;
        this.f155539g = r7;
    }

    public static /* synthetic */ a b(a r02, int r1, int r2, boolean r3, com.stockbit.usecase.chat.model.newchat.b r4, String r5, boolean r6, boolean r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r02.f155534a;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r02.f155535b;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r02.f155536c;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r02.f155537e;
    L18:
        if ((r8 & 32) == 0) goto L21;
        r6 = r02.f155538f;
    L21:
        if ((r8 & 64) == 0) goto L23;
        r7 = r02.f155539g;
    L23:
        boolean r82 = r6;
        boolean r92 = r7;
        com.stockbit.usecase.chat.model.newchat.b r62 = r4;
        String r72 = r5;
        boolean r52 = r3;
        int r32 = r1;
        return r02.a(r32, r2, r52, r62, r72, r82, r92);
    }

    public final a a(int r9, int r10, boolean r11, com.stockbit.usecase.chat.model.newchat.b r12, String r13, boolean r14, boolean r15) {
        return new a(r9, r10, r11, r12, r13, r14, r15);
    }

    public final int c() {
        return this.f155534a;
    }

    public final com.stockbit.usecase.chat.model.newchat.b d() {
        return this.d;
    }

    public final int e() {
        return this.f155535b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f155534a == r52.f155534a) goto L12;
        return false;
    L12:
        if (this.f155535b == r52.f155535b) goto L15;
        return false;
    L15:
        if (this.f155536c == r52.f155536c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f155537e, r52.f155537e) == true) goto L24;
        return false;
    L24:
        if (this.f155538f == r52.f155538f) goto L27;
        return false;
    L27:
        if (this.f155539g == r52.f155539g) goto L29;
        return false;
    L29:
        return true;
    }

    public final boolean f() {
        return this.f155536c;
    }

    public final boolean g() {
        return this.f155539g;
    }

    public final boolean h() {
        return this.f155538f;
    }

    public int hashCode() {
        int r02 = ((((Integer.hashCode(this.f155534a) * 31) + Integer.hashCode(this.f155535b)) * 31) + Boolean.hashCode(this.f155536c)) * 31;
        com.stockbit.usecase.chat.model.newchat.b r1 = this.d;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f155537e;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return ((((r03 + r2) * 31) + Boolean.hashCode(this.f155538f)) * 31) + Boolean.hashCode(this.f155539g);
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "ChooseGroupMemberUIState(groupId=" + this.f155534a + ", roomId=" + this.f155535b + ", isGroupAdmin=" + this.f155536c + ", memberData=" + this.d + ", from=" + this.f155537e + ", isInteractable=" + this.f155538f + ", isGroupRoomAccepted=" + this.f155539g + ")";
    }

    public /* synthetic */ a(int r3, int r4, boolean r5, com.stockbit.usecase.chat.model.newchat.b r6, String r7, boolean r8, boolean r9, int r10, i r11) {
        if ((r10 & 1) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r4 = 0;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r5 = false;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r6 = null;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r7 = null;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r8 = false;
    L21:
        if ((r10 & 64) == 0) goto L24;
        boolean r102 = false;
    L23:
        boolean r92 = r8;
        String r82 = r7;
        com.stockbit.usecase.chat.model.newchat.b r72 = r6;
        boolean r62 = r5;
        this(r3, r4, r62, r72, r82, r92, r102);
        return;
    L24:
        r102 = r9;
        goto L23
    }
}
