package com.stockbit.usecase.trading.community.model;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f163257a;

    /* renamed from: b, reason: collision with root package name */
    public final String f163258b;

    /* renamed from: c, reason: collision with root package name */
    public final int f163259c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final TradingCommunityBibitNextActionType f163260e;

    /* renamed from: f, reason: collision with root package name */
    public final String f163261f;

    /* renamed from: g, reason: collision with root package name */
    public final String f163262g;

    /* renamed from: h, reason: collision with root package name */
    public final String f163263h;

    public c(String r2, String r3, int r4, boolean r5, TradingCommunityBibitNextActionType r6, String r7, String r8, String r9) {
        p.l(r2, "leaderUsername");
        p.l(r3, "communityName");
        p.l(r6, "nextAction");
        p.l(r7, "userName");
        p.l(r8, "userPhoneNumber");
        p.l(r9, "communityCode");
        this.f163257a = r2;
        this.f163258b = r3;
        this.f163259c = r4;
        this.d = r5;
        this.f163260e = r6;
        this.f163261f = r7;
        this.f163262g = r8;
        this.f163263h = r9;
    }

    public final String a() {
        return this.f163263h;
    }

    public final String b() {
        return this.f163258b;
    }

    public final String c() {
        return this.f163257a;
    }

    public final TradingCommunityBibitNextActionType d() {
        return this.f163260e;
    }

    public final int e() {
        return this.f163259c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f163257a, r52.f163257a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f163258b, r52.f163258b) == true) goto L15;
        return false;
    L15:
        if (this.f163259c == r52.f163259c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f163260e == r52.f163260e) goto L24;
        return false;
    L24:
        if (p.g(this.f163261f, r52.f163261f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f163262g, r52.f163262g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f163263h, r52.f163263h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.f163261f;
    }

    public final String g() {
        return this.f163262g;
    }

    public final boolean h() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((((((this.f163257a.hashCode() * 31) + this.f163258b.hashCode()) * 31) + Integer.hashCode(this.f163259c)) * 31) + Boolean.hashCode(this.d)) * 31) + this.f163260e.hashCode()) * 31) + this.f163261f.hashCode()) * 31) + this.f163262g.hashCode()) * 31) + this.f163263h.hashCode();
    }

    public String toString() {
        return "TradingCommunityApplyCodeUIState(leaderUsername=" + this.f163257a + ", communityName=" + this.f163258b + ", roomId=" + this.f163259c + ", isLeaderHasPILicense=" + this.d + ", nextAction=" + this.f163260e + ", userName=" + this.f163261f + ", userPhoneNumber=" + this.f163262g + ", communityCode=" + this.f163263h + ")";
    }

    public /* synthetic */ c(String r3, String r4, int r5, boolean r6, TradingCommunityBibitNextActionType r7, String r8, String r9, String r10, int r11, i r12) {
        if ((r11 & 1) == 0) goto L6;
        r3 = "";
    L6:
        if ((r11 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r11 & 4) == 0) goto L12;
        r5 = 0;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r6 = false;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r7 = TradingCommunityBibitNextActionType.BIBIT_NEXT_ACTION_UNSPECIFIED;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r8 = "";
    L21:
        if ((r11 & 64) == 0) goto L24;
        r9 = "";
    L24:
        if ((r11 & 128) == 0) goto L27;
        String r112 = "";
    L26:
        String r102 = r9;
        String r92 = r8;
        TradingCommunityBibitNextActionType r82 = r7;
        boolean r72 = r6;
        int r62 = r5;
        this(r3, r4, r62, r72, r82, r92, r102, r112);
        return;
    L27:
        r112 = r10;
        goto L26
    }
}
