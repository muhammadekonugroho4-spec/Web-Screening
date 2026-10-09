package com.stockbit.usecase.cryptoportfolio.resource;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.cryptoportfolio.resource.a$a, reason: collision with other inner class name */
    public static final class C1457a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.cryptoportfolio.failure.a f157364a;

        public C1457a(com.stockbit.usecase.cryptoportfolio.failure.a r2) {
            p.l(r2, "failure");
            super(null);
            this.f157364a = r2;
        }

        public final com.stockbit.usecase.cryptoportfolio.failure.a a() {
            return this.f157364a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1457a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157364a, ((C1457a) r4).f157364a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f157364a.hashCode();
        }

        public String toString() {
            return "Error(failure=" + this.f157364a + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f157365a;

        public b(Object r2) {
            super(null);
            this.f157365a = r2;
        }

        public final Object a() {
            return this.f157365a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157365a, ((b) r4).f157365a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            Object r02 = this.f157365a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f157365a + ")";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
