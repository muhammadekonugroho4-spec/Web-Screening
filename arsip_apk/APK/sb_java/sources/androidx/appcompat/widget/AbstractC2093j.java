package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* renamed from: androidx.appcompat.widget.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2093j {
    public static InputConnection a(InputConnection r02, EditorInfo r1, View r2) {
        if (r02 != null) goto L4;
    L9:
        return r02;
    L4:
        if (r1.hintText != null) goto L9;
        ViewParent r12 = r2.getParent();
    L7:
        if ((r12 instanceof View) == false) goto L9;
        r12 = r12.getParent();
        goto L7
    }
}
