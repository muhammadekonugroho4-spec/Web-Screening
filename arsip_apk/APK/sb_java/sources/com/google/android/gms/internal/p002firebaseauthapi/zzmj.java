package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;

/* loaded from: classes5.dex */
public final class zzmj {
    public static zzbe zza(String r2) throws GeneralSecurityException {
        return new zzmm(r2, zza());
    }

    public static boolean zzb(String r1) throws GeneralSecurityException {
        return zza().containsAlias(r1);
    }

    private static KeyStore zza() throws GeneralSecurityException {
        KeyStore r02 = KeyStore.getInstance("AndroidKeyStore");     // Catch: IOException -> L4
        r02.load(null);     // Catch: IOException -> L4
        return r02;
    L4:
        e = move-exception;
        throw new GeneralSecurityException(e);
    }
}
