package com.google.android.gms.internal.base;

import android.os.Build;

/* loaded from: classes5.dex */
final class zan {
    public static boolean zaa() {
        if (Build.VERSION.SDK_INT < 33) goto L6;
        return true;
    L6:
        return false;
    }
}
