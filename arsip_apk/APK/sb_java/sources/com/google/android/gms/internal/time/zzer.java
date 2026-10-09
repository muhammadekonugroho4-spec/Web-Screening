package com.google.android.gms.internal.time;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Formattable;
import java.util.Formatter;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class zzer {
    static final Locale zza = null;

    static {
        zza = Locale.ROOT;
    }

    public static String zza(Object r1) {
        if (r1 != null) goto L50;
        return "null";
    L50:
    L5:
        e = move-exception;
        return zze(r1, e);
    L8:
        if (r1.getClass().isArray() == true) goto L15;
        String r02 = r1.toString();     // Catch: RuntimeException -> L5
        if (r02 == null) goto L13;
        return r02;
    L13:
        return zzd(r1, "toString() returned null");
    L15:
        if ((r1 instanceof int[]) == false) goto L19;
        return Arrays.toString((int[]) r1);
    L19:
        if ((r1 instanceof long[]) == false) goto L23;
        return Arrays.toString((long[]) r1);
    L23:
        if ((r1 instanceof byte[]) == false) goto L27;
        return Arrays.toString((byte[]) r1);
    L27:
        if ((r1 instanceof char[]) == false) goto L31;
        return Arrays.toString((char[]) r1);
    L31:
        if ((r1 instanceof short[]) == false) goto L35;
        return Arrays.toString((short[]) r1);
    L35:
        if ((r1 instanceof float[]) == false) goto L39;
        return Arrays.toString((float[]) r1);
    L39:
        if ((r1 instanceof double[]) == false) goto L43;
        return Arrays.toString((double[]) r1);
    L43:
        if ((r1 instanceof boolean[]) == false) goto L47;
        return Arrays.toString((boolean[]) r1);
    L47:
        return Arrays.toString((Object[]) r1);
    }

    public static void zzb(StringBuilder r4, Number r5, zzek r6) {
        boolean r62 = r6.zzk();
        long r02 = r5.longValue();
        if ((r5 instanceof Long) == false) goto L7;
        zzf(r4, r02, r62);
        return;
    L7:
        if ((r5 instanceof Integer) == false) goto L11;
        zzf(r4, r02 & 4294967295L, r62);
        return;
    L11:
        if ((r5 instanceof Byte) == false) goto L15;
        zzf(r4, r02 & 255, r62);
        return;
    L15:
        if ((r5 instanceof Short) == false) goto L19;
        zzf(r4, r02 & 65535, r62);
        return;
    L19:
        if ((r5 instanceof BigInteger) == false) goto L26;
        String r52 = ((BigInteger) r5).toString(16);
        if (r62 == false) goto L23;
        r52 = r52.toUpperCase(zza);
    L23:
        r4.append(r52);
        return;
    L26:
        throw new IllegalStateException("unsupported number type: ".concat(String.valueOf(r5.getClass())));
    }

    public static void zzc(Formattable r5, StringBuilder r6, zzek r7) {
        int r02 = r7.zza();
        int r1 = r02 & 162;
        if (r1 == 0) goto L16;
        int r2 = 0;
        if ((r02 & 32) == 0) goto L7;
        int r12 = 1;
    L9:
        if ((r02 & 128) == 0) goto L11;
        int r3 = 2;
    L13:
        if ((r02 & 2) == 0) goto L15;
        r2 = 4;
    L15:
        r1 = (r12 | r3) | r2;
        goto L16
    L11:
        r3 = 0;
        goto L13
    L7:
        r12 = 0;
    L16:
        int r03 = r6.length();
        Formatter r22 = new Formatter(r6, zza);
        r5.formatTo(r22, r1, r7.zzc(), r7.zzb());     // Catch: RuntimeException -> L19
        return;
    L19:
        e = move-exception;
        r6.setLength(r03);
        r22.out().append(zze(r5, e));     // Catch: IOException -> L23
        return;
    }

    private static String zzd(Object r3, String r4) {
        return "{" + r3.getClass().getName() + "@" + System.identityHashCode(r3) + ": " + r4 + "}";
    }

    private static String zze(Object r02, RuntimeException r1) {
        String r12 = r1.toString();     // Catch: RuntimeException -> L4
    L7:
        return zzd(r02, r12);
    L4:
        e = move-exception;
        r12 = e.getClass().getSimpleName();
        goto L7
    }

    private static void zzf(StringBuilder r5, long r6, boolean r8) {
        if (r6 != 0) goto L7;
        r5.append("0");
        return;
    L7:
        if (true == r8) goto L9;
        String r82 = "0123456789abcdef";
    L10:
        int r02 = (63 - Long.numberOfLeadingZeros(r6)) & (-4);
    L11:
        if (r02 < 0) goto L13;
        r5.append(r82.charAt((int) ((r6 >>> r02) & 15)));
        r02 = r02 - 4;
        goto L11
    L13:
        return;
    L9:
        r82 = "0123456789ABCDEF";
        goto L10
    }
}
