package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes5.dex */
public final class zzcb {
    private static final CopyOnWriteArrayList<zzcc> zza = null;

    static {
        zza = new CopyOnWriteArrayList();
    }

    public static zzcc zza(String r3) throws GeneralSecurityException {
        Iterator<zzcc> r02 = zza.iterator();
    L4:
        if (r02.hasNext() == false) goto L9;
        zzcc r1 = r02.next();
        if (r1.zzb(r3) == false) goto L4;
        return r1;
    L9:
        throw new GeneralSecurityException("No KMS client does support: " + r3);
    }
}
