package com.stockbit.company.ui.analyst;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: com.stockbit.company.ui.analyst.a$a, reason: collision with other inner class name */
    public static final class C0653a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0653a f64821a = null;

        static {
            f64821a = new C0653a();
        }

        public C0653a() {
            super(null);
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final int f64822a;

        /* renamed from: b, reason: collision with root package name */
        public final int f64823b;

        static {
        }

        public b(int r2, int r3) {
            super(null);
            this.f64822a = r2;
            this.f64823b = r3;
        }

        public final int a() {
            return this.f64823b;
        }

        public final int b() {
            return this.f64822a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (this.f64822a == r52.f64822a) goto L12;
            return false;
        L12:
            if (this.f64823b == r52.f64823b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f64822a) * 31) + Integer.hashCode(this.f64823b);
        }

        public String toString() {
            return "ShowInformationDialog(title=" + this.f64822a + ", subtitle=" + this.f64823b + ')';
        }
    }

    static {
    }

    public /* synthetic */ a(kotlin.jvm.internal.i r1) {
        this();
    }

    public a() {
    }
}
