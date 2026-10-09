package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes5.dex */
final class zzr {
    private static final zzs zza = null;

    static {
        zza = new zzu(null);
    }

    public static zzl zza(String r1) {
        zzw.zza(r1);
        return zza.zza(r1);
    }

    public static String zzb(String r1) {
        if (zzd(r1) == false) goto L6;
        return null;
    L6:
        return r1;
    }

    public static String zzc(String r02) {
        if (r02 != null) goto L5;
        return "";
    L5:
        return r02;
    }

    public static boolean zzd(String r02) {
        if (r02 != null) goto L4;
        return true;
    L4:
        if (r02.isEmpty() == true) goto L10;
        return false;
    L10:
        return true;
    }
}
