package com.stockbit.usecase.cryptodetail.resource;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.cryptodetail.resource.a$a, reason: collision with other inner class name */
    public static final class C1449a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.cryptodetail.failure.a f157102a;

        public C1449a(com.stockbit.usecase.cryptodetail.failure.a r2) {
            p.l(r2, "failure");
            super(null);
            this.f157102a = r2;
        }

        public final com.stockbit.usecase.cryptodetail.failure.a a() {
            return this.f157102a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1449a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157102a, ((C1449a) r4).f157102a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f157102a.hashCode();
        }

        public String toString() {
            return "Error(failure=" + this.f157102a + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f157103a;

        public b(Object r2) {
            super(null);
            this.f157103a = r2;
        }

        public final Object a() {
            return this.f157103a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157103a, ((b) r4).f157103a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            Object r02 = this.f157103a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f157103a + ")";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
