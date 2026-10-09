package com.google.android.recaptcha.internal;

/* loaded from: classes5.dex */
final class zzlp implements zznh {
    static final zznh zza = null;

    static {
        zza = new zzlp();
    }

    private zzlp() {
    }

    @Override // com.google.android.recaptcha.internal.zznh
    public final boolean zza(int r3) {
        zzlq r02 = zzlq.zza;
        if (r3 == 0) goto L25;
        if (r3 != 1) goto L6;
        zzlq r32 = zzlq.zzg;
    L26:
        if (r32 == null) goto L28;
        return true;
    L28:
        return false;
    L6:
        if (r3 != 2) goto L8;
        r32 = zzlq.zzh;
        goto L26
    L8:
        if (r3 != 900) goto L10;
        r32 = zzlq.zzb;
        goto L26
    L10:
        if (r3 == Integer.MAX_VALUE) goto L21;
        switch(r3) {
            case 998: goto L20;
            case 999: goto L19;
            case 1000: goto L18;
            case 1001: goto L17;
            default: goto L12;
        };
    L12:
        switch(r3) {
            case 99997: goto L16;
            case 99998: goto L15;
            case 99999: goto L14;
            default: goto L13;
        };
    L13:
        r32 = null;
        goto L26
    L14:
        r32 = zzlq.zzk;
        goto L26
    L15:
        r32 = zzlq.zzj;
        goto L26
    L16:
        r32 = zzlq.zzi;
        goto L26
    L17:
        r32 = zzlq.zzf;
        goto L26
    L18:
        r32 = zzlq.zze;
        goto L26
    L19:
        r32 = zzlq.zzd;
        goto L26
    L20:
        r32 = zzlq.zzc;
        goto L26
    L21:
        r32 = zzlq.zzl;
        goto L26
    L25:
        r32 = zzlq.zza;
        goto L26
    }
}
