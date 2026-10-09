package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes5.dex */
public final class zzpf {
    final Context zza;

    public zzpf(Context r1) {
        Preconditions.checkNotNull(r1);
        Context r12 = r1.getApplicationContext();
        Preconditions.checkNotNull(r12);
        this.zza = r12;
    }
}
