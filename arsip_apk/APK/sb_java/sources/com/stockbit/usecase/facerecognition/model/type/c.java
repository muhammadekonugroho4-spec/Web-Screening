package com.stockbit.usecase.facerecognition.model.type;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface c {

    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final String f157751a;

        public a(String r2) {
            p.l(r2, "sessionToken");
            this.f157751a = r2;
        }

        public final String a() {
            return this.f157751a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157751a, ((a) r4).f157751a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f157751a.hashCode();
        }

        public String toString() {
            return "MultiPlatformFaceMatch(sessionToken=" + this.f157751a + ')';
        }
    }

    public static abstract class b implements c {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f157752a = null;

            static {
                f157752a = new a();
            }

            public a() {
                super(null);
            }
        }

        /* renamed from: com.stockbit.usecase.facerecognition.model.type.c$b$b, reason: collision with other inner class name */
        public static final class C1480b extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C1480b f157753a = null;

            static {
                f157753a = new C1480b();
            }

            public C1480b() {
                super(null);
            }
        }

        /* renamed from: com.stockbit.usecase.facerecognition.model.type.c$b$c, reason: collision with other inner class name */
        public static final class C1481c extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final C1481c f157754a = null;

            static {
                f157754a = new C1481c();
            }

            public C1481c() {
                super(null);
            }
        }

        public /* synthetic */ b(i r1) {
            this();
        }

        public b() {
        }
    }

    /* renamed from: com.stockbit.usecase.facerecognition.model.type.c$c, reason: collision with other inner class name */
    public static final class C1482c implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final C1482c f157755a = null;

        static {
            f157755a = new C1482c();
        }

        public C1482c() {
        }
    }

    public static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        public final String f157756a;

        public d(String r2) {
            p.l(r2, "verificationToken");
            this.f157756a = r2;
        }

        public final String a() {
            return this.f157756a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157756a, ((d) r4).f157756a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f157756a.hashCode();
        }

        public String toString() {
            return "VerificationService(verificationToken=" + this.f157756a + ')';
        }
    }
}
