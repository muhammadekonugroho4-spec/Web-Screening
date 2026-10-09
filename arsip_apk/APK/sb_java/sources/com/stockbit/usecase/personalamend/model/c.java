package com.stockbit.usecase.personalamend.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f159030a;

        /* renamed from: b, reason: collision with root package name */
        public final String f159031b;

        public a(String r2, String r3) {
            p.l(r2, "token");
            p.l(r3, "password");
            super(null);
            this.f159030a = r2;
            this.f159031b = r3;
        }

        public final String a() {
            return this.f159031b;
        }

        public final String b() {
            return this.f159030a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f159030a, r52.f159030a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f159031b, r52.f159031b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f159030a.hashCode() * 31) + this.f159031b.hashCode();
        }

        public String toString() {
            return "ChallengeConfirmNewPassword(token=" + this.f159030a + ", password=" + this.f159031b + ")";
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f159032a;

        /* renamed from: b, reason: collision with root package name */
        public final String f159033b;

        public b(String r2, String r3) {
            p.l(r2, "token");
            p.l(r3, "correlationId");
            super(null);
            this.f159032a = r2;
            this.f159033b = r3;
        }

        public final String a() {
            return this.f159033b;
        }

        public final String b() {
            return this.f159032a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (p.g(this.f159032a, r52.f159032a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f159033b, r52.f159033b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f159032a.hashCode() * 31) + this.f159033b.hashCode();
        }

        public String toString() {
            return "ChallengeFaceMatching(token=" + this.f159032a + ", correlationId=" + this.f159033b + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.personalamend.model.c$c, reason: collision with other inner class name */
    public static final class C1548c extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f159034a;

        /* renamed from: b, reason: collision with root package name */
        public final String f159035b;

        public C1548c(String r2, String r3) {
            p.l(r2, "token");
            p.l(r3, "password");
            super(null);
            this.f159034a = r2;
            this.f159035b = r3;
        }

        public final String a() {
            return this.f159035b;
        }

        public final String b() {
            return this.f159034a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C1548c) == true) goto L8;
            return false;
        L8:
            C1548c r52 = (C1548c) r5;
            if (p.g(this.f159034a, r52.f159034a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f159035b, r52.f159035b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f159034a.hashCode() * 31) + this.f159035b.hashCode();
        }

        public String toString() {
            return "ChallengeRequestNewPassword(token=" + this.f159034a + ", password=" + this.f159035b + ")";
        }
    }

    public static final class d extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f159036a;

        public d(String r2) {
            p.l(r2, "token");
            super(null);
            this.f159036a = r2;
        }

        public final String a() {
            return this.f159036a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159036a, ((d) r4).f159036a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f159036a.hashCode();
        }

        public String toString() {
            return "ChallengeVaas(token=" + this.f159036a + ")";
        }
    }

    public static final class e extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f159037a;

        /* renamed from: b, reason: collision with root package name */
        public final String f159038b;

        public e(String r2, String r3) {
            p.l(r2, "token");
            p.l(r3, "password");
            super(null);
            this.f159037a = r2;
            this.f159038b = r3;
        }

        public final String a() {
            return this.f159038b;
        }

        public final String b() {
            return this.f159037a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof e) == true) goto L8;
            return false;
        L8:
            e r52 = (e) r5;
            if (p.g(this.f159037a, r52.f159037a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f159038b, r52.f159038b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f159037a.hashCode() * 31) + this.f159038b.hashCode();
        }

        public String toString() {
            return "ChallengeVerifyCurrentPassword(token=" + this.f159037a + ", password=" + this.f159038b + ")";
        }
    }

    public static final class f extends c {

        /* renamed from: a, reason: collision with root package name */
        public final String f159039a;

        /* renamed from: b, reason: collision with root package name */
        public final String f159040b;

        public f(String r2, String r3) {
            p.l(r2, "token");
            p.l(r3, "otp");
            super(null);
            this.f159039a = r2;
            this.f159040b = r3;
        }

        public final String a() {
            return this.f159040b;
        }

        public final String b() {
            return this.f159039a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof f) == true) goto L8;
            return false;
        L8:
            f r52 = (f) r5;
            if (p.g(this.f159039a, r52.f159039a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f159040b, r52.f159040b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f159039a.hashCode() * 31) + this.f159040b.hashCode();
        }

        public String toString() {
            return "ChallengeVerifyOtp(token=" + this.f159039a + ", otp=" + this.f159040b + ")";
        }
    }

    public static final class g extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final g f159041a = null;

        static {
            f159041a = new g();
        }

        public g() {
            super(null);
        }
    }

    public /* synthetic */ c(kotlin.jvm.internal.i r1) {
        this();
    }

    public c() {
    }
}
