package com.stockbit.feature.transaction.ui.fasttrade.model;

/* loaded from: classes9.dex */
public abstract class l {

    public static final class a extends l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f114134a = null;

        static {
            f114134a = new a();
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
            return -2000107912;
        }

        public String toString() {
            return "HardLimit";
        }
    }

    public static final class b extends l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f114135a = null;

        static {
            f114135a = new b();
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
            return 1615883600;
        }

        public String toString() {
            return "None";
        }
    }

    public static final class c extends l {

        /* renamed from: a, reason: collision with root package name */
        public final int f114136a;

        static {
        }

        public c(int r2) {
            super(null);
            this.f114136a = r2;
        }

        public final int a() {
            return this.f114136a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (this.f114136a == ((c) r4).f114136a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Integer.hashCode(this.f114136a);
        }

        public String toString() {
            return "SoftLimit(todayCount=" + this.f114136a + ')';
        }
    }

    static {
    }

    public /* synthetic */ l(kotlin.jvm.internal.i r1) {
        this();
    }

    public l() {
    }
}
