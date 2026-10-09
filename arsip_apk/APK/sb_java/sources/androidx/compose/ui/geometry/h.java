package androidx.compose.ui.geometry;

/* loaded from: classes.dex */
public abstract class h {
    public static final g a(long r7, long r9) {
        return new g(Float.intBitsToFloat((int) (r7 >> 32)), Float.intBitsToFloat((int) (r7 & 4294967295L)), Float.intBitsToFloat((int) (r9 >> 32)), Float.intBitsToFloat((int) (r9 & 4294967295L)));
    }

    public static final g b(long r5, float r7) {
        int r1 = (int) (r5 >> 32);
        int r52 = (int) (r5 & 4294967295L);
        return new g(Float.intBitsToFloat(r1) - r7, Float.intBitsToFloat(r52) - r7, Float.intBitsToFloat(r1) + r7, Float.intBitsToFloat(r52) + r7);
    }

    public static final g c(long r8, long r10) {
        int r2 = (int) (r8 >> 32);
        int r82 = (int) (r8 & 4294967295L);
        return new g(Float.intBitsToFloat(r2), Float.intBitsToFloat(r82), Float.intBitsToFloat(r2) + Float.intBitsToFloat((int) (r10 >> 32)), Float.intBitsToFloat(r82) + Float.intBitsToFloat((int) (r10 & 4294967295L)));
    }
}
