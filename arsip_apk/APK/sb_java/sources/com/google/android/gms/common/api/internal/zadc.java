package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes5.dex */
public final class zadc {
    public static final Status zaa = null;
    final Set zab;
    private final zadb zac;

    static {
        zaa = new Status(8, "The connection to Google Play services was lost");
    }

    public zadc() {
        this.zab = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.zac = new zadb(this);
    }

    public final void zaa(BasePendingResult r2) {
        this.zab.add(r2);
        r2.zan(this.zac);
    }

    public final void zab() {
        int r1 = 0;
        BasePendingResult[] r02 = (BasePendingResult[]) this.zab.toArray(new BasePendingResult[0]);
        int r2 = r02.length;
    L3:
        if (r1 >= r2) goto L8;
        BasePendingResult r3 = r02[r1];
        r3.zan(null);
        if (r3.zam() == false) goto L7;
        this.zab.remove(r3);
    L7:
        r1 = r1 + 1;
        goto L3
    }
}
