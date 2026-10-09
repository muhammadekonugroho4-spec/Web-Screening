package com.huawei.hms.support.log.common;

import com.clevertap.android.sdk.Constants;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;

/* loaded from: classes6.dex */
public final class Base64 {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f39484a = null;

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f39485b = null;

    static {
        f39484a = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', Constants.INAPP_POSITION_LEFT, 'm', 'n', 'o', 'p', 'q', Constants.INAPP_POSITION_RIGHT, 's', Constants.INAPP_POSITION_TOP, 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/', '='};
        f39485b = new byte[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, -1, -1, -1, -1, -1, -1, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    }

    private Base64() {
    }

    private static int a(String r4) {
        int r02 = r4.length();
        int r1 = 0;
    L4:
        if (r1 >= r4.length()) goto L11;
        char r2 = r4.charAt(r1);
        if (r2 <= 255) goto L8;
    L9:
        r02 = r02 - 1;
    L10:
        r1 = r1 + 1;
        goto L4
    L8:
        if (f39485b[r2] >= 0) goto L10;
    L11:
        return r02;
    }

    public static byte[] decode(String r10) {
        int r02 = a(r10);
        int r1 = (r02 / 4) * 3;
        int r03 = r02 % 4;
        if (r03 != 3) goto L6;
        r1 = r1 + 2;
    L6:
        if (r03 != 2) goto L8;
        r1 = r1 + 1;
    L8:
        byte[] r04 = new byte[r1];
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
    L10:
        if (r3 >= r10.length()) goto L21;
        char r7 = r10.charAt(r3);
        if (r7 <= 255) goto L14;
        byte r72 = -1;
    L15:
        if (r72 < 0) goto L20;
        int r9 = r6 + 6;
        r5 = (r5 << 6) | r72;
        if (r9 < 8) goto L19;
        r6 = r6 - 2;
        r04[r4] = (byte) (255 & (r5 >> r6));
        r4 = r4 + 1;
        goto L20
    L19:
        r6 = r9;
    L20:
        r3 = r3 + 1;
        goto L10
    L14:
        r72 = f39485b[r7];
        goto L15
    L21:
        if (r4 != r1) goto L23;
        return r04;
    L23:
        return new byte[0];
    }

    public static String encode(byte[] r1) {
        return encode(r1, r1.length);
    }

    public static String encode(byte[] r10, int r11) {
        char[] r02 = new char[((r11 + 2) / 3) * 4];
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r11) goto L21;
        int r4 = (r10[r2] & UnsignedBytes.MAX_VALUE) << 8;
        int r5 = r2 + 1;
        boolean r6 = true;
        if (r5 >= r11) goto L7;
        r4 = r4 | (r10[r5] & UnsignedBytes.MAX_VALUE);
        boolean r52 = true;
    L8:
        int r42 = r4 << 8;
        int r7 = r2 + 2;
        if (r7 >= r11) goto L11;
        r42 = r42 | (r10[r7] & UnsignedBytes.MAX_VALUE);
    L12:
        int r72 = r3 + 3;
        char[] r8 = f39484a;
        int r9 = 64;
        if (r6 == false) goto L15;
        int r62 = r42 & 63;
    L16:
        r02[r72] = r8[r62];
        int r63 = r42 >> 6;
        int r73 = r3 + 2;
        if (r52 == false) goto L19;
        r9 = r63 & 63;
    L19:
        r02[r73] = r8[r9];
        r02[r3 + 1] = r8[(r42 >> 12) & 63];
        r02[r3] = r8[(r42 >> 18) & 63];
        r2 = r2 + 3;
        r3 = r3 + 4;
        goto L3
    L15:
        r62 = 64;
        goto L16
    L11:
        r6 = false;
        goto L12
    L7:
        r52 = false;
        goto L8
    L21:
        return new String(r02);
    }
}
