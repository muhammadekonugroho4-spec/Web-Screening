package com.stockbit.usecase.watchlistmain.resource;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class e {

    public static final class a extends e {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.watchlistmain.failure.a f164705a;

        public a(com.stockbit.usecase.watchlistmain.failure.a r2) {
            p.l(r2, "failure");
            super(null);
            this.f164705a = r2;
        }

        public final com.stockbit.usecase.watchlistmain.failure.a a() {
            return this.f164705a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164705a, ((a) r4).f164705a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164705a.hashCode();
        }

        public String toString() {
            return "Failed(failure=" + this.f164705a + ")";
        }
    }

    public static final class b extends e {

        /* renamed from: a, reason: collision with root package name */
        public static final b f164706a = null;

        static {
            f164706a = new b();
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
            return -529443272;
        }

        public String toString() {
            return "Success";
        }
    }

    public /* synthetic */ e(i r1) {
        this();
    }

    public e() {
    }
}
