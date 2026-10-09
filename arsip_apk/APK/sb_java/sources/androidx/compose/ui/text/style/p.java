package androidx.compose.ui.text.style;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final a f20315c = null;
    public static final p d = null;

    /* renamed from: a, reason: collision with root package name */
    public final float f20316a;

    /* renamed from: b, reason: collision with root package name */
    public final float f20317b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final p a() {
            return p.a();
        }

        public a() {
        }
    }

    static {
        f20315c = new a(null);
        d = new p(1.0f, 0.0f);
    }

    public p(float r1, float r2) {
        this.f20316a = r1;
        this.f20317b = r2;
    }

    public static final /* synthetic */ p a() {
        return d;
    }

    public final float b() {
        return this.f20316a;
    }

    public final float c() {
        return this.f20317b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof p) == true) goto L8;
        return false;
    L8:
        p r52 = (p) r5;
        if (this.f20316a == r52.f20316a) goto L11;
    L13:
        return false;
    L11:
        if (this.f20317b != r52.f20317b) goto L13;
        return true;
    }

    public int hashCode() {
        return (Float.hashCode(this.f20316a) * 31) + Float.hashCode(this.f20317b);
    }

    public String toString() {
        return "TextGeometricTransform(scaleX=" + this.f20316a + ", skewX=" + this.f20317b + ')';
    }
}
