package com.stockbit.usecase.forgotpin.model;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.forgotpin.model.a$a, reason: collision with other inner class name */
    public static final class C1498a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f157977a;

        /* renamed from: b, reason: collision with root package name */
        public final String f157978b;

        public C1498a(String r2, String r3) {
            p.l(r2, "token");
            p.l(r3, "pin");
            super(null);
            this.f157977a = r2;
            this.f157978b = r3;
        }

        public final String a() {
            return this.f157978b;
        }

        public final String b() {
            return this.f157977a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C1498a) == true) goto L8;
            return false;
        L8:
            C1498a r52 = (C1498a) r5;
            if (p.g(this.f157977a, r52.f157977a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f157978b, r52.f157978b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f157977a.hashCode() * 31) + this.f157978b.hashCode();
        }

        public String toString() {
            return "ChallengeConfirmNewPin(token=" + this.f157977a + ", pin=" + this.f157978b + ')';
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f157979a;

        /* renamed from: b, reason: collision with root package name */
        public final String f157980b;

        public b(String r2, String r3) {
            p.l(r2, "token");
            p.l(r3, "correlationId");
            super(null);
            this.f157979a = r2;
            this.f157980b = r3;
        }

        public final String a() {
            return this.f157980b;
        }

        public final String b() {
            return this.f157979a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (p.g(this.f157979a, r52.f157979a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f157980b, r52.f157980b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f157979a.hashCode() * 31) + this.f157980b.hashCode();
        }

        public String toString() {
            return "ChallengeFaceMatching(token=" + this.f157979a + ", correlationId=" + this.f157980b + ')';
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f157981a;

        /* renamed from: b, reason: collision with root package name */
        public final String f157982b;

        /* renamed from: c, reason: collision with root package name */
        public final String f157983c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f157984e;

        public c(String r2, String r3, String r4, String r5, String r6) {
            p.l(r2, "token");
            p.l(r3, "identityNumber");
            p.l(r4, "birthDate");
            p.l(r5, "bankAccountNumber");
            p.l(r6, "motherName");
            super(null);
            this.f157981a = r2;
            this.f157982b = r3;
            this.f157983c = r4;
            this.d = r5;
            this.f157984e = r6;
        }

        public final String a() {
            return this.d;
        }

        public final String b() {
            return this.f157983c;
        }

        public final String c() {
            return this.f157982b;
        }

        public final String d() {
            return this.f157984e;
        }

        public final String e() {
            return this.f157981a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (p.g(this.f157981a, r52.f157981a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f157982b, r52.f157982b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f157983c, r52.f157983c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (p.g(this.f157984e, r52.f157984e) == true) goto L23;
            return false;
        L23:
            return true;
        }

        public int hashCode() {
            return (((((((this.f157981a.hashCode() * 31) + this.f157982b.hashCode()) * 31) + this.f157983c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f157984e.hashCode();
        }

        public String toString() {
            return "ChallengeIdentification(token=" + this.f157981a + ", identityNumber=" + this.f157982b + ", birthDate=" + this.f157983c + ", bankAccountNumber=" + this.d + ", motherName=" + this.f157984e + ')';
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f157985a;

        /* renamed from: b, reason: collision with root package name */
        public final String f157986b;

        public d(String r2, String r3) {
            p.l(r2, "token");
            p.l(r3, "otp");
            super(null);
            this.f157985a = r2;
            this.f157986b = r3;
        }

        public final String a() {
            return this.f157986b;
        }

        public final String b() {
            return this.f157985a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof d) == true) goto L8;
            return false;
        L8:
            d r52 = (d) r5;
            if (p.g(this.f157985a, r52.f157985a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f157986b, r52.f157986b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f157985a.hashCode() * 31) + this.f157986b.hashCode();
        }

        public String toString() {
            return "ChallengeOTP(token=" + this.f157985a + ", otp=" + this.f157986b + ')';
        }
    }

    public static final class e extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f157987a;

        /* renamed from: b, reason: collision with root package name */
        public final String f157988b;

        public e(String r2, String r3) {
            p.l(r2, "token");
            p.l(r3, "pin");
            super(null);
            this.f157987a = r2;
            this.f157988b = r3;
        }

        public final String a() {
            return this.f157988b;
        }

        public final String b() {
            return this.f157987a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof e) == true) goto L8;
            return false;
        L8:
            e r52 = (e) r5;
            if (p.g(this.f157987a, r52.f157987a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f157988b, r52.f157988b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f157987a.hashCode() * 31) + this.f157988b.hashCode();
        }

        public String toString() {
            return "ChallengeRequestNewPin(token=" + this.f157987a + ", pin=" + this.f157988b + ')';
        }
    }

    public static final class f extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f157989a;

        public f(String r2) {
            p.l(r2, "token");
            super(null);
            this.f157989a = r2;
        }

        public final String a() {
            return this.f157989a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof f) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157989a, ((f) r4).f157989a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f157989a.hashCode();
        }

        public String toString() {
            return "ChallengeVaas(token=" + this.f157989a + ')';
        }
    }

    public static final class g extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final g f157990a = null;

        static {
            f157990a = new g();
        }

        public g() {
            super(null);
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
