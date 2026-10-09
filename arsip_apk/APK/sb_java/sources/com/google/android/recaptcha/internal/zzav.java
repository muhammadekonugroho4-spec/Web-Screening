package com.google.android.recaptcha.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.i;

/* loaded from: classes5.dex */
public final class zzav {
    public static final /* synthetic */ int zza = 0;
    private static zzav zzb;
    private static final Map zzc = null;
    private static final kotlin.jvm.functions.a zzd = null;
    private final Map zze;

    static {
        zzc = new LinkedHashMap();
        zzd = zzat.zza;
    }

    public /* synthetic */ zzav(Map r1, i r2) {
        this.zze = r1;
    }

    public static final /* synthetic */ zzav zza() {
        return zzb;
    }

    public static final /* synthetic */ Map zzc() {
        return zzc;
    }

    public static final /* synthetic */ kotlin.jvm.functions.a zzd() {
        return zzd;
    }

    public static final /* synthetic */ void zze(zzav r02) {
        zzb = r02;
    }

    public final Object zzb(int r2) {
        return this.zze.get(Integer.valueOf(r2));
    }
}
