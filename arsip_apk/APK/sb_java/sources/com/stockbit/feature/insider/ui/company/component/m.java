package com.stockbit.feature.insider.ui.company.component;

/* loaded from: classes9.dex */
public abstract class m {

    public static final class a extends m {

        /* renamed from: a, reason: collision with root package name */
        public final int f98589a;

        /* renamed from: b, reason: collision with root package name */
        public final int f98590b;

        /* renamed from: c, reason: collision with root package name */
        public final int f98591c;

        static {
        }

        public a(int r2, int r3, int r4) {
            super(null);
            this.f98589a = r2;
            this.f98590b = r3;
            this.f98591c = r4;
        }

        public final int a() {
            return this.f98590b;
        }

        public final int b() {
            return this.f98591c;
        }

        public final int c() {
            return this.f98589a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (this.f98589a == r52.f98589a) goto L12;
            return false;
        L12:
            if (this.f98590b == r52.f98590b) goto L15;
            return false;
        L15:
            if (this.f98591c == r52.f98591c) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f98589a) * 31) + Integer.hashCode(this.f98590b)) * 31) + Integer.hashCode(this.f98591c);
        }

        public String toString() {
            return "FirstRowTag(date=" + this.f98589a + ", action=" + this.f98590b + ", chevron=" + this.f98591c + ')';
        }

        public /* synthetic */ a(int r1, int r2, int r3, int r4, kotlin.jvm.internal.i r5) {
            if ((r4 & 1) == 0) goto L6;
            r1 = com.stockbit.common.o.K1;
        L6:
            if ((r4 & 2) == 0) goto L9;
            r2 = com.stockbit.common.o.L1;
        L9:
            if ((r4 & 4) == 0) goto L11;
            r3 = com.stockbit.common.o.M1;
        L11:
            this(r1, r2, r3);
        }
    }

    public static abstract class b extends m {

        /* renamed from: a, reason: collision with root package name */
        public final int f98592a;

        /* renamed from: b, reason: collision with root package name */
        public final int f98593b;

        /* renamed from: c, reason: collision with root package name */
        public final int f98594c;

        public static final class a extends b {
            public static final a d = null;

            static {
                d = new a();
            }

            public a() {
                int r3 = 0;
                super(com.stockbit.common.o.H1, com.stockbit.common.o.I1, r3, 4, null);
            }
        }

        /* renamed from: com.stockbit.feature.insider.ui.company.component.m$b$b, reason: collision with other inner class name */
        public static final class C0916b extends b {
            public static final C0916b d = null;

            static {
                d = new C0916b();
            }

            public C0916b() {
                super(com.stockbit.common.o.t1, com.stockbit.common.o.u1, com.stockbit.common.o.v1, null);
            }
        }

        public static final class c extends b {
            public static final c d = null;

            static {
                d = new c();
            }

            public c() {
                super(com.stockbit.common.o.w1, com.stockbit.common.o.x1, com.stockbit.common.o.y1, null);
            }
        }

        public static final class d extends b {
            public static final d d = null;

            static {
                d = new d();
            }

            public d() {
                int r3 = 0;
                super(com.stockbit.common.o.z1, com.stockbit.common.o.A1, r3, 4, null);
            }
        }

        public static final class e extends b {
            public static final e d = null;

            static {
                d = new e();
            }

            public e() {
                int r3 = 0;
                super(com.stockbit.common.o.E1, com.stockbit.common.o.F1, r3, 4, null);
            }
        }

        public static final class f extends b {
            public static final f d = null;

            static {
                d = new f();
            }

            public f() {
                int r3 = 0;
                super(com.stockbit.common.o.B1, com.stockbit.common.o.C1, r3, 4, null);
            }
        }

        static {
        }

        public /* synthetic */ b(int r1, int r2, int r3, kotlin.jvm.internal.i r4) {
            this(r1, r2, r3);
        }

        public final int a() {
            return this.f98592a;
        }

        public final int b() {
            return this.f98593b;
        }

        public final int c() {
            return this.f98594c;
        }

        public b(int r2, int r3, int r4) {
            super(null);
            this.f98592a = r2;
            this.f98593b = r3;
            this.f98594c = r4;
        }

        public /* synthetic */ b(int r1, int r2, int r3, int r4, kotlin.jvm.internal.i r5) {
            if ((r4 & 4) == 0) goto L5;
            r3 = -1;
        L5:
            this(r1, r2, r3, null);
        }
    }

    public static final class c extends m {

        /* renamed from: a, reason: collision with root package name */
        public final int f98595a;

        /* renamed from: b, reason: collision with root package name */
        public final int f98596b;

        /* renamed from: c, reason: collision with root package name */
        public final int f98597c;
        public final int d;

        static {
        }

        public c(int r2, int r3, int r4, int r5) {
            super(null);
            this.f98595a = r2;
            this.f98596b = r3;
            this.f98597c = r4;
            this.d = r5;
        }

        public final int a() {
            return this.f98597c;
        }

        public final int b() {
            return this.d;
        }

        public final int c() {
            return this.f98595a;
        }

        public final int d() {
            return this.f98596b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (this.f98595a == r52.f98595a) goto L12;
            return false;
        L12:
            if (this.f98596b == r52.f98596b) goto L15;
            return false;
        L15:
            if (this.f98597c == r52.f98597c) goto L18;
            return false;
        L18:
            if (this.d == r52.d) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.f98595a) * 31) + Integer.hashCode(this.f98596b)) * 31) + Integer.hashCode(this.f98597c)) * 31) + Integer.hashCode(this.d);
        }

        public String toString() {
            return "SecondRowTag(percentage=" + this.f98595a + ", value=" + this.f98596b + ", badge=" + this.f98597c + ", name=" + this.d + ')';
        }

        public /* synthetic */ c(int r1, int r2, int r3, int r4, int r5, kotlin.jvm.internal.i r6) {
            if ((r5 & 1) == 0) goto L6;
            r1 = com.stockbit.common.o.P1;
        L6:
            if ((r5 & 2) == 0) goto L9;
            r2 = com.stockbit.common.o.O1;
        L9:
            if ((r5 & 4) == 0) goto L12;
            r3 = com.stockbit.common.o.G1;
        L12:
            if ((r5 & 8) == 0) goto L14;
            r4 = com.stockbit.common.o.N1;
        L14:
            this(r1, r2, r3, r4);
        }
    }

    static {
    }

    public /* synthetic */ m(kotlin.jvm.internal.i r1) {
        this();
    }

    public m() {
    }
}
