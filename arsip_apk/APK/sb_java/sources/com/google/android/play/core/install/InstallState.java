package com.google.android.play.core.install;

import android.content.Intent;
import com.google.android.play.core.appupdate.internal.zzm;
import com.google.android.play.core.install.model.InstallErrorCode;
import com.google.android.play.core.install.model.InstallStatus;

/* loaded from: classes5.dex */
public abstract class InstallState {
    public InstallState() {
    }

    public static InstallState zza(@InstallStatus int r8, long r9, long r11, @InstallErrorCode int r13, String r14) {
        return new zza(r8, r9, r11, r13, r14);
    }

    public static InstallState zzb(Intent r13, zzm r14) {
        r14.zza("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        r14.zza("Key: %s; value: %s", new Object[]{"install.status", Integer.valueOf(r13.getIntExtra("install.status", 0))});
        r14.zza("Key: %s; value: %s", new Object[]{"error.code", Integer.valueOf(r13.getIntExtra("error.code", 0))});
        return new zza(r13.getIntExtra("install.status", 0), r13.getLongExtra("bytes.downloaded", 0), r13.getLongExtra("total.bytes.to.download", 0), r13.getIntExtra("error.code", 0), r13.getStringExtra("package.name"));
    }

    public abstract long bytesDownloaded();

    @InstallErrorCode
    public abstract int installErrorCode();

    @InstallStatus
    public abstract int installStatus();

    public abstract String packageName();

    public abstract long totalBytesToDownload();
}
