package com.huawei.hms.hatool;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.Pair;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes6.dex */
public class c1 extends f {
    public static String c() {
        String r1 = "";
        String r2 = (String) Class.forName("com.huawei.android.os.BuildEx").getMethod("getUDID", null).invoke(null, null);     // Catch: InvocationTargetException -> L22 IllegalArgumentException -> L23 IllegalAccessException -> L24 NoSuchMethodException -> L25 AndroidRuntimeException -> L26 ClassNotFoundException -> L27
        z.c("hmsSdk", "getUDID success");     // Catch: InvocationTargetException -> L8 IllegalArgumentException -> L9 IllegalAccessException -> L10 NoSuchMethodException -> L11 AndroidRuntimeException -> L12 ClassNotFoundException -> L13
        return r2;
    L12:
        r1 = r2;
    L13:
        r1 = r2;
    L10:
        r1 = r2;
    L9:
        r1 = r2;
    L11:
        r1 = r2;
    L8:
        r1 = r2;
        goto L14
    L19:
        String r22 = "getUDID getudid failed, RuntimeException is AndroidRuntimeException";
    L15:
        z.f("hmsSdk", r22);
        return r1;
    L20:
        r22 = "getUDID method invoke failed";
    L17:
        r22 = "getUDID method invoke failed : Illegal AccessException";
    L16:
        r22 = "getUDID method invoke failed : Illegal ArgumentException";
    L18:
        r22 = "getUDID method invoke failed : NoSuchMethodException";
    L14:
        r22 = "getUDID method invoke failed : InvocationTargetException";
        goto L15
    }

    public static Pair<String, String> e(Context r3) {
        if (r0.a(r3, "android.permission.READ_PHONE_STATE") == false) goto L6;
        z.f("hmsSdk", "getMccAndMnc() Pair value is empty");
        return new Pair("", "");
    L6:
        TelephonyManager r32 = (TelephonyManager) r3.getSystemService("phone");
        if (r32 != null) goto L11;
        return new Pair("", "");
    L11:
        if (r32.getSimState() != 5) goto L13;
        String r33 = r32.getNetworkOperator();
        if (TextUtils.isEmpty(r33) == true) goto L26;
        if (TextUtils.equals(r33, "null") == true) goto L26;
        if (r33.length() <= 3) goto L24;
        return new Pair(r33.substring(0, 3), r33.substring(3));
    L24:
        return new Pair("", "");
    L26:
        return new Pair("", "");
    L13:
        return new Pair("", "");
    }
}
