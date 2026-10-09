package com.stockbit.tradingcommunity.ui.tnc;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;

/* loaded from: classes11.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final c f149962a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f149963a;

        /* renamed from: b, reason: collision with root package name */
        public final String f149964b;

        /* renamed from: c, reason: collision with root package name */
        public final String f149965c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f149966e;

        /* renamed from: f, reason: collision with root package name */
        public final String f149967f;

        /* renamed from: g, reason: collision with root package name */
        public final int f149968g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f149969h;

        /* renamed from: i, reason: collision with root package name */
        public final String f149970i;

        /* renamed from: j, reason: collision with root package name */
        public final int f149971j;

        public a(String r2, String r3, String r4, String r5, String r6, String r7, int r8, boolean r9, String r10) {
            kotlin.jvm.internal.p.l(r3, "communityName");
            kotlin.jvm.internal.p.l(r4, "tradingCommunityCode");
            kotlin.jvm.internal.p.l(r5, "leaderUserName");
            kotlin.jvm.internal.p.l(r6, "userName");
            kotlin.jvm.internal.p.l(r7, "userPhoneNumber");
            kotlin.jvm.internal.p.l(r10, "entryPoint");
            this.f149963a = r2;
            this.f149964b = r3;
            this.f149965c = r4;
            this.d = r5;
            this.f149966e = r6;
            this.f149967f = r7;
            this.f149968g = r8;
            this.f149969h = r9;
            this.f149970i = r10;
            this.f149971j = com.stockbit.tradingcommunity.d.f149004k;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("url", this.f149963a);
            r02.putString("communityName", this.f149964b);
            r02.putString("tradingCommunityCode", this.f149965c);
            r02.putString("leaderUserName", this.d);
            r02.putString("userName", this.f149966e);
            r02.putString("userPhoneNumber", this.f149967f);
            r02.putInt("roomId", this.f149968g);
            r02.putBoolean("isExistingMember", this.f149969h);
            r02.putString("entryPoint", this.f149970i);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f149971j;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (kotlin.jvm.internal.p.g(this.f149963a, r52.f149963a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f149964b, r52.f149964b) == true) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f149965c, r52.f149965c) == true) goto L18;
            return false;
        L18:
            if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (kotlin.jvm.internal.p.g(this.f149966e, r52.f149966e) == true) goto L24;
            return false;
        L24:
            if (kotlin.jvm.internal.p.g(this.f149967f, r52.f149967f) == true) goto L27;
            return false;
        L27:
            if (this.f149968g == r52.f149968g) goto L30;
            return false;
        L30:
            if (this.f149969h == r52.f149969h) goto L33;
            return false;
        L33:
            if (kotlin.jvm.internal.p.g(this.f149970i, r52.f149970i) == true) goto L35;
            return false;
        L35:
            return true;
        }

        public int hashCode() {
            String r02 = this.f149963a;
            if (r02 != null) goto L5;
            int r03 = 0;
        L7:
            return (((((((((((((((r03 * 31) + this.f149964b.hashCode()) * 31) + this.f149965c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f149966e.hashCode()) * 31) + this.f149967f.hashCode()) * 31) + Integer.hashCode(this.f149968g)) * 31) + Boolean.hashCode(this.f149969h)) * 31) + this.f149970i.hashCode();
        L5:
            r03 = r02.hashCode();
            goto L7
        }

        public String toString() {
            return "ActionTradingCommunityExistingMemberTnCFragmentToTradingCommunityBibitActivationFragment(url=" + this.f149963a + ", communityName=" + this.f149964b + ", tradingCommunityCode=" + this.f149965c + ", leaderUserName=" + this.d + ", userName=" + this.f149966e + ", userPhoneNumber=" + this.f149967f + ", roomId=" + this.f149968g + ", isExistingMember=" + this.f149969h + ", entryPoint=" + this.f149970i + ')';
        }
    }

    public static final class b implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final String f149972a;

        /* renamed from: b, reason: collision with root package name */
        public final String f149973b;

        /* renamed from: c, reason: collision with root package name */
        public final String f149974c;
        public final boolean d;

        /* renamed from: e, reason: collision with root package name */
        public final int f149975e;

        public b(String r1, String r2, String r3, boolean r4) {
            this.f149972a = r1;
            this.f149973b = r2;
            this.f149974c = r3;
            this.d = r4;
            this.f149975e = com.stockbit.tradingcommunity.d.f149006l;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("outcomeType", this.f149972a);
            r02.putString("communityName", this.f149973b);
            r02.putString("errorMessage", this.f149974c);
            r02.putBoolean("isExistingMember", this.d);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f149975e;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (kotlin.jvm.internal.p.g(this.f149972a, r52.f149972a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f149973b, r52.f149973b) == true) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f149974c, r52.f149974c) == true) goto L18;
            return false;
        L18:
            if (this.d == r52.d) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            String r02 = this.f149972a;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.f149973b;
            if (r2 != null) goto L9;
            int r22 = 0;
        L10:
            int r05 = (r04 + r22) * 31;
            String r23 = this.f149974c;
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
            return "ActionTradingCommunityExistingMemberTnCFragmentToTradingCommunityOutcomeFragment(outcomeType=" + this.f149972a + ", communityName=" + this.f149973b + ", errorMessage=" + this.f149974c + ", isExistingMember=" + this.d + ')';
        }
    }

    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.i r1) {
            this();
        }

        public final InterfaceC4081o0 a(String r12, String r13, String r14, String r15, String r16, String r17, int r18, boolean r19, String r20) {
            kotlin.jvm.internal.p.l(r13, "communityName");
            kotlin.jvm.internal.p.l(r14, "tradingCommunityCode");
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
        f149962a = new c(null);
    }
}
