package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public abstract class zzaj extends zzb implements zzak {
    public zzaj() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int r1, Parcel r2, Parcel r3, int r4) throws RemoteException {
        if (r1 != 1) goto L5;
        zzb(r2.readInt(), r2.createStringArray());
    L13:
        return true;
    L5:
        if (r1 != 2) goto L7;
        zzc(r2.readInt(), r2.createStringArray());
        goto L13
    L7:
        if (r1 == 3) goto L10;
        return false;
    L10:
        zzd(r2.readInt(), (PendingIntent) zzc.zzb(r2, PendingIntent.CREATOR));
        goto L13
    }
}
