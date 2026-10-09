package com.google.android.gms.measurement.internal;

import android.text.TextUtils;

/* loaded from: classes5.dex */
final class zzd {
    private final zzjm zza;

    public zzd(zzjm r1) {
        this.zza = r1;
    }

    public static zzd zza(String r2) {
        if (TextUtils.isEmpty(r2) == false) goto L5;
    L8:
        zzjm r22 = zzjm.zza;
    L10:
        return new zzd(r22);
    L5:
        if (r2.length() > 1) goto L8;
        r22 = zzjj.zza(r2.charAt(0));
        goto L10
    }

    public final String zzb() {
        return String.valueOf(zzjj.zza(this.zza));
    }

    public final zzjm zza() {
        return this.zza;
    }
}
