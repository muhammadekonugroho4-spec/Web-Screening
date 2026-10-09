package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public abstract class zzgd extends com.google.android.gms.internal.measurement.zzbx implements zzga {
    public zzgd() {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // com.google.android.gms.internal.measurement.zzbx
    public final boolean zza(int r1, Parcel r2, Parcel r3, int r4) throws RemoteException {
        if (r1 != 2) goto L6;
        ArrayList r12 = r2.createTypedArrayList(zzog.CREATOR);
        com.google.android.gms.internal.measurement.zzbw.zzb(r2);
        zza(r12);
        return true;
    L6:
        return false;
    }
}
