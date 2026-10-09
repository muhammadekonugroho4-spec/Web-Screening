package com.google.firebase.auth.internal;

/* loaded from: classes6.dex */
final class zzm extends zzi {
    private String zza;
    private String zzb;
    private String zzc;

    public zzm() {
    }

    @Override // com.google.firebase.auth.internal.zzi
    public final zzi zza(String r1) {
        this.zzb = r1;
        return this;
    }

    @Override // com.google.firebase.auth.internal.zzi
    public final zzi zzb(String r1) {
        this.zzc = r1;
        return this;
    }

    @Override // com.google.firebase.auth.internal.zzi
    public final zzi zzc(String r1) {
        this.zza = r1;
        return this;
    }

    @Override // com.google.firebase.auth.internal.zzi
    public final zzj zza() {
        return new zzn(this.zza, this.zzb, this.zzc, null);
    }
}
