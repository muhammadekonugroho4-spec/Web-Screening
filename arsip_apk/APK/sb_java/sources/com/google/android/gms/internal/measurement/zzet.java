package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzed;

/* loaded from: classes5.dex */
final class zzet extends zzed.zzb {
    private final /* synthetic */ Runnable zzc;
    private final /* synthetic */ zzed zzd;

    public zzet(zzed r1, Runnable r2) {
        this.zzc = r2;
        this.zzd = r1;
        super(r1);
    }

    @Override // com.google.android.gms.internal.measurement.zzed.zzb
    public final void zza() throws RemoteException {
        ((zzdl) Preconditions.checkNotNull(zzed.zza(this.zzd))).retrieveAndUploadBatches(new zzew(this, this.zzc));
    }
}
