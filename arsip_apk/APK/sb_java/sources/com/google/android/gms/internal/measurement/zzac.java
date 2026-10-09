package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzac {
    private zzad zza;
    private zzad zzb;
    private List<zzad> zzc;

    public zzac() {
        this.zza = new zzad("", 0, null);
        this.zzb = new zzad("", 0, null);
        this.zzc = new ArrayList();
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzac r02 = new zzac((zzad) this.zza.clone());
        Iterator<zzad> r1 = this.zzc.iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        zzad r2 = r1.next();
        r02.zzc.add((zzad) r2.clone());
        goto L4
    L6:
        return r02;
    }

    public final zzad zza() {
        return this.zza;
    }

    public final zzad zzb() {
        return this.zzb;
    }

    public final List<zzad> zzc() {
        return this.zzc;
    }

    public final void zza(zzad r1) {
        this.zza = r1;
        this.zzb = (zzad) r1.clone();
        this.zzc.clear();
    }

    public final void zzb(zzad r1) {
        this.zzb = r1;
    }

    private zzac(zzad r1) {
        this.zza = r1;
        this.zzb = (zzad) r1.clone();
        this.zzc = new ArrayList();
    }

    public final void zza(String r6, long r7, Map<String, Object> r9) {
        HashMap r02 = new HashMap();
        Iterator<String> r1 = r9.keySet().iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        String r2 = r1.next();
        r02.put(r2, zzad.zza(r2, this.zza.zza(r2), r9.get(r2)));
        goto L4
    L6:
        this.zzc.add(new zzad(r6, r7, r02));
    }
}
