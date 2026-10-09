package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class zzgw {
    public static final Uri zza = null;
    public static final Uri zzb = null;
    public static final Pattern zzc = null;
    public static final Pattern zzd = null;

    static {
        zza = Uri.parse("content://com.google.android.gsf.gservices");
        zzb = Uri.parse("content://com.google.android.gsf.gservices/prefix");
        zzc = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        zzd = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    }
}
