package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class zznq {
    private HashMap<String, String> zza;

    public zznq() {
        this.zza = new HashMap();
    }

    public final zznr zza() {
        if (this.zza == null) goto L7;
        zznr r02 = new zznr(Collections.unmodifiableMap(this.zza), null);
        this.zza = null;
        return r02;
    L7:
        throw new IllegalStateException("cannot call build() twice");
    }
}
