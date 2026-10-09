package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.zzhk;

/* loaded from: classes5.dex */
public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements zzhk.zza {
    private zzhk zza;

    public AppMeasurementReceiver() {
    }

    public final BroadcastReceiver.PendingResult doGoAsync() {
        return goAsync();
    }

    @Override // com.google.android.gms.measurement.internal.zzhk.zza
    public final void doStartService(Context r1, Intent r2) {
        WakefulBroadcastReceiver.startWakefulService(r1, r2);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context r2, Intent r3) {
        if (this.zza != null) goto L5;
        this.zza = new zzhk(this);
    L5:
        this.zza.zza(r2, r3);
    }
}
