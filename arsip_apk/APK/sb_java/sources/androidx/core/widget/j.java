package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes4.dex */
public abstract class j {

    public static class a {
        public static void a(PopupWindow r02, boolean r1) {
            r02.setOverlapAnchor(r1);
        }

        public static void b(PopupWindow r02, int r1) {
            r02.setWindowLayoutType(r1);
        }
    }

    public static void a(PopupWindow r02, boolean r1) {
        a.a(r02, r1);
    }

    public static void b(PopupWindow r02, int r1) {
        a.b(r02, r1);
    }

    public static void c(PopupWindow r02, View r1, int r2, int r3, int r4) {
        r02.showAsDropDown(r1, r2, r3, r4);
    }
}
