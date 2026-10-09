package ai.advance.core;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class c {
    public static boolean a(Context r1, String r2) {
        if (r1 != null) goto L6;
        return false;
    L6:
        if (androidx.core.content.b.checkSelfPermission(r1, r2) != 0) goto L9;
        return true;
    L9:
        return false;
    }
}
