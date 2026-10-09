package androidx.compose.ui.geometry;

/* loaded from: classes.dex */
public abstract class b {
    public static final String a(float r4, int r5) {
        if (Float.isNaN(r4) == false) goto L7;
        return "NaN";
    L7:
        if (Float.isInfinite(r4) == true) goto L9;
        int r52 = Math.max(r5, 0);
        float r02 = (float) Math.pow(10.0f, r52);
        float r42 = r4 * r02;
        int r1 = (int) r42;
        if ((r42 - r1) < 0.5f) goto L17;
        r1 = r1 + 1;
    L17:
        float r43 = r1 / r02;
        if (r52 <= 0) goto L22;
        return String.valueOf(r43);
    L22:
        return String.valueOf((int) r43);
    L9:
        if (r4 >= 0.0f) goto L12;
        return "-Infinity";
    L12:
        return "Infinity";
    }
}
