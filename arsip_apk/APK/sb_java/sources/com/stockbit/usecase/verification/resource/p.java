package com.stockbit.usecase.verification.resource;

/* loaded from: classes2.dex */
public interface p {

    public static final class a implements p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f164508a = null;

        static {
            f164508a = new a();
        }

        public a() {
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
            return -689604196;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class b implements p {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.usecase.verification.model.a f164509a;

        public b(com.stockbit.usecase.verification.model.a r2) {
            kotlin.jvm.internal.p.l(r2, "nextChallenge");
            this.f164509a = r2;
        }

        public final com.stockbit.usecase.verification.model.a a() {
            return this.f164509a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f164509a, ((b) r4).f164509a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164509a.hashCode();
        }

        public String toString() {
            return "Success(nextChallenge=" + this.f164509a + ')';
        }
    }
}
