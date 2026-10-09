package androidx.core.view.accessibility;

import android.os.Build;
import android.view.accessibility.AccessibilityManager;

/* loaded from: classes4.dex */
public abstract class c {

    public static class a {
        public static boolean a(AccessibilityManager r02) {
            return r02.isRequestFromAccessibilityTool();
        }
    }

    public static boolean a(AccessibilityManager r2) {
        if (Build.VERSION.SDK_INT >= 34) goto L5;
        return true;
    L5:
        return a.a(r2);
    }
}
