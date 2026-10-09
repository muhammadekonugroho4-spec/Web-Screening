package com.stockbit.usecase.forgotphone.model;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: com.stockbit.usecase.forgotphone.model.a$a, reason: collision with other inner class name */
    public static final class C1492a extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f157945a;

        /* renamed from: b, reason: collision with root package name */
        public final String f157946b;

        /* renamed from: c, reason: collision with root package name */
        public final String f157947c;

        public C1492a(String r2, String r3, String r4) {
            p.l(r2, "token");
            p.l(r3, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
            p.l(r4, "number");
            super(null);
            this.f157945a = r2;
            this.f157946b = r3;
            this.f157947c = r4;
        }

        public final String a() {
            return this.f157946b;
        }

        public final String b() {
            return this.f157947c;
        }

        public final String c() {
            return this.f157945a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C1492a) == true) goto L8;
            return false;
        L8:
            C1492a r52 = (C1492a) r5;
            if (p.g(this.f157945a, r52.f157945a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f157946b, r52.f157946b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f157947c, r52.f157947c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f157945a.hashCode() * 31) + this.f157946b.hashCode()) * 31) + this.f157947c.hashCode();
        }

        public String toString() {
            return "CreateNewPhone(token=" + this.f157945a + ", countryCode=" + this.f157946b + ", number=" + this.f157947c + ")";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f157948a;

        public b(String r2) {
            p.l(r2, "verificationToken");
            super(null);
            this.f157948a = r2;
        }

        public final String a() {
            return this.f157948a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157948a, ((b) r4).f157948a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f157948a.hashCode();
        }

        public String toString() {
            return "InitiateNonLogin(verificationToken=" + this.f157948a + ")";
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f157949a;

        public c(String r2) {
            p.l(r2, "credentialDataChangeToken");
            super(null);
            this.f157949a = r2;
        }

        public final String a() {
            return this.f157949a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f157949a, ((c) r4).f157949a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f157949a.hashCode();
        }

        public String toString() {
            return "InitiateOnDataChange(credentialDataChangeToken=" + this.f157949a + ")";
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f157950a;

        /* renamed from: b, reason: collision with root package name */
        public final String f157951b;

        /* renamed from: c, reason: collision with root package name */
        public final String f157952c;

        public d(String r2, String r3, String r4) {
            p.l(r2, "token");
            p.l(r3, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
            p.l(r4, "number");
            super(null);
            this.f157950a = r2;
            this.f157951b = r3;
            this.f157952c = r4;
        }

        public final String a() {
            return this.f157951b;
        }

        public final String b() {
            return this.f157952c;
        }

        public final String c() {
            return this.f157950a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof d) == true) goto L8;
            return false;
        L8:
            d r52 = (d) r5;
            if (p.g(this.f157950a, r52.f157950a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f157951b, r52.f157951b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f157952c, r52.f157952c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f157950a.hashCode() * 31) + this.f157951b.hashCode()) * 31) + this.f157952c.hashCode();
        }

        public String toString() {
            return "VerifyCurrentPhone(token=" + this.f157950a + ", countryCode=" + this.f157951b + ", number=" + this.f157952c + ")";
        }
    }

    public static final class e extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f157953a;

        /* renamed from: b, reason: collision with root package name */
        public final String f157954b;

        public e(String r2, String r3) {
            p.l(r2, "token");
            p.l(r3, "correlationId");
            super(null);
            this.f157953a = r2;
            this.f157954b = r3;
        }

        public final String a() {
            return this.f157954b;
        }

        public final String b() {
            return this.f157953a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof e) == true) goto L8;
            return false;
        L8:
            e r52 = (e) r5;
            if (p.g(this.f157953a, r52.f157953a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f157954b, r52.f157954b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f157953a.hashCode() * 31) + this.f157954b.hashCode();
        }

        public String toString() {
            return "VerifyFaceMatching(token=" + this.f157953a + ", correlationId=" + this.f157954b + ")";
        }
    }

    public static final class f extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f157955a;

        /* renamed from: b, reason: collision with root package name */
        public final String f157956b;

        public f(String r2, String r3) {
            p.l(r2, "token");
            p.l(r3, "otp");
            super(null);
            this.f157955a = r2;
            this.f157956b = r3;
        }

        public final String a() {
            return this.f157956b;
        }

        public final String b() {
            return this.f157955a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof f) == true) goto L8;
            return false;
        L8:
            f r52 = (f) r5;
            if (p.g(this.f157955a, r52.f157955a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f157956b, r52.f157956b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f157955a.hashCode() * 31) + this.f157956b.hashCode();
        }

        public String toString() {
            return "VerifyNewPhoneOtp(token=" + this.f157955a + ", otp=" + this.f157956b + ")";
        }
    }

    public static final class g extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f157957a;

        /* renamed from: b, reason: collision with root package name */
        public final String f157958b;

        public g(String r2, String r3) {
            p.l(r2, "token");
            p.l(r3, "pin");
            super(null);
            this.f157957a = r2;
            this.f157958b = r3;
        }

        public final String a() {
            return this.f157958b;
        }

        public final String b() {
            return this.f157957a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof g) == true) goto L8;
            return false;
        L8:
            g r52 = (g) r5;
            if (p.g(this.f157957a, r52.f157957a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f157958b, r52.f157958b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f157957a.hashCode() * 31) + this.f157958b.hashCode();
        }

        public String toString() {
            return "VerifyPin(token=" + this.f157957a + ", pin=" + this.f157958b + ")";
        }
    }

    public /* synthetic */ a(i r1) {
        this();
    }

    public a() {
    }
}
