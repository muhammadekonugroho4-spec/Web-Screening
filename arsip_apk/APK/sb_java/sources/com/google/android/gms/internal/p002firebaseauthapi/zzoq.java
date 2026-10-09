package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzpq;
import java.security.GeneralSecurityException;

/* loaded from: classes5.dex */
public abstract class zzoq<SerializationT extends zzpq> {
    private final zzzn zza;
    private final Class<SerializationT> zzb;

    public /* synthetic */ zzoq(zzzn r1, Class r2, zzov r3) {
        this(r1, r2);
    }

    public static <SerializationT extends zzpq> zzoq<SerializationT> zza(zzos<SerializationT> r1, zzzn r2, Class<SerializationT> r3) {
        return new zzot(r2, r3, r1);
    }

    public abstract zzcg zza(SerializationT r1) throws GeneralSecurityException;

    public final Class<SerializationT> zzb() {
        return this.zzb;
    }

    private zzoq(zzzn r1, Class<SerializationT> r2) {
        this.zza = r1;
        this.zzb = r2;
    }

    public final zzzn zza() {
        return this.zza;
    }
}
