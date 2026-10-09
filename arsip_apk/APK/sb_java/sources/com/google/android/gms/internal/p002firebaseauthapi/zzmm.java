package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* loaded from: classes5.dex */
final class zzmm implements zzbe {
    private final SecretKey zza;

    public zzmm(String r3, KeyStore r4) throws GeneralSecurityException {
        SecretKey r42 = (SecretKey) r4.getKey(r3, null);
        this.zza = r42;
        if (r42 == null) goto L6;
        return;
    L6:
        throw new InvalidKeyException("Keystore cannot load the key with ID: " + r3);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zza(byte[] r6, byte[] r7) throws GeneralSecurityException {
        if (r6.length < 28) goto L7;
        GCMParameterSpec r02 = new GCMParameterSpec(128, r6, 0, 12);
        Cipher r1 = Cipher.getInstance("AES/GCM/NoPadding");
        r1.init(2, this.zza, r02);
        r1.updateAAD(r7);
        return r1.doFinal(r6, 12, r6.length - 12);
    L7:
        throw new BadPaddingException("ciphertext too short");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zzb(byte[] r8, byte[] r9) throws GeneralSecurityException {
        if (r8.length > 2147483619) goto L11;
        byte[] r5 = new byte[r8.length + 28];
        Cipher r1 = Cipher.getInstance("AES/GCM/NoPadding");
        r1.init(1, this.zza);
        r1.updateAAD(r9);
        r1.doFinal(r8, 0, r8.length, r5, 12);
        byte[] r82 = r1.getIV();
        if (r82.length != 12) goto L9;
        System.arraycopy(r82, 0, r5, 0, 12);
        return r5;
    L9:
        throw new GeneralSecurityException("IV has unexpected length");
    L11:
        throw new GeneralSecurityException("plaintext too long");
    }
}
