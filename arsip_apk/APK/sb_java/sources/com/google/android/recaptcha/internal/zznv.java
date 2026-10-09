package com.google.android.recaptcha.internal;

import java.util.List;

/* loaded from: classes5.dex */
final class zznv {
    public zznv() {
    }

    public static final List zza(Object r2, long r3) {
        zznk r02 = (zznk) zzps.zzf(r2, r3);
        if (r02.zzc() == true) goto L10;
        int r1 = r02.size();
        if (r1 != 0) goto L7;
        int r12 = 10;
    L8:
        zznk r03 = r02.zzd(r12);
        zzps.zzs(r2, r3, r03);
        return r03;
    L7:
        r12 = r1 + r1;
        goto L8
    L10:
        return r02;
    }
}
