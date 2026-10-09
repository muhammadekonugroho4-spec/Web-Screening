package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes5.dex */
public enum zzanh extends Enum<zzanh> {
    public static final zzanh zza = null;
    public static final zzanh zzb = null;
    public static final zzanh zzc = null;
    public static final zzanh zzd = null;
    public static final zzanh zze = null;
    public static final zzanh zzf = null;
    public static final zzanh zzg = null;
    public static final zzanh zzh = null;
    public static final zzanh zzi = null;
    public static final zzanh zzj = null;
    public static final zzanh zzk = null;
    public static final zzanh zzl = null;
    public static final zzanh zzm = null;
    public static final zzanh zzn = null;
    public static final zzanh zzo = null;
    public static final zzanh zzp = null;
    public static final zzanh zzq = null;
    public static final zzanh zzr = null;
    private static final /* synthetic */ zzanh[] zzs = null;
    private final zzank zzt;
    private final int zzu;

    static {
        zzanh r02 = new zzanh("DOUBLE", 0, zzank.zzd, 1);
        zza = r02;
        zzanh r1 = new zzanh("FLOAT", 1, zzank.zzc, 5);
        zzb = r1;
        zzank r5 = zzank.zzb;
        zzanh r2 = new zzanh("INT64", 2, r5, 0);
        zzc = r2;
        zzanh r7 = new zzanh("UINT64", 3, r5, 0);
        zzd = r7;
        zzank r11 = zzank.zza;
        zzanh r9 = new zzanh("INT32", 4, r11, 0);
        zze = r9;
        zzanh r12 = new zzanh("FIXED64", 5, r5, 1);
        zzf = r12;
        zzanh r14 = new zzanh("FIXED32", 6, r11, 5);
        zzg = r14;
        zzanh r15 = new zzanh("BOOL", 7, zzank.zze, 0);
        zzh = r15;
        zzang r20 = new zzang("STRING", 8, zzank.zzf, 2, null);
        zzi = r20;
        zzank r24 = zzank.zzi;
        zzanj r21 = new zzanj("GROUP", 9, r24, 3, null);
        zzj = r21;
        zzani r22 = new zzani("MESSAGE", 10, r24, 2, null);
        zzk = r22;
        zzanl r23 = new zzanl("BYTES", 11, zzank.zzg, 2, null);
        zzl = r23;
        zzanh r10 = new zzanh("UINT32", 12, r11, 0);
        zzm = r10;
        zzanh r13 = new zzanh("ENUM", 13, zzank.zzh, 0);
        zzn = r13;
        zzanh r4 = new zzanh("SFIXED32", 14, r11, 5);
        zzo = r4;
        zzanh r3 = new zzanh("SFIXED64", 15, r5, 1);
        zzp = r3;
        zzanh r03 = new zzanh("SINT32", 16, r11, 0);
        zzq = r03;
        zzanh r6 = new zzanh("SINT64", 17, r5, 0);
        zzr = r6;
        zzs = new zzanh[]{r02, r1, r2, r7, r9, r12, r14, r15, r20, r21, r22, r23, r10, r13, r4, r3, r03, r6};
    }

    /* synthetic */ zzanh(String r1, int r2, zzank r3, int r4, zzann r5) {
        this(r1, r2, r3, r4);
    }

    public static zzanh[] values() {
        return (zzanh[]) zzs.clone();
    }

    public final int zza() {
        return this.zzu;
    }

    public final zzank zzb() {
        return this.zzt;
    }

    zzanh(String r1, int r2, zzank r3, int r4) {
        this.zzt = r3;
        this.zzu = r4;
    }
}
