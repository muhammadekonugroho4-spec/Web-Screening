package com.stockbit.usecase.cryptowithdrawal.resource;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.cryptowithdrawal.resource.a$a, reason: collision with other inner class name */
    public static final class C1461a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.cryptowithdrawal.failure.a f157503a;

        public C1461a(com.stockbit.usecase.cryptowithdrawal.failure.a r2) {
            p.l(r2, "failure");
            super(null);
            this.f157503a = r2;
        }

        public final com.stockbit.usecase.cryptowithdrawal.failure.a a() {
            return this.f157503a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1461a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157503a, ((C1461a) r4).f157503a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f157503a.hashCode();
        }

        public String toString() {
            return "Error(failure=" + this.f157503a + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f157504a;

        public b(Object r2) {
            super(null);
            this.f157504a = r2;
        }

        public final Object a() {
            return this.f157504a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157504a, ((b) r4).f157504a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            Object r02 = this.f157504a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f157504a + ")";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
