package com.stockbit.usecase.cryptohistory.contract.entity;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f157147a;

        /* renamed from: b, reason: collision with root package name */
        public final String f157148b;

        /* renamed from: c, reason: collision with root package name */
        public final String f157149c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final long f157150e;

        /* renamed from: f, reason: collision with root package name */
        public final double f157151f;

        /* renamed from: g, reason: collision with root package name */
        public final double f157152g;

        /* renamed from: h, reason: collision with root package name */
        public final double f157153h;

        /* renamed from: i, reason: collision with root package name */
        public final double f157154i;

        /* renamed from: j, reason: collision with root package name */
        public final double f157155j;

        /* renamed from: k, reason: collision with root package name */
        public final double f157156k;

        public a(String r2, String r3, String r4, String r5, long r6, double r8, double r10, double r12, double r14, double r16, double r18) {
            p.l(r2, Constants.KEY_ID);
            p.l(r3, "coinSymbol");
            p.l(r4, "coinName");
            p.l(r5, "coinLogo");
            super(null);
            this.f157147a = r2;
            this.f157148b = r3;
            this.f157149c = r4;
            this.d = r5;
            this.f157150e = r6;
            this.f157151f = r8;
            this.f157152g = r10;
            this.f157153h = r12;
            this.f157154i = r14;
            this.f157155j = r16;
            this.f157156k = r18;
        }

        @Override // com.stockbit.usecase.cryptohistory.contract.entity.c
        public String a() {
            return this.f157148b;
        }

        public double b() {
            return this.f157153h;
        }

        public double c() {
            return this.f157155j;
        }

        public long d() {
            return this.f157150e;
        }

        public double e() {
            return this.f157154i;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof a) == true) goto L8;
            return false;
        L8:
            a r82 = (a) r8;
            if (p.g(this.f157147a, r82.f157147a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f157148b, r82.f157148b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f157149c, r82.f157149c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r82.d) == true) goto L21;
            return false;
        L21:
            if (this.f157150e == r82.f157150e) goto L24;
            return false;
        L24:
            if (Double.compare(this.f157151f, r82.f157151f) == 0) goto L27;
            return false;
        L27:
            if (Double.compare(this.f157152g, r82.f157152g) == 0) goto L30;
            return false;
        L30:
            if (Double.compare(this.f157153h, r82.f157153h) == 0) goto L33;
            return false;
        L33:
            if (Double.compare(this.f157154i, r82.f157154i) == 0) goto L36;
            return false;
        L36:
            if (Double.compare(this.f157155j, r82.f157155j) == 0) goto L39;
            return false;
        L39:
            if (Double.compare(this.f157156k, r82.f157156k) == 0) goto L41;
            return false;
        L41:
            return true;
        }

        public double f() {
            return this.f157156k;
        }

        public double g() {
            return this.f157151f;
        }

        public double h() {
            return this.f157152g;
        }

        public int hashCode() {
            return (((((((((((((((((((this.f157147a.hashCode() * 31) + this.f157148b.hashCode()) * 31) + this.f157149c.hashCode()) * 31) + this.d.hashCode()) * 31) + Long.hashCode(this.f157150e)) * 31) + Double.hashCode(this.f157151f)) * 31) + Double.hashCode(this.f157152g)) * 31) + Double.hashCode(this.f157153h)) * 31) + Double.hashCode(this.f157154i)) * 31) + Double.hashCode(this.f157155j)) * 31) + Double.hashCode(this.f157156k);
        }

        public String toString() {
            return "BuyLimit(id=" + this.f157147a + ", coinSymbol=" + this.f157148b + ", coinName=" + this.f157149c + ", coinLogo=" + this.d + ", createdAt=" + this.f157150e + ", price=" + this.f157151f + ", quantityDone=" + this.f157152g + ", amount=" + this.f157153h + ", exchangeFee=" + this.f157154i + ", cfxFee=" + this.f157155j + ", netAmount=" + this.f157156k + ")";
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f157157a;

        /* renamed from: b, reason: collision with root package name */
        public final String f157158b;

        /* renamed from: c, reason: collision with root package name */
        public final String f157159c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final long f157160e;

        /* renamed from: f, reason: collision with root package name */
        public final double f157161f;

        /* renamed from: g, reason: collision with root package name */
        public final double f157162g;

        /* renamed from: h, reason: collision with root package name */
        public final double f157163h;

        /* renamed from: i, reason: collision with root package name */
        public final double f157164i;

        /* renamed from: j, reason: collision with root package name */
        public final double f157165j;

        /* renamed from: k, reason: collision with root package name */
        public final double f157166k;

        public b(String r2, String r3, String r4, String r5, long r6, double r8, double r10, double r12, double r14, double r16, double r18) {
            p.l(r2, Constants.KEY_ID);
            p.l(r3, "coinSymbol");
            p.l(r4, "coinName");
            p.l(r5, "coinLogo");
            super(null);
            this.f157157a = r2;
            this.f157158b = r3;
            this.f157159c = r4;
            this.d = r5;
            this.f157160e = r6;
            this.f157161f = r8;
            this.f157162g = r10;
            this.f157163h = r12;
            this.f157164i = r14;
            this.f157165j = r16;
            this.f157166k = r18;
        }

        @Override // com.stockbit.usecase.cryptohistory.contract.entity.c
        public String a() {
            return this.f157158b;
        }

        public double b() {
            return this.f157163h;
        }

        public double c() {
            return this.f157165j;
        }

        public long d() {
            return this.f157160e;
        }

        public double e() {
            return this.f157164i;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof b) == true) goto L8;
            return false;
        L8:
            b r82 = (b) r8;
            if (p.g(this.f157157a, r82.f157157a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f157158b, r82.f157158b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f157159c, r82.f157159c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r82.d) == true) goto L21;
            return false;
        L21:
            if (this.f157160e == r82.f157160e) goto L24;
            return false;
        L24:
            if (Double.compare(this.f157161f, r82.f157161f) == 0) goto L27;
            return false;
        L27:
            if (Double.compare(this.f157162g, r82.f157162g) == 0) goto L30;
            return false;
        L30:
            if (Double.compare(this.f157163h, r82.f157163h) == 0) goto L33;
            return false;
        L33:
            if (Double.compare(this.f157164i, r82.f157164i) == 0) goto L36;
            return false;
        L36:
            if (Double.compare(this.f157165j, r82.f157165j) == 0) goto L39;
            return false;
        L39:
            if (Double.compare(this.f157166k, r82.f157166k) == 0) goto L41;
            return false;
        L41:
            return true;
        }

        public double f() {
            return this.f157166k;
        }

        public double g() {
            return this.f157161f;
        }

        public double h() {
            return this.f157162g;
        }

        public int hashCode() {
            return (((((((((((((((((((this.f157157a.hashCode() * 31) + this.f157158b.hashCode()) * 31) + this.f157159c.hashCode()) * 31) + this.d.hashCode()) * 31) + Long.hashCode(this.f157160e)) * 31) + Double.hashCode(this.f157161f)) * 31) + Double.hashCode(this.f157162g)) * 31) + Double.hashCode(this.f157163h)) * 31) + Double.hashCode(this.f157164i)) * 31) + Double.hashCode(this.f157165j)) * 31) + Double.hashCode(this.f157166k);
        }

        public String toString() {
            return "BuyMarket(id=" + this.f157157a + ", coinSymbol=" + this.f157158b + ", coinName=" + this.f157159c + ", coinLogo=" + this.d + ", createdAt=" + this.f157160e + ", price=" + this.f157161f + ", quantityDone=" + this.f157162g + ", amount=" + this.f157163h + ", exchangeFee=" + this.f157164i + ", cfxFee=" + this.f157165j + ", netAmount=" + this.f157166k + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.cryptohistory.contract.entity.c$c, reason: collision with other inner class name */
    public static final class C1450c extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f157167a;

        /* renamed from: b, reason: collision with root package name */
        public final String f157168b;

        /* renamed from: c, reason: collision with root package name */
        public final String f157169c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final long f157170e;

        /* renamed from: f, reason: collision with root package name */
        public final double f157171f;

        /* renamed from: g, reason: collision with root package name */
        public final double f157172g;

        /* renamed from: h, reason: collision with root package name */
        public final double f157173h;

        /* renamed from: i, reason: collision with root package name */
        public final double f157174i;

        /* renamed from: j, reason: collision with root package name */
        public final double f157175j;

        /* renamed from: k, reason: collision with root package name */
        public final double f157176k;

        /* renamed from: l, reason: collision with root package name */
        public final double f157177l;

        /* renamed from: m, reason: collision with root package name */
        public final double f157178m;

        public C1450c(String r2, String r3, String r4, String r5, long r6, double r8, double r10, double r12, double r14, double r16, double r18, double r20, double r22) {
            p.l(r2, Constants.KEY_ID);
            p.l(r3, "coinSymbol");
            p.l(r4, "coinName");
            p.l(r5, "coinLogo");
            super(null);
            this.f157167a = r2;
            this.f157168b = r3;
            this.f157169c = r4;
            this.d = r5;
            this.f157170e = r6;
            this.f157171f = r8;
            this.f157172g = r10;
            this.f157173h = r12;
            this.f157174i = r14;
            this.f157175j = r16;
            this.f157176k = r18;
            this.f157177l = r20;
            this.f157178m = r22;
        }

        @Override // com.stockbit.usecase.cryptohistory.contract.entity.c
        public String a() {
            return this.f157168b;
        }

        public double b() {
            return this.f157173h;
        }

        public double c() {
            return this.f157175j;
        }

        public long d() {
            return this.f157170e;
        }

        public double e() {
            return this.f157174i;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof C1450c) == true) goto L8;
            return false;
        L8:
            C1450c r82 = (C1450c) r8;
            if (p.g(this.f157167a, r82.f157167a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f157168b, r82.f157168b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f157169c, r82.f157169c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r82.d) == true) goto L21;
            return false;
        L21:
            if (this.f157170e == r82.f157170e) goto L24;
            return false;
        L24:
            if (Double.compare(this.f157171f, r82.f157171f) == 0) goto L27;
            return false;
        L27:
            if (Double.compare(this.f157172g, r82.f157172g) == 0) goto L30;
            return false;
        L30:
            if (Double.compare(this.f157173h, r82.f157173h) == 0) goto L33;
            return false;
        L33:
            if (Double.compare(this.f157174i, r82.f157174i) == 0) goto L36;
            return false;
        L36:
            if (Double.compare(this.f157175j, r82.f157175j) == 0) goto L39;
            return false;
        L39:
            if (Double.compare(this.f157176k, r82.f157176k) == 0) goto L42;
            return false;
        L42:
            if (Double.compare(this.f157177l, r82.f157177l) == 0) goto L45;
            return false;
        L45:
            if (Double.compare(this.f157178m, r82.f157178m) == 0) goto L47;
            return false;
        L47:
            return true;
        }

        public double f() {
            return this.f157176k;
        }

        public double g() {
            return this.f157171f;
        }

        public double h() {
            return this.f157172g;
        }

        public int hashCode() {
            return (((((((((((((((((((((((this.f157167a.hashCode() * 31) + this.f157168b.hashCode()) * 31) + this.f157169c.hashCode()) * 31) + this.d.hashCode()) * 31) + Long.hashCode(this.f157170e)) * 31) + Double.hashCode(this.f157171f)) * 31) + Double.hashCode(this.f157172g)) * 31) + Double.hashCode(this.f157173h)) * 31) + Double.hashCode(this.f157174i)) * 31) + Double.hashCode(this.f157175j)) * 31) + Double.hashCode(this.f157176k)) * 31) + Double.hashCode(this.f157177l)) * 31) + Double.hashCode(this.f157178m);
        }

        public final double i() {
            return this.f157178m;
        }

        public final double j() {
            return this.f157177l;
        }

        public String toString() {
            return "SellLimit(id=" + this.f157167a + ", coinSymbol=" + this.f157168b + ", coinName=" + this.f157169c + ", coinLogo=" + this.d + ", createdAt=" + this.f157170e + ", price=" + this.f157171f + ", quantityDone=" + this.f157172g + ", amount=" + this.f157173h + ", exchangeFee=" + this.f157174i + ", cfxFee=" + this.f157175j + ", netAmount=" + this.f157176k + ", tax=" + this.f157177l + ", realizedPnl=" + this.f157178m + ")";
        }
    }

    public static final class d extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f157179a;

        /* renamed from: b, reason: collision with root package name */
        public final String f157180b;

        /* renamed from: c, reason: collision with root package name */
        public final String f157181c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final long f157182e;

        /* renamed from: f, reason: collision with root package name */
        public final double f157183f;

        /* renamed from: g, reason: collision with root package name */
        public final double f157184g;

        /* renamed from: h, reason: collision with root package name */
        public final double f157185h;

        /* renamed from: i, reason: collision with root package name */
        public final double f157186i;

        /* renamed from: j, reason: collision with root package name */
        public final double f157187j;

        /* renamed from: k, reason: collision with root package name */
        public final double f157188k;

        /* renamed from: l, reason: collision with root package name */
        public final double f157189l;

        /* renamed from: m, reason: collision with root package name */
        public final double f157190m;

        public d(String r2, String r3, String r4, String r5, long r6, double r8, double r10, double r12, double r14, double r16, double r18, double r20, double r22) {
            p.l(r2, Constants.KEY_ID);
            p.l(r3, "coinSymbol");
            p.l(r4, "coinName");
            p.l(r5, "coinLogo");
            super(null);
            this.f157179a = r2;
            this.f157180b = r3;
            this.f157181c = r4;
            this.d = r5;
            this.f157182e = r6;
            this.f157183f = r8;
            this.f157184g = r10;
            this.f157185h = r12;
            this.f157186i = r14;
            this.f157187j = r16;
            this.f157188k = r18;
            this.f157189l = r20;
            this.f157190m = r22;
        }

        @Override // com.stockbit.usecase.cryptohistory.contract.entity.c
        public String a() {
            return this.f157180b;
        }

        public double b() {
            return this.f157185h;
        }

        public double c() {
            return this.f157187j;
        }

        public long d() {
            return this.f157182e;
        }

        public double e() {
            return this.f157186i;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof d) == true) goto L8;
            return false;
        L8:
            d r82 = (d) r8;
            if (p.g(this.f157179a, r82.f157179a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f157180b, r82.f157180b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f157181c, r82.f157181c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r82.d) == true) goto L21;
            return false;
        L21:
            if (this.f157182e == r82.f157182e) goto L24;
            return false;
        L24:
            if (Double.compare(this.f157183f, r82.f157183f) == 0) goto L27;
            return false;
        L27:
            if (Double.compare(this.f157184g, r82.f157184g) == 0) goto L30;
            return false;
        L30:
            if (Double.compare(this.f157185h, r82.f157185h) == 0) goto L33;
            return false;
        L33:
            if (Double.compare(this.f157186i, r82.f157186i) == 0) goto L36;
            return false;
        L36:
            if (Double.compare(this.f157187j, r82.f157187j) == 0) goto L39;
            return false;
        L39:
            if (Double.compare(this.f157188k, r82.f157188k) == 0) goto L42;
            return false;
        L42:
            if (Double.compare(this.f157189l, r82.f157189l) == 0) goto L45;
            return false;
        L45:
            if (Double.compare(this.f157190m, r82.f157190m) == 0) goto L47;
            return false;
        L47:
            return true;
        }

        public double f() {
            return this.f157188k;
        }

        public double g() {
            return this.f157183f;
        }

        public double h() {
            return this.f157184g;
        }

        public int hashCode() {
            return (((((((((((((((((((((((this.f157179a.hashCode() * 31) + this.f157180b.hashCode()) * 31) + this.f157181c.hashCode()) * 31) + this.d.hashCode()) * 31) + Long.hashCode(this.f157182e)) * 31) + Double.hashCode(this.f157183f)) * 31) + Double.hashCode(this.f157184g)) * 31) + Double.hashCode(this.f157185h)) * 31) + Double.hashCode(this.f157186i)) * 31) + Double.hashCode(this.f157187j)) * 31) + Double.hashCode(this.f157188k)) * 31) + Double.hashCode(this.f157189l)) * 31) + Double.hashCode(this.f157190m);
        }

        public final double i() {
            return this.f157190m;
        }

        public final double j() {
            return this.f157189l;
        }

        public String toString() {
            return "SellMarket(id=" + this.f157179a + ", coinSymbol=" + this.f157180b + ", coinName=" + this.f157181c + ", coinLogo=" + this.d + ", createdAt=" + this.f157182e + ", price=" + this.f157183f + ", quantityDone=" + this.f157184g + ", amount=" + this.f157185h + ", exchangeFee=" + this.f157186i + ", cfxFee=" + this.f157187j + ", netAmount=" + this.f157188k + ", tax=" + this.f157189l + ", realizedPnl=" + this.f157190m + ")";
        }
    }

    public /* synthetic */ c(i r1) {
        this();
    }

    public abstract String a();

    public c() {
    }
}
