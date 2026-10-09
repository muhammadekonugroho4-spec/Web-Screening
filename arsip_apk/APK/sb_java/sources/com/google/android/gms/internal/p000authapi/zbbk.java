package com.google.android.gms.internal.p000authapi;

import android.os.Build;

/* loaded from: classes5.dex */
public final class zbbk {
    public static final int zba = 0;

    static {
        if (Build.VERSION.SDK_INT < 31) goto L5;
        int r02 = 33554432;
    L6:
        zba = r02;
        return;
    L5:
        r02 = 0;
        goto L6
    }
}
