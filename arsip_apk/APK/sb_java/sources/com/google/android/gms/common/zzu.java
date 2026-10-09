package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
final class zzu extends zzw {
    private final Callable zze;

    public /* synthetic */ zzu(Callable r8, zzv r9) {
        super(false, 1, 5, null, null, null);
        this.zze = r8;
    }

    @Override // com.google.android.gms.common.zzw
    public final String zza() {
        return (String) this.zze.call();
    L4:
        e = move-exception;
        throw new RuntimeException(e);
    }
}
