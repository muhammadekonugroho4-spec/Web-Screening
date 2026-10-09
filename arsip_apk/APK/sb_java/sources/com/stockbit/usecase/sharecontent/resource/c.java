package com.stockbit.usecase.sharecontent.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f162864a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f162864a = r2;
        }

        public final DomainExodusException a() {
            return this.f162864a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f162864a, ((a) r4).f162864a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f162864a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f162864a + ")";
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f162865a = null;

        static {
            f162865a = new b();
        }

        public b() {
            super(null);
        }
    }

    /* renamed from: com.stockbit.usecase.sharecontent.resource.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC1653c extends c {

        /* renamed from: a, reason: collision with root package name */
        public final List f162866a;

        /* renamed from: com.stockbit.usecase.sharecontent.resource.c$c$a */
        public static final class a extends AbstractC1653c {

            /* renamed from: b, reason: collision with root package name */
            public final List f162867b;

            public a(List r2) {
                p.l(r2, "messageIds");
                super(r2, null);
                this.f162867b = r2;
            }

            public List a() {
                return this.f162867b;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof a) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f162867b, ((a) r4).f162867b) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f162867b.hashCode();
            }

            public String toString() {
                return "CurrentRoom(messageIds=" + this.f162867b + ")";
            }
        }

        /* renamed from: com.stockbit.usecase.sharecontent.resource.c$c$b */
        public static final class b extends AbstractC1653c {

            /* renamed from: b, reason: collision with root package name */
            public final List f162868b;

            /* renamed from: c, reason: collision with root package name */
            public final String f162869c;

            public b(List r2, String r3) {
                p.l(r2, "messageIds");
                p.l(r3, "message");
                super(r2, null);
                this.f162868b = r2;
                this.f162869c = r3;
            }

            public final String a() {
                return this.f162869c;
            }

            public List b() {
                return this.f162868b;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof b) == true) goto L8;
                return false;
            L8:
                b r52 = (b) r5;
                if (p.g(this.f162868b, r52.f162868b) == true) goto L12;
                return false;
            L12:
                if (p.g(this.f162869c, r52.f162869c) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                return (this.f162868b.hashCode() * 31) + this.f162869c.hashCode();
            }

            public String toString() {
                return "MultipleRoom(messageIds=" + this.f162868b + ", message=" + this.f162869c + ")";
            }
        }

        /* renamed from: com.stockbit.usecase.sharecontent.resource.c$c$c, reason: collision with other inner class name */
        public static final class C1654c extends AbstractC1653c {

            /* renamed from: b, reason: collision with root package name */
            public final List f162870b;

            /* renamed from: c, reason: collision with root package name */
            public final int f162871c;

            public C1654c(List r2, int r3) {
                p.l(r2, "messageIds");
                super(r2, null);
                this.f162870b = r2;
                this.f162871c = r3;
            }

            public List a() {
                return this.f162870b;
            }

            public final int b() {
                return this.f162871c;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof C1654c) == true) goto L8;
                return false;
            L8:
                C1654c r52 = (C1654c) r5;
                if (p.g(this.f162870b, r52.f162870b) == true) goto L12;
                return false;
            L12:
                if (this.f162871c == r52.f162871c) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                return (this.f162870b.hashCode() * 31) + Integer.hashCode(this.f162871c);
            }

            public String toString() {
                return "SingleGroupRoom(messageIds=" + this.f162870b + ", roomId=" + this.f162871c + ")";
            }
        }

        /* renamed from: com.stockbit.usecase.sharecontent.resource.c$c$d */
        public static final class d extends AbstractC1653c {

            /* renamed from: b, reason: collision with root package name */
            public final List f162872b;

            /* renamed from: c, reason: collision with root package name */
            public final int f162873c;
            public final String d;

            /* renamed from: e, reason: collision with root package name */
            public final String f162874e;

            /* renamed from: f, reason: collision with root package name */
            public final boolean f162875f;

            /* renamed from: g, reason: collision with root package name */
            public final boolean f162876g;

            /* renamed from: h, reason: collision with root package name */
            public final boolean f162877h;

            public d(List r2, int r3, String r4, String r5, boolean r6, boolean r7, boolean r8) {
                p.l(r2, "messageIds");
                p.l(r4, "username");
                p.l(r5, "avatar");
                super(r2, null);
                this.f162872b = r2;
                this.f162873c = r3;
                this.d = r4;
                this.f162874e = r5;
                this.f162875f = r6;
                this.f162876g = r7;
                this.f162877h = r8;
            }

            public final String a() {
                return this.f162874e;
            }

            public List b() {
                return this.f162872b;
            }

            public final int c() {
                return this.f162873c;
            }

            public final String d() {
                return this.d;
            }

            public final boolean e() {
                return this.f162876g;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof d) == true) goto L8;
                return false;
            L8:
                d r52 = (d) r5;
                if (p.g(this.f162872b, r52.f162872b) == true) goto L12;
                return false;
            L12:
                if (this.f162873c == r52.f162873c) goto L15;
                return false;
            L15:
                if (p.g(this.d, r52.d) == true) goto L18;
                return false;
            L18:
                if (p.g(this.f162874e, r52.f162874e) == true) goto L21;
                return false;
            L21:
                if (this.f162875f == r52.f162875f) goto L24;
                return false;
            L24:
                if (this.f162876g == r52.f162876g) goto L27;
                return false;
            L27:
                if (this.f162877h == r52.f162877h) goto L29;
                return false;
            L29:
                return true;
            }

            public final boolean f() {
                return this.f162877h;
            }

            public final boolean g() {
                return this.f162875f;
            }

            public int hashCode() {
                return (((((((((((this.f162872b.hashCode() * 31) + Integer.hashCode(this.f162873c)) * 31) + this.d.hashCode()) * 31) + this.f162874e.hashCode()) * 31) + Boolean.hashCode(this.f162875f)) * 31) + Boolean.hashCode(this.f162876g)) * 31) + Boolean.hashCode(this.f162877h);
            }

            public String toString() {
                return "SinglePersonalRoom(messageIds=" + this.f162872b + ", roomId=" + this.f162873c + ", username=" + this.d + ", avatar=" + this.f162874e + ", isVerified=" + this.f162875f + ", isBlocked=" + this.f162876g + ", isDeactivated=" + this.f162877h + ")";
            }
        }

        /* renamed from: com.stockbit.usecase.sharecontent.resource.c$c$e */
        public static final class e extends AbstractC1653c {

            /* renamed from: b, reason: collision with root package name */
            public final List f162878b;

            /* renamed from: c, reason: collision with root package name */
            public final int f162879c;
            public final String d;

            /* renamed from: e, reason: collision with root package name */
            public final String f162880e;

            /* renamed from: f, reason: collision with root package name */
            public final boolean f162881f;

            /* renamed from: g, reason: collision with root package name */
            public final boolean f162882g;

            /* renamed from: h, reason: collision with root package name */
            public final boolean f162883h;

            public e(List r2, int r3, String r4, String r5, boolean r6, boolean r7, boolean r8) {
                p.l(r2, "messageIds");
                p.l(r4, "username");
                p.l(r5, "avatar");
                super(r2, null);
                this.f162878b = r2;
                this.f162879c = r3;
                this.d = r4;
                this.f162880e = r5;
                this.f162881f = r6;
                this.f162882g = r7;
                this.f162883h = r8;
            }

            public final String a() {
                return this.f162880e;
            }

            public List b() {
                return this.f162878b;
            }

            public final int c() {
                return this.f162879c;
            }

            public final String d() {
                return this.d;
            }

            public final boolean e() {
                return this.f162882g;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof e) == true) goto L8;
                return false;
            L8:
                e r52 = (e) r5;
                if (p.g(this.f162878b, r52.f162878b) == true) goto L12;
                return false;
            L12:
                if (this.f162879c == r52.f162879c) goto L15;
                return false;
            L15:
                if (p.g(this.d, r52.d) == true) goto L18;
                return false;
            L18:
                if (p.g(this.f162880e, r52.f162880e) == true) goto L21;
                return false;
            L21:
                if (this.f162881f == r52.f162881f) goto L24;
                return false;
            L24:
                if (this.f162882g == r52.f162882g) goto L27;
                return false;
            L27:
                if (this.f162883h == r52.f162883h) goto L29;
                return false;
            L29:
                return true;
            }

            public final boolean f() {
                return this.f162883h;
            }

            public final boolean g() {
                return this.f162881f;
            }

            public int hashCode() {
                return (((((((((((this.f162878b.hashCode() * 31) + Integer.hashCode(this.f162879c)) * 31) + this.d.hashCode()) * 31) + this.f162880e.hashCode()) * 31) + Boolean.hashCode(this.f162881f)) * 31) + Boolean.hashCode(this.f162882g)) * 31) + Boolean.hashCode(this.f162883h);
            }

            public String toString() {
                return "SinglePersonalUser(messageIds=" + this.f162878b + ", userId=" + this.f162879c + ", username=" + this.d + ", avatar=" + this.f162880e + ", isVerified=" + this.f162881f + ", isBlocked=" + this.f162882g + ", isDeactivated=" + this.f162883h + ")";
            }
        }

        public /* synthetic */ AbstractC1653c(List r1, i r2) {
            this(r1);
        }

        public AbstractC1653c(List r2) {
            super(null);
            this.f162866a = r2;
        }
    }

    public /* synthetic */ c(i r1) {
        this();
    }

    public c() {
    }
}
