package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.R;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes5.dex */
public final class zzhw {
    private final Resources zza;
    private final String zzb;

    public zzhw(Context r2, String r3) {
        Preconditions.checkNotNull(r2);
        this.zza = r2.getResources();
        if (TextUtils.isEmpty(r3) == true) goto L6;
        this.zzb = r3;
        return;
    L6:
        this.zzb = zza(r2);
    }

    public final String zza(String r4) {
        int r42 = this.zza.getIdentifier(r4, "string", this.zzb);
        if (r42 != 0) goto L8;
        return null;
    L8:
        return this.zza.getString(r42);
    L7:
        return null;
    }

    public static String zza(Context r2) {
        return r2.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    L5:
        return r2.getPackageName();
    }
}
