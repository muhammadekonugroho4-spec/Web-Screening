package androidx.compose.ui.unit;

/* loaded from: classes.dex */
public abstract class j {
    public static final long a(float r4, float r5) {
        long r02 = Float.floatToRawIntBits(r4);
        return l.d((Float.floatToRawIntBits(r5) & 4294967295L) | (r02 << 32));
    }

    public static final float b(float r02, float r1, float r2) {
        return i.h(androidx.compose.ui.util.d.b(r02, r1, r2));
    }
}
