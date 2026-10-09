package com.google.android.gms.internal.measurement;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class zzbw {
    private static final ClassLoader zza = null;

    static {
        zza = zzbw.class.getClassLoader();
    }

    private zzbw() {
    }

    public static <T extends Parcelable> T zza(Parcel r1, Parcelable.Creator<T> r2) {
        if (r1.readInt() != 0) goto L7;
        return null;
    L7:
        return r2.createFromParcel(r1);
    }

    public static void zzb(Parcel r3) {
        int r32 = r3.dataAvail();
        if (r32 > 0) goto L6;
        return;
    L6:
        throw new BadParcelableException("Parcel data not fully consumed, unread size: " + r32);
    }

    public static boolean zzc(Parcel r02) {
        if (r02.readInt() == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public static HashMap zza(Parcel r1) {
        return r1.readHashMap(zza);
    }

    public static void zzb(Parcel r1, Parcelable r2) {
        if (r2 != null) goto L5;
        r1.writeInt(0);
        return;
    L5:
        r1.writeInt(1);
        r2.writeToParcel(r1, 1);
    }

    public static void zza(Parcel r02, boolean r1) {
        r02.writeInt(r1 ? 1 : 0);
    }

    public static void zza(Parcel r2, Parcelable r3) {
        if (r3 != null) goto L6;
        r2.writeInt(0);
        return;
    L6:
        r2.writeInt(1);
        r3.writeToParcel(r2, 0);
    }

    public static void zza(Parcel r02, IInterface r1) {
        if (r1 != null) goto L5;
        r02.writeStrongBinder(null);
        return;
    L5:
        r02.writeStrongBinder(r1.asBinder());
    }
}
