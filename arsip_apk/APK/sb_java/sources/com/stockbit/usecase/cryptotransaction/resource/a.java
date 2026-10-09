package com.stockbit.usecase.cryptotransaction.resource;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.cryptotransaction.resource.a$a, reason: collision with other inner class name */
    public static final class C1459a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.cryptotransaction.failure.a f157454a;

        public C1459a(com.stockbit.usecase.cryptotransaction.failure.a r2) {
            p.l(r2, "failure");
            super(null);
            this.f157454a = r2;
        }

        public final com.stockbit.usecase.cryptotransaction.failure.a a() {
            return this.f157454a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1459a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157454a, ((C1459a) r4).f157454a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f157454a.hashCode();
        }

        public String toString() {
            return "Failed(failure=" + this.f157454a + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f157455a;

        public b(Object r2) {
            super(null);
            this.f157455a = r2;
        }

        public final Object a() {
            return this.f157455a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157455a, ((b) r4).f157455a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            Object r02 = this.f157455a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f157455a + ")";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
