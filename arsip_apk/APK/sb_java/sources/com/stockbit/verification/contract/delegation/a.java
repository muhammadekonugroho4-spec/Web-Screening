package com.stockbit.verification.contract.delegation;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface a {

    /* renamed from: com.stockbit.verification.contract.delegation.a$a, reason: collision with other inner class name */
    public static final class C1748a implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1748a f165735a = null;

        static {
            f165735a = new C1748a();
        }

        public C1748a() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1748a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -1701446268;
        }

        public String toString() {
            return "HideLoadingDialog";
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f165736a = null;

        static {
            f165736a = new b();
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
            return -296327255;
        }

        public String toString() {
            return "ShowLoadingDialog";
        }
    }

    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f165737a;

        static {
        }

        public c(String r2) {
            p.l(r2, "message");
            this.f165737a = r2;
        }

        public final String a() {
            return this.f165737a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f165737a, ((c) r4).f165737a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f165737a.hashCode();
        }

        public String toString() {
            return "ShowUnsupportedClient(message=" + this.f165737a + ')';
        }
    }

    public static final class d implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f165738a = null;

        static {
            f165738a = new d();
        }

        public d() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof d) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 1768863339;
        }

        public String toString() {
            return "VerificationFinished";
        }
    }
}
