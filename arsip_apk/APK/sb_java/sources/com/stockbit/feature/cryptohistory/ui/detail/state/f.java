package com.stockbit.feature.cryptohistory.ui.detail.state;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public interface f {

    public static final class a implements f {

        /* renamed from: a, reason: collision with root package name */
        public final String f93793a;

        /* renamed from: b, reason: collision with root package name */
        public final String f93794b;

        /* renamed from: c, reason: collision with root package name */
        public final String f93795c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f93796e;

        /* renamed from: f, reason: collision with root package name */
        public final String f93797f;

        /* renamed from: g, reason: collision with root package name */
        public final String f93798g;

        static {
        }

        public a(String r2, String r3, String r4, String r5, String r6, String r7, String r8) {
            p.l(r2, Constants.KEY_DATE);
            p.l(r3, FirebaseAnalytics.Param.PRICE);
            p.l(r4, "quantityDone");
            p.l(r5, "amount");
            p.l(r6, "exchangeFee");
            p.l(r7, "cfxFee");
            p.l(r8, "netAmount");
            this.f93793a = r2;
            this.f93794b = r3;
            this.f93795c = r4;
            this.d = r5;
            this.f93796e = r6;
            this.f93797f = r7;
            this.f93798g = r8;
        }

        public String a() {
            return this.d;
        }

        public String b() {
            return this.f93797f;
        }

        public String c() {
            return this.f93793a;
        }

        public String d() {
            return this.f93796e;
        }

        public String e() {
            return this.f93798g;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f93793a, r52.f93793a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f93794b, r52.f93794b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f93795c, r52.f93795c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (p.g(this.f93796e, r52.f93796e) == true) goto L24;
            return false;
        L24:
            if (p.g(this.f93797f, r52.f93797f) == true) goto L27;
            return false;
        L27:
            if (p.g(this.f93798g, r52.f93798g) == true) goto L29;
            return false;
        L29:
            return true;
        }

        public String f() {
            return this.f93794b;
        }

        public String g() {
            return this.f93795c;
        }

        public int hashCode() {
            return (((((((((((this.f93793a.hashCode() * 31) + this.f93794b.hashCode()) * 31) + this.f93795c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f93796e.hashCode()) * 31) + this.f93797f.hashCode()) * 31) + this.f93798g.hashCode();
        }

        public String toString() {
            return "BuyLimit(date=" + this.f93793a + ", price=" + this.f93794b + ", quantityDone=" + this.f93795c + ", amount=" + this.d + ", exchangeFee=" + this.f93796e + ", cfxFee=" + this.f93797f + ", netAmount=" + this.f93798g + ')';
        }
    }

    public static final class b implements f {

        /* renamed from: a, reason: collision with root package name */
        public final String f93799a;

        /* renamed from: b, reason: collision with root package name */
        public final String f93800b;

        /* renamed from: c, reason: collision with root package name */
        public final String f93801c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f93802e;

        /* renamed from: f, reason: collision with root package name */
        public final String f93803f;

        /* renamed from: g, reason: collision with root package name */
        public final String f93804g;

        static {
        }

        public b(String r2, String r3, String r4, String r5, String r6, String r7, String r8) {
            p.l(r2, Constants.KEY_DATE);
            p.l(r3, FirebaseAnalytics.Param.PRICE);
            p.l(r4, "quantityDone");
            p.l(r5, "amount");
            p.l(r6, "exchangeFee");
            p.l(r7, "cfxFee");
            p.l(r8, "netAmount");
            this.f93799a = r2;
            this.f93800b = r3;
            this.f93801c = r4;
            this.d = r5;
            this.f93802e = r6;
            this.f93803f = r7;
            this.f93804g = r8;
        }

        public String a() {
            return this.d;
        }

        public String b() {
            return this.f93803f;
        }

        public String c() {
            return this.f93799a;
        }

        public String d() {
            return this.f93802e;
        }

        public String e() {
            return this.f93804g;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (p.g(this.f93799a, r52.f93799a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f93800b, r52.f93800b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f93801c, r52.f93801c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (p.g(this.f93802e, r52.f93802e) == true) goto L24;
            return false;
        L24:
            if (p.g(this.f93803f, r52.f93803f) == true) goto L27;
            return false;
        L27:
            if (p.g(this.f93804g, r52.f93804g) == true) goto L29;
            return false;
        L29:
            return true;
        }

        public String f() {
            return this.f93800b;
        }

        public String g() {
            return this.f93801c;
        }

        public int hashCode() {
            return (((((((((((this.f93799a.hashCode() * 31) + this.f93800b.hashCode()) * 31) + this.f93801c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f93802e.hashCode()) * 31) + this.f93803f.hashCode()) * 31) + this.f93804g.hashCode();
        }

        public String toString() {
            return "BuyMarket(date=" + this.f93799a + ", price=" + this.f93800b + ", quantityDone=" + this.f93801c + ", amount=" + this.d + ", exchangeFee=" + this.f93802e + ", cfxFee=" + this.f93803f + ", netAmount=" + this.f93804g + ')';
        }
    }

    public static final class c implements f {

        /* renamed from: a, reason: collision with root package name */
        public final String f93805a;

        /* renamed from: b, reason: collision with root package name */
        public final String f93806b;

        /* renamed from: c, reason: collision with root package name */
        public final String f93807c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f93808e;

        /* renamed from: f, reason: collision with root package name */
        public final String f93809f;

        /* renamed from: g, reason: collision with root package name */
        public final String f93810g;

        /* renamed from: h, reason: collision with root package name */
        public final String f93811h;

        /* renamed from: i, reason: collision with root package name */
        public final String f93812i;

        /* renamed from: j, reason: collision with root package name */
        public final Boolean f93813j;

        static {
        }

        public c(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, Boolean r11) {
            p.l(r2, Constants.KEY_DATE);
            p.l(r3, FirebaseAnalytics.Param.PRICE);
            p.l(r4, "quantityDone");
            p.l(r5, "amount");
            p.l(r6, "exchangeFee");
            p.l(r7, "cfxFee");
            p.l(r8, FirebaseAnalytics.Param.TAX);
            p.l(r9, "netAmount");
            p.l(r10, "realizedGain");
            this.f93805a = r2;
            this.f93806b = r3;
            this.f93807c = r4;
            this.d = r5;
            this.f93808e = r6;
            this.f93809f = r7;
            this.f93810g = r8;
            this.f93811h = r9;
            this.f93812i = r10;
            this.f93813j = r11;
        }

        public String a() {
            return this.d;
        }

        public String b() {
            return this.f93809f;
        }

        public String c() {
            return this.f93805a;
        }

        public String d() {
            return this.f93808e;
        }

        public String e() {
            return this.f93811h;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (p.g(this.f93805a, r52.f93805a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f93806b, r52.f93806b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f93807c, r52.f93807c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (p.g(this.f93808e, r52.f93808e) == true) goto L24;
            return false;
        L24:
            if (p.g(this.f93809f, r52.f93809f) == true) goto L27;
            return false;
        L27:
            if (p.g(this.f93810g, r52.f93810g) == true) goto L30;
            return false;
        L30:
            if (p.g(this.f93811h, r52.f93811h) == true) goto L33;
            return false;
        L33:
            if (p.g(this.f93812i, r52.f93812i) == true) goto L36;
            return false;
        L36:
            if (p.g(this.f93813j, r52.f93813j) == true) goto L38;
            return false;
        L38:
            return true;
        }

        public String f() {
            return this.f93806b;
        }

        public String g() {
            return this.f93807c;
        }

        public final String h() {
            return this.f93812i;
        }

        public int hashCode() {
            int r02 = ((((((((((((((((this.f93805a.hashCode() * 31) + this.f93806b.hashCode()) * 31) + this.f93807c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f93808e.hashCode()) * 31) + this.f93809f.hashCode()) * 31) + this.f93810g.hashCode()) * 31) + this.f93811h.hashCode()) * 31) + this.f93812i.hashCode()) * 31;
            Boolean r1 = this.f93813j;
            if (r1 != null) goto L5;
            int r12 = 0;
        L7:
            return r02 + r12;
        L5:
            r12 = r1.hashCode();
            goto L7
        }

        public final String i() {
            return this.f93810g;
        }

        public final Boolean j() {
            return this.f93813j;
        }

        public String toString() {
            return "SellLimit(date=" + this.f93805a + ", price=" + this.f93806b + ", quantityDone=" + this.f93807c + ", amount=" + this.d + ", exchangeFee=" + this.f93808e + ", cfxFee=" + this.f93809f + ", tax=" + this.f93810g + ", netAmount=" + this.f93811h + ", realizedGain=" + this.f93812i + ", isRealizedGainPositive=" + this.f93813j + ')';
        }
    }

    public static final class d implements f {

        /* renamed from: a, reason: collision with root package name */
        public final String f93814a;

        /* renamed from: b, reason: collision with root package name */
        public final String f93815b;

        /* renamed from: c, reason: collision with root package name */
        public final String f93816c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f93817e;

        /* renamed from: f, reason: collision with root package name */
        public final String f93818f;

        /* renamed from: g, reason: collision with root package name */
        public final String f93819g;

        /* renamed from: h, reason: collision with root package name */
        public final String f93820h;

        /* renamed from: i, reason: collision with root package name */
        public final String f93821i;

        /* renamed from: j, reason: collision with root package name */
        public final Boolean f93822j;

        static {
        }

        public d(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, Boolean r11) {
            p.l(r2, Constants.KEY_DATE);
            p.l(r3, FirebaseAnalytics.Param.PRICE);
            p.l(r4, "quantityDone");
            p.l(r5, "amount");
            p.l(r6, "exchangeFee");
            p.l(r7, "cfxFee");
            p.l(r8, FirebaseAnalytics.Param.TAX);
            p.l(r9, "netAmount");
            p.l(r10, "realizedGain");
            this.f93814a = r2;
            this.f93815b = r3;
            this.f93816c = r4;
            this.d = r5;
            this.f93817e = r6;
            this.f93818f = r7;
            this.f93819g = r8;
            this.f93820h = r9;
            this.f93821i = r10;
            this.f93822j = r11;
        }

        public String a() {
            return this.d;
        }

        public String b() {
            return this.f93818f;
        }

        public String c() {
            return this.f93814a;
        }

        public String d() {
            return this.f93817e;
        }

        public String e() {
            return this.f93820h;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof d) == true) goto L8;
            return false;
        L8:
            d r52 = (d) r5;
            if (p.g(this.f93814a, r52.f93814a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f93815b, r52.f93815b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f93816c, r52.f93816c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (p.g(this.f93817e, r52.f93817e) == true) goto L24;
            return false;
        L24:
            if (p.g(this.f93818f, r52.f93818f) == true) goto L27;
            return false;
        L27:
            if (p.g(this.f93819g, r52.f93819g) == true) goto L30;
            return false;
        L30:
            if (p.g(this.f93820h, r52.f93820h) == true) goto L33;
            return false;
        L33:
            if (p.g(this.f93821i, r52.f93821i) == true) goto L36;
            return false;
        L36:
            if (p.g(this.f93822j, r52.f93822j) == true) goto L38;
            return false;
        L38:
            return true;
        }

        public String f() {
            return this.f93815b;
        }

        public String g() {
            return this.f93816c;
        }

        public final String h() {
            return this.f93821i;
        }

        public int hashCode() {
            int r02 = ((((((((((((((((this.f93814a.hashCode() * 31) + this.f93815b.hashCode()) * 31) + this.f93816c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f93817e.hashCode()) * 31) + this.f93818f.hashCode()) * 31) + this.f93819g.hashCode()) * 31) + this.f93820h.hashCode()) * 31) + this.f93821i.hashCode()) * 31;
            Boolean r1 = this.f93822j;
            if (r1 != null) goto L5;
            int r12 = 0;
        L7:
            return r02 + r12;
        L5:
            r12 = r1.hashCode();
            goto L7
        }

        public final String i() {
            return this.f93819g;
        }

        public final Boolean j() {
            return this.f93822j;
        }

        public String toString() {
            return "SellMarket(date=" + this.f93814a + ", price=" + this.f93815b + ", quantityDone=" + this.f93816c + ", amount=" + this.d + ", exchangeFee=" + this.f93817e + ", cfxFee=" + this.f93818f + ", tax=" + this.f93819g + ", netAmount=" + this.f93820h + ", realizedGain=" + this.f93821i + ", isRealizedGainPositive=" + this.f93822j + ')';
        }
    }
}
