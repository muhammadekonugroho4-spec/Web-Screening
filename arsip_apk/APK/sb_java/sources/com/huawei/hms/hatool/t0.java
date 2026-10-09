package com.huawei.hms.hatool;

import android.text.TextUtils;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public class t0 {
    public static String a(String r1, String r2, String r3, String r4) {
        if (TextUtils.isEmpty(r2) == false) goto L7;
        z.f("hmsSdk", "checkStrParameter() Parameter verification failure! Parameter:" + r1);
        return r4;
    L7:
        if (a(r1, r2, r3) == false) goto L9;
        return r2;
    L9:
        return r4;
    }

    public static boolean a(String r2) {
        return !a("eventId", r2, 256);
    }

    public static boolean a(String r3, String r4, int r5) {
        if (TextUtils.isEmpty(r4) == false) goto L8;
        StringBuilder r42 = new StringBuilder();
        String r52 = "checkString() Parameter is empty : ";
    L5:
        r42.append(r52);
        r42.append(r3);
        z.f("hmsSdk", r42.toString());
        return false;
    L8:
        if (r4.length() <= r5) goto L10;
        r42 = new StringBuilder();
        r52 = "checkString() Failure of parameter length check! Parameter:";
        goto L5
    L10:
        return true;
    }

    public static boolean a(String r3, String r4, String r5) {
        if (TextUtils.isEmpty(r4) == false) goto L8;
        StringBuilder r42 = new StringBuilder();
        String r52 = "checkString() Parameter is null! Parameter:";
    L5:
        r42.append(r52);
        r42.append(r3);
        z.f("hmsSdk", r42.toString());
        return false;
    L8:
        if (Pattern.compile(r5).matcher(r4).matches() == false) goto L11;
        return true;
    L11:
        r42 = new StringBuilder();
        r52 = "checkString() Parameter verification failure! Parameter:";
        goto L5
    }

    public static boolean a(Map<String, String> r5) {
        if (r5 != null) goto L5;
    L23:
        String r52 = "onEvent() mapValue has not data.so,The data will be empty";
    L14:
        z.f("hmsSdk", r52);
        return false;
    L5:
        if (r5.size() == 0) goto L23;
        if (r5.size() != 1) goto L17;
        if (r5.get("constants") == null) goto L12;
    L13:
        r52 = "checkMap() the key can't be constants or _constants";
        goto L14
    L12:
        if (r5.get("_constants") != null) goto L13;
    L17:
        if (r5.size() <= 2048) goto L19;
    L22:
        r52 = "checkMap Map data is too big! size: " + r5.size() + " length: " + r5.toString().length();
        goto L14
    L19:
        if (r5.toString().length() > 204800) goto L22;
        return true;
    }
}
