package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public abstract class zzy extends zzaq implements zzz {
    public zzy() {
        super("com.android.vending.billing.IInAppBillingCreateExternalPaymentReportingDetailsCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.zzaq
    public final boolean zzb(int r1, Parcel r2, Parcel r3, int r4) throws RemoteException {
        if (r1 != 1) goto L6;
        Bundle r12 = (Bundle) zzar.zza(r2, Bundle.CREATOR);
        zzar.zzb(r2);
        zza(r12);
        return true;
    L6:
        return false;
    }
}
