package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public final class l extends a implements n {
    public l(IBinder r2) {
        super(r2, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.n
    public final void c(Bundle r2, r r3) throws RemoteException {
        Parcel r02 = a();
        c.c(r02, r2);
        r02.writeStrongBinder(r3);
        b(3, r02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.n
    public final void d(Bundle r2, p r3) throws RemoteException {
        Parcel r02 = a();
        c.c(r02, r2);
        r02.writeStrongBinder(r3);
        b(2, r02);
    }
}
