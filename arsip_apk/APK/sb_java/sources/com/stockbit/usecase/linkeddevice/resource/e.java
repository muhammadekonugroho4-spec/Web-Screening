package com.stockbit.usecase.linkeddevice.resource;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface e {

    public static final class a implements e {

        /* renamed from: a, reason: collision with root package name */
        public static final a f158218a = null;

        static {
            f158218a = new a();
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
            return -1511283628;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class b implements e {

        /* renamed from: a, reason: collision with root package name */
        public final String f158219a;

        public b(String r2) {
            p.l(r2, "message");
            this.f158219a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f158219a, ((b) r4).f158219a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f158219a.hashCode();
        }

        public String toString() {
            return "Success(message=" + this.f158219a + ")";
        }
    }
}
