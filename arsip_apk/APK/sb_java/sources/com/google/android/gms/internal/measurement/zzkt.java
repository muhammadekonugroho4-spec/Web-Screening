package com.google.android.gms.internal.measurement;

import java.util.Map;

/* loaded from: classes5.dex */
final class zzkt<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, zzkq> zza;

    public /* synthetic */ zzkt(Map.Entry r1, zzkv r2) {
        this(r1);
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.zza.getValue() != null) goto L7;
        return null;
    L7:
        throw new NoSuchMethodError();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object r2) {
        if ((r2 instanceof zzlm) == false) goto L7;
        return this.zza.getValue().zza((zzlm) r2);
    L7:
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final zzkq zza() {
        return this.zza.getValue();
    }

    private zzkt(Map.Entry<K, zzkq> r1) {
        this.zza = r1;
    }
}
