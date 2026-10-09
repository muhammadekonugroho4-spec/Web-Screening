package com.stockbit.tradingcommunity.ui.input;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;

/* loaded from: classes11.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final d f149647a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f149648a;

        /* renamed from: b, reason: collision with root package name */
        public final String f149649b;

        /* renamed from: c, reason: collision with root package name */
        public final String f149650c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f149651e;

        /* renamed from: f, reason: collision with root package name */
        public final String f149652f;

        /* renamed from: g, reason: collision with root package name */
        public final int f149653g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f149654h;

        /* renamed from: i, reason: collision with root package name */
        public final String f149655i;

        /* renamed from: j, reason: collision with root package name */
        public final int f149656j;

        public a(boolean r2, String r3, String r4, String r5, String r6, String r7, int r8, boolean r9, String r10) {
            kotlin.jvm.internal.p.l(r3, "tradingCommunityCode");
            kotlin.jvm.internal.p.l(r4, "tradingCommunityName");
            kotlin.jvm.internal.p.l(r5, "leaderUserName");
            kotlin.jvm.internal.p.l(r6, "userName");
            kotlin.jvm.internal.p.l(r7, "userPhoneNumber");
            kotlin.jvm.internal.p.l(r10, "entryPoint");
            this.f149648a = r2;
            this.f149649b = r3;
            this.f149650c = r4;
            this.d = r5;
            this.f149651e = r6;
            this.f149652f = r7;
            this.f149653g = r8;
            this.f149654h = r9;
            this.f149655i = r10;
            this.f149656j = com.stockbit.tradingcommunity.d.f148989c;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("tradingCommunityCode", this.f149649b);
            r02.putString("tradingCommunityName", this.f149650c);
            r02.putString("leaderUserName", this.d);
            r02.putString("userName", this.f149651e);
            r02.putString("userPhoneNumber", this.f149652f);
            r02.putInt("roomId", this.f149653g);
            r02.putBoolean("isExistingMember", this.f149654h);
            r02.putBoolean("isLeaderHasPILicense", this.f149648a);
            r02.putString("entryPoint", this.f149655i);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f149656j;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (this.f149648a == r52.f149648a) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f149649b, r52.f149649b) == true) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f149650c, r52.f149650c) == true) goto L18;
            return false;
        L18:
            if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (kotlin.jvm.internal.p.g(this.f149651e, r52.f149651e) == true) goto L24;
            return false;
        L24:
            if (kotlin.jvm.internal.p.g(this.f149652f, r52.f149652f) == true) goto L27;
            return false;
        L27:
            if (this.f149653g == r52.f149653g) goto L30;
            return false;
        L30:
            if (this.f149654h == r52.f149654h) goto L33;
            return false;
        L33:
            if (kotlin.jvm.internal.p.g(this.f149655i, r52.f149655i) == true) goto L35;
            return false;
        L35:
            return true;
        }

        public int hashCode() {
            return (((((((((((((((Boolean.hashCode(this.f149648a) * 31) + this.f149649b.hashCode()) * 31) + this.f149650c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f149651e.hashCode()) * 31) + this.f149652f.hashCode()) * 31) + Integer.hashCode(this.f149653g)) * 31) + Boolean.hashCode(this.f149654h)) * 31) + this.f149655i.hashCode();
        }

        public String toString() {
            return "ActionInputCommunityCodeFragmentToSuccessTradingCommunityFragment(isLeaderHasPILicense=" + this.f149648a + ", tradingCommunityCode=" + this.f149649b + ", tradingCommunityName=" + this.f149650c + ", leaderUserName=" + this.d + ", userName=" + this.f149651e + ", userPhoneNumber=" + this.f149652f + ", roomId=" + this.f149653g + ", isExistingMember=" + this.f149654h + ", entryPoint=" + this.f149655i + ')';
        }
    }

    public static final class b implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f149657a;

        /* renamed from: b, reason: collision with root package name */
        public final String f149658b;

        /* renamed from: c, reason: collision with root package name */
        public final String f149659c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f149660e;

        /* renamed from: f, reason: collision with root package name */
        public final String f149661f;

        /* renamed from: g, reason: collision with root package name */
        public final int f149662g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f149663h;

        /* renamed from: i, reason: collision with root package name */
        public final String f149664i;

        /* renamed from: j, reason: collision with root package name */
        public final int f149665j;

        public b(String r2, String r3, String r4, String r5, String r6, String r7, int r8, boolean r9, String r10) {
            kotlin.jvm.internal.p.l(r3, "communityName");
            kotlin.jvm.internal.p.l(r4, "tradingCommunityCode");
            kotlin.jvm.internal.p.l(r5, "leaderUserName");
            kotlin.jvm.internal.p.l(r6, "userName");
            kotlin.jvm.internal.p.l(r7, "userPhoneNumber");
            kotlin.jvm.internal.p.l(r10, "entryPoint");
            this.f149657a = r2;
            this.f149658b = r3;
            this.f149659c = r4;
            this.d = r5;
            this.f149660e = r6;
            this.f149661f = r7;
            this.f149662g = r8;
            this.f149663h = r9;
            this.f149664i = r10;
            this.f149665j = com.stockbit.tradingcommunity.d.d;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("url", this.f149657a);
            r02.putString("communityName", this.f149658b);
            r02.putString("tradingCommunityCode", this.f149659c);
            r02.putString("leaderUserName", this.d);
            r02.putString("userName", this.f149660e);
            r02.putString("userPhoneNumber", this.f149661f);
            r02.putInt("roomId", this.f149662g);
            r02.putBoolean("isExistingMember", this.f149663h);
            r02.putString("entryPoint", this.f149664i);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f149665j;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (kotlin.jvm.internal.p.g(this.f149657a, r52.f149657a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f149658b, r52.f149658b) == true) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f149659c, r52.f149659c) == true) goto L18;
            return false;
        L18:
            if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (kotlin.jvm.internal.p.g(this.f149660e, r52.f149660e) == true) goto L24;
            return false;
        L24:
            if (kotlin.jvm.internal.p.g(this.f149661f, r52.f149661f) == true) goto L27;
            return false;
        L27:
            if (this.f149662g == r52.f149662g) goto L30;
            return false;
        L30:
            if (this.f149663h == r52.f149663h) goto L33;
            return false;
        L33:
            if (kotlin.jvm.internal.p.g(this.f149664i, r52.f149664i) == true) goto L35;
            return false;
        L35:
            return true;
        }

        public int hashCode() {
            String r02 = this.f149657a;
            if (r02 != null) goto L5;
            int r03 = 0;
        L7:
            return (((((((((((((((r03 * 31) + this.f149658b.hashCode()) * 31) + this.f149659c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f149660e.hashCode()) * 31) + this.f149661f.hashCode()) * 31) + Integer.hashCode(this.f149662g)) * 31) + Boolean.hashCode(this.f149663h)) * 31) + this.f149664i.hashCode();
        L5:
            r03 = r02.hashCode();
            goto L7
        }

        public String toString() {
            return "ActionInputCommunityCodeFragmentToTradingCommunityBibitActivationFragment(url=" + this.f149657a + ", communityName=" + this.f149658b + ", tradingCommunityCode=" + this.f149659c + ", leaderUserName=" + this.d + ", userName=" + this.f149660e + ", userPhoneNumber=" + this.f149661f + ", roomId=" + this.f149662g + ", isExistingMember=" + this.f149663h + ", entryPoint=" + this.f149664i + ')';
        }
    }

    public static final class c implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f149666a;

        /* renamed from: b, reason: collision with root package name */
        public final String f149667b;

        /* renamed from: c, reason: collision with root package name */
        public final String f149668c;
        public final boolean d;

        /* renamed from: e, reason: collision with root package name */
        public final int f149669e;

        public c(String r1, String r2, String r3, boolean r4) {
            this.f149666a = r1;
            this.f149667b = r2;
            this.f149668c = r3;
            this.d = r4;
            this.f149669e = com.stockbit.tradingcommunity.d.f148992e;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("outcomeType", this.f149666a);
            r02.putString("communityName", this.f149667b);
            r02.putString("errorMessage", this.f149668c);
            r02.putBoolean("isExistingMember", this.d);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f149669e;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (kotlin.jvm.internal.p.g(this.f149666a, r52.f149666a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f149667b, r52.f149667b) == true) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f149668c, r52.f149668c) == true) goto L18;
            return false;
        L18:
            if (this.d == r52.d) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            String r02 = this.f149666a;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.f149667b;
            if (r2 != null) goto L9;
            int r22 = 0;
        L10:
            int r05 = (r04 + r22) * 31;
            String r23 = this.f149668c;
            if (r23 == null) goto L15;
            r1 = r23.hashCode();
        L15:
            return ((r05 + r1) * 31) + Boolean.hashCode(this.d);
        L9:
            r22 = r2.hashCode();
            goto L10
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "ActionInputCommunityCodeFragmentToTradingCommunityOutcomeFragment(outcomeType=" + this.f149666a + ", communityName=" + this.f149667b + ", errorMessage=" + this.f149668c + ", isExistingMember=" + this.d + ')';
        }
    }

    public static final class d {
        public /* synthetic */ d(kotlin.jvm.internal.i r1) {
            this();
        }

        public final InterfaceC4081o0 a(boolean r12, String r13, String r14, String r15, String r16, String r17, int r18, boolean r19, String r20) {
            kotlin.jvm.internal.p.l(r13, "tradingCommunityCode");
            kotlin.jvm.internal.p.l(r14, "tradingCommunityName");
            kotlin.jvm.internal.p.l(r15, "leaderUserName");
            kotlin.jvm.internal.p.l(r16, "userName");
            kotlin.jvm.internal.p.l(r17, "userPhoneNumber");
            kotlin.jvm.internal.p.l(r20, "entryPoint");
            return new a(r12, r13, r14, r15, r16, r17, r18, r19, r20);
        }

        public final InterfaceC4081o0 b(String r12, String r13, String r14, String r15, String r16, String r17, int r18, boolean r19, String r20) {
            kotlin.jvm.internal.p.l(r13, "communityName");
            kotlin.jvm.internal.p.l(r14, "tradingCommunityCode");
            kotlin.jvm.internal.p.l(r15, "leaderUserName");
            kotlin.jvm.internal.p.l(r16, "userName");
            kotlin.jvm.internal.p.l(r17, "userPhoneNumber");
            kotlin.jvm.internal.p.l(r20, "entryPoint");
            return new b(r12, r13, r14, r15, r16, r17, r18, r19, r20);
        }

        public final InterfaceC4081o0 c(String r2, String r3, String r4, boolean r5) {
            return new c(r2, r3, r4, r5);
        }

        public d() {
        }
    }

    static {
        f149647a = new d(null);
    }
}
