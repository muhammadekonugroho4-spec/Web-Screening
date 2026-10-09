package com.google.android.recaptcha.internal;

/* loaded from: classes5.dex */
public enum zzlq extends Enum implements zznf {
    public static final zzlq zza = null;
    public static final zzlq zzb = null;
    public static final zzlq zzc = null;
    public static final zzlq zzd = null;
    public static final zzlq zze = null;
    public static final zzlq zzf = null;
    public static final zzlq zzg = null;
    public static final zzlq zzh = null;
    public static final zzlq zzi = null;
    public static final zzlq zzj = null;
    public static final zzlq zzk = null;
    public static final zzlq zzl = null;
    private static final /* synthetic */ zzlq[] zzm = null;
    private final int zzn;

    static {
        zzlq r02 = new zzlq("EDITION_UNKNOWN", 0, 0);
        zza = r02;
        zzlq r1 = new zzlq("EDITION_LEGACY", 1, 900);
        zzb = r1;
        zzlq r2 = new zzlq("EDITION_PROTO2", 2, 998);
        zzc = r2;
        zzlq r3 = new zzlq("EDITION_PROTO3", 3, 999);
        zzd = r3;
        zzlq r4 = new zzlq("EDITION_2023", 4, 1000);
        zze = r4;
        zzlq r5 = new zzlq("EDITION_2024", 5, 1001);
        zzf = r5;
        zzlq r6 = new zzlq("EDITION_1_TEST_ONLY", 6, 1);
        zzg = r6;
        zzlq r7 = new zzlq("EDITION_2_TEST_ONLY", 7, 2);
        zzh = r7;
        zzlq r8 = new zzlq("EDITION_99997_TEST_ONLY", 8, 99997);
        zzi = r8;
        zzlq r9 = new zzlq("EDITION_99998_TEST_ONLY", 9, 99998);
        zzj = r9;
        zzlq r10 = new zzlq("EDITION_99999_TEST_ONLY", 10, 99999);
        zzk = r10;
        zzlq r11 = new zzlq("EDITION_MAX", 11, Integer.MAX_VALUE);
        zzl = r11;
        zzm = new zzlq[]{r02, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11};
    }

    zzlq(String r1, int r2, int r3) {
        this.zzn = r3;
    }

    public static zzlq[] values() {
        return (zzlq[]) zzm.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzn);
    }

    @Override // com.google.android.recaptcha.internal.zznf
    public final int zza() {
        return this.zzn;
    }
}
