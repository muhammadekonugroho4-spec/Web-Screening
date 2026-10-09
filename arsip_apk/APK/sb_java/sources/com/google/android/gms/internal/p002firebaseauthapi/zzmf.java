package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.perf.util.Constants;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* loaded from: classes5.dex */
public final class zzmf implements zzmd {
    private static final byte[] zza = null;
    private static final byte[] zzb = null;
    private final Provider zzc;

    static {
        zza = new byte[]{48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 110, 4, 34, 4, 32};
        zzb = new byte[]{48, 42, 48, 5, 6, 3, 43, 101, 110, 3, 33, 0};
    }

    private zzmf(Provider r1) {
        this.zzc = r1;
    }

    public static zzmd zzb() throws GeneralSecurityException {
        Provider r02 = zzmr.zza();
        if (r02 == null) goto L7;
        KeyFactory.getInstance("XDH", r02);
        KeyAgreement.getInstance("XDH", r02);
        zzmf r1 = new zzmf(r02);
        r1.zza();
        return r1;
    L7:
        throw new GeneralSecurityException("Conscrypt is not available.");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmd
    public final zzmc zza() throws GeneralSecurityException {
        KeyPairGenerator r02 = KeyPairGenerator.getInstance("XDH", this.zzc);
        r02.initialize(Constants.MAX_HOST_LENGTH);
        KeyPair r03 = r02.generateKeyPair();
        byte[] r1 = r03.getPrivate().getEncoded();
        int r2 = r1.length;
        byte[] r3 = zza;
        if (r2 != (r3.length + 32)) goto L19;
        if (zzpy.zza(r3, r1) == false) goto L17;
        byte[] r12 = Arrays.copyOfRange(r1, r3.length, r1.length);
        byte[] r04 = r03.getPublic().getEncoded();
        int r22 = r04.length;
        byte[] r32 = zzb;
        if (r22 != (r32.length + 32)) goto L15;
        if (zzpy.zza(r32, r04) == false) goto L13;
        return new zzmc(r12, Arrays.copyOfRange(r04, r32.length, r04.length));
    L13:
        throw new GeneralSecurityException("Invalid encoded public key prefix");
    L15:
        throw new GeneralSecurityException("Invalid encoded public key length");
    L17:
        throw new GeneralSecurityException("Invalid encoded private key prefix");
    L19:
        throw new GeneralSecurityException("Invalid encoded private key length");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmd
    public final byte[] zza(byte[] r6, byte[] r7) throws GeneralSecurityException {
        KeyFactory r02 = KeyFactory.getInstance("XDH", this.zzc);
        if (r6.length != 32) goto L11;
        PrivateKey r62 = r02.generatePrivate(new PKCS8EncodedKeySpec(zzyc.zza(new byte[][]{zza, r6})));
        if (r7.length != 32) goto L9;
        PublicKey r72 = r02.generatePublic(new X509EncodedKeySpec(zzyc.zza(new byte[][]{zzb, r7})));
        KeyAgreement r03 = KeyAgreement.getInstance("XDH", this.zzc);
        r03.init(r62);
        r03.doPhase(r72, true);
        return r03.generateSecret();
    L9:
        throw new InvalidKeyException("Invalid X25519 public key");
    L11:
        throw new InvalidKeyException("Invalid X25519 private key");
    }
}
