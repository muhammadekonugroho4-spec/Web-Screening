package com.stockbit.component.sharecontent.ui;

import java.util.List;

/* loaded from: classes8.dex */
public abstract class v {

    public static abstract class a extends v {

        /* renamed from: a, reason: collision with root package name */
        public final List f77236a;

        /* renamed from: com.stockbit.component.sharecontent.ui.v$a$a, reason: collision with other inner class name */
        public static final class C0743a extends a {

            /* renamed from: b, reason: collision with root package name */
            public final List f77237b;

            public C0743a(List r2) {
                kotlin.jvm.internal.p.l(r2, "messageIds");
                super(r2, null);
                this.f77237b = r2;
            }

            @Override // com.stockbit.component.sharecontent.ui.v.a
            public List a() {
                return this.f77237b;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C0743a) == true) goto L9;
                return false;
            L9:
                if (kotlin.jvm.internal.p.g(this.f77237b, ((C0743a) r4).f77237b) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f77237b.hashCode();
            }

            public String toString() {
                return "CurrentRoom(messageIds=" + this.f77237b + ')';
            }
        }

        public static final class b extends a {

            /* renamed from: b, reason: collision with root package name */
            public final List f77238b;

            /* renamed from: c, reason: collision with root package name */
            public final String f77239c;

            public b(List r2, String r3) {
                kotlin.jvm.internal.p.l(r2, "messageIds");
                kotlin.jvm.internal.p.l(r3, "message");
                super(r2, null);
                this.f77238b = r2;
                this.f77239c = r3;
            }

            @Override // com.stockbit.component.sharecontent.ui.v.a
            public List a() {
                return this.f77238b;
            }

            public final String b() {
                return this.f77239c;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof b) == true) goto L8;
                return false;
            L8:
                b r52 = (b) r5;
                if (kotlin.jvm.internal.p.g(this.f77238b, r52.f77238b) == true) goto L12;
                return false;
            L12:
                if (kotlin.jvm.internal.p.g(this.f77239c, r52.f77239c) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                return (this.f77238b.hashCode() * 31) + this.f77239c.hashCode();
            }

            public String toString() {
                return "MultipleRoom(messageIds=" + this.f77238b + ", message=" + this.f77239c + ')';
            }
        }

        public static final class c extends a {

            /* renamed from: b, reason: collision with root package name */
            public final List f77240b;

            /* renamed from: c, reason: collision with root package name */
            public final int f77241c;

            public c(List r2, int r3) {
                kotlin.jvm.internal.p.l(r2, "messageIds");
                super(r2, null);
                this.f77240b = r2;
                this.f77241c = r3;
            }

            @Override // com.stockbit.component.sharecontent.ui.v.a
            public List a() {
                return this.f77240b;
            }

            public final int b() {
                return this.f77241c;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof c) == true) goto L8;
                return false;
            L8:
                c r52 = (c) r5;
                if (kotlin.jvm.internal.p.g(this.f77240b, r52.f77240b) == true) goto L12;
                return false;
            L12:
                if (this.f77241c == r52.f77241c) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                return (this.f77240b.hashCode() * 31) + Integer.hashCode(this.f77241c);
            }

            public String toString() {
                return "SingleGroupRoom(messageIds=" + this.f77240b + ", roomId=" + this.f77241c + ')';
            }
        }

        public static final class d extends a {

            /* renamed from: b, reason: collision with root package name */
            public final List f77242b;

            /* renamed from: c, reason: collision with root package name */
            public final int f77243c;
            public final String d;

            /* renamed from: e, reason: collision with root package name */
            public final String f77244e;

            /* renamed from: f, reason: collision with root package name */
            public final boolean f77245f;

            /* renamed from: g, reason: collision with root package name */
            public final boolean f77246g;

            /* renamed from: h, reason: collision with root package name */
            public final boolean f77247h;

            public d(List r2, int r3, String r4, String r5, boolean r6, boolean r7, boolean r8) {
                kotlin.jvm.internal.p.l(r2, "messageIds");
                kotlin.jvm.internal.p.l(r4, "username");
                kotlin.jvm.internal.p.l(r5, "avatar");
                super(r2, null);
                this.f77242b = r2;
                this.f77243c = r3;
                this.d = r4;
                this.f77244e = r5;
                this.f77245f = r6;
                this.f77246g = r7;
                this.f77247h = r8;
            }

            @Override // com.stockbit.component.sharecontent.ui.v.a
            public List a() {
                return this.f77242b;
            }

            public final String b() {
                return this.f77244e;
            }

            public final int c() {
                return this.f77243c;
            }

            public final String d() {
                return this.d;
            }

            public final boolean e() {
                return this.f77246g;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof d) == true) goto L8;
                return false;
            L8:
                d r52 = (d) r5;
                if (kotlin.jvm.internal.p.g(this.f77242b, r52.f77242b) == true) goto L12;
                return false;
            L12:
                if (this.f77243c == r52.f77243c) goto L15;
                return false;
            L15:
                if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L18;
                return false;
            L18:
                if (kotlin.jvm.internal.p.g(this.f77244e, r52.f77244e) == true) goto L21;
                return false;
            L21:
                if (this.f77245f == r52.f77245f) goto L24;
                return false;
            L24:
                if (this.f77246g == r52.f77246g) goto L27;
                return false;
            L27:
                if (this.f77247h == r52.f77247h) goto L29;
                return false;
            L29:
                return true;
            }

            public final boolean f() {
                return this.f77247h;
            }

            public final boolean g() {
                return this.f77245f;
            }

            public int hashCode() {
                return (((((((((((this.f77242b.hashCode() * 31) + Integer.hashCode(this.f77243c)) * 31) + this.d.hashCode()) * 31) + this.f77244e.hashCode()) * 31) + Boolean.hashCode(this.f77245f)) * 31) + Boolean.hashCode(this.f77246g)) * 31) + Boolean.hashCode(this.f77247h);
            }

            public String toString() {
                return "SinglePersonalRoom(messageIds=" + this.f77242b + ", roomId=" + this.f77243c + ", username=" + this.d + ", avatar=" + this.f77244e + ", isVerified=" + this.f77245f + ", isBlocked=" + this.f77246g + ", isDeactivated=" + this.f77247h + ')';
            }
        }

        public static final class e extends a {

            /* renamed from: b, reason: collision with root package name */
            public final List f77248b;

            /* renamed from: c, reason: collision with root package name */
            public final int f77249c;
            public final String d;

            /* renamed from: e, reason: collision with root package name */
            public final String f77250e;

            /* renamed from: f, reason: collision with root package name */
            public final boolean f77251f;

            /* renamed from: g, reason: collision with root package name */
            public final boolean f77252g;

            /* renamed from: h, reason: collision with root package name */
            public final boolean f77253h;

            public e(List r2, int r3, String r4, String r5, boolean r6, boolean r7, boolean r8) {
                kotlin.jvm.internal.p.l(r2, "messageIds");
                kotlin.jvm.internal.p.l(r4, "username");
                kotlin.jvm.internal.p.l(r5, "avatar");
                super(r2, null);
                this.f77248b = r2;
                this.f77249c = r3;
                this.d = r4;
                this.f77250e = r5;
                this.f77251f = r6;
                this.f77252g = r7;
                this.f77253h = r8;
            }

            @Override // com.stockbit.component.sharecontent.ui.v.a
            public List a() {
                return this.f77248b;
            }

            public final String b() {
                return this.f77250e;
            }

            public final int c() {
                return this.f77249c;
            }

            public final String d() {
                return this.d;
            }

            public final boolean e() {
                return this.f77252g;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof e) == true) goto L8;
                return false;
            L8:
                e r52 = (e) r5;
                if (kotlin.jvm.internal.p.g(this.f77248b, r52.f77248b) == true) goto L12;
                return false;
            L12:
                if (this.f77249c == r52.f77249c) goto L15;
                return false;
            L15:
                if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L18;
                return false;
            L18:
                if (kotlin.jvm.internal.p.g(this.f77250e, r52.f77250e) == true) goto L21;
                return false;
            L21:
                if (this.f77251f == r52.f77251f) goto L24;
                return false;
            L24:
                if (this.f77252g == r52.f77252g) goto L27;
                return false;
            L27:
                if (this.f77253h == r52.f77253h) goto L29;
                return false;
            L29:
                return true;
            }

            public final boolean f() {
                return this.f77253h;
            }

            public final boolean g() {
                return this.f77251f;
            }

            public int hashCode() {
                return (((((((((((this.f77248b.hashCode() * 31) + Integer.hashCode(this.f77249c)) * 31) + this.d.hashCode()) * 31) + this.f77250e.hashCode()) * 31) + Boolean.hashCode(this.f77251f)) * 31) + Boolean.hashCode(this.f77252g)) * 31) + Boolean.hashCode(this.f77253h);
            }

            public String toString() {
                return "SinglePersonalUser(messageIds=" + this.f77248b + ", userId=" + this.f77249c + ", username=" + this.d + ", avatar=" + this.f77250e + ", isVerified=" + this.f77251f + ", isBlocked=" + this.f77252g + ", isDeactivated=" + this.f77253h + ')';
            }
        }

        public /* synthetic */ a(List r1, kotlin.jvm.internal.i r2) {
            this(r1);
        }

        public abstract List a();

        public a(List r2) {
            super(null);
            this.f77236a = r2;
        }
    }

    public static final class b extends v {

        /* renamed from: a, reason: collision with root package name */
        public static final b f77254a = null;

        static {
            f77254a = new b();
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
            return 1012731799;
        }

        public String toString() {
            return "MaximumSelectionReached";
        }
    }

    public static final class c extends v {

        /* renamed from: a, reason: collision with root package name */
        public final String f77255a;

        public c(String r2) {
            kotlin.jvm.internal.p.l(r2, "message");
            super(null);
            this.f77255a = r2;
        }

        public final String a() {
            return this.f77255a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f77255a, ((c) r4).f77255a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f77255a.hashCode();
        }

        public String toString() {
            return "ShareContentError(message=" + this.f77255a + ')';
        }
    }

    public static final class d extends v {

        /* renamed from: a, reason: collision with root package name */
        public final String f77256a;

        public d(String r2) {
            kotlin.jvm.internal.p.l(r2, "message");
            super(null);
            this.f77256a = r2;
        }

        public final String a() {
            return this.f77256a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f77256a, ((d) r4).f77256a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f77256a.hashCode();
        }

        public String toString() {
            return "ShareContentSuccess(message=" + this.f77256a + ')';
        }
    }

    public /* synthetic */ v(kotlin.jvm.internal.i r1) {
        this();
    }

    public v() {
    }
}
