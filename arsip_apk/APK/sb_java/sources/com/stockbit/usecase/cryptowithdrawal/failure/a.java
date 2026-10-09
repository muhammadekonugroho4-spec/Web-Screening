package com.stockbit.usecase.cryptowithdrawal.failure;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.cryptowithdrawal.failure.a$a, reason: collision with other inner class name */
    public static final class C1460a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1460a f157500a = null;

        static {
            f157500a = new C1460a();
        }

        public C1460a() {
            super(null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1460a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -1065336881;
        }

        public String toString() {
            return "NetworkError";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f157501a = null;

        static {
            f157501a = new b();
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
            return -400890807;
        }

        public String toString() {
            return "Unauthorized";
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f157502a;

        public c(String r2) {
            super(null);
            this.f157502a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157502a, ((c) r4).f157502a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            String r02 = this.f157502a;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "Unknown(message=" + this.f157502a + ")";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
