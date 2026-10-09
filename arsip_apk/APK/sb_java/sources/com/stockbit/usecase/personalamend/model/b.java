package com.stockbit.usecase.personalamend.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f159014a;

        public a(String r2) {
            p.l(r2, "token");
            super(null);
            this.f159014a = r2;
        }

        public final String a() {
            return this.f159014a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159014a, ((a) r4).f159014a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f159014a.hashCode();
        }

        public String toString() {
            return "ChallengeVaas(token=" + this.f159014a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.personalamend.model.b$b, reason: collision with other inner class name */
    public static final class C1547b extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f159015a;

        /* renamed from: b, reason: collision with root package name */
        public final String f159016b;

        public C1547b(String r2, String r3) {
            p.l(r2, "token");
            p.l(r3, "email");
            super(null);
            this.f159015a = r2;
            this.f159016b = r3;
        }

        public final String a() {
            return this.f159016b;
        }

        public final String b() {
            return this.f159015a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C1547b) == true) goto L8;
            return false;
        L8:
            C1547b r52 = (C1547b) r5;
            if (p.g(this.f159015a, r52.f159015a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f159016b, r52.f159016b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f159015a.hashCode() * 31) + this.f159016b.hashCode();
        }

        public String toString() {
            return "CreateNewEmail(token=" + this.f159015a + ", email=" + this.f159016b + ")";
        }
    }

    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f159017a = null;

        static {
            f159017a = new c();
        }

        public c() {
            super(null);
        }
    }

    public static final class d extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f159018a;

        /* renamed from: b, reason: collision with root package name */
        public final String f159019b;

        public d(String r2, String r3) {
            p.l(r2, "token");
            p.l(r3, "password");
            super(null);
            this.f159018a = r2;
            this.f159019b = r3;
        }

        public final String a() {
            return this.f159019b;
        }

        public final String b() {
            return this.f159018a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof d) == true) goto L8;
            return false;
        L8:
            d r52 = (d) r5;
            if (p.g(this.f159018a, r52.f159018a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f159019b, r52.f159019b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f159018a.hashCode() * 31) + this.f159019b.hashCode();
        }

        public String toString() {
            return "VerifyCurrentPassword(token=" + this.f159018a + ", password=" + this.f159019b + ")";
        }
    }

    public static final class e extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f159020a;

        /* renamed from: b, reason: collision with root package name */
        public final String f159021b;

        public e(String r2, String r3) {
            p.l(r2, "token");
            p.l(r3, "correlationId");
            super(null);
            this.f159020a = r2;
            this.f159021b = r3;
        }

        public final String a() {
            return this.f159021b;
        }

        public final String b() {
            return this.f159020a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof e) == true) goto L8;
            return false;
        L8:
            e r52 = (e) r5;
            if (p.g(this.f159020a, r52.f159020a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f159021b, r52.f159021b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f159020a.hashCode() * 31) + this.f159021b.hashCode();
        }

        public String toString() {
            return "VerifyFaceMatching(token=" + this.f159020a + ", correlationId=" + this.f159021b + ")";
        }
    }

    public static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f159022a;

        /* renamed from: b, reason: collision with root package name */
        public final String f159023b;

        /* renamed from: c, reason: collision with root package name */
        public final String f159024c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f159025e;

        public f(String r2, String r3, String r4, String r5, String r6) {
            p.l(r2, "token");
            p.l(r3, "identityNumber");
            p.l(r4, "birthDate");
            p.l(r5, "bankAccountNumber");
            p.l(r6, "motherName");
            super(null);
            this.f159022a = r2;
            this.f159023b = r3;
            this.f159024c = r4;
            this.d = r5;
            this.f159025e = r6;
        }

        public final String a() {
            return this.d;
        }

        public final String b() {
            return this.f159024c;
        }

        public final String c() {
            return this.f159023b;
        }

        public final String d() {
            return this.f159025e;
        }

        public final String e() {
            return this.f159022a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof f) == true) goto L8;
            return false;
        L8:
            f r52 = (f) r5;
            if (p.g(this.f159022a, r52.f159022a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f159023b, r52.f159023b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f159024c, r52.f159024c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (p.g(this.f159025e, r52.f159025e) == true) goto L23;
            return false;
        L23:
            return true;
        }

        public int hashCode() {
            return (((((((this.f159022a.hashCode() * 31) + this.f159023b.hashCode()) * 31) + this.f159024c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f159025e.hashCode();
        }

        public String toString() {
            return "VerifyIdentity(token=" + this.f159022a + ", identityNumber=" + this.f159023b + ", birthDate=" + this.f159024c + ", bankAccountNumber=" + this.d + ", motherName=" + this.f159025e + ")";
        }
    }

    public static final class g extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f159026a;

        /* renamed from: b, reason: collision with root package name */
        public final String f159027b;

        public g(String r2, String r3) {
            p.l(r2, "token");
            p.l(r3, "otp");
            super(null);
            this.f159026a = r2;
            this.f159027b = r3;
        }

        public final String a() {
            return this.f159027b;
        }

        public final String b() {
            return this.f159026a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof g) == true) goto L8;
            return false;
        L8:
            g r52 = (g) r5;
            if (p.g(this.f159026a, r52.f159026a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f159027b, r52.f159027b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f159026a.hashCode() * 31) + this.f159027b.hashCode();
        }

        public String toString() {
            return "VerifyOtp(token=" + this.f159026a + ", otp=" + this.f159027b + ")";
        }
    }

    public static final class h extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f159028a;

        /* renamed from: b, reason: collision with root package name */
        public final String f159029b;

        public h(String r2, String r3) {
            p.l(r2, "token");
            p.l(r3, "otp");
            super(null);
            this.f159028a = r2;
            this.f159029b = r3;
        }

        public final String a() {
            return this.f159029b;
        }

        public final String b() {
            return this.f159028a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof h) == true) goto L8;
            return false;
        L8:
            h r52 = (h) r5;
            if (p.g(this.f159028a, r52.f159028a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f159029b, r52.f159029b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f159028a.hashCode() * 31) + this.f159029b.hashCode();
        }

        public String toString() {
            return "VerifyOtpNewEmail(token=" + this.f159028a + ", otp=" + this.f159029b + ")";
        }
    }

    public /* synthetic */ b(kotlin.jvm.internal.i r1) {
        this();
    }

    public b() {
    }
}
