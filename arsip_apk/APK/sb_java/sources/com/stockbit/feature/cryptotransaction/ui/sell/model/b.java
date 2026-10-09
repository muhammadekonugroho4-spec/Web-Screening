package com.stockbit.feature.cryptotransaction.ui.sell.model;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f96060a;

        /* renamed from: b, reason: collision with root package name */
        public final String f96061b;

        /* renamed from: c, reason: collision with root package name */
        public final String f96062c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f96063e;

        /* renamed from: f, reason: collision with root package name */
        public final String f96064f;

        /* renamed from: g, reason: collision with root package name */
        public final String f96065g;

        /* renamed from: h, reason: collision with root package name */
        public final String f96066h;

        /* renamed from: i, reason: collision with root package name */
        public final String f96067i;

        static {
        }

        public a(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10) {
            p.l(r2, "coinLogoUrl");
            p.l(r3, "pricePlain");
            p.l(r4, "quantityPlain");
            p.l(r5, "proceedAmountPlain");
            p.l(r6, "exchangeFeePlain");
            p.l(r7, "cfxFeePlain");
            p.l(r8, "taxFeePlain");
            p.l(r9, "netTotalPlain");
            p.l(r10, "pnlDisplay");
            super(null);
            this.f96060a = r2;
            this.f96061b = r3;
            this.f96062c = r4;
            this.d = r5;
            this.f96063e = r6;
            this.f96064f = r7;
            this.f96065g = r8;
            this.f96066h = r9;
            this.f96067i = r10;
        }

        public String a() {
            return this.f96064f;
        }

        public String b() {
            return this.f96060a;
        }

        public String c() {
            return this.f96063e;
        }

        public String d() {
            return this.f96066h;
        }

        public String e() {
            return this.f96067i;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f96060a, r52.f96060a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f96061b, r52.f96061b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f96062c, r52.f96062c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (p.g(this.f96063e, r52.f96063e) == true) goto L24;
            return false;
        L24:
            if (p.g(this.f96064f, r52.f96064f) == true) goto L27;
            return false;
        L27:
            if (p.g(this.f96065g, r52.f96065g) == true) goto L30;
            return false;
        L30:
            if (p.g(this.f96066h, r52.f96066h) == true) goto L33;
            return false;
        L33:
            if (p.g(this.f96067i, r52.f96067i) == true) goto L35;
            return false;
        L35:
            return true;
        }

        public final String f() {
            return this.f96061b;
        }

        public String g() {
            return this.d;
        }

        public String h() {
            return this.f96062c;
        }

        public int hashCode() {
            return (((((((((((((((this.f96060a.hashCode() * 31) + this.f96061b.hashCode()) * 31) + this.f96062c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f96063e.hashCode()) * 31) + this.f96064f.hashCode()) * 31) + this.f96065g.hashCode()) * 31) + this.f96066h.hashCode()) * 31) + this.f96067i.hashCode();
        }

        public String i() {
            return this.f96065g;
        }

        public String toString() {
            return "Limit(coinLogoUrl=" + this.f96060a + ", pricePlain=" + this.f96061b + ", quantityPlain=" + this.f96062c + ", proceedAmountPlain=" + this.d + ", exchangeFeePlain=" + this.f96063e + ", cfxFeePlain=" + this.f96064f + ", taxFeePlain=" + this.f96065g + ", netTotalPlain=" + this.f96066h + ", pnlDisplay=" + this.f96067i + ')';
        }
    }

    /* renamed from: com.stockbit.feature.cryptotransaction.ui.sell.model.b$b, reason: collision with other inner class name */
    public static final class C0903b extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f96068a;

        /* renamed from: b, reason: collision with root package name */
        public final String f96069b;

        /* renamed from: c, reason: collision with root package name */
        public final String f96070c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f96071e;

        /* renamed from: f, reason: collision with root package name */
        public final String f96072f;

        /* renamed from: g, reason: collision with root package name */
        public final String f96073g;

        /* renamed from: h, reason: collision with root package name */
        public final String f96074h;

        static {
        }

        public C0903b(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9) {
            p.l(r2, "coinLogoUrl");
            p.l(r3, "quantityPlain");
            p.l(r4, "proceedAmountPlain");
            p.l(r5, "exchangeFeePlain");
            p.l(r6, "cfxFeePlain");
            p.l(r7, "taxFeePlain");
            p.l(r8, "netTotalPlain");
            p.l(r9, "pnlDisplay");
            super(null);
            this.f96068a = r2;
            this.f96069b = r3;
            this.f96070c = r4;
            this.d = r5;
            this.f96071e = r6;
            this.f96072f = r7;
            this.f96073g = r8;
            this.f96074h = r9;
        }

        public String a() {
            return this.f96071e;
        }

        public String b() {
            return this.f96068a;
        }

        public String c() {
            return this.d;
        }

        public String d() {
            return this.f96073g;
        }

        public String e() {
            return this.f96074h;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C0903b) == true) goto L8;
            return false;
        L8:
            C0903b r52 = (C0903b) r5;
            if (p.g(this.f96068a, r52.f96068a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f96069b, r52.f96069b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f96070c, r52.f96070c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (p.g(this.f96071e, r52.f96071e) == true) goto L24;
            return false;
        L24:
            if (p.g(this.f96072f, r52.f96072f) == true) goto L27;
            return false;
        L27:
            if (p.g(this.f96073g, r52.f96073g) == true) goto L30;
            return false;
        L30:
            if (p.g(this.f96074h, r52.f96074h) == true) goto L32;
            return false;
        L32:
            return true;
        }

        public String f() {
            return this.f96070c;
        }

        public String g() {
            return this.f96069b;
        }

        public String h() {
            return this.f96072f;
        }

        public int hashCode() {
            return (((((((((((((this.f96068a.hashCode() * 31) + this.f96069b.hashCode()) * 31) + this.f96070c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f96071e.hashCode()) * 31) + this.f96072f.hashCode()) * 31) + this.f96073g.hashCode()) * 31) + this.f96074h.hashCode();
        }

        public String toString() {
            return "Market(coinLogoUrl=" + this.f96068a + ", quantityPlain=" + this.f96069b + ", proceedAmountPlain=" + this.f96070c + ", exchangeFeePlain=" + this.d + ", cfxFeePlain=" + this.f96071e + ", taxFeePlain=" + this.f96072f + ", netTotalPlain=" + this.f96073g + ", pnlDisplay=" + this.f96074h + ')';
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
