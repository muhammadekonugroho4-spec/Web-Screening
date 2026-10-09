package androidx.viewbinding;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes4.dex */
public abstract class b {
    public static View a(View r4, int r5) {
        if ((r4 instanceof ViewGroup) == true) goto L5;
        return null;
    L5:
        ViewGroup r42 = (ViewGroup) r4;
        int r02 = r42.getChildCount();
        int r2 = 0;
    L6:
        if (r2 >= r02) goto L11;
        View r3 = r42.getChildAt(r2).findViewById(r5);
        if (r3 != null) goto L9;
        r2 = r2 + 1;
        goto L6
    L9:
        return r3;
    L11:
        return null;
    }
}
