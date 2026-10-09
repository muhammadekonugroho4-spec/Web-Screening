package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.Enum;
import java.security.GeneralSecurityException;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzmv<E extends Enum<E>, O> {
    private final Map<E, O> zza;
    private final Map<O, E> zzb;

    public /* synthetic */ zzmv(Map r1, Map r2, zzmx r3) {
        this(r1, r2);
    }

    public static <E extends Enum<E>, O> zzmu<E, O> zza() {
        return new zzmu(null);
    }

    private zzmv(Map<E, O> r1, Map<O, E> r2) {
        this.zza = r1;
        this.zzb = r2;
    }

    public final E zza(O r4) throws GeneralSecurityException {
        E r02 = this.zzb.get(r4);
        if (r02 == null) goto L6;
        return r02;
    L6:
        throw new GeneralSecurityException("Unable to convert object enum: " + String.valueOf(r4));
    }

    public final O zza(E r4) throws GeneralSecurityException {
        O r02 = this.zza.get(r4);
        if (r02 == null) goto L6;
        return r02;
    L6:
        throw new GeneralSecurityException("Unable to convert proto enum: " + String.valueOf(r4));
    }
}
