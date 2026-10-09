package com.google.firebase.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;

@KeepForSdk
/* loaded from: classes6.dex */
public class InternalTokenResult {
    private String zza;

    @KeepForSdk
    public InternalTokenResult(String r1) {
        this.zza = r1;
    }

    public boolean equals(Object r2) {
        if ((r2 instanceof InternalTokenResult) == true) goto L7;
        return false;
    L7:
        return Objects.equal(this.zza, ((InternalTokenResult) r2).zza);
    }

    @KeepForSdk
    public String getToken() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{this.zza});
    }

    public String toString() {
        return Objects.toStringHelper(this).add("token", this.zza).toString();
    }
}
