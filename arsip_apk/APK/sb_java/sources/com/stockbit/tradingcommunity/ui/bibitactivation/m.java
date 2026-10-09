package com.stockbit.tradingcommunity.ui.bibitactivation;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;

/* loaded from: classes11.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final c f149387a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f149388a;

        /* renamed from: b, reason: collision with root package name */
        public final String f149389b;

        /* renamed from: c, reason: collision with root package name */
        public final String f149390c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f149391e;

        /* renamed from: f, reason: collision with root package name */
        public final String f149392f;

        /* renamed from: g, reason: collision with root package name */
        public final int f149393g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f149394h;

        /* renamed from: i, reason: collision with root package name */
        public final String f149395i;

        /* renamed from: j, reason: collision with root package name */
        public final int f149396j;

        public a(boolean r2, String r3, String r4, String r5, String r6, String r7, int r8, boolean r9, String r10) {
            kotlin.jvm.internal.p.l(r3, "tradingCommunityCode");
            kotlin.jvm.internal.p.l(r4, "tradingCommunityName");
            kotlin.jvm.internal.p.l(r5, "leaderUserName");
            kotlin.jvm.internal.p.l(r6, "userName");
            kotlin.jvm.internal.p.l(r7, "userPhoneNumber");
            kotlin.jvm.internal.p.l(r10, "entryPoint");
            this.f149388a = r2;
            this.f149389b = r3;
            this.f149390c = r4;
            this.d = r5;
            this.f149391e = r6;
            this.f149392f = r7;
            this.f149393g = r8;
            this.f149394h = r9;
            this.f149395i = r10;
            this.f149396j = com.stockbit.tradingcommunity.d.f149000i;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("tradingCommunityCode", this.f149389b);
            r02.putString("tradingCommunityName", this.f149390c);
            r02.putString("leaderUserName", this.d);
            r02.putString("userName", this.f149391e);
            r02.putString("userPhoneNumber", this.f149392f);
            r02.putInt("roomId", this.f149393g);
            r02.putBoolean("isExistingMember", this.f149394h);
            r02.putBoolean("isLeaderHasPILicense", this.f149388a);
            r02.putString("entryPoint", this.f149395i);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f149396j;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (this.f149388a == r52.f149388a) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f149389b, r52.f149389b) == true) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f149390c, r52.f149390c) == true) goto L18;
            return false;
        L18:
            if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (kotlin.jvm.internal.p.g(this.f149391e, r52.f149391e) == true) goto L24;
            return false;
        L24:
            if (kotlin.jvm.internal.p.g(this.f149392f, r52.f149392f) == true) goto L27;
            return false;
        L27:
            if (this.f149393g == r52.f149393g) goto L30;
            return false;
        L30:
            if (this.f149394h == r52.f149394h) goto L33;
            return false;
        L33:
            if (kotlin.jvm.internal.p.g(this.f149395i, r52.f149395i) == true) goto L35;
            return false;
        L35:
            return true;
        }

        public int hashCode() {
            return (((((((((((((((Boolean.hashCode(this.f149388a) * 31) + this.f149389b.hashCode()) * 31) + this.f149390c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f149391e.hashCode()) * 31) + this.f149392f.hashCode()) * 31) + Integer.hashCode(this.f149393g)) * 31) + Boolean.hashCode(this.f149394h)) * 31) + this.f149395i.hashCode();
        }

        public String toString() {
            return "ActionTradingCommunityBibitActivationFragmentToSuccessTradingCommunityFragment(isLeaderHasPILicense=" + this.f149388a + ", tradingCommunityCode=" + this.f149389b + ", tradingCommunityName=" + this.f149390c + ", leaderUserName=" + this.d + ", userName=" + this.f149391e + ", userPhoneNumber=" + this.f149392f + ", roomId=" + this.f149393g + ", isExistingMember=" + this.f149394h + ", entryPoint=" + this.f149395i + ')';
        }
    }

    public static final class b implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f149397a;

        /* renamed from: b, reason: collision with root package name */
        public final String f149398b;

        /* renamed from: c, reason: collision with root package name */
        public final String f149399c;
        public final boolean d;

        /* renamed from: e, reason: collision with root package name */
        public final int f149400e;

        public b(String r1, String r2, String r3, boolean r4) {
            this.f149397a = r1;
            this.f149398b = r2;
            this.f149399c = r3;
            this.d = r4;
            this.f149400e = com.stockbit.tradingcommunity.d.f149002j;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("outcomeType", this.f149397a);
            r02.putString("communityName", this.f149398b);
            r02.putString("errorMessage", this.f149399c);
            r02.putBoolean("isExistingMember", this.d);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f149400e;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (kotlin.jvm.internal.p.g(this.f149397a, r52.f149397a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f149398b, r52.f149398b) == true) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f149399c, r52.f149399c) == true) goto L18;
            return false;
        L18:
            if (this.d == r52.d) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            String r02 = this.f149397a;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.f149398b;
            if (r2 != null) goto L9;
            int r22 = 0;
        L10:
            int r05 = (r04 + r22) * 31;
            String r23 = this.f149399c;
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
            return "ActionTradingCommunityBibitActivationFragmentToTradingCommunityOutcomeFragment(outcomeType=" + this.f149397a + ", communityName=" + this.f149398b + ", errorMessage=" + this.f149399c + ", isExistingMember=" + this.d + ')';
        }
    }

    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.i r1) {
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

        public final InterfaceC4081o0 b(String r2, String r3, String r4, boolean r5) {
            return new b(r2, r3, r4, r5);
        }

        public c() {
        }
    }

    static {
        f149387a = new c(null);
    }
}
