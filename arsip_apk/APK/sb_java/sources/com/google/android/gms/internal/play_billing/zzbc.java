package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class zzbc {
    private final String zza;
    private final zzbb zzb;
    private zzbb zzc;

    public /* synthetic */ zzbc(String r1, zzbd r2) {
        zzbb r22 = new zzbb();
        this.zzb = r22;
        this.zzc = r22;
        r1.getClass();
        this.zza = r1;
    }

    public final String toString() {
        StringBuilder r02 = new StringBuilder(32);
        r02.append(this.zza);
        r02.append('{');
        zzbb r1 = this.zzb.zzb;
        String r2 = "";
    L3:
        if (r1 == null) goto L11;
        Object r3 = r1.zza;
        r02.append(r2);
        if (r3 != null) goto L7;
    L9:
        r02.append(r3);
    L10:
        r1 = r1.zzb;
        r2 = ", ";
        goto L3
    L7:
        if (r3.getClass().isArray() == false) goto L9;
        r02.append(Arrays.deepToString(new Object[]{r3}), 1, r2.length() - 1);
        goto L10
    L11:
        r02.append('}');
        return r02.toString();
    }

    public final zzbc zza(Object r3) {
        zzbb r02 = new zzbb();
        this.zzc.zzb = r02;
        this.zzc = r02;
        r02.zza = r3;
        return this;
    }
}
