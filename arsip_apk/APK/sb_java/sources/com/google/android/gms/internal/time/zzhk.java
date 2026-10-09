package com.google.android.gms.internal.time;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
enum zzhk extends Enum implements Executor {
    public static final zzhk zza = null;
    private static final /* synthetic */ zzhk[] zzb = null;

    static {
        zzhk r02 = new zzhk("INSTANCE", 0);
        zza = r02;
        zzb = new zzhk[]{r02};
    }

    zzhk(String r1, int r2) {
    }

    public static zzhk[] values() {
        return (zzhk[]) zzb.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r1) {
        r1.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
