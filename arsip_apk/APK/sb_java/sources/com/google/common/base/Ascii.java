package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
public final class Ascii {
    public static final byte ACK = 6;
    public static final byte BEL = 7;
    public static final byte BS = 8;
    public static final byte CAN = 24;
    private static final char CASE_MASK = ' ';
    public static final byte CR = 13;
    public static final byte DC1 = 17;
    public static final byte DC2 = 18;
    public static final byte DC3 = 19;
    public static final byte DC4 = 20;
    public static final byte DEL = Byte.MAX_VALUE;
    public static final byte DLE = 16;
    public static final byte EM = 25;
    public static final byte ENQ = 5;
    public static final byte EOT = 4;
    public static final byte ESC = 27;
    public static final byte ETB = 23;
    public static final byte ETX = 3;
    public static final byte FF = 12;
    public static final byte FS = 28;
    public static final byte GS = 29;
    public static final byte HT = 9;
    public static final byte LF = 10;
    public static final char MAX = 127;
    public static final char MIN = 0;
    public static final byte NAK = 21;
    public static final byte NL = 10;
    public static final byte NUL = 0;
    public static final byte RS = 30;
    public static final byte SI = 15;
    public static final byte SO = 14;
    public static final byte SOH = 1;
    public static final byte SP = 32;
    public static final byte SPACE = 32;
    public static final byte STX = 2;
    public static final byte SUB = 26;
    public static final byte SYN = 22;
    public static final byte US = 31;
    public static final byte VT = 11;
    public static final byte XOFF = 19;
    public static final byte XON = 17;

    private Ascii() {
    }

    public static boolean equalsIgnoreCase(CharSequence r7, CharSequence r8) {
        int r02 = r7.length();
        if (r7 != r8) goto L6;
        return true;
    L6:
        if (r02 == r8.length()) goto L8;
        return false;
    L8:
        int r2 = 0;
    L9:
        if (r2 >= r02) goto L19;
        char r4 = r7.charAt(r2);
        char r5 = r8.charAt(r2);
        if (r4 == r5) goto L17;
        int r42 = getAlphaIndex(r4);
        if (r42 >= 26) goto L18;
        if (r42 == getAlphaIndex(r5)) goto L17;
    L18:
        return false;
    L17:
        r2 = r2 + 1;
        goto L9
    L19:
        return true;
    }

    private static int getAlphaIndex(char r02) {
        return (char) ((r02 | CASE_MASK) - 97);
    }

    public static boolean isLowerCase(char r1) {
        if (r1 >= 'a') goto L5;
        return false;
    L5:
        if (r1 > 'z') goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean isUpperCase(char r1) {
        if (r1 >= 'A') goto L5;
        return false;
    L5:
        if (r1 > 'Z') goto L10;
        return true;
    L10:
        return false;
    }

    public static String toLowerCase(String r4) {
        int r02 = r4.length();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L15;
        if (isUpperCase(r4.charAt(r1)) == true) goto L6;
        r1 = r1 + 1;
        goto L3
    L6:
        char[] r42 = r4.toCharArray();
    L7:
        if (r1 >= r02) goto L13;
        char r2 = r42[r1];
        if (isUpperCase(r2) == false) goto L11;
        r42[r1] = (char) (r2 ^ CASE_MASK);
    L11:
        r1 = r1 + 1;
        goto L7
    L13:
        return String.valueOf(r42);
    L15:
        return r4;
    }

    public static String toUpperCase(String r4) {
        int r02 = r4.length();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L15;
        if (isLowerCase(r4.charAt(r1)) == true) goto L6;
        r1 = r1 + 1;
        goto L3
    L6:
        char[] r42 = r4.toCharArray();
    L7:
        if (r1 >= r02) goto L13;
        char r2 = r42[r1];
        if (isLowerCase(r2) == false) goto L11;
        r42[r1] = (char) (r2 ^ CASE_MASK);
    L11:
        r1 = r1 + 1;
        goto L7
    L13:
        return String.valueOf(r42);
    L15:
        return r4;
    }

    public static String truncate(CharSequence r5, int r6, String r7) {
        Preconditions.checkNotNull(r5);
        int r02 = r6 - r7.length();
        if (r02 < 0) goto L5;
        boolean r2 = true;
    L6:
        Preconditions.checkArgument(r2, "maxLength (%s) must be >= length of the truncation indicator (%s)", r6, r7.length());
        int r22 = r5.length();
        String r52 = r5;
        if (r22 > r6) goto L11;
        String r53 = r5.toString();
        int r23 = r53.length();
        r52 = r53;
        if (r23 > r6) goto L11;
        return r53;
    L11:
        StringBuilder r24 = new StringBuilder(r6);
        r24.append(r52, 0, r02);
        r24.append(r7);
        return r24.toString();
    L5:
        r2 = false;
        goto L6
    }

    public static String toLowerCase(CharSequence r4) {
        if ((r4 instanceof String) == true) goto L5;
        int r02 = r4.length();
        char[] r1 = new char[r02];
        int r2 = 0;
    L7:
        if (r2 >= r02) goto L10;
        r1[r2] = toLowerCase(r4.charAt(r2));
        r2 = r2 + 1;
        goto L7
    L10:
        return String.valueOf(r1);
    L5:
        return toLowerCase((String) r4);
    }

    public static String toUpperCase(CharSequence r4) {
        if ((r4 instanceof String) == true) goto L5;
        int r02 = r4.length();
        char[] r1 = new char[r02];
        int r2 = 0;
    L7:
        if (r2 >= r02) goto L10;
        r1[r2] = toUpperCase(r4.charAt(r2));
        r2 = r2 + 1;
        goto L7
    L10:
        return String.valueOf(r1);
    L5:
        return toUpperCase((String) r4);
    }

    public static char toLowerCase(char r1) {
        if (isUpperCase(r1) == true) goto L5;
        return r1;
    L5:
        return (char) (r1 ^ CASE_MASK);
    }

    public static char toUpperCase(char r1) {
        if (isLowerCase(r1) == true) goto L5;
        return r1;
    L5:
        return (char) (r1 ^ CASE_MASK);
    }
}
