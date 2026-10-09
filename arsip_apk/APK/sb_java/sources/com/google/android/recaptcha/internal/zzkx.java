package com.google.android.recaptcha.internal;

import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
final class zzkx extends zzky {
    final /* synthetic */ zzle zza;
    private int zzb;
    private final int zzc;

    public zzkx(zzle r2) {
        this.zza = r2;
        this.zzb = 0;
        this.zzc = r2.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zzb >= this.zzc) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // com.google.android.recaptcha.internal.zzla
    public final byte zza() {
        int r02 = this.zzb;
        if (r02 >= this.zzc) goto L7;
        this.zzb = r02 + 1;
        return this.zza.zzb(r02);
    L7:
        throw new NoSuchElementException();
    }
}
