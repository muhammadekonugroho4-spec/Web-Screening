package com.google.android.gms.internal.common;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class zzc {
    public static final /* synthetic */ int zza = 0;
    private static final ClassLoader zzb = null;

    static {
        zzb = zzc.class.getClassLoader();
    }

    private zzc() {
    }

    public static Parcelable zza(Parcel r1, Parcelable.Creator r2) {
        if (r1.readInt() != 0) goto L7;
        return null;
    L7:
        return (Parcelable) r2.createFromParcel(r1);
    }

    public static void zzb(Parcel r3) {
        int r32 = r3.dataAvail();
        if (r32 > 0) goto L6;
        return;
    L6:
        throw new BadParcelableException("Parcel data not fully consumed, unread size: " + r32);
    }

    public static void zzc(Parcel r2, Parcelable r3) {
        if (r3 != null) goto L6;
        r2.writeInt(0);
        return;
    L6:
        r2.writeInt(1);
        r3.writeToParcel(r2, 0);
    }

    public static void zzd(Parcel r1, Parcelable r2) {
        if (r2 != null) goto L5;
        r1.writeInt(0);
        return;
    L5:
        r1.writeInt(1);
        r2.writeToParcel(r1, 1);
    }

    public static void zze(Parcel r02, IInterface r1) {
        if (r1 != null) goto L5;
        r02.writeStrongBinder(null);
        return;
    L5:
        r02.writeStrongBinder(r1.asBinder());
    }

    public static boolean zzf(Parcel r02) {
        if (r02.readInt() == 0) goto L6;
        return true;
    L6:
        return false;
    }
}
