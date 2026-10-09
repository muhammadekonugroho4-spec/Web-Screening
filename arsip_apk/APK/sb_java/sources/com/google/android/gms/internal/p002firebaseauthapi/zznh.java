package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzbo;
import com.google.android.gms.internal.p002firebaseauthapi.zzpq;
import java.security.GeneralSecurityException;

/* loaded from: classes5.dex */
public abstract class zznh<KeyT extends zzbo, SerializationT extends zzpq> {
    private final Class<KeyT> zza;
    private final Class<SerializationT> zzb;

    public /* synthetic */ zznh(Class r1, Class r2, zzni r3) {
        this(r1, r2);
    }

    public static <KeyT extends zzbo, SerializationT extends zzpq> zznh<KeyT, SerializationT> zza(zznj<KeyT, SerializationT> r1, Class<KeyT> r2, Class<SerializationT> r3) {
        return new zzng(r2, r3, r1);
    }

    public abstract SerializationT zza(KeyT r1, zzcm r2) throws GeneralSecurityException;

    public final Class<SerializationT> zzb() {
        return this.zzb;
    }

    private zznh(Class<KeyT> r1, Class<SerializationT> r2) {
        this.zza = r1;
        this.zzb = r2;
    }

    public final Class<KeyT> zza() {
        return this.zza;
    }
}
