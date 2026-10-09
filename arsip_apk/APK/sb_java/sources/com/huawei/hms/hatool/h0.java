package com.huawei.hms.hatool;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Map;

@SuppressLint({"ApplySharedPref"})
/* loaded from: classes6.dex */
public class h0 {
    public static long a(Context r1, String r2, String r3, long r4) {
        if (r1 != null) goto L4;
    L13:
        z.f("hmsSdk", "context is null or spName empty or spkey is empty");
        return r4;
    L4:
        if (TextUtils.isEmpty(r2) == true) goto L13;
        if (TextUtils.isEmpty(r3) == true) goto L13;
        SharedPreferences r12 = b(r1, r2);
        if (r12 != null) goto L11;
        return r4;
    L11:
        return r12.getLong(r3, r4);
    }

    private static SharedPreferences b(Context r1, String r2) {
        return r1.getSharedPreferences(c(r1, r2), 0);
    }

    public static String c(Context r4, String r5) {
        String r42 = r4.getPackageName();
        String r02 = c.n("_hms_config_tag", "oper");
        if (TextUtils.isEmpty(r02) == false) goto L7;
        return "hms_" + r5 + "_" + r42;
    L7:
        return "hms_" + r5 + "_" + r42 + "_" + r02;
    }

    public static String a(Context r1, String r2, String r3, String r4) {
        if (r1 != null) goto L4;
    L13:
        z.f("hmsSdk", "context is null or spName empty or spkey is empty");
        return r4;
    L4:
        if (TextUtils.isEmpty(r2) == true) goto L13;
        if (TextUtils.isEmpty(r3) == true) goto L13;
        SharedPreferences r12 = b(r1, r2);
        if (r12 != null) goto L11;
        return r4;
    L11:
        return r12.getString(r3, r4);
    }

    public static void b(Context r1, String r2, String r3, long r4) {
        if (r1 != null) goto L4;
    L12:
        z.f("hmsSdk", "context is null or spName empty or spkey is empty");
        return;
    L4:
        if (TextUtils.isEmpty(r2) == true) goto L12;
        if (TextUtils.isEmpty(r3) == true) goto L12;
        SharedPreferences r12 = b(r1, r2);
        if (r12 == null) goto L14;
        SharedPreferences.Editor r13 = r12.edit();
        r13.putLong(r3, r4);
        r13.commit();
        return;
    }

    public static Map<String, ?> a(Context r02, String r1) {
        return b(r02, r1).getAll();
    }

    public static void b(Context r1, String r2, String r3, String r4) {
        if (r1 != null) goto L4;
    L12:
        z.e("hmsSdk", "context is null or spName empty or spkey is empty");
        return;
    L4:
        if (TextUtils.isEmpty(r2) == true) goto L12;
        if (TextUtils.isEmpty(r3) == true) goto L12;
        SharedPreferences r12 = b(r1, r2);
        if (r12 == null) goto L14;
        SharedPreferences.Editor r13 = r12.edit();
        r13.putString(r3, r4);
        r13.commit();
        return;
    }

    public static void a(Context r4, String r5, String... r6) {
        if (r4 != null) goto L5;
    L23:
        z.f("hmsSdk", "clearData(): parameter error.context,spname");
        return;
    L5:
        if (TextUtils.isEmpty(r5) == true) goto L23;
        if (r6 != null) goto L10;
        z.f("hmsSdk", "clearData(): No data need to be deleted,keys is null");
        return;
    L10:
        SharedPreferences r42 = b(r4, r5);
        if (r42 == null) goto L22;
        SharedPreferences.Editor r52 = r42.edit();
        if (r6.length != 0) goto L16;
        r52.clear();
        r52.commit();
        return;
    L16:
        int r02 = r6.length;
        int r1 = 0;
    L17:
        if (r1 >= r02) goto L28;
        String r2 = r6[r1];
        if (r42.contains(r2) == false) goto L21;
        r52.remove(r2);
        r52.commit();
    L21:
        r1 = r1 + 1;
        goto L17
    L28:
        return;
    }
}
