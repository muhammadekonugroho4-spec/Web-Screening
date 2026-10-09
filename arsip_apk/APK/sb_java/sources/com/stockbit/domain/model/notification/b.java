package com.stockbit.domain.model.notification;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f84489a;

        public a(String r2) {
            p.l(r2, "symbol");
            super(null);
            this.f84489a = r2;
        }

        public final String a() {
            return this.f84489a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f84489a, ((a) r4).f84489a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f84489a.hashCode();
        }

        public String toString() {
            return "CompanyPage(symbol=" + this.f84489a + ")";
        }
    }

    /* renamed from: com.stockbit.domain.model.notification.b$b, reason: collision with other inner class name */
    public static final class C0783b extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f84490a;

        public C0783b(String r2) {
            p.l(r2, "symbol");
            super(null);
            this.f84490a = r2;
        }

        public final String a() {
            return this.f84490a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C0783b) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f84490a, ((C0783b) r4).f84490a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f84490a.hashCode();
        }

        public String toString() {
            return "EIpoCompanyDetail(symbol=" + this.f84490a + ")";
        }
    }

    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f84491a = null;

        static {
            f84491a = new c();
        }

        public c() {
            super(null);
        }
    }

    public static final class d extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final d f84492a = null;

        static {
            f84492a = new d();
        }

        public d() {
            super(null);
        }
    }

    public static final class e extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final e f84493a = null;

        static {
            f84493a = new e();
        }

        public e() {
            super(null);
        }
    }

    public static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f84494a;

        public f(String r2) {
            p.l(r2, "alertId");
            super(null);
            this.f84494a = r2;
        }

        public final String a() {
            return this.f84494a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof f) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f84494a, ((f) r4).f84494a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f84494a.hashCode();
        }

        public String toString() {
            return "PriceAlert(alertId=" + this.f84494a + ")";
        }
    }

    public static final class g extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f84495a;

        public g(String r2) {
            p.l(r2, "profileId");
            super(null);
            this.f84495a = r2;
        }

        public final String a() {
            return this.f84495a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof g) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f84495a, ((g) r4).f84495a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f84495a.hashCode();
        }

        public String toString() {
            return "ProfilePage(profileId=" + this.f84495a + ")";
        }
    }

    public static final class h extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final h f84496a = null;

        static {
            f84496a = new h();
        }

        public h() {
            super(null);
        }
    }

    public static final class i extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f84497a;

        /* renamed from: b, reason: collision with root package name */
        public final int f84498b;

        public i(String r2, int r3) {
            p.l(r2, "postId");
            super(null);
            this.f84497a = r2;
            this.f84498b = r3;
        }

        public final int a() {
            return this.f84498b;
        }

        public final String b() {
            return this.f84497a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof i) == true) goto L8;
            return false;
        L8:
            i r52 = (i) r5;
            if (p.g(this.f84497a, r52.f84497a) == true) goto L12;
            return false;
        L12:
            if (this.f84498b == r52.f84498b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f84497a.hashCode() * 31) + Integer.hashCode(this.f84498b);
        }

        public String toString() {
            return "StreamConversation(postId=" + this.f84497a + ", itemPosition=" + this.f84498b + ")";
        }
    }

    public static final class j extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final j f84499a = null;

        static {
            f84499a = new j();
        }

        public j() {
            super(null);
        }
    }

    public static final class k extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f84500a;

        public k(String r2) {
            p.l(r2, "tippingId");
            super(null);
            this.f84500a = r2;
        }

        public final String a() {
            return this.f84500a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof k) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f84500a, ((k) r4).f84500a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f84500a.hashCode();
        }

        public String toString() {
            return "TippingClaimDialog(tippingId=" + this.f84500a + ")";
        }
    }

    public static final class l extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f84501a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f84502b;

        public l(String r2, boolean r3) {
            p.l(r2, "tippingId");
            super(null);
            this.f84501a = r2;
            this.f84502b = r3;
        }

        public final String a() {
            return this.f84501a;
        }

        public final boolean b() {
            return this.f84502b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof l) == true) goto L8;
            return false;
        L8:
            l r52 = (l) r5;
            if (p.g(this.f84501a, r52.f84501a) == true) goto L12;
            return false;
        L12:
            if (this.f84502b == r52.f84502b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f84501a.hashCode() * 31) + Boolean.hashCode(this.f84502b);
        }

        public String toString() {
            return "TippingSendReceiveDialog(tippingId=" + this.f84501a + ", isReceive=" + this.f84502b + ")";
        }
    }

    public static final class m extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f84503a;

        public m(String r2) {
            p.l(r2, "username");
            super(null);
            this.f84503a = r2;
        }

        public final String a() {
            return this.f84503a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof m) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f84503a, ((m) r4).f84503a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f84503a.hashCode();
        }

        public String toString() {
            return "TradingCommunity(username=" + this.f84503a + ")";
        }
    }

    public /* synthetic */ b(kotlin.jvm.internal.i r1) {
        this();
    }

    public b() {
    }
}
