package com.midtrans.raygun;

import android.util.Log;

/* loaded from: classes6.dex */
public abstract class d {
    public static void a(String r1) {
        if (r1 == null) goto L5;
        Log.d("Raygun4Android", r1);
        return;
    }

    public static void b(String r1) {
        if (r1 == null) goto L5;
        Log.e("Raygun4Android", r1);
        return;
    }

    public static void c(String r1) {
        if (r1 == null) goto L5;
        Log.i("Raygun4Android", r1);
        return;
    }

    public static void d(String r1) {
        if (r1 == null) goto L5;
        Log.w("Raygun4Android", r1);
        return;
    }
}
