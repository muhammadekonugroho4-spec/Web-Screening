package com.stockbit.usecase.trusteddevice.resource.change;

/* loaded from: classes2.dex */
public interface p {

    public static final class a implements p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f164289a = null;

        static {
            f164289a = new a();
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
            return -157794424;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class b implements p {

        /* renamed from: a, reason: collision with root package name */
        public final String f164290a;

        /* renamed from: b, reason: collision with root package name */
        public final String f164291b;

        public b(String r2, String r3) {
            kotlin.jvm.internal.p.l(r2, "token");
            kotlin.jvm.internal.p.l(r3, "nextAttemptTime");
            this.f164290a = r2;
            this.f164291b = r3;
        }

        public final String a() {
            return this.f164291b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (kotlin.jvm.internal.p.g(this.f164290a, r52.f164290a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f164291b, r52.f164291b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f164290a.hashCode() * 31) + this.f164291b.hashCode();
        }

        public String toString() {
            return "Success(token=" + this.f164290a + ", nextAttemptTime=" + this.f164291b + ')';
        }
    }
}
