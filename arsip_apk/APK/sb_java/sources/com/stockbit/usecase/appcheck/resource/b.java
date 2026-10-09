package com.stockbit.usecase.appcheck.resource;

import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f154389a = null;

        static {
            f154389a = new a();
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
            return 715883275;
        }

        public String toString() {
            return "Disabled";
        }
    }

    /* renamed from: com.stockbit.usecase.appcheck.resource.b$b, reason: collision with other inner class name */
    public static final class C1400b implements b {

        /* renamed from: a, reason: collision with root package name */
        public final String f154390a;

        public C1400b(String r2) {
            p.l(r2, "message");
            this.f154390a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1400b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f154390a, ((C1400b) r4).f154390a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f154390a.hashCode();
        }

        public String toString() {
            return "Error(message=" + this.f154390a + ')';
        }
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final String f154391a;

        public c(String r2) {
            p.l(r2, "token");
            this.f154391a = r2;
        }

        public final String a() {
            return this.f154391a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f154391a, ((c) r4).f154391a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f154391a.hashCode();
        }

        public String toString() {
            return "Success(token=" + this.f154391a + ')';
        }
    }
}
