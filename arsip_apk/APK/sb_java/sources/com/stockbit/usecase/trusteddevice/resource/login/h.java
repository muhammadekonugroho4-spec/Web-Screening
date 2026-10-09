package com.stockbit.usecase.trusteddevice.resource.login;

/* loaded from: classes2.dex */
public interface h {

    public static final class a implements h {

        /* renamed from: a, reason: collision with root package name */
        public static final a f164330a = null;

        static {
            f164330a = new a();
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
            return 1514822897;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class b implements h {

        /* renamed from: a, reason: collision with root package name */
        public final String f164331a;

        public b(String r2) {
            kotlin.jvm.internal.p.l(r2, "nextAttemptTime");
            this.f164331a = r2;
        }

        public final String a() {
            return this.f164331a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f164331a, ((b) r4).f164331a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164331a.hashCode();
        }

        public String toString() {
            return "Success(nextAttemptTime=" + this.f164331a + ')';
        }
    }
}
