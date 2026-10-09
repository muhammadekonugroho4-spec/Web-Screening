package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@KeepForSdk
/* loaded from: classes5.dex */
public class HashAccumulator {
    private int zaa;

    public HashAccumulator() {
        this.zaa = 1;
    }

    @CanIgnoreReturnValue
    @KeepForSdk
    public HashAccumulator addObject(Object r2) {
        int r02 = this.zaa * 31;
        if (r2 != null) goto L5;
        int r22 = 0;
    L6:
        this.zaa = r02 + r22;
        return this;
    L5:
        r22 = r2.hashCode();
        goto L6
    }

    @KeepForSdk
    public int hash() {
        return this.zaa;
    }

    @CanIgnoreReturnValue
    public final HashAccumulator zaa(boolean r2) {
        this.zaa = (this.zaa * 31) + (r2 ? 1 : 0);
        return this;
    }
}
