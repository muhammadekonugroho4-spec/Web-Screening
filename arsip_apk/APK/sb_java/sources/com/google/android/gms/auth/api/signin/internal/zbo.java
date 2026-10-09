package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public abstract class zbo extends com.google.android.gms.internal.p000authapi.zbb implements zbp {
    public zbo() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int r1, Parcel r2, Parcel r3, int r4) throws RemoteException {
        if (r1 != 1) goto L5;
        zbc();
    L10:
        return true;
    L5:
        if (r1 == 2) goto L8;
        return false;
    L8:
        zbb();
        goto L10
    }
}
