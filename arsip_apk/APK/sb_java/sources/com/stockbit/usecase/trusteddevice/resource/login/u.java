package com.stockbit.usecase.trusteddevice.resource.login;

/* loaded from: classes2.dex */
public interface u {

    public static final class a implements u {

        /* renamed from: a, reason: collision with root package name */
        public static final a f164349a = null;

        static {
            f164349a = new a();
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
            return 218575348;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class b implements u {

        /* renamed from: a, reason: collision with root package name */
        public final String f164350a;

        /* renamed from: b, reason: collision with root package name */
        public final String f164351b;

        /* renamed from: c, reason: collision with root package name */
        public final String f164352c;

        public b(String r2, String r3, String r4) {
            kotlin.jvm.internal.p.l(r2, "email");
            this.f164350a = r2;
            this.f164351b = r3;
            this.f164352c = r4;
        }

        public final String a() {
            return this.f164350a;
        }

        public final String b() {
            return this.f164351b;
        }

        public final String c() {
            return this.f164352c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (kotlin.jvm.internal.p.g(this.f164350a, r52.f164350a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f164351b, r52.f164351b) == true) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f164352c, r52.f164352c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            int r02 = this.f164350a.hashCode() * 31;
            String r1 = this.f164351b;
            int r2 = 0;
            if (r1 != null) goto L5;
            int r12 = 0;
        L6:
            int r03 = (r02 + r12) * 31;
            String r13 = this.f164352c;
            if (r13 == null) goto L11;
            r2 = r13.hashCode();
        L11:
            return r03 + r2;
        L5:
            r12 = r1.hashCode();
            goto L6
        }

        public String toString() {
            return "Success(email=" + this.f164350a + ", phone=" + this.f164351b + ", whatsapp=" + this.f164352c + ')';
        }
    }
}
