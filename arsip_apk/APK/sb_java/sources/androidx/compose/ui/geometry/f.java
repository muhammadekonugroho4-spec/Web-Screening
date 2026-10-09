package androidx.compose.ui.geometry;

/* loaded from: classes.dex */
public abstract class f {
    public static final long a(float r4, float r5) {
        long r02 = Float.floatToRawIntBits(r4);
        return e.e((Float.floatToRawIntBits(r5) & 4294967295L) | (r02 << 32));
    }

    public static final long b(long r4, long r6, float r8) {
        float r1 = androidx.compose.ui.util.d.b(Float.intBitsToFloat((int) (r4 >> 32)), Float.intBitsToFloat((int) (r6 >> 32)), r8);
        float r42 = androidx.compose.ui.util.d.b(Float.intBitsToFloat((int) (r4 & 4294967295L)), Float.intBitsToFloat((int) (r6 & 4294967295L)), r8);
        return e.e((Float.floatToRawIntBits(r1) << 32) | (Float.floatToRawIntBits(r42) & 4294967295L));
    }
}
