package com.google.zxing.common;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.google.zxing.DecodeHintType;
import java.nio.charset.Charset;
import java.util.Map;

/* loaded from: classes6.dex */
public final class StringUtils {
    private static final boolean ASSUME_SHIFT_JIS = false;
    private static final String EUC_JP = "EUC_JP";
    public static final String GB2312 = "GB2312";
    private static final String ISO88591 = "ISO8859_1";
    private static final String PLATFORM_DEFAULT_ENCODING = null;
    public static final String SHIFT_JIS = "SJIS";
    private static final String UTF8 = "UTF8";

    static {
        String r02 = Charset.defaultCharset().name();
        PLATFORM_DEFAULT_ENCODING = r02;
        if (SHIFT_JIS.equalsIgnoreCase(r02) == false) goto L5;
    L8:
        boolean r03 = true;
    L9:
        ASSUME_SHIFT_JIS = r03;
        return;
    L5:
        if (EUC_JP.equalsIgnoreCase(r02) == true) goto L8;
        r03 = false;
        goto L9
    }

    private StringUtils() {
    }

    public static String guessEncoding(byte[] r21, Map<DecodeHintType, ?> r22) {
        byte[] r02 = r21;
        if (r22 == null) goto L8;
        DecodeHintType r2 = DecodeHintType.CHARACTER_SET;
        if (r22.containsKey(r2) == false) goto L8;
        return r22.get(r2).toString();
    L8:
        int r1 = r02.length;
        boolean r5 = true;
        int r6 = 0;
        if (r02.length > 3) goto L11;
    L17:
        boolean r23 = false;
    L18:
        boolean r7 = true;
        boolean r8 = true;
        int r3 = 0;
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
        int r12 = 0;
        int r13 = 0;
        int r14 = 0;
        int r15 = 0;
        int r16 = 0;
        int r17 = 0;
        int r18 = 0;
    L19:
        if (r9 >= r1) goto L24;
        if (r5 == true) goto L25;
        if (r7 == true) goto L25;
        if (r8 == false) goto L24;
    L25:
        byte r4 = r02[r9];
        int r03 = r4 & UnsignedBytes.MAX_VALUE;
        if (r8 == false) goto L31;
        if (r10 > 0) goto L29;
        boolean r19 = r23;
        if ((r4 & UnsignedBytes.MAX_POWER_OF_TWO) != 0) goto L36;
    L49:
        if (r5 == false) goto L62;
        if (r03 <= 127) goto L54;
        if (r03 >= 160) goto L54;
        r5 = false;
    L54:
        if (r03 <= 159) goto L62;
        if (r03 >= 192) goto L58;
    L61:
        r16 = r16 + 1;
        goto L62
    L58:
        if (r03 == 215) goto L61;
        if (r03 == 247) goto L61;
    L62:
        if (r7 == false) goto L95;
        if (r11 <= 0) goto L73;
        if (r03 < 64) goto L71;
        if (r03 == 127) goto L71;
        if (r03 > 252) goto L71;
        r11 = r11 - 1;
    L71:
        r7 = false;
        goto L95
    L73:
        if (r03 == 128) goto L71;
        if (r03 == 160) goto L71;
        if (r03 > 239) goto L71;
        if (r03 <= 160) goto L88;
        if (r03 >= 224) goto L88;
        r3 = r3 + 1;
        int r04 = r18 + 1;
        if (r04 <= r15) goto L86;
        r15 = r04;
        r18 = r15;
    L85:
        r17 = 0;
        goto L95
    L86:
        r18 = r04;
    L88:
        if (r03 <= 127) goto L94;
        r11 = r11 + 1;
        int r05 = r17 + 1;
        if (r05 <= r6) goto L93;
        r6 = r05;
        r17 = r6;
    L92:
        r18 = 0;
        goto L95
    L93:
        r17 = r05;
        goto L92
    L94:
        r17 = 0;
    L95:
        r9 = r9 + 1;
        r02 = r21;
        r23 = r19;
        goto L19
    L36:
        if ((r4 & SignedBytes.MAX_POWER_OF_TWO) == 0) goto L47;
        int r24 = r10 + 1;
        if ((r4 & 32) != 0) goto L41;
        r12 = r12 + 1;
    L40:
        r10 = r24;
        goto L49
    L41:
        r24 = r10 + 2;
        if ((r4 & Ascii.DLE) != 0) goto L44;
        r13 = r13 + 1;
        goto L40
    L44:
        r10 = r10 + 3;
        if ((r4 & 8) != 0) goto L47;
        r14 = r14 + 1;
    L47:
        r8 = false;
        goto L49
    L29:
        if ((r4 & UnsignedBytes.MAX_POWER_OF_TWO) == 0) goto L32;
        r10 = r10 - 1;
        goto L31
    L32:
        r19 = r23;
    L31:
        r19 = r23;
    L24:
        boolean r192 = r23;
        if (r8 == false) goto L99;
        if (r10 <= 0) goto L99;
        r8 = false;
    L99:
        if (r7 == false) goto L103;
        if (r11 <= 0) goto L103;
        r7 = false;
    L103:
        if (r8 == false) goto L109;
        if (r192 == false) goto L106;
    L107:
        return UTF8;
    L106:
        if (((r12 + r13) + r14) > 0) goto L107;
    L109:
        if (r7 == false) goto L117;
        if (ASSUME_SHIFT_JIS == false) goto L113;
    L115:
        return SHIFT_JIS;
    L113:
        if (r15 >= 3) goto L115;
        if (r6 >= 3) goto L115;
    L117:
        if (r5 == false) goto L126;
        if (r7 == false) goto L126;
        if (r15 != 2) goto L123;
        if (r3 != 2) goto L123;
    L124:
        return SHIFT_JIS;
    L123:
        if ((r16 * 10) >= r1) goto L124;
        return ISO88591;
    L126:
        if (r5 == false) goto L128;
        return ISO88591;
    L128:
        if (r7 == false) goto L130;
        return SHIFT_JIS;
    L130:
        if (r8 == false) goto L133;
        return UTF8;
    L133:
        return PLATFORM_DEFAULT_ENCODING;
    L11:
        if (r02[0] != (-17)) goto L17;
        if (r02[1] != (-69)) goto L17;
        if (r02[2] != (-65)) goto L17;
        r23 = true;
        goto L18
    }
}
