package com.google.android.gms.measurement.internal;

/* loaded from: classes5.dex */
enum zzam extends Enum<zzam> {
    public static final zzam zza = null;
    public static final zzam zzb = null;
    public static final zzam zzc = null;
    public static final zzam zzd = null;
    public static final zzam zze = null;
    public static final zzam zzf = null;
    public static final zzam zzg = null;
    public static final zzam zzh = null;
    public static final zzam zzi = null;
    private static final zzam zzj = null;
    private static final /* synthetic */ zzam[] zzk = null;
    private final char zzl;

    static {
        zzam r02 = new zzam("UNSET", 0, '0');
        zza = r02;
        zzam r1 = new zzam("REMOTE_DEFAULT", 1, '1');
        zzb = r1;
        zzam r2 = new zzam("REMOTE_DELEGATION", 2, '2');
        zzc = r2;
        zzam r3 = new zzam("MANIFEST", 3, '3');
        zzd = r3;
        zzam r4 = new zzam("INITIALIZATION", 4, '4');
        zze = r4;
        zzam r5 = new zzam("API", 5, '5');
        zzf = r5;
        zzam r6 = new zzam("CHILD_ACCOUNT", 6, '6');
        zzj = r6;
        zzam r7 = new zzam("TCF", 7, '7');
        zzg = r7;
        zzam r8 = new zzam("REMOTE_ENFORCED_DEFAULT", 8, '8');
        zzh = r8;
        zzam r9 = new zzam("FAILSAFE", 9, '9');
        zzi = r9;
        zzk = new zzam[]{r02, r1, r2, r3, r4, r5, r6, r7, r8, r9};
    }

    zzam(String r1, int r2, char r3) {
        this.zzl = r3;
    }

    public static zzam[] values() {
        return (zzam[]) zzk.clone();
    }

    public static /* bridge */ /* synthetic */ char zza(zzam r02) {
        return r02.zzl;
    }

    public static zzam zza(char r5) {
        zzam[] r02 = values();
        int r1 = r02.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L9;
        zzam r3 = r02[r2];
        if (r3.zzl == r5) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return r3;
    L9:
        return zza;
    }
}
