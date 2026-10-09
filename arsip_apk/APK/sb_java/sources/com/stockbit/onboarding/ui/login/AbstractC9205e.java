package com.stockbit.onboarding.ui.login;

import com.clevertap.android.sdk.Constants;
import com.stockbit.authenticator.contract.BiometricAccountUIParam;

/* renamed from: com.stockbit.onboarding.ui.login.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC9205e {

    /* renamed from: com.stockbit.onboarding.ui.login.e$a */
    public static abstract class a extends AbstractC9205e {

        /* renamed from: com.stockbit.onboarding.ui.login.e$a$a, reason: collision with other inner class name */
        public static final class C1080a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C1080a f123784a = null;

            static {
                f123784a = new C1080a();
            }

            public C1080a() {
                super(null);
            }
        }

        static {
        }

        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
            super(null);
        }
    }

    /* renamed from: com.stockbit.onboarding.ui.login.e$b */
    public static final class b extends AbstractC9205e {

        /* renamed from: a, reason: collision with root package name */
        public static final b f123785a = null;

        static {
            f123785a = new b();
        }

        public b() {
            super(null);
        }
    }

    /* renamed from: com.stockbit.onboarding.ui.login.e$c */
    public static final class c extends AbstractC9205e {

        /* renamed from: a, reason: collision with root package name */
        public static final c f123786a = null;

        static {
            f123786a = new c();
        }

        public c() {
            super(null);
        }
    }

    /* renamed from: com.stockbit.onboarding.ui.login.e$d */
    public static final class d extends AbstractC9205e {

        /* renamed from: a, reason: collision with root package name */
        public final BiometricAccountUIParam f123787a;

        static {
        }

        public d(BiometricAccountUIParam r2) {
            kotlin.jvm.internal.p.l(r2, "account");
            super(null);
            this.f123787a = r2;
        }

        public final BiometricAccountUIParam a() {
            return this.f123787a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f123787a, ((d) r4).f123787a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f123787a.hashCode();
        }

        public String toString() {
            return "LoginByFingerprintAccountSelectFromList(account=" + this.f123787a + ')';
        }
    }

    /* renamed from: com.stockbit.onboarding.ui.login.e$e, reason: collision with other inner class name */
    public static final class C1081e extends AbstractC9205e {

        /* renamed from: a, reason: collision with root package name */
        public static final C1081e f123788a = null;

        static {
            f123788a = new C1081e();
        }

        public C1081e() {
            super(null);
        }
    }

    /* renamed from: com.stockbit.onboarding.ui.login.e$f */
    public static final class f extends AbstractC9205e {

        /* renamed from: a, reason: collision with root package name */
        public final String f123789a;

        static {
        }

        public f(String r2) {
            kotlin.jvm.internal.p.l(r2, "loggedInUsername");
            super(null);
            this.f123789a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof f) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f123789a, ((f) r4).f123789a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f123789a.hashCode();
        }

        public String toString() {
            return "LoginSuccess(loggedInUsername=" + this.f123789a + ')';
        }
    }

    /* renamed from: com.stockbit.onboarding.ui.login.e$g */
    public static final class g extends AbstractC9205e {

        /* renamed from: a, reason: collision with root package name */
        public final String f123790a;

        /* renamed from: b, reason: collision with root package name */
        public final String f123791b;

        static {
        }

        public g(String r2, String r3) {
            kotlin.jvm.internal.p.l(r2, Constants.KEY_TITLE);
            kotlin.jvm.internal.p.l(r3, "message");
            super(null);
            this.f123790a = r2;
            this.f123791b = r3;
        }

        public final String a() {
            return this.f123791b;
        }

        public final String b() {
            return this.f123790a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof g) == true) goto L8;
            return false;
        L8:
            g r52 = (g) r5;
            if (kotlin.jvm.internal.p.g(this.f123790a, r52.f123790a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f123791b, r52.f123791b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f123790a.hashCode() * 31) + this.f123791b.hashCode();
        }

        public String toString() {
            return "ShowLimitExceededDialog(title=" + this.f123790a + ", message=" + this.f123791b + ')';
        }
    }

    static {
    }

    public /* synthetic */ AbstractC9205e(kotlin.jvm.internal.i r1) {
        this();
    }

    public AbstractC9205e() {
    }
}
