package com.google.android.gms.common.util.concurrent;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@KeepForSdk
/* loaded from: classes5.dex */
public class NumberedThreadFactory implements ThreadFactory {
    private final String zza;
    private final AtomicInteger zzb;
    private final ThreadFactory zzc;

    @KeepForSdk
    public NumberedThreadFactory(String r2) {
        this.zzb = new AtomicInteger();
        this.zzc = Executors.defaultThreadFactory();
        Preconditions.checkNotNull(r2, "Name must not be null");
        this.zza = r2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r4) {
        Thread r42 = this.zzc.newThread(new zza(r4, 0));
        r42.setName(this.zza + Constants.AES_PREFIX + this.zzb.getAndIncrement() + Constants.AES_SUFFIX);
        return r42;
    }
}
