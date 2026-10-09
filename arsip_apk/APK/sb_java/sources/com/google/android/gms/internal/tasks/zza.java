package com.google.android.gms.internal.tasks;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes5.dex */
public final class zza extends Handler {
    private final Looper zza;

    public zza() {
        this.zza = Looper.getMainLooper();
    }

    public zza(Looper r1) {
        super(r1);
        this.zza = Looper.getMainLooper();
    }
}
