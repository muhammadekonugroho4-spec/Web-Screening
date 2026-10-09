package androidx.compose.ui.window;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Window;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f20827a = null;

    static {
        f20827a = new b();
    }

    public b() {
    }

    public final int a(Window r3) {
        DisplayMetrics r02 = new DisplayMetrics();
        r3.getWindowManager().getDefaultDisplay().getMetrics(r02);
        int r03 = r02.heightPixels;
        return r03 - b(r3, r03);
    }

    public final int b(Window r2, int r3) {
        Rect r02 = new Rect();
        r2.getDecorView().getWindowVisibleDisplayFrame(r02);
        int r22 = r02.top;
        int r03 = r02.bottom;
        if (r03 <= r3) goto L5;
        int r04 = r03 - r3;
    L7:
        return r22 + r04;
    L5:
        r04 = 0;
        goto L7
    }
}
