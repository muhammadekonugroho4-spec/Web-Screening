package com.google.android.gms.auth.api.identity;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes5.dex */
public final class zbb {
    private String zba;

    private zbb() {
    }

    public static final zbb zbc(zbc r1) {
        String r12 = r1.zbb();
        zbb r02 = new zbb();
        if (r12 == null) goto L5;
        r02.zba = Preconditions.checkNotEmpty(r12);
    L5:
        return r02;
    }

    public final zbb zba(String r1) {
        this.zba = Preconditions.checkNotEmpty(r1);
        return this;
    }

    public final zbc zbb() {
        return new zbc(this.zba);
    }

    public /* synthetic */ zbb(zba r1) {
    }
}
