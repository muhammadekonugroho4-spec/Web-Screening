package androidx.compose.ui.layout;

/* loaded from: classes.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f18399a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final long f18400b = 0;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f18399a = new a(null);
        f18400b = a((Float.floatToRawIntBits(Float.NaN) << 32) | (Float.floatToRawIntBits(Float.NaN) & 4294967295L));
    }

    public static long a(long r02) {
        return r02;
    }

    public static final float b(long r1) {
        return Float.intBitsToFloat((int) (r1 >> 32));
    }

    public static final float c(long r2) {
        return Float.intBitsToFloat((int) (r2 & 4294967295L));
    }
}
