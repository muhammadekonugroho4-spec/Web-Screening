package com.stockbit.feature.verification.ui.dukcapil;

/* loaded from: classes10.dex */
public interface a {

    /* renamed from: com.stockbit.feature.verification.ui.dukcapil.a$a, reason: collision with other inner class name */
    public static final class C1030a implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1030a f118910a = null;

        static {
            f118910a = new C1030a();
        }

        public C1030a() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1030a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -804402109;
        }

        public String toString() {
            return "NoInternetConnection";
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f118911a;

        static {
        }

        public b(String r2) {
            kotlin.jvm.internal.p.l(r2, "message");
            this.f118911a = r2;
        }

        public final String a() {
            return this.f118911a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f118911a, ((b) r4).f118911a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f118911a.hashCode();
        }

        public String toString() {
            return "RequestLimitExceeded(message=" + this.f118911a + ')';
        }
    }

    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f118912a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f118913b;

        static {
        }

        public c(String r2, boolean r3) {
            kotlin.jvm.internal.p.l(r2, "message");
            this.f118912a = r2;
            this.f118913b = r3;
        }

        public final String a() {
            return this.f118912a;
        }

        public final boolean b() {
            return this.f118913b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (kotlin.jvm.internal.p.g(this.f118912a, r52.f118912a) == true) goto L12;
            return false;
        L12:
            if (this.f118913b == r52.f118913b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f118912a.hashCode() * 31) + Boolean.hashCode(this.f118913b);
        }

        public String toString() {
            return "SomethingWentWrong(message=" + this.f118912a + ", retryable=" + this.f118913b + ')';
        }
    }

    public static final class d implements a {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.verification.model.a f118914a;

        static {
        }

        public d(com.stockbit.usecase.verification.model.a r2) {
            kotlin.jvm.internal.p.l(r2, "nextChallenge");
            this.f118914a = r2;
        }

        public final com.stockbit.usecase.verification.model.a a() {
            return this.f118914a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f118914a, ((d) r4).f118914a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f118914a.hashCode();
        }

        public String toString() {
            return "Success(nextChallenge=" + this.f118914a + ')';
        }
    }

    public static final class e implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f118915a;

        static {
        }

        public e(String r2) {
            kotlin.jvm.internal.p.l(r2, "message");
            this.f118915a = r2;
        }

        public final String a() {
            return this.f118915a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof e) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f118915a, ((e) r4).f118915a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f118915a.hashCode();
        }

        public String toString() {
            return "VerificationFailed(message=" + this.f118915a + ')';
        }
    }
}
