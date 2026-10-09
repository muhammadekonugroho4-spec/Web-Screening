package com.google.android.play.core.appupdate.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public abstract class zzg extends zzb implements zzh {
    public zzg() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    @Override // com.google.android.play.core.appupdate.internal.zzb
    public final boolean zza(int r1, Parcel r2, Parcel r3, int r4) throws RemoteException {
        if (r1 != 2) goto L5;
        Bundle r12 = (Bundle) zzc.zza(r2, Bundle.CREATOR);
        zzc.zzb(r2);
        zzc(r12);
        return true;
    L5:
        if (r1 == 3) goto L8;
        return false;
    L8:
        Bundle r13 = (Bundle) zzc.zza(r2, Bundle.CREATOR);
        zzc.zzb(r2);
        zzb(r13);
        return true;
    }
}
