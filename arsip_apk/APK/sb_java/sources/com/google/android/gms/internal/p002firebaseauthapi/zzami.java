package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;

/* loaded from: classes5.dex */
final class zzami extends zzamn {
    private final /* synthetic */ zzamh zza;

    public /* synthetic */ zzami(zzamh r1, zzamm r2) {
        this(r1);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzamj(this.zza, null);
    }

    private zzami(zzamh r2) {
        this.zza = r2;
        super(r2, null);
    }
}
