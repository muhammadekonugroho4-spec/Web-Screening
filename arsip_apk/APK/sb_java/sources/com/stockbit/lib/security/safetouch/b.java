package com.stockbit.lib.security.safetouch;

import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f120456a = null;

        static {
            f120456a = new a();
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
            return 914119941;
        }

        public String toString() {
            return "Debounced";
        }
    }

    /* renamed from: com.stockbit.lib.security.safetouch.b$b, reason: collision with other inner class name */
    public static final class C1045b implements b {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.lib.security.safetouch.a f120457a;

        static {
        }

        public C1045b(com.stockbit.lib.security.safetouch.a r2) {
            p.l(r2, "details");
            this.f120457a = r2;
        }

        public final com.stockbit.lib.security.safetouch.a a() {
            return this.f120457a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1045b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f120457a, ((C1045b) r4).f120457a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f120457a.hashCode();
        }

        public String toString() {
            return "Safe(details=" + this.f120457a + ")";
        }
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.lib.security.safetouch.a f120458a;

        static {
        }

        public c(com.stockbit.lib.security.safetouch.a r2) {
            p.l(r2, "details");
            this.f120458a = r2;
        }

        public final com.stockbit.lib.security.safetouch.a a() {
            return this.f120458a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f120458a, ((c) r4).f120458a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f120458a.hashCode();
        }

        public String toString() {
            return "Suspicious(details=" + this.f120458a + ")";
        }
    }

    public static final class d implements b {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.lib.security.safetouch.a f120459a;

        static {
        }

        public d(com.stockbit.lib.security.safetouch.a r2) {
            p.l(r2, "details");
            this.f120459a = r2;
        }

        public final com.stockbit.lib.security.safetouch.a a() {
            return this.f120459a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f120459a, ((d) r4).f120459a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f120459a.hashCode();
        }

        public String toString() {
            return "Unsafe(details=" + this.f120459a + ")";
        }
    }
}
