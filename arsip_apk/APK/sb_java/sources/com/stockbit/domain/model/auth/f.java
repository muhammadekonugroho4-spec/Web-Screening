package com.stockbit.domain.model.auth;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final b f80647a;

    /* renamed from: b, reason: collision with root package name */
    public final m f80648b;

    /* renamed from: c, reason: collision with root package name */
    public final m f80649c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public l f80650e;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f80651a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f80652b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f80653c;

        public a(boolean r1, boolean r2, boolean r3) {
            this.f80651a = r1;
            this.f80652b = r2;
            this.f80653c = r3;
        }

        public final boolean a() {
            return this.f80652b;
        }

        public final boolean b() {
            return this.f80651a;
        }

        public final boolean c() {
            return this.f80653c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (this.f80651a == r52.f80651a) goto L12;
            return false;
        L12:
            if (this.f80652b == r52.f80652b) goto L15;
            return false;
        L15:
            if (this.f80653c == r52.f80653c) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.f80651a) * 31) + Boolean.hashCode(this.f80652b)) * 31) + Boolean.hashCode(this.f80653c);
        }

        public String toString() {
            return "Sns(facebook=" + this.f80651a + ", apple=" + this.f80652b + ", google=" + this.f80653c + ")";
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f80654a;

        /* renamed from: b, reason: collision with root package name */
        public final String f80655b;

        /* renamed from: c, reason: collision with root package name */
        public final String f80656c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final String f80657e;

        /* renamed from: f, reason: collision with root package name */
        public final String f80658f;

        /* renamed from: g, reason: collision with root package name */
        public final a f80659g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f80660h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f80661i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f80662j;

        /* renamed from: k, reason: collision with root package name */
        public final j f80663k;

        /* renamed from: l, reason: collision with root package name */
        public final int f80664l;

        /* renamed from: m, reason: collision with root package name */
        public final String f80665m;

        public b(int r2, String r3, String r4, String r5, String r6, String r7, a r8, boolean r9, boolean r10, boolean r11, j r12, int r13, String r14) {
            p.l(r3, "username");
            p.l(r4, "email");
            p.l(r5, "fullName");
            p.l(r6, "avatar");
            p.l(r7, "country");
            p.l(r8, "sns");
            p.l(r12, "privilege");
            p.l(r14, "exchange");
            this.f80654a = r2;
            this.f80655b = r3;
            this.f80656c = r4;
            this.d = r5;
            this.f80657e = r6;
            this.f80658f = r7;
            this.f80659g = r8;
            this.f80660h = r9;
            this.f80661i = r10;
            this.f80662j = r11;
            this.f80663k = r12;
            this.f80664l = r13;
            this.f80665m = r14;
        }

        public final String a() {
            return this.f80657e;
        }

        public final String b() {
            return this.f80658f;
        }

        public final String c() {
            return this.f80656c;
        }

        public final String d() {
            return this.f80665m;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (this.f80654a == r52.f80654a) goto L12;
            return false;
        L12:
            if (p.g(this.f80655b, r52.f80655b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f80656c, r52.f80656c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (p.g(this.f80657e, r52.f80657e) == true) goto L24;
            return false;
        L24:
            if (p.g(this.f80658f, r52.f80658f) == true) goto L27;
            return false;
        L27:
            if (p.g(this.f80659g, r52.f80659g) == true) goto L30;
            return false;
        L30:
            if (this.f80660h == r52.f80660h) goto L33;
            return false;
        L33:
            if (this.f80661i == r52.f80661i) goto L36;
            return false;
        L36:
            if (this.f80662j == r52.f80662j) goto L39;
            return false;
        L39:
            if (p.g(this.f80663k, r52.f80663k) == true) goto L42;
            return false;
        L42:
            if (this.f80664l == r52.f80664l) goto L45;
            return false;
        L45:
            if (p.g(this.f80665m, r52.f80665m) == true) goto L47;
            return false;
        L47:
            return true;
        }

        public final boolean f() {
            return this.f80660h;
        }

        public final int g() {
            return this.f80654a;
        }

        public final j h() {
            return this.f80663k;
        }

        public int hashCode() {
            return (((((((((((((((((((((((Integer.hashCode(this.f80654a) * 31) + this.f80655b.hashCode()) * 31) + this.f80656c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f80657e.hashCode()) * 31) + this.f80658f.hashCode()) * 31) + this.f80659g.hashCode()) * 31) + Boolean.hashCode(this.f80660h)) * 31) + Boolean.hashCode(this.f80661i)) * 31) + Boolean.hashCode(this.f80662j)) * 31) + this.f80663k.hashCode()) * 31) + Integer.hashCode(this.f80664l)) * 31) + this.f80665m.hashCode();
        }

        public final a i() {
            return this.f80659g;
        }

        public final String j() {
            return this.f80655b;
        }

        public final int k() {
            return this.f80664l;
        }

        public final boolean l() {
            return this.f80661i;
        }

        public final boolean m() {
            return this.f80662j;
        }

        public String toString() {
            return "UserInfoEntity(id=" + this.f80654a + ", username=" + this.f80655b + ", email=" + this.f80656c + ", fullName=" + this.d + ", avatar=" + this.f80657e + ", country=" + this.f80658f + ", sns=" + this.f80659g + ", hasPasswordBeenSet=" + this.f80660h + ", isPhoneVerified=" + this.f80661i + ", isVerified=" + this.f80662j + ", privilege=" + this.f80663k + ", watchlistId=" + this.f80664l + ", exchange=" + this.f80665m + ")";
        }
    }

    public f(b r2, m r3, m r4, String r5, l r6) {
        p.l(r2, "userInfoEntity");
        p.l(r3, "accessToken");
        p.l(r4, "refreshToken");
        p.l(r5, "oneSignalHash");
        p.l(r6, "supportData");
        this.f80647a = r2;
        this.f80648b = r3;
        this.f80649c = r4;
        this.d = r5;
        this.f80650e = r6;
    }

    public final m a() {
        return this.f80648b;
    }

    public final String b() {
        return this.d;
    }

    public final m c() {
        return this.f80649c;
    }

    public final l d() {
        return this.f80650e;
    }

    public final b e() {
        return this.f80647a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f80647a, r52.f80647a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f80648b, r52.f80648b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f80649c, r52.f80649c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f80650e, r52.f80650e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f80647a.hashCode() * 31) + this.f80648b.hashCode()) * 31) + this.f80649c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f80650e.hashCode();
    }

    public String toString() {
        return "LoginEntity(userInfoEntity=" + this.f80647a + ", accessToken=" + this.f80648b + ", refreshToken=" + this.f80649c + ", oneSignalHash=" + this.d + ", supportData=" + this.f80650e + ")";
    }
}
