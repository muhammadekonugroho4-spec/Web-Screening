package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.Enum;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzmu<E extends Enum<E>, O> {
    private Map<E, O> zza;
    private Map<O, E> zzb;

    public /* synthetic */ zzmu(zzmx r1) {
        this();
    }

    public final zzmu<E, O> zza(E r2, O r3) {
        this.zza.put(r2, r3);
        this.zzb.put(r3, r2);
        return this;
    }

    private zzmu() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzmv<E, O> zza() {
        return new zzmv(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb), null);
    }
}
