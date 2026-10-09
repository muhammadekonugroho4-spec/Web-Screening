package com.stockbit.usecase.chat.model.chat.message;

import com.clevertap.android.sdk.Constants;
import com.stockbit.usecase.chat.model.chat.room.VerifiedStatusType;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f155395a;

    /* renamed from: b, reason: collision with root package name */
    public final int f155396b;

    /* renamed from: c, reason: collision with root package name */
    public final String f155397c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f155398e;

    /* renamed from: f, reason: collision with root package name */
    public final String f155399f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f155400g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f155401h;

    /* renamed from: i, reason: collision with root package name */
    public final VerifiedStatusType f155402i;

    public r(int r2, int r3, String r4, String r5, String r6, String r7, boolean r8, boolean r9, VerifiedStatusType r10) {
        kotlin.jvm.internal.p.l(r4, "username");
        kotlin.jvm.internal.p.l(r5, "fullName");
        kotlin.jvm.internal.p.l(r6, "avatar");
        kotlin.jvm.internal.p.l(r7, Constants.KEY_COLOR);
        kotlin.jvm.internal.p.l(r10, "verifiedStatus");
        this.f155395a = r2;
        this.f155396b = r3;
        this.f155397c = r4;
        this.d = r5;
        this.f155398e = r6;
        this.f155399f = r7;
        this.f155400g = r8;
        this.f155401h = r9;
        this.f155402i = r10;
    }

    public static /* synthetic */ r b(r r02, int r1, int r2, String r3, String r4, String r5, String r6, boolean r7, boolean r8, VerifiedStatusType r9, int r10, Object r11) {
        if ((r10 & 1) == 0) goto L6;
        r1 = r02.f155395a;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r2 = r02.f155396b;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r3 = r02.f155397c;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r5 = r02.f155398e;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r6 = r02.f155399f;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r7 = r02.f155400g;
    L24:
        if ((r10 & 128) == 0) goto L27;
        r8 = r02.f155401h;
    L27:
        if ((r10 & 256) == 0) goto L29;
        r9 = r02.f155402i;
    L29:
        boolean r102 = r8;
        VerifiedStatusType r112 = r9;
        String r82 = r6;
        boolean r92 = r7;
        String r62 = r4;
        String r72 = r5;
        String r52 = r3;
        int r32 = r1;
        return r02.a(r32, r2, r52, r62, r72, r82, r92, r102, r112);
    }

    public final r a(int r12, int r13, String r14, String r15, String r16, String r17, boolean r18, boolean r19, VerifiedStatusType r20) {
        kotlin.jvm.internal.p.l(r14, "username");
        kotlin.jvm.internal.p.l(r15, "fullName");
        kotlin.jvm.internal.p.l(r16, "avatar");
        kotlin.jvm.internal.p.l(r17, Constants.KEY_COLOR);
        kotlin.jvm.internal.p.l(r20, "verifiedStatus");
        return new r(r12, r13, r14, r15, r16, r17, r18, r19, r20);
    }

    public final String c() {
        return this.f155398e;
    }

    public final String d() {
        return this.f155399f;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof r) == true) goto L8;
        return false;
    L8:
        r r52 = (r) r5;
        if (this.f155395a == r52.f155395a) goto L12;
        return false;
    L12:
        if (this.f155396b == r52.f155396b) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f155397c, r52.f155397c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f155398e, r52.f155398e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f155399f, r52.f155399f) == true) goto L27;
        return false;
    L27:
        if (this.f155400g == r52.f155400g) goto L30;
        return false;
    L30:
        if (this.f155401h == r52.f155401h) goto L33;
        return false;
    L33:
        if (this.f155402i == r52.f155402i) goto L35;
        return false;
    L35:
        return true;
    }

    public final int f() {
        return this.f155396b;
    }

    public final int g() {
        return this.f155395a;
    }

    public final String h() {
        return this.f155397c;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.f155395a) * 31) + Integer.hashCode(this.f155396b)) * 31) + this.f155397c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f155398e.hashCode()) * 31) + this.f155399f.hashCode()) * 31) + Boolean.hashCode(this.f155400g)) * 31) + Boolean.hashCode(this.f155401h)) * 31) + this.f155402i.hashCode();
    }

    public final VerifiedStatusType i() {
        return this.f155402i;
    }

    public final boolean j() {
        return this.f155401h;
    }

    public final boolean k() {
        return this.f155400g;
    }

    public String toString() {
        return "MessageSenderUIState(userId=" + this.f155395a + ", memberId=" + this.f155396b + ", username=" + this.f155397c + ", fullName=" + this.d + ", avatar=" + this.f155398e + ", color=" + this.f155399f + ", isVerified=" + this.f155400g + ", isActiveMember=" + this.f155401h + ", verifiedStatus=" + this.f155402i + ")";
    }

    public /* synthetic */ r(int r3, int r4, String r5, String r6, String r7, String r8, boolean r9, boolean r10, VerifiedStatusType r11, int r12, kotlin.jvm.internal.i r13) {
        if ((r12 & 1) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r4 = 0;
    L9:
        if ((r12 & 4) == 0) goto L12;
        r5 = "";
    L12:
        if ((r12 & 8) == 0) goto L15;
        r6 = "";
    L15:
        if ((r12 & 16) == 0) goto L18;
        r7 = "";
    L18:
        if ((r12 & 32) == 0) goto L21;
        r8 = "";
    L21:
        if ((r12 & 64) == 0) goto L24;
        r9 = false;
    L24:
        if ((r12 & 128) == 0) goto L27;
        r10 = false;
    L27:
        if ((r12 & 256) == 0) goto L29;
        r11 = VerifiedStatusType.VERIFIED_STATUS_UNVERIFIED;
    L29:
        VerifiedStatusType r122 = r11;
        boolean r112 = r10;
        boolean r102 = r9;
        String r92 = r8;
        String r82 = r7;
        String r72 = r6;
        String r62 = r5;
        this(r3, r4, r62, r72, r82, r92, r102, r112, r122);
    }
}
