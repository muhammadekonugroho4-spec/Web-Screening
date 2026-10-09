package androidx.compose.foundation.gestures;

import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class S0 {

    /* renamed from: a, reason: collision with root package name */
    public static final S0 f7604a = null;

    static {
        f7604a = new S0();
    }

    public S0() {
    }

    public final float a(ViewConfiguration r1) {
        return r1.getScaledHorizontalScrollFactor();
    }

    public final float b(ViewConfiguration r1) {
        return r1.getScaledVerticalScrollFactor();
    }
}
