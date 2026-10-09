package com.android.volley.toolbox;

import android.os.Looper;

/* loaded from: classes4.dex */
public abstract class l {
    public static void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) goto L6;
        return;
    L6:
        throw new IllegalStateException("Must be invoked from the main thread.");
    }
}
