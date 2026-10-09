package com.istockbit.usecase.amendbank.resource;

import kotlin.jvm.internal.p;

/* loaded from: classes6.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final String f41007a;

        public a(String r2) {
            p.l(r2, "message");
            this.f41007a = r2;
        }

        public final String a() {
            return this.f41007a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f41007a, ((a) r4).f41007a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f41007a.hashCode();
        }

        public String toString() {
            return "Error(message=" + this.f41007a + ")";
        }
    }

    /* renamed from: com.istockbit.usecase.amendbank.resource.b$b, reason: collision with other inner class name */
    public static final class C0439b implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final C0439b f41008a = null;

        static {
            f41008a = new C0439b();
        }

        public C0439b() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C0439b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1746772502;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final com.istockbit.usecase.amendbank.model.a f41009a;

        public c(com.istockbit.usecase.amendbank.model.a r2) {
            p.l(r2, "uiState");
            this.f41009a = r2;
        }

        public final com.istockbit.usecase.amendbank.model.a a() {
            return this.f41009a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f41009a, ((c) r4).f41009a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f41009a.hashCode();
        }

        public String toString() {
            return "Success(uiState=" + this.f41009a + ")";
        }
    }
}
