package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzjj;
import com.iab.digitalidentity.sdk.core.model.GoPayPlusCameraConfigKt;
import java.util.EnumMap;

/* loaded from: classes5.dex */
final class zzan {
    private final EnumMap<zzjj.zza, zzam> zza;

    public zzan() {
        this.zza = new EnumMap(zzjj.zza.class);
    }

    public final String toString() {
        StringBuilder r02 = new StringBuilder(GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A);
        zzjj.zza[] r1 = zzjj.zza.values();
        int r2 = r1.length;
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L9;
        zzjj.zza r4 = r1[r3];
        zzam r42 = this.zza.get(r4);
        if (r42 != null) goto L7;
        r42 = zzam.zza;
    L7:
        r02.append(zzam.zza(r42));
        r3 = r3 + 1;
        goto L3
    L9:
        return r02.toString();
    }

    public final zzam zza(zzjj.zza r2) {
        zzam r22 = this.zza.get(r2);
        if (r22 == null) goto L5;
        return r22;
    L5:
        return zzam.zza;
    }

    private zzan(EnumMap<zzjj.zza, zzam> r3) {
        EnumMap<zzjj.zza, zzam> r02 = new EnumMap(zzjj.zza.class);
        this.zza = r02;
        r02.putAll(r3);
    }

    public static zzan zza(String r7) {
        EnumMap r02 = new EnumMap(zzjj.zza.class);
        if (r7.length() < zzjj.zza.values().length) goto L13;
        int r1 = 0;
        if (r7.charAt(0) != '1') goto L13;
        zzjj.zza[] r2 = zzjj.zza.values();
        int r3 = r2.length;
        int r4 = 1;
    L8:
        if (r1 >= r3) goto L11;
        int r6 = r4 + 1;
        r02.put(r2[r1], zzam.zza(r7.charAt(r4)));
        r1 = r1 + 1;
        r4 = r6;
        goto L8
    L11:
        return new zzan(r02);
    L13:
        return new zzan();
    }

    public final void zza(zzjj.zza r3, int r4) {
        zzam r02 = zzam.zza;
        if (r4 != (-30)) goto L5;
        r02 = zzam.zzg;
    L16:
        this.zza.put(r3, r02);
        return;
    L5:
        if (r4 != (-20)) goto L7;
    L14:
        r02 = zzam.zzf;
        goto L16
    L7:
        if (r4 == (-10)) goto L13;
        if (r4 == 0) goto L14;
        if (r4 != 30) goto L16;
        r02 = zzam.zze;
        goto L16
    L13:
        r02 = zzam.zzd;
        goto L16
    }

    public final void zza(zzjj.zza r2, zzam r3) {
        this.zza.put(r2, r3);
    }
}
