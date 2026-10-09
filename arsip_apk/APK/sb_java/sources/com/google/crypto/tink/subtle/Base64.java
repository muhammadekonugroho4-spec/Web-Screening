package com.google.crypto.tink.subtle;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.charset.Charset;

/* loaded from: classes6.dex */
public final class Base64 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int CRLF = 4;
    public static final int DEFAULT = 0;
    public static final int NO_CLOSE = 16;
    public static final int NO_PADDING = 1;
    public static final int NO_WRAP = 2;
    public static final int URL_SAFE = 8;
    private static final Charset UTF_8 = null;

    public static abstract class Coder {
        public int op;
        public byte[] output;

        public Coder() {
        }

        public abstract int maxOutputSize(int r1);

        public abstract boolean process(byte[] r1, int r2, int r3, boolean r4);
    }

    public static class Decoder extends Coder {
        private static final int[] DECODE = null;
        private static final int[] DECODE_WEBSAFE = null;
        private static final int EQUALS = -2;
        private static final int SKIP = -1;
        private final int[] alphabet;
        private int state;
        private int value;

        static {
            DECODE = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
            DECODE_WEBSAFE = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        }

        public Decoder(int r1, byte[] r2) {
            this.output = r2;
            if ((r1 & 8) != 0) goto L5;
            int[] r12 = DECODE;
        L6:
            this.alphabet = r12;
            this.state = 0;
            this.value = 0;
            return;
        L5:
            r12 = DECODE_WEBSAFE;
            goto L6
        }

        @Override // com.google.crypto.tink.subtle.Base64.Coder
        public int maxOutputSize(int r1) {
            return ((r1 * 3) / 4) + 10;
        }

        @Override // com.google.crypto.tink.subtle.Base64.Coder
        public boolean process(byte[] r17, int r18, int r19, boolean r20) {
            int r1 = this.state;
            if (r1 != 6) goto L5;
            return false;
        L5:
            int r4 = r19 + r18;
            int r5 = this.value;
            byte[] r6 = this.output;
            int[] r7 = this.alphabet;
            int r9 = 0;
            int r8 = r5;
            int r52 = r1;
            int r12 = r18;
        L7:
            if (r12 >= r4) goto L60;
            if (r52 != 0) goto L16;
        L9:
            int r14 = r12 + 4;
            if (r14 > r4) goto L14;
            r8 = (((r7[r17[r12] & UnsignedBytes.MAX_VALUE] << 18) | (r7[r17[r12 + 1] & UnsignedBytes.MAX_VALUE] << 12)) | (r7[r17[r12 + 2] & UnsignedBytes.MAX_VALUE] << 6)) | r7[r17[r12 + 3] & UnsignedBytes.MAX_VALUE];
            if (r8 < 0) goto L14;
            r6[r9 + 2] = (byte) r8;
            r6[r9 + 1] = (byte) (r8 >> 8);
            r6[r9] = (byte) (r8 >> 16);
            r9 = r9 + 3;
            r12 = r14;
        L14:
            if (r12 >= r4) goto L60;
        L16:
            int r142 = r12 + 1;
            int r13 = r7[r17[r12] & UnsignedBytes.MAX_VALUE];
            if (r52 == 0) goto L54;
            if (r52 != 1) goto L20;
            if (r13 >= 0) goto L42;
            if (r13 == (-1)) goto L59;
            this.state = 6;
            return false;
        L59:
            r12 = r142;
        L42:
            r13 = r13 | (r8 << 6);
        L43:
            r52 = r52 + 1;
            r8 = r13;
            goto L59
        L20:
            if (r52 != 2) goto L22;
            if (r13 >= 0) goto L42;
            if (r13 != (-2)) goto L46;
            r6[r9] = (byte) (r8 >> 4);
            r9 = r9 + 1;
            r52 = 4;
            goto L59
        L46:
            if (r13 == (-1)) goto L59;
            this.state = 6;
            return false;
        L22:
            if (r52 == 3) goto L34;
            if (r52 == 4) goto L29;
            if (r52 != 5) goto L59;
            if (r13 == (-1)) goto L59;
            this.state = 6;
            return false;
        L29:
            if (r13 != (-2)) goto L31;
            r52 = r52 + 1;
            goto L59
        L31:
            if (r13 == (-1)) goto L59;
            this.state = 6;
            return false;
        L34:
            if (r13 < 0) goto L36;
            int r15 = r13 | (r8 << 6);
            r6[r9 + 2] = (byte) r15;
            r6[r9 + 1] = (byte) (r15 >> 8);
            r6[r9] = (byte) (r15 >> 16);
            r9 = r9 + 3;
            r8 = r15;
            r52 = 0;
            goto L59
        L36:
            if (r13 != (-2)) goto L38;
            r6[r9 + 1] = (byte) (r8 >> 2);
            r6[r9] = (byte) (r8 >> 10);
            r9 = r9 + 2;
            r52 = 5;
            goto L59
        L38:
            if (r13 == (-1)) goto L59;
            this.state = 6;
            return false;
        L54:
            if (r13 >= 0) goto L43;
            if (r13 == (-1)) goto L59;
            this.state = 6;
            return false;
        L60:
            if (r20 == true) goto L63;
            this.state = r52;
            this.value = r8;
            this.op = r9;
            return true;
        L63:
            if (r52 == 1) goto L74;
            if (r52 == 2) goto L71;
            if (r52 == 3) goto L70;
            if (r52 != 4) goto L72;
            this.state = 6;
            return false;
        L72:
            this.state = r52;
            this.op = r9;
            return true;
        L70:
            int r16 = r9 + 1;
            r6[r9] = (byte) (r8 >> 10);
            r9 = r9 + 2;
            r6[r16] = (byte) (r8 >> 2);
            goto L72
        L71:
            r6[r9] = (byte) (r8 >> 4);
            r9 = r9 + 1;
            goto L72
        L74:
            this.state = 6;
            return false;
        }
    }

    public static class Encoder extends Coder {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static final byte[] ENCODE = null;
        private static final byte[] ENCODE_WEBSAFE = null;
        public static final int LINE_GROUPS = 19;
        private final byte[] alphabet;
        private int count;
        public final boolean doCr;
        public final boolean doNewline;
        public final boolean doPadding;
        private final byte[] tail;
        int tailLen;

        static {
            ENCODE = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
            ENCODE_WEBSAFE = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        }

        public Encoder(int r4, byte[] r5) {
            this.output = r5;
            boolean r1 = true;
            if ((r4 & 1) != 0) goto L5;
            boolean r52 = true;
        L6:
            this.doPadding = r52;
            if ((r4 & 2) != 0) goto L9;
            boolean r53 = true;
        L10:
            this.doNewline = r53;
            if ((r4 & 4) != 0) goto L14;
            r1 = false;
        L14:
            this.doCr = r1;
            if ((r4 & 8) != 0) goto L17;
            byte[] r42 = ENCODE;
        L18:
            this.alphabet = r42;
            this.tail = new byte[2];
            this.tailLen = 0;
            if (r53 == false) goto L21;
            int r43 = 19;
        L22:
            this.count = r43;
            return;
        L21:
            r43 = -1;
            goto L22
        L17:
            r42 = ENCODE_WEBSAFE;
            goto L18
        L9:
            r53 = false;
            goto L10
        L5:
            r52 = false;
            goto L6
        }

        @Override // com.google.crypto.tink.subtle.Base64.Coder
        public int maxOutputSize(int r1) {
            return ((r1 * 8) / 5) + 10;
        }

        @Override // com.google.crypto.tink.subtle.Base64.Coder
        @CanIgnoreReturnValue
        public boolean process(byte[] r18, int r19, int r20, boolean r21) {
            byte[] r1 = this.alphabet;
            byte[] r2 = this.output;
            int r3 = this.count;
            int r4 = r20 + r19;
            int r5 = this.tailLen;
            char r6 = 2;
            int r8 = 0;
            if (r5 == 1) goto L10;
            if (r5 != 2) goto L12;
            int r52 = r19 + 1;
            if (r52 > r4) goto L12;
            byte[] r10 = this.tail;
            int r102 = (((r10[1] & UnsignedBytes.MAX_VALUE) << 8) | ((r10[0] & UnsignedBytes.MAX_VALUE) << 16)) | (r18[r19] & UnsignedBytes.MAX_VALUE);
            this.tailLen = 0;
            int r11 = r52;
        L14:
            if (r102 == (-1)) goto L23;
            r2[0] = r1[(r102 >> 18) & 63];
            r2[1] = r1[(r102 >> 12) & 63];
            r2[2] = r1[(r102 >> 6) & 63];
            r2[3] = r1[r102 & 63];
            r3 = r3 - 1;
            if (r3 == 0) goto L18;
            int r9 = 4;
        L24:
            int r103 = r11 + 3;
            if (r103 > r4) goto L34;
            char r202 = r6;
            int r62 = (((r18[r11 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((r18[r11] & UnsignedBytes.MAX_VALUE) << 16)) | (r18[r11 + 2] & UnsignedBytes.MAX_VALUE);
            r2[r9] = r1[(r62 >> 18) & 63];
            r2[r9 + 1] = r1[(r62 >> 12) & 63];
            r2[r9 + 2] = r1[(r62 >> 6) & 63];
            r2[r9 + 3] = r1[r62 & 63];
            int r63 = r9 + 4;
            r3 = r3 - 1;
            if (r3 == 0) goto L29;
            r9 = r63;
            r11 = r103;
            r6 = r202;
            goto L24
        L29:
            if (this.doCr == false) goto L31;
            r2[r63] = Ascii.CR;
            r63 = r9 + 5;
        L31:
            r9 = r63 + 1;
            r2[r63] = 10;
            r6 = r202;
            r3 = 19;
            r11 = r103;
            goto L24
        L34:
            if (r21 == false) goto L79;
            int r64 = this.tailLen;
            if ((r11 - r64) != (r4 - 1)) goto L52;
            if (r64 <= 0) goto L39;
            byte r42 = this.tail[0];
            r8 = 1;
        L40:
            int r43 = (r42 & UnsignedBytes.MAX_VALUE) << 4;
            this.tailLen = r64 - r8;
            r2[r9] = r1[(r43 >> 6) & 63];
            int r65 = r9 + 2;
            r2[r9 + 1] = r1[r43 & 63];
            if (this.doPadding == false) goto L44;
            r2[r65] = 61;
            r65 = r9 + 4;
            r2[r9 + 3] = 61;
        L44:
            if (this.doNewline == true) goto L46;
            r9 = r65;
        L84:
            this.op = r9;
            this.count = r3;
            return true;
        L46:
            if (this.doCr == false) goto L48;
            r2[r65] = Ascii.CR;
            r65 = r65 + 1;
        L48:
            int r12 = r65 + 1;
            r2[r65] = 10;
        L49:
            r9 = r12;
            goto L84
        L39:
            r42 = r18[r11];
            goto L40
        L52:
            if ((r11 - r64) != (r4 - 2)) goto L71;
            if (r64 <= 1) goto L55;
            byte r44 = this.tail[0];
            r8 = 1;
        L56:
            int r45 = (r44 & UnsignedBytes.MAX_VALUE) << 10;
            if (r64 <= 0) goto L59;
            byte r53 = this.tail[r8];
            r8 = r8 + 1;
        L60:
            int r46 = r45 | ((r53 & UnsignedBytes.MAX_VALUE) << 2);
            this.tailLen = r64 - r8;
            r2[r9] = r1[(r46 >> 12) & 63];
            r2[r9 + 1] = r1[(r46 >> 6) & 63];
            int r54 = r9 + 3;
            r2[r9 + 2] = r1[r46 & 63];
            if (this.doPadding == false) goto L64;
            r2[r54] = 61;
            r54 = r9 + 4;
        L64:
            if (this.doNewline == true) goto L66;
            r9 = r54;
            goto L84
        L66:
            if (this.doCr == false) goto L68;
            r2[r54] = Ascii.CR;
            r54 = r54 + 1;
        L68:
            r12 = r54 + 1;
            r2[r54] = 10;
            goto L49
        L59:
            r53 = r18[r11];
            goto L60
        L55:
            byte r55 = r18[r11];
            r11 = r11 + 1;
            r44 = r55;
            goto L56
        L71:
            if (this.doNewline == false) goto L84;
            if (r9 <= 0) goto L84;
            if (r3 == 19) goto L84;
            if (this.doCr == false) goto L77;
            r2[r9] = Ascii.CR;
            r9 = r9 + 1;
        L77:
            r12 = r9 + 1;
            r2[r9] = 10;
            goto L49
        L79:
            if (r11 != (r4 - 1)) goto L82;
            byte[] r13 = this.tail;
            int r22 = this.tailLen;
            this.tailLen = r22 + 1;
            r13[r22] = r18[r11];
            goto L84
        L82:
            if (r11 != (r4 - 2)) goto L84;
            byte[] r14 = this.tail;
            int r23 = this.tailLen;
            int r47 = r23 + 1;
            this.tailLen = r47;
            r14[r23] = r18[r11];
            this.tailLen = r23 + 2;
            r14[r47] = r18[r11 + 1];
            goto L84
        L18:
            if (this.doCr == false) goto L20;
            r2[4] = Ascii.CR;
            int r32 = 5;
        L21:
            r9 = r32 + 1;
            r2[r32] = 10;
            r3 = 19;
            goto L24
        L20:
            r32 = 4;
            goto L21
        L23:
            r9 = 0;
        L12:
            r11 = r19;
            r102 = -1;
            goto L14
        L10:
            if ((r19 + 2) > r4) goto L12;
            r11 = r19 + 2;
            r102 = (r18[r19 + 1] & UnsignedBytes.MAX_VALUE) | (((this.tail[0] & UnsignedBytes.MAX_VALUE) << 16) | ((r18[r19] & UnsignedBytes.MAX_VALUE) << 8));
            this.tailLen = 0;
            goto L14
        }
    }

    static {
        UTF_8 = Charset.forName("UTF-8");
    }

    private Base64() {
    }

    public static byte[] decode(String r1) {
        return decode(r1, 2);
    }

    public static String encode(byte[] r1) {
        return encodeToString(r1, 2);
    }

    public static String encodeToString(byte[] r1, int r2) {
        return new String(encode(r1, r2), "US-ASCII");
    L4:
        e = move-exception;
        throw new AssertionError(e);
    }

    public static byte[] urlSafeDecode(String r1) {
        return decode(r1, 11);
    }

    public static String urlSafeEncode(byte[] r1) {
        return encodeToString(r1, 11);
    }

    public static byte[] decode(String r1, int r2) {
        return decode(r1.getBytes(UTF_8), r2);
    }

    public static byte[] encode(byte[] r2, int r3) {
        return encode(r2, 0, r2.length, r3);
    }

    public static byte[] decode(byte[] r2, int r3) {
        return decode(r2, 0, r2.length, r3);
    }

    public static byte[] encode(byte[] r5, int r6, int r7, int r8) {
        Encoder r02 = new Encoder(r8, null);
        int r82 = (r7 / 3) * 4;
        int r2 = 2;
        if (r02.doPadding == true) goto L5;
        int r1 = r7 % 3;
        if (r1 == 1) goto L12;
        if (r1 != 2) goto L14;
        r82 = r82 + 3;
    L14:
        if (r02.doNewline == false) goto L21;
        if (r7 <= 0) goto L21;
        int r12 = ((r7 - 1) / 57) + 1;
        if (r02.doCr == true) goto L20;
        r2 = 1;
    L20:
        r82 = r82 + (r12 * r2);
    L21:
        r02.output = new byte[r82];
        r02.process(r5, r6, r7, true);
        return r02.output;
    L12:
        r82 = r82 + 2;
        goto L14
    L5:
        if ((r7 % 3) <= 0) goto L14;
        r82 = r82 + 4;
        goto L14
    }

    public static String encodeToString(byte[] r1, int r2, int r3, int r4) {
        return new String(encode(r1, r2, r3, r4), "US-ASCII");
    L4:
        e = move-exception;
        throw new AssertionError(e);
    }

    public static byte[] decode(byte[] r2, int r3, int r4, int r5) {
        Decoder r02 = new Decoder(r5, new byte[(r4 * 3) / 4]);
        if (r02.process(r2, r3, r4, true) == false) goto L10;
        int r22 = r02.op;
        byte[] r32 = r02.output;
        if (r22 != r32.length) goto L7;
        return r32;
    L7:
        byte[] r42 = new byte[r22];
        System.arraycopy(r32, 0, r42, 0, r22);
        return r42;
    L10:
        throw new IllegalArgumentException("bad base-64");
    }
}
