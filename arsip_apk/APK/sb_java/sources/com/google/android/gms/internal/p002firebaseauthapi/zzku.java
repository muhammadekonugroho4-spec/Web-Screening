package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes5.dex */
final class zzku implements zzll {
    private final int zza;

    public zzku(int r4) throws InvalidAlgorithmParameterException {
        if (r4 != 16) goto L5;
    L9:
        this.zza = r4;
        return;
    L5:
        if (r4 == 32) goto L9;
        throw new InvalidAlgorithmParameterException("Unsupported key length: " + r4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzll
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzll
    public final int zzb() {
        return 12;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzll
    public final byte[] zzc() throws GeneralSecurityException {
        int r02 = this.zza;
        if (r02 == 16) goto L11;
        if (r02 != 32) goto L9;
        return zzlu.zzj;
    L9:
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    L11:
        return zzlu.zzi;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzll
    public final byte[] zza(byte[] r3, byte[] r4, byte[] r5, int r6, byte[] r7) throws GeneralSecurityException {
        if (r3.length != this.zza) goto L7;
        return new zzhk(r3).zza(r4, r5, r6, r7);
    L7:
        throw new InvalidAlgorithmParameterException("Unexpected key length: " + r3.length);
    }
}
