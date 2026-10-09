package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzbo;
import java.security.GeneralSecurityException;

/* loaded from: classes5.dex */
public abstract class zzoy<KeyT extends zzbo, PrimitiveT> {
    private final Class<KeyT> zza;
    private final Class<PrimitiveT> zzb;

    public /* synthetic */ zzoy(Class r1, Class r2, zzpd r3) {
        this(r1, r2);
    }

    public static <KeyT extends zzbo, PrimitiveT> zzoy<KeyT, PrimitiveT> zza(zzpa<KeyT, PrimitiveT> r1, Class<KeyT> r2, Class<PrimitiveT> r3) {
        return new zzpb(r2, r3, r1);
    }

    public abstract PrimitiveT zza(KeyT r1) throws GeneralSecurityException;

    public final Class<PrimitiveT> zzb() {
        return this.zzb;
    }

    private zzoy(Class<KeyT> r1, Class<PrimitiveT> r2) {
        this.zza = r1;
        this.zzb = r2;
    }

    public final Class<KeyT> zza() {
        return this.zza;
    }
}
