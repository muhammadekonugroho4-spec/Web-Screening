package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes5.dex */
public interface RemoteCall<T, U> {
    @KeepForSdk
    void accept(T r1, U r2) throws RemoteException;
}
