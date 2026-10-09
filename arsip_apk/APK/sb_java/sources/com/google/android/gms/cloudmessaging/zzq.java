package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzq {
    private final Messenger zza;
    private final zzd zzb;

    public zzq(IBinder r4) throws RemoteException {
        String r02 = r4.getInterfaceDescriptor();
        if (Objects.equals(r02, "android.os.IMessenger") == false) goto L7;
        this.zza = new Messenger(r4);
        this.zzb = null;
        return;
    L7:
        if (Objects.equals(r02, IMessengerCompat.DESCRIPTOR) == false) goto L10;
        this.zzb = new zzd(r4);
        this.zza = null;
        return;
    L10:
        Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(r02)));
        throw new RemoteException();
    }

    public final void zza(Message r2) throws RemoteException {
        Messenger r02 = this.zza;
        if (r02 == null) goto L6;
        r02.send(r2);
        return;
    L6:
        zzd r03 = this.zzb;
        if (r03 == null) goto L11;
        r03.zzb(r2);
        return;
    L11:
        throw new IllegalStateException("Both messengers are null");
    }
}
