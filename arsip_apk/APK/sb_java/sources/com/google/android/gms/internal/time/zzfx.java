package com.google.android.gms.internal.time;

import java.util.logging.Level;

/* loaded from: classes5.dex */
public final class zzfx {
    public static String zza(String r3, String r4, boolean r5) {
        if (r4.length() <= 23) goto L14;
        int r02 = -1;
        int r32 = r4.length() - 1;
    L5:
        if (r32 < 0) goto L13;
        char r1 = r4.charAt(r32);
        if (r1 == '.') goto L12;
        if (r1 == '$') goto L12;
        r32 = r32 - 1;
    L12:
        r02 = r32;
    L13:
        r4 = r4.substring(r02 + 1);
    L14:
        String r33 = "".concat(String.valueOf(r4));
        return r33.substring(0, Math.min(r33.length(), 23));
    }

    public static int zzb(Level r1) {
        int r12 = r1.intValue();
        if (r12 < Level.SEVERE.intValue()) goto L7;
        return 6;
    L7:
        if (r12 < Level.WARNING.intValue()) goto L11;
        return 5;
    L11:
        if (r12 < Level.INFO.intValue()) goto L15;
        return 4;
    L15:
        if (r12 < Level.FINE.intValue()) goto L18;
        return 3;
    L18:
        return 2;
    }
}
