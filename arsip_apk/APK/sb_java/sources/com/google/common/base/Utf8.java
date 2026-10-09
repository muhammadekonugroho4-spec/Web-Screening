package com.google.common.base;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;

@Beta
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
public final class Utf8 {
    private Utf8() {
    }

    public static int encodedLength(CharSequence r5) {
        int r02 = r5.length();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L7;
        if (r5.charAt(r1) >= 128) goto L7;
        r1 = r1 + 1;
    L7:
        int r2 = r02;
    L8:
        if (r1 >= r02) goto L13;
        char r3 = r5.charAt(r1);
        if (r3 >= 2048) goto L12;
        r2 = r2 + ((127 - r3) >>> 31);
        r1 = r1 + 1;
        goto L8
    L12:
        r2 = r2 + encodedLengthGeneral(r5, r1);
    L13:
        if (r2 < r02) goto L15;
        return r2;
    L15:
        long r03 = r2 + 4294967296L;
        StringBuilder r22 = new StringBuilder(54);
        r22.append("UTF-8 length does not fit in int: ");
        r22.append(r03);
        throw new IllegalArgumentException(r22.toString());
    }

    private static int encodedLengthGeneral(CharSequence r4, int r5) {
        int r02 = r4.length();
        int r1 = 0;
    L3:
        if (r5 >= r02) goto L17;
        char r2 = r4.charAt(r5);
        if (r2 >= 2048) goto L7;
        r1 = r1 + ((127 - r2) >>> 31);
    L16:
        r5 = r5 + 1;
        goto L3
    L7:
        r1 = r1 + 2;
        if (55296 > r2) goto L16;
        if (r2 > 57343) goto L16;
        if (Character.codePointAt(r4, r5) == r2) goto L15;
        r5 = r5 + 1;
        goto L16
    L15:
        throw new IllegalArgumentException(unpairedSurrogateMsg(r5));
    L17:
        return r1;
    }

    public static boolean isWellFormed(byte[] r2) {
        return isWellFormed(r2, 0, r2.length);
    }

    private static boolean isWellFormedSlowPath(byte[] r7, int r8, int r9) {
    L2:
        if (r8 >= r9) goto L3;
        int r02 = r8 + 1;
        byte r1 = r7[r8];
        if (r1 < 0) goto L8;
        r8 = r02;
        goto L2
    L8:
        if (r1 < (-32)) goto L9;
        if (r1 < (-16)) goto L18;
        if ((r8 + 3) >= r9) goto L34;
        int r2 = r8 + 2;
        byte r03 = r7[r02];
        if (r03 > (-65)) goto L43;
        if ((((r1 << Ascii.FS) + (r03 + 112)) >> 30) != 0) goto L43;
        int r04 = r8 + 3;
        if (r7[r2] > (-65)) goto L43;
        r8 = r8 + 4;
        if (r7[r04] <= (-65)) goto L2;
    L43:
        return false;
    L34:
        return false;
    L18:
        int r5 = r8 + 2;
        if (r5 >= r9) goto L20;
        byte r05 = r7[r02];
        if (r05 > (-65)) goto L31;
        if (r1 != (-32)) goto L27;
        if (r05 < (-96)) goto L31;
    L27:
        if (r1 != (-19)) goto L29;
        if ((-96) <= r05) goto L31;
    L29:
        r8 = r8 + 3;
        if (r7[r5] <= (-65)) goto L2;
    L31:
        return false;
    L20:
        return false;
    L9:
        if (r02 == r9) goto L10;
        if (r1 < (-62)) goto L15;
        r8 = r8 + 2;
        if (r7[r02] <= (-65)) goto L2;
    L15:
        return false;
    L10:
        return false;
    L3:
        return true;
    }

    private static String unpairedSurrogateMsg(int r2) {
        StringBuilder r02 = new StringBuilder(39);
        r02.append("Unpaired surrogate at index ");
        r02.append(r2);
        return r02.toString();
    }

    public static boolean isWellFormed(byte[] r1, int r2, int r3) {
        int r32 = r3 + r2;
        Preconditions.checkPositionIndexes(r2, r32, r1.length);
    L3:
        if (r2 >= r32) goto L9;
        if (r1[r2] < 0) goto L7;
        r2 = r2 + 1;
        goto L3
    L7:
        return isWellFormedSlowPath(r1, r2, r32);
    L9:
        return true;
    }
}
