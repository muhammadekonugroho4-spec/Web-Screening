package com.stockbit.feature.cryptotransaction.ui.buy.model;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f95718a;

        /* renamed from: b, reason: collision with root package name */
        public final String f95719b;

        /* renamed from: c, reason: collision with root package name */
        public final String f95720c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f95721e;

        /* renamed from: f, reason: collision with root package name */
        public final String f95722f;

        /* renamed from: g, reason: collision with root package name */
        public final String f95723g;

        static {
        }

        public a(String r2, String r3, String r4, String r5, String r6, String r7, String r8) {
            p.l(r2, "coinLogoUrl");
            p.l(r3, "pricePlain");
            p.l(r4, "quantityPlain");
            p.l(r5, "totalValuePlain");
            p.l(r6, "exchangeFeePlain");
            p.l(r7, "cfxFeePlain");
            p.l(r8, "netTotalPlain");
            super(null);
            this.f95718a = r2;
            this.f95719b = r3;
            this.f95720c = r4;
            this.d = r5;
            this.f95721e = r6;
            this.f95722f = r7;
            this.f95723g = r8;
        }

        public String a() {
            return this.f95722f;
        }

        public String b() {
            return this.f95718a;
        }

        public String c() {
            return this.f95721e;
        }

        public String d() {
            return this.f95723g;
        }

        public final String e() {
            return this.f95719b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f95718a, r52.f95718a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f95719b, r52.f95719b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f95720c, r52.f95720c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (p.g(this.f95721e, r52.f95721e) == true) goto L24;
            return false;
        L24:
            if (p.g(this.f95722f, r52.f95722f) == true) goto L27;
            return false;
        L27:
            if (p.g(this.f95723g, r52.f95723g) == true) goto L29;
            return false;
        L29:
            return true;
        }

        public final String f() {
            return this.f95720c;
        }

        public String g() {
            return this.d;
        }

        public int hashCode() {
            return (((((((((((this.f95718a.hashCode() * 31) + this.f95719b.hashCode()) * 31) + this.f95720c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f95721e.hashCode()) * 31) + this.f95722f.hashCode()) * 31) + this.f95723g.hashCode();
        }

        public String toString() {
            return "Limit(coinLogoUrl=" + this.f95718a + ", pricePlain=" + this.f95719b + ", quantityPlain=" + this.f95720c + ", totalValuePlain=" + this.d + ", exchangeFeePlain=" + this.f95721e + ", cfxFeePlain=" + this.f95722f + ", netTotalPlain=" + this.f95723g + ')';
        }
    }

    /* renamed from: com.stockbit.feature.cryptotransaction.ui.buy.model.b$b, reason: collision with other inner class name */
    public static final class C0902b extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f95724a;

        /* renamed from: b, reason: collision with root package name */
        public final String f95725b;

        /* renamed from: c, reason: collision with root package name */
        public final String f95726c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f95727e;

        static {
        }

        public C0902b(String r2, String r3, String r4, String r5, String r6) {
            p.l(r2, "coinLogoUrl");
            p.l(r3, "totalValuePlain");
            p.l(r4, "exchangeFeePlain");
            p.l(r5, "cfxFeePlain");
            p.l(r6, "netTotalPlain");
            super(null);
            this.f95724a = r2;
            this.f95725b = r3;
            this.f95726c = r4;
            this.d = r5;
            this.f95727e = r6;
        }

        public String a() {
            return this.d;
        }

        public String b() {
            return this.f95724a;
        }

        public String c() {
            return this.f95726c;
        }

        public String d() {
            return this.f95727e;
        }

        public String e() {
            return this.f95725b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C0902b) == true) goto L8;
            return false;
        L8:
            C0902b r52 = (C0902b) r5;
            if (p.g(this.f95724a, r52.f95724a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f95725b, r52.f95725b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f95726c, r52.f95726c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (p.g(this.f95727e, r52.f95727e) == true) goto L23;
            return false;
        L23:
            return true;
        }

        public int hashCode() {
            return (((((((this.f95724a.hashCode() * 31) + this.f95725b.hashCode()) * 31) + this.f95726c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f95727e.hashCode();
        }

        public String toString() {
            return "Market(coinLogoUrl=" + this.f95724a + ", totalValuePlain=" + this.f95725b + ", exchangeFeePlain=" + this.f95726c + ", cfxFeePlain=" + this.d + ", netTotalPlain=" + this.f95727e + ')';
        }
    }

    static {
    }

    public /* synthetic */ b(i r1) {
        this();
    }

    public b() {
    }
}
