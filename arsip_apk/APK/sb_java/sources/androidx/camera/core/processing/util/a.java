package androidx.camera.core.processing.util;

import androidx.camera.core.processing.util.d;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    public final String f5956a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5957b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5958c;
    public final String d;

    /* renamed from: androidx.camera.core.processing.util.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0054a {
    }

    public static final class b extends d.a {

        /* renamed from: a, reason: collision with root package name */
        public String f5959a;

        /* renamed from: b, reason: collision with root package name */
        public String f5960b;

        /* renamed from: c, reason: collision with root package name */
        public String f5961c;
        public String d;

        public b() {
        }

        @Override // androidx.camera.core.processing.util.d.a
        public d a() {
            String r1 = "";
            if (this.f5959a != null) goto L6;
            r1 = " glVersion";
        L6:
            if (this.f5960b != null) goto L9;
            r1 = r1 + " eglVersion";
        L9:
            if (this.f5961c != null) goto L12;
            r1 = r1 + " glExtensions";
        L12:
            if (this.d != null) goto L15;
            r1 = r1 + " eglExtensions";
        L15:
            if (r1.isEmpty() == false) goto L19;
            return new a(this.f5959a, this.f5960b, this.f5961c, this.d, null);
        L19:
            throw new IllegalStateException("Missing required properties:" + r1);
        }

        @Override // androidx.camera.core.processing.util.d.a
        public d.a b(String r2) {
            if (r2 == null) goto L6;
            this.d = r2;
            return this;
        L6:
            throw new NullPointerException("Null eglExtensions");
        }

        @Override // androidx.camera.core.processing.util.d.a
        public d.a c(String r2) {
            if (r2 == null) goto L6;
            this.f5960b = r2;
            return this;
        L6:
            throw new NullPointerException("Null eglVersion");
        }

        @Override // androidx.camera.core.processing.util.d.a
        public d.a d(String r2) {
            if (r2 == null) goto L6;
            this.f5961c = r2;
            return this;
        L6:
            throw new NullPointerException("Null glExtensions");
        }

        @Override // androidx.camera.core.processing.util.d.a
        public d.a e(String r2) {
            if (r2 == null) goto L6;
            this.f5959a = r2;
            return this;
        L6:
            throw new NullPointerException("Null glVersion");
        }
    }

    public /* synthetic */ a(String r1, String r2, String r3, String r4, C0054a r5) {
        this(r1, r2, r3, r4);
    }

    @Override // androidx.camera.core.processing.util.d
    public String b() {
        return this.d;
    }

    @Override // androidx.camera.core.processing.util.d
    public String c() {
        return this.f5957b;
    }

    @Override // androidx.camera.core.processing.util.d
    public String d() {
        return this.f5958c;
    }

    @Override // androidx.camera.core.processing.util.d
    public String e() {
        return this.f5956a;
    }

    public boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == false) goto L16;
        d r52 = (d) r5;
        if (this.f5956a.equals(r52.e()) == false) goto L16;
        if (this.f5957b.equals(r52.c()) == false) goto L16;
        if (this.f5958c.equals(r52.d()) == false) goto L16;
        if (this.d.equals(r52.b()) == false) goto L16;
        return true;
    L16:
        return false;
    }

    public int hashCode() {
        return ((((((this.f5956a.hashCode() ^ 1000003) * 1000003) ^ this.f5957b.hashCode()) * 1000003) ^ this.f5958c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        return "GraphicDeviceInfo{glVersion=" + this.f5956a + ", eglVersion=" + this.f5957b + ", glExtensions=" + this.f5958c + ", eglExtensions=" + this.d + "}";
    }

    public a(String r1, String r2, String r3, String r4) {
        this.f5956a = r1;
        this.f5957b = r2;
        this.f5958c = r3;
        this.d = r4;
    }
}
