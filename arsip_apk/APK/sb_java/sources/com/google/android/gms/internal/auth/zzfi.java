package com.google.android.gms.internal.auth;

/* loaded from: classes5.dex */
final class zzfi extends zzfk {
    public /* synthetic */ zzfi(zzfh r1) {
        super(null);
    }

    @Override // com.google.android.gms.internal.auth.zzfk
    public final void zza(Object r1, long r2) {
        ((zzey) zzhi.zzf(r1, r2)).zzb();
    }

    @Override // com.google.android.gms.internal.auth.zzfk
    public final void zzb(Object r5, Object r6, long r7) {
        zzey r02 = (zzey) zzhi.zzf(r5, r7);
        zzey r62 = (zzey) zzhi.zzf(r6, r7);
        int r1 = r02.size();
        int r2 = r62.size();
        if (r1 <= 0) goto L9;
        if (r2 <= 0) goto L9;
        if (r02.zzc() == true) goto L8;
        r02 = r02.zzd(r2 + r1);
    L8:
        r02.addAll(r62);
    L9:
        if (r1 <= 0) goto L12;
        r62 = r02;
    L12:
        zzhi.zzp(r5, r7, r62);
    }

    private zzfi() {
        super(null);
    }
}
