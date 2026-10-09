package com.google.android.play.core.review.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public class zza implements IInterface {
    private final IBinder zza;
    private final String zzb;

    public zza(IBinder r1, String r2) {
        this.zza = r1;
        this.zzb = "com.google.android.play.core.inappreview.protocol.IInAppReviewService";
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.zza;
    }

    public final Parcel zza() {
        Parcel r02 = Parcel.obtain();
        r02.writeInterfaceToken(this.zzb);
        return r02;
    }

    public final void zzb(int r4, Parcel r5) throws RemoteException {
        this.zza.transact(2, r5, null, 1);     // Catch: Throwable -> L5
        r5.recycle();
        return;
    L5:
        th = move-exception;
        r5.recycle();
        throw th;
    }
}
