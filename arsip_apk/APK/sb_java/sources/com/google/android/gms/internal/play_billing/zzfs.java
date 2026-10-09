package com.google.android.gms.internal.play_billing;

import java.util.Map;

/* loaded from: classes5.dex */
final class zzfs implements Map.Entry {
    private final Map.Entry zza;

    public /* synthetic */ zzfs(Map.Entry r1, zzfu r2) {
        this.zza = r1;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((zzfv) this.zza.getValue()) != null) goto L5;
        return null;
    L5:
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object r2) {
        if ((r2 instanceof zzgl) == false) goto L7;
        return ((zzfv) this.zza.getValue()).zzc((zzgl) r2);
    L7:
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final zzfv zza() {
        return (zzfv) this.zza.getValue();
    }
}
