package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.collection.g0;

/* loaded from: classes5.dex */
public final class zzhm implements zzhr {
    private final g0 zza;

    public zzhm(g0 r1) {
        this.zza = r1;
    }

    @Override // com.google.android.gms.internal.measurement.zzhr
    public final String zza(Uri r2, String r3, String r4, String r5) {
        if (r2 == null) goto L5;
        r3 = r2.toString();
    L6:
        g0 r22 = this.zza;
        if (r22 != null) goto L9;
    L8:
        g0 r23 = null;
    L10:
        if (r23 != null) goto L12;
        return null;
    L12:
        if (r4 == null) goto L15;
        r5 = r4 + r5;
    L15:
        return (String) r23.get(r5);
    L9:
        r23 = (g0) r22.get(r3);
        goto L10
    L5:
        if (r3 == null) goto L8;
        goto L6
    }
}
