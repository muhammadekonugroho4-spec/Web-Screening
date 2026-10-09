package com.google.android.gms.common.util;

import android.os.Looper;

/* loaded from: classes5.dex */
public final class zzd {
    public static boolean zza() {
        if (Looper.getMainLooper() != Looper.myLooper()) goto L6;
        return true;
    L6:
        return false;
    }
}
