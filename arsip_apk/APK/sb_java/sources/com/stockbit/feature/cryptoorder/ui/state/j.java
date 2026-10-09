package com.stockbit.feature.cryptoorder.ui.state;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public interface j {

    public static final class a implements j {

        /* renamed from: a, reason: collision with root package name */
        public final int f94620a;

        /* renamed from: b, reason: collision with root package name */
        public final CryptoOrderStatusColorTone f94621b;

        /* renamed from: c, reason: collision with root package name */
        public final String f94622c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f94623e;

        /* renamed from: f, reason: collision with root package name */
        public final String f94624f;

        /* renamed from: g, reason: collision with root package name */
        public final String f94625g;

        static {
        }

        public a(int r2, CryptoOrderStatusColorTone r3, String r4, String r5, String r6, String r7, String r8) {
            p.l(r3, "statusColorTone");
            p.l(r4, FirebaseAnalytics.Param.PRICE);
            p.l(r5, FirebaseAnalytics.Param.QUANTITY);
            p.l(r6, "estInvestmentOrProceeds");
            p.l(r7, "orderId");
            p.l(r8, "orderTime");
            this.f94620a = r2;
            this.f94621b = r3;
            this.f94622c = r4;
            this.d = r5;
            this.f94623e = r6;
            this.f94624f = r7;
            this.f94625g = r8;
        }

        @Override // com.stockbit.feature.cryptoorder.ui.state.j
        public String a() {
            return this.f94624f;
        }

        public String b() {
            return this.f94623e;
        }

        public String c() {
            return this.f94625g;
        }

        public final String d() {
            return this.f94622c;
        }

        public final String e() {
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
            if (this.f94620a == r52.f94620a) goto L12;
            return false;
        L12:
            if (this.f94621b == r52.f94621b) goto L15;
            return false;
        L15:
            if (p.g(this.f94622c, r52.f94622c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (p.g(this.f94623e, r52.f94623e) == true) goto L24;
            return false;
        L24:
            if (p.g(this.f94624f, r52.f94624f) == true) goto L27;
            return false;
        L27:
            if (p.g(this.f94625g, r52.f94625g) == true) goto L29;
            return false;
        L29:
            return true;
        }

        public CryptoOrderStatusColorTone f() {
            return this.f94621b;
        }

        public int g() {
            return this.f94620a;
        }

        public int hashCode() {
            return (((((((((((Integer.hashCode(this.f94620a) * 31) + this.f94621b.hashCode()) * 31) + this.f94622c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f94623e.hashCode()) * 31) + this.f94624f.hashCode()) * 31) + this.f94625g.hashCode();
        }

        public String toString() {
            return "BuyLimit(statusLabelRes=" + this.f94620a + ", statusColorTone=" + this.f94621b + ", price=" + this.f94622c + ", quantity=" + this.d + ", estInvestmentOrProceeds=" + this.f94623e + ", orderId=" + this.f94624f + ", orderTime=" + this.f94625g + ')';
        }
    }

    public static final class b implements j {

        /* renamed from: a, reason: collision with root package name */
        public final int f94626a;

        /* renamed from: b, reason: collision with root package name */
        public final CryptoOrderStatusColorTone f94627b;

        /* renamed from: c, reason: collision with root package name */
        public final int f94628c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f94629e;

        /* renamed from: f, reason: collision with root package name */
        public final String f94630f;

        static {
        }

        public b(int r2, CryptoOrderStatusColorTone r3, int r4, String r5, String r6, String r7) {
            p.l(r3, "statusColorTone");
            p.l(r5, "estInvestmentOrProceeds");
            p.l(r6, "orderId");
            p.l(r7, "orderTime");
            this.f94626a = r2;
            this.f94627b = r3;
            this.f94628c = r4;
            this.d = r5;
            this.f94629e = r6;
            this.f94630f = r7;
        }

        @Override // com.stockbit.feature.cryptoorder.ui.state.j
        public String a() {
            return this.f94629e;
        }

        public String b() {
            return this.d;
        }

        public final int c() {
            return this.f94628c;
        }

        public String d() {
            return this.f94630f;
        }

        public CryptoOrderStatusColorTone e() {
            return this.f94627b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (this.f94626a == r52.f94626a) goto L12;
            return false;
        L12:
            if (this.f94627b == r52.f94627b) goto L15;
            return false;
        L15:
            if (this.f94628c == r52.f94628c) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (p.g(this.f94629e, r52.f94629e) == true) goto L24;
            return false;
        L24:
            if (p.g(this.f94630f, r52.f94630f) == true) goto L26;
            return false;
        L26:
            return true;
        }

        public int f() {
            return this.f94626a;
        }

        public int hashCode() {
            return (((((((((Integer.hashCode(this.f94626a) * 31) + this.f94627b.hashCode()) * 31) + Integer.hashCode(this.f94628c)) * 31) + this.d.hashCode()) * 31) + this.f94629e.hashCode()) * 31) + this.f94630f.hashCode();
        }

        public String toString() {
            return "BuyMarket(statusLabelRes=" + this.f94626a + ", statusColorTone=" + this.f94627b + ", expiryLabelRes=" + this.f94628c + ", estInvestmentOrProceeds=" + this.d + ", orderId=" + this.f94629e + ", orderTime=" + this.f94630f + ')';
        }
    }

    public static final class c implements j {

        /* renamed from: a, reason: collision with root package name */
        public final int f94631a;

        /* renamed from: b, reason: collision with root package name */
        public final CryptoOrderStatusColorTone f94632b;

        /* renamed from: c, reason: collision with root package name */
        public final String f94633c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f94634e;

        /* renamed from: f, reason: collision with root package name */
        public final String f94635f;

        /* renamed from: g, reason: collision with root package name */
        public final String f94636g;

        static {
        }

        public c(int r2, CryptoOrderStatusColorTone r3, String r4, String r5, String r6, String r7, String r8) {
            p.l(r3, "statusColorTone");
            p.l(r4, FirebaseAnalytics.Param.PRICE);
            p.l(r5, FirebaseAnalytics.Param.QUANTITY);
            p.l(r6, "estInvestmentOrProceeds");
            p.l(r7, "orderId");
            p.l(r8, "orderTime");
            this.f94631a = r2;
            this.f94632b = r3;
            this.f94633c = r4;
            this.d = r5;
            this.f94634e = r6;
            this.f94635f = r7;
            this.f94636g = r8;
        }

        @Override // com.stockbit.feature.cryptoorder.ui.state.j
        public String a() {
            return this.f94635f;
        }

        public String b() {
            return this.f94634e;
        }

        public String c() {
            return this.f94636g;
        }

        public final String d() {
            return this.f94633c;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (this.f94631a == r52.f94631a) goto L12;
            return false;
        L12:
            if (this.f94632b == r52.f94632b) goto L15;
            return false;
        L15:
            if (p.g(this.f94633c, r52.f94633c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (p.g(this.f94634e, r52.f94634e) == true) goto L24;
            return false;
        L24:
            if (p.g(this.f94635f, r52.f94635f) == true) goto L27;
            return false;
        L27:
            if (p.g(this.f94636g, r52.f94636g) == true) goto L29;
            return false;
        L29:
            return true;
        }

        public CryptoOrderStatusColorTone f() {
            return this.f94632b;
        }

        public int g() {
            return this.f94631a;
        }

        public int hashCode() {
            return (((((((((((Integer.hashCode(this.f94631a) * 31) + this.f94632b.hashCode()) * 31) + this.f94633c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f94634e.hashCode()) * 31) + this.f94635f.hashCode()) * 31) + this.f94636g.hashCode();
        }

        public String toString() {
            return "SellLimit(statusLabelRes=" + this.f94631a + ", statusColorTone=" + this.f94632b + ", price=" + this.f94633c + ", quantity=" + this.d + ", estInvestmentOrProceeds=" + this.f94634e + ", orderId=" + this.f94635f + ", orderTime=" + this.f94636g + ')';
        }
    }

    public static final class d implements j {

        /* renamed from: a, reason: collision with root package name */
        public final int f94637a;

        /* renamed from: b, reason: collision with root package name */
        public final CryptoOrderStatusColorTone f94638b;

        /* renamed from: c, reason: collision with root package name */
        public final int f94639c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f94640e;

        /* renamed from: f, reason: collision with root package name */
        public final String f94641f;

        /* renamed from: g, reason: collision with root package name */
        public final String f94642g;

        static {
        }

        public d(int r2, CryptoOrderStatusColorTone r3, int r4, String r5, String r6, String r7, String r8) {
            p.l(r3, "statusColorTone");
            p.l(r5, FirebaseAnalytics.Param.QUANTITY);
            p.l(r6, "estInvestmentOrProceeds");
            p.l(r7, "orderId");
            p.l(r8, "orderTime");
            this.f94637a = r2;
            this.f94638b = r3;
            this.f94639c = r4;
            this.d = r5;
            this.f94640e = r6;
            this.f94641f = r7;
            this.f94642g = r8;
        }

        @Override // com.stockbit.feature.cryptoorder.ui.state.j
        public String a() {
            return this.f94641f;
        }

        public String b() {
            return this.f94640e;
        }

        public final int c() {
            return this.f94639c;
        }

        public String d() {
            return this.f94642g;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof d) == true) goto L8;
            return false;
        L8:
            d r52 = (d) r5;
            if (this.f94637a == r52.f94637a) goto L12;
            return false;
        L12:
            if (this.f94638b == r52.f94638b) goto L15;
            return false;
        L15:
            if (this.f94639c == r52.f94639c) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (p.g(this.f94640e, r52.f94640e) == true) goto L24;
            return false;
        L24:
            if (p.g(this.f94641f, r52.f94641f) == true) goto L27;
            return false;
        L27:
            if (p.g(this.f94642g, r52.f94642g) == true) goto L29;
            return false;
        L29:
            return true;
        }

        public CryptoOrderStatusColorTone f() {
            return this.f94638b;
        }

        public int g() {
            return this.f94637a;
        }

        public int hashCode() {
            return (((((((((((Integer.hashCode(this.f94637a) * 31) + this.f94638b.hashCode()) * 31) + Integer.hashCode(this.f94639c)) * 31) + this.d.hashCode()) * 31) + this.f94640e.hashCode()) * 31) + this.f94641f.hashCode()) * 31) + this.f94642g.hashCode();
        }

        public String toString() {
            return "SellMarket(statusLabelRes=" + this.f94637a + ", statusColorTone=" + this.f94638b + ", expiryLabelRes=" + this.f94639c + ", quantity=" + this.d + ", estInvestmentOrProceeds=" + this.f94640e + ", orderId=" + this.f94641f + ", orderTime=" + this.f94642g + ')';
        }
    }

    String a();
}
