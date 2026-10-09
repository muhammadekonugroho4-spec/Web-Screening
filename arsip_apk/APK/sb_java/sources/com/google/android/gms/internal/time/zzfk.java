package com.google.android.gms.internal.time;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
final class zzfk extends zzfm {
    private final Map zza;

    public /* synthetic */ zzfk(zzet r2, zzet r3, zzfl r4) {
        super(null);
        LinkedHashMap r42 = new LinkedHashMap();
        zzd(r42, r2);
        zzd(r42, r3);
        Iterator r22 = r42.entrySet().iterator();
    L4:
        if (r22.hasNext() == false) goto L8;
        Map.Entry r32 = (Map.Entry) r22.next();
        if (((zzdq) r32.getKey()).zzi() == false) goto L4;
        r32.setValue(Collections.unmodifiableList((List) r32.getValue()));
        goto L4
    L8:
        this.zza = Collections.unmodifiableMap(r42);
    }

    private static void zzd(Map r4, zzet r5) {
        int r02 = 0;
    L4:
        if (r02 >= r5.zza()) goto L13;
        zzdq r1 = r5.zzb(r02);
        Object r2 = r4.get(r1);
        if (r1.zzi() == false) goto L11;
        List r22 = (List) r2;
        if (r22 != null) goto L10;
        r22 = new ArrayList();
        r4.put(r1, r22);
    L10:
        r22.add(r1.zze(r5.zzd(r02)));
    L12:
        r02 = r02 + 1;
        goto L4
    L11:
        r4.put(r1, r1.zze(r5.zzd(r02)));
        goto L12
    }

    @Override // com.google.android.gms.internal.time.zzfm
    public final int zza() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.time.zzfm
    public final Set zzb() {
        return this.zza.keySet();
    }

    @Override // com.google.android.gms.internal.time.zzfm
    public final void zzc(zzfb r5, Object r6) {
        Iterator r02 = this.zza.entrySet().iterator();
    L4:
        if (r02.hasNext() == false) goto L9;
        Map.Entry r1 = (Map.Entry) r02.next();
        zzdq r2 = (zzdq) r1.getKey();
        Object r12 = r1.getValue();
        if (r2.zzi() == true) goto L7;
        r5.zza(r2, r12, r6);
        goto L4
    L7:
        r5.zzb(r2, ((List) r12).iterator(), r6);
        goto L4
    }
}
