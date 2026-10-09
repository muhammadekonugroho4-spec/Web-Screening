package com.stockbit.usecase.notification.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f158628a;

        public a(String r2) {
            p.l(r2, "symbol");
            super(null);
            this.f158628a = r2;
        }

        public final String a() {
            return this.f158628a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158628a, ((a) r4).f158628a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158628a.hashCode();
        }

        public String toString() {
            return "CompanyPage(symbol=" + this.f158628a + ")";
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f158629a;

        public b(String r2) {
            p.l(r2, "symbol");
            super(null);
            this.f158629a = r2;
        }

        public final String a() {
            return this.f158629a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158629a, ((b) r4).f158629a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158629a.hashCode();
        }

        public String toString() {
            return "EIpoCompanyDetail(symbol=" + this.f158629a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.notification.model.c$c, reason: collision with other inner class name */
    public static final class C1534c extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final C1534c f158630a = null;

        static {
            f158630a = new C1534c();
        }

        public C1534c() {
            super(null);
        }
    }

    public static final class d extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final d f158631a = null;

        static {
            f158631a = new d();
        }

        public d() {
            super(null);
        }
    }

    public static final class e extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final e f158632a = null;

        static {
            f158632a = new e();
        }

        public e() {
            super(null);
        }
    }

    public static final class f extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f158633a;

        public f(String r2) {
            p.l(r2, "alertId");
            super(null);
            this.f158633a = r2;
        }

        public final String a() {
            return this.f158633a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof f) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158633a, ((f) r4).f158633a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158633a.hashCode();
        }

        public String toString() {
            return "PriceAlert(alertId=" + this.f158633a + ")";
        }
    }

    public static final class g extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f158634a;

        public g(String r2) {
            p.l(r2, "profileId");
            super(null);
            this.f158634a = r2;
        }

        public final String a() {
            return this.f158634a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof g) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158634a, ((g) r4).f158634a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158634a.hashCode();
        }

        public String toString() {
            return "ProfilePage(profileId=" + this.f158634a + ")";
        }
    }

    public static final class h extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final h f158635a = null;

        static {
            f158635a = new h();
        }

        public h() {
            super(null);
        }
    }

    public static final class i extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f158636a;

        /* renamed from: b, reason: collision with root package name */
        public final int f158637b;

        public i(String r2, int r3) {
            p.l(r2, "postId");
            super(null);
            this.f158636a = r2;
            this.f158637b = r3;
        }

        public final String a() {
            return this.f158636a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof i) == true) goto L8;
            return false;
        L8:
            i r52 = (i) r5;
            if (p.g(this.f158636a, r52.f158636a) == true) goto L12;
            return false;
        L12:
            if (this.f158637b == r52.f158637b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f158636a.hashCode() * 31) + Integer.hashCode(this.f158637b);
        }

        public String toString() {
            return "StreamConversation(postId=" + this.f158636a + ", itemPosition=" + this.f158637b + ")";
        }
    }

    public static final class j extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final j f158638a = null;

        static {
            f158638a = new j();
        }

        public j() {
            super(null);
        }
    }

    public static final class k extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f158639a;

        public k(String r2) {
            p.l(r2, "tippingId");
            super(null);
            this.f158639a = r2;
        }

        public final String a() {
            return this.f158639a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof k) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158639a, ((k) r4).f158639a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158639a.hashCode();
        }

        public String toString() {
            return "TippingClaimDialog(tippingId=" + this.f158639a + ")";
        }
    }

    public static final class l extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f158640a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f158641b;

        public l(String r2, boolean r3) {
            p.l(r2, "tippingId");
            super(null);
            this.f158640a = r2;
            this.f158641b = r3;
        }

        public final String a() {
            return this.f158640a;
        }

        public final boolean b() {
            return this.f158641b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof l) == true) goto L8;
            return false;
        L8:
            l r52 = (l) r5;
            if (p.g(this.f158640a, r52.f158640a) == true) goto L12;
            return false;
        L12:
            if (this.f158641b == r52.f158641b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f158640a.hashCode() * 31) + Boolean.hashCode(this.f158641b);
        }

        public String toString() {
            return "TippingSendReceiveDialog(tippingId=" + this.f158640a + ", isReceive=" + this.f158641b + ")";
        }
    }

    public static final class m extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f158642a;

        public m(String r2) {
            p.l(r2, "username");
            super(null);
            this.f158642a = r2;
        }

        public final String a() {
            return this.f158642a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof m) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158642a, ((m) r4).f158642a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158642a.hashCode();
        }

        public String toString() {
            return "TradingCommunity(username=" + this.f158642a + ")";
        }
    }

    public /* synthetic */ c(kotlin.jvm.internal.i r1) {
        this();
    }

    public c() {
    }
}
