package com.google.android.gms.internal.auth;

import android.net.Uri;
import androidx.collection.g0;

/* loaded from: classes5.dex */
public final class zzci {
    private final g0 zza;

    public zzci(g0 r1) {
        this.zza = r1;
    }

    public final String zza(Uri r1, String r2, String r3, String r4) {
        if (r1 == null) goto L9;
        String r12 = r1.toString();
        g0 r13 = (g0) this.zza.get(r12);
        if (r13 != null) goto L8;
        return null;
    L8:
        return (String) r13.get("".concat(String.valueOf(r4)));
    L9:
        return null;
    }
}
