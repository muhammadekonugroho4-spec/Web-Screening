package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.R;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes5.dex */
public class StringResourceValueReader {
    private final Resources zza;
    private final String zzb;

    public StringResourceValueReader(Context r2) {
        Preconditions.checkNotNull(r2);
        Resources r22 = r2.getResources();
        this.zza = r22;
        this.zzb = r22.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    @KeepForSdk
    public String getString(String r4) {
        String r02 = this.zzb;
        int r42 = this.zza.getIdentifier(r4, "string", r02);
        if (r42 != 0) goto L7;
        return null;
    L7:
        return this.zza.getString(r42);
    }
}
