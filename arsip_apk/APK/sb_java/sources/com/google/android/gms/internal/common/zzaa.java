package com.google.android.gms.internal.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzaa {
    private final zzr zza;
    private final boolean zzb;
    private final zzx zzc;

    private zzaa(zzx r1, boolean r2, zzr r3, int r4) {
        this.zzc = r1;
        this.zzb = r2;
        this.zza = r3;
    }

    public static /* bridge */ /* synthetic */ zzr zza(zzaa r02) {
        return r02.zza;
    }

    public static zzaa zzc(zzr r4) {
        return new zzaa(new zzx(r4), false, zzq.zza, Integer.MAX_VALUE);
    }

    public static /* bridge */ /* synthetic */ Iterator zze(zzaa r02, CharSequence r1) {
        return r02.zzh(r1);
    }

    public static /* bridge */ /* synthetic */ boolean zzg(zzaa r02) {
        return r02.zzb;
    }

    private final Iterator zzh(CharSequence r4) {
        zzx r1 = this.zzc;
        return new zzw(r1, this, r4, r1.zza);
    }

    public final zzaa zzb() {
        zzr r02 = this.zza;
        return new zzaa(this.zzc, true, r02, Integer.MAX_VALUE);
    }

    public final Iterable zzd(CharSequence r2) {
        return new zzy(this, r2);
    }

    public final List zzf(CharSequence r3) {
        r3.getClass();
        Iterator r32 = zzh(r3);
        ArrayList r02 = new ArrayList();
    L4:
        if (r32.hasNext() == false) goto L7;
        r02.add((String) r32.next());
        goto L4
    L7:
        return Collections.unmodifiableList(r02);
    }
}
