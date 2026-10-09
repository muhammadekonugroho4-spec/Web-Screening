package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public static final N f19205a = null;

    static {
        f19205a = new N();
    }

    public N() {
    }

    public final int a(AccessibilityManager r1, int r2, int r3) {
        return r1.getRecommendedTimeoutMillis(r2, r3);
    }
}
