package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes5.dex */
abstract class zzs {
    final int zza;
    final TaskCompletionSource zzb;
    final int zzc;
    final Bundle zzd;

    public zzs(int r2, int r3, Bundle r4) {
        this.zzb = new TaskCompletionSource();
        this.zza = r2;
        this.zzc = r3;
        this.zzd = r4;
    }

    public final String toString() {
        return "Request { what=" + this.zzc + " id=" + this.zza + " oneWay=" + zzb() + "}";
    }

    public abstract void zza(Bundle r1);

    public abstract boolean zzb();

    public final void zzc(zzt r6) {
        if (Log.isLoggable("MessengerIpcClient", 3) == false) goto L5;
        Log.d("MessengerIpcClient", "Failing " + toString() + " with " + r6.toString());
    L5:
        this.zzb.setException(r6);
    }

    public final void zzd(Object r6) {
        if (Log.isLoggable("MessengerIpcClient", 3) == false) goto L5;
        Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(r6));
    L5:
        this.zzb.setResult(r6);
    }
}
