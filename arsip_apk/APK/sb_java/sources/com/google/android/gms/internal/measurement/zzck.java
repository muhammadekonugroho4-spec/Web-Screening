package com.google.android.gms.internal.measurement;

import java.io.File;

/* loaded from: classes5.dex */
final class zzck implements zzci {
    public zzck() {
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final String zza(String r1, zzco r2, zzcl r3) {
        return r1;
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final /* synthetic */ String zzb(String r1, zzco r2, zzcl r3) {
        return zzch.zza(this, r1, r2, r3);
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final /* synthetic */ String zza(String r2) {
        return zza(r2, zzco.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final /* synthetic */ String zza(File r2, String r3) {
        return zza(r2, r3, zzco.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final /* synthetic */ String zza(String r2, zzco r3) {
        return zzb(r2, r3, zzcl.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final /* synthetic */ String zza(File r2, String r3, zzco r4) {
        return zza(new File(r2, r3).getPath(), r4);
    }
}
