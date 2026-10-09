package com.google.android.gms.internal.time;

import com.clevertap.android.sdk.Constants;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
final class zzdc extends zzdq {
    public zzdc(String r1, Class r2, boolean r3) {
        super(Constants.KEY_TAGS, r2, false);
    }

    @Override // com.google.android.gms.internal.time.zzdq
    public final /* bridge */ /* synthetic */ void zzb(Object r5, zzdp r6) {
        zzgs r52 = (zzgs) r5;
        if (r52 == null) goto L15;
        Iterator r53 = r52.zzd().entrySet().iterator();
    L7:
        if (r53.hasNext() == false) goto L22;
        Map.Entry r02 = (Map.Entry) r53.next();
        if (((Set) r02.getValue()).isEmpty() == false) goto L10;
        r6.zza((String) r02.getKey(), null);
        goto L7
    L10:
        Iterator r1 = ((Set) r02.getValue()).iterator();
    L12:
        if (r1.hasNext() == false) goto L7;
        Object r2 = r1.next();
        r6.zza((String) r02.getKey(), r2);
        goto L12
    L22:
        return;
    }
}
