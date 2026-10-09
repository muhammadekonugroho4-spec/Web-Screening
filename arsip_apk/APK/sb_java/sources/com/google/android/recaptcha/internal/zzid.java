package com.google.android.recaptcha.internal;

import android.content.Context;

/* loaded from: classes5.dex */
public final class zzid implements zzih {
    private final Context zza;

    public zzid(Context r1) {
        this.zza = r1;
    }

    @Override // com.google.android.recaptcha.internal.zzih
    public final /* synthetic */ Object cs(Object[] r1) {
        return zzie.zza(this, r1);
    }

    @Override // com.google.android.recaptcha.internal.zzih
    public final Object zza(Object... r3) {
        return this.zza.getSharedPreferences("_GRECAPTCHA", 0);
    }
}
