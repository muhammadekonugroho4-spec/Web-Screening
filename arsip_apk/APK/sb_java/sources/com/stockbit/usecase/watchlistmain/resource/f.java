package com.stockbit.usecase.watchlistmain.resource;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class f {

    public static final class a extends f {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.watchlistmain.failure.a f164707a;

        public a(com.stockbit.usecase.watchlistmain.failure.a r2) {
            p.l(r2, "failure");
            super(null);
            this.f164707a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164707a, ((a) r4).f164707a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164707a.hashCode();
        }

        public String toString() {
            return "Failed(failure=" + this.f164707a + ")";
        }
    }

    public static final class b extends f {

        /* renamed from: a, reason: collision with root package name */
        public final List f164708a;

        public b(List r2) {
            p.l(r2, "companies");
            super(null);
            this.f164708a = r2;
        }

        public final List a() {
            return this.f164708a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164708a, ((b) r4).f164708a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164708a.hashCode();
        }

        public String toString() {
            return "Success(companies=" + this.f164708a + ")";
        }
    }

    public /* synthetic */ f(i r1) {
        this();
    }

    public f() {
    }
}
