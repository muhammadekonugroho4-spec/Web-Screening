package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public interface zzaq {
    public static final zzaq zzc = null;
    public static final zzaq zzd = null;
    public static final zzaq zze = null;
    public static final zzaq zzf = null;
    public static final zzaq zzg = null;
    public static final zzaq zzh = null;
    public static final zzaq zzi = null;
    public static final zzaq zzj = null;

    static {
        zzc = new zzax();
        zzd = new zzao();
        zze = new zzaj("continue");
        zzf = new zzaj("break");
        zzg = new zzaj("return");
        zzh = new zzag(Boolean.TRUE);
        zzi = new zzag(Boolean.FALSE);
        zzj = new zzas("");
    }

    zzaq zza(String r1, zzh r2, List<zzaq> r3);

    zzaq zzc();

    Boolean zzd();

    Double zze();

    String zzf();

    Iterator<zzaq> zzh();
}
