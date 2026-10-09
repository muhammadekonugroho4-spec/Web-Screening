package com.stockbit.usecase.personalamend.resource;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface d {

    public static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        public static final a f159209a = null;

        static {
            f159209a = new a();
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
            return 500344259;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class b implements d {

        /* renamed from: a, reason: collision with root package name */
        public final String f159210a;

        public b(String r2) {
            p.l(r2, "message");
            this.f159210a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159210a, ((b) r4).f159210a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f159210a.hashCode();
        }

        public String toString() {
            return "Success(message=" + this.f159210a + ")";
        }
    }
}
