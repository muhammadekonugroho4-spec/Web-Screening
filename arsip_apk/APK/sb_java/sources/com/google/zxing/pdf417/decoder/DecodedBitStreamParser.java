package com.google.zxing.pdf417.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.pdf417.PDF417ResultMetadata;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes6.dex */
final class DecodedBitStreamParser {
    private static final int AL = 28;
    private static final int AS = 27;
    private static final int BEGIN_MACRO_PDF417_CONTROL_BLOCK = 928;
    private static final int BEGIN_MACRO_PDF417_OPTIONAL_FIELD = 923;
    private static final int BYTE_COMPACTION_MODE_LATCH = 901;
    private static final int BYTE_COMPACTION_MODE_LATCH_6 = 924;
    private static final int ECI_CHARSET = 927;
    private static final int ECI_GENERAL_PURPOSE = 926;
    private static final int ECI_USER_DEFINED = 925;
    private static final BigInteger[] EXP900 = null;
    private static final int LL = 27;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_ADDRESSEE = 4;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_CHECKSUM = 6;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_FILE_NAME = 0;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_FILE_SIZE = 5;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_SEGMENT_COUNT = 1;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_SENDER = 3;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_TIME_STAMP = 2;
    private static final int MACRO_PDF417_TERMINATOR = 922;
    private static final int MAX_NUMERIC_CODEWORDS = 15;
    private static final char[] MIXED_CHARS = null;
    private static final int ML = 28;
    private static final int MODE_SHIFT_TO_BYTE_COMPACTION_MODE = 913;
    private static final int NUMBER_OF_SEQUENCE_CODEWORDS = 2;
    private static final int NUMERIC_COMPACTION_MODE_LATCH = 902;
    private static final int PAL = 29;
    private static final int PL = 25;
    private static final int PS = 29;
    private static final char[] PUNCT_CHARS = null;
    private static final int TEXT_COMPACTION_MODE_LATCH = 900;

    /* renamed from: com.google.zxing.pdf417.decoder.DecodedBitStreamParser$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode = null;

        static {
            int[] r02 = new int[Mode.values().length];
            $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode = r02;
            r02[Mode.ALPHA.ordinal()] = 1;     // Catch: NoSuchFieldError -> L10
        L16:
            $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[Mode.LOWER.ordinal()] = 2;     // Catch: NoSuchFieldError -> L11
        L20:
            $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[Mode.MIXED.ordinal()] = 3;     // Catch: NoSuchFieldError -> L12
        L26:
            $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[Mode.PUNCT.ordinal()] = 4;     // Catch: NoSuchFieldError -> L13
        L18:
            $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[Mode.ALPHA_SHIFT.ordinal()] = 5;     // Catch: NoSuchFieldError -> L14
        L22:
            $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[Mode.PUNCT_SHIFT.ordinal()] = 6;     // Catch: NoSuchFieldError -> L15
            return;
        }
    }

    public enum Mode extends Enum<Mode> {
        private static final /* synthetic */ Mode[] $VALUES = null;
        public static final Mode ALPHA = null;
        public static final Mode ALPHA_SHIFT = null;
        public static final Mode LOWER = null;
        public static final Mode MIXED = null;
        public static final Mode PUNCT = null;
        public static final Mode PUNCT_SHIFT = null;

        static {
            Mode r02 = new Mode("ALPHA", 0);
            ALPHA = r02;
            Mode r1 = new Mode("LOWER", 1);
            LOWER = r1;
            Mode r2 = new Mode("MIXED", 2);
            MIXED = r2;
            Mode r3 = new Mode("PUNCT", 3);
            PUNCT = r3;
            Mode r4 = new Mode("ALPHA_SHIFT", 4);
            ALPHA_SHIFT = r4;
            Mode r5 = new Mode("PUNCT_SHIFT", 5);
            PUNCT_SHIFT = r5;
            $VALUES = new Mode[]{r02, r1, r2, r3, r4, r5};
        }

        Mode(String r1, int r2) {
        }

        public static Mode valueOf(String r1) {
            return (Mode) Enum.valueOf(Mode.class, r1);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    static {
        PUNCT_CHARS = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();
        MIXED_CHARS = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();
        BigInteger[] r02 = new BigInteger[16];
        EXP900 = r02;
        r02[0] = BigInteger.ONE;
        BigInteger r1 = BigInteger.valueOf(900);
        r02[1] = r1;
        int r03 = 2;
    L3:
        BigInteger[] r2 = EXP900;
        if (r03 >= r2.length) goto L6;
        r2[r03] = r2[r03 - 1].multiply(r1);
        r03 = r03 + 1;
        goto L3
    }

    private DecodedBitStreamParser() {
    }

    private static int byteCompaction(int r19, int[] r20, Charset r21, int r22, StringBuilder r23) {
        ByteArrayOutputStream r1 = new ByteArrayOutputStream();
        int r9 = 0;
        if (r19 != BYTE_COMPACTION_MODE_LATCH) goto L5;
        int[] r02 = new int[6];
        int r2 = r22 + 1;
        int r4 = r20[r22];
        boolean r5 = false;
        int r8 = 0;
    L30:
        long r12 = 0;
    L31:
        int r92 = r20[0];
        if (r2 >= r92) goto L47;
        if (r5 == true) goto L47;
        int r93 = r8 + 1;
        r02[r8] = r4;
        r12 = (r12 * 900) + r4;
        int r42 = r2 + 1;
        int r82 = r20[r2];
        if (r82 == 928) goto L46;
        switch(r82) {
            case 900: goto L46;
            case 901: goto L46;
            case 902: goto L46;
            default: goto L37;
        };
    L37:
        switch(r82) {
            case 922: goto L46;
            case 923: goto L46;
            case 924: goto L46;
            default: goto L39;
        };
    L39:
        if ((r93 % 5) != 0) goto L45;
        if (r93 <= 0) goto L45;
        int r24 = 0;
    L42:
        if (r24 >= 6) goto L44;
        r1.write((byte) (r12 >> ((5 - r24) * 8)));
        r24 = r24 + 1;
        goto L42
    L44:
        r2 = r42;
        r4 = r82;
        r8 = 0;
    L45:
        r2 = r42;
        r4 = r82;
        r8 = r93;
    L46:
        r4 = r82;
        r8 = r93;
        r5 = true;
    L47:
        if (r2 != r92) goto L50;
        if (r4 >= TEXT_COMPACTION_MODE_LATCH) goto L50;
        r02[r8] = r4;
        r8 = r8 + 1;
    L50:
        int r94 = 0;
    L51:
        if (r94 >= r8) goto L53;
        r1.write((byte) r02[r94]);
        r94 = r94 + 1;
        goto L51
    L53:
        int r03 = r2;
    L54:
        r23.append(new String(r1.toByteArray(), r21));
        return r03;
    L5:
        if (r19 == BYTE_COMPACTION_MODE_LATCH_6) goto L7;
        r03 = r22;
        goto L54
    L7:
        r03 = r22;
        boolean r25 = false;
        int r122 = 0;
        long r13 = 0;
    L9:
        if (r03 >= r20[r9]) goto L54;
        if (r25 == true) goto L54;
        int r15 = r03 + 1;
        int r43 = r20[r03];
        if (r43 >= TEXT_COMPACTION_MODE_LATCH) goto L15;
        r122 = r122 + 1;
        r13 = (r13 * 900) + r43;
    L14:
        r03 = r15;
    L21:
        if ((r122 % 5) != 0) goto L27;
        if (r122 <= 0) goto L27;
        int r44 = r9;
    L24:
        if (r44 >= 6) goto L26;
        r1.write((byte) (r13 >> ((5 - r44) * 8)));
        r44 = r44 + 1;
        r9 = r9;
        goto L24
    L26:
        int r18 = r9;
        r122 = r18;
        r13 = 0;
    L28:
        r9 = r18;
    L27:
        r18 = r9;
        goto L28
    L15:
        if (r43 == 928) goto L19;
        switch(r43) {
            case 900: goto L19;
            case 901: goto L19;
            case 902: goto L19;
            default: goto L17;
        };
    L17:
        switch(r43) {
            case 922: goto L19;
            case 923: goto L19;
            case 924: goto L19;
            default: goto L14;
        };
    L19:
        r25 = true;
        goto L21
    }

    public static DecoderResult decode(int[] r6, String r7) throws FormatException {
        StringBuilder r02 = new StringBuilder(r6.length << 1);
        Charset r1 = StandardCharsets.ISO_8859_1;
        int r2 = r6[1];
        PDF417ResultMetadata r3 = new PDF417ResultMetadata();
        int r4 = 2;
    L4:
        if (r4 >= r6[0]) goto L26;
        if (r2 == MODE_SHIFT_TO_BYTE_COMPACTION_MODE) goto L19;
        switch(r2) {
            case 900: goto L18;
            case 901: goto L17;
            case 902: goto L16;
            default: goto L8;
        };
    L8:
        switch(r2) {
            case 922: goto L15;
            case 923: goto L15;
            case 924: goto L17;
            case 925: goto L13;
            case 926: goto L12;
            case 927: goto L11;
            case 928: goto L10;
            default: goto L9;
        };
    L9:
        int r22 = textCompaction(r6, r4 - 1, r02);
    L21:
        if (r22 >= r6.length) goto L24;
        r4 = r22 + 1;
        r2 = r6[r22];
        goto L4
    L24:
        throw FormatException.getFormatInstance();
    L10:
        r22 = decodeMacroBlock(r6, r4, r3);
        goto L21
    L11:
        r22 = r4 + 1;
        r1 = Charset.forName(CharacterSetECI.getCharacterSetECIByValue(r6[r4]).name());
        goto L21
    L12:
        r22 = r4 + 2;
        goto L21
    L13:
        r22 = r4 + 1;
        goto L21
    L15:
        throw FormatException.getFormatInstance();
    L16:
        r22 = numericCompaction(r6, r4, r02);
    L17:
        r22 = byteCompaction(r2, r6, r1, r4, r02);
        goto L21
    L18:
        r22 = textCompaction(r6, r4, r02);
        goto L21
    L19:
        r22 = r4 + 1;
        r02.append((char) r6[r4]);
        goto L21
    L26:
        if (r02.length() == 0) goto L30;
        DecoderResult r62 = new DecoderResult(null, r02.toString(), null, r7);
        r62.setOther(r3);
        return r62;
    L30:
        throw FormatException.getFormatInstance();
    }

    private static String decodeBase900toBase10(int[] r6, int r7) throws FormatException {
        BigInteger r02 = BigInteger.ZERO;
        int r2 = 0;
    L4:
        if (r2 >= r7) goto L6;
        r02 = r02.add(EXP900[(r7 - r2) - 1].multiply(BigInteger.valueOf(r6[r2])));
        r2 = r2 + 1;
        goto L4
    L6:
        String r62 = r02.toString();
        if (r62.charAt(0) != '1') goto L11;
        return r62.substring(1);
    L11:
        throw FormatException.getFormatInstance();
    }

    public static int decodeMacroBlock(int[] r6, int r7, PDF417ResultMetadata r8) throws FormatException {
        if ((r7 + 2) > r6[0]) goto L37;
        int[] r2 = new int[2];
        int r3 = 0;
    L5:
        if (r3 >= 2) goto L7;
        r2[r3] = r6[r7];
        r3 = r3 + 1;
        r7 = r7 + 1;
        goto L5
    L7:
        r8.setSegmentIndex(Integer.parseInt(decodeBase900toBase10(r2, 2)));
        StringBuilder r02 = new StringBuilder();
        int r72 = textCompaction(r6, r7, r02);
        r8.setFileId(r02.toString());
        if (r6[r72] != BEGIN_MACRO_PDF417_OPTIONAL_FIELD) goto L10;
        int r03 = r72 + 1;
    L12:
        if (r72 >= r6[0]) goto L30;
        int r4 = r6[r72];
        if (r4 != MACRO_PDF417_TERMINATOR) goto L15;
        r72 = r72 + 1;
        r8.setLastSegment(true);
        goto L12
    L15:
        if (r4 != BEGIN_MACRO_PDF417_OPTIONAL_FIELD) goto L28;
        switch(r6[r72 + 1]) {
            case 0: goto L26;
            case 1: goto L25;
            case 2: goto L24;
            case 3: goto L23;
            case 4: goto L22;
            case 5: goto L21;
            case 6: goto L20;
            default: goto L19;
        };
    L19:
        throw FormatException.getFormatInstance();
    L21:
        StringBuilder r42 = new StringBuilder();
        r72 = numericCompaction(r6, r72 + 2, r42);
        r8.setFileSize(Long.parseLong(r42.toString()));
        goto L12
    L22:
        StringBuilder r43 = new StringBuilder();
        r72 = textCompaction(r6, r72 + 2, r43);
        r8.setAddressee(r43.toString());
        goto L12
    L23:
        StringBuilder r44 = new StringBuilder();
        r72 = textCompaction(r6, r72 + 2, r44);
        r8.setSender(r44.toString());
        goto L12
    L24:
        StringBuilder r45 = new StringBuilder();
        r72 = numericCompaction(r6, r72 + 2, r45);
        r8.setTimestamp(Long.parseLong(r45.toString()));
        goto L12
    L25:
        StringBuilder r46 = new StringBuilder();
        r72 = numericCompaction(r6, r72 + 2, r46);
        r8.setSegmentCount(Integer.parseInt(r46.toString()));
        goto L12
    L26:
        StringBuilder r47 = new StringBuilder();
        r72 = textCompaction(r6, r72 + 2, r47);
        r8.setFileName(r47.toString());
        goto L12
    L20:
        StringBuilder r48 = new StringBuilder();
        r72 = numericCompaction(r6, r72 + 2, r48);
        r8.setChecksum(Integer.parseInt(r48.toString()));
        goto L12
    L28:
        throw FormatException.getFormatInstance();
    L30:
        if (r03 == (-1)) goto L35;
        int r1 = r72 - r03;
        if (r8.isLastSegment() == false) goto L34;
        r1 = r1 - 1;
    L34:
        r8.setOptionalData(Arrays.copyOfRange(r6, r03, r1 + r03));
    L35:
        return r72;
    L10:
        r03 = -1;
        goto L12
    L37:
        throw FormatException.getFormatInstance();
    }

    private static void decodeTextCompaction(int[] r11, int[] r12, int r13, StringBuilder r14) {
        Mode r02 = Mode.ALPHA;
        Mode r2 = r02;
        int r3 = 0;
    L3:
        if (r3 >= r13) goto L74;
        int r4 = r11[r3];
        char r6 = ' ';
        switch(AnonymousClass1.$SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode[r02.ordinal()]) {
            case 1: goto L60;
            case 2: goto L48;
            case 3: goto L35;
            case 4: goto L25;
            case 5: goto L19;
            case 6: goto L7;
            default: goto L17;
        };
    L7:
        if (r4 >= 29) goto L10;
        r6 = PUNCT_CHARS[r4];
    L9:
        r02 = r2;
    L71:
        if (r6 == 0) goto L73;
        r14.append(r6);
    L73:
        r3 = r3 + 1;
        goto L3
    L10:
        if (r4 == 29) goto L18;
        if (r4 == TEXT_COMPACTION_MODE_LATCH) goto L16;
        if (r4 != MODE_SHIFT_TO_BYTE_COMPACTION_MODE) goto L15;
        r14.append((char) r12[r3]);
    L15:
        r6 = 0;
        goto L9
    L16:
        r02 = Mode.ALPHA;
        goto L17
    L18:
        r02 = Mode.ALPHA;
        goto L17
    L19:
        if (r4 >= 26) goto L21;
        r6 = (char) (r4 + 65);
        goto L9
    L21:
        if (r4 == 26) goto L9;
        if (r4 == TEXT_COMPACTION_MODE_LATCH) goto L24;
        r02 = r2;
        goto L17
    L24:
        r02 = Mode.ALPHA;
        goto L17
    L25:
        if (r4 >= 29) goto L27;
        r6 = PUNCT_CHARS[r4];
        goto L71
    L27:
        if (r4 == 29) goto L33;
        if (r4 == TEXT_COMPACTION_MODE_LATCH) goto L32;
        if (r4 != MODE_SHIFT_TO_BYTE_COMPACTION_MODE) goto L17;
        r14.append((char) r12[r3]);
        goto L17
    L32:
        r02 = Mode.ALPHA;
        goto L17
    L33:
        r02 = Mode.ALPHA;
        goto L17
    L48:
        if (r4 >= 26) goto L51;
        int r42 = r4 + 97;
    L50:
        r6 = (char) r42;
        goto L71
    L51:
        if (r4 == TEXT_COMPACTION_MODE_LATCH) goto L59;
        if (r4 == MODE_SHIFT_TO_BYTE_COMPACTION_MODE) goto L58;
        switch(r4) {
            case 26: goto L71;
            case 27: goto L57;
            case 28: goto L56;
            case 29: goto L55;
            default: goto L17;
        };
    L55:
        Mode r22 = Mode.PUNCT_SHIFT;
    L42:
        Mode r62 = r22;
        r2 = r02;
        r02 = r62;
        goto L17
    L56:
        r02 = Mode.MIXED;
        goto L17
    L57:
        r22 = Mode.ALPHA_SHIFT;
        goto L42
    L58:
        r14.append((char) r12[r3]);
        goto L17
    L59:
        r02 = Mode.ALPHA;
        goto L17
    L60:
        if (r4 >= 26) goto L62;
        r42 = r4 + 65;
        goto L50
    L62:
        if (r4 == TEXT_COMPACTION_MODE_LATCH) goto L70;
        if (r4 == MODE_SHIFT_TO_BYTE_COMPACTION_MODE) goto L69;
        switch(r4) {
            case 26: goto L71;
            case 27: goto L68;
            case 28: goto L67;
            case 29: goto L66;
            default: goto L17;
        };
    L66:
        r22 = Mode.PUNCT_SHIFT;
        goto L42
    L67:
        r02 = Mode.MIXED;
        goto L17
    L68:
        r02 = Mode.LOWER;
        goto L17
    L69:
        r14.append((char) r12[r3]);
        goto L17
    L70:
        r02 = Mode.ALPHA;
    L17:
        r6 = 0;
        goto L71
    L35:
        if (r4 >= 25) goto L37;
        r6 = MIXED_CHARS[r4];
        goto L71
    L37:
        if (r4 == TEXT_COMPACTION_MODE_LATCH) goto L47;
        if (r4 == MODE_SHIFT_TO_BYTE_COMPACTION_MODE) goto L46;
        switch(r4) {
            case 25: goto L45;
            case 26: goto L71;
            case 27: goto L44;
            case 28: goto L43;
            case 29: goto L41;
            default: goto L17;
        };
    L41:
        r22 = Mode.PUNCT_SHIFT;
        goto L42
    L43:
        r02 = Mode.ALPHA;
        goto L17
    L44:
        r02 = Mode.LOWER;
        goto L17
    L45:
        r02 = Mode.PUNCT;
        goto L17
    L46:
        r14.append((char) r12[r3]);
        goto L17
    L47:
        r02 = Mode.ALPHA;
        goto L17
    }

    private static int numericCompaction(int[] r8, int r9, StringBuilder r10) throws FormatException {
        int[] r02 = new int[15];
        boolean r2 = false;
        int r3 = 0;
    L3:
        int r4 = r8[0];
        if (r9 >= r4) goto L28;
        if (r2 == true) goto L28;
        int r5 = r9 + 1;
        int r6 = r8[r9];
        if (r5 != r4) goto L10;
        r2 = true;
    L10:
        if (r6 >= TEXT_COMPACTION_MODE_LATCH) goto L13;
        r02[r3] = r6;
        r3 = r3 + 1;
    L12:
        r9 = r5;
    L22:
        if ((r3 % 15) == 0) goto L26;
        if (r6 == NUMERIC_COMPACTION_MODE_LATCH) goto L26;
        if (r2 == false) goto L3;
    L26:
        if (r3 <= 0) goto L3;
        r10.append(decodeBase900toBase10(r02, r3));
        r3 = 0;
        goto L3
    L13:
        if (r6 != TEXT_COMPACTION_MODE_LATCH) goto L15;
    L20:
        r2 = true;
        goto L22
    L15:
        if (r6 == BYTE_COMPACTION_MODE_LATCH) goto L20;
        if (r6 == 928) goto L20;
        switch(r6) {
            case 922: goto L20;
            case 923: goto L20;
            case 924: goto L20;
            default: goto L12;
        };
    L28:
        return r9;
    }

    private static int textCompaction(int[] r10, int r11, StringBuilder r12) {
        int r1 = r10[0];
        int[] r2 = new int[(r1 - r11) << 1];
        int[] r13 = new int[(r1 - r11) << 1];
        boolean r4 = false;
        int r5 = 0;
    L4:
        if (r11 >= r10[0]) goto L20;
        if (r4 == true) goto L20;
        int r6 = r11 + 1;
        int r7 = r10[r11];
        if (r7 < TEXT_COMPACTION_MODE_LATCH) goto L8;
        if (r7 != MODE_SHIFT_TO_BYTE_COMPACTION_MODE) goto L13;
        r2[r5] = MODE_SHIFT_TO_BYTE_COMPACTION_MODE;
        r11 = r11 + 2;
        r13[r5] = r10[r6];
        r5 = r5 + 1;
        goto L4
    L13:
        if (r7 == 928) goto L18;
        switch(r7) {
            case 900: goto L17;
            case 901: goto L18;
            case 902: goto L18;
            default: goto L15;
        };
    L15:
        switch(r7) {
            case 922: goto L18;
            case 923: goto L18;
            case 924: goto L18;
            default: goto L9;
        };
    L9:
        r11 = r6;
        goto L4
    L17:
        r2[r5] = TEXT_COMPACTION_MODE_LATCH;
        r5 = r5 + 1;
    L18:
        r4 = true;
        goto L4
    L8:
        r2[r5] = r7 / 30;
        r2[r5 + 1] = r7 % 30;
        r5 = r5 + 2;
    L20:
        decodeTextCompaction(r2, r13, r5, r12);
        return r11;
    }
}
