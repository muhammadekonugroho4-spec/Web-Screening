package com.google.android.gms.internal.location;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes5.dex */
public final class zzbn {
    public static String zza(@NullableDecl String r10, @NullableDecl Object... r11) {
        int r1 = 0;
        int r2 = 0;
    L3:
        int r02 = r11.length;
        if (r2 >= r02) goto L18;
        Object r3 = r11[r2];
        if (r3 != null) goto L34;
        String r03 = "null";
    L17:
        r11[r2] = r03;
        r2 = r2 + 1;
        goto L3
    L34:
        r03 = r3.toString();     // Catch: Exception -> L10
    L10:
        e = move-exception;
        String r04 = r3.getClass().getName();
        String r32 = Integer.toHexString(System.identityHashCode(r3));
        StringBuilder r6 = new StringBuilder((r04.length() + 1) + String.valueOf(r32).length());
        r6.append(r04);
        r6.append('@');
        r6.append(r32);
        String r05 = r6.toString();
        Logger r33 = Logger.getLogger("com.google.common.base.Strings");
        Level r4 = Level.WARNING;
        String r5 = String.valueOf(r05);
        if (r5.length() == 0) goto L15;
        String r52 = "Exception during lenientFormat for ".concat(r5);
    L16:
        r33.logp(r4, "com.google.common.base.Strings", "lenientToString", r52, e);
        String r34 = e.getClass().getName();
        StringBuilder r62 = new StringBuilder((String.valueOf(r05).length() + 9) + r34.length());
        r62.append("<");
        r62.append(r05);
        r62.append(" threw ");
        r62.append(r34);
        r62.append(">");
        r03 = r62.toString();
        goto L17
    L15:
        r52 = new String("Exception during lenientFormat for ");
        goto L16
    L18:
        StringBuilder r22 = new StringBuilder(r10.length() + (r02 * 16));
        int r06 = 0;
    L19:
        int r35 = r11.length;
        if (r1 >= r35) goto L25;
        int r42 = r10.indexOf("%s", r06);
        if (r42 == (-1)) goto L25;
        r22.append(r10, r06, r42);
        r22.append(r11[r1]);
        r1 = r1 + 1;
        r06 = r42 + 2;
    L25:
        r22.append(r10, r06, r10.length());
        if (r1 >= r35) goto L33;
        r22.append(" [");
        int r102 = r1 + 1;
        r22.append(r11[r1]);
    L29:
        if (r102 >= r11.length) goto L31;
        r22.append(", ");
        r22.append(r11[r102]);
        r102 = r102 + 1;
        goto L29
    L31:
        r22.append(']');
    L33:
        return r22.toString();
    }
}
