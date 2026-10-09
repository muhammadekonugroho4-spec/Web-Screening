package com.google.android.gms.common.util;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes5.dex */
public class Hex {
    private static final char[] zza = null;
    private static final char[] zzb = null;

    static {
        zza = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        zzb = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f'};
    }

    public Hex() {
    }

    @KeepForSdk
    public static String bytesToStringLowercase(byte[] r7) {
        int r02 = r7.length;
        char[] r03 = new char[r02 + r02];
        int r1 = 0;
        int r2 = 0;
    L4:
        if (r1 >= r7.length) goto L7;
        byte r3 = r7[r1];
        int r4 = r3 & UnsignedBytes.MAX_VALUE;
        char[] r6 = zzb;
        r03[r2] = r6[r4 >>> 4];
        r03[r2 + 1] = r6[r3 & Ascii.SI];
        r2 = r2 + 2;
        r1 = r1 + 1;
        goto L4
    L7:
        return new String(r03);
    }

    @KeepForSdk
    public static String bytesToStringUppercase(byte[] r1) {
        return bytesToStringUppercase(r1, false);
    }

    @KeepForSdk
    public static byte[] stringToBytes(String r6) throws IllegalArgumentException {
        int r02 = r6.length();
        if ((r02 % 2) != 0) goto L9;
        byte[] r1 = new byte[r02 / 2];
        int r2 = 0;
    L5:
        if (r2 >= r02) goto L7;
        int r4 = r2 + 2;
        r1[r2 / 2] = (byte) Integer.parseInt(r6.substring(r2, r4), 16);
        r2 = r4;
        goto L5
    L7:
        return r1;
    L9:
        throw new IllegalArgumentException("Hex string has odd number of characters");
    }

    @KeepForSdk
    public static String bytesToStringUppercase(byte[] r5, boolean r6) {
        int r02 = r5.length;
        StringBuilder r2 = new StringBuilder(r02 + r02);
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L11;
        if (r6 == false) goto L9;
        if (r1 != (r02 - 1)) goto L9;
        if ((r5[r1] & UnsignedBytes.MAX_VALUE) == 0) goto L11;
    L9:
        char[] r3 = zza;
        r2.append(r3[(r5[r1] & 240) >>> 4]);
        r2.append(r3[r5[r1] & Ascii.SI]);
        r1 = r1 + 1;
    L11:
        return r2.toString();
    }
}
