package com.google.android.gms.internal.time;

/* loaded from: classes5.dex */
public final class zzeo {
    public static /* synthetic */ boolean zza(int r02, zzdh r1, StringBuilder r2) {
        if ((r02 - 1) == 0) goto L6;
        return false;
    L6:
        if (r1 == zzdh.zza) goto L9;
        r2.append(r1.zza());
        r2.append('.');
        r2.append(r1.zzb());
        r2.append(":0");
        return true;
    L9:
        return false;
    }
}
