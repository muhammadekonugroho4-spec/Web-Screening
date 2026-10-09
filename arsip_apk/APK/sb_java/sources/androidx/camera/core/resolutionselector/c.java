package androidx.camera.core.resolutionselector;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.camera.core.resolutionselector.a f6007a;

    /* renamed from: b, reason: collision with root package name */
    public final d f6008b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6009c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public androidx.camera.core.resolutionselector.a f6010a;

        /* renamed from: b, reason: collision with root package name */
        public d f6011b;

        /* renamed from: c, reason: collision with root package name */
        public int f6012c;

        public a() {
            this.f6010a = androidx.camera.core.resolutionselector.a.f6004c;
            this.f6011b = null;
            this.f6012c = 0;
        }

        public static a b(c r1) {
            return new a(r1);
        }

        public c a() {
            return new c(this.f6010a, this.f6011b, null, this.f6012c);
        }

        public a c(int r1) {
            this.f6012c = r1;
            return this;
        }

        public a d(androidx.camera.core.resolutionselector.a r1) {
            this.f6010a = r1;
            return this;
        }

        public a e(d r1) {
            this.f6011b = r1;
            return this;
        }

        public a(c r2) {
            this.f6010a = androidx.camera.core.resolutionselector.a.f6004c;
            this.f6011b = null;
            this.f6012c = 0;
            this.f6010a = r2.b();
            this.f6011b = r2.d();
            r2.c();
            this.f6012c = r2.a();
        }
    }

    public c(androidx.camera.core.resolutionselector.a r1, d r2, b r3, int r4) {
        this.f6007a = r1;
        this.f6008b = r2;
        this.f6009c = r4;
    }

    public int a() {
        return this.f6009c;
    }

    public androidx.camera.core.resolutionselector.a b() {
        return this.f6007a;
    }

    public b c() {
        return null;
    }

    public d d() {
        return this.f6008b;
    }
}
