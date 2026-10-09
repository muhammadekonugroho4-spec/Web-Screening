package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* loaded from: classes.dex */
public class l implements j {
    public l() {
    }

    @Override // androidx.compose.ui.window.j
    public void a(WindowManager r1, View r2, ViewGroup.LayoutParams r3) {
        r1.updateViewLayout(r2, r3);
    }

    @Override // androidx.compose.ui.window.j
    public void b(View r1, int r2, int r3) {
    }

    @Override // androidx.compose.ui.window.j
    public void c(View r1, Rect r2) {
        r1.getWindowVisibleDisplayFrame(r2);
    }
}
