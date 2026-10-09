package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class zzae {
    public static String zza(String r02) {
        return zzr.zzb(r02);
    }

    public static String zzb(String r02) {
        return zzr.zzc(r02);
    }

    public static boolean zzc(String r02) {
        return zzr.zzd(r02);
    }

    public static String zza(String r6, Object... r7) {
        String r62 = String.valueOf(r6);
        int r02 = 0;
        int r1 = 0;
    L4:
        if (r1 >= r7.length) goto L6;
        r7[r1] = zza(r7[r1]);
        r1 = r1 + 1;
        goto L4
    L6:
        StringBuilder r12 = new StringBuilder(r62.length() + (r7.length * 16));
        int r2 = 0;
    L8:
        if (r02 >= r7.length) goto L12;
        int r3 = r62.indexOf("%s", r2);
        if (r3 == (-1)) goto L12;
        r12.append(r62, r2, r3);
        r12.append(r7[r02]);
        r2 = r3 + 2;
        r02 = r02 + 1;
    L12:
        r12.append(r62, r2, r62.length());
        if (r02 >= r7.length) goto L20;
        r12.append(" [");
        int r63 = r02 + 1;
        r12.append(r7[r02]);
    L16:
        if (r63 >= r7.length) goto L18;
        r12.append(", ");
        r12.append(r7[r63]);
        r63 = r63 + 1;
        goto L16
    L18:
        r12.append(']');
    L20:
        return r12.toString();
    }

    private static String zza(Object r6) {
        if (r6 != null) goto L10;
        return "null";
    L10:
        return r6.toString();
    L7:
        e = move-exception;
        String r62 = r6.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(r6));
        Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for " + r62, e);
        return "<" + r62 + " threw " + e.getClass().getName() + ">";
    }
}
