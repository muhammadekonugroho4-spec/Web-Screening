package com.stockbit.usecase.personalamend.model;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface l {

    public static final class a implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f159069a = null;

        static {
            f159069a = new a();
        }

        public a() {
        }
    }

    public static abstract class b implements l {

        /* renamed from: a, reason: collision with root package name */
        public final String f159070a;

        public static final class a extends b {

            /* renamed from: b, reason: collision with root package name */
            public final String f159071b;

            /* renamed from: c, reason: collision with root package name */
            public final String f159072c;
            public final String d;

            /* renamed from: e, reason: collision with root package name */
            public final String f159073e;

            /* renamed from: f, reason: collision with root package name */
            public final String f159074f;

            public a(String r2, String r3, String r4, String r5, String r6) {
                p.l(r2, "token");
                p.l(r3, "oldPhone");
                p.l(r4, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
                p.l(r5, "number");
                super(r6, null);
                this.f159071b = r2;
                this.f159072c = r3;
                this.d = r4;
                this.f159073e = r5;
                this.f159074f = r6;
            }

            public final String b() {
                return this.d;
            }

            public final String c() {
                return this.f159073e;
            }

            public final String d() {
                return this.f159071b;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof a) == true) goto L8;
                return false;
            L8:
                a r52 = (a) r5;
                if (p.g(this.f159071b, r52.f159071b) == true) goto L12;
                return false;
            L12:
                if (p.g(this.f159072c, r52.f159072c) == true) goto L15;
                return false;
            L15:
                if (p.g(this.d, r52.d) == true) goto L18;
                return false;
            L18:
                if (p.g(this.f159073e, r52.f159073e) == true) goto L21;
                return false;
            L21:
                if (p.g(this.f159074f, r52.f159074f) == true) goto L23;
                return false;
            L23:
                return true;
            }

            public int hashCode() {
                int r02 = ((((((this.f159071b.hashCode() * 31) + this.f159072c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f159073e.hashCode()) * 31;
                String r1 = this.f159074f;
                if (r1 != null) goto L5;
                int r12 = 0;
            L7:
                return r02 + r12;
            L5:
                r12 = r1.hashCode();
                goto L7
            }

            public String toString() {
                return "PhoneCreation(token=" + this.f159071b + ", oldPhone=" + this.f159072c + ", countryCode=" + this.d + ", number=" + this.f159073e + ", newNumber=" + this.f159074f + ")";
            }
        }

        /* renamed from: com.stockbit.usecase.personalamend.model.l$b$b, reason: collision with other inner class name */
        public static final class C1551b extends b {

            /* renamed from: b, reason: collision with root package name */
            public final String f159075b;

            /* renamed from: c, reason: collision with root package name */
            public final String f159076c;
            public final String d;

            public C1551b(String r2, String r3, String r4) {
                p.l(r2, "token");
                p.l(r3, "password");
                super(r4, null);
                this.f159075b = r2;
                this.f159076c = r3;
                this.d = r4;
            }

            public final String b() {
                return this.f159076c;
            }

            public final String c() {
                return this.f159075b;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof C1551b) == true) goto L8;
                return false;
            L8:
                C1551b r52 = (C1551b) r5;
                if (p.g(this.f159075b, r52.f159075b) == true) goto L12;
                return false;
            L12:
                if (p.g(this.f159076c, r52.f159076c) == true) goto L15;
                return false;
            L15:
                if (p.g(this.d, r52.d) == true) goto L17;
                return false;
            L17:
                return true;
            }

            public int hashCode() {
                int r02 = ((this.f159075b.hashCode() * 31) + this.f159076c.hashCode()) * 31;
                String r1 = this.d;
                if (r1 != null) goto L5;
                int r12 = 0;
            L7:
                return r02 + r12;
            L5:
                r12 = r1.hashCode();
                goto L7
            }

            public String toString() {
                return "VerifyCurrentPassword(token=" + this.f159075b + ", password=" + this.f159076c + ", newNumber=" + this.d + ")";
            }
        }

        public static final class c extends b {

            /* renamed from: b, reason: collision with root package name */
            public final String f159077b;

            /* renamed from: c, reason: collision with root package name */
            public final String f159078c;
            public final String d;

            public c(String r2, String r3, String r4) {
                p.l(r2, "token");
                p.l(r3, "correlationId");
                super(r4, null);
                this.f159077b = r2;
                this.f159078c = r3;
                this.d = r4;
            }

            public final String b() {
                return this.f159078c;
            }

            public final String c() {
                return this.f159077b;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof c) == true) goto L8;
                return false;
            L8:
                c r52 = (c) r5;
                if (p.g(this.f159077b, r52.f159077b) == true) goto L12;
                return false;
            L12:
                if (p.g(this.f159078c, r52.f159078c) == true) goto L15;
                return false;
            L15:
                if (p.g(this.d, r52.d) == true) goto L17;
                return false;
            L17:
                return true;
            }

            public int hashCode() {
                int r02 = ((this.f159077b.hashCode() * 31) + this.f159078c.hashCode()) * 31;
                String r1 = this.d;
                if (r1 != null) goto L5;
                int r12 = 0;
            L7:
                return r02 + r12;
            L5:
                r12 = r1.hashCode();
                goto L7
            }

            public String toString() {
                return "VerifyFaceMatching(token=" + this.f159077b + ", correlationId=" + this.f159078c + ", newNumber=" + this.d + ")";
            }
        }

        public static final class d extends b {

            /* renamed from: b, reason: collision with root package name */
            public final String f159079b;

            /* renamed from: c, reason: collision with root package name */
            public final String f159080c;
            public final String d;

            /* renamed from: e, reason: collision with root package name */
            public final String f159081e;

            /* renamed from: f, reason: collision with root package name */
            public final String f159082f;

            /* renamed from: g, reason: collision with root package name */
            public final String f159083g;

            public d(String r2, String r3, String r4, String r5, String r6, String r7) {
                p.l(r2, "token");
                p.l(r3, "identityNumber");
                p.l(r4, "birthDate");
                p.l(r5, "bankAccountNumber");
                p.l(r6, "motherName");
                super(r7, null);
                this.f159079b = r2;
                this.f159080c = r3;
                this.d = r4;
                this.f159081e = r5;
                this.f159082f = r6;
                this.f159083g = r7;
            }

            public final String b() {
                return this.f159081e;
            }

            public final String c() {
                return this.d;
            }

            public final String d() {
                return this.f159080c;
            }

            public final String e() {
                return this.f159082f;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof d) == true) goto L8;
                return false;
            L8:
                d r52 = (d) r5;
                if (p.g(this.f159079b, r52.f159079b) == true) goto L12;
                return false;
            L12:
                if (p.g(this.f159080c, r52.f159080c) == true) goto L15;
                return false;
            L15:
                if (p.g(this.d, r52.d) == true) goto L18;
                return false;
            L18:
                if (p.g(this.f159081e, r52.f159081e) == true) goto L21;
                return false;
            L21:
                if (p.g(this.f159082f, r52.f159082f) == true) goto L24;
                return false;
            L24:
                if (p.g(this.f159083g, r52.f159083g) == true) goto L26;
                return false;
            L26:
                return true;
            }

            public final String f() {
                return this.f159079b;
            }

            public int hashCode() {
                int r02 = ((((((((this.f159079b.hashCode() * 31) + this.f159080c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f159081e.hashCode()) * 31) + this.f159082f.hashCode()) * 31;
                String r1 = this.f159083g;
                if (r1 != null) goto L5;
                int r12 = 0;
            L7:
                return r02 + r12;
            L5:
                r12 = r1.hashCode();
                goto L7
            }

            public String toString() {
                return "VerifyIdentity(token=" + this.f159079b + ", identityNumber=" + this.f159080c + ", birthDate=" + this.d + ", bankAccountNumber=" + this.f159081e + ", motherName=" + this.f159082f + ", newNumber=" + this.f159083g + ")";
            }
        }

        public static final class e extends b {

            /* renamed from: b, reason: collision with root package name */
            public final String f159084b;

            /* renamed from: c, reason: collision with root package name */
            public final String f159085c;
            public final String d;

            public e(String r2, String r3, String r4) {
                p.l(r2, "token");
                p.l(r3, "otp");
                super(r4, null);
                this.f159084b = r2;
                this.f159085c = r3;
                this.d = r4;
            }

            public final String b() {
                return this.f159085c;
            }

            public final String c() {
                return this.f159084b;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof e) == true) goto L8;
                return false;
            L8:
                e r52 = (e) r5;
                if (p.g(this.f159084b, r52.f159084b) == true) goto L12;
                return false;
            L12:
                if (p.g(this.f159085c, r52.f159085c) == true) goto L15;
                return false;
            L15:
                if (p.g(this.d, r52.d) == true) goto L17;
                return false;
            L17:
                return true;
            }

            public int hashCode() {
                int r02 = ((this.f159084b.hashCode() * 31) + this.f159085c.hashCode()) * 31;
                String r1 = this.d;
                if (r1 != null) goto L5;
                int r12 = 0;
            L7:
                return r02 + r12;
            L5:
                r12 = r1.hashCode();
                goto L7
            }

            public String toString() {
                return "VerifyOtp(token=" + this.f159084b + ", otp=" + this.f159085c + ", newNumber=" + this.d + ")";
            }
        }

        public static final class f extends b {

            /* renamed from: b, reason: collision with root package name */
            public final String f159086b;

            /* renamed from: c, reason: collision with root package name */
            public final String f159087c;
            public final String d;

            public f(String r2, String r3, String r4) {
                p.l(r2, "token");
                p.l(r3, "otp");
                super(r4, null);
                this.f159086b = r2;
                this.f159087c = r3;
                this.d = r4;
            }

            public final String b() {
                return this.f159087c;
            }

            public final String c() {
                return this.f159086b;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof f) == true) goto L8;
                return false;
            L8:
                f r52 = (f) r5;
                if (p.g(this.f159086b, r52.f159086b) == true) goto L12;
                return false;
            L12:
                if (p.g(this.f159087c, r52.f159087c) == true) goto L15;
                return false;
            L15:
                if (p.g(this.d, r52.d) == true) goto L17;
                return false;
            L17:
                return true;
            }

            public int hashCode() {
                int r02 = ((this.f159086b.hashCode() * 31) + this.f159087c.hashCode()) * 31;
                String r1 = this.d;
                if (r1 != null) goto L5;
                int r12 = 0;
            L7:
                return r02 + r12;
            L5:
                r12 = r1.hashCode();
                goto L7
            }

            public String toString() {
                return "VerifyOtpNewPhone(token=" + this.f159086b + ", otp=" + this.f159087c + ", newNumber=" + this.d + ")";
            }
        }

        public static final class g extends b {

            /* renamed from: b, reason: collision with root package name */
            public final String f159088b;

            /* renamed from: c, reason: collision with root package name */
            public final String f159089c;

            public g(String r2, String r3) {
                p.l(r2, "token");
                super(r3, null);
                this.f159088b = r2;
                this.f159089c = r3;
            }

            public final String b() {
                return this.f159088b;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof g) == true) goto L8;
                return false;
            L8:
                g r52 = (g) r5;
                if (p.g(this.f159088b, r52.f159088b) == true) goto L12;
                return false;
            L12:
                if (p.g(this.f159089c, r52.f159089c) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                int r02 = this.f159088b.hashCode() * 31;
                String r1 = this.f159089c;
                if (r1 != null) goto L5;
                int r12 = 0;
            L7:
                return r02 + r12;
            L5:
                r12 = r1.hashCode();
                goto L7
            }

            public String toString() {
                return "VerifyVaas(token=" + this.f159088b + ", newNumber=" + this.f159089c + ")";
            }
        }

        public /* synthetic */ b(String r1, kotlin.jvm.internal.i r2) {
            this(r1);
        }

        public final String a() {
            return this.f159070a;
        }

        public b(String r1) {
            this.f159070a = r1;
        }
    }
}
