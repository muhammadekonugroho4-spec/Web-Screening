package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzij;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* loaded from: classes5.dex */
public final class zzze implements zzrx {
    private static final zzij.zza zza = null;
    private final ThreadLocal<Mac> zzb;
    private final String zzc;
    private final Key zzd;
    private final int zze;

    static {
        zza = zzij.zza.zzb;
    }

    public zzze(String r3, Key r4) throws GeneralSecurityException {
        zzzh r02 = new zzzh(this);
        this.zzb = r02;
        if (zza.zza() == false) goto L42;
        this.zzc = r3;
        this.zzd = r4;
        if (r4.getEncoded().length < 16) goto L40;
        r3.getClass();
        char r42 = 65535;
        switch(r3.hashCode()) {
            case -1823053428: goto L26;
            case 392315023: goto L22;
            case 392315118: goto L18;
            case 392316170: goto L14;
            case 392317873: goto L10;
            default: goto L29;
        };
    L29:
        switch(r42) {
            case 0: goto L36;
            case 1: goto L35;
            case 2: goto L34;
            case 3: goto L33;
            case 4: goto L32;
            default: goto L31;
        };
    L32:
        this.zze = 64;
    L37:
        r02.get();
        return;
    L33:
        this.zze = 48;
        goto L37
    L34:
        this.zze = 32;
        goto L37
    L35:
        this.zze = 28;
        goto L37
    L36:
        this.zze = 20;
        goto L37
    L31:
        throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + r3);
    L10:
        if (r3.equals("HMACSHA512") == false) goto L29;
        r42 = 4;
        goto L29
    L14:
        if (r3.equals("HMACSHA384") == false) goto L29;
        r42 = 3;
        goto L29
    L18:
        if (r3.equals("HMACSHA256") == false) goto L29;
        r42 = 2;
        goto L29
    L22:
        if (r3.equals("HMACSHA224") == false) goto L29;
        r42 = 1;
        goto L29
    L26:
        if (r3.equals("HMACSHA1") == false) goto L29;
        r42 = 0;
        goto L29
    L40:
        throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
    L42:
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }

    public static /* bridge */ /* synthetic */ String zza(zzze r02) {
        return r02.zzc;
    }

    public static /* bridge */ /* synthetic */ Key zzb(zzze r02) {
        return r02.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzrx
    public final byte[] zza(byte[] r2, int r3) throws GeneralSecurityException {
        if (r3 > this.zze) goto L7;
        this.zzb.get().update(r2);
        return Arrays.copyOf(this.zzb.get().doFinal(), r3);
    L7:
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
