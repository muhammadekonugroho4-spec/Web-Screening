package androidx.compose.ui.layout;

/* loaded from: classes.dex */
public abstract class q0 {
    public static final long a(long r6, long r8) {
        float r1 = Float.intBitsToFloat((int) (r6 >> 32)) * Float.intBitsToFloat((int) (r8 >> 32));
        float r62 = Float.intBitsToFloat((int) (r6 & 4294967295L)) * Float.intBitsToFloat((int) (r8 & 4294967295L));
        return androidx.compose.ui.geometry.k.d((Float.floatToRawIntBits(r1) << 32) | (Float.floatToRawIntBits(r62) & 4294967295L));
    }
}
