package androidx.compose.ui.util;

import android.os.Build;

/* loaded from: classes.dex */
public abstract class b {
    public static final void a(String r2, long r3) {
        if (Build.VERSION.SDK_INT < 29) goto L6;
        a.a(r2, r3);
        return;
    }
}
