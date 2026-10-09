package androidx.compose.foundation.text;

/* loaded from: classes.dex */
public abstract class H2 {
    public static final /* synthetic */ long a(long r02, androidx.compose.ui.geometry.g r2) {
        return b(r02, r2);
    }

    public static final long b(long r6, androidx.compose.ui.geometry.g r8) {
        int r1 = (int) (r6 >> 32);
        if (Float.intBitsToFloat(r1) >= r8.k()) goto L6;
        float r12 = r8.k();
    L9:
        int r62 = (int) (r6 & 4294967295L);
        if (Float.intBitsToFloat(r62) >= r8.n()) goto L13;
        float r63 = r8.n();
    L17:
        return androidx.compose.ui.geometry.e.e((Float.floatToRawIntBits(r12) << 32) | (Float.floatToRawIntBits(r63) & 4294967295L));
    L13:
        if (Float.intBitsToFloat(r62) <= r8.e()) goto L15;
        r63 = r8.e();
        goto L17
    L15:
        r63 = Float.intBitsToFloat(r62);
        goto L17
    L6:
        if (Float.intBitsToFloat(r1) <= r8.l()) goto L8;
        r12 = r8.l();
        goto L9
    L8:
        r12 = Float.intBitsToFloat(r1);
        goto L9
    }
}
