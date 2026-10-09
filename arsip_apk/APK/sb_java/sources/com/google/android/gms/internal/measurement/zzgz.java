package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes5.dex */
final class zzgz extends ContentObserver {
    private final /* synthetic */ zzgx zza;

    public zzgz(zzgx r1, Handler r2) {
        this.zza = r1;
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean r2) {
        zzgx.zza(this.zza).set(true);
    }
}
