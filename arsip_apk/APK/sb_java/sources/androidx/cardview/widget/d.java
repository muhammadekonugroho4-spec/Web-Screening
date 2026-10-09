package androidx.cardview.widget;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class d extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public static final double f6350a = 0.0d;

    static {
        f6350a = Math.cos(Math.toRadians(45.0d));
    }

    public static float a(float r6, float r7, boolean r8) {
        if (r8 == true) goto L4;
        return r6;
    L4:
        return (float) (r6 + ((1.0d - f6350a) * r7));
    }

    public static float b(float r6, float r7, boolean r8) {
        if (r8 == false) goto L7;
        return (float) ((r6 * 1.5f) + ((1.0d - f6350a) * r7));
    L7:
        return r6 * 1.5f;
    }
}
