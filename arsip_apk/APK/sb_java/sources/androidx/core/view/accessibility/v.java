package androidx.core.view.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* loaded from: classes4.dex */
public abstract class v {
    public static void a(AccessibilityRecord r02, int r1) {
        r02.setMaxScrollX(r1);
    }

    public static void b(AccessibilityRecord r02, int r1) {
        r02.setMaxScrollY(r1);
    }

    public static void c(AccessibilityRecord r02, View r1, int r2) {
        r02.setSource(r1, r2);
    }
}
