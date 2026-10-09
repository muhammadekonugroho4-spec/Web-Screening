package com.huawei.hms.hatool;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import java.io.File;

/* loaded from: classes6.dex */
public class r0 {
    public static boolean a(Context r4) {
        long r02 = h0.a(r4, "Privacy_MY", "flashKeyTime", -1);
        if ((System.currentTimeMillis() - r02) <= 43200000) goto L6;
        return true;
    L6:
        return false;
    }

    public static boolean a(Context r1, String r2) {
        if (r1 != null) goto L6;
        return true;
    L6:
        if (r1.checkSelfPermission(r2) == 0) goto L9;
        z.f("hmsSdk", "not have read phone permission!");
        return true;
    L9:
        return false;
    }

    @SuppressLint({"DefaultLocale"})
    public static boolean a(Context r3, String r4, int r5) {
        String r42 = h0.c(r3, r4) + ".xml";
        long r32 = new File(r3.getFilesDir(), "../shared_prefs/" + r42).length();
        if (r32 <= r5) goto L6;
        z.c("hmsSdk", String.format("reach local file limited size - file len: %d limitedSize: %d", new Object[]{Long.valueOf(r32), Integer.valueOf(r5)}));
        return true;
    L6:
        return false;
    }

    public static boolean a(String r4, long r5, long r7) {
        if (TextUtils.isEmpty(r4) == false) goto L13;
        return true;
    L13:
        if ((r5 - Long.parseLong(r4)) <= r7) goto L9;
        return true;
    L9:
        return false;
    L11:
        z.f("hmsSdk", "isTimeExpired(): Data type conversion error : number format !");
        return true;
    }
}
