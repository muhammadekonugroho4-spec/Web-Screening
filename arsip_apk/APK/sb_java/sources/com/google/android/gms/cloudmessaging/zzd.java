package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: classes5.dex */
public final class zzd implements Parcelable {
    public static final Parcelable.Creator<zzd> CREATOR = null;
    Messenger zza;
    IMessengerCompat zzb;

    static {
        CREATOR = new zzb();
    }

    public zzd(IBinder r2) {
        this.zza = new Messenger(r2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object r3) {
        if (r3 != null) goto L8;
        return false;
    L8:
        return zza().equals(((zzd) r3).zza());
    L7:
        return false;
    }

    public final int hashCode() {
        return zza().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        Messenger r22 = this.zza;
        if (r22 == null) goto L6;
        r1.writeStrongBinder(r22.getBinder());
        return;
    L6:
        r1.writeStrongBinder(this.zzb.asBinder());
    }

    public final IBinder zza() {
        Messenger r02 = this.zza;
        if (r02 == null) goto L7;
        return r02.getBinder();
    L7:
        return this.zzb.asBinder();
    }

    public final void zzb(Message r2) throws RemoteException {
        Messenger r02 = this.zza;
        if (r02 == null) goto L6;
        r02.send(r2);
        return;
    L6:
        this.zzb.send(r2);
    }
}
