package com.stockbit.profile.userprofile;

/* renamed from: com.stockbit.profile.userprofile.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC9343d {

    /* renamed from: com.stockbit.profile.userprofile.d$a */
    public static final class a extends AbstractC9343d {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f127946a;

        static {
        }

        public a(boolean r2) {
            super(null);
            this.f127946a = r2;
        }

        public final boolean a() {
            return this.f127946a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (this.f127946a == ((a) r4).f127946a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f127946a);
        }

        public String toString() {
            return "OnShowAlertToogleNotification(state=" + this.f127946a + ')';
        }
    }

    /* renamed from: com.stockbit.profile.userprofile.d$b */
    public static final class b extends AbstractC9343d {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f127947a;

        static {
        }

        public b(boolean r2) {
            super(null);
            this.f127947a = r2;
        }

        public final boolean a() {
            return this.f127947a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (this.f127947a == ((b) r4).f127947a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f127947a);
        }

        public String toString() {
            return "OnToggleNotifNotify(state=" + this.f127947a + ')';
        }
    }

    /* renamed from: com.stockbit.profile.userprofile.d$c */
    public static final class c extends AbstractC9343d {

        /* renamed from: a, reason: collision with root package name */
        public static final c f127948a = null;

        static {
            f127948a = new c();
        }

        public c() {
            super(null);
        }
    }

    /* renamed from: com.stockbit.profile.userprofile.d$d, reason: collision with other inner class name */
    public static final class C1159d extends AbstractC9343d {

        /* renamed from: a, reason: collision with root package name */
        public final String f127949a;

        static {
        }

        public C1159d(String r2) {
            kotlin.jvm.internal.p.l(r2, "imageAvatar");
            super(null);
            this.f127949a = r2;
        }

        public final String a() {
            return this.f127949a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1159d) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f127949a, ((C1159d) r4).f127949a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f127949a.hashCode();
        }

        public String toString() {
            return "OpenDialogMedia(imageAvatar=" + this.f127949a + ')';
        }
    }

    /* renamed from: com.stockbit.profile.userprofile.d$e */
    public static final class e extends AbstractC9343d {

        /* renamed from: a, reason: collision with root package name */
        public final String f127950a;

        static {
        }

        public e(String r2) {
            kotlin.jvm.internal.p.l(r2, "url");
            super(null);
            this.f127950a = r2;
        }

        public final String a() {
            return this.f127950a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof e) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f127950a, ((e) r4).f127950a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f127950a.hashCode();
        }

        public String toString() {
            return "OpenWebsite(url=" + this.f127950a + ')';
        }
    }

    /* renamed from: com.stockbit.profile.userprofile.d$f */
    public static final class f extends AbstractC9343d {

        /* renamed from: a, reason: collision with root package name */
        public static final f f127951a = null;

        static {
            f127951a = new f();
        }

        public f() {
            super(null);
        }
    }

    /* renamed from: com.stockbit.profile.userprofile.d$g */
    public static final class g extends AbstractC9343d {

        /* renamed from: a, reason: collision with root package name */
        public static final g f127952a = null;

        static {
            f127952a = new g();
        }

        public g() {
            super(null);
        }
    }

    static {
    }

    public /* synthetic */ AbstractC9343d(kotlin.jvm.internal.i r1) {
        this();
    }

    public AbstractC9343d() {
    }
}
