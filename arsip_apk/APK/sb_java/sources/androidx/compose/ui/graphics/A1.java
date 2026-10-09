package androidx.compose.ui.graphics;

/* loaded from: classes.dex */
public abstract class A1 {
    public static final long a(float r4, float r5) {
        long r02 = Float.floatToRawIntBits(r4);
        return z1.c((Float.floatToRawIntBits(r5) & 4294967295L) | (r02 << 32));
    }
}
