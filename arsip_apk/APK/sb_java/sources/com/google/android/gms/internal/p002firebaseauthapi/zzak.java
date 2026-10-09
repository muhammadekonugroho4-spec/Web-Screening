package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes5.dex */
public class zzak<E> {
    public zzak() {
    }

    public static int zza(int r1, int r2) {
        if (r2 < 0) goto L12;
        if (r2 > r1) goto L5;
        return r1;
    L5:
        int r12 = (r1 + (r1 >> 1)) + 1;
        if (r12 >= r2) goto L8;
        r12 = Integer.highestOneBit(r2 - 1) << 1;
    L8:
        if (r12 >= 0) goto L13;
        return Integer.MAX_VALUE;
    L13:
        return r12;
    L12:
        throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
    }
}
