package androidx.compose.ui.util;

/* loaded from: classes.dex */
public abstract class d {
    public static final float a(float r4) {
        float r02 = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(r4) & 8589934591L) / 3)) + 709952852);
        float r03 = r02 - ((r02 - (r4 / (r02 * r02))) * 0.33333334f);
        return r03 - ((r03 - (r4 / (r03 * r03))) * 0.33333334f);
    }

    public static final float b(float r1, float r2, float r3) {
        return ((1 - r3) * r1) + (r3 * r2);
    }

    public static final int c(int r2, int r3, float r4) {
        return r2 + ((int) Math.round((r3 - r2) * r4));
    }
}
