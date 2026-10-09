package com.google.android.recaptcha.internal;

/* loaded from: classes5.dex */
public enum zzno extends Enum {
    public static final zzno zza = null;
    public static final zzno zzb = null;
    public static final zzno zzc = null;
    public static final zzno zzd = null;
    public static final zzno zze = null;
    public static final zzno zzf = null;
    public static final zzno zzg = null;
    public static final zzno zzh = null;
    public static final zzno zzi = null;
    public static final zzno zzj = null;
    private static final /* synthetic */ zzno[] zzk = null;
    private final Class zzl;

    static {
        zzno r02 = new zzno("VOID", 0, Void.class, Void.class, null);
        zza = r02;
        Class r4 = Integer.TYPE;
        zzno r1 = new zzno("INT", 1, r4, Integer.class, 0);
        zzb = r1;
        zzno r2 = new zzno("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = r2;
        Float r10 = Float.valueOf(0.0f);
        zzno r3 = new zzno("FLOAT", 3, Float.TYPE, Float.class, r10);
        zzd = r3;
        Double r102 = Double.valueOf(0.0d);
        zzno r5 = new zzno("DOUBLE", 4, Double.TYPE, Double.class, r102);
        zze = r5;
        Boolean r11 = Boolean.FALSE;
        zzno r6 = new zzno("BOOLEAN", 5, Boolean.TYPE, Boolean.class, r11);
        zzf = r6;
        zzno r7 = new zzno("STRING", 6, String.class, String.class, "");
        zzg = r7;
        zzno r72 = new zzno("BYTE_STRING", 7, zzle.class, zzle.class, zzle.zzb);
        zzh = r72;
        zzno r73 = new zzno("ENUM", 8, r4, Integer.class, null);
        zzi = r73;
        zzno r9 = new zzno("MESSAGE", 9, Object.class, Object.class, null);
        zzj = r9;
        zzk = new zzno[]{r02, r1, r2, r3, r5, r6, r7, r72, r73, r9};
    }

    zzno(String r1, int r2, Class r3, Class r4, Object r5) {
        this.zzl = r4;
    }

    public static zzno[] values() {
        return (zzno[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzl;
    }
}
