package com.stockbit.amendbank.ui.uploadidentity;

/* loaded from: classes6.dex */
public abstract class a {

    /* renamed from: com.stockbit.amendbank.ui.uploadidentity.a$a, reason: collision with other inner class name */
    public static final class C0524a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0524a f46458a = null;

        static {
            f46458a = new C0524a();
        }

        public C0524a() {
            super(null);
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f46459a;

        static {
        }

        public b(String r2) {
            kotlin.jvm.internal.p.l(r2, "message");
            super(null);
            this.f46459a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f46459a, ((b) r4).f46459a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f46459a.hashCode();
        }

        public String toString() {
            return "ErrorGetUploadToken(message=" + this.f46459a + ')';
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f46460a;

        static {
        }

        public c(String r2) {
            kotlin.jvm.internal.p.l(r2, "message");
            super(null);
            this.f46460a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f46460a, ((c) r4).f46460a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f46460a.hashCode();
        }

        public String toString() {
            return "ErrorUploadToGoogle(message=" + this.f46460a + ')';
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public final int f46461a;

        static {
        }

        public d(int r2) {
            super(null);
            this.f46461a = r2;
        }

        public final int a() {
            return this.f46461a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (this.f46461a == ((d) r4).f46461a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Integer.hashCode(this.f46461a);
        }

        public String toString() {
            return "LoadingProgress(progress=" + this.f46461a + ')';
        }
    }

    public static final class e extends a {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.domain.model.valueobject.googlecloud.c f46462a;

        /* renamed from: b, reason: collision with root package name */
        public final String f46463b;

        static {
        }

        public e(com.stockbit.domain.model.valueobject.googlecloud.c r2, String r3) {
            kotlin.jvm.internal.p.l(r2, "token");
            kotlin.jvm.internal.p.l(r3, "fileName");
            super(null);
            this.f46462a = r2;
            this.f46463b = r3;
        }

        public final String a() {
            return this.f46463b;
        }

        public final com.stockbit.domain.model.valueobject.googlecloud.c b() {
            return this.f46462a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof e) == true) goto L8;
            return false;
        L8:
            e r52 = (e) r5;
            if (kotlin.jvm.internal.p.g(this.f46462a, r52.f46462a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f46463b, r52.f46463b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f46462a.hashCode() * 31) + this.f46463b.hashCode();
        }

        public String toString() {
            return "SuccessGetUploadToken(token=" + this.f46462a + ", fileName=" + this.f46463b + ')';
        }
    }

    public static final class f extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f46464a;

        static {
        }

        public f(String r2) {
            kotlin.jvm.internal.p.l(r2, "fileName");
            super(null);
            this.f46464a = r2;
        }

        public final String a() {
            return this.f46464a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof f) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f46464a, ((f) r4).f46464a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f46464a.hashCode();
        }

        public String toString() {
            return "SuccessUploadToGoogle(fileName=" + this.f46464a + ')';
        }
    }

    static {
    }

    public /* synthetic */ a(kotlin.jvm.internal.i r1) {
        this();
    }

    public a() {
    }
}
