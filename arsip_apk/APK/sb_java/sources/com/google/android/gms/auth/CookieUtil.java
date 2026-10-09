package com.google.android.gms.auth;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes5.dex */
public final class CookieUtil {
    private CookieUtil() {
    }

    public static String getCookieUrl(String r1, Boolean r2) {
        Preconditions.checkNotEmpty(r1);
        if (true == zza(r2)) goto L5;
        String r22 = "http";
    L7:
        return r22 + "://" + r1;
    L5:
        r22 = "https";
        goto L7
    }

    public static String getCookieValue(String r1, String r2, String r3, String r4, Boolean r5, Boolean r6, Long r7) {
        if (r1 != null) goto L4;
        r1 = "";
    L4:
        StringBuilder r02 = new StringBuilder(r1);
        r02.append('=');
        if (TextUtils.isEmpty(r2) == true) goto L8;
        r02.append(r2);
    L8:
        if (zza(r5) == false) goto L11;
        r02.append(";HttpOnly");
    L11:
        if (zza(r6) == false) goto L14;
        r02.append(";Secure");
    L14:
        if (TextUtils.isEmpty(r3) == true) goto L17;
        r02.append(";Domain=");
        r02.append(r3);
    L17:
        if (TextUtils.isEmpty(r4) == true) goto L19;
        r02.append(";Path=");
        r02.append(r4);
    L19:
        if (r7 == null) goto L24;
        if (r7.longValue() <= 0) goto L24;
        r02.append(";Max-Age=");
        r02.append(r7);
    L24:
        if (TextUtils.isEmpty(null) == true) goto L27;
        r02.append(";Priority=null");
    L27:
        if (TextUtils.isEmpty(null) == true) goto L30;
        r02.append(";SameSite=null");
    L30:
        if (zza(null) == false) goto L33;
        r02.append(";SameParty");
    L33:
        return r02.toString();
    }

    private static boolean zza(Boolean r02) {
        if (r02 != null) goto L4;
        return false;
    L4:
        if (r02.booleanValue() == false) goto L9;
        return true;
    L9:
        return false;
    }
}
