package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes5.dex */
public final class zzaf {
    public zzaf(Context r1) {
    }

    public static boolean zza() {
        if (Looper.myLooper() != Looper.getMainLooper()) goto L6;
        return true;
    L6:
        return false;
    }
}
