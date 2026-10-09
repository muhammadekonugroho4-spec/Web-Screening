package com.google.android.play.core.appupdate;

import android.content.Context;
import java.io.File;

/* loaded from: classes5.dex */
final class zzt {
    private final Context zza;

    public zzt(Context r1) {
        this.zza = r1;
    }

    private static long zzb(File r5) {
        if (r5.isDirectory() == false) goto L5;
        File[] r52 = r5.listFiles();
        long r02 = 0;
        if (r52 == null) goto L12;
        int r2 = 0;
    L10:
        if (r2 >= r52.length) goto L12;
        r02 = r02 + zzb(r52[r2]);
        r2 = r2 + 1;
    L12:
        return r02;
    L5:
        return r5.length();
    }

    public final long zza() {
        return zzb(new File(this.zza.getFilesDir(), "assetpacks"));
    }
}
