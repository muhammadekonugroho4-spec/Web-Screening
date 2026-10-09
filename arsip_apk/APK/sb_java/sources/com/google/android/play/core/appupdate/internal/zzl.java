package com.google.android.play.core.appupdate.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.play.core.listener.StateUpdatedListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class zzl {
    protected final zzm zza;
    protected final Set zzb;
    private final IntentFilter zzc;
    private final Context zzd;
    private zzk zze;
    private volatile boolean zzf;

    public zzl(zzm r2, IntentFilter r3, Context r4) {
        this.zzb = new HashSet();
        this.zze = null;
        this.zzf = false;
        this.zza = r2;
        this.zzc = r3;
        this.zzd = zzz.zza(r4);
    }

    private final void zze() {
        if (this.zzb.isEmpty() == true) goto L11;
        if (this.zze != null) goto L11;
        zzk r02 = new zzk(this, null);
        this.zze = r02;
        if (Build.VERSION.SDK_INT < 33) goto L9;
        this.zzd.registerReceiver(r02, this.zzc, 2);
        goto L11
    L9:
        this.zzd.registerReceiver(r02, this.zzc);
    L11:
        if (this.zzb.isEmpty() == false) goto L16;
        zzk r03 = this.zze;
        if (r03 == null) goto L17;
        this.zzd.unregisterReceiver(r03);
        this.zze = null;
        return;
    L17:
        return;
    }

    public abstract void zza(Context r1, Intent r2);

    public final synchronized void zzb(StateUpdatedListener r4) {
        monitor-enter(this);
        this.zza.zzd("registerListener", new Object[0]);     // Catch: Throwable -> L6
        zzac.zza(r4, "Registered Play Core listener should not be null.");     // Catch: Throwable -> L6
        this.zzb.add(r4);     // Catch: Throwable -> L6
        zze();     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public final synchronized void zzc(StateUpdatedListener r4) {
        monitor-enter(this);
        this.zza.zzd("unregisterListener", new Object[0]);     // Catch: Throwable -> L6
        zzac.zza(r4, "Unregistered Play Core listener should not be null.");     // Catch: Throwable -> L6
        this.zzb.remove(r4);     // Catch: Throwable -> L6
        zze();     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    public final synchronized void zzd(Object r3) {
        monitor-enter(this);
        Iterator r02 = new HashSet(this.zzb).iterator();     // Catch: Throwable -> L8
    L4:
        if (r02.hasNext() == false) goto L10;
        ((StateUpdatedListener) r02.next()).onStateUpdate(r3);     // Catch: Throwable -> L8
        goto L4
    L10:
        monitor-exit(this);
        return;
    L8:
        th = move-exception;
        throw th;
    }
}
