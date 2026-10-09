package androidx.compose.ui.node;

/* renamed from: androidx.compose.ui.node.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3639t {
    public static final long a(float r4, boolean r5, boolean r6) {
        long r02 = Float.floatToRawIntBits(r4);
        long r2 = 0;
        if (r5 == false) goto L5;
        long r42 = 1;
    L6:
        if (r6 == false) goto L9;
        r2 = 2;
    L9:
        return AbstractC3634n.b(((r42 | r2) & 4294967295L) | (r02 << 32));
    L5:
        r42 = 0;
        goto L6
    }

    public static /* synthetic */ long b(float r02, boolean r1, boolean r2, int r3, Object r4) {
        if ((r3 & 4) == 0) goto L6;
        r2 = false;
    L6:
        return a(r02, r1, r2);
    }

    public static final /* synthetic */ long c(float r02, boolean r1, boolean r2) {
        return a(r02, r1, r2);
    }
}
