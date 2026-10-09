package androidx.core.view;

import android.view.MotionEvent;

/* loaded from: classes4.dex */
public abstract class D {
    public static boolean a(MotionEvent r02, int r1) {
        if ((r02.getSource() & r1) != r1) goto L6;
        return true;
    L6:
        return false;
    }
}
