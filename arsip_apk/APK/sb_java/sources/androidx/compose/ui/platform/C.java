package androidx.compose.ui.platform;

import android.view.View;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public static final C f19100a = null;

    static {
        f19100a = new C();
    }

    public C() {
    }

    public final void a(View r1, int r2, boolean r3) {
        r1.setFocusable(r2);
        r1.setDefaultFocusHighlightEnabled(r3);
    }
}
