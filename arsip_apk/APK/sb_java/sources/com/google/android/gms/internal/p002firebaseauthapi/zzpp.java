package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.Provider;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
public final class zzpp {
    private static final ThreadLocal<SecureRandom> zza = null;

    static {
        zza = new zzpo();
    }

    public static /* synthetic */ SecureRandom zza() {
        SecureRandom r02 = zzb();
        r02.nextLong();
        return r02;
    }

    private static SecureRandom zzb() {
        Provider r02 = zzmr.zza();
        if (r02 != null) goto L14;
    L6:
        Provider r03 = zzmr.zzb();
        if (r03 == null) goto L11;
        return SecureRandom.getInstance("SHA1PRNG", r03);
    L11:
        return new SecureRandom();
    L14:
        return SecureRandom.getInstance("SHA1PRNG", r02);
    }

    public static byte[] zza(int r1) {
        byte[] r12 = new byte[r1];
        zza.get().nextBytes(r12);
        return r12;
    }
}
