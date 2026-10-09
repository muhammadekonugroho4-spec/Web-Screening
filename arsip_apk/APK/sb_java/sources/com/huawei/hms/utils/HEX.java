package com.huawei.hms.utils;

import com.clevertap.android.sdk.Constants;
import com.google.common.base.Ascii;

/* loaded from: classes6.dex */
public final class HEX {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f39518a = null;

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f39519b = null;

    static {
        f39518a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f'};
        f39519b = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    private HEX() {
    }

    private static char[] a(byte[] r7, char[] r8) {
        int r02 = r7.length;
        char[] r1 = new char[r02 << 1];
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r02) goto L5;
        int r4 = r3 + 1;
        byte r5 = r7[r2];
        r1[r3] = r8[(r5 & 240) >>> 4];
        r3 = r3 + 2;
        r1[r4] = r8[r5 & Ascii.SI];
        r2 = r2 + 1;
        goto L3
    L5:
        return r1;
    }

    public static char[] encodeHex(byte[] r1) {
        return encodeHex(r1, false);
    }

    public static String encodeHexString(byte[] r1, boolean r2) {
        return new String(encodeHex(r1, r2));
    }

    public static char[] encodeHex(byte[] r02, boolean r1) {
        if (r1 == false) goto L4;
        char[] r12 = f39519b;
    L6:
        return a(r02, r12);
    L4:
        r12 = f39518a;
        goto L6
    }
}
