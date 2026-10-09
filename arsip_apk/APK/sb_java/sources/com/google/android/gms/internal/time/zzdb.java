package com.google.android.gms.internal.time;

import java.util.Iterator;

/* loaded from: classes5.dex */
final class zzdb extends zzdq {
    public zzdb(String r1, Class r2, boolean r3) {
        super("group_by", r2, true);
    }

    @Override // com.google.android.gms.internal.time.zzdq
    public final void zza(Iterator r4, zzdp r5) {
        if (r4.hasNext() == false) goto L15;
        Object r02 = r4.next();
        if (r4.hasNext() == true) goto L8;
        r5.zza(zzf(), r02);
        return;
    L8:
        StringBuilder r1 = new StringBuilder();
        r1.append('[');
        r1.append(r02);
    L9:
        r1.append(',');
        r1.append(r4.next());
        if (r4.hasNext() == true) goto L9;
        String r42 = zzf();
        r1.append(']');
        r5.zza(r42, r1.toString());
        return;
    }
}
