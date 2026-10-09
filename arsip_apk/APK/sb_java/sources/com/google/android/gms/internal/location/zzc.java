package com.google.android.gms.internal.location;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class zzc {
    private static final ClassLoader zza = null;

    static {
        zza = zzc.class.getClassLoader();
    }

    private zzc() {
    }

    public static void zza(Parcel r02, boolean r1) {
        r02.writeInt(r1 ? 1 : 0);
    }

    public static <T extends Parcelable> T zzb(Parcel r1, Parcelable.Creator<T> r2) {
        if (r1.readInt() != 0) goto L7;
        return null;
    L7:
        return r2.createFromParcel(r1);
    }

    public static void zzc(Parcel r2, Parcelable r3) {
        if (r3 != null) goto L6;
        r2.writeInt(0);
        return;
    L6:
        r2.writeInt(1);
        r3.writeToParcel(r2, 0);
    }

    public static void zzd(Parcel r02, IInterface r1) {
        if (r1 != null) goto L5;
        r02.writeStrongBinder(null);
        return;
    L5:
        r02.writeStrongBinder(r1.asBinder());
    }
}
