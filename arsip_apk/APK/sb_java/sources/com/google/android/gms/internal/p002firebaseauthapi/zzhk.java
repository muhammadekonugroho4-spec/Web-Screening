package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzij;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* loaded from: classes5.dex */
public final class zzhk {
    private static final zzij.zza zza = null;
    private final SecretKey zzb;

    static {
        zza = zzij.zza.zzb;
    }

    public zzhk(byte[] r2) throws GeneralSecurityException {
        if (zza.zza() == false) goto L7;
        this.zzb = zzgl.zzb(r2);
        return;
    L7:
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    public final byte[] zza(byte[] r4, byte[] r5, int r6, byte[] r7) throws GeneralSecurityException {
        if (r4.length != 12) goto L16;
        if (r5.length < (r6 + 16)) goto L14;
        AlgorithmParameterSpec r42 = zzgl.zza(r4);
        Cipher r02 = zzgl.zza();
        r02.init(2, this.zzb, r42);
        if (r7 == null) goto L12;
        if (r7.length == 0) goto L12;
        r02.updateAAD(r7);
    L12:
        return r02.doFinal(r5, r6, r5.length - r6);
    L14:
        throw new GeneralSecurityException("ciphertext too short");
    L16:
        throw new GeneralSecurityException("iv is wrong size");
    }

    public final byte[] zzb(byte[] r7, byte[] r8, int r9, byte[] r10) throws GeneralSecurityException {
        if (r7.length != 12) goto L19;
        AlgorithmParameterSpec r72 = zzgl.zza(r7);
        Cipher r02 = zzgl.zza();
        r02.init(1, this.zzb, r72);
        if (r10 != null) goto L7;
    L9:
        int r73 = r02.getOutputSize(r8.length);
        if (r73 > (Integer.MAX_VALUE - r9)) goto L17;
        byte[] r4 = new byte[r9 + r73];
        if (r02.doFinal(r8, 0, r8.length, r4, r9) != r73) goto L15;
        return r4;
    L15:
        throw new GeneralSecurityException("not enough data written");
    L17:
        throw new GeneralSecurityException("plaintext too long");
    L7:
        if (r10.length == 0) goto L9;
        r02.updateAAD(r10);
        goto L9
    L19:
        throw new GeneralSecurityException("iv is wrong size");
    }
}
