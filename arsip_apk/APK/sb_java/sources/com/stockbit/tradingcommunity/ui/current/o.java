package com.stockbit.tradingcommunity.ui.current;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;

/* loaded from: classes11.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final c f149518a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f149519a;

        /* renamed from: b, reason: collision with root package name */
        public final String f149520b;

        /* renamed from: c, reason: collision with root package name */
        public final String f149521c;
        public final int d;

        public a(boolean r2, String r3, String r4) {
            kotlin.jvm.internal.p.l(r3, "communityCode");
            kotlin.jvm.internal.p.l(r4, "entryPoint");
            this.f149519a = r2;
            this.f149520b = r3;
            this.f149521c = r4;
            this.d = com.stockbit.tradingcommunity.d.f148985a;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putBoolean("isUserLeaveCommunity", this.f149519a);
            r02.putString("communityCode", this.f149520b);
            r02.putString("entryPoint", this.f149521c);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.d;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (this.f149519a == r52.f149519a) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f149520b, r52.f149520b) == true) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f149521c, r52.f149521c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.f149519a) * 31) + this.f149520b.hashCode()) * 31) + this.f149521c.hashCode();
        }

        public String toString() {
            return "ActionCurrentCommunityFragmentToInputCommunityCodeFragment(isUserLeaveCommunity=" + this.f149519a + ", communityCode=" + this.f149520b + ", entryPoint=" + this.f149521c + ')';
        }
    }

    public static final class b implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f149522a;

        /* renamed from: b, reason: collision with root package name */
        public final String f149523b;

        /* renamed from: c, reason: collision with root package name */
        public final String f149524c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f149525e;

        /* renamed from: f, reason: collision with root package name */
        public final String f149526f;

        /* renamed from: g, reason: collision with root package name */
        public final int f149527g;

        /* renamed from: h, reason: collision with root package name */
        public final String f149528h;

        /* renamed from: i, reason: collision with root package name */
        public final int f149529i;

        public b(String r2, String r3, String r4, String r5, String r6, String r7, int r8, String r9) {
            kotlin.jvm.internal.p.l(r3, "communityName");
            kotlin.jvm.internal.p.l(r4, "tradingCommunityCode");
            kotlin.jvm.internal.p.l(r5, "leaderUserName");
            kotlin.jvm.internal.p.l(r6, "userName");
            kotlin.jvm.internal.p.l(r7, "userPhoneNumber");
            kotlin.jvm.internal.p.l(r9, "entryPoint");
            this.f149522a = r2;
            this.f149523b = r3;
            this.f149524c = r4;
            this.d = r5;
            this.f149525e = r6;
            this.f149526f = r7;
            this.f149527g = r8;
            this.f149528h = r9;
            this.f149529i = com.stockbit.tradingcommunity.d.f148987b;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("url", this.f149522a);
            r02.putString("communityName", this.f149523b);
            r02.putString("tradingCommunityCode", this.f149524c);
            r02.putString("leaderUserName", this.d);
            r02.putString("userName", this.f149525e);
            r02.putString("userPhoneNumber", this.f149526f);
            r02.putInt("roomId", this.f149527g);
            r02.putString("entryPoint", this.f149528h);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f149529i;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (kotlin.jvm.internal.p.g(this.f149522a, r52.f149522a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f149523b, r52.f149523b) == true) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f149524c, r52.f149524c) == true) goto L18;
            return false;
        L18:
            if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (kotlin.jvm.internal.p.g(this.f149525e, r52.f149525e) == true) goto L24;
            return false;
        L24:
            if (kotlin.jvm.internal.p.g(this.f149526f, r52.f149526f) == true) goto L27;
            return false;
        L27:
            if (this.f149527g == r52.f149527g) goto L30;
            return false;
        L30:
            if (kotlin.jvm.internal.p.g(this.f149528h, r52.f149528h) == true) goto L32;
            return false;
        L32:
            return true;
        }

        public int hashCode() {
            String r02 = this.f149522a;
            if (r02 != null) goto L5;
            int r03 = 0;
        L7:
            return (((((((((((((r03 * 31) + this.f149523b.hashCode()) * 31) + this.f149524c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f149525e.hashCode()) * 31) + this.f149526f.hashCode()) * 31) + Integer.hashCode(this.f149527g)) * 31) + this.f149528h.hashCode();
        L5:
            r03 = r02.hashCode();
            goto L7
        }

        public String toString() {
            return "ActionCurrentCommunityFragmentToTradingCommunityExistingMemberTnCFragment(url=" + this.f149522a + ", communityName=" + this.f149523b + ", tradingCommunityCode=" + this.f149524c + ", leaderUserName=" + this.d + ", userName=" + this.f149525e + ", userPhoneNumber=" + this.f149526f + ", roomId=" + this.f149527g + ", entryPoint=" + this.f149528h + ')';
        }
    }

    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.i r1) {
            this();
        }

        public static /* synthetic */ InterfaceC4081o0 b(c r02, boolean r1, String r2, String r3, int r4, Object r5) {
            if ((r4 & 1) == 0) goto L6;
            r1 = false;
        L6:
            if ((r4 & 2) == 0) goto L9;
            r2 = "";
        L9:
            if ((r4 & 4) == 0) goto L12;
            r3 = "SETTINGS";
        L12:
            return r02.a(r1, r2, r3);
        }

        public static /* synthetic */ InterfaceC4081o0 d(c r1, String r2, String r3, String r4, String r5, String r6, String r7, int r8, String r9, int r10, Object r11) {
            if ((r10 & 1) == 0) goto L6;
            r2 = null;
        L6:
            if ((r10 & 2) == 0) goto L9;
            r3 = "";
        L9:
            if ((r10 & 4) == 0) goto L12;
            r4 = "";
        L12:
            if ((r10 & 8) == 0) goto L15;
            r5 = "";
        L15:
            if ((r10 & 16) == 0) goto L18;
            r6 = "";
        L18:
            if ((r10 & 32) == 0) goto L21;
            r7 = "";
        L21:
            if ((r10 & 64) == 0) goto L24;
            r8 = 0;
        L24:
            if ((r10 & 128) == 0) goto L26;
            r9 = "SETTINGS";
        L26:
            int r102 = r8;
            String r112 = r9;
            String r82 = r6;
            String r92 = r7;
            String r62 = r4;
            String r72 = r5;
            return r1.c(r2, r3, r62, r72, r82, r92, r102, r112);
        }

        public final InterfaceC4081o0 a(boolean r2, String r3, String r4) {
            kotlin.jvm.internal.p.l(r3, "communityCode");
            kotlin.jvm.internal.p.l(r4, "entryPoint");
            return new a(r2, r3, r4);
        }

        public final InterfaceC4081o0 c(String r11, String r12, String r13, String r14, String r15, String r16, int r17, String r18) {
            kotlin.jvm.internal.p.l(r12, "communityName");
            kotlin.jvm.internal.p.l(r13, "tradingCommunityCode");
            kotlin.jvm.internal.p.l(r14, "leaderUserName");
            kotlin.jvm.internal.p.l(r15, "userName");
            kotlin.jvm.internal.p.l(r16, "userPhoneNumber");
            kotlin.jvm.internal.p.l(r18, "entryPoint");
            return new b(r11, r12, r13, r14, r15, r16, r17, r18);
        }

        public c() {
        }
    }

    static {
        f149518a = new c(null);
    }
}
