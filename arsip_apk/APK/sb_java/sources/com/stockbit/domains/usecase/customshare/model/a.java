package com.stockbit.domains.usecase.customshare.model;

import java.io.File;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f88141a;

    /* renamed from: b, reason: collision with root package name */
    public final File f88142b;

    /* renamed from: c, reason: collision with root package name */
    public final String f88143c;

    /* renamed from: com.stockbit.domains.usecase.customshare.model.a$a, reason: collision with other inner class name */
    public static final class C0830a extends a {
        public final boolean d;

        /* renamed from: e, reason: collision with root package name */
        public final File f88144e;

        /* renamed from: f, reason: collision with root package name */
        public final String f88145f;

        public C0830a(boolean r2, File r3, String r4) {
            p.l(r4, "uriPath");
            super(r2, r3, r4, null);
            this.d = r2;
            this.f88144e = r3;
            this.f88145f = r4;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C0830a) == true) goto L8;
            return false;
        L8:
            C0830a r52 = (C0830a) r5;
            if (this.d == r52.d) goto L12;
            return false;
        L12:
            if (p.g(this.f88144e, r52.f88144e) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f88145f, r52.f88145f) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            int r02 = Boolean.hashCode(this.d) * 31;
            File r1 = this.f88144e;
            if (r1 != null) goto L5;
            int r12 = 0;
        L7:
            return ((r02 + r12) * 31) + this.f88145f.hashCode();
        L5:
            r12 = r1.hashCode();
            goto L7
        }

        public String toString() {
            return "AnyRestrictedPath(isValid=" + this.d + ", file=" + this.f88144e + ", uriPath=" + this.f88145f + ")";
        }
    }

    public static final class b extends a {
        public static final b d = null;

        static {
            d = new b();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            boolean r2 = true;
            super(r2, null, "empty restricted paths", 0 == true ? 1 : 0);
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
            return -502606016;
        }

        public String toString() {
            return "EmptyRestrictedPaths";
        }
    }

    public static final class c extends a {
        public static final c d = null;

        static {
            d = new c();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c() {
            boolean r2 = true;
            super(r2, null, "flag disabled", 0 == true ? 1 : 0);
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
            return -561812734;
        }

        public String toString() {
            return "FlagDisabled";
        }
    }

    public static final class d extends a {
        public final String d;

        /* JADX WARN: Multi-variable type inference failed */
        public d(String r3) {
            p.l(r3, "errorMessage");
            super(false, null, r3, 0 == true ? 1 : 0);
            this.d = r3;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (p.g(this.d, ((d) r4).d) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.d.hashCode();
        }

        public String toString() {
            return "GeneralError(errorMessage=" + this.d + ")";
        }
    }

    public static final class e extends a {
        public static final e d = null;

        static {
            d = new e();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public e() {
            boolean r2 = false;
            super(r2, null, "invalid image uri", 0 == true ? 1 : 0);
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
            return 1560247790;
        }

        public String toString() {
            return "InvalidImageUri";
        }
    }

    public static final class f extends a {
        public static final f d = null;

        static {
            d = new f();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f() {
            boolean r2 = false;
            super(r2, null, "null uri path", 0 == true ? 1 : 0);
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
            return 1582818288;
        }

        public String toString() {
            return "NullUriPath";
        }
    }

    public /* synthetic */ a(boolean r1, File r2, String r3, i r4) {
        this(r1, r2, r3);
    }

    public final String a() {
        return this.f88143c;
    }

    public final File b() {
        return this.f88142b;
    }

    public final boolean c() {
        return this.f88141a;
    }

    public a(boolean r1, File r2, String r3) {
        this.f88141a = r1;
        this.f88142b = r2;
        this.f88143c = r3;
    }
}
