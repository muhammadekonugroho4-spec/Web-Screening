package com.google.android.gms.common;

/* loaded from: classes5.dex */
public class PackageVerificationResult {
    private final String zza;
    private final boolean zzb;
    private final String zzc;
    private final Throwable zzd;

    private PackageVerificationResult(String r1, int r2, boolean r3, String r4, Throwable r5) {
        this.zza = r1;
        this.zzb = r3;
        this.zzc = r4;
        this.zzd = r5;
    }

    public static PackageVerificationResult zza(String r6, String r7, Throwable r8) {
        return new PackageVerificationResult(r6, 1, false, r7, r8);
    }

    public static PackageVerificationResult zzd(String r6, int r7) {
        return new PackageVerificationResult(r6, r7, true, null, null);
    }

    public final void zzb() {
        if (this.zzb == true) goto L10;
        String r02 = this.zzc;
        Throwable r1 = this.zzd;
        String r03 = "PackageVerificationRslt: ".concat(String.valueOf(r02));
        if (r1 == null) goto L9;
        throw new SecurityException(r03, r1);
    L9:
        throw new SecurityException(r03);
    }

    public final boolean zzc() {
        return this.zzb;
    }
}
