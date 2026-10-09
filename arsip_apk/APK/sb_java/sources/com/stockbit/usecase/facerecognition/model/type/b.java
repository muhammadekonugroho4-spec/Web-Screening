package com.stockbit.usecase.facerecognition.model.type;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f157747a = null;

        static {
            f157747a = new a();
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
            return -1048757133;
        }

        public String toString() {
            return "MultiPlatformFaceMatch";
        }
    }

    /* renamed from: com.stockbit.usecase.facerecognition.model.type.b$b, reason: collision with other inner class name */
    public static final class C1479b implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final C1479b f157748a = null;

        static {
            f157748a = new C1479b();
        }

        public C1479b() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1479b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -695770285;
        }

        public String toString() {
            return "NonLogin";
        }
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f157749a = null;

        static {
            f157749a = new c();
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
            return -1771014120;
        }

        public String toString() {
            return "SignedIn";
        }
    }

    public static final class d implements b {

        /* renamed from: a, reason: collision with root package name */
        public final String f157750a;

        public d(String r2) {
            p.l(r2, "verificationToken");
            this.f157750a = r2;
        }

        public final String a() {
            return this.f157750a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157750a, ((d) r4).f157750a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f157750a.hashCode();
        }

        public String toString() {
            return "Verification(verificationToken=" + this.f157750a + ')';
        }
    }
}
