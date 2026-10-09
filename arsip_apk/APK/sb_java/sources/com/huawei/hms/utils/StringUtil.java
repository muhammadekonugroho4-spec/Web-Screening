package com.huawei.hms.utils;

import com.huawei.hms.framework.common.ExceptionCode;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public class StringUtil {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f39560a = null;

    static {
        f39560a = Pattern.compile("(^([0-9]{1,2}\\.){2}[0-9]{1,2}$)|(^([0-9]{1,2}\\.){3}[0-9]{1,3}$)");
    }

    private StringUtil() {
    }

    public static String addByteForNum(String r2, int r3, char r4) {
        int r02 = r2.length();
        if (r02 != r3) goto L5;
        return r2;
    L5:
        if (r02 > r3) goto L7;
        StringBuffer r1 = new StringBuffer();
    L9:
        if (r02 >= r3) goto L11;
        r1.append(r4);
        r02 = r02 + 1;
        goto L9
    L11:
        r1.append(r2);
        return r1.toString();
    L7:
        return r2.substring(r02 - r3);
    }

    public static boolean checkVersion(String r1) {
        return f39560a.matcher(r1).find();
    }

    public static int convertVersion2Integer(String r4) {
        if (checkVersion(r4) == false) goto L11;
        String[] r42 = r4.split("\\.");
        if (r42.length >= 3) goto L7;
        return 0;
    L7:
        int r02 = ((Integer.parseInt(r42[0]) * ExceptionCode.CRASH_EXCEPTION) + (Integer.parseInt(r42[1]) * 100000)) + (Integer.parseInt(r42[2]) * 1000);
        if (r42.length == 4) goto L10;
        return r02;
    L10:
        return r02 + Integer.parseInt(r42[3]);
    L11:
        return 0;
    }

    public static String objDesc(Object r2) {
        if (r2 != null) goto L6;
        return "null";
    L6:
        return r2.getClass().getName() + '@' + Integer.toHexString(r2.hashCode());
    }
}
