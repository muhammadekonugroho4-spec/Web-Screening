package com.google.android.gms.internal.base;

import android.os.Build;

/* loaded from: classes5.dex */
public final class zap {
    public static final int zaa = 0;

    static {
        if (Build.VERSION.SDK_INT < 31) goto L5;
        int r02 = 33554432;
    L6:
        zaa = r02;
        return;
    L5:
        r02 = 0;
        goto L6
    }
}
