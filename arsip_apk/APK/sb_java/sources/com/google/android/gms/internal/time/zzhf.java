package com.google.android.gms.internal.time;

/* loaded from: classes5.dex */
public final class zzhf {
    public static Object zza(Object r02, String r1) {
        if (r02 == null) goto L5;
        return r02;
    L5:
        throw new NullPointerException(r1.concat(" must not be null"));
    }

    public static String zzb(String r3) {
        if (r3.isEmpty() == true) goto L25;
        if (zze(r3.charAt(0)) == false) goto L23;
        int r02 = 1;
    L8:
        if (r02 >= r3.length()) goto L21;
        char r1 = r3.charAt(r02);
        if (zze(r1) == true) goto L20;
        if (r1 < '0') goto L16;
        if (r1 <= '9') goto L20;
    L16:
        if (r1 == '_') goto L20;
        throw new IllegalArgumentException("identifier must contain only ASCII letters, digits or underscore: ".concat(r3));
    L20:
        r02 = r02 + 1;
        goto L8
    L21:
        return r3;
    L23:
        throw new IllegalArgumentException("identifier must start with an ASCII letter: ".concat(r3));
    L25:
        throw new IllegalArgumentException("identifier must not be empty");
    }

    public static void zzc(boolean r02, String r1) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(r1);
    }

    public static void zzd(boolean r02, String r1) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalStateException(r1);
    }

    private static boolean zze(char r3) {
        if (r3 < 'a') goto L9;
        if (r3 > 'z') goto L9;
        return true;
    L9:
        if (r3 >= 'A') goto L11;
    L13:
        return false;
    L11:
        if (r3 > 'Z') goto L13;
        return true;
    }
}
