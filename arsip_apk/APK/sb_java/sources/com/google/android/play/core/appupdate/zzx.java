package com.google.android.play.core.appupdate;

import com.google.android.play.core.install.model.AppUpdateType;

/* loaded from: classes5.dex */
final class zzx extends AppUpdateOptions {
    private final int zza;
    private final boolean zzb;

    public /* synthetic */ zzx(int r1, boolean r2, zzw r3) {
        this.zza = r1;
        this.zzb = r2;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateOptions
    public final boolean allowAssetPackDeletion() {
        return this.zzb;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateOptions
    @AppUpdateType
    public final int appUpdateType() {
        return this.zza;
    }

    public final boolean equals(Object r5) {
        if (r5 != this) goto L6;
        return true;
    L6:
        if ((r5 instanceof AppUpdateOptions) == false) goto L12;
        AppUpdateOptions r52 = (AppUpdateOptions) r5;
        if (this.zza != r52.appUpdateType()) goto L12;
        if (this.zzb != r52.allowAssetPackDeletion()) goto L12;
        return true;
    L12:
        return false;
    }

    public final int hashCode() {
        int r02 = this.zza ^ 1000003;
        if (true == this.zzb) goto L5;
        int r2 = 1237;
    L7:
        return (r02 * 1000003) ^ r2;
    L5:
        r2 = 1231;
        goto L7
    }

    public final String toString() {
        return "AppUpdateOptions{appUpdateType=" + this.zza + ", allowAssetPackDeletion=" + this.zzb + "}";
    }
}
