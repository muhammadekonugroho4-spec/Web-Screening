package androidx.camera.core;

/* loaded from: classes.dex */
public class F {
    public static final F d = null;

    /* renamed from: a, reason: collision with root package name */
    public final float f4795a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.core.util.d f4796b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.core.util.d f4797c;

    public static /* synthetic */ class a {
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public float f4798a;

        /* renamed from: b, reason: collision with root package name */
        public androidx.core.util.d f4799b;

        /* renamed from: c, reason: collision with root package name */
        public androidx.core.util.d f4800c;

        public b() {
            Float r1 = Float.valueOf(1.0f);
            this.f4798a = 1.0f;
            Float r02 = Float.valueOf(0.0f);
            this.f4799b = androidx.core.util.d.a(r02, r02);
            this.f4800c = androidx.core.util.d.a(r1, r1);
        }

        public F a() {
            return new F(this.f4798a, this.f4799b, this.f4800c, null);
        }

        public b b(float r1) {
            this.f4798a = r1;
            return this;
        }

        public b c(float r1, float r2) {
            this.f4799b = androidx.core.util.d.a(Float.valueOf(r1), Float.valueOf(r2));
            return this;
        }

        public b d(float r1, float r2) {
            this.f4800c = androidx.core.util.d.a(Float.valueOf(r1), Float.valueOf(r2));
            return this;
        }
    }

    static {
        d = new b().b(1.0f).c(0.0f, 0.0f).d(1.0f, 1.0f).a();
    }

    public /* synthetic */ F(float r1, androidx.core.util.d r2, androidx.core.util.d r3, a r4) {
        this(r1, r2, r3);
    }

    public float a() {
        return this.f4795a;
    }

    public androidx.core.util.d b() {
        return this.f4796b;
    }

    public androidx.core.util.d c() {
        return this.f4797c;
    }

    public F(float r1, androidx.core.util.d r2, androidx.core.util.d r3) {
        this.f4795a = r1;
        this.f4796b = r2;
        this.f4797c = r3;
    }
}
