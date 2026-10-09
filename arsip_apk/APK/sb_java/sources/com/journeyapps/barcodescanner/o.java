package com.journeyapps.barcodescanner;

import android.os.Looper;

/* loaded from: classes6.dex */
public abstract class o {
    public static void a() {
        if (Looper.getMainLooper() != Looper.myLooper()) goto L6;
        return;
    L6:
        throw new IllegalStateException("Must be called from the main thread.");
    }
}
