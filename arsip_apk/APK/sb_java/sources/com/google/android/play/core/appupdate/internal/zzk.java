package com.google.android.play.core.appupdate.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes5.dex */
final class zzk extends BroadcastReceiver {
    final /* synthetic */ zzl zza;

    public /* synthetic */ zzk(zzl r1, zzj r2) {
        this.zza = r1;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context r2, Intent r3) {
        this.zza.zza(r2, r3);
    }
}
