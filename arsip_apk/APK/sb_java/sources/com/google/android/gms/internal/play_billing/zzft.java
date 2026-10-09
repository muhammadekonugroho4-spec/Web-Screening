package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
final class zzft implements Iterator {
    private final Iterator zza;

    public zzft(Iterator r1) {
        this.zza = r1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry r02 = (Map.Entry) this.zza.next();
        if ((r02.getValue() instanceof zzfv) == true) goto L5;
        return r02;
    L5:
        return new zzfs(r02, null);
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
    }
}
