package com.google.android.gms.internal.auth;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes5.dex */
final class zzcf extends ContentObserver {
    final /* synthetic */ zzcg zza;

    public zzcf(zzcg r1, Handler r2) {
        this.zza = r1;
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean r1) {
        this.zza.zze();
    }
}
