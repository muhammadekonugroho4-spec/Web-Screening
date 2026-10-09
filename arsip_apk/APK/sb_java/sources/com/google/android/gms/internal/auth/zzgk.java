package com.google.android.gms.internal.auth;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
final class zzgk extends zzgu {
    public zzgk(int r2) {
        super(r2, null);
    }

    @Override // com.google.android.gms.internal.auth.zzgu
    public final void zza() {
        if (zzj() == true) goto L17;
        int r02 = 0;
    L6:
        if (r02 >= zzb()) goto L11;
        Map.Entry r1 = zzg(r02);
        if (((zzeo) r1.getKey()).zzc() == false) goto L10;
        r1.setValue(Collections.unmodifiableList((List) r1.getValue()));
    L10:
        r02 = r02 + 1;
        goto L6
    L11:
        Iterator r03 = zzc().iterator();
    L13:
        if (r03.hasNext() == false) goto L17;
        Map.Entry r12 = (Map.Entry) r03.next();
        if (((zzeo) r12.getKey()).zzc() == false) goto L13;
        r12.setValue(Collections.unmodifiableList((List) r12.getValue()));
    L17:
        super.zza();
    }
}
