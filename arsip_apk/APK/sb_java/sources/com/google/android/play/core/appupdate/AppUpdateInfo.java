package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import com.google.android.play.core.install.model.AppUpdateType;
import com.google.android.play.core.install.model.InstallStatus;
import com.google.android.play.core.install.model.UpdateAvailability;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class AppUpdateInfo {
    private final String zza;
    private final int zzb;

    @UpdateAvailability
    private final int zzc;

    @InstallStatus
    private final int zzd;
    private final Integer zze;
    private final int zzf;
    private final long zzg;
    private final long zzh;
    private final long zzi;
    private final long zzj;
    private final PendingIntent zzk;
    private final PendingIntent zzl;
    private final PendingIntent zzm;
    private final PendingIntent zzn;
    private final Map zzo;
    private boolean zzp;

    private AppUpdateInfo(String r2, int r3, @UpdateAvailability int r4, @InstallStatus int r5, Integer r6, int r7, long r8, long r10, long r12, long r14, PendingIntent r16, PendingIntent r17, PendingIntent r18, PendingIntent r19, Map r20) {
        this.zzp = false;
        this.zza = r2;
        this.zzb = r3;
        this.zzc = r4;
        this.zzd = r5;
        this.zze = r6;
        this.zzf = r7;
        this.zzg = r8;
        this.zzh = r10;
        this.zzi = r12;
        this.zzj = r14;
        this.zzk = r16;
        this.zzl = r17;
        this.zzm = r18;
        this.zzn = r19;
        this.zzo = r20;
    }

    public static AppUpdateInfo zzb(String r20, int r21, @UpdateAvailability int r22, @InstallStatus int r23, Integer r24, int r25, long r26, long r28, long r30, long r32, PendingIntent r34, PendingIntent r35, PendingIntent r36, PendingIntent r37, Map r38) {
        return new AppUpdateInfo(r20, r21, r22, r23, r24, r25, r26, r28, r30, r32, r34, r35, r36, r37, r38);
    }

    private static Set zze(Set r02) {
        if (r02 == null) goto L4;
        return r02;
    L4:
        return new HashSet();
    }

    private final boolean zzf(AppUpdateOptions r5) {
        if (r5.allowAssetPackDeletion() == true) goto L5;
        return false;
    L5:
        if (this.zzi > this.zzj) goto L10;
        return true;
    L10:
        return false;
    }

    public int availableVersionCode() {
        return this.zzb;
    }

    public long bytesDownloaded() {
        return this.zzg;
    }

    public Integer clientVersionStalenessDays() {
        return this.zze;
    }

    public Set<Integer> getFailedUpdatePreconditions(AppUpdateOptions r2) {
        if (r2.allowAssetPackDeletion() == false) goto L11;
        if (r2.appUpdateType() != 0) goto L9;
        return zze((Set) this.zzo.get("nonblocking.destructive.intent"));
    L9:
        return zze((Set) this.zzo.get("blocking.destructive.intent"));
    L11:
        if (r2.appUpdateType() != 0) goto L15;
        return zze((Set) this.zzo.get("nonblocking.intent"));
    L15:
        return zze((Set) this.zzo.get("blocking.intent"));
    }

    @InstallStatus
    public int installStatus() {
        return this.zzd;
    }

    public boolean isUpdateTypeAllowed(@AppUpdateType int r1) {
        if (zza(AppUpdateOptions.defaultOptions(r1)) == null) goto L6;
        return true;
    L6:
        return false;
    }

    public String packageName() {
        return this.zza;
    }

    public long totalBytesToDownload() {
        return this.zzh;
    }

    @UpdateAvailability
    public int updateAvailability() {
        return this.zzc;
    }

    public int updatePriority() {
        return this.zzf;
    }

    public final PendingIntent zza(AppUpdateOptions r4) {
        if (r4.appUpdateType() != 0) goto L13;
        PendingIntent r02 = this.zzl;
        if (r02 == null) goto L8;
        return r02;
    L8:
        if (zzf(r4) == true) goto L10;
        return null;
    L10:
        return this.zzn;
    L13:
        if (r4.appUpdateType() != 1) goto L21;
        PendingIntent r03 = this.zzk;
        if (r03 == null) goto L18;
        return r03;
    L18:
        if (zzf(r4) == false) goto L21;
        return this.zzm;
    L21:
        return null;
    }

    public final void zzc() {
        this.zzp = true;
    }

    public final boolean zzd() {
        return this.zzp;
    }

    public boolean isUpdateTypeAllowed(AppUpdateOptions r1) {
        if (zza(r1) == null) goto L6;
        return true;
    L6:
        return false;
    }
}
