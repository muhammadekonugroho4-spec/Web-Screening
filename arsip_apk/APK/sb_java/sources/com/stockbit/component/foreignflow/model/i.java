package com.stockbit.component.foreignflow.model;

/* loaded from: classes7.dex */
public interface i {

    public static final class a implements i {

        /* renamed from: a, reason: collision with root package name */
        public static final a f71961a = null;

        static {
            f71961a = new a();
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
            return -1045983948;
        }

        public String toString() {
            return "Empty";
        }
    }

    public static final class b implements i {

        /* renamed from: a, reason: collision with root package name */
        public static final b f71962a = null;

        static {
            f71962a = new b();
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
            return -1045833233;
        }

        public String toString() {
            return "Error";
        }
    }

    public static final class c implements i {

        /* renamed from: a, reason: collision with root package name */
        public static final c f71963a = null;

        static {
            f71963a = new c();
        }

        public c() {
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
            return 1792248675;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class d implements i {

        /* renamed from: a, reason: collision with root package name */
        public final Object f71964a;

        static {
        }

        public d(Object r1) {
            this.f71964a = r1;
        }

        public final Object a() {
            return this.f71964a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f71964a, ((d) r4).f71964a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            Object r02 = this.f71964a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f71964a + ')';
        }
    }
}
