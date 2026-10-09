package com.google.android.gms.internal.fido;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class zzam {
    private final String zza;
    private final zzak zzb;
    private zzak zzc;

    public /* synthetic */ zzam(String r2, zzal r3) {
        zzak r32 = new zzak(null);
        this.zzb = r32;
        this.zzc = r32;
        r2.getClass();
        this.zza = r2;
    }

    public final String toString() {
        StringBuilder r02 = new StringBuilder(32);
        r02.append(this.zza);
        r02.append('{');
        zzak r1 = this.zzb.zzc;
        String r2 = "";
    L3:
        if (r1 == null) goto L13;
        Object r3 = r1.zzb;
        r02.append(r2);
        String r22 = r1.zza;
        if (r22 == null) goto L7;
        r02.append(r22);
        r02.append('=');
    L7:
        if (r3 != null) goto L9;
    L11:
        r02.append(r3);
    L12:
        r1 = r1.zzc;
        r2 = ", ";
        goto L3
    L9:
        if (r3.getClass().isArray() == false) goto L11;
        r02.append(Arrays.deepToString(new Object[]{r3}), 1, r2.length() - 1);
        goto L12
    L13:
        r02.append('}');
        return r02.toString();
    }

    public final zzam zza(String r2, int r3) {
        String r22 = String.valueOf(r3);
        zzai r32 = new zzai(null);
        this.zzc.zzc = r32;
        this.zzc = r32;
        r32.zzb = r22;
        r32.zza = "errorCode";
        return this;
    }

    public final zzam zzb(String r3, Object r4) {
        zzak r02 = new zzak(null);
        this.zzc.zzc = r02;
        this.zzc = r02;
        r02.zzb = r4;
        r02.zza = r3;
        return this;
    }
}
