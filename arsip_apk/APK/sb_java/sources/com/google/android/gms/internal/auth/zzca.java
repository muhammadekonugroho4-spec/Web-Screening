package com.google.android.gms.internal.auth;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes5.dex */
final class zzca extends ContentObserver {
    public zzca(Handler r1) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean r2) {
        zzcb.zzb().set(true);
    }
}
