package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.ActionCodeEmailInfo;

/* loaded from: classes6.dex */
public final class zzt extends ActionCodeEmailInfo {
    private final String zza;

    public zzt(String r1, String r2) {
        this.email = Preconditions.checkNotEmpty(r1);
        this.zza = Preconditions.checkNotEmpty(r2);
    }

    @Override // com.google.firebase.auth.ActionCodeEmailInfo
    public final String getPreviousEmail() {
        return this.zza;
    }
}
