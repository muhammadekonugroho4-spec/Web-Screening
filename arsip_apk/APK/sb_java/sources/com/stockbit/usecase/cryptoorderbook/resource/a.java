package com.stockbit.usecase.cryptoorderbook.resource;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.cryptoorderbook.resource.a$a, reason: collision with other inner class name */
    public static final class C1454a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.cryptoorderbook.failure.a f157310a;

        public C1454a(com.stockbit.usecase.cryptoorderbook.failure.a r2) {
            p.l(r2, "failure");
            super(null);
            this.f157310a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1454a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157310a, ((C1454a) r4).f157310a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f157310a.hashCode();
        }

        public String toString() {
            return "Error(failure=" + this.f157310a + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f157311a;

        public b(Object r2) {
            super(null);
            this.f157311a = r2;
        }

        public final Object a() {
            return this.f157311a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157311a, ((b) r4).f157311a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            Object r02 = this.f157311a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f157311a + ")";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
