package androidx.compose.animation;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final float f6982a = 0.0f;

    static {
        f6982a = (float) (Math.log(0.78d) / Math.log(0.9d));
    }

    public static final /* synthetic */ float a(float r02, float r1) {
        return c(r02, r1);
    }

    public static final /* synthetic */ float b() {
        return f6982a;
    }

    public static final float c(float r1, float r2) {
        return ((r2 * 386.0878f) * 160.0f) * r1;
    }
}
