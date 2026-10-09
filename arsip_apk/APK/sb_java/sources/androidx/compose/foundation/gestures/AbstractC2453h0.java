package androidx.compose.foundation.gestures;

/* renamed from: androidx.compose.foundation.gestures.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2453h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f7683a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public static final float f7684b = 0.0f;

    static {
        f7683a = androidx.compose.ui.unit.i.h(6);
        f7684b = androidx.compose.ui.unit.i.h(1);
    }

    public static final /* synthetic */ float a() {
        return f7684b;
    }

    public static final /* synthetic */ float b() {
        return f7683a;
    }

    public static final /* synthetic */ boolean c(float r02) {
        return d(r02);
    }

    public static final boolean d(float r1) {
        if (Float.isNaN(r1) == false) goto L5;
        return true;
    L5:
        if (Math.abs(r1) < 0.5f) goto L11;
        return false;
    L11:
        return true;
    }
}
