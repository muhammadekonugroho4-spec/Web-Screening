package com.google.android.gms.internal.p002firebaseauthapi;

import com.huawei.hms.framework.common.ContainerUtils;

/* loaded from: classes5.dex */
final class zzap {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzap(Object r1, Object r2, Object r3) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r3;
    }

    public final IllegalArgumentException zza() {
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(this.zza) + ContainerUtils.KEY_VALUE_DELIMITER + String.valueOf(this.zzb) + " and " + String.valueOf(this.zza) + ContainerUtils.KEY_VALUE_DELIMITER + String.valueOf(this.zzc));
    }
}
