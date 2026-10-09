package com.google.android.gms.internal.measurement;

/* loaded from: classes5.dex */
public enum zzng extends Enum<zzng> {
    public static final zzng zza = null;
    public static final zzng zzb = null;
    public static final zzng zzc = null;
    public static final zzng zzd = null;
    public static final zzng zze = null;
    public static final zzng zzf = null;
    public static final zzng zzg = null;
    public static final zzng zzh = null;
    public static final zzng zzi = null;
    public static final zzng zzj = null;
    public static final zzng zzk = null;
    public static final zzng zzl = null;
    public static final zzng zzm = null;
    public static final zzng zzn = null;
    public static final zzng zzo = null;
    public static final zzng zzp = null;
    public static final zzng zzq = null;
    public static final zzng zzr = null;
    private static final /* synthetic */ zzng[] zzs = null;
    private final zznj zzt;
    private final int zzu;

    static {
        zzng r02 = new zzng("DOUBLE", 0, zznj.zzd, 1);
        zza = r02;
        zzng r1 = new zzng("FLOAT", 1, zznj.zzc, 5);
        zzb = r1;
        zznj r5 = zznj.zzb;
        zzng r2 = new zzng("INT64", 2, r5, 0);
        zzc = r2;
        zzng r7 = new zzng("UINT64", 3, r5, 0);
        zzd = r7;
        zznj r11 = zznj.zza;
        zzng r9 = new zzng("INT32", 4, r11, 0);
        zze = r9;
        zzng r12 = new zzng("FIXED64", 5, r5, 1);
        zzf = r12;
        zzng r14 = new zzng("FIXED32", 6, r11, 5);
        zzg = r14;
        zzng r15 = new zzng("BOOL", 7, zznj.zze, 0);
        zzh = r15;
        zznf r20 = new zznf("STRING", 8, zznj.zzf, 2, null);
        zzi = r20;
        zznj r24 = zznj.zzi;
        zzni r21 = new zzni("GROUP", 9, r24, 3, null);
        zzj = r21;
        zznh r22 = new zznh("MESSAGE", 10, r24, 2, null);
        zzk = r22;
        zznk r23 = new zznk("BYTES", 11, zznj.zzg, 2, null);
        zzl = r23;
        zzng r10 = new zzng("UINT32", 12, r11, 0);
        zzm = r10;
        zzng r13 = new zzng("ENUM", 13, zznj.zzh, 0);
        zzn = r13;
        zzng r4 = new zzng("SFIXED32", 14, r11, 5);
        zzo = r4;
        zzng r3 = new zzng("SFIXED64", 15, r5, 1);
        zzp = r3;
        zzng r03 = new zzng("SINT32", 16, r11, 0);
        zzq = r03;
        zzng r6 = new zzng("SINT64", 17, r5, 0);
        zzr = r6;
        zzs = new zzng[]{r02, r1, r2, r7, r9, r12, r14, r15, r20, r21, r22, r23, r10, r13, r4, r3, r03, r6};
    }

    /* synthetic */ zzng(String r1, int r2, zznj r3, int r4, zznm r5) {
        this(r1, r2, r3, r4);
    }

    public static zzng[] values() {
        return (zzng[]) zzs.clone();
    }

    public final int zza() {
        return this.zzu;
    }

    public final zznj zzb() {
        return this.zzt;
    }

    zzng(String r1, int r2, zznj r3, int r4) {
        this.zzt = r3;
        this.zzu = r4;
    }
}
