package com.stockbit.usecase.brokerflow.chart.model;

/* loaded from: classes11.dex */
public interface a {

    /* renamed from: com.stockbit.usecase.brokerflow.chart.model.a$a, reason: collision with other inner class name */
    public static final class C1417a implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1417a f154948a = null;

        static {
            f154948a = new C1417a();
        }

        public C1417a() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1417a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 519082119;
        }

        public String toString() {
            return "Clear";
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f154949a;

        public b(boolean r1) {
            this.f154949a = r1;
        }

        public final boolean a() {
            return this.f154949a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (this.f154949a == ((b) r4).f154949a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f154949a);
        }

        public String toString() {
            return "Set(enabled=" + this.f154949a + ")";
        }
    }
}
