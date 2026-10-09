package com.stockbit.tradingcommunity.ui.loading;

import android.os.Bundle;
import androidx.navigation.InterfaceC4081o0;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final c f149796a = null;

    public static final class a implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f149797a;

        /* renamed from: b, reason: collision with root package name */
        public final String f149798b;

        /* renamed from: c, reason: collision with root package name */
        public final String f149799c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f149800e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f149801f;

        /* renamed from: g, reason: collision with root package name */
        public final String f149802g;

        /* renamed from: h, reason: collision with root package name */
        public final String f149803h;

        /* renamed from: i, reason: collision with root package name */
        public final String f149804i;

        /* renamed from: j, reason: collision with root package name */
        public final String f149805j;

        /* renamed from: k, reason: collision with root package name */
        public final String f149806k;

        /* renamed from: l, reason: collision with root package name */
        public final String f149807l;

        /* renamed from: m, reason: collision with root package name */
        public final int f149808m;

        public a(boolean r2, String r3, String r4, String r5, String r6, boolean r7, String r8, String r9, String r10, String r11, String r12, String r13) {
            p.l(r3, "communityName");
            p.l(r4, "totalBuy");
            p.l(r5, "totalSell");
            p.l(r6, "leaveDate");
            p.l(r8, "leaderUserName");
            p.l(r9, "leaderFullName");
            p.l(r10, "userName");
            p.l(r11, "userPhoneNumber");
            p.l(r12, "bibitLinkageState");
            p.l(r13, "entryPoint");
            this.f149797a = r2;
            this.f149798b = r3;
            this.f149799c = r4;
            this.d = r5;
            this.f149800e = r6;
            this.f149801f = r7;
            this.f149802g = r8;
            this.f149803h = r9;
            this.f149804i = r10;
            this.f149805j = r11;
            this.f149806k = r12;
            this.f149807l = r13;
            this.f149808m = com.stockbit.tradingcommunity.d.f148994f;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putString("communityName", this.f149798b);
            r02.putString("totalBuy", this.f149799c);
            r02.putString("totalSell", this.d);
            r02.putString("leaveDate", this.f149800e);
            r02.putBoolean("ableToLeave", this.f149801f);
            r02.putString("leaderUserName", this.f149802g);
            r02.putString("leaderFullName", this.f149803h);
            r02.putString("userName", this.f149804i);
            r02.putString("userPhoneNumber", this.f149805j);
            r02.putString("bibitLinkageState", this.f149806k);
            r02.putBoolean("isLeaderHasPILicense", this.f149797a);
            r02.putString("entryPoint", this.f149807l);
            return r02;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public int c() {
            return this.f149808m;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (this.f149797a == r52.f149797a) goto L12;
            return false;
        L12:
            if (p.g(this.f149798b, r52.f149798b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f149799c, r52.f149799c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (p.g(this.f149800e, r52.f149800e) == true) goto L24;
            return false;
        L24:
            if (this.f149801f == r52.f149801f) goto L27;
            return false;
        L27:
            if (p.g(this.f149802g, r52.f149802g) == true) goto L30;
            return false;
        L30:
            if (p.g(this.f149803h, r52.f149803h) == true) goto L33;
            return false;
        L33:
            if (p.g(this.f149804i, r52.f149804i) == true) goto L36;
            return false;
        L36:
            if (p.g(this.f149805j, r52.f149805j) == true) goto L39;
            return false;
        L39:
            if (p.g(this.f149806k, r52.f149806k) == true) goto L42;
            return false;
        L42:
            if (p.g(this.f149807l, r52.f149807l) == true) goto L44;
            return false;
        L44:
            return true;
        }

        public int hashCode() {
            return (((((((((((((((((((((Boolean.hashCode(this.f149797a) * 31) + this.f149798b.hashCode()) * 31) + this.f149799c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f149800e.hashCode()) * 31) + Boolean.hashCode(this.f149801f)) * 31) + this.f149802g.hashCode()) * 31) + this.f149803h.hashCode()) * 31) + this.f149804i.hashCode()) * 31) + this.f149805j.hashCode()) * 31) + this.f149806k.hashCode()) * 31) + this.f149807l.hashCode();
        }

        public String toString() {
            return "ActionLoadingTradingCommunityFragmentToCurrentCommunityFragment(isLeaderHasPILicense=" + this.f149797a + ", communityName=" + this.f149798b + ", totalBuy=" + this.f149799c + ", totalSell=" + this.d + ", leaveDate=" + this.f149800e + ", ableToLeave=" + this.f149801f + ", leaderUserName=" + this.f149802g + ", leaderFullName=" + this.f149803h + ", userName=" + this.f149804i + ", userPhoneNumber=" + this.f149805j + ", bibitLinkageState=" + this.f149806k + ", entryPoint=" + this.f149807l + ')';
        }
    }

    public static final class b implements InterfaceC4081o0 {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f149809a;

        /* renamed from: b, reason: collision with root package name */
        public final String f149810b;

        /* renamed from: c, reason: collision with root package name */
        public final String f149811c;
        public final int d;

        public b(boolean r2, String r3, String r4) {
            p.l(r3, "communityCode");
            p.l(r4, "entryPoint");
            this.f149809a = r2;
            this.f149810b = r3;
            this.f149811c = r4;
            this.d = com.stockbit.tradingcommunity.d.f148996g;
        }

        @Override // androidx.navigation.InterfaceC4081o0
        public Bundle b() {
            Bundle r02 = new Bundle();
            r02.putBoolean("isUserLeaveCommunity", this.f149809a);
            r02.putString("communityCode", this.f149810b);
            r02.putString("entryPoint", this.f149811c);
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
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (this.f149809a == r52.f149809a) goto L12;
            return false;
        L12:
            if (p.g(this.f149810b, r52.f149810b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f149811c, r52.f149811c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.f149809a) * 31) + this.f149810b.hashCode()) * 31) + this.f149811c.hashCode();
        }

        public String toString() {
            return "ActionLoadingTradingCommunityFragmentToInputCommunityCodeFragment(isUserLeaveCommunity=" + this.f149809a + ", communityCode=" + this.f149810b + ", entryPoint=" + this.f149811c + ')';
        }
    }

    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.i r1) {
            this();
        }

        public static /* synthetic */ InterfaceC4081o0 c(c r02, boolean r1, String r2, String r3, int r4, Object r5) {
            if ((r4 & 1) == 0) goto L6;
            r1 = false;
        L6:
            if ((r4 & 2) == 0) goto L9;
            r2 = "";
        L9:
            if ((r4 & 4) == 0) goto L12;
            r3 = "SETTINGS";
        L12:
            return r02.b(r1, r2, r3);
        }

        public final InterfaceC4081o0 a(boolean r15, String r16, String r17, String r18, String r19, boolean r20, String r21, String r22, String r23, String r24, String r25, String r26) {
            p.l(r16, "communityName");
            p.l(r17, "totalBuy");
            p.l(r18, "totalSell");
            p.l(r19, "leaveDate");
            p.l(r21, "leaderUserName");
            p.l(r22, "leaderFullName");
            p.l(r23, "userName");
            p.l(r24, "userPhoneNumber");
            p.l(r25, "bibitLinkageState");
            p.l(r26, "entryPoint");
            return new a(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26);
        }

        public final InterfaceC4081o0 b(boolean r2, String r3, String r4) {
            p.l(r3, "communityCode");
            p.l(r4, "entryPoint");
            return new b(r2, r3, r4);
        }

        public c() {
        }
    }

    static {
        f149796a = new c(null);
    }
}
