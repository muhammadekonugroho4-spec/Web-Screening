package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzcg;
import com.google.android.gms.internal.p002firebaseauthapi.zzpq;
import java.security.GeneralSecurityException;

/* loaded from: classes5.dex */
public abstract class zzou<ParametersT extends zzcg, SerializationT extends zzpq> {
    private final Class<ParametersT> zza;
    private final Class<SerializationT> zzb;

    public /* synthetic */ zzou(Class r1, Class r2, zzoz r3) {
        this(r1, r2);
    }

    public static <ParametersT extends zzcg, SerializationT extends zzpq> zzou<ParametersT, SerializationT> zza(zzow<ParametersT, SerializationT> r1, Class<ParametersT> r2, Class<SerializationT> r3) {
        return new zzox(r2, r3, r1);
    }

    public abstract SerializationT zza(ParametersT r1) throws GeneralSecurityException;

    public final Class<SerializationT> zzb() {
        return this.zzb;
    }

    private zzou(Class<ParametersT> r1, Class<SerializationT> r2) {
        this.zza = r1;
        this.zzb = r2;
    }

    public final Class<ParametersT> zza() {
        return this.zza;
    }
}
