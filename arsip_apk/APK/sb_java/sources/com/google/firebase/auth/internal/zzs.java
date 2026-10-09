package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.ActionCodeInfo;

/* loaded from: classes6.dex */
public final class zzs extends ActionCodeInfo {
    public zzs(String r1) {
        this.email = Preconditions.checkNotEmpty(r1);
    }
}
