package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
final class zzalj implements zzalg {
    public zzalj() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalg
    public final int zza(int r1, Object r2, Object r3) {
        zzalh r22 = (zzalh) r2;
        zzalf r32 = (zzalf) r3;
        if (r22.isEmpty() == false) goto L5;
        return 0;
    L5:
        Iterator r12 = r22.entrySet().iterator();
        if (r12.hasNext() == true) goto L8;
        return 0;
    L8:
        Map.Entry r13 = (Map.Entry) r12.next();
        r13.getKey();
        r13.getValue();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalg
    public final Object zzb(Object r1) {
        return zzalh.zza().zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalg
    public final Object zzc(Object r2) {
        ((zzalh) r2).zzc();
        return r2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalg
    public final Map<?, ?> zzd(Object r1) {
        return (zzalh) r1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalg
    public final Map<?, ?> zze(Object r1) {
        return (zzalh) r1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalg
    public final boolean zzf(Object r1) {
        if (((zzalh) r1).zzd() == true) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalg
    public final zzale<?, ?> zza(Object r1) {
        zzalf r12 = (zzalf) r1;
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalg
    public final Object zza(Object r2, Object r3) {
        zzalh r22 = (zzalh) r2;
        zzalh r32 = (zzalh) r3;
        if (r32.isEmpty() == false) goto L5;
    L8:
        return r22;
    L5:
        if (r22.zzd() == true) goto L7;
        r22 = r22.zzb();
    L7:
        r22.zza(r32);
        goto L8
    }
}
