package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzea extends zzeb {
    final /* synthetic */ zzei zza;
    private int zzb;
    private final int zzc;

    public zzea(zzei r2) {
        Objects.requireNonNull(r2);
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

    @Override // com.google.android.gms.internal.play_billing.zzed
    public final byte zza() {
        int r02 = this.zzb;
        if (r02 >= this.zzc) goto L7;
        this.zzb = r02 + 1;
        return this.zza.zzb(r02);
    L7:
        throw new NoSuchElementException();
    }
}
