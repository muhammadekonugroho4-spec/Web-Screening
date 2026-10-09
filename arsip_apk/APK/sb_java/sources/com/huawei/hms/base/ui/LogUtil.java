package com.huawei.hms.base.ui;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public class LogUtil {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f39029a = null;

    static {
        f39029a = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");
    }

    public LogUtil() {
    }

    private static String a(String r2, boolean r3) {
        StringBuilder r02 = new StringBuilder(512);
        if (TextUtils.isEmpty(r2) == true) goto L8;
        if (r3 == false) goto L6;
        r02.append(a(r2));
        goto L8
    L6:
        r02.append(r2);
    L8:
        return r02.toString();
    }

    public static void e(String r1, String r2, boolean r3) {
        if (TextUtils.isEmpty(r2) == false) goto L5;
        return;
    L5:
        Log.e(r1, a(r2, r3));
    }

    public static void e(String r1, String r2) {
        if (TextUtils.isEmpty(r2) == false) goto L5;
        return;
    L5:
        Log.e(r1, a(r2, false));
    }

    private static String a(String r8) {
        if (TextUtils.isEmpty(r8) == false) goto L5;
        return r8;
    L5:
        int r02 = r8.length();
        int r2 = 1;
        if (1 == r02) goto L8;
        StringBuilder r3 = new StringBuilder(r02);
        int r4 = 0;
    L10:
        if (r4 >= r02) goto L19;
        char r5 = r8.charAt(r4);
        if (f39029a.matcher(String.valueOf(r5)).matches() == false) goto L17;
        if ((r2 % 2) != 0) goto L16;
        r5 = '*';
    L16:
        r2 = r2 + 1;
    L17:
        r3.append(r5);
        r4 = r4 + 1;
        goto L10
    L19:
        return r3.toString();
    L8:
        return String.valueOf('*');
    }
}
