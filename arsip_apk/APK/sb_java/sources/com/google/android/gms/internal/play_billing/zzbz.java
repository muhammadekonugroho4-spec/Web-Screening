package com.google.android.gms.internal.play_billing;

/* loaded from: classes5.dex */
public final class zzbz {
    public static Object[] zza(Object[] r2, int r3) {
        int r02 = 0;
    L3:
        if (r02 >= r3) goto L9;
        if (r2[r02] == null) goto L8;
        r02 = r02 + 1;
        goto L3
    L8:
        throw new NullPointerException("at index " + r02);
    L9:
        return r2;
    }
}
