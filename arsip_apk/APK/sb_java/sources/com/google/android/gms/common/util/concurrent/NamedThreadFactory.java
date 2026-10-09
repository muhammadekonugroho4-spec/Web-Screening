package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

@KeepForSdk
/* loaded from: classes5.dex */
public class NamedThreadFactory implements ThreadFactory {
    private final String zza;
    private final ThreadFactory zzb;

    @KeepForSdk
    public NamedThreadFactory(String r2) {
        this.zzb = Executors.defaultThreadFactory();
        Preconditions.checkNotNull(r2, "Name must not be null");
        this.zza = r2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r3) {
        zza r02 = new zza(r3, 0);
        Thread r32 = this.zzb.newThread(r02);
        r32.setName(this.zza);
        return r32;
    }
}
