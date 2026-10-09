package com.stockbit.feature.cryptoorder.ui.state;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public interface d {

    public static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        public final String f94588a;

        /* renamed from: b, reason: collision with root package name */
        public final String f94589b;

        /* renamed from: c, reason: collision with root package name */
        public final String f94590c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f94591e;

        /* renamed from: f, reason: collision with root package name */
        public final String f94592f;

        /* renamed from: g, reason: collision with root package name */
        public final String f94593g;

        static {
        }

        public a(String r2, String r3, String r4, String r5, String r6, String r7, String r8) {
            p.l(r2, "matchTime");
            p.l(r3, FirebaseAnalytics.Param.PRICE);
            p.l(r4, FirebaseAnalytics.Param.QUANTITY);
            p.l(r5, "gross");
            p.l(r6, "exchangeFee");
            p.l(r7, "cfxFee");
            p.l(r8, "net");
            this.f94588a = r2;
            this.f94589b = r3;
            this.f94590c = r4;
            this.d = r5;
            this.f94591e = r6;
            this.f94592f = r7;
            this.f94593g = r8;
        }

        public String a() {
            return this.f94592f;
        }

        public String b() {
            return this.f94591e;
        }

        public String c() {
            return this.d;
        }

        public String d() {
            return this.f94588a;
        }

        public String e() {
            return this.f94593g;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f94588a, r52.f94588a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f94589b, r52.f94589b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f94590c, r52.f94590c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (p.g(this.f94591e, r52.f94591e) == true) goto L24;
            return false;
        L24:
            if (p.g(this.f94592f, r52.f94592f) == true) goto L27;
            return false;
        L27:
            if (p.g(this.f94593g, r52.f94593g) == true) goto L29;
            return false;
        L29:
            return true;
        }

        public String f() {
            return this.f94589b;
        }

        public String g() {
            return this.f94590c;
        }

        public int hashCode() {
            return (((((((((((this.f94588a.hashCode() * 31) + this.f94589b.hashCode()) * 31) + this.f94590c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f94591e.hashCode()) * 31) + this.f94592f.hashCode()) * 31) + this.f94593g.hashCode();
        }

        public String toString() {
            return "Buy(matchTime=" + this.f94588a + ", price=" + this.f94589b + ", quantity=" + this.f94590c + ", gross=" + this.d + ", exchangeFee=" + this.f94591e + ", cfxFee=" + this.f94592f + ", net=" + this.f94593g + ')';
        }
    }

    public static final class b implements d {

        /* renamed from: a, reason: collision with root package name */
        public final String f94594a;

        /* renamed from: b, reason: collision with root package name */
        public final String f94595b;

        /* renamed from: c, reason: collision with root package name */
        public final String f94596c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f94597e;

        /* renamed from: f, reason: collision with root package name */
        public final String f94598f;

        /* renamed from: g, reason: collision with root package name */
        public final String f94599g;

        /* renamed from: h, reason: collision with root package name */
        public final String f94600h;

        /* renamed from: i, reason: collision with root package name */
        public final String f94601i;

        /* renamed from: j, reason: collision with root package name */
        public final String f94602j;

        /* renamed from: k, reason: collision with root package name */
        public final CryptoOrderStatusColorTone f94603k;

        static {
        }

        public b(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, CryptoOrderStatusColorTone r12) {
            p.l(r2, "matchTime");
            p.l(r3, FirebaseAnalytics.Param.PRICE);
            p.l(r4, FirebaseAnalytics.Param.QUANTITY);
            p.l(r5, "gross");
            p.l(r6, "exchangeFee");
            p.l(r7, "cfxFee");
            p.l(r8, FirebaseAnalytics.Param.TAX);
            p.l(r9, "net");
            p.l(r10, "realizedGain");
            p.l(r11, "realizedGainPct");
            p.l(r12, "realizedGainTone");
            this.f94594a = r2;
            this.f94595b = r3;
            this.f94596c = r4;
            this.d = r5;
            this.f94597e = r6;
            this.f94598f = r7;
            this.f94599g = r8;
            this.f94600h = r9;
            this.f94601i = r10;
            this.f94602j = r11;
            this.f94603k = r12;
        }

        public String a() {
            return this.f94598f;
        }

        public String b() {
            return this.f94597e;
        }

        public String c() {
            return this.d;
        }

        public String d() {
            return this.f94594a;
        }

        public String e() {
            return this.f94600h;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (p.g(this.f94594a, r52.f94594a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f94595b, r52.f94595b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f94596c, r52.f94596c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (p.g(this.f94597e, r52.f94597e) == true) goto L24;
            return false;
        L24:
            if (p.g(this.f94598f, r52.f94598f) == true) goto L27;
            return false;
        L27:
            if (p.g(this.f94599g, r52.f94599g) == true) goto L30;
            return false;
        L30:
            if (p.g(this.f94600h, r52.f94600h) == true) goto L33;
            return false;
        L33:
            if (p.g(this.f94601i, r52.f94601i) == true) goto L36;
            return false;
        L36:
            if (p.g(this.f94602j, r52.f94602j) == true) goto L39;
            return false;
        L39:
            if (this.f94603k == r52.f94603k) goto L41;
            return false;
        L41:
            return true;
        }

        public String f() {
            return this.f94595b;
        }

        public String g() {
            return this.f94596c;
        }

        public final String h() {
            return this.f94601i;
        }

        public int hashCode() {
            return (((((((((((((((((((this.f94594a.hashCode() * 31) + this.f94595b.hashCode()) * 31) + this.f94596c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f94597e.hashCode()) * 31) + this.f94598f.hashCode()) * 31) + this.f94599g.hashCode()) * 31) + this.f94600h.hashCode()) * 31) + this.f94601i.hashCode()) * 31) + this.f94602j.hashCode()) * 31) + this.f94603k.hashCode();
        }

        public final String i() {
            return this.f94602j;
        }

        public final CryptoOrderStatusColorTone j() {
            return this.f94603k;
        }

        public final String k() {
            return this.f94599g;
        }

        public String toString() {
            return "Sell(matchTime=" + this.f94594a + ", price=" + this.f94595b + ", quantity=" + this.f94596c + ", gross=" + this.d + ", exchangeFee=" + this.f94597e + ", cfxFee=" + this.f94598f + ", tax=" + this.f94599g + ", net=" + this.f94600h + ", realizedGain=" + this.f94601i + ", realizedGainPct=" + this.f94602j + ", realizedGainTone=" + this.f94603k + ')';
        }
    }
}
