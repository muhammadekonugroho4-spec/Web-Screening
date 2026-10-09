package com.android.installreferrer.commons;

import android.util.Log;

/* loaded from: classes4.dex */
public abstract class a {
    public static void a(String r1, String r2) {
        if (Log.isLoggable(r1, 2) == false) goto L6;
        Log.v(r1, r2);
        return;
    }

    public static void b(String r1, String r2) {
        if (Log.isLoggable(r1, 5) == false) goto L6;
        Log.w(r1, r2);
        return;
    }
}
