package com.google.android.gms.internal.time;

import android.util.Log;

/* loaded from: classes5.dex */
public abstract class zzfs extends zzep {
    private final String zza;

    public zzfs(String r1) {
        this.zza = r1;
    }

    @Override // com.google.android.gms.internal.time.zzep
    public void zza(RuntimeException r2, zzen r3) {
        Log.e("AbstractAndroidBackend", "Internal logging error", r2);
    }

    public String zzd() {
        return this.zza;
    }
}
