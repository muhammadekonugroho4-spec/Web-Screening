package com.google.android.gms.common.util;

import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.regex.Pattern;

@KeepForSdk
/* loaded from: classes5.dex */
public class Strings {
    private static final Pattern zza = null;

    static {
        zza = Pattern.compile("\\$\\{(.*?)\\}");
    }

    private Strings() {
    }

    @KeepForSdk
    public static String emptyToNull(String r1) {
        if (TextUtils.isEmpty(r1) == false) goto L6;
        return null;
    L6:
        return r1;
    }

    @KeepForSdk
    public static boolean isEmptyOrWhitespace(String r02) {
        if (r02 != null) goto L4;
        return true;
    L4:
        if (r02.trim().isEmpty() == true) goto L10;
        return false;
    L10:
        return true;
    }
}
