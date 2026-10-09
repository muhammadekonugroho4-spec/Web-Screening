package com.google.android.gms.common;

import android.util.Log;

/* loaded from: classes5.dex */
class zzw {
    private static final zzw zze = null;
    final boolean zza;
    final String zzb;
    final Throwable zzc;
    final int zzd;

    static {
        zze = new zzw(true, 3, 1, null, null);
    }

    private zzw(boolean r1, int r2, int r3, String r4, Throwable r5) {
        this.zza = r1;
        this.zzd = r2;
        this.zzb = r4;
        this.zzc = r5;
    }

    @Deprecated
    public static zzw zzb() {
        return zze;
    }

    public static zzw zzc(String r6) {
        return new zzw(false, 1, 5, r6, null);
    }

    public static zzw zzd(String r6, Throwable r7) {
        return new zzw(false, 1, 5, r6, r7);
    }

    public static zzw zzf(int r6) {
        return new zzw(true, r6, 1, null, null);
    }

    public static zzw zzg(int r6, int r7, String r8, Throwable r9) {
        return new zzw(false, r6, r7, r8, r9);
    }

    public String zza() {
        return this.zzb;
    }

    public final void zze() {
        if (this.zza == false) goto L5;
        return;
    L5:
        if (Log.isLoggable("GoogleCertificatesRslt", 3) == true) goto L7;
        return;
    L7:
        if (this.zzc == null) goto L10;
        Log.d("GoogleCertificatesRslt", zza(), this.zzc);
        return;
    L10:
        Log.d("GoogleCertificatesRslt", zza());
    }

    public /* synthetic */ zzw(boolean r1, int r2, int r3, String r4, Throwable r5, zzv r6) {
        this(false, 1, 5, null, null);
    }
}
