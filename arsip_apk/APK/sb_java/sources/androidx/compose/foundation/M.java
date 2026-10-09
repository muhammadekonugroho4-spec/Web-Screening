package androidx.compose.foundation;

import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public static final float f7163a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public static final double f7164b = 0.0d;

    /* renamed from: c, reason: collision with root package name */
    public static final double f7165c = 0.0d;

    static {
        f7163a = ViewConfiguration.getScrollFriction();
        double r02 = Math.log(0.78d) / Math.log(0.9d);
        f7164b = r02;
        f7165c = r02 - 1.0d;
    }

    public static final /* synthetic */ float a(androidx.compose.ui.unit.e r02, float r1) {
        return b(r02, r1);
    }

    public static final float b(androidx.compose.ui.unit.e r6, float r7) {
        double r02 = ((r6.getDensity() * 386.0878f) * 160.0f) * 0.84f;
        double r62 = Math.abs(r7) * 0.35f;
        float r2 = f7163a;
        return (float) ((r2 * r02) * Math.exp((f7164b / f7165c) * Math.log(r62 / (r2 * r02))));
    }
}
