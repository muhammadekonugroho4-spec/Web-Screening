package androidx.compose.ui.unit;

/* loaded from: classes.dex */
public abstract class z {
    public static final long a(float r4, float r5) {
        long r02 = Float.floatToRawIntBits(r4);
        return y.c((Float.floatToRawIntBits(r5) & 4294967295L) | (r02 << 32));
    }
}
