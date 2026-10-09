package com.google.android.gms.internal.common;

import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes5.dex */
final class zzy implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzaa zzb;

    public zzy(zzaa r1, CharSequence r2) {
        this.zza = r2;
        this.zzb = r1;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return zzaa.zze(this.zzb, this.zza);
    }

    public final String toString() {
        StringBuilder r1 = new StringBuilder();
        r1.append('[');
        Iterator r2 = iterator();
    L10:
        e = move-exception;
        throw new AssertionError(e);
    L4:
        if (r2.hasNext() == false) goto L12;
        r1.append(zzt.zza(r2.next(), ", "));     // Catch: IOException -> L10
    L6:
        if (r2.hasNext() == false) goto L12;
        r1.append(", ");     // Catch: IOException -> L10
        r1.append(zzt.zza(r2.next(), ", "));     // Catch: IOException -> L10
    L12:
        r1.append(']');
        return r1.toString();
    }
}
