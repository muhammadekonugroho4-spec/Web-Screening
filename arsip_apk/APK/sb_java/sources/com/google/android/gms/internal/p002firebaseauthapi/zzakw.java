package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;

/* loaded from: classes5.dex */
final class zzakw implements zzakx {
    public zzakw() {
    }

    private static <E> zzakn<E> zzc(Object r02, long r1) {
        return (zzakn) zzana.zze(r02, r1);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakx
    public final <L> List<L> zza(Object r3, long r4) {
        zzakn r02 = zzc(r3, r4);
        if (r02.zzc() == true) goto L10;
        int r1 = r02.size();
        if (r1 != 0) goto L7;
        int r12 = 10;
    L8:
        zzakn r03 = r02.zza(r12);
        zzana.zza(r3, r4, r03);
        return r03;
    L7:
        r12 = r1 << 1;
        goto L8
    L10:
        return r02;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakx
    public final void zzb(Object r1, long r2) {
        zzc(r1, r2).zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakx
    public final <E> void zza(Object r5, Object r6, long r7) {
        zzakn r02 = zzc(r5, r7);
        zzakn r62 = zzc(r6, r7);
        int r1 = r02.size();
        int r2 = r62.size();
        if (r1 <= 0) goto L9;
        if (r2 <= 0) goto L9;
        if (r02.zzc() == true) goto L8;
        r02 = r02.zza(r2 + r1);
    L8:
        r02.addAll(r62);
    L9:
        if (r1 <= 0) goto L11;
        r62 = r02;
    L11:
        zzana.zza(r5, r7, r62);
    }
}
