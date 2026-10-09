package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes5.dex */
public final class zzanp {
    private static final ThreadLocal<SimpleDateFormat> zza = null;

    static {
        zzamt r02 = (zzamt) ((zzakg) zzamt.zzc().zza(-62135596800L).zza(0).zze());
        zzamt r03 = (zzamt) ((zzakg) zzamt.zzc().zza(253402300799L).zza(999999999).zze());
        zzamt r04 = (zzamt) ((zzakg) zzamt.zzc().zza(0).zza(0).zze());
        zza = new zzano();
        zzc("now");
        zzc("getEpochSecond");
        zzc("getNano");
    }

    private static boolean zza(long r2) {
        if (r2 >= (-62135596800L)) goto L5;
        return false;
    L5:
        if (r2 > 253402300799L) goto L10;
        return true;
    L10:
        return false;
    }

    private static long zzb(String r8) throws ParseException {
        int r02 = r8.indexOf(58);
        if (r02 == (-1)) goto L12;
        return ((Long.parseLong(r8.substring(0, r02)) * 60) + Long.parseLong(r8.substring(r02 + 1))) * 60;
    L8:
        e = move-exception;
        ParseException r1 = new ParseException("Invalid offset value: " + r8, 0);
        r1.initCause(e);
        throw r1;
    L12:
        throw new ParseException("Invalid offset value: " + r8, 0);
    }

    private static Method zzc(String r2) {
        return Class.forName("java.time.Instant").getMethod(r2, null);
    L5:
        return null;
    }

    public static long zza(zzamt r2) {
        return zzb(r2).zzb();
    }

    public static zzamt zza(String r14) throws ParseException {
        int r02 = r14.indexOf(84);
        if (r02 == (-1)) goto L60;
        int r5 = r14.indexOf(90, r02);
        if (r5 != (-1)) goto L7;
        r5 = r14.indexOf(43, r02);
    L7:
        if (r5 != (-1)) goto L9;
        r5 = r14.indexOf(45, r02);
    L9:
        if (r5 == (-1)) goto L58;
        String r03 = r14.substring(0, r5);
        int r7 = r03.indexOf(46);
        if (r7 == (-1)) goto L13;
        String r3 = r03.substring(0, r7);
        String r32 = r03.substring(r7 + 1);
        r03 = r3;
    L14:
        long r72 = zza.get().parse(r03).getTime() / 1000;
        if (r32.isEmpty() == false) goto L17;
        int r9 = 0;
    L31:
        if (r14.charAt(r5) == 'Z') goto L33;
        long r04 = zzb(r14.substring(r5 + 1));
        if (r14.charAt(r5) != '+') goto L40;
        r72 = r72 - r04;
    L61:
    L49:
        e = move-exception;
        ParseException r1 = new ParseException("Failed to parse timestamp " + r14 + " Timestamp is out of range.", 0);
        r1.initCause(e);
        throw r1;
    L42:
        if (zza(r72) == false) goto L54;
        if (r9 <= (-1000000000)) goto L46;
        if (r9 >= 1000000000) goto L46;
    L47:
        if (r9 >= 0) goto L52;
        r9 = r9 + 1000000000;     // Catch: IllegalArgumentException -> L49
        r72 = zzbc.zzb(r72, 1);     // Catch: IllegalArgumentException -> L49
    L52:
        return zzb((zzamt) ((zzakg) zzamt.zzc().zza(r72).zza(r9).zze()));
    L46:
        r72 = zzbc.zza(r72, r9 / 1000000000);     // Catch: IllegalArgumentException -> L49
        r9 = r9 % 1000000000;     // Catch: IllegalArgumentException -> L49
        goto L47
    L54:
        throw new IllegalArgumentException(zzae.zza("Timestamp is not valid. Input seconds is too large. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. ", new Object[]{Long.valueOf(r72)}));     // Catch: IllegalArgumentException -> L49
    L40:
        r72 = r72 + r04;
        goto L61
    L33:
        if (r14.length() == (r5 + 1)) goto L61;
        throw new ParseException("Failed to parse timestamp: invalid trailing data \"" + r14.substring(r5) + "\"", 0);
    L17:
        int r05 = 0;
        r9 = 0;
    L19:
        if (r05 >= 9) goto L31;
        r9 = r9 * 10;
        if (r05 >= r32.length()) goto L29;
        if (r32.charAt(r05) < '0') goto L28;
        if (r32.charAt(r05) > '9') goto L28;
        r9 = r9 + (r32.charAt(r05) - '0');
    L28:
        throw new ParseException("Invalid nanoseconds.", 0);
    L29:
        r05 = r05 + 1;
        goto L19
    L13:
        r32 = "";
        goto L14
    L58:
        throw new ParseException("Failed to parse timestamp: missing valid timezone offset.", 0);
    L60:
        throw new ParseException("Failed to parse timestamp: invalid timestamp \"" + r14 + "\"", 0);
    }

    private static zzamt zzb(zzamt r4) {
        long r02 = r4.zzb();
        int r2 = r4.zza();
        if (zza(r02) == false) goto L9;
        if (r2 < 0) goto L9;
        if (r2 >= 1000000000) goto L9;
        return r4;
    L9:
        throw new IllegalArgumentException(zzae.zza("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", new Object[]{Long.valueOf(r02), Integer.valueOf(r2)}));
    }

    public static /* synthetic */ SimpleDateFormat zza() {
        SimpleDateFormat r02 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        GregorianCalendar r1 = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        r1.setGregorianChange(new Date(Long.MIN_VALUE));
        r02.setCalendar(r1);
        return r02;
    }
}
