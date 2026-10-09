package com.google.android.gms.internal.ads_identifier;

import android.os.Parcel;

/* loaded from: classes5.dex */
public final class zzc {
    private static final ClassLoader zza = null;

    static {
        zza = zzc.class.getClassLoader();
    }

    private zzc() {
    }

    public static void zza(Parcel r02, boolean r1) {
        r02.writeInt(1);
    }

    public static boolean zzb(Parcel r02) {
        if (r02.readInt() == 0) goto L6;
        return true;
    L6:
        return false;
    }
}
