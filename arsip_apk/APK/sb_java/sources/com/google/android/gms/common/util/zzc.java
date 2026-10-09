package com.google.android.gms.common.util;

import android.os.StrictMode;

/* loaded from: classes5.dex */
public final class zzc {
    public static StrictMode.VmPolicy zza() {
        StrictMode.VmPolicy r02 = StrictMode.getVmPolicy();
        if (PlatformVersion.isAtLeastS() == false) goto L5;
        StrictMode.setVmPolicy(zzb.zza(new StrictMode.VmPolicy.Builder(r02)).build());
    L5:
        return r02;
    }
}
