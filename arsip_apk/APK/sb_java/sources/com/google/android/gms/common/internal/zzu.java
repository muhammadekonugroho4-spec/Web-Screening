package com.google.android.gms.common.internal;

import android.net.Uri;

/* loaded from: classes5.dex */
public final class zzu {
    public static final /* synthetic */ int zza = 0;
    private static final Uri zzb = null;
    private static final Uri zzc = null;

    static {
        Uri r02 = Uri.parse("https://plus.google.com/");
        zzb = r02;
        zzc = r02.buildUpon().appendPath("circles").appendPath("find").build();
    }
}
