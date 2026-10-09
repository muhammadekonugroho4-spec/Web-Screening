package com.google.android.gms.internal.time;

import java.util.Comparator;

/* loaded from: classes5.dex */
final class zzgl implements Comparator {
    public zzgl() {
    }

    @Override // java.util.Comparator
    public final int compare(Object r3, Object r4) {
        zzgr r02 = zzgr.zza(r3);
        zzgr r1 = zzgr.zza(r4);
        if (r02 != r1) goto L23;
        int r03 = r02.ordinal();
        if (r03 == 0) goto L21;
        if (r03 == 1) goto L19;
        if (r03 == 2) goto L17;
        if (r03 != 3) goto L15;
        return ((Double) r3).compareTo((Double) r4);
    L15:
        throw null;
    L17:
        return ((Long) r3).compareTo((Long) r4);
    L19:
        return ((String) r3).compareTo((String) r4);
    L21:
        return ((Boolean) r3).compareTo((Boolean) r4);
    L23:
        return r02.compareTo(r1);
    }
}
