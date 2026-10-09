package com.stockbit.domain.type.facerecognition;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public interface a {

    /* renamed from: com.stockbit.domain.type.facerecognition.a$a, reason: collision with other inner class name */
    public static final class C0825a implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0825a f87674a = null;

        static {
            f87674a = new C0825a();
        }

        public C0825a() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C0825a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -578217513;
        }

        public String toString() {
            return "LoggedIn";
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f87675a = null;

        static {
            f87675a = new b();
        }

        public b() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -925406836;
        }

        public String toString() {
            return "MultiPlatformFaceMatch";
        }
    }

    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f87676a = null;

        static {
            f87676a = new c();
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
            return -1211793364;
        }

        public String toString() {
            return "NonLogin";
        }
    }

    public static final class d implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f87677a;

        public d(String r2) {
            p.l(r2, "verificationToken");
            this.f87677a = r2;
        }

        public final String a() {
            return this.f87677a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f87677a, ((d) r4).f87677a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f87677a.hashCode();
        }

        public String toString() {
            return "Verification(verificationToken=" + this.f87677a + ")";
        }
    }
}
