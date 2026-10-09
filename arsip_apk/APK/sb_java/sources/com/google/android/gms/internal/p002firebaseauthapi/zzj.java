package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes5.dex */
final class zzj extends zzk {
    static final zzf zza = null;

    static {
        zza = new zzj();
    }

    private zzj() {
        super("CharMatcher.none()");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzf
    public final boolean zza(char r1) {
        return false;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzf
    public final int zza(CharSequence r2, int r3) {
        zzw.zza(r3, r2.length(), FirebaseAnalytics.Param.INDEX);
        return -1;
    }
}
