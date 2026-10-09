package com.stockbit.company.widget.config;

/* loaded from: classes7.dex */
public interface E {

    public static final class a implements E {

        /* renamed from: a, reason: collision with root package name */
        public static final a f68900a = null;

        static {
            f68900a = new a();
        }

        public a() {
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
            return 1213015799;
        }

        public String toString() {
            return "HideStockPicker";
        }
    }

    public static final class b implements E {

        /* renamed from: a, reason: collision with root package name */
        public static final b f68901a = null;

        static {
            f68901a = new b();
        }

        public b() {
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
            return 1033457224;
        }

        public String toString() {
            return "Save";
        }
    }

    public static final class c implements E {

        /* renamed from: a, reason: collision with root package name */
        public final String f68902a;

        static {
        }

        public c(String r2) {
            kotlin.jvm.internal.p.l(r2, "query");
            this.f68902a = r2;
        }

        public final String a() {
            return this.f68902a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f68902a, ((c) r4).f68902a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f68902a.hashCode();
        }

        public String toString() {
            return "SearchQueryChanged(query=" + this.f68902a + ')';
        }
    }

    public static final class d implements E {

        /* renamed from: a, reason: collision with root package name */
        public final String f68903a;

        static {
        }

        public d(String r2) {
            kotlin.jvm.internal.p.l(r2, "symbol");
            this.f68903a = r2;
        }

        public final String a() {
            return this.f68903a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f68903a, ((d) r4).f68903a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f68903a.hashCode();
        }

        public String toString() {
            return "SelectStock(symbol=" + this.f68903a + ')';
        }
    }

    public static final class e implements E {

        /* renamed from: a, reason: collision with root package name */
        public static final e f68904a = null;

        static {
            f68904a = new e();
        }

        public e() {
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
            return 217831004;
        }

        public String toString() {
            return "ShowStockPicker";
        }
    }
}
