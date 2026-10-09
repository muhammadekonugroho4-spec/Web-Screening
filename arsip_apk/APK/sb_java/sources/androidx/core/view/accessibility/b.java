package androidx.core.view.accessibility;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes4.dex */
public abstract class b {

    public static class a {
        public static void a(AccessibilityEvent r02, boolean r1) {
            r02.setAccessibilityDataSensitive(r1);
        }
    }

    public static int a(AccessibilityEvent r02) {
        return r02.getContentChangeTypes();
    }

    public static void b(AccessibilityEvent r2, boolean r3) {
        if (Build.VERSION.SDK_INT < 34) goto L6;
        a.a(r2, r3);
        return;
    }

    public static void c(AccessibilityEvent r02, int r1) {
        r02.setContentChangeTypes(r1);
    }
}
