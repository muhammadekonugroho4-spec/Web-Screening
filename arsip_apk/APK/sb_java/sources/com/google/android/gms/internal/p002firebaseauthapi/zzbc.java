package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes5.dex */
public final class zzbc {
    static {
    }

    public static long zza(long r10, long r12) {
        long r02 = r10 + r12;
        boolean r3 = false;
        if ((r10 ^ r12) >= 0) goto L5;
        boolean r2 = true;
    L7:
        if ((r10 ^ r02) < 0) goto L9;
        r3 = true;
    L9:
        zzbb.zza(r2 | r3, "checkedAdd", r10, r12);
        return r02;
    L5:
        r2 = false;
        goto L7
    }

    public static long zzb(long r8, long r10) {
        long r02 = r8 - 1;
        boolean r11 = false;
        if ((1 ^ r8) < 0) goto L5;
        boolean r102 = true;
    L7:
        if ((r8 ^ r02) < 0) goto L9;
        r11 = true;
    L9:
        zzbb.zza(r102 | r11, "checkedSubtract", r8, 1);
        return r02;
    L5:
        r102 = false;
        goto L7
    }
}
