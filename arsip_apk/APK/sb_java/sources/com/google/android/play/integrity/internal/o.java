package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public abstract class o extends b implements p {
    public o() {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
    }

    @Override // com.google.android.play.integrity.internal.b
    public final boolean a(int r1, Parcel r2, Parcel r3, int r4) throws RemoteException {
        if (r1 != 2) goto L6;
        Bundle r12 = (Bundle) c.a(r2, Bundle.CREATOR);
        c.b(r2);
        b(r12);
        return true;
    L6:
        return false;
    }
}
