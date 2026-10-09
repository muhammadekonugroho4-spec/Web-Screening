package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes5.dex */
public final class zzml implements zzbe {
    private static final String zza = "zzml";
    private final zzbe zzb;

    static {
    }

    public zzml(String r1) throws GeneralSecurityException, IOException {
        this.zzb = zzmj.zza(r1);
    }

    private static void zza() {
        Thread.sleep((int) (Math.random() * 100.0d));     // Catch: InterruptedException -> L5
        return;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zzb(byte[] r4, byte[] r5) throws GeneralSecurityException {
        return this.zzb.zzb(r4, r5);
    L6:
        e = move-exception;
        Log.w(zza, "encountered a potentially transient KeyStore error, will wait and retry", e);
        zza();
        return this.zzb.zzb(r4, r5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zza(byte[] r4, byte[] r5) throws GeneralSecurityException {
        return this.zzb.zza(r4, r5);
    L4:
        e = e;
    L10:
        Log.w(zza, "encountered a potentially transient KeyStore error, will wait and retry", e);
        zza();
        return this.zzb.zza(r4, r5);
    L6:
        e = e;
    L8:
        e = move-exception;
        throw e;
    }
}
