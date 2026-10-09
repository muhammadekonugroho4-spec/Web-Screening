package com.stockbit.component.fda.model;

import com.clevertap.android.sdk.Constants;
import com.stockbit.common.o;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    public static final b f71375h = null;

    /* renamed from: i, reason: collision with root package name */
    public static final a f71376i = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f71377a;

    /* renamed from: b, reason: collision with root package name */
    public final int f71378b;

    /* renamed from: c, reason: collision with root package name */
    public final int f71379c;
    public final d d;

    /* renamed from: e, reason: collision with root package name */
    public final C0708a f71380e;

    /* renamed from: f, reason: collision with root package name */
    public final int f71381f;

    /* renamed from: g, reason: collision with root package name */
    public final int f71382g;

    /* renamed from: com.stockbit.component.fda.model.a$a, reason: collision with other inner class name */
    public static final class C0708a {

        /* renamed from: a, reason: collision with root package name */
        public final C0709a f71383a;

        /* renamed from: b, reason: collision with root package name */
        public final C0709a f71384b;

        /* renamed from: c, reason: collision with root package name */
        public final C0709a f71385c;

        /* renamed from: com.stockbit.component.fda.model.a$a$a, reason: collision with other inner class name */
        public static final class C0709a {

            /* renamed from: a, reason: collision with root package name */
            public final int f71386a;

            /* renamed from: b, reason: collision with root package name */
            public final c f71387b;

            /* renamed from: c, reason: collision with root package name */
            public final c f71388c;
            public final c d;

            /* renamed from: e, reason: collision with root package name */
            public final c f71389e;

            /* renamed from: f, reason: collision with root package name */
            public final c f71390f;

            /* renamed from: g, reason: collision with root package name */
            public final c f71391g;

            static {
            }

            public C0709a(int r2, c r3, c r4, c r5, c r6, c r7, c r8) {
                p.l(r3, "fBuy");
                p.l(r4, "fSell");
                p.l(r5, "dBuy");
                p.l(r6, "dSell");
                p.l(r7, "foreign");
                p.l(r8, "domestic");
                this.f71386a = r2;
                this.f71387b = r3;
                this.f71388c = r4;
                this.d = r5;
                this.f71389e = r6;
                this.f71390f = r7;
                this.f71391g = r8;
            }

            public final c a() {
                return this.d;
            }

            public final c b() {
                return this.f71389e;
            }

            public final c c() {
                return this.f71391g;
            }

            public final c d() {
                return this.f71387b;
            }

            public final c e() {
                return this.f71388c;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof C0709a) == true) goto L8;
                return false;
            L8:
                C0709a r52 = (C0709a) r5;
                if (this.f71386a == r52.f71386a) goto L12;
                return false;
            L12:
                if (p.g(this.f71387b, r52.f71387b) == true) goto L15;
                return false;
            L15:
                if (p.g(this.f71388c, r52.f71388c) == true) goto L18;
                return false;
            L18:
                if (p.g(this.d, r52.d) == true) goto L21;
                return false;
            L21:
                if (p.g(this.f71389e, r52.f71389e) == true) goto L24;
                return false;
            L24:
                if (p.g(this.f71390f, r52.f71390f) == true) goto L27;
                return false;
            L27:
                if (p.g(this.f71391g, r52.f71391g) == true) goto L29;
                return false;
            L29:
                return true;
            }

            public final c f() {
                return this.f71390f;
            }

            public final int g() {
                return this.f71386a;
            }

            public int hashCode() {
                return (((((((((((Integer.hashCode(this.f71386a) * 31) + this.f71387b.hashCode()) * 31) + this.f71388c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f71389e.hashCode()) * 31) + this.f71390f.hashCode()) * 31) + this.f71391g.hashCode();
            }

            public String toString() {
                return "Chart(label=" + this.f71386a + ", fBuy=" + this.f71387b + ", fSell=" + this.f71388c + ", dBuy=" + this.d + ", dSell=" + this.f71389e + ", foreign=" + this.f71390f + ", domestic=" + this.f71391g + ')';
            }

            public /* synthetic */ C0709a(int r4, c r5, c r6, c r7, c r8, c r9, c r10, int r11, i r12) {
                int r02 = 0;
                if ((r11 & 1) == 0) goto L5;
                r4 = 0;
            L5:
                i r1 = null;
                int r2 = 3;
                if ((r11 & 2) == 0) goto L9;
                r5 = new c(r02, r02, r2, r1);
            L9:
                if ((r11 & 4) == 0) goto L12;
                r6 = new c(r02, r02, r2, r1);
            L12:
                if ((r11 & 8) == 0) goto L15;
                r7 = new c(r02, r02, r2, r1);
            L15:
                if ((r11 & 16) == 0) goto L18;
                r8 = new c(r02, r02, r2, r1);
            L18:
                if ((r11 & 32) == 0) goto L21;
                r9 = new c(r02, r02, r2, r1);
            L21:
                if ((r11 & 64) == 0) goto L23;
                r10 = new c(r02, r02, r2, r1);
            L23:
                c r112 = r10;
                c r102 = r9;
                c r92 = r8;
                c r82 = r7;
                c r72 = r6;
                this(r4, r5, r72, r82, r92, r102, r112);
            }
        }

        static {
        }

        public C0708a(C0709a r2, C0709a r3, C0709a r4) {
            p.l(r2, "value");
            p.l(r3, "volume");
            p.l(r4, Constants.KEY_FREQUENCY);
            this.f71383a = r2;
            this.f71384b = r3;
            this.f71385c = r4;
        }

        public final C0709a a() {
            return this.f71385c;
        }

        public final C0709a b() {
            return this.f71383a;
        }

        public final C0709a c() {
            return this.f71384b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C0708a) == true) goto L8;
            return false;
        L8:
            C0708a r52 = (C0708a) r5;
            if (p.g(this.f71383a, r52.f71383a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f71384b, r52.f71384b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f71385c, r52.f71385c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f71383a.hashCode() * 31) + this.f71384b.hashCode()) * 31) + this.f71385c.hashCode();
        }

        public String toString() {
            return "Charts(value=" + this.f71383a + ", volume=" + this.f71384b + ", frequency=" + this.f71385c + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(i r1) {
            this();
        }

        public final a a() {
            return a.a();
        }

        public b() {
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f71392a;

        /* renamed from: b, reason: collision with root package name */
        public final int f71393b;

        static {
        }

        public c(int r1, int r2) {
            this.f71392a = r1;
            this.f71393b = r2;
        }

        public final int a() {
            return this.f71392a;
        }

        public final int b() {
            return this.f71393b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (this.f71392a == r52.f71392a) goto L12;
            return false;
        L12:
            if (this.f71393b == r52.f71393b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f71392a) * 31) + Integer.hashCode(this.f71393b);
        }

        public String toString() {
            return "LabelValue(label=" + this.f71392a + ", value=" + this.f71393b + ')';
        }

        public /* synthetic */ c(int r2, int r3, int r4, i r5) {
            if ((r4 & 1) == 0) goto L6;
            r2 = 0;
        L6:
            if ((r4 & 2) == 0) goto L8;
            r3 = 0;
        L8:
            this(r2, r3);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final b f71394a;

        /* renamed from: b, reason: collision with root package name */
        public final c f71395b;

        /* renamed from: c, reason: collision with root package name */
        public final c f71396c;
        public final C0710a d;

        /* renamed from: com.stockbit.component.fda.model.a$d$a, reason: collision with other inner class name */
        public static final class C0710a {

            /* renamed from: a, reason: collision with root package name */
            public final c f71397a;

            /* renamed from: b, reason: collision with root package name */
            public final c f71398b;

            /* renamed from: c, reason: collision with root package name */
            public final c f71399c;

            static {
            }

            public C0710a(c r2, c r3, c r4) {
                p.l(r2, "allMarket");
                p.l(r3, "regular");
                p.l(r4, "cashNego");
                this.f71397a = r2;
                this.f71398b = r3;
                this.f71399c = r4;
            }

            public final c a() {
                return this.f71397a;
            }

            public final c b() {
                return this.f71399c;
            }

            public final c c() {
                return this.f71398b;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof C0710a) == true) goto L8;
                return false;
            L8:
                C0710a r52 = (C0710a) r5;
                if (p.g(this.f71397a, r52.f71397a) == true) goto L12;
                return false;
            L12:
                if (p.g(this.f71398b, r52.f71398b) == true) goto L15;
                return false;
            L15:
                if (p.g(this.f71399c, r52.f71399c) == true) goto L17;
                return false;
            L17:
                return true;
            }

            public int hashCode() {
                return (((this.f71397a.hashCode() * 31) + this.f71398b.hashCode()) * 31) + this.f71399c.hashCode();
            }

            public String toString() {
                return "NetForeign(allMarket=" + this.f71397a + ", regular=" + this.f71398b + ", cashNego=" + this.f71399c + ')';
            }

            public /* synthetic */ C0710a(c r4, c r5, c r6, int r7, i r8) {
                i r02 = null;
                int r1 = 3;
                int r2 = 0;
                if ((r7 & 1) == 0) goto L6;
                r4 = new c(r2, r2, r1, r02);
            L6:
                if ((r7 & 2) == 0) goto L9;
                r5 = new c(r2, r2, r1, r02);
            L9:
                if ((r7 & 4) == 0) goto L11;
                r6 = new c(r2, r2, r1, r02);
            L11:
                this(r4, r5, r6);
            }
        }

        public static final class b {

            /* renamed from: a, reason: collision with root package name */
            public final int f71400a;

            /* renamed from: b, reason: collision with root package name */
            public final int f71401b;

            static {
            }

            public b(int r1, int r2) {
                this.f71400a = r1;
                this.f71401b = r2;
            }

            public final int a() {
                return this.f71400a;
            }

            public final int b() {
                return this.f71401b;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof b) == true) goto L8;
                return false;
            L8:
                b r52 = (b) r5;
                if (this.f71400a == r52.f71400a) goto L12;
                return false;
            L12:
                if (this.f71401b == r52.f71401b) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                return (Integer.hashCode(this.f71400a) * 31) + Integer.hashCode(this.f71401b);
            }

            public String toString() {
                return "Tab(value=" + this.f71400a + ", volume=" + this.f71401b + ')';
            }

            public /* synthetic */ b(int r2, int r3, int r4, i r5) {
                if ((r4 & 1) == 0) goto L6;
                r2 = 0;
            L6:
                if ((r4 & 2) == 0) goto L8;
                r3 = 0;
            L8:
                this(r2, r3);
            }
        }

        static {
        }

        public d(b r2, c r3, c r4, C0710a r5) {
            p.l(r2, "tab");
            p.l(r3, "fBuy");
            p.l(r4, "fSell");
            p.l(r5, "netForeign");
            this.f71394a = r2;
            this.f71395b = r3;
            this.f71396c = r4;
            this.d = r5;
        }

        public final c a() {
            return this.f71395b;
        }

        public final c b() {
            return this.f71396c;
        }

        public final C0710a c() {
            return this.d;
        }

        public final b d() {
            return this.f71394a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof d) == true) goto L8;
            return false;
        L8:
            d r52 = (d) r5;
            if (p.g(this.f71394a, r52.f71394a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f71395b, r52.f71395b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f71396c, r52.f71396c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            return (((((this.f71394a.hashCode() * 31) + this.f71395b.hashCode()) * 31) + this.f71396c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "Summary(tab=" + this.f71394a + ", fBuy=" + this.f71395b + ", fSell=" + this.f71396c + ", netForeign=" + this.d + ')';
        }

        public /* synthetic */ d(b r7, c r8, c r9, C0710a r10, int r11, i r12) {
            i r02 = null;
            int r1 = 3;
            int r2 = 0;
            if ((r11 & 1) == 0) goto L6;
            r7 = new b(r2, r2, r1, r02);
        L6:
            if ((r11 & 2) == 0) goto L9;
            r8 = new c(r2, r2, r1, r02);
        L9:
            if ((r11 & 4) == 0) goto L12;
            r9 = new c(r2, r2, r1, r02);
        L12:
            if ((r11 & 8) == 0) goto L14;
            c r13 = null;
            c r22 = null;
            c r3 = null;
            r10 = new C0710a(r13, r22, r3, 7, null);
        L14:
            this(r7, r8, r9, r10);
        }
    }

    static {
        f71375h = new b(null);
        f71376i = new a(o.f61008y, o.f60986n, o.f60935J, new d(new d.b(o.f60951U, o.f60969f0), new c(o.f60984m0, o.f60987n0), new c(o.f60989o0, o.f60991p0), new d.C0710a(new c(o.f60988o, o.f60990p), new c(o.f60992q, o.f60994r), new c(o.f60996s, o.f60998t))), new C0708a(new C0708a.C0709a(o.f60982l0, new c(o.f61000u, o.f61002v), new c(o.f61004w, o.f61006x), new c(o.f61010z, o.f60917A), new c(o.f60919B, o.f60921C), new c(o.f60923D, o.f60925E), new c(o.f60927F, o.f60929G)), new C0708a.C0709a(o.f60980k0, new c(o.f60931H, o.f60933I), new c(o.f60937K, o.f60939L), new c(o.f60941M, o.f60943N), new c(o.f60945O, o.f60946P), new c(o.f60947Q, o.f60948R), new c(o.f60949S, o.f60950T)), new C0708a.C0709a(o.f60978j0, new c(o.f60952V, o.f60953W), new c(o.f60954X, o.f60955Y), new c(o.f60956Z, o.f60958a0), new c(o.f60961b0, o.f60963c0), new c(o.f60964d0, o.f60967e0), new c(o.f60971g0, o.f60973h0))), o.f60975i0, o.S4);
    }

    public a(int r2, int r3, int r4, d r5, C0708a r6, int r7, int r8) {
        p.l(r5, "summary");
        p.l(r6, "charts");
        this.f71377a = r2;
        this.f71378b = r3;
        this.f71379c = r4;
        this.d = r5;
        this.f71380e = r6;
        this.f71381f = r7;
        this.f71382g = r8;
    }

    public static final /* synthetic */ a a() {
        return f71376i;
    }

    public final C0708a b() {
        return this.f71380e;
    }

    public final int c() {
        return this.f71381f;
    }

    public final int d() {
        return this.f71378b;
    }

    public final int e() {
        return this.f71379c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f71377a == r52.f71377a) goto L12;
        return false;
    L12:
        if (this.f71378b == r52.f71378b) goto L15;
        return false;
    L15:
        if (this.f71379c == r52.f71379c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f71380e, r52.f71380e) == true) goto L24;
        return false;
    L24:
        if (this.f71381f == r52.f71381f) goto L27;
        return false;
    L27:
        if (this.f71382g == r52.f71382g) goto L29;
        return false;
    L29:
        return true;
    }

    public final d f() {
        return this.d;
    }

    public final int g() {
        return this.f71377a;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.f71377a) * 31) + Integer.hashCode(this.f71378b)) * 31) + Integer.hashCode(this.f71379c)) * 31) + this.d.hashCode()) * 31) + this.f71380e.hashCode()) * 31) + Integer.hashCode(this.f71381f)) * 31) + Integer.hashCode(this.f71382g);
    }

    public String toString() {
        return "FDATagId(title=" + this.f71377a + ", marketType=" + this.f71378b + ", period=" + this.f71379c + ", summary=" + this.d + ", charts=" + this.f71380e + ", lastUpdated=" + this.f71381f + ", dropDown=" + this.f71382g + ')';
    }
}
