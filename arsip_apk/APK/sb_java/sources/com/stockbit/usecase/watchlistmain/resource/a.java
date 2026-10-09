package com.stockbit.usecase.watchlistmain.resource;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.watchlistmain.resource.a$a, reason: collision with other inner class name */
    public static final class C1729a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.watchlistmain.failure.a f164695a;

        public C1729a(com.stockbit.usecase.watchlistmain.failure.a r2) {
            p.l(r2, "failure");
            super(null);
            this.f164695a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1729a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164695a, ((C1729a) r4).f164695a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164695a.hashCode();
        }

        public String toString() {
            return "Failed(failure=" + this.f164695a + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f164696a = null;

        static {
            f164696a = new b();
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
            return -389240420;
        }

        public String toString() {
            return "Success";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
