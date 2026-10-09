package com.stockbit.usecase.appcheck.resource;

import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public interface a {

    /* renamed from: com.stockbit.usecase.appcheck.resource.a$a, reason: collision with other inner class name */
    public static final class C1399a implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1399a f154385a = null;

        static {
            f154385a = new C1399a();
        }

        public C1399a() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1399a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1815001446;
        }

        public String toString() {
            return "Disabled";
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f154386a;

        public b(String r2) {
            p.l(r2, "message");
            this.f154386a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f154386a, ((b) r4).f154386a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f154386a.hashCode();
        }

        public String toString() {
            return "Error(message=" + this.f154386a + ')';
        }
    }

    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f154387a = null;

        static {
            f154387a = new c();
        }

        public c() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof c) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -1830298350;
        }

        public String toString() {
            return "Loading";
        }
    }

    public static final class d implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f154388a;

        public d(String r2) {
            p.l(r2, "token");
            this.f154388a = r2;
        }

        public final String a() {
            return this.f154388a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f154388a, ((d) r4).f154388a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f154388a.hashCode();
        }

        public String toString() {
            return "Success(token=" + this.f154388a + ')';
        }
    }
}
