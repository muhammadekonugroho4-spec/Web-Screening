package androidx.compose.ui.layout;

/* renamed from: androidx.compose.ui.layout.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3602g {
    public static final /* synthetic */ float a(long r02, long r2) {
        return c(r02, r2);
    }

    public static final /* synthetic */ float b(long r02, long r2) {
        return d(r02, r2);
    }

    public static final float c(long r4, long r6) {
        return Math.max(Float.intBitsToFloat((int) (r6 >> 32)) / Float.intBitsToFloat((int) (r4 >> 32)), Float.intBitsToFloat((int) (r6 & 4294967295L)) / Float.intBitsToFloat((int) (r4 & 4294967295L)));
    }

    public static final float d(long r4, long r6) {
        return Math.min(Float.intBitsToFloat((int) (r6 >> 32)) / Float.intBitsToFloat((int) (r4 >> 32)), Float.intBitsToFloat((int) (r6 & 4294967295L)) / Float.intBitsToFloat((int) (r4 & 4294967295L)));
    }
}
