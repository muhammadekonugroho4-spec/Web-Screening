package com.stockbit.usecase.personalamend.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class g {

    public static final class a extends g {

        /* renamed from: a, reason: collision with root package name */
        public final String f159048a;

        /* renamed from: b, reason: collision with root package name */
        public final String f159049b;

        public a(String r2, String r3) {
            p.l(r2, "token");
            p.l(r3, "password");
            super(null);
            this.f159048a = r2;
            this.f159049b = r3;
        }

        public final String a() {
            return this.f159049b;
        }

        public final String b() {
            return this.f159048a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f159048a, r52.f159048a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f159049b, r52.f159049b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f159048a.hashCode() * 31) + this.f159049b.hashCode();
        }

        public String toString() {
            return "ChallengeConfirmNewPassword(token=" + this.f159048a + ", password=" + this.f159049b + ")";
        }
    }

    public static final class b extends g {

        /* renamed from: a, reason: collision with root package name */
        public final String f159050a;

        /* renamed from: b, reason: collision with root package name */
        public final String f159051b;

        public b(String r2, String r3) {
            p.l(r2, "token");
            p.l(r3, "correlationId");
            super(null);
            this.f159050a = r2;
            this.f159051b = r3;
        }

        public final String a() {
            return this.f159051b;
        }

        public final String b() {
            return this.f159050a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (p.g(this.f159050a, r52.f159050a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f159051b, r52.f159051b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f159050a.hashCode() * 31) + this.f159051b.hashCode();
        }

        public String toString() {
            return "ChallengeFaceMatching(token=" + this.f159050a + ", correlationId=" + this.f159051b + ")";
        }
    }

    public static final class c extends g {

        /* renamed from: a, reason: collision with root package name */
        public final String f159052a;

        /* renamed from: b, reason: collision with root package name */
        public final String f159053b;

        public c(String r2, String r3) {
            p.l(r2, "token");
            p.l(r3, "password");
            super(null);
            this.f159052a = r2;
            this.f159053b = r3;
        }

        public final String a() {
            return this.f159053b;
        }

        public final String b() {
            return this.f159052a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (p.g(this.f159052a, r52.f159052a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f159053b, r52.f159053b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f159052a.hashCode() * 31) + this.f159053b.hashCode();
        }

        public String toString() {
            return "ChallengeRequestNewPassword(token=" + this.f159052a + ", password=" + this.f159053b + ")";
        }
    }

    public static final class d extends g {

        /* renamed from: a, reason: collision with root package name */
        public final String f159054a;

        public d(String r2) {
            p.l(r2, "token");
            super(null);
            this.f159054a = r2;
        }

        public final String a() {
            return this.f159054a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159054a, ((d) r4).f159054a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f159054a.hashCode();
        }

        public String toString() {
            return "ChallengeVaas(token=" + this.f159054a + ")";
        }
    }

    public static final class e extends g {

        /* renamed from: a, reason: collision with root package name */
        public static final e f159055a = null;

        static {
            f159055a = new e();
        }

        public e() {
            super(null);
        }
    }

    public static final class f extends g {

        /* renamed from: a, reason: collision with root package name */
        public final String f159056a;

        public f(String r2) {
            p.l(r2, "email");
            super(null);
            this.f159056a = r2;
        }

        public final String a() {
            return this.f159056a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof f) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f159056a, ((f) r4).f159056a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f159056a.hashCode();
        }

        public String toString() {
            return "InitiateNonLogin(email=" + this.f159056a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.personalamend.model.g$g, reason: collision with other inner class name */
    public static final class C1549g extends g {

        /* renamed from: a, reason: collision with root package name */
        public final String f159057a;

        /* renamed from: b, reason: collision with root package name */
        public final String f159058b;

        public C1549g(String r2, String r3) {
            p.l(r2, "token");
            p.l(r3, "otp");
            super(null);
            this.f159057a = r2;
            this.f159058b = r3;
        }

        public final String a() {
            return this.f159058b;
        }

        public final String b() {
            return this.f159057a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C1549g) == true) goto L8;
            return false;
        L8:
            C1549g r52 = (C1549g) r5;
            if (p.g(this.f159057a, r52.f159057a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f159058b, r52.f159058b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f159057a.hashCode() * 31) + this.f159058b.hashCode();
        }

        public String toString() {
            return "SubmitOTP(token=" + this.f159057a + ", otp=" + this.f159058b + ")";
        }
    }

    public /* synthetic */ g(kotlin.jvm.internal.i r1) {
        this();
    }

    public g() {
    }
}
