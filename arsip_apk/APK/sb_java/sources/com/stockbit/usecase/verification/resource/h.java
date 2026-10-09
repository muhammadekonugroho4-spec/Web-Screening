package com.stockbit.usecase.verification.resource;

/* loaded from: classes2.dex */
public interface h {

    public static final class a implements h {

        /* renamed from: a, reason: collision with root package name */
        public final long f164476a;

        public a(long r1) {
            this.f164476a = r1;
        }

        public final long a() {
            return this.f164476a;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof a) == true) goto L9;
            return false;
        L9:
            if (this.f164476a == ((a) r8).f164476a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Long.hashCode(this.f164476a);
        }

        public String toString() {
            return "Success(nextAttemptInSecond=" + this.f164476a + ')';
        }
    }
}
