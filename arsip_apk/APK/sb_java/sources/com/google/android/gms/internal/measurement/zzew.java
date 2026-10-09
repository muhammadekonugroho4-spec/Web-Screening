package com.google.android.gms.internal.measurement;

/* loaded from: classes5.dex */
final class zzew extends zzdu {
    private final /* synthetic */ Runnable zza;

    public zzew(zzet r1, Runnable r2) {
        this.zza = r2;
    }

    @Override // com.google.android.gms.internal.measurement.zzdr
    public final void a_() {
        this.zza.run();
    }
}
