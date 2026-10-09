package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.PhoneAuthCredential;

/* loaded from: classes5.dex */
public final class zzaex {
    public static zzaih zza(PhoneAuthCredential r2) {
        if (TextUtils.isEmpty(r2.zzd()) == true) goto L7;
        return zzaih.zzb(r2.zzb(), r2.zzd(), r2.zze());
    L7:
        return zzaih.zza(r2.zzc(), r2.getSmsCode(), r2.zze());
    }
}
