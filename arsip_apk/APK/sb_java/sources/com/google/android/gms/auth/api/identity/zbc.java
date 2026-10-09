package com.google.android.gms.auth.api.identity;

import android.os.Bundle;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

/* loaded from: classes5.dex */
public final class zbc implements Api.ApiOptions.Optional {
    private final String zba;

    public zbc(String r1) {
        this.zba = r1;
    }

    public final boolean equals(Object r1) {
        return r1 instanceof zbc;
    }

    public final int hashCode() {
        return Objects.hashCode(new Object[]{zbc.class});
    }

    public final Bundle zba() {
        Bundle r02 = new Bundle();
        r02.putString("session_id", this.zba);
        return r02;
    }

    public final String zbb() {
        return this.zba;
    }
}
