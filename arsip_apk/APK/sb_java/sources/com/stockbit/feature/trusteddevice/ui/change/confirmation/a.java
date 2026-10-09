package com.stockbit.feature.trusteddevice.ui.change.confirmation;

/* loaded from: classes9.dex */
public interface a {

    /* renamed from: com.stockbit.feature.trusteddevice.ui.change.confirmation.a$a, reason: collision with other inner class name */
    public static final class C1020a implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1020a f117996a = null;

        static {
            f117996a = new C1020a();
        }

        public C1020a() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1020a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 36343732;
        }

        public String toString() {
            return "OpenAlreadyRegisteredPage";
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f117997a = null;

        static {
            f117997a = new b();
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
            return 509018051;
        }

        public String toString() {
            return "OpenNoSecuritiesPage";
        }
    }

    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public final String f117998a;

        static {
        }

        public c(String r2) {
            kotlin.jvm.internal.p.l(r2, "message");
            this.f117998a = r2;
        }

        public final String a() {
            return this.f117998a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f117998a, ((c) r4).f117998a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f117998a.hashCode();
        }

        public String toString() {
            return "ShowValidationLimitDialog(message=" + this.f117998a + ')';
        }
    }
}
