package com.google.zxing.datamatrix.decoder;

import com.clevertap.android.sdk.Constants;
import com.google.common.base.Ascii;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitSource;
import com.google.zxing.common.DecoderResult;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes6.dex */
final class DecodedBitStreamParser {
    private static final char[] C40_BASIC_SET_CHARS = null;
    private static final char[] C40_SHIFT2_SET_CHARS = null;
    private static final char[] TEXT_BASIC_SET_CHARS = null;
    private static final char[] TEXT_SHIFT2_SET_CHARS = null;
    private static final char[] TEXT_SHIFT3_SET_CHARS = null;

    /* renamed from: com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode = null;

        static {
            int[] r02 = new int[Mode.values().length];
            $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode = r02;
            r02[Mode.C40_ENCODE.ordinal()] = 1;     // Catch: NoSuchFieldError -> L9
        L14:
            $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode[Mode.TEXT_ENCODE.ordinal()] = 2;     // Catch: NoSuchFieldError -> L10
        L18:
            $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode[Mode.ANSIX12_ENCODE.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
        L22:
            $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode[Mode.EDIFACT_ENCODE.ordinal()] = 4;     // Catch: NoSuchFieldError -> L12
        L16:
            $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode[Mode.BASE256_ENCODE.ordinal()] = 5;     // Catch: NoSuchFieldError -> L13
            return;
        }
    }

    public enum Mode extends Enum<Mode> {
        private static final /* synthetic */ Mode[] $VALUES = null;
        public static final Mode ANSIX12_ENCODE = null;
        public static final Mode ASCII_ENCODE = null;
        public static final Mode BASE256_ENCODE = null;
        public static final Mode C40_ENCODE = null;
        public static final Mode EDIFACT_ENCODE = null;
        public static final Mode PAD_ENCODE = null;
        public static final Mode TEXT_ENCODE = null;

        static {
            Mode r02 = new Mode("PAD_ENCODE", 0);
            PAD_ENCODE = r02;
            Mode r1 = new Mode("ASCII_ENCODE", 1);
            ASCII_ENCODE = r1;
            Mode r2 = new Mode("C40_ENCODE", 2);
            C40_ENCODE = r2;
            Mode r3 = new Mode("TEXT_ENCODE", 3);
            TEXT_ENCODE = r3;
            Mode r4 = new Mode("ANSIX12_ENCODE", 4);
            ANSIX12_ENCODE = r4;
            Mode r5 = new Mode("EDIFACT_ENCODE", 5);
            EDIFACT_ENCODE = r5;
            Mode r6 = new Mode("BASE256_ENCODE", 6);
            BASE256_ENCODE = r6;
            $VALUES = new Mode[]{r02, r1, r2, r3, r4, r5, r6};
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
        C40_BASIC_SET_CHARS = new char[]{'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] r2 = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};
        C40_SHIFT2_SET_CHARS = r2;
        TEXT_BASIC_SET_CHARS = new char[]{'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', Constants.INAPP_POSITION_LEFT, 'm', 'n', 'o', 'p', 'q', Constants.INAPP_POSITION_RIGHT, 's', Constants.INAPP_POSITION_TOP, 'u', 'v', 'w', 'x', 'y', 'z'};
        TEXT_SHIFT2_SET_CHARS = r2;
        TEXT_SHIFT3_SET_CHARS = new char[]{'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', Ascii.MAX};
    }

    private DecodedBitStreamParser() {
    }

    public static DecoderResult decode(byte[] r8) throws FormatException {
        BitSource r02 = new BitSource(r8);
        StringBuilder r1 = new StringBuilder(100);
        StringBuilder r2 = new StringBuilder(0);
        ArrayList r3 = new ArrayList(1);
        Mode r5 = Mode.ASCII_ENCODE;
    L3:
        Mode r6 = Mode.ASCII_ENCODE;
        if (r5 != r6) goto L6;
        r5 = decodeAsciiSegment(r02, r1, r2);
    L25:
        if (r5 == Mode.PAD_ENCODE) goto L29;
        if (r02.available() > 0) goto L3;
    L29:
        if (r2.length() <= 0) goto L31;
        r1.append(r2);
    L31:
        String r12 = r1.toString();
        if (r3.isEmpty() == false) goto L35;
        r3 = null;
    L35:
        return new DecoderResult(r8, r12, r3, null);
    L6:
        int r52 = AnonymousClass1.$SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode[r5.ordinal()];
        if (r52 != 1) goto L9;
        decodeC40Segment(r02, r1);
    L23:
        r5 = r6;
        goto L25
    L9:
        if (r52 != 2) goto L11;
        decodeTextSegment(r02, r1);
        goto L23
    L11:
        if (r52 != 3) goto L13;
        decodeAnsiX12Segment(r02, r1);
        goto L23
    L13:
        if (r52 != 4) goto L15;
        decodeEdifactSegment(r02, r1);
        goto L23
    L15:
        if (r52 != 5) goto L18;
        decodeBase256Segment(r02, r1, r3);
        goto L23
    L18:
        throw FormatException.getFormatInstance();
    }

    private static void decodeAnsiX12Segment(BitSource r5, StringBuilder r6) throws FormatException {
        int[] r1 = new int[3];
    L4:
        if (r5.available() == 8) goto L33;
        int r2 = r5.readBits(8);
        if (r2 == 254) goto L46;
        parseTwoBytes(r2, r5.readBits(8), r1);
        int r22 = 0;
    L10:
        if (r22 >= 3) goto L32;
        int r3 = r1[r22];
        if (r3 != 0) goto L14;
        r6.append('\r');
    L30:
        r22 = r22 + 1;
        goto L10
    L14:
        if (r3 != 1) goto L16;
        r6.append('*');
        goto L30
    L16:
        if (r3 == 2) goto L27;
        if (r3 != 3) goto L19;
        r6.append(' ');
        goto L30
    L19:
        if (r3 >= 14) goto L22;
        r6.append((char) (r3 + 44));
        goto L30
    L22:
        if (r3 >= 40) goto L25;
        r6.append((char) (r3 + 51));
        goto L30
    L25:
        throw FormatException.getFormatInstance();
    L27:
        r6.append('>');
        goto L30
    L32:
        if (r5.available() > 0) goto L4;
        return;
    L46:
        return;
    }

    private static Mode decodeAsciiSegment(BitSource r5, StringBuilder r6, StringBuilder r7) throws FormatException {
        boolean r1 = false;
    L3:
        int r2 = r5.readBits(8);
        if (r2 == 0) goto L49;
        if (r2 <= 128) goto L7;
        if (r2 == 129) goto L14;
        if (r2 > 229) goto L22;
        int r22 = r2 - 130;
        if (r22 >= 10) goto L20;
        r6.append('0');
    L20:
        r6.append(r22);
    L41:
        if (r5.available() > 0) goto L3;
        return Mode.ASCII_ENCODE;
    L22:
        switch(r2) {
            case 230: goto L47;
            case 231: goto L45;
            case 232: goto L39;
            case 233: goto L41;
            case 234: goto L41;
            case 235: goto L38;
            case 236: goto L37;
            case 237: goto L36;
            case 238: goto L35;
            case 239: goto L33;
            case 240: goto L31;
            case 241: goto L41;
            default: goto L24;
        };
    L36:
        r6.append("[)>\u001e06\u001d");
        r7.insert(0, "\u001e\u0004");
        goto L41
    L37:
        r6.append("[)>\u001e05\u001d");
        r7.insert(0, "\u001e\u0004");
        goto L41
    L38:
        r1 = true;
        goto L41
    L39:
        r6.append(29);
        goto L41
    L24:
        if (r2 != 254) goto L29;
        if (r5.available() == 0) goto L41;
    L29:
        throw FormatException.getFormatInstance();
    L31:
        return Mode.EDIFACT_ENCODE;
    L33:
        return Mode.TEXT_ENCODE;
    L35:
        return Mode.ANSIX12_ENCODE;
    L45:
        return Mode.BASE256_ENCODE;
    L47:
        return Mode.C40_ENCODE;
    L14:
        return Mode.PAD_ENCODE;
    L7:
        if (r1 == false) goto L9;
        r2 = r2 + 128;
    L9:
        r6.append((char) (r2 - 1));
        return Mode.ASCII_ENCODE;
    L49:
        throw FormatException.getFormatInstance();
    }

    private static void decodeBase256Segment(BitSource r7, StringBuilder r8, Collection<byte[]> r9) throws FormatException {
        int r02 = r7.getByteOffset();
        int r4 = r02 + 2;
        int r1 = unrandomize255State(r7.readBits(8), r02 + 1);
        if (r1 != 0) goto L6;
        r1 = r7.available() / 8;
    L9:
        if (r1 < 0) goto L24;
        byte[] r03 = new byte[r1];
        int r3 = 0;
    L11:
        if (r3 >= r1) goto L17;
        if (r7.available() < 8) goto L16;
        r03[r3] = (byte) unrandomize255State(r7.readBits(8), r4);
        r3 = r3 + 1;
        r4 = r4 + 1;
        goto L11
    L16:
        throw FormatException.getFormatInstance();
    L17:
        r9.add(r03);
        r8.append(new String(r03, "ISO8859_1"));     // Catch: UnsupportedEncodingException -> L20
        return;
    L20:
        e = move-exception;
        throw new IllegalStateException("Platform does not support required encoding: ".concat(String.valueOf(e)));
    L24:
        throw FormatException.getFormatInstance();
    L6:
        if (r1 < 250) goto L9;
        r1 = ((r1 - 249) * 250) + unrandomize255State(r7.readBits(8), r4);
        r4 = r02 + 3;
        goto L9
    }

    private static void decodeC40Segment(BitSource r9, StringBuilder r10) throws FormatException {
        int[] r1 = new int[3];
        boolean r3 = false;
        int r4 = 0;
    L4:
        if (r9.available() == 8) goto L55;
        int r5 = r9.readBits(8);
        if (r5 == 254) goto L68;
        parseTwoBytes(r5, r9.readBits(8), r1);
        int r52 = 0;
    L10:
        if (r52 >= 3) goto L54;
        int r6 = r1[r52];
        if (r4 != 0) goto L14;
        if (r6 >= 3) goto L44;
        r4 = r6 + 1;
    L50:
        r52 = r52 + 1;
        goto L10
    L44:
        char[] r7 = C40_BASIC_SET_CHARS;
        if (r6 >= r7.length) goto L52;
        char r62 = r7[r6];
        if (r3 == false) goto L49;
        r10.append((char) (r62 + 128));
        r3 = false;
        goto L50
    L49:
        r10.append(r62);
        goto L50
    L52:
        throw FormatException.getFormatInstance();
    L14:
        if (r4 != 1) goto L16;
        if (r3 == false) goto L41;
        r10.append((char) (r6 + 128));
    L20:
        r3 = false;
    L22:
        r4 = 0;
        goto L50
    L41:
        r10.append((char) r6);
        goto L22
    L16:
        if (r4 == 2) goto L25;
        if (r4 != 3) goto L24;
        if (r3 == false) goto L21;
        r10.append((char) (r6 + 224));
        goto L20
    L21:
        r10.append((char) (r6 + 96));
        goto L22
    L24:
        throw FormatException.getFormatInstance();
    L25:
        char[] r42 = C40_SHIFT2_SET_CHARS;
        if (r6 >= r42.length) goto L32;
        char r43 = r42[r6];
        if (r3 == false) goto L30;
        r10.append((char) (r43 + 128));
        goto L20
    L30:
        r10.append(r43);
        goto L22
    L32:
        if (r6 != 27) goto L34;
        r10.append(29);
        goto L22
    L34:
        if (r6 != 30) goto L37;
        r3 = true;
        goto L22
    L37:
        throw FormatException.getFormatInstance();
    L54:
        if (r9.available() > 0) goto L4;
        return;
    L68:
        return;
    }

    private static void decodeEdifactSegment(BitSource r3, StringBuilder r4) {
    L3:
        if (r3.available() <= 16) goto L28;
        int r02 = 0;
    L7:
        if (r02 >= 4) goto L19;
        int r1 = r3.readBits(6);
        if (r1 == 31) goto L10;
        if ((r1 & 32) != 0) goto L17;
        r1 = r1 | 64;
    L17:
        r4.append((char) r1);
        r02 = r02 + 1;
        goto L7
    L10:
        int r42 = 8 - r3.getBitOffset();
        if (r42 == 8) goto L20;
        r3.readBits(r42);
        return;
    L20:
        return;
    L19:
        if (r3.available() > 0) goto L3;
        return;
    }

    private static void decodeTextSegment(BitSource r9, StringBuilder r10) throws FormatException {
        int[] r1 = new int[3];
        boolean r3 = false;
        int r4 = 0;
    L4:
        if (r9.available() == 8) goto L60;
        int r5 = r9.readBits(8);
        if (r5 == 254) goto L74;
        parseTwoBytes(r5, r9.readBits(8), r1);
        int r52 = 0;
    L10:
        if (r52 >= 3) goto L59;
        int r6 = r1[r52];
        if (r4 != 0) goto L14;
        if (r6 >= 3) goto L49;
        r4 = r6 + 1;
    L55:
        r52 = r52 + 1;
        goto L10
    L49:
        char[] r7 = TEXT_BASIC_SET_CHARS;
        if (r6 >= r7.length) goto L57;
        char r62 = r7[r6];
        if (r3 == false) goto L54;
        r10.append((char) (r62 + 128));
        r3 = false;
        goto L55
    L54:
        r10.append(r62);
        goto L55
    L57:
        throw FormatException.getFormatInstance();
    L14:
        if (r4 != 1) goto L16;
        if (r3 == false) goto L46;
        r10.append((char) (r6 + 128));
    L23:
        r3 = false;
    L25:
        r4 = 0;
        goto L55
    L46:
        r10.append((char) r6);
        goto L25
    L16:
        if (r4 == 2) goto L30;
        if (r4 != 3) goto L29;
        char[] r42 = TEXT_SHIFT3_SET_CHARS;
        if (r6 >= r42.length) goto L27;
        char r43 = r42[r6];
        if (r3 == false) goto L24;
        r10.append((char) (r43 + 128));
        goto L23
    L24:
        r10.append(r43);
        goto L25
    L27:
        throw FormatException.getFormatInstance();
    L29:
        throw FormatException.getFormatInstance();
    L30:
        char[] r44 = TEXT_SHIFT2_SET_CHARS;
        if (r6 >= r44.length) goto L37;
        char r45 = r44[r6];
        if (r3 == false) goto L35;
        r10.append((char) (r45 + 128));
        goto L23
    L35:
        r10.append(r45);
        goto L25
    L37:
        if (r6 != 27) goto L39;
        r10.append(29);
        goto L25
    L39:
        if (r6 != 30) goto L42;
        r3 = true;
        goto L25
    L42:
        throw FormatException.getFormatInstance();
    L59:
        if (r9.available() > 0) goto L4;
        return;
    L74:
        return;
    }

    private static void parseTwoBytes(int r2, int r3, int[] r4) {
        int r22 = ((r2 << 8) + r3) - 1;
        int r02 = r22 / 1600;
        r4[0] = r02;
        int r23 = r22 - (r02 * 1600);
        int r03 = r23 / 40;
        r4[1] = r03;
        r4[2] = r23 - (r03 * 40);
    }

    private static int unrandomize255State(int r02, int r1) {
        int r03 = r02 - (((r1 * 149) % com.google.firebase.perf.util.Constants.MAX_HOST_LENGTH) + 1);
        if (r03 < 0) goto L6;
        return r03;
    L6:
        return r03 + 256;
    }
}
