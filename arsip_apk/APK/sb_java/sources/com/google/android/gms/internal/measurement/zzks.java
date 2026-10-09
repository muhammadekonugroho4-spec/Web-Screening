package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
final class zzks<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> zza;

    public zzks(Iterator<Map.Entry<K, Object>> r1) {
        this.zza = r1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> r02 = this.zza.next();
        if ((r02.getValue() instanceof zzkq) == true) goto L5;
        return r02;
    L5:
        return new zzkt(r02, null);
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
    }
}
