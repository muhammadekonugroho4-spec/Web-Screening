package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes5.dex */
public final class zzgl {
    private static final ThreadLocal<Cipher> zza = null;

    static {
        zza = new zzgo();
    }

    public static AlgorithmParameterSpec zza(byte[] r2) {
        return zza(r2, 0, r2.length);
    }

    public static SecretKey zzb(byte[] r2) throws GeneralSecurityException {
        zzzi.zza(r2.length);
        return new SecretKeySpec(r2, "AES");
    }

    public static AlgorithmParameterSpec zza(byte[] r2, int r3, int r4) {
        Integer r02 = zzpy.zzb();
        if (r02 == null) goto L9;
        if (r02.intValue() > 19) goto L9;
        return new IvParameterSpec(r2, r3, r4);
    L9:
        return new GCMParameterSpec(128, r2, r3, r4);
    }

    public static Cipher zza() {
        return zza.get();
    }
}
