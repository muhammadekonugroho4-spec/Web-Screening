package com.google.android.play.core.appupdate;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.install.InstallState;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class zzc extends com.google.android.play.core.appupdate.internal.zzl {
    public zzc(Context r4) {
        super(new com.google.android.play.core.appupdate.internal.zzm("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), r4);
    }

    @Override // com.google.android.play.core.appupdate.internal.zzl
    public final void zza(Context r4, Intent r5) {
        if (r4.getPackageName().equals(r5.getStringExtra("package.name")) == true) goto L6;
        this.zza.zza("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", new Object[]{r5.getStringExtra("package.name")});
        return;
    L6:
        this.zza.zza("List of extras in received intent:", new Object[0]);
        Iterator<String> r42 = r5.getExtras().keySet().iterator();
    L8:
        if (r42.hasNext() == false) goto L10;
        String r02 = r42.next();
        this.zza.zza("Key: %s; value: %s", new Object[]{r02, r5.getExtras().get(r02)});
        goto L8
    L10:
        InstallState r43 = InstallState.zzb(r5, this.zza);
        this.zza.zza("ListenerRegistryBroadcastReceiver.onReceive: %s", new Object[]{r43});
        zzd(r43);
    }
}
