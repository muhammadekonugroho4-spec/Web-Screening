package com.stockbit.repository.model.forgotphone;

import com.stockbit.features.model.OTPChannelValue;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public abstract class b {

    /* renamed from: b, reason: collision with root package name */
    public static final a f130221b = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f130222a;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: com.stockbit.repository.model.forgotphone.b$b, reason: collision with other inner class name */
    public static final class C1177b extends b {

        /* renamed from: c, reason: collision with root package name */
        public static final C1177b f130223c = null;

        static {
            f130223c = new C1177b();
        }

        public C1177b() {
            super("CHALLENGE_REQUEST_NEW_PHONE_NUMBER", null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1177b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -583361917;
        }

        public String toString() {
            return "CreateNewPhone";
        }
    }

    public static final class c extends b {

        /* renamed from: c, reason: collision with root package name */
        public final String f130224c;

        public c(String r3) {
            p.l(r3, "maskedCurrentPhoneNumber");
            super("CHALLENGE_CURRENT_PHONE", null);
            this.f130224c = r3;
        }

        public final String a() {
            return this.f130224c;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f130224c, ((c) r4).f130224c) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f130224c.hashCode();
        }

        public String toString() {
            return "CurrentPhone(maskedCurrentPhoneNumber=" + this.f130224c + ")";
        }
    }

    public static final class d extends b {

        /* renamed from: c, reason: collision with root package name */
        public static final d f130225c = null;

        static {
            f130225c = new d();
        }

        public d() {
            super("CHALLENGE_CURRENT_PIN", null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof d) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 190368661;
        }

        public String toString() {
            return "CurrentPin";
        }
    }

    public static final class e extends b {

        /* renamed from: c, reason: collision with root package name */
        public static final e f130226c = null;

        static {
            f130226c = new e();
        }

        public e() {
            super("CHALLENGE_FACE_MATCHING", null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof e) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -905839245;
        }

        public String toString() {
            return "FaceMatching";
        }
    }

    public static final class f extends b {

        /* renamed from: c, reason: collision with root package name */
        public final boolean f130227c;
        public final OTPChannelValue d;

        /* renamed from: e, reason: collision with root package name */
        public final List f130228e;

        public f(boolean r3, OTPChannelValue r4, List r5) {
            p.l(r4, "default");
            p.l(r5, "otpChannels");
            super("CHALLENGE_NEW_PHONE_NUMBER_OTP", null);
            this.f130227c = r3;
            this.d = r4;
            this.f130228e = r5;
        }

        public final OTPChannelValue a() {
            return this.d;
        }

        public final List b() {
            return this.f130228e;
        }

        public final boolean c() {
            return this.f130227c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof f) == true) goto L8;
            return false;
        L8:
            f r52 = (f) r5;
            if (this.f130227c == r52.f130227c) goto L12;
            return false;
        L12:
            if (p.g(this.d, r52.d) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f130228e, r52.f130228e) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.f130227c) * 31) + this.d.hashCode()) * 31) + this.f130228e.hashCode();
        }

        public String toString() {
            return "NewPhoneOtp(showForgotPhoneButton=" + this.f130227c + ", default=" + this.d + ", otpChannels=" + this.f130228e + ")";
        }
    }

    public static final class g extends b {

        /* renamed from: c, reason: collision with root package name */
        public static final g f130229c = null;

        static {
            f130229c = new g();
        }

        public g() {
            super("CHALLENGE_UNSPECIFIED", null);
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof g) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -620829666;
        }

        public String toString() {
            return "Unspecified";
        }
    }

    static {
        f130221b = new a(null);
    }

    public /* synthetic */ b(String r1, i r2) {
        this(r1);
    }

    public b(String r1) {
        this.f130222a = r1;
    }
}
