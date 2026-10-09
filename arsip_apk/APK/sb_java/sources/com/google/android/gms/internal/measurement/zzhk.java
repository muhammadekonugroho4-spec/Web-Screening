package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes5.dex */
final class zzhk extends ContentObserver {
    private final /* synthetic */ zzhi zza;

    public zzhk(zzhi r1, Handler r2) {
        this.zza = r1;
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean r1) {
        this.zza.zzc();
    }
}
