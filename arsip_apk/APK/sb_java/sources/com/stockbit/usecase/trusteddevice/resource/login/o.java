package com.stockbit.usecase.trusteddevice.resource.login;

/* loaded from: classes2.dex */
public interface o {

    public static final class a implements o {

        /* renamed from: a, reason: collision with root package name */
        public static final a f164341a = null;

        static {
            f164341a = new a();
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
            return 969475161;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class b implements o {

        /* renamed from: a, reason: collision with root package name */
        public final String f164342a;

        public b(String r2) {
            kotlin.jvm.internal.p.l(r2, "token");
            this.f164342a = r2;
        }

        public final String a() {
            return this.f164342a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f164342a, ((b) r4).f164342a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f164342a.hashCode();
        }

        public String toString() {
            return "Success(token=" + this.f164342a + ')';
        }
    }
}
