package com.google.android.gms.tasks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes5.dex */
final class zzaa implements Continuation {
    final /* synthetic */ Collection zza;

    public zzaa(Collection r1) {
        this.zza = r1;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ Object then(Task r3) throws Exception {
        ArrayList r32 = new ArrayList();
        Iterator r02 = this.zza.iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        r32.add(((Task) r02.next()).getResult());
        goto L4
    L6:
        return r32;
    }
}
