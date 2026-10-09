package com.google.android.play.core.appupdate;

import com.google.android.play.core.appupdate.AppUpdateOptions;

/* loaded from: classes5.dex */
final class zzv extends AppUpdateOptions.Builder {
    private int zza;
    private boolean zzb;
    private byte zzc;

    public zzv() {
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateOptions.Builder
    public final AppUpdateOptions build() {
        if (this.zzc == 3) goto L13;
        StringBuilder r02 = new StringBuilder();
        if ((this.zzc & 1) != 0) goto L8;
        r02.append(" appUpdateType");
    L8:
        if ((this.zzc & 2) != 0) goto L11;
        r02.append(" allowAssetPackDeletion");
    L11:
        throw new IllegalStateException("Missing required properties:".concat(r02.toString()));
    L13:
        return new zzx(this.zza, this.zzb, null);
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateOptions.Builder
    public final AppUpdateOptions.Builder setAllowAssetPackDeletion(boolean r1) {
        this.zzb = r1;
        this.zzc = (byte) (this.zzc | 2);
        return this;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateOptions.Builder
    public final AppUpdateOptions.Builder setAppUpdateType(int r1) {
        this.zza = r1;
        this.zzc = (byte) (this.zzc | 1);
        return this;
    }
}
