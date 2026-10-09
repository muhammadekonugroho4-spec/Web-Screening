package androidx.compose.ui.unit;

/* loaded from: classes.dex */
public abstract class t {
    public static final long a(int r4, int r5) {
        return s.c((r5 & 4294967295L) | (r4 << 32));
    }

    public static final long b(long r5) {
        long r1 = (r5 >> 33) << 32;
        return o.f((((r5 << 32) >> 33) & 4294967295L) | r1);
    }

    public static final long c(long r6) {
        int r1 = Math.round(Float.intBitsToFloat((int) (r6 >> 32)));
        return s.c((Math.round(Float.intBitsToFloat((int) (r6 & 4294967295L))) & 4294967295L) | (r1 << 32));
    }

    public static final long d(long r6) {
        int r1 = (int) Float.intBitsToFloat((int) (r6 >> 32));
        return s.c((((int) Float.intBitsToFloat((int) (r6 & 4294967295L))) & 4294967295L) | (r1 << 32));
    }

    public static final long e(long r6) {
        long r4 = Float.floatToRawIntBits((int) (r6 >> 32));
        return androidx.compose.ui.geometry.k.d((Float.floatToRawIntBits((int) (r6 & 4294967295L)) & 4294967295L) | (r4 << 32));
    }
}
