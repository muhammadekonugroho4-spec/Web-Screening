package com.google.android.gms.internal.time;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class zzc {
    public static final /* synthetic */ int zza = 0;

    static {
        zzc.class.getClassLoader();
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
}
