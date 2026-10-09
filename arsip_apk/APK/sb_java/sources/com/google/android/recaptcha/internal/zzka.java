package com.google.android.recaptcha.internal;

import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes5.dex */
final class zzka extends zzjr {
    private final MessageDigest zza;
    private final int zzb;
    private boolean zzc;

    public /* synthetic */ zzka(MessageDigest r1, int r2, zzkb r3) {
        this.zza = r1;
        this.zzb = r2;
    }

    private final void zzc() {
        zzjf.zze(!this.zzc, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // com.google.android.recaptcha.internal.zzjr
    public final void zza(byte[] r2, int r3, int r4) {
        zzc();
        this.zza.update(r2, 0, r4);
    }

    @Override // com.google.android.recaptcha.internal.zzjx
    public final zzjv zzb() {
        zzc();
        this.zzc = true;
        int r02 = this.zzb;
        if (r02 != this.zza.getDigestLength()) goto L6;
        byte[] r03 = this.zza.digest();
        int r1 = zzjv.zzb;
        return new zzju(r03);
    L6:
        byte[] r04 = Arrays.copyOf(this.zza.digest(), r02);
        int r12 = zzjv.zzb;
        return new zzju(r04);
    }
}
