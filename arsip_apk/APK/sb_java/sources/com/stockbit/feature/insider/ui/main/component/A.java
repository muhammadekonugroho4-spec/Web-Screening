package com.stockbit.feature.insider.ui.main.component;

/* loaded from: classes9.dex */
public abstract class A {

    public static final class a extends A {

        /* renamed from: a, reason: collision with root package name */
        public final int f98826a;

        /* renamed from: b, reason: collision with root package name */
        public final int f98827b;

        /* renamed from: c, reason: collision with root package name */
        public final int f98828c;
        public final int d;

        static {
        }

        public a(int r2, int r3, int r4, int r5) {
            super(null);
            this.f98826a = r2;
            this.f98827b = r3;
            this.f98828c = r4;
            this.d = r5;
        }

        public final int a() {
            return this.f98827b;
        }

        public final int b() {
            return this.d;
        }

        public final int c() {
            return this.f98828c;
        }

        public final int d() {
            return this.f98826a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (this.f98826a == r52.f98826a) goto L12;
            return false;
        L12:
            if (this.f98827b == r52.f98827b) goto L15;
            return false;
        L15:
            if (this.f98828c == r52.f98828c) goto L18;
            return false;
        L18:
            if (this.d == r52.d) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.f98826a) * 31) + Integer.hashCode(this.f98827b)) * 31) + Integer.hashCode(this.f98828c)) * 31) + Integer.hashCode(this.d);
        }

        public String toString() {
            return "FirstRowTag(date=" + this.f98826a + ", action=" + this.f98827b + ", code=" + this.f98828c + ", chevron=" + this.d + ')';
        }

        public /* synthetic */ a(int r1, int r2, int r3, int r4, int r5, kotlin.jvm.internal.i r6) {
            if ((r5 & 1) == 0) goto L6;
            r1 = com.stockbit.common.o.T0;
        L6:
            if ((r5 & 2) == 0) goto L9;
            r2 = com.stockbit.common.o.O0;
        L9:
            if ((r5 & 4) == 0) goto L12;
            r3 = com.stockbit.common.o.U0;
        L12:
            if ((r5 & 8) == 0) goto L14;
            r4 = com.stockbit.common.o.f60995r0;
        L14:
            this(r1, r2, r3, r4);
        }
    }

    public static abstract class b extends A {

        /* renamed from: a, reason: collision with root package name */
        public final int f98829a;

        /* renamed from: b, reason: collision with root package name */
        public final int f98830b;

        /* renamed from: c, reason: collision with root package name */
        public final int f98831c;

        public static final class a extends b {
            public static final a d = null;

            static {
                d = new a();
            }

            public a() {
                int r3 = 0;
                super(com.stockbit.common.o.f60936J0, com.stockbit.common.o.f60938K0, r3, 4, null);
            }
        }

        /* renamed from: com.stockbit.feature.insider.ui.main.component.A$b$b, reason: collision with other inner class name */
        public static final class C0917b extends b {
            public static final C0917b d = null;

            static {
                d = new C0917b();
            }

            public C0917b() {
                super(com.stockbit.common.o.f61003v0, com.stockbit.common.o.f61005w0, com.stockbit.common.o.f61007x0, null);
            }
        }

        public static final class c extends b {
            public static final c d = null;

            static {
                d = new c();
            }

            public c() {
                super(com.stockbit.common.o.f61009y0, com.stockbit.common.o.f61011z0, com.stockbit.common.o.f60918A0, null);
            }
        }

        public static final class d extends b {
            public static final d d = null;

            static {
                d = new d();
            }

            public d() {
                int r3 = 0;
                super(com.stockbit.common.o.f60922C0, com.stockbit.common.o.f60924D0, r3, 4, null);
            }
        }

        public static final class e extends b {
            public static final e d = null;

            static {
                d = new e();
            }

            public e() {
                int r3 = 0;
                super(com.stockbit.common.o.f60930G0, com.stockbit.common.o.f60932H0, r3, 4, null);
            }
        }

        public static final class f extends b {
            public static final f d = null;

            static {
                d = new f();
            }

            public f() {
                int r3 = 0;
                super(com.stockbit.common.o.f60926E0, com.stockbit.common.o.f60928F0, r3, 4, null);
            }
        }

        static {
        }

        public /* synthetic */ b(int r1, int r2, int r3, kotlin.jvm.internal.i r4) {
            this(r1, r2, r3);
        }

        public final int a() {
            return this.f98829a;
        }

        public final int b() {
            return this.f98830b;
        }

        public final int c() {
            return this.f98831c;
        }

        public b(int r2, int r3, int r4) {
            super(null);
            this.f98829a = r2;
            this.f98830b = r3;
            this.f98831c = r4;
        }

        public /* synthetic */ b(int r1, int r2, int r3, int r4, kotlin.jvm.internal.i r5) {
            if ((r4 & 4) == 0) goto L5;
            r3 = -1;
        L5:
            this(r1, r2, r3, null);
        }
    }

    public static final class c extends A {

        /* renamed from: a, reason: collision with root package name */
        public final int f98832a;

        /* renamed from: b, reason: collision with root package name */
        public final int f98833b;

        /* renamed from: c, reason: collision with root package name */
        public final int f98834c;
        public final int d;

        static {
        }

        public c(int r2, int r3, int r4, int r5) {
            super(null);
            this.f98832a = r2;
            this.f98833b = r3;
            this.f98834c = r4;
            this.d = r5;
        }

        public final int a() {
            return this.f98834c;
        }

        public final int b() {
            return this.d;
        }

        public final int c() {
            return this.f98832a;
        }

        public final int d() {
            return this.f98833b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (this.f98832a == r52.f98832a) goto L12;
            return false;
        L12:
            if (this.f98833b == r52.f98833b) goto L15;
            return false;
        L15:
            if (this.f98834c == r52.f98834c) goto L18;
            return false;
        L18:
            if (this.d == r52.d) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.f98832a) * 31) + Integer.hashCode(this.f98833b)) * 31) + Integer.hashCode(this.f98834c)) * 31) + Integer.hashCode(this.d);
        }

        public String toString() {
            return "SecondRowTag(percentage=" + this.f98832a + ", value=" + this.f98833b + ", badge=" + this.f98834c + ", name=" + this.d + ')';
        }

        public /* synthetic */ c(int r1, int r2, int r3, int r4, int r5, kotlin.jvm.internal.i r6) {
            if ((r5 & 1) == 0) goto L6;
            r1 = com.stockbit.common.o.f61001u0;
        L6:
            if ((r5 & 2) == 0) goto L9;
            r2 = com.stockbit.common.o.f60999t0;
        L9:
            if ((r5 & 4) == 0) goto L12;
            r3 = com.stockbit.common.o.f60934I0;
        L12:
            if ((r5 & 8) == 0) goto L14;
            r4 = com.stockbit.common.o.f60997s0;
        L14:
            this(r1, r2, r3, r4);
        }
    }

    static {
    }

    public /* synthetic */ A(kotlin.jvm.internal.i r1) {
        this();
    }

    public A() {
    }
}
