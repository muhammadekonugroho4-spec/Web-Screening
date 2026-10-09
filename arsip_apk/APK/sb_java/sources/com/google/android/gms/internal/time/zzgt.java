package com.google.android.gms.internal.time;

import com.clevertap.android.sdk.Constants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum zzgt extends Enum {
    public static final zzgt zzA = null;
    public static final zzgt zzB = null;
    public static final zzgt zzC = null;
    public static final zzgt zzD = null;
    public static final zzgt zzE = null;
    private static final Map zzF = null;
    private static final /* synthetic */ zzgt[] zzG = null;
    public static final zzgt zza = null;
    public static final zzgt zzb = null;
    public static final zzgt zzc = null;
    public static final zzgt zzd = null;
    public static final zzgt zze = null;
    public static final zzgt zzf = null;
    public static final zzgt zzg = null;
    public static final zzgt zzh = null;
    public static final zzgt zzi = null;
    public static final zzgt zzj = null;
    public static final zzgt zzk = null;
    public static final zzgt zzl = null;
    public static final zzgt zzm = null;
    public static final zzgt zzn = null;
    public static final zzgt zzo = null;
    public static final zzgt zzp = null;
    public static final zzgt zzq = null;
    public static final zzgt zzr = null;
    public static final zzgt zzs = null;
    public static final zzgt zzt = null;
    public static final zzgt zzu = null;
    public static final zzgt zzv = null;
    public static final zzgt zzw = null;
    public static final zzgt zzx = null;
    public static final zzgt zzy = null;
    public static final zzgt zzz = null;
    private final char zzH;

    static {
        zzgt r1 = new zzgt("TIME_HOUR_OF_DAY_PADDED", 0, 'H');
        zza = r1;
        zzgt r2 = new zzgt("TIME_HOUR_OF_DAY", 1, 'k');
        zzb = r2;
        zzgt r3 = new zzgt("TIME_HOUR_12H_PADDED", 2, 'I');
        zzc = r3;
        zzgt r4 = new zzgt("TIME_HOUR_12H", 3, Constants.INAPP_POSITION_LEFT);
        zzd = r4;
        zzgt r5 = new zzgt("TIME_MINUTE_OF_HOUR_PADDED", 4, 'M');
        zze = r5;
        zzgt r6 = new zzgt("TIME_SECONDS_OF_MINUTE_PADDED", 5, 'S');
        zzf = r6;
        zzgt r7 = new zzgt("TIME_MILLIS_OF_SECOND_PADDED", 6, 'L');
        zzg = r7;
        zzgt r8 = new zzgt("TIME_NANOS_OF_SECOND_PADDED", 7, 'N');
        zzh = r8;
        zzgt r9 = new zzgt("TIME_AM_PM", 8, 'p');
        zzi = r9;
        zzgt r10 = new zzgt("TIME_TZ_NUMERIC", 9, 'z');
        zzj = r10;
        zzgt r11 = new zzgt("TIME_TZ_SHORT", 10, 'Z');
        zzk = r11;
        zzgt r12 = new zzgt("TIME_EPOCH_SECONDS", 11, 's');
        zzl = r12;
        zzgt r13 = new zzgt("TIME_EPOCH_MILLIS", 12, 'Q');
        zzm = r13;
        zzgt r14 = new zzgt("DATE_MONTH_FULL", 13, 'B');
        zzn = r14;
        zzgt r15 = new zzgt("DATE_MONTH_SHORT", 14, Constants.INAPP_POSITION_BOTTOM);
        zzo = r15;
        zzgt r02 = new zzgt("DATE_MONTH_SHORT_ALT", 15, 'h');
        zzp = r02;
        zzgt r16 = new zzgt("DATE_DAY_FULL", 16, 'A');
        zzq = r16;
        zzgt r03 = new zzgt("DATE_DAY_SHORT", 17, 'a');
        zzr = r03;
        zzgt r17 = new zzgt("DATE_CENTURY_PADDED", 18, 'C');
        zzs = r17;
        zzgt r04 = new zzgt("DATE_YEAR_PADDED", 19, 'Y');
        zzt = r04;
        zzgt r18 = new zzgt("DATE_YEAR_OF_CENTURY_PADDED", 20, 'y');
        zzu = r18;
        zzgt r05 = new zzgt("DATE_DAY_OF_YEAR_PADDED", 21, 'j');
        zzv = r05;
        zzgt r19 = new zzgt("DATE_MONTH_PADDED", 22, 'm');
        zzw = r19;
        zzgt r06 = new zzgt("DATE_DAY_OF_MONTH_PADDED", 23, 'd');
        zzx = r06;
        zzgt r110 = new zzgt("DATE_DAY_OF_MONTH", 24, 'e');
        zzy = r110;
        zzgt r07 = new zzgt("DATETIME_HOURS_MINUTES", 25, 'R');
        zzz = r07;
        zzgt r111 = new zzgt("DATETIME_HOURS_MINUTES_SECONDS", 26, 'T');
        zzA = r111;
        zzgt r08 = new zzgt("DATETIME_HOURS_MINUTES_SECONDS_12H", 27, Constants.INAPP_POSITION_RIGHT);
        zzB = r08;
        zzgt r112 = new zzgt("DATETIME_MONTH_DAY_YEAR", 28, 'D');
        zzC = r112;
        zzgt r09 = new zzgt("DATETIME_YEAR_MONTH_DAY", 29, 'F');
        zzD = r09;
        zzgt r113 = new zzgt("DATETIME_FULL", 30, Constants.INAPP_POSITION_CENTER);
        zzE = r113;
        int r010 = 0;
        zzG = new zzgt[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r02, r16, r03, r17, r04, r18, r05, r19, r06, r110, r07, r111, r08, r112, r09, r113};
        HashMap r114 = new HashMap();
        zzgt[] r22 = values();
        int r32 = r22.length;
    L3:
        if (r010 >= r32) goto L9;
        zzgt r42 = r22[r010];
        if (r114.put(Character.valueOf(r42.zzH), r42) != null) goto L8;
        r010 = r010 + 1;
        goto L3
    L8:
        throw new IllegalStateException("duplicate format character: ".concat(String.valueOf(r42)));
    L9:
        zzF = Collections.unmodifiableMap(r114);
    }

    zzgt(String r1, int r2, char r3) {
        this.zzH = r3;
    }

    public static zzgt[] values() {
        return (zzgt[]) zzG.clone();
    }

    public static final zzgt zzb(char r1) {
        return (zzgt) zzF.get(Character.valueOf(r1));
    }

    public final char zza() {
        return this.zzH;
    }
}
