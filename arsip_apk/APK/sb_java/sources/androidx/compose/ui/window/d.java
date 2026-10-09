package androidx.compose.ui.window;

import android.graphics.Insets;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f20829a = null;

    static {
        f20829a = new d();
    }

    public d() {
    }

    public final int a(Window r3) {
        WindowMetrics r32 = r3.getWindowManager().getCurrentWindowMetrics();
        Insets r02 = r32.getWindowInsets().getInsets(WindowInsets.Type.systemBars());
        int r1 = r02.top + r02.bottom;
        return r32.getBounds().height() - r1;
    }

    public final void b(WindowManager.LayoutParams r1, int r2) {
        r1.setFitInsetsSides(r2);
    }

    public final void c(WindowManager.LayoutParams r1, int r2) {
        r1.setFitInsetsTypes(r2);
    }
}
