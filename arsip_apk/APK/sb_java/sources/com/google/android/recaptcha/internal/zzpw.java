package com.google.android.recaptcha.internal;

/* loaded from: classes5.dex */
public enum zzpw extends Enum {
    public static final zzpw zza = null;
    public static final zzpw zzb = null;
    public static final zzpw zzc = null;
    public static final zzpw zzd = null;
    public static final zzpw zze = null;
    public static final zzpw zzf = null;
    public static final zzpw zzg = null;
    public static final zzpw zzh = null;
    public static final zzpw zzi = null;
    public static final zzpw zzj = null;
    public static final zzpw zzk = null;
    public static final zzpw zzl = null;
    public static final zzpw zzm = null;
    public static final zzpw zzn = null;
    public static final zzpw zzo = null;
    public static final zzpw zzp = null;
    public static final zzpw zzq = null;
    public static final zzpw zzr = null;
    private static final /* synthetic */ zzpw[] zzs = null;
    private final zzpx zzt;

    static {
        zzpw r1 = new zzpw("DOUBLE", 0, zzpx.zzd, 1);
        zza = r1;
        zzpw r2 = new zzpw("FLOAT", 1, zzpx.zzc, 5);
        zzb = r2;
        zzpx r5 = zzpx.zzb;
        zzpw r02 = new zzpw("INT64", 2, r5, 0);
        zzc = r02;
        zzpw r7 = new zzpw("UINT64", 3, r5, 0);
        zzd = r7;
        zzpx r11 = zzpx.zza;
        zzpw r9 = new zzpw("INT32", 4, r11, 0);
        zze = r9;
        zzpw r12 = new zzpw("FIXED64", 5, r5, 1);
        zzf = r12;
        zzpw r72 = new zzpw("FIXED32", 6, r11, 5);
        zzg = r72;
        zzpw r14 = new zzpw("BOOL", 7, zzpx.zze, 0);
        zzh = r14;
        zzpw r92 = new zzpw("STRING", 8, zzpx.zzf, 2);
        zzi = r92;
        zzpx r6 = zzpx.zzi;
        zzpw r3 = new zzpw("GROUP", 9, r6, 3);
        zzj = r3;
        zzpw r8 = new zzpw("MESSAGE", 10, r6, 2);
        zzk = r8;
        zzpw r122 = new zzpw("BYTES", 11, zzpx.zzg, 2);
        zzl = r122;
        zzpw r13 = new zzpw("UINT32", 12, r11, 0);
        zzm = r13;
        zzpw r142 = new zzpw("ENUM", 13, zzpx.zzh, 0);
        zzn = r142;
        zzpw r15 = new zzpw("SFIXED32", 14, r11, 5);
        zzo = r15;
        zzpw r03 = new zzpw("SFIXED64", 15, r5, 1);
        zzp = r03;
        zzpw r16 = new zzpw("SINT32", 16, r11, 0);
        zzq = r16;
        zzpw r22 = new zzpw("SINT64", 17, r5, 0);
        zzr = r22;
        zzs = new zzpw[]{r1, r2, r02, r7, r9, r12, r72, r14, r92, r3, r8, r122, r13, r142, r15, r03, r16, r22};
    }

    zzpw(String r1, int r2, zzpx r3, int r4) {
        this.zzt = r3;
    }

    public static zzpw[] values() {
        return (zzpw[]) zzs.clone();
    }

    public final zzpx zza() {
        return this.zzt;
    }
}
