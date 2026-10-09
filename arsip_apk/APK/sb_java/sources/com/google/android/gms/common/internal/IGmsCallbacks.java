package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public interface IGmsCallbacks extends IInterface {
    void onPostInitComplete(int r1, IBinder r2, Bundle r3) throws RemoteException;

    void zzb(int r1, Bundle r2) throws RemoteException;

    void zzc(int r1, IBinder r2, zzk r3) throws RemoteException;
}
