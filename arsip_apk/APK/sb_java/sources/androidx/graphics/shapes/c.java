package androidx.graphics.shapes;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final a f25465c = null;
    public static final c d = null;

    /* renamed from: a, reason: collision with root package name */
    public final float f25466a;

    /* renamed from: b, reason: collision with root package name */
    public final float f25467b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        kotlin.jvm.internal.i r1 = null;
        f25465c = new a(r1);
        float r2 = 0.0f;
        d = new c(r2, r2, 3, r1);
    }

    public c(float r1, float r2) {
        this.f25466a = r1;
        this.f25467b = r2;
    }

    public final float a() {
        return this.f25466a;
    }

    public final float b() {
        return this.f25467b;
    }

    public /* synthetic */ c(float r2, float r3, int r4, kotlin.jvm.internal.i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = 0.0f;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = 0.0f;
    L8:
        this(r2, r3);
    }
}
