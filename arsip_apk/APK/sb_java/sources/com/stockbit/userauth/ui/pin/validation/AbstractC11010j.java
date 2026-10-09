package com.stockbit.userauth.ui.pin.validation;

/* renamed from: com.stockbit.userauth.ui.pin.validation.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC11010j {

    /* renamed from: com.stockbit.userauth.ui.pin.validation.j$a */
    public static final class a extends AbstractC11010j {

        /* renamed from: a, reason: collision with root package name */
        public final String f165395a;

        /* renamed from: b, reason: collision with root package name */
        public final String f165396b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f165397c;

        static {
        }

        public a(String r2, String r3, boolean r4) {
            kotlin.jvm.internal.p.l(r2, "pin");
            kotlin.jvm.internal.p.l(r3, "userId");
            super(null);
            this.f165395a = r2;
            this.f165396b = r3;
            this.f165397c = r4;
        }

        public final String a() {
            return this.f165395a;
        }

        public final String b() {
            return this.f165396b;
        }

        public final boolean c() {
            return this.f165397c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (kotlin.jvm.internal.p.g(this.f165395a, r52.f165395a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f165396b, r52.f165396b) == true) goto L15;
            return false;
        L15:
            if (this.f165397c == r52.f165397c) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f165395a.hashCode() * 31) + this.f165396b.hashCode()) * 31) + Boolean.hashCode(this.f165397c);
        }

        public String toString() {
            return "OfferBiometricSetupIfAvail(pin=" + this.f165395a + ", userId=" + this.f165396b + ", isRevoked=" + this.f165397c + ')';
        }
    }

    /* renamed from: com.stockbit.userauth.ui.pin.validation.j$b */
    public static final class b extends AbstractC11010j {

        /* renamed from: a, reason: collision with root package name */
        public static final b f165398a = null;

        static {
            f165398a = new b();
        }

        public b() {
            super(null);
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
            return 672077538;
        }

        public String toString() {
            return "OnFinishAuthPin";
        }
    }

    /* renamed from: com.stockbit.userauth.ui.pin.validation.j$c */
    public static final class c extends AbstractC11010j {

        /* renamed from: a, reason: collision with root package name */
        public final String f165399a;

        static {
        }

        public c(String r2) {
            kotlin.jvm.internal.p.l(r2, "userId");
            super(null);
            this.f165399a = r2;
        }

        public final String a() {
            return this.f165399a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f165399a, ((c) r4).f165399a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f165399a.hashCode();
        }

        public String toString() {
            return "RevokeBiometric(userId=" + this.f165399a + ')';
        }
    }

    /* renamed from: com.stockbit.userauth.ui.pin.validation.j$d */
    public static final class d extends AbstractC11010j {

        /* renamed from: a, reason: collision with root package name */
        public static final d f165400a = null;

        static {
            f165400a = new d();
        }

        public d() {
            super(null);
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
            return 1557522621;
        }

        public String toString() {
            return "ShowBiometricDeprecatedDialog";
        }
    }

    static {
    }

    public /* synthetic */ AbstractC11010j(kotlin.jvm.internal.i r1) {
        this();
    }

    public AbstractC11010j() {
    }
}
