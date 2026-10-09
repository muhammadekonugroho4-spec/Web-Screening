package androidx.compose.ui.unit;

/* loaded from: classes.dex */
public abstract class p {
    public static final long a(int r4, int r5) {
        return o.f((r5 & 4294967295L) | (r4 << 32));
    }

    public static final long b(long r6, long r8) {
        float r1 = Float.intBitsToFloat((int) (r6 >> 32)) - o.k(r8);
        float r62 = Float.intBitsToFloat((int) (r6 & 4294967295L)) - o.l(r8);
        return androidx.compose.ui.geometry.e.e((Float.floatToRawIntBits(r1) << 32) | (Float.floatToRawIntBits(r62) & 4294967295L));
    }

    public static final long c(long r6, long r8) {
        float r1 = Float.intBitsToFloat((int) (r6 >> 32)) + o.k(r8);
        float r62 = Float.intBitsToFloat((int) (r6 & 4294967295L)) + o.l(r8);
        return androidx.compose.ui.geometry.e.e((Float.floatToRawIntBits(r1) << 32) | (Float.floatToRawIntBits(r62) & 4294967295L));
    }

    public static final long d(long r6) {
        int r1 = Math.round(Float.intBitsToFloat((int) (r6 >> 32)));
        return o.f((Math.round(Float.intBitsToFloat((int) (r6 & 4294967295L))) & 4294967295L) | (r1 << 32));
    }
}
