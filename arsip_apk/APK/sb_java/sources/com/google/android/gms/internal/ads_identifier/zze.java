package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes5.dex */
public abstract class zze extends zzb implements zzf {
    public static zzf zza(IBinder r2) {
        if (r2 != null) goto L5;
        return null;
    L5:
        IInterface r02 = r2.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        if ((r02 instanceof zzf) == false) goto L10;
        return (zzf) r02;
    L10:
        return new zzd(r2);
    }
}
