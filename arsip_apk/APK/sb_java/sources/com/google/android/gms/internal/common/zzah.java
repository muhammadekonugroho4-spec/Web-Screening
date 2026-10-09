package com.google.android.gms.internal.common;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class zzah extends zzae {
    public zzah() {
        throw null;
    }

    public final zzah zzb(Object r1) {
        super.zza(r1);
        return this;
    }

    public final zzah zzc(Iterator r2) {
    L3:
        if (r2.hasNext() == false) goto L5;
        super.zza(r2.next());
        goto L3
    L5:
        return this;
    }

    public zzah(int r1) {
        super(4);
    }
}
