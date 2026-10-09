package com.stockbit.userauth.ui.email;

/* loaded from: classes2.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final String f165241a;

        /* renamed from: b, reason: collision with root package name */
        public final String f165242b;

        static {
        }

        public a(String r2, String r3) {
            kotlin.jvm.internal.p.l(r2, "userName");
            kotlin.jvm.internal.p.l(r3, "email");
            super(null);
            this.f165241a = r2;
            this.f165242b = r3;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (kotlin.jvm.internal.p.g(this.f165241a, r52.f165241a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f165242b, r52.f165242b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f165241a.hashCode() * 31) + this.f165242b.hashCode();
        }

        public String toString() {
            return "ChangeEmailSuccess(userName=" + this.f165241a + ", email=" + this.f165242b + ')';
        }
    }

    /* renamed from: com.stockbit.userauth.ui.email.b$b, reason: collision with other inner class name */
    public static final class C1740b extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final C1740b f165243a = null;

        static {
            f165243a = new C1740b();
        }

        public C1740b() {
            super(null);
        }
    }

    static {
    }

    public /* synthetic */ b(kotlin.jvm.internal.i r1) {
        this();
    }

    public b() {
    }
}
