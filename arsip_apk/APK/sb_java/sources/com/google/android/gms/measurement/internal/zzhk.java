package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes5.dex */
public final class zzhk {
    private final zza zza;

    public interface zza {
        void doStartService(Context r1, Intent r2);
    }

    public zzhk(zza r1) {
        Preconditions.checkNotNull(r1);
        this.zza = r1;
    }

    public final void zza(Context r4, Intent r5) {
        zzgo r02 = zzic.zza(r4, null, null).zzj();
        if (r5 != null) goto L6;
        r02.zzr().zza("Receiver called with null intent");
        return;
    L6:
        String r52 = r5.getAction();
        r02.zzq().zza("Local receiver got", r52);
        if ("com.google.android.gms.measurement.UPLOAD".equals(r52) == false) goto L11;
        Intent r53 = new Intent().setClassName(r4, "com.google.android.gms.measurement.AppMeasurementService");
        r53.setAction("com.google.android.gms.measurement.UPLOAD");
        r02.zzq().zza("Starting wakeful intent.");
        this.zza.doStartService(r4, r53);
        return;
    L11:
        if ("com.android.vending.INSTALL_REFERRER".equals(r52) == false) goto L14;
        r02.zzr().zza("Install Referrer Broadcasts are deprecated");
        return;
    }
}
