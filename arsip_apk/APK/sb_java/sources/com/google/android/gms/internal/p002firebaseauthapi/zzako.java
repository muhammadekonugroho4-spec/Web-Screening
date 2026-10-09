package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes5.dex */
public enum zzako extends Enum<zzako> {
    public static final zzako zza = null;
    public static final zzako zzb = null;
    public static final zzako zzc = null;
    public static final zzako zzd = null;
    public static final zzako zze = null;
    public static final zzako zzf = null;
    public static final zzako zzg = null;
    public static final zzako zzh = null;
    public static final zzako zzi = null;
    public static final zzako zzj = null;
    private static final /* synthetic */ zzako[] zzk = null;
    private final Class<?> zzl;

    static {
        zzako r02 = new zzako("VOID", 0, Void.class, Void.class, null);
        zza = r02;
        Class r4 = Integer.TYPE;
        zzako r1 = new zzako("INT", 1, r4, Integer.class, 0);
        zzb = r1;
        zzako r2 = new zzako("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = r2;
        Float r10 = Float.valueOf(0.0f);
        zzako r3 = new zzako("FLOAT", 3, Float.TYPE, Float.class, r10);
        zzd = r3;
        Double r102 = Double.valueOf(0.0d);
        zzako r5 = new zzako("DOUBLE", 4, Double.TYPE, Double.class, r102);
        zze = r5;
        Boolean r11 = Boolean.FALSE;
        zzako r6 = new zzako("BOOLEAN", 5, Boolean.TYPE, Boolean.class, r11);
        zzf = r6;
        zzako r7 = new zzako("STRING", 6, String.class, String.class, "");
        zzg = r7;
        zzako r72 = new zzako("BYTE_STRING", 7, zzaiw.class, zzaiw.class, zzaiw.zza);
        zzh = r72;
        zzako r73 = new zzako("ENUM", 8, r4, Integer.class, null);
        zzi = r73;
        zzako r9 = new zzako("MESSAGE", 9, Object.class, Object.class, null);
        zzj = r9;
        zzk = new zzako[]{r02, r1, r2, r3, r5, r6, r7, r72, r73, r9};
    }

    zzako(String r1, int r2, Class r3, Class r4, Object r5) {
        this.zzl = r4;
    }

    public static zzako[] values() {
        return (zzako[]) zzk.clone();
    }

    public final Class<?> zza() {
        return this.zzl;
    }
}
