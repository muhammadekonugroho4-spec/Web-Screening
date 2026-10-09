package com.stockbit.usecase.securities.model.history;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes2.dex */
public interface a {

    /* renamed from: com.stockbit.usecase.securities.model.history.a$a, reason: collision with other inner class name */
    public static final class C1622a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f160631a;

        /* renamed from: b, reason: collision with root package name */
        public final String f160632b;

        /* renamed from: c, reason: collision with root package name */
        public final String f160633c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f160634e;

        /* renamed from: f, reason: collision with root package name */
        public final String f160635f;

        /* renamed from: g, reason: collision with root package name */
        public final String f160636g;

        /* renamed from: h, reason: collision with root package name */
        public final String f160637h;

        /* renamed from: i, reason: collision with root package name */
        public final String f160638i;

        public C1622a(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10) {
            kotlin.jvm.internal.p.l(r2, "symbol");
            kotlin.jvm.internal.p.l(r3, "displayAs");
            kotlin.jvm.internal.p.l(r4, Constants.KEY_DATE);
            kotlin.jvm.internal.p.l(r5, "sharesFormatted");
            kotlin.jvm.internal.p.l(r6, "amountFormatted");
            kotlin.jvm.internal.p.l(r7, "ratio");
            kotlin.jvm.internal.p.l(r8, "bonusSharesFormatted");
            kotlin.jvm.internal.p.l(r9, "closingPriceDate");
            kotlin.jvm.internal.p.l(r10, "closingPriceFormatted");
            this.f160631a = r2;
            this.f160632b = r3;
            this.f160633c = r4;
            this.d = r5;
            this.f160634e = r6;
            this.f160635f = r7;
            this.f160636g = r8;
            this.f160637h = r9;
            this.f160638i = r10;
        }

        public String a() {
            return this.f160634e;
        }

        public final String b() {
            return this.f160636g;
        }

        public final String c() {
            return this.f160637h;
        }

        public final String d() {
            return this.f160638i;
        }

        public String e() {
            return this.f160633c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C1622a) == true) goto L8;
            return false;
        L8:
            C1622a r52 = (C1622a) r5;
            if (kotlin.jvm.internal.p.g(this.f160631a, r52.f160631a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f160632b, r52.f160632b) == true) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f160633c, r52.f160633c) == true) goto L18;
            return false;
        L18:
            if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (kotlin.jvm.internal.p.g(this.f160634e, r52.f160634e) == true) goto L24;
            return false;
        L24:
            if (kotlin.jvm.internal.p.g(this.f160635f, r52.f160635f) == true) goto L27;
            return false;
        L27:
            if (kotlin.jvm.internal.p.g(this.f160636g, r52.f160636g) == true) goto L30;
            return false;
        L30:
            if (kotlin.jvm.internal.p.g(this.f160637h, r52.f160637h) == true) goto L33;
            return false;
        L33:
            if (kotlin.jvm.internal.p.g(this.f160638i, r52.f160638i) == true) goto L35;
            return false;
        L35:
            return true;
        }

        public String f() {
            return this.f160632b;
        }

        public final String g() {
            return this.f160635f;
        }

        public String h() {
            return this.d;
        }

        public int hashCode() {
            return (((((((((((((((this.f160631a.hashCode() * 31) + this.f160632b.hashCode()) * 31) + this.f160633c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f160634e.hashCode()) * 31) + this.f160635f.hashCode()) * 31) + this.f160636g.hashCode()) * 31) + this.f160637h.hashCode()) * 31) + this.f160638i.hashCode();
        }

        public String i() {
            return this.f160631a;
        }

        public String toString() {
            return "BonusStock(symbol=" + this.f160631a + ", displayAs=" + this.f160632b + ", date=" + this.f160633c + ", sharesFormatted=" + this.d + ", amountFormatted=" + this.f160634e + ", ratio=" + this.f160635f + ", bonusSharesFormatted=" + this.f160636g + ", closingPriceDate=" + this.f160637h + ", closingPriceFormatted=" + this.f160638i + ")";
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f160639a;

        /* renamed from: b, reason: collision with root package name */
        public final String f160640b;

        /* renamed from: c, reason: collision with root package name */
        public final String f160641c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f160642e;

        /* renamed from: f, reason: collision with root package name */
        public final String f160643f;

        /* renamed from: g, reason: collision with root package name */
        public final String f160644g;

        public b(String r2, String r3, String r4, String r5, String r6, String r7, String r8) {
            kotlin.jvm.internal.p.l(r2, "symbol");
            kotlin.jvm.internal.p.l(r3, "displayAs");
            kotlin.jvm.internal.p.l(r4, Constants.KEY_DATE);
            kotlin.jvm.internal.p.l(r5, "sharesFormatted");
            kotlin.jvm.internal.p.l(r6, "amountFormatted");
            kotlin.jvm.internal.p.l(r7, "type");
            kotlin.jvm.internal.p.l(r8, "dividendPerShare");
            this.f160639a = r2;
            this.f160640b = r3;
            this.f160641c = r4;
            this.d = r5;
            this.f160642e = r6;
            this.f160643f = r7;
            this.f160644g = r8;
        }

        public String a() {
            return this.f160642e;
        }

        public String b() {
            return this.f160641c;
        }

        public String c() {
            return this.f160640b;
        }

        public final String d() {
            return this.f160644g;
        }

        public String e() {
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
            if (kotlin.jvm.internal.p.g(this.f160639a, r52.f160639a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f160640b, r52.f160640b) == true) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f160641c, r52.f160641c) == true) goto L18;
            return false;
        L18:
            if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (kotlin.jvm.internal.p.g(this.f160642e, r52.f160642e) == true) goto L24;
            return false;
        L24:
            if (kotlin.jvm.internal.p.g(this.f160643f, r52.f160643f) == true) goto L27;
            return false;
        L27:
            if (kotlin.jvm.internal.p.g(this.f160644g, r52.f160644g) == true) goto L29;
            return false;
        L29:
            return true;
        }

        public String f() {
            return this.f160639a;
        }

        public final String g() {
            return this.f160643f;
        }

        public int hashCode() {
            return (((((((((((this.f160639a.hashCode() * 31) + this.f160640b.hashCode()) * 31) + this.f160641c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f160642e.hashCode()) * 31) + this.f160643f.hashCode()) * 31) + this.f160644g.hashCode();
        }

        public String toString() {
            return "Cash(symbol=" + this.f160639a + ", displayAs=" + this.f160640b + ", date=" + this.f160641c + ", sharesFormatted=" + this.d + ", amountFormatted=" + this.f160642e + ", type=" + this.f160643f + ", dividendPerShare=" + this.f160644g + ")";
        }
    }

    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f160645a;

        /* renamed from: b, reason: collision with root package name */
        public final String f160646b;

        /* renamed from: c, reason: collision with root package name */
        public final String f160647c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f160648e;

        /* renamed from: f, reason: collision with root package name */
        public final String f160649f;

        /* renamed from: g, reason: collision with root package name */
        public final String f160650g;

        /* renamed from: h, reason: collision with root package name */
        public final String f160651h;

        /* renamed from: i, reason: collision with root package name */
        public final String f160652i;

        public c(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10) {
            kotlin.jvm.internal.p.l(r2, "symbol");
            kotlin.jvm.internal.p.l(r3, "displayAs");
            kotlin.jvm.internal.p.l(r4, Constants.KEY_DATE);
            kotlin.jvm.internal.p.l(r5, "sharesFormatted");
            kotlin.jvm.internal.p.l(r6, "amountFormatted");
            kotlin.jvm.internal.p.l(r7, "ratio");
            kotlin.jvm.internal.p.l(r8, "dividendSharesFormatted");
            kotlin.jvm.internal.p.l(r9, "closingPriceDate");
            kotlin.jvm.internal.p.l(r10, "closingPriceFormatted");
            this.f160645a = r2;
            this.f160646b = r3;
            this.f160647c = r4;
            this.d = r5;
            this.f160648e = r6;
            this.f160649f = r7;
            this.f160650g = r8;
            this.f160651h = r9;
            this.f160652i = r10;
        }

        public String a() {
            return this.f160648e;
        }

        public final String b() {
            return this.f160651h;
        }

        public final String c() {
            return this.f160652i;
        }

        public String d() {
            return this.f160647c;
        }

        public String e() {
            return this.f160646b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (kotlin.jvm.internal.p.g(this.f160645a, r52.f160645a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f160646b, r52.f160646b) == true) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f160647c, r52.f160647c) == true) goto L18;
            return false;
        L18:
            if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (kotlin.jvm.internal.p.g(this.f160648e, r52.f160648e) == true) goto L24;
            return false;
        L24:
            if (kotlin.jvm.internal.p.g(this.f160649f, r52.f160649f) == true) goto L27;
            return false;
        L27:
            if (kotlin.jvm.internal.p.g(this.f160650g, r52.f160650g) == true) goto L30;
            return false;
        L30:
            if (kotlin.jvm.internal.p.g(this.f160651h, r52.f160651h) == true) goto L33;
            return false;
        L33:
            if (kotlin.jvm.internal.p.g(this.f160652i, r52.f160652i) == true) goto L35;
            return false;
        L35:
            return true;
        }

        public final String f() {
            return this.f160650g;
        }

        public final String g() {
            return this.f160649f;
        }

        public String h() {
            return this.d;
        }

        public int hashCode() {
            return (((((((((((((((this.f160645a.hashCode() * 31) + this.f160646b.hashCode()) * 31) + this.f160647c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f160648e.hashCode()) * 31) + this.f160649f.hashCode()) * 31) + this.f160650g.hashCode()) * 31) + this.f160651h.hashCode()) * 31) + this.f160652i.hashCode();
        }

        public String i() {
            return this.f160645a;
        }

        public String toString() {
            return "StockDividend(symbol=" + this.f160645a + ", displayAs=" + this.f160646b + ", date=" + this.f160647c + ", sharesFormatted=" + this.d + ", amountFormatted=" + this.f160648e + ", ratio=" + this.f160649f + ", dividendSharesFormatted=" + this.f160650g + ", closingPriceDate=" + this.f160651h + ", closingPriceFormatted=" + this.f160652i + ")";
        }
    }
}
