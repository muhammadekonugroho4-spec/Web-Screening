package com.google.android.gms.common.util;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
final class zze {
    private static final Pattern zza = null;

    static {
        zza = Pattern.compile("\\\\u[0-9a-fA-F]{4}");
    }

    public static String zza(String r7) {
        if (TextUtils.isEmpty(r7) == true) goto L36;
        Matcher r02 = zza.matcher(r7);
        StringBuilder r1 = null;
        int r2 = 0;
    L6:
        if (r02.find() == false) goto L22;
        if (r1 != null) goto L9;
        r1 = new StringBuilder();
    L9:
        int r3 = r02.start();
        int r4 = r3;
    L11:
        if (r4 < 0) goto L16;
        if (r7.charAt(r4) != '\\') goto L16;
        r4 = r4 - 1;
    L16:
        if (((r3 - r4) % 2) == 0) goto L6;
        int r32 = Integer.parseInt(r02.group().substring(2), 16);
        r1.append(r7, r2, r02.start());
        if (r32 != 92) goto L20;
        r1.append("\\\\");
    L21:
        r2 = r02.end();
        goto L6
    L20:
        r1.append(Character.toChars(r32));
        goto L21
    L22:
        if (r1 != null) goto L25;
        return r7;
    L25:
        if (r2 >= r02.regionEnd()) goto L28;
        r1.append(r7, r2, r02.regionEnd());
    L28:
        return r1.toString();
    L36:
        return r7;
    }
}
