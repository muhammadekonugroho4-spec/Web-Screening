package com.google.android.gms.internal.cloudmessaging;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes5.dex */
public class zzf extends Handler {
    private final Looper zza;

    public zzf() {
        this.zza = Looper.getMainLooper();
    }

    public zzf(Looper r1) {
        super(r1);
        this.zza = Looper.getMainLooper();
    }

    public zzf(Looper r1, Handler.Callback r2) {
        super(r1, r2);
        this.zza = Looper.getMainLooper();
    }
}
