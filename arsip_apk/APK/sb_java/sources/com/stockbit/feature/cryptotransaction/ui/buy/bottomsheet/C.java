package com.stockbit.feature.cryptotransaction.ui.buy.bottomsheet;

/* loaded from: classes9.dex */
public abstract class C {

    public static final class a extends C {

        /* renamed from: a, reason: collision with root package name */
        public final String f95458a;

        /* renamed from: b, reason: collision with root package name */
        public final String f95459b;

        static {
        }

        public a(String r2, String r3) {
            kotlin.jvm.internal.p.l(r2, "coinName");
            kotlin.jvm.internal.p.l(r3, "coinLogoUrl");
            super(null);
            this.f95458a = r2;
            this.f95459b = r3;
        }

        @Override // com.stockbit.feature.cryptotransaction.ui.buy.bottomsheet.C
        public String a() {
            return this.f95459b;
        }

        @Override // com.stockbit.feature.cryptotransaction.ui.buy.bottomsheet.C
        public String b() {
            return this.f95458a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (kotlin.jvm.internal.p.g(this.f95458a, r52.f95458a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f95459b, r52.f95459b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f95458a.hashCode() * 31) + this.f95459b.hashCode();
        }

        public String toString() {
            return "Limit(coinName=" + this.f95458a + ", coinLogoUrl=" + this.f95459b + ')';
        }
    }

    public static final class b extends C {

        /* renamed from: a, reason: collision with root package name */
        public final String f95460a;

        /* renamed from: b, reason: collision with root package name */
        public final String f95461b;

        /* renamed from: c, reason: collision with root package name */
        public final String f95462c;
        public final String d;

        static {
        }

        public b(String r2, String r3, String r4, String r5) {
            kotlin.jvm.internal.p.l(r2, "coinName");
            kotlin.jvm.internal.p.l(r3, "coinLogoUrl");
            kotlin.jvm.internal.p.l(r4, "filledQuantityFormatted");
            kotlin.jvm.internal.p.l(r5, "filledPriceIdrFormatted");
            super(null);
            this.f95460a = r2;
            this.f95461b = r3;
            this.f95462c = r4;
            this.d = r5;
        }

        @Override // com.stockbit.feature.cryptotransaction.ui.buy.bottomsheet.C
        public String a() {
            return this.f95461b;
        }

        @Override // com.stockbit.feature.cryptotransaction.ui.buy.bottomsheet.C
        public String b() {
            return this.f95460a;
        }

        public final String c() {
            return this.d;
        }

        public final String d() {
            return this.f95462c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (kotlin.jvm.internal.p.g(this.f95460a, r52.f95460a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f95461b, r52.f95461b) == true) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f95462c, r52.f95462c) == true) goto L18;
            return false;
        L18:
            if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            return (((((this.f95460a.hashCode() * 31) + this.f95461b.hashCode()) * 31) + this.f95462c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "Market(coinName=" + this.f95460a + ", coinLogoUrl=" + this.f95461b + ", filledQuantityFormatted=" + this.f95462c + ", filledPriceIdrFormatted=" + this.d + ')';
        }
    }

    static {
    }

    public /* synthetic */ C(kotlin.jvm.internal.i r1) {
        this();
    }

    public abstract String a();

    public abstract String b();

    public C() {
    }
}
