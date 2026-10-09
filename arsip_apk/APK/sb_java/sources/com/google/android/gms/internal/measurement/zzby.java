package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes5.dex */
public abstract class zzby extends zzbx implements zzbz {
    public static zzbz zza(IBinder r2) {
        if (r2 != null) goto L5;
        return null;
    L5:
        IInterface r02 = r2.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        if ((r02 instanceof zzbz) == false) goto L10;
        return (zzbz) r02;
    L10:
        return new zzca(r2);
    }
}
