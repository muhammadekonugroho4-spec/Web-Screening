package com.stockbit.usecase.cryptotransaction.failure;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.cryptotransaction.failure.a$a, reason: collision with other inner class name */
    public static final class C1458a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1458a f157451a = null;

        static {
            f157451a = new C1458a();
        }

        public C1458a() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1458a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1940917537;
        }

        public String toString() {
            return "OrderRejected";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f157452a = null;

        static {
            f157452a = new b();
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
            return 2029871903;
        }

        public String toString() {
            return "Unauthorized";
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f157453a;

        public c(String r2) {
            super(null);
            this.f157453a = r2;
        }

        public final String a() {
            return this.f157453a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157453a, ((c) r4).f157453a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            String r02 = this.f157453a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "Unknown(code=" + this.f157453a + ")";
        }

        public /* synthetic */ c(String r1, int r2, i r3) {
            if ((r2 & 1) == 0) goto L5;
            r1 = null;
        L5:
            this(r1);
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
