package com.google.android.play.core.install;

import com.google.android.play.core.install.model.InstallErrorCode;
import com.google.android.play.core.install.model.InstallStatus;

/* loaded from: classes5.dex */
final class zza extends InstallState {
    private final int zza;
    private final long zzb;
    private final long zzc;
    private final int zzd;
    private final String zze;

    public zza(int r1, long r2, long r4, int r6, String r7) {
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r4;
        this.zzd = r6;
        if (r7 == null) goto L7;
        this.zze = r7;
        return;
    L7:
        throw new NullPointerException("Null packageName");
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long bytesDownloaded() {
        return this.zzb;
    }

    public final boolean equals(Object r8) {
        if (r8 != this) goto L6;
        return true;
    L6:
        if ((r8 instanceof InstallState) == false) goto L18;
        InstallState r82 = (InstallState) r8;
        if (this.zza != r82.installStatus()) goto L18;
        if (this.zzb != r82.bytesDownloaded()) goto L18;
        if (this.zzc != r82.totalBytesToDownload()) goto L18;
        if (this.zzd != r82.installErrorCode()) goto L18;
        if (this.zze.equals(r82.packageName()) == false) goto L18;
        return true;
    L18:
        return false;
    }

    public final int hashCode() {
        int r02 = this.zza ^ 1000003;
        long r2 = this.zzb;
        long r22 = r2 ^ (r2 >>> 32);
        long r5 = this.zzc;
        int r03 = (((((r02 * 1000003) ^ ((int) r22)) * 1000003) ^ ((int) ((r5 >>> 32) ^ r5))) * 1000003) ^ this.zzd;
        int r04 = r03 * 1000003;
        return r04 ^ this.zze.hashCode();
    }

    @Override // com.google.android.play.core.install.InstallState
    @InstallErrorCode
    public final int installErrorCode() {
        return this.zzd;
    }

    @Override // com.google.android.play.core.install.InstallState
    @InstallStatus
    public final int installStatus() {
        return this.zza;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final String packageName() {
        return this.zze;
    }

    public final String toString() {
        return "InstallState{installStatus=" + this.zza + ", bytesDownloaded=" + this.zzb + ", totalBytesToDownload=" + this.zzc + ", installErrorCode=" + this.zzd + ", packageName=" + this.zze + "}";
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long totalBytesToDownload() {
        return this.zzc;
    }
}
