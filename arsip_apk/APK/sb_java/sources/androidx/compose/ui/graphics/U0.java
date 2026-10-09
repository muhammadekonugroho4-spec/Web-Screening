package androidx.compose.ui.graphics;

/* loaded from: classes.dex */
public abstract class U0 {
    public static final boolean a(float[] r5) {
        if (r5.length >= 16) goto L6;
        return false;
    L6:
        if (r5[0] == 1.0f) goto L8;
    L38:
        return false;
    L8:
        if (r5[1] != 0.0f) goto L38;
        if (r5[2] != 0.0f) goto L38;
        if (r5[3] != 0.0f) goto L38;
        if (r5[4] != 0.0f) goto L38;
        if (r5[5] != 1.0f) goto L38;
        if (r5[6] != 0.0f) goto L38;
        if (r5[7] != 0.0f) goto L38;
        if (r5[8] != 0.0f) goto L38;
        if (r5[9] != 0.0f) goto L38;
        if (r5[10] != 1.0f) goto L38;
        if (r5[11] != 0.0f) goto L38;
        if (r5[12] != 0.0f) goto L38;
        if (r5[13] != 0.0f) goto L38;
        if (r5[14] != 0.0f) goto L38;
        if (r5[15] != 1.0f) goto L38;
        return true;
    }
}
