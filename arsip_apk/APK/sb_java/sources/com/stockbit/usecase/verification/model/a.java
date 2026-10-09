package com.stockbit.usecase.verification.model;

import com.stockbit.features.model.OTPChannelValue;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface a {

    /* renamed from: com.stockbit.usecase.verification.model.a$a, reason: collision with other inner class name */
    public static final class C1709a implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final C1709a f164443a = null;

        static {
            f164443a = new C1709a();
        }

        public C1709a() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof C1709a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 455177834;
        }

        public String toString() {
            return "DukcapilIdentityVerification";
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f164444a = null;

        static {
            f164444a = new b();
        }

        public b() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof b) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -614621552;
        }

        public String toString() {
            return "FaceMatching";
        }
    }

    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f164445a = null;

        static {
            f164445a = new c();
        }

        public c() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof c) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -677184983;
        }

        public String toString() {
            return "Finish";
        }
    }

    public static final class d implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f164446a = null;

        static {
            f164446a = new d();
        }

        public d() {
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
            return -1696804652;
        }

        public String toString() {
            return "Identity";
        }
    }

    public static final class e implements a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f164447a;

        /* renamed from: b, reason: collision with root package name */
        public final OTPChannelValue f164448b;

        /* renamed from: c, reason: collision with root package name */
        public final List f164449c;

        public e(boolean r2, OTPChannelValue r3, List r4) {
            p.l(r3, "defaultChannel");
            p.l(r4, "channels");
            this.f164447a = r2;
            this.f164448b = r3;
            this.f164449c = r4;
        }

        public final List a() {
            return this.f164449c;
        }

        public final OTPChannelValue b() {
            return this.f164448b;
        }

        public final boolean c() {
            return this.f164447a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof e) == true) goto L8;
            return false;
        L8:
            e r52 = (e) r5;
            if (this.f164447a == r52.f164447a) goto L12;
            return false;
        L12:
            if (p.g(this.f164448b, r52.f164448b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f164449c, r52.f164449c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.f164447a) * 31) + this.f164448b.hashCode()) * 31) + this.f164449c.hashCode();
        }

        public String toString() {
            return "OTP(lostPhoneFlowEnabled=" + this.f164447a + ", defaultChannel=" + this.f164448b + ", channels=" + this.f164449c + ')';
        }
    }

    public static final class f implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final f f164450a = null;

        static {
            f164450a = new f();
        }

        public f() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof f) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return -1542776897;
        }

        public String toString() {
            return "PIN";
        }
    }

    public static final class g implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final g f164451a = null;

        static {
            f164451a = new g();
        }

        public g() {
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
            return -344057167;
        }

        public String toString() {
            return "Password";
        }
    }
}
