package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public abstract class zaj extends com.google.android.gms.internal.base.zab implements zak {
    public zaj() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int r1, Parcel r2, Parcel r3, int r4) throws RemoteException {
        if (r1 != 1) goto L6;
        int r12 = r2.readInt();
        com.google.android.gms.internal.base.zac.zab(r2);
        zab(r12);
        return true;
    L6:
        return false;
    }
}
