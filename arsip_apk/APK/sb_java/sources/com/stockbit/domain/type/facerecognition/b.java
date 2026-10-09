package com.stockbit.domain.type.facerecognition;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public interface b {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final String f87678a;

        /* renamed from: b, reason: collision with root package name */
        public final FaceRecognitionSessionPurposeTypeEntity f87679b;

        public a(String r2, FaceRecognitionSessionPurposeTypeEntity r3) {
            p.l(r2, "refId");
            p.l(r3, "purpose");
            this.f87678a = r2;
            this.f87679b = r3;
        }

        public final FaceRecognitionSessionPurposeTypeEntity a() {
            return this.f87679b;
        }

        public final String b() {
            return this.f87678a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f87678a, r52.f87678a) == true) goto L12;
            return false;
        L12:
            if (this.f87679b == r52.f87679b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f87678a.hashCode() * 31) + this.f87679b.hashCode();
        }

        public String toString() {
            return "LoggedIn(refId=" + this.f87678a + ", purpose=" + this.f87679b + ")";
        }
    }

    /* renamed from: com.stockbit.domain.type.facerecognition.b$b, reason: collision with other inner class name */
    public static final class C0826b implements b {

        /* renamed from: a, reason: collision with root package name */
        public final String f87680a;

        /* renamed from: b, reason: collision with root package name */
        public final String f87681b;

        public C0826b(String r2, String r3) {
            p.l(r2, "sessionToken");
            p.l(r3, "appCheckToken");
            this.f87680a = r2;
            this.f87681b = r3;
        }

        public final String a() {
            return this.f87681b;
        }

        public final String b() {
            return this.f87680a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C0826b) == true) goto L8;
            return false;
        L8:
            C0826b r52 = (C0826b) r5;
            if (p.g(this.f87680a, r52.f87680a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f87681b, r52.f87681b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f87680a.hashCode() * 31) + this.f87681b.hashCode();
        }

        public String toString() {
            return "MultiPlatformFaceMatch(sessionToken=" + this.f87680a + ", appCheckToken=" + this.f87681b + ")";
        }
    }

    public static abstract class c implements b {

        public static final class a extends c {

            /* renamed from: a, reason: collision with root package name */
            public final String f87682a;

            public a(String r2) {
                p.l(r2, "token");
                super(null);
                this.f87682a = r2;
            }

            public final String a() {
                return this.f87682a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof a) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f87682a, ((a) r4).f87682a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f87682a.hashCode();
            }

            public String toString() {
                return "ForgotPassword(token=" + this.f87682a + ")";
            }
        }

        /* renamed from: com.stockbit.domain.type.facerecognition.b$c$b, reason: collision with other inner class name */
        public static final class C0827b extends c {

            /* renamed from: a, reason: collision with root package name */
            public final String f87683a;

            public C0827b(String r2) {
                p.l(r2, "token");
                super(null);
                this.f87683a = r2;
            }

            public final String a() {
                return this.f87683a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C0827b) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f87683a, ((C0827b) r4).f87683a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f87683a.hashCode();
            }

            public String toString() {
                return "ForgotPhone(token=" + this.f87683a + ")";
            }
        }

        /* renamed from: com.stockbit.domain.type.facerecognition.b$c$c, reason: collision with other inner class name */
        public static final class C0828c extends c {

            /* renamed from: a, reason: collision with root package name */
            public final String f87684a;

            public C0828c(String r2) {
                p.l(r2, "token");
                super(null);
                this.f87684a = r2;
            }

            public final String a() {
                return this.f87684a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C0828c) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f87684a, ((C0828c) r4).f87684a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f87684a.hashCode();
            }

            public String toString() {
                return "ForgotPin(token=" + this.f87684a + ")";
            }
        }

        public /* synthetic */ c(i r1) {
            this();
        }

        public c() {
        }
    }

    public static final class d implements b {

        /* renamed from: a, reason: collision with root package name */
        public final String f87685a;

        public d(String r2) {
            p.l(r2, "verificationToken");
            this.f87685a = r2;
        }

        public final String a() {
            return this.f87685a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f87685a, ((d) r4).f87685a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f87685a.hashCode();
        }

        public String toString() {
            return "VerificationService(verificationToken=" + this.f87685a + ")";
        }
    }
}
