package com.google.android.gms.internal.auth;

import java.io.Serializable;

/* loaded from: classes5.dex */
public final class zzdn {
    public static zzdj zza(zzdj r1) {
        if ((r1 instanceof zzdl) == false) goto L5;
        return r1;
    L5:
        if ((r1 instanceof zzdk) == false) goto L8;
        return r1;
    L8:
        if ((r1 instanceof Serializable) == false) goto L12;
        return new zzdk(r1);
    L12:
        return new zzdl(r1);
    }

    public static zzdj zzb(Object r1) {
        return new zzdm(r1);
    }
}
