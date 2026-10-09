package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* loaded from: classes5.dex */
final class zzmk extends zzmp {
    private final /* synthetic */ zzmj zza;

    public /* synthetic */ zzmk(zzmj r1, zzmo r2) {
        this(r1);
    }

    @Override // com.google.android.gms.internal.measurement.zzmp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzml(this.zza, null);
    }

    private zzmk(zzmj r2) {
        this.zza = r2;
        super(r2, null);
    }
}
