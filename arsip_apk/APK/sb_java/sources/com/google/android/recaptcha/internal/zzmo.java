package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzmo {
    static final zzmo zza = null;
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private final Map zzd;

    static {
        zza = new zzmo(true);
    }

    public zzmo() {
        this.zzd = new HashMap();
    }

    public final zznc zza(zzoi r2, int r3) {
        zzmn r02 = new zzmn(r2, r3);
        return (zznc) this.zzd.get(r02);
    }

    public zzmo(boolean r1) {
        this.zzd = Collections.EMPTY_MAP;
    }
}
