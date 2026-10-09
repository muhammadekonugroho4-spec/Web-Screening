package com.stockbit.usecase.watchlistmain.resource;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f164699a = null;

        static {
            f164699a = new a();
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
            return 1716369492;
        }

        public String toString() {
            return "Empty";
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.watchlistmain.failure.a f164700a;

        public b(com.stockbit.usecase.watchlistmain.failure.a r2) {
            p.l(r2, "failure");
            super(null);
            this.f164700a = r2;
        }

        public final com.stockbit.usecase.watchlistmain.failure.a a() {
            return this.f164700a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f164700a, ((b) r4).f164700a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164700a.hashCode();
        }

        public String toString() {
            return "Failed(failure=" + this.f164700a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.watchlistmain.resource.c$c, reason: collision with other inner class name */
    public static final class C1731c extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final C1731c f164701a = null;

        static {
            f164701a = new C1731c();
        }

        public C1731c() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1731c) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -79704758;
        }

        public String toString() {
            return "Success";
        }
    }

    public /* synthetic */ c(i r1) {
        this();
    }

    public c() {
    }
}
