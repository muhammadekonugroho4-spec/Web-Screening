package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdr;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* loaded from: classes5.dex */
final class zzky implements zzla {
    private final int zza;

    public zzky(zzdr r3) throws GeneralSecurityException {
        if (r3.zzb() != 12) goto L15;
        if (r3.zzd() != 16) goto L13;
        if (r3.zzf() != zzdr.zza.zzc) goto L11;
        this.zza = r3.zzc();
        return;
    L11:
        throw new GeneralSecurityException("invalid variant");
    L13:
        throw new GeneralSecurityException("invalid tag size");
    L15:
        throw new GeneralSecurityException("invalid IV size");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzla
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzla
    public final byte[] zza(byte[] r6, byte[] r7, int r8) throws GeneralSecurityException {
        if (r7.length < r8) goto L15;
        if (r6.length != this.zza) goto L13;
        SecretKey r62 = zzgl.zzb(r6);
        int r2 = r8 + 12;
        if (r7.length < (r8 + 28)) goto L11;
        AlgorithmParameterSpec r1 = zzgl.zza(r7, r8, 12);
        Cipher r3 = zzgl.zza();
        r3.init(2, r62, r1);
        return r3.doFinal(r7, r2, (r7.length - r8) - 12);
    L11:
        throw new GeneralSecurityException("ciphertext too short");
    L13:
        throw new GeneralSecurityException("invalid key size");
    L15:
        throw new GeneralSecurityException("ciphertext too short");
    }
}
