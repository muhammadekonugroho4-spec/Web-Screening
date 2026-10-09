package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.common.primitives.UnsignedBytes;

@KeepForSdk
/* loaded from: classes5.dex */
public final class HexDumpUtils {
    public HexDumpUtils() {
    }

    @KeepForSdk
    public static String dump(byte[] r10, int r11, int r12, boolean r13) {
        if (r10 == null) goto L50;
        int r02 = r10.length;
        if (r02 == 0) goto L59;
        if (r11 < 0) goto L60;
        if (r12 > 0) goto L8;
        return null;
    L8:
        if ((r11 + r12) > r02) goto L62;
        if (r13 == false) goto L12;
        int r03 = 75;
    L13:
        StringBuilder r2 = new StringBuilder(r03 * ((r12 + 15) / 16));
        int r1 = r12;
        int r4 = 0;
        int r5 = 0;
    L14:
        if (r1 <= 0) goto L49;
        if (r4 == 0) goto L18;
        if (r4 != 8) goto L24;
        r2.append(" -");
    L24:
        r2.append(String.format(" %02X", new Object[]{Integer.valueOf(r10[r11] & UnsignedBytes.MAX_VALUE)}));
        r1 = r1 - 1;
        r4 = r4 + 1;
        if (r13 == false) goto L44;
        if (r4 == 16) goto L28;
        if (r1 != 0) goto L44;
    L28:
        int r7 = 16 - r4;
        if (r7 <= 0) goto L34;
        int r8 = 0;
    L31:
        if (r8 >= r7) goto L34;
        r2.append("   ");
        r8 = r8 + 1;
    L34:
        if (r7 < 8) goto L36;
        r2.append("  ");
    L36:
        r2.append("  ");
        int r6 = 0;
    L37:
        if (r6 >= r4) goto L44;
        char r72 = (char) r10[r5 + r6];
        if (r72 >= ' ') goto L41;
    L42:
        r72 = '.';
    L43:
        r2.append(r72);
        r6 = r6 + 1;
        goto L37
    L41:
        if (r72 <= '~') goto L43;
    L44:
        if (r4 == 16) goto L46;
        if (r1 == 0) goto L46;
    L47:
        r11 = r11 + 1;
    L46:
        r2.append('\n');
        r4 = 0;
        goto L47
    L18:
        if (r12 >= 65536) goto L20;
        r2.append(String.format("%04X:", new Object[]{Integer.valueOf(r11)}));
    L21:
        r5 = r11;
        goto L24
    L20:
        r2.append(String.format("%08X:", new Object[]{Integer.valueOf(r11)}));
        goto L21
    L49:
        return r2.toString();
    L12:
        r03 = 57;
        goto L13
    L62:
        return null;
    L60:
        return null;
    L59:
        return null;
    L50:
        return null;
    }
}
