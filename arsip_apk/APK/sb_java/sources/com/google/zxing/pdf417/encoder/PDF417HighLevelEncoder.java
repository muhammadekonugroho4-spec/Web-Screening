package com.google.zxing.pdf417.encoder;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import com.iab.digitalidentity.sdk.core.model.GoPayPlusCameraConfigKt;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes6.dex */
final class PDF417HighLevelEncoder {
    private static final int BYTE_COMPACTION = 1;
    private static final Charset DEFAULT_ENCODING = null;
    private static final int ECI_CHARSET = 927;
    private static final int ECI_GENERAL_PURPOSE = 926;
    private static final int ECI_USER_DEFINED = 925;
    private static final int LATCH_TO_BYTE = 924;
    private static final int LATCH_TO_BYTE_PADDED = 901;
    private static final int LATCH_TO_NUMERIC = 902;
    private static final int LATCH_TO_TEXT = 900;
    private static final byte[] MIXED = null;
    private static final int NUMERIC_COMPACTION = 2;
    private static final byte[] PUNCTUATION = null;
    private static final int SHIFT_TO_BYTE = 913;
    private static final int SUBMODE_ALPHA = 0;
    private static final int SUBMODE_LOWER = 1;
    private static final int SUBMODE_MIXED = 2;
    private static final int SUBMODE_PUNCTUATION = 3;
    private static final int TEXT_COMPACTION = 0;
    private static final byte[] TEXT_MIXED_RAW = null;
    private static final byte[] TEXT_PUNCTUATION_RAW = null;

    /* renamed from: com.google.zxing.pdf417.encoder.PDF417HighLevelEncoder$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$pdf417$encoder$Compaction = null;

        static {
            int[] r02 = new int[Compaction.values().length];
            $SwitchMap$com$google$zxing$pdf417$encoder$Compaction = r02;
            r02[Compaction.TEXT.ordinal()] = 1;     // Catch: NoSuchFieldError -> L7
        L10:
            $SwitchMap$com$google$zxing$pdf417$encoder$Compaction[Compaction.BYTE.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L12:
            $SwitchMap$com$google$zxing$pdf417$encoder$Compaction[Compaction.NUMERIC.ordinal()] = 3;     // Catch: NoSuchFieldError -> L9
            return;
        }
    }

    static {
        int r02 = 0;
        TEXT_MIXED_RAW = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, Ascii.CR, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};
        TEXT_PUNCTUATION_RAW = new byte[]{59, 60, 62, SignedBytes.MAX_POWER_OF_TWO, 91, 92, 93, 95, 96, 126, 33, Ascii.CR, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};
        byte[] r2 = new byte[128];
        MIXED = r2;
        PUNCTUATION = new byte[128];
        DEFAULT_ENCODING = StandardCharsets.ISO_8859_1;
        Arrays.fill(r2, (byte) -1);
        int r22 = 0;
    L3:
        byte[] r3 = TEXT_MIXED_RAW;
        if (r22 >= r3.length) goto L9;
        byte r32 = r3[r22];
        if (r32 <= 0) goto L8;
        MIXED[r32] = (byte) r22;
    L8:
        r22 = r22 + 1;
        goto L3
    L9:
        Arrays.fill(PUNCTUATION, (byte) -1);
    L10:
        byte[] r1 = TEXT_PUNCTUATION_RAW;
        if (r02 >= r1.length) goto L16;
        byte r12 = r1[r02];
        if (r12 <= 0) goto L15;
        PUNCTUATION[r12] = (byte) r02;
    L15:
        r02 = r02 + 1;
        goto L10
    }

    private PDF417HighLevelEncoder() {
    }

    private static int determineConsecutiveBinaryCount(String r5, int r6, Charset r7) throws WriterException {
        CharsetEncoder r72 = r7.newEncoder();
        int r02 = r5.length();
        int r1 = r6;
    L3:
        if (r1 >= r02) goto L21;
        char r2 = r5.charAt(r1);
        int r3 = 0;
    L6:
        if (r3 >= 13) goto L12;
        if (isDigit(r2) == false) goto L12;
        r3 = r3 + 1;
        int r22 = r1 + r3;
        if (r22 >= r02) goto L12;
        r2 = r5.charAt(r22);
    L12:
        if (r3 >= 13) goto L14;
        char r23 = r5.charAt(r1);
        if (r72.canEncode(r23) == false) goto L19;
        r1 = r1 + 1;
        goto L3
    L19:
        throw new WriterException("Non-encodable character detected: " + r23 + " (Unicode: " + r23 + ')');
    L14:
        return r1 - r6;
    L21:
        return r1 - r6;
    }

    private static int determineConsecutiveDigitCount(CharSequence r4, int r5) {
        int r02 = r4.length();
        int r1 = 0;
        if (r5 >= r02) goto L11;
        char r2 = r4.charAt(r5);
    L6:
        if (isDigit(r2) == false) goto L11;
        if (r5 >= r02) goto L11;
        r1 = r1 + 1;
        r5 = r5 + 1;
        if (r5 >= r02) goto L6;
        r2 = r4.charAt(r5);
    L11:
        return r1;
    }

    private static int determineConsecutiveTextCount(CharSequence r6, int r7) {
        int r02 = r6.length();
        int r1 = r7;
    L3:
        if (r1 >= r02) goto L21;
        char r2 = r6.charAt(r1);
        int r3 = 0;
    L6:
        if (r3 >= 13) goto L13;
        if (isDigit(r2) == false) goto L13;
        if (r1 >= r02) goto L13;
        r3 = r3 + 1;
        r1 = r1 + 1;
        if (r1 >= r02) goto L6;
        r2 = r6.charAt(r1);
    L13:
        if (r3 >= 13) goto L15;
        if (r3 > 0) goto L3;
        if (isText(r6.charAt(r1)) == false) goto L21;
        r1 = r1 + 1;
        goto L3
    L15:
        return (r1 - r7) - r3;
    L21:
        return r1 - r7;
    }

    private static void encodeBinary(byte[] r10, int r11, int r12, int r13, StringBuilder r14) {
        if (r12 != 1) goto L7;
        if (r13 != 0) goto L7;
        r14.append(913);
    L11:
        if (r12 < 6) goto L24;
        char[] r1 = new char[5];
        int r2 = r11;
    L14:
        if (((r11 + r12) - r2) < 6) goto L26;
        int r3 = 0;
        long r4 = 0;
        int r6 = 0;
    L16:
        if (r6 >= 6) goto L18;
        r4 = (r4 << 8) + (r10[r2 + r6] & UnsignedBytes.MAX_VALUE);
        r6 = r6 + 1;
    L18:
        if (r3 >= 5) goto L20;
        r1[r3] = (char) (r4 % 900);
        r4 = r4 / 900;
        r3 = r3 + 1;
        goto L18
    L20:
        int r32 = 4;
    L21:
        if (r32 < 0) goto L23;
        r14.append(r1[r32]);
        r32 = r32 - 1;
        goto L21
    L23:
        r2 = r2 + 6;
    L26:
        if (r2 >= (r11 + r12)) goto L28;
        r14.append((char) (r10[r2] & UnsignedBytes.MAX_VALUE));
        r2 = r2 + 1;
        goto L26
    L28:
        return;
    L24:
        r2 = r11;
    L7:
        if ((r12 % 6) != 0) goto L9;
        r14.append(924);
        goto L11
    L9:
        r14.append(901);
        goto L11
    }

    public static String encodeHighLevel(String r11, Compaction r12, Charset r13) throws WriterException {
        StringBuilder r02 = new StringBuilder(r11.length());
        if (r13 != null) goto L6;
        r13 = DEFAULT_ENCODING;
    L10:
        int r1 = r11.length();
        int r122 = AnonymousClass1.$SwitchMap$com$google$zxing$pdf417$encoder$Compaction[r12.ordinal()];
        if (r122 != 1) goto L13;
        encodeText(r11, 0, r1, r02, 0);
    L41:
        return r02.toString();
    L13:
        if (r122 != 2) goto L15;
        byte[] r112 = r11.getBytes(r13);
        encodeBinary(r112, 0, r112.length, 1, r02);
        goto L41
    L15:
        if (r122 == 3) goto L37;
        int r123 = 0;
        int r5 = 0;
        int r7 = 0;
    L17:
        if (r123 >= r1) goto L41;
        int r8 = determineConsecutiveDigitCount(r11, r123);
        if (r8 >= 13) goto L20;
        int r9 = determineConsecutiveTextCount(r11, r123);
        if (r9 >= 5) goto L34;
        if (r8 == r1) goto L34;
        int r82 = determineConsecutiveBinaryCount(r11, r123, r13);
        if (r82 != 0) goto L28;
        r82 = 1;
    L28:
        int r83 = r82 + r123;
        byte[] r124 = r11.substring(r123, r83).getBytes(r13);
        if (r124.length != 1) goto L32;
        if (r7 != 0) goto L32;
        encodeBinary(r124, 0, 1, 0, r02);
    L33:
        r123 = r83;
    L32:
        encodeBinary(r124, 0, r124.length, r7, r02);
        r7 = 1;
        r5 = 0;
    L34:
        if (r7 == 0) goto L36;
        r02.append(900);
        r5 = 0;
        r7 = 0;
    L36:
        r5 = encodeText(r11, r123, r9, r02, r5);
        r123 = r123 + r9;
        goto L17
    L20:
        r02.append(902);
        encodeNumeric(r11, r123, r8, r02);
        r123 = r123 + r8;
        r5 = 0;
        r7 = 2;
        goto L17
    L37:
        r02.append(902);
        encodeNumeric(r11, 0, r1, r02);
        goto L41
    L6:
        if (DEFAULT_ENCODING.equals(r13) == true) goto L10;
        CharacterSetECI r14 = CharacterSetECI.getCharacterSetECIByName(r13.name());
        if (r14 == null) goto L10;
        encodingECI(r14.getValue(), r02);
        goto L10
    }

    private static void encodeNumeric(String r9, int r10, int r11, StringBuilder r12) {
        StringBuilder r02 = new StringBuilder((r11 / 3) + 1);
        BigInteger r1 = BigInteger.valueOf(900);
        BigInteger r2 = BigInteger.valueOf(0);
        int r4 = 0;
    L3:
        if (r4 >= r11) goto L11;
        r02.setLength(0);
        int r5 = Math.min(44, r11 - r4);
        StringBuilder r6 = new StringBuilder(GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A);
        int r7 = r10 + r4;
        r6.append(r9.substring(r7, r7 + r5));
        BigInteger r72 = new BigInteger(r6.toString());
    L5:
        r02.append((char) r72.mod(r1).intValue());
        r72 = r72.divide(r1);
        if (r72.equals(r2) == false) goto L5;
        int r62 = r02.length() - 1;
    L8:
        if (r62 < 0) goto L10;
        r12.append(r02.charAt(r62));
        r62 = r62 - 1;
        goto L8
    L10:
        r4 = r4 + r5;
        goto L3
    }

    private static int encodeText(CharSequence r16, int r17, int r18, StringBuilder r19, int r20) {
        StringBuilder r3 = new StringBuilder(r18);
        int r4 = 0;
        int r5 = r20;
        int r6 = 0;
    L3:
        int r7 = r17 + r6;
        char r8 = r16.charAt(r7);
        if (r5 == 0) goto L42;
        if (r5 != 1) goto L6;
        if (isAlphaLower(r8) == true) goto L30;
        if (isAlphaUpper(r8) == true) goto L35;
        if (isMixed(r8) == false) goto L40;
        r3.append(28);
    L39:
        r5 = 2;
        goto L3
    L40:
        r3.append(29);
        r3.append((char) PUNCTUATION[r8]);
    L53:
        r6 = r6 + 1;
        if (r6 < r18) goto L3;
        int r02 = r3.length();
        char r1 = 0;
    L56:
        if (r4 >= r02) goto L63;
        if ((r4 % 2) == 0) goto L60;
        r1 = (char) ((r1 * 30) + r3.charAt(r4));
        r19.append(r1);
    L61:
        r4 = r4 + 1;
        goto L56
    L60:
        r1 = r3.charAt(r4);
        goto L61
    L63:
        if ((r02 % 2) == 0) goto L65;
        r19.append((char) ((r1 * 30) + 29));
    L65:
        return r5;
    L35:
        r3.append(27);
        r3.append((char) (r8 - 'A'));
        goto L53
    L30:
        if (r8 != ' ') goto L32;
        r3.append(26);
        goto L53
    L32:
        r3.append((char) (r8 - 'a'));
        goto L53
    L6:
        if (r5 != 2) goto L8;
        if (isMixed(r8) == true) goto L14;
        if (isAlphaUpper(r8) == false) goto L19;
        r3.append(28);
    L11:
        r5 = 0;
        goto L3
    L19:
        if (isAlphaLower(r8) == false) goto L22;
        r3.append(27);
    L21:
        r5 = 1;
        goto L3
    L22:
        int r72 = r7 + 1;
        if (r72 >= r18) goto L27;
        if (isPunctuation(r16.charAt(r72)) == false) goto L27;
        r3.append(25);
        r5 = 3;
    L27:
        r3.append(29);
        r3.append((char) PUNCTUATION[r8]);
        goto L53
    L14:
        r3.append((char) MIXED[r8]);
        goto L53
    L8:
        if (isPunctuation(r8) == true) goto L9;
        r3.append(29);
        goto L11
    L9:
        r3.append((char) PUNCTUATION[r8]);
        goto L53
    L42:
        if (isAlphaUpper(r8) == true) goto L43;
        if (isAlphaLower(r8) == false) goto L50;
        r3.append(27);
        goto L21
    L50:
        if (isMixed(r8) == false) goto L52;
        r3.append(28);
        goto L39
    L52:
        r3.append(29);
        r3.append((char) PUNCTUATION[r8]);
        goto L53
    L43:
        if (r8 != ' ') goto L45;
        r3.append(26);
        goto L53
    L45:
        r3.append((char) (r8 - 'A'));
        goto L53
    }

    private static void encodingECI(int r2, StringBuilder r3) throws WriterException {
        if (r2 < 0) goto L8;
        if (r2 >= LATCH_TO_TEXT) goto L8;
        r3.append(927);
        r3.append((char) r2);
        return;
    L8:
        if (r2 >= 810900) goto L12;
        r3.append(926);
        r3.append((char) ((r2 / LATCH_TO_TEXT) - 1));
        r3.append((char) (r2 % LATCH_TO_TEXT));
        return;
    L12:
        if (r2 >= 811800) goto L16;
        r3.append(925);
        r3.append((char) (810900 - r2));
        return;
    L16:
        throw new WriterException("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(r2)));
    }

    private static boolean isAlphaLower(char r1) {
        if (r1 != ' ') goto L5;
        return true;
    L5:
        if (r1 >= 'a') goto L7;
        return false;
    L7:
        if (r1 <= 'z') goto L14;
        return false;
    L14:
        return true;
    }

    private static boolean isAlphaUpper(char r1) {
        if (r1 != ' ') goto L5;
        return true;
    L5:
        if (r1 >= 'A') goto L7;
        return false;
    L7:
        if (r1 <= 'Z') goto L14;
        return false;
    L14:
        return true;
    }

    private static boolean isDigit(char r1) {
        if (r1 >= '0') goto L5;
        return false;
    L5:
        if (r1 > '9') goto L10;
        return true;
    L10:
        return false;
    }

    private static boolean isMixed(char r1) {
        if (MIXED[r1] == (-1)) goto L6;
        return true;
    L6:
        return false;
    }

    private static boolean isPunctuation(char r1) {
        if (PUNCTUATION[r1] == (-1)) goto L6;
        return true;
    L6:
        return false;
    }

    private static boolean isText(char r1) {
        if (r1 != '\t') goto L5;
        return true;
    L5:
        if (r1 != '\n') goto L7;
        return true;
    L7:
        if (r1 != '\r') goto L9;
        return true;
    L9:
        if (r1 >= ' ') goto L11;
        return false;
    L11:
        if (r1 <= '~') goto L20;
        return false;
    L20:
        return true;
    }
}
