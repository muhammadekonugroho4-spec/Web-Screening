package com.stockbit.component.otp.ui.newotp;

import com.stockbit.usecase.otp.model.a;

/* loaded from: classes7.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f73521a;

    /* renamed from: b, reason: collision with root package name */
    public final int f73522b;

    /* renamed from: c, reason: collision with root package name */
    public final int f73523c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f73524e;

    /* renamed from: f, reason: collision with root package name */
    public final com.stockbit.usecase.otp.model.a f73525f;

    public static final class a extends q {

        /* renamed from: g, reason: collision with root package name */
        public final a.C1542a f73526g;

        static {
        }

        public a(a.C1542a r10) {
            kotlin.jvm.internal.p.l(r10, "otp");
            super(com.stockbit.component.otp.f.f73359x, com.stockbit.component.otp.f.f73356u, com.stockbit.component.otp.f.f73345j, com.stockbit.component.otp.b.f73238a, 0, r10, null);
            this.f73526g = r10;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f73526g, ((a) r4).f73526g) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f73526g.hashCode();
        }

        public String toString() {
            return "Email(otp=" + this.f73526g + ')';
        }
    }

    public static final class b extends q {

        /* renamed from: g, reason: collision with root package name */
        public final a.b f73527g;

        static {
        }

        public b(a.b r10) {
            kotlin.jvm.internal.p.l(r10, "otp");
            super(com.stockbit.component.otp.f.f73360y, com.stockbit.component.otp.f.f73357v, com.stockbit.component.otp.f.f73346k, com.stockbit.component.otp.b.f73242f, 2, r10, null);
            this.f73527g = r10;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f73527g, ((b) r4).f73527g) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f73527g.hashCode();
        }

        public String toString() {
            return "Sms(otp=" + this.f73527g + ')';
        }
    }

    public static final class c extends q {

        /* renamed from: g, reason: collision with root package name */
        public final a.d f73528g;

        static {
        }

        public c(a.d r10) {
            kotlin.jvm.internal.p.l(r10, "otp");
            super(com.stockbit.component.otp.f.f73361z, com.stockbit.component.otp.f.f73358w, com.stockbit.component.otp.f.f73347l, com.stockbit.component.otp.b.f73243g, 1, r10, null);
            this.f73528g = r10;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f73528g, ((c) r4).f73528g) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f73528g.hashCode();
        }

        public String toString() {
            return "Whatsapp(otp=" + this.f73528g + ')';
        }
    }

    static {
    }

    public /* synthetic */ q(int r1, int r2, int r3, int r4, int r5, com.stockbit.usecase.otp.model.a r6, kotlin.jvm.internal.i r7) {
        this(r1, r2, r3, r4, r5, r6);
    }

    public final int a() {
        return this.f73524e;
    }

    public final int b() {
        return this.d;
    }

    public final int c() {
        return this.f73523c;
    }

    public final com.stockbit.usecase.otp.model.a d() {
        return this.f73525f;
    }

    public final int e() {
        return this.f73522b;
    }

    public final int f() {
        return this.f73521a;
    }

    public q(int r1, int r2, int r3, int r4, int r5, com.stockbit.usecase.otp.model.a r6) {
        this.f73521a = r1;
        this.f73522b = r2;
        this.f73523c = r3;
        this.d = r4;
        this.f73524e = r5;
        this.f73525f = r6;
    }
}
