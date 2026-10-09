package com.google.android.recaptcha.internal;

import com.google.common.primitives.UnsignedBytes;
import java.io.Serializable;

/* loaded from: classes5.dex */
final class zzju extends zzjv implements Serializable {
    final byte[] zza;

    public zzju(byte[] r1) {
        r1.getClass();
        this.zza = r1;
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    public final int zza() {
        byte[] r02 = this.zza;
        int r1 = r02.length;
        if (r1 < 4) goto L7;
        int r12 = r02[0] & UnsignedBytes.MAX_VALUE;
        int r2 = r02[1] & UnsignedBytes.MAX_VALUE;
        int r3 = r02[2] & UnsignedBytes.MAX_VALUE;
        int r03 = (r02[3] & UnsignedBytes.MAX_VALUE) << 24;
        return r03 | ((r12 | (r2 << 8)) | (r3 << 16));
    L7:
        throw new IllegalStateException(zzji.zza("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", new Object[]{Integer.valueOf(r1)}));
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    public final int zzb() {
        return this.zza.length * 8;
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    public final boolean zzc(zzjv r7) {
        if (this.zza.length != r7.zze().length) goto L13;
        boolean r3 = true;
        int r1 = 0;
    L5:
        byte[] r4 = this.zza;
        if (r1 >= r4.length) goto L12;
        if (r4[r1] != r7.zze()[r1]) goto L10;
        boolean r42 = true;
    L11:
        r3 = r3 & r42;
        r1 = r1 + 1;
        goto L5
    L10:
        r42 = false;
        goto L11
    L12:
        return r3;
    L13:
        return false;
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    public final byte[] zzd() {
        return (byte[]) this.zza.clone();
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    public final byte[] zze() {
        return this.zza;
    }
}
