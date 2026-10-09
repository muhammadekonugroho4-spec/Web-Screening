package androidx.navigationevent;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    public static final a f26507f = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f26508a;

    /* renamed from: b, reason: collision with root package name */
    public final float f26509b;

    /* renamed from: c, reason: collision with root package name */
    public final float f26510c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final long f26511e;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f26507f = new a(null);
    }

    public b(int r1, float r2, float r3, float r4, long r5) {
        this.f26508a = r1;
        this.f26509b = r2;
        this.f26510c = r3;
        this.d = r4;
        this.f26511e = r5;
    }

    public final long a() {
        return this.f26511e;
    }

    public final float b() {
        return this.f26509b;
    }

    public final int c() {
        return this.f26508a;
    }

    public final float d() {
        return this.f26510c;
    }

    public final float e() {
        return this.d;
    }

    public boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if (r7 != null) goto L8;
    L23:
        return false;
    L8:
        if (b.class != r7.getClass()) goto L23;
        b r72 = (b) r7;
        if (this.f26510c != r72.f26510c) goto L23;
        if (this.d != r72.d) goto L23;
        if (this.f26509b != r72.f26509b) goto L23;
        if (this.f26508a == r72.f26508a) goto L20;
        return false;
    L20:
        if (this.f26511e == r72.f26511e) goto L22;
        return false;
    L22:
        return true;
    }

    public int hashCode() {
        return (((((((Float.hashCode(this.f26510c) * 31) + Float.hashCode(this.d)) * 31) + Float.hashCode(this.f26509b)) * 31) + Integer.hashCode(this.f26508a)) * 31) + Long.hashCode(this.f26511e);
    }

    public String toString() {
        return "NavigationEvent(touchX=" + this.f26510c + ", touchY=" + this.d + ", progress=" + this.f26509b + ", swipeEdge=" + this.f26508a + ", frameTimeMillis=" + this.f26511e + ')';
    }
}
