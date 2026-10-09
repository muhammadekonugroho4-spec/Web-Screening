package com.google.android.recaptcha.internal;

import java.util.Map;

/* loaded from: classes5.dex */
final class zznp implements Map.Entry {
    private final Map.Entry zza;

    public /* synthetic */ zznp(Map.Entry r1, zznr r2) {
        this.zza = r1;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((zzns) this.zza.getValue()) != null) goto L5;
        return null;
    L5:
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object r2) {
        if ((r2 instanceof zzoi) == false) goto L7;
        return ((zzns) this.zza.getValue()).zzc((zzoi) r2);
    L7:
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final zzns zza() {
        return (zzns) this.zza.getValue();
    }
}
