package com.stockbit.usecase.login.model;

/* loaded from: classes2.dex */
public interface n {

    public static final class a implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f158368a = null;

        static {
            f158368a = new a();
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
            return -151412635;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class b implements n {

        /* renamed from: a, reason: collision with root package name */
        public final String f158369a;

        /* renamed from: b, reason: collision with root package name */
        public final String f158370b;

        public b(String r2, String r3) {
            kotlin.jvm.internal.p.l(r2, "token");
            kotlin.jvm.internal.p.l(r3, "nextAttemptTime");
            this.f158369a = r2;
            this.f158370b = r3;
        }

        public final String a() {
            return this.f158370b;
        }

        public final String b() {
            return this.f158369a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (kotlin.jvm.internal.p.g(this.f158369a, r52.f158369a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f158370b, r52.f158370b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f158369a.hashCode() * 31) + this.f158370b.hashCode();
        }

        public String toString() {
            return "Success(token=" + this.f158369a + ", nextAttemptTime=" + this.f158370b + ')';
        }
    }
}
