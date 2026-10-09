package com.google.android.recaptcha.internal;

import android.content.Context;

/* loaded from: classes5.dex */
public final class zzia implements zzih {
    private final Context zza;

    public zzia(Context r1) {
        this.zza = r1;
    }

    @Override // com.google.android.recaptcha.internal.zzih
    public final /* synthetic */ Object cs(Object[] r1) {
        return zzie.zza(this, r1);
    }

    @Override // com.google.android.recaptcha.internal.zzih
    public final Object zza(Object... r1) {
        return zzap.zza(this.zza.getContentResolver());
    }
}
