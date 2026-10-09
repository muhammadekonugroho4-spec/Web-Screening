package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes5.dex */
public abstract class zzf {
    public zzf() {
    }

    public int zza(CharSequence r3, int r4) {
        int r02 = r3.length();
        zzw.zza(r4, r02, FirebaseAnalytics.Param.INDEX);
    L3:
        if (r4 >= r02) goto L8;
        if (zza(r3.charAt(r4)) == true) goto L6;
        r4 = r4 + 1;
        goto L3
    L6:
        return r4;
    L8:
        return -1;
    }

    public abstract boolean zza(char r1);
}
