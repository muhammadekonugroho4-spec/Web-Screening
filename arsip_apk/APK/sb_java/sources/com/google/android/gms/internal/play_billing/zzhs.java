package com.google.android.gms.internal.play_billing;

/* loaded from: classes5.dex */
public enum zzhs extends Enum {
    public static final zzhs zza = null;
    public static final zzhs zzb = null;
    public static final zzhs zzc = null;
    public static final zzhs zzd = null;
    public static final zzhs zze = null;
    public static final zzhs zzf = null;
    public static final zzhs zzg = null;
    public static final zzhs zzh = null;
    public static final zzhs zzi = null;
    public static final zzhs zzj = null;
    public static final zzhs zzk = null;
    public static final zzhs zzl = null;
    public static final zzhs zzm = null;
    public static final zzhs zzn = null;
    public static final zzhs zzo = null;
    public static final zzhs zzp = null;
    public static final zzhs zzq = null;
    public static final zzhs zzr = null;
    private static final /* synthetic */ zzhs[] zzs = null;
    private final zzht zzt;
    private final int zzu;

    static {
        zzhs r1 = new zzhs("DOUBLE", 0, zzht.zzd, 1);
        zza = r1;
        zzhs r2 = new zzhs("FLOAT", 1, zzht.zzc, 5);
        zzb = r2;
        zzht r5 = zzht.zzb;
        zzhs r02 = new zzhs("INT64", 2, r5, 0);
        zzc = r02;
        zzhs r7 = new zzhs("UINT64", 3, r5, 0);
        zzd = r7;
        zzht r11 = zzht.zza;
        zzhs r9 = new zzhs("INT32", 4, r11, 0);
        zze = r9;
        zzhs r12 = new zzhs("FIXED64", 5, r5, 1);
        zzf = r12;
        zzhs r72 = new zzhs("FIXED32", 6, r11, 5);
        zzg = r72;
        zzhs r14 = new zzhs("BOOL", 7, zzht.zze, 0);
        zzh = r14;
        zzhs r92 = new zzhs("STRING", 8, zzht.zzf, 2);
        zzi = r92;
        zzht r6 = zzht.zzi;
        zzhs r3 = new zzhs("GROUP", 9, r6, 3);
        zzj = r3;
        zzhs r8 = new zzhs("MESSAGE", 10, r6, 2);
        zzk = r8;
        zzhs r122 = new zzhs("BYTES", 11, zzht.zzg, 2);
        zzl = r122;
        zzhs r13 = new zzhs("UINT32", 12, r11, 0);
        zzm = r13;
        zzhs r142 = new zzhs("ENUM", 13, zzht.zzh, 0);
        zzn = r142;
        zzhs r15 = new zzhs("SFIXED32", 14, r11, 5);
        zzo = r15;
        zzhs r03 = new zzhs("SFIXED64", 15, r5, 1);
        zzp = r03;
        zzhs r16 = new zzhs("SINT32", 16, r11, 0);
        zzq = r16;
        zzhs r22 = new zzhs("SINT64", 17, r5, 0);
        zzr = r22;
        zzs = new zzhs[]{r1, r2, r02, r7, r9, r12, r72, r14, r92, r3, r8, r122, r13, r142, r15, r03, r16, r22};
    }

    zzhs(String r1, int r2, zzht r3, int r4) {
        this.zzt = r3;
        this.zzu = r4;
    }

    public static zzhs[] values() {
        return (zzhs[]) zzs.clone();
    }

    public final zzht zza() {
        return this.zzt;
    }
}
