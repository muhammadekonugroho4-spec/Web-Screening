package com.stockbit.domain.model.tradingpin;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public abstract class h {

    public static final class a extends h {

        /* renamed from: a, reason: collision with root package name */
        public static final a f86100a = null;

        static {
            f86100a = new a();
        }

        public a() {
            super(null);
        }
    }

    public static final class b extends h {

        /* renamed from: a, reason: collision with root package name */
        public final String f86101a;

        /* renamed from: b, reason: collision with root package name */
        public final String f86102b;

        public b(String r2, String r3) {
            p.l(r2, "sessionToken");
            p.l(r3, "newPin");
            super(null);
            this.f86101a = r2;
            this.f86102b = r3;
        }

        public final String a() {
            return this.f86102b;
        }

        public final String b() {
            return this.f86101a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (p.g(this.f86101a, r52.f86101a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f86102b, r52.f86102b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f86101a.hashCode() * 31) + this.f86102b.hashCode();
        }

        public String toString() {
            return "PinConfirmation(sessionToken=" + this.f86101a + ", newPin=" + this.f86102b + ")";
        }
    }

    public static final class c extends h {

        /* renamed from: a, reason: collision with root package name */
        public final String f86103a;

        /* renamed from: b, reason: collision with root package name */
        public final String f86104b;

        public c(String r2, String r3) {
            p.l(r2, "sessionToken");
            p.l(r3, "newPin");
            super(null);
            this.f86103a = r2;
            this.f86104b = r3;
        }

        public final String a() {
            return this.f86104b;
        }

        public final String b() {
            return this.f86103a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (p.g(this.f86103a, r52.f86103a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f86104b, r52.f86104b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f86103a.hashCode() * 31) + this.f86104b.hashCode();
        }

        public String toString() {
            return "PinCreation(sessionToken=" + this.f86103a + ", newPin=" + this.f86104b + ")";
        }
    }

    public static final class d extends h {

        /* renamed from: a, reason: collision with root package name */
        public final String f86105a;

        /* renamed from: b, reason: collision with root package name */
        public final String f86106b;

        public d(String r2, String r3) {
            p.l(r2, "sessionToken");
            p.l(r3, "currentPin");
            super(null);
            this.f86105a = r2;
            this.f86106b = r3;
        }

        public final String a() {
            return this.f86106b;
        }

        public final String b() {
            return this.f86105a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof d) == true) goto L8;
            return false;
        L8:
            d r52 = (d) r5;
            if (p.g(this.f86105a, r52.f86105a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f86106b, r52.f86106b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f86105a.hashCode() * 31) + this.f86106b.hashCode();
        }

        public String toString() {
            return "VerifyCurrentPin(sessionToken=" + this.f86105a + ", currentPin=" + this.f86106b + ")";
        }
    }

    public static final class e extends h {

        /* renamed from: a, reason: collision with root package name */
        public final String f86107a;

        /* renamed from: b, reason: collision with root package name */
        public final String f86108b;

        public e(String r2, String r3) {
            p.l(r2, "sessionToken");
            p.l(r3, "correlationId");
            super(null);
            this.f86107a = r2;
            this.f86108b = r3;
        }

        public final String a() {
            return this.f86108b;
        }

        public final String b() {
            return this.f86107a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof e) == true) goto L8;
            return false;
        L8:
            e r52 = (e) r5;
            if (p.g(this.f86107a, r52.f86107a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f86108b, r52.f86108b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f86107a.hashCode() * 31) + this.f86108b.hashCode();
        }

        public String toString() {
            return "VerifyFaceMatching(sessionToken=" + this.f86107a + ", correlationId=" + this.f86108b + ")";
        }
    }

    public static final class f extends h {

        /* renamed from: a, reason: collision with root package name */
        public final String f86109a;

        /* renamed from: b, reason: collision with root package name */
        public final String f86110b;

        public f(String r2, String r3) {
            p.l(r2, "sessionToken");
            p.l(r3, "otp");
            super(null);
            this.f86109a = r2;
            this.f86110b = r3;
        }

        public final String a() {
            return this.f86110b;
        }

        public final String b() {
            return this.f86109a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof f) == true) goto L8;
            return false;
        L8:
            f r52 = (f) r5;
            if (p.g(this.f86109a, r52.f86109a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f86110b, r52.f86110b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f86109a.hashCode() * 31) + this.f86110b.hashCode();
        }

        public String toString() {
            return "VerifyOtp(sessionToken=" + this.f86109a + ", otp=" + this.f86110b + ")";
        }
    }

    public static final class g extends h {

        /* renamed from: a, reason: collision with root package name */
        public final String f86111a;

        public g(String r2) {
            p.l(r2, "sessionToken");
            super(null);
            this.f86111a = r2;
        }

        public final String a() {
            return this.f86111a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof g) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f86111a, ((g) r4).f86111a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f86111a.hashCode();
        }

        public String toString() {
            return "VerifyVaas(sessionToken=" + this.f86111a + ")";
        }
    }

    public /* synthetic */ h(i r1) {
        this();
    }

    public h() {
    }
}
