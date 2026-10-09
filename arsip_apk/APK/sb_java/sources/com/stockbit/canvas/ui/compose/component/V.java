package com.stockbit.canvas.ui.compose.component;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes7.dex */
public abstract class V {

    public static final class a extends V {

        /* renamed from: a, reason: collision with root package name */
        public static final a f51143a = null;

        static {
            f51143a = new a();
        }

        public a() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -141050868;
        }

        public String toString() {
            return "AddToWatchlist";
        }
    }

    public static final class b extends V {

        /* renamed from: a, reason: collision with root package name */
        public static final b f51144a = null;

        static {
            f51144a = new b();
        }

        public b() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1675385771;
        }

        public String toString() {
            return "Buy";
        }
    }

    public static final class c extends V {

        /* renamed from: a, reason: collision with root package name */
        public static final c f51145a = null;

        static {
            f51145a = new c();
        }

        public c() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof c) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1409123369;
        }

        public String toString() {
            return "EditWidget";
        }
    }

    public static final class d extends V {

        /* renamed from: a, reason: collision with root package name */
        public static final d f51146a = null;

        static {
            f51146a = new d();
        }

        public d() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof d) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -556108122;
        }

        public String toString() {
            return "Notes";
        }
    }

    public static final class e extends V {

        /* renamed from: a, reason: collision with root package name */
        public static final e f51147a = null;

        static {
            f51147a = new e();
        }

        public e() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof e) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -1736585480;
        }

        public String toString() {
            return "OpenCompany";
        }
    }

    public static final class f extends V {

        /* renamed from: a, reason: collision with root package name */
        public final String f51148a;

        /* renamed from: b, reason: collision with root package name */
        public final String f51149b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f51150c;

        static {
        }

        public f(String r2, String r3, boolean r4) {
            kotlin.jvm.internal.p.l(r2, FirebaseAnalytics.Param.PRICE);
            kotlin.jvm.internal.p.l(r3, "previousPrice");
            super(null);
            this.f51148a = r2;
            this.f51149b = r3;
            this.f51150c = r4;
        }

        public final String a() {
            return this.f51149b;
        }

        public final String b() {
            return this.f51148a;
        }

        public final boolean c() {
            return this.f51150c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof f) == true) goto L8;
            return false;
        L8:
            f r52 = (f) r5;
            if (kotlin.jvm.internal.p.g(this.f51148a, r52.f51148a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f51149b, r52.f51149b) == true) goto L15;
            return false;
        L15:
            if (this.f51150c == r52.f51150c) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f51148a.hashCode() * 31) + this.f51149b.hashCode()) * 31) + Boolean.hashCode(this.f51150c);
        }

        public String toString() {
            return "OrderQueue(price=" + this.f51148a + ", previousPrice=" + this.f51149b + ", isAsk=" + this.f51150c + ')';
        }
    }

    public static final class g extends V {

        /* renamed from: a, reason: collision with root package name */
        public static final g f51151a = null;

        static {
            f51151a = new g();
        }

        public g() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof g) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1101312685;
        }

        public String toString() {
            return "Portfolio";
        }
    }

    public static final class h extends V {

        /* renamed from: a, reason: collision with root package name */
        public static final h f51152a = null;

        static {
            f51152a = new h();
        }

        public h() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof h) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -2125640498;
        }

        public String toString() {
            return "PriceAlert";
        }
    }

    public static final class i extends V {

        /* renamed from: a, reason: collision with root package name */
        public static final i f51153a = null;

        static {
            f51153a = new i();
        }

        public i() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof i) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 45600063;
        }

        public String toString() {
            return "Remove";
        }
    }

    public static final class j extends V {

        /* renamed from: a, reason: collision with root package name */
        public static final j f51154a = null;

        static {
            f51154a = new j();
        }

        public j() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof j) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 397842125;
        }

        public String toString() {
            return "Sell";
        }
    }

    public static final class k extends V {

        /* renamed from: a, reason: collision with root package name */
        public static final k f51155a = null;

        static {
            f51155a = new k();
        }

        public k() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof k) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -1020073632;
        }

        public String toString() {
            return "ToggleDoneLot";
        }
    }

    public static final class l extends V {

        /* renamed from: a, reason: collision with root package name */
        public static final l f51156a = null;

        static {
            f51156a = new l();
        }

        public l() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof l) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1764119314;
        }

        public String toString() {
            return "ToggleLotChange";
        }
    }

    static {
    }

    public /* synthetic */ V(kotlin.jvm.internal.i r1) {
        this();
    }

    public V() {
    }
}
