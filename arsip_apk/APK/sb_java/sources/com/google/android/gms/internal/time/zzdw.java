package com.google.android.gms.internal.time;

/* loaded from: classes5.dex */
public abstract class zzdw {
    public static final zzdw zzc = null;
    public static final zzdw zzd = null;

    static {
        zzc = new zzdr();
        zzd = new zzdr();
    }

    public zzdw() {
    }

    public static zzdw zzc(zzdw r2, zzdw r3) {
        if (r2 != null) goto L4;
        return r3;
    L4:
        if (r3 == null) goto L17;
        zzdw r02 = zzc;
        if (r2 == r02) goto L17;
        zzdw r1 = zzd;
        if (r3 == r1) goto L17;
        if (r3 == r02) goto L16;
        if (r2 == r1) goto L16;
        return new zzds(r2, r3);
    L16:
        return r3;
    L17:
        return r2;
    }

    public abstract void zzb();
}
