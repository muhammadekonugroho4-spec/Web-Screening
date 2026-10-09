package androidx.core.view;

import android.graphics.Rect;
import android.view.Gravity;

/* renamed from: androidx.core.view.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3895s {
    public static void a(int r02, int r1, int r2, Rect r3, Rect r4, int r5) {
        Gravity.apply(r02, r1, r2, r3, r4, r5);
    }

    public static int b(int r02, int r1) {
        return Gravity.getAbsoluteGravity(r02, r1);
    }
}
