package androidx.transition;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.transition.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4163j {
    public static InterfaceC4159f a(View r2, ViewGroup r3, Matrix r4) {
        if (Build.VERSION.SDK_INT != 28) goto L7;
        return C4161h.b(r2, r3, r4);
    L7:
        return C4162i.b(r2, r3, r4);
    }

    public static void b(View r2) {
        if (Build.VERSION.SDK_INT != 28) goto L6;
        C4161h.f(r2);
        return;
    L6:
        C4162i.f(r2);
    }
}
