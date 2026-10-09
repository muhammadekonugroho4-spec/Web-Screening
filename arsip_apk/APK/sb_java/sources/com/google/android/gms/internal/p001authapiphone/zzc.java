package com.google.android.gms.internal.p001authapiphone;

import android.os.BadParcelableException;
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

    public static void zzc(Parcel r02, IInterface r1) {
        r02.writeStrongBinder(r1.asBinder());
    }
}
