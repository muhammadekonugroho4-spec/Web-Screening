package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.ActionCodeMultiFactorInfo;
import com.google.firebase.auth.MultiFactorInfo;

/* loaded from: classes6.dex */
public final class zzv extends ActionCodeMultiFactorInfo {
    private final MultiFactorInfo zza;

    public zzv(String r1, MultiFactorInfo r2) {
        this.email = Preconditions.checkNotEmpty(r1);
        this.zza = (MultiFactorInfo) Preconditions.checkNotNull(r2);
    }

    @Override // com.google.firebase.auth.ActionCodeMultiFactorInfo
    public final MultiFactorInfo getMultiFactorInfo() {
        return this.zza;
    }
}
