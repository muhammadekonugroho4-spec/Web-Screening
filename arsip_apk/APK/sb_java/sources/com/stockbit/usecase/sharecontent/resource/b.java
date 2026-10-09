package com.stockbit.usecase.sharecontent.resource;

import com.google.firebase.messaging.Constants;
import com.stockbit.features.model.DomainExodusException;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final DomainExodusException f162843a;

        public a(DomainExodusException r2) {
            p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super(null);
            this.f162843a = r2;
        }

        public final DomainExodusException a() {
            return this.f162843a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f162843a, ((a) r4).f162843a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f162843a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f162843a + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.sharecontent.resource.b$b, reason: collision with other inner class name */
    public static final class C1648b extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final C1648b f162844a = null;

        static {
            f162844a = new C1648b();
        }

        public C1648b() {
            super(null);
        }
    }

    public static abstract class c extends b {

        public static abstract class a extends c {

            /* renamed from: a, reason: collision with root package name */
            public final List f162845a;

            /* renamed from: com.stockbit.usecase.sharecontent.resource.b$c$a$a, reason: collision with other inner class name */
            public static final class C1649a extends a {

                /* renamed from: b, reason: collision with root package name */
                public final List f162846b;

                public C1649a(List r2) {
                    p.l(r2, "messageIds");
                    super(r2, null);
                    this.f162846b = r2;
                }

                public List a() {
                    return this.f162846b;
                }

                public boolean equals(Object r4) {
                    if (this != r4) goto L6;
                    return true;
                L6:
                    if ((r4 instanceof C1649a) == true) goto L9;
                    return false;
                L9:
                    if (p.g(this.f162846b, ((C1649a) r4).f162846b) == true) goto L11;
                    return false;
                L11:
                    return true;
                }

                public int hashCode() {
                    return this.f162846b.hashCode();
                }

                public String toString() {
                    return "CurrentRoom(messageIds=" + this.f162846b + ")";
                }
            }

            /* renamed from: com.stockbit.usecase.sharecontent.resource.b$c$a$b, reason: collision with other inner class name */
            public static final class C1650b extends a {

                /* renamed from: b, reason: collision with root package name */
                public final List f162847b;

                /* renamed from: c, reason: collision with root package name */
                public final String f162848c;

                public C1650b(List r2, String r3) {
                    p.l(r2, "messageIds");
                    p.l(r3, "message");
                    super(r2, null);
                    this.f162847b = r2;
                    this.f162848c = r3;
                }

                public final String a() {
                    return this.f162848c;
                }

                public List b() {
                    return this.f162847b;
                }

                public boolean equals(Object r5) {
                    if (this != r5) goto L6;
                    return true;
                L6:
                    if ((r5 instanceof C1650b) == true) goto L8;
                    return false;
                L8:
                    C1650b r52 = (C1650b) r5;
                    if (p.g(this.f162847b, r52.f162847b) == true) goto L12;
                    return false;
                L12:
                    if (p.g(this.f162848c, r52.f162848c) == true) goto L14;
                    return false;
                L14:
                    return true;
                }

                public int hashCode() {
                    return (this.f162847b.hashCode() * 31) + this.f162848c.hashCode();
                }

                public String toString() {
                    return "MultipleRoom(messageIds=" + this.f162847b + ", message=" + this.f162848c + ")";
                }
            }

            /* renamed from: com.stockbit.usecase.sharecontent.resource.b$c$a$c, reason: collision with other inner class name */
            public static final class C1651c extends a {

                /* renamed from: b, reason: collision with root package name */
                public final List f162849b;

                /* renamed from: c, reason: collision with root package name */
                public final int f162850c;

                public C1651c(List r2, int r3) {
                    p.l(r2, "messageIds");
                    super(r2, null);
                    this.f162849b = r2;
                    this.f162850c = r3;
                }

                public List a() {
                    return this.f162849b;
                }

                public final int b() {
                    return this.f162850c;
                }

                public boolean equals(Object r5) {
                    if (this != r5) goto L6;
                    return true;
                L6:
                    if ((r5 instanceof C1651c) == true) goto L8;
                    return false;
                L8:
                    C1651c r52 = (C1651c) r5;
                    if (p.g(this.f162849b, r52.f162849b) == true) goto L12;
                    return false;
                L12:
                    if (this.f162850c == r52.f162850c) goto L14;
                    return false;
                L14:
                    return true;
                }

                public int hashCode() {
                    return (this.f162849b.hashCode() * 31) + Integer.hashCode(this.f162850c);
                }

                public String toString() {
                    return "SingleGroupRoom(messageIds=" + this.f162849b + ", roomId=" + this.f162850c + ")";
                }
            }

            public static final class d extends a {

                /* renamed from: b, reason: collision with root package name */
                public final List f162851b;

                /* renamed from: c, reason: collision with root package name */
                public final int f162852c;
                public final String d;

                /* renamed from: e, reason: collision with root package name */
                public final String f162853e;

                /* renamed from: f, reason: collision with root package name */
                public final boolean f162854f;

                /* renamed from: g, reason: collision with root package name */
                public final boolean f162855g;

                /* renamed from: h, reason: collision with root package name */
                public final boolean f162856h;

                public d(List r2, int r3, String r4, String r5, boolean r6, boolean r7, boolean r8) {
                    p.l(r2, "messageIds");
                    p.l(r4, "username");
                    p.l(r5, "avatar");
                    super(r2, null);
                    this.f162851b = r2;
                    this.f162852c = r3;
                    this.d = r4;
                    this.f162853e = r5;
                    this.f162854f = r6;
                    this.f162855g = r7;
                    this.f162856h = r8;
                }

                public final String a() {
                    return this.f162853e;
                }

                public List b() {
                    return this.f162851b;
                }

                public final int c() {
                    return this.f162852c;
                }

                public final String d() {
                    return this.d;
                }

                public final boolean e() {
                    return this.f162855g;
                }

                public boolean equals(Object r5) {
                    if (this != r5) goto L6;
                    return true;
                L6:
                    if ((r5 instanceof d) == true) goto L8;
                    return false;
                L8:
                    d r52 = (d) r5;
                    if (p.g(this.f162851b, r52.f162851b) == true) goto L12;
                    return false;
                L12:
                    if (this.f162852c == r52.f162852c) goto L15;
                    return false;
                L15:
                    if (p.g(this.d, r52.d) == true) goto L18;
                    return false;
                L18:
                    if (p.g(this.f162853e, r52.f162853e) == true) goto L21;
                    return false;
                L21:
                    if (this.f162854f == r52.f162854f) goto L24;
                    return false;
                L24:
                    if (this.f162855g == r52.f162855g) goto L27;
                    return false;
                L27:
                    if (this.f162856h == r52.f162856h) goto L29;
                    return false;
                L29:
                    return true;
                }

                public final boolean f() {
                    return this.f162856h;
                }

                public final boolean g() {
                    return this.f162854f;
                }

                public int hashCode() {
                    return (((((((((((this.f162851b.hashCode() * 31) + Integer.hashCode(this.f162852c)) * 31) + this.d.hashCode()) * 31) + this.f162853e.hashCode()) * 31) + Boolean.hashCode(this.f162854f)) * 31) + Boolean.hashCode(this.f162855g)) * 31) + Boolean.hashCode(this.f162856h);
                }

                public String toString() {
                    return "SinglePersonalRoom(messageIds=" + this.f162851b + ", roomId=" + this.f162852c + ", username=" + this.d + ", avatar=" + this.f162853e + ", isVerified=" + this.f162854f + ", isBlocked=" + this.f162855g + ", isDeactivated=" + this.f162856h + ")";
                }
            }

            public static final class e extends a {

                /* renamed from: b, reason: collision with root package name */
                public final List f162857b;

                /* renamed from: c, reason: collision with root package name */
                public final int f162858c;
                public final String d;

                /* renamed from: e, reason: collision with root package name */
                public final String f162859e;

                /* renamed from: f, reason: collision with root package name */
                public final boolean f162860f;

                /* renamed from: g, reason: collision with root package name */
                public final boolean f162861g;

                /* renamed from: h, reason: collision with root package name */
                public final boolean f162862h;

                public e(List r2, int r3, String r4, String r5, boolean r6, boolean r7, boolean r8) {
                    p.l(r2, "messageIds");
                    p.l(r4, "username");
                    p.l(r5, "avatar");
                    super(r2, null);
                    this.f162857b = r2;
                    this.f162858c = r3;
                    this.d = r4;
                    this.f162859e = r5;
                    this.f162860f = r6;
                    this.f162861g = r7;
                    this.f162862h = r8;
                }

                public final String a() {
                    return this.f162859e;
                }

                public List b() {
                    return this.f162857b;
                }

                public final int c() {
                    return this.f162858c;
                }

                public final String d() {
                    return this.d;
                }

                public final boolean e() {
                    return this.f162861g;
                }

                public boolean equals(Object r5) {
                    if (this != r5) goto L6;
                    return true;
                L6:
                    if ((r5 instanceof e) == true) goto L8;
                    return false;
                L8:
                    e r52 = (e) r5;
                    if (p.g(this.f162857b, r52.f162857b) == true) goto L12;
                    return false;
                L12:
                    if (this.f162858c == r52.f162858c) goto L15;
                    return false;
                L15:
                    if (p.g(this.d, r52.d) == true) goto L18;
                    return false;
                L18:
                    if (p.g(this.f162859e, r52.f162859e) == true) goto L21;
                    return false;
                L21:
                    if (this.f162860f == r52.f162860f) goto L24;
                    return false;
                L24:
                    if (this.f162861g == r52.f162861g) goto L27;
                    return false;
                L27:
                    if (this.f162862h == r52.f162862h) goto L29;
                    return false;
                L29:
                    return true;
                }

                public final boolean f() {
                    return this.f162862h;
                }

                public final boolean g() {
                    return this.f162860f;
                }

                public int hashCode() {
                    return (((((((((((this.f162857b.hashCode() * 31) + Integer.hashCode(this.f162858c)) * 31) + this.d.hashCode()) * 31) + this.f162859e.hashCode()) * 31) + Boolean.hashCode(this.f162860f)) * 31) + Boolean.hashCode(this.f162861g)) * 31) + Boolean.hashCode(this.f162862h);
                }

                public String toString() {
                    return "SinglePersonalUser(messageIds=" + this.f162857b + ", userId=" + this.f162858c + ", username=" + this.d + ", avatar=" + this.f162859e + ", isVerified=" + this.f162860f + ", isBlocked=" + this.f162861g + ", isDeactivated=" + this.f162862h + ")";
                }
            }

            public /* synthetic */ a(List r1, i r2) {
                this(r1);
            }

            public a(List r2) {
                super(null);
                this.f162845a = r2;
            }
        }

        /* renamed from: com.stockbit.usecase.sharecontent.resource.b$c$b, reason: collision with other inner class name */
        public static final class C1652b extends c {

            /* renamed from: a, reason: collision with root package name */
            public final String f162863a;

            public C1652b(String r2) {
                p.l(r2, "message");
                super(null);
                this.f162863a = r2;
            }

            public final String a() {
                return this.f162863a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C1652b) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f162863a, ((C1652b) r4).f162863a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f162863a.hashCode();
            }

            public String toString() {
                return "ShareContent(message=" + this.f162863a + ")";
            }
        }

        public /* synthetic */ c(i r1) {
            this();
        }

        public c() {
            super(null);
        }
    }

    public /* synthetic */ b(i r1) {
        this();
    }

    public b() {
    }
}
