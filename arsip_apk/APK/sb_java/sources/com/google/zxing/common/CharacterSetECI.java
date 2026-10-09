package com.google.zxing.common;

import com.google.zxing.FormatException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public enum CharacterSetECI extends Enum<CharacterSetECI> {
    private static final /* synthetic */ CharacterSetECI[] $VALUES = null;
    public static final CharacterSetECI ASCII = null;
    public static final CharacterSetECI Big5 = null;
    public static final CharacterSetECI Cp1250 = null;
    public static final CharacterSetECI Cp1251 = null;
    public static final CharacterSetECI Cp1252 = null;
    public static final CharacterSetECI Cp1256 = null;
    public static final CharacterSetECI Cp437 = null;
    public static final CharacterSetECI EUC_KR = null;
    public static final CharacterSetECI GB18030 = null;
    public static final CharacterSetECI ISO8859_1 = null;
    public static final CharacterSetECI ISO8859_10 = null;
    public static final CharacterSetECI ISO8859_11 = null;
    public static final CharacterSetECI ISO8859_13 = null;
    public static final CharacterSetECI ISO8859_14 = null;
    public static final CharacterSetECI ISO8859_15 = null;
    public static final CharacterSetECI ISO8859_16 = null;
    public static final CharacterSetECI ISO8859_2 = null;
    public static final CharacterSetECI ISO8859_3 = null;
    public static final CharacterSetECI ISO8859_4 = null;
    public static final CharacterSetECI ISO8859_5 = null;
    public static final CharacterSetECI ISO8859_6 = null;
    public static final CharacterSetECI ISO8859_7 = null;
    public static final CharacterSetECI ISO8859_8 = null;
    public static final CharacterSetECI ISO8859_9 = null;
    private static final Map<String, CharacterSetECI> NAME_TO_ECI = null;
    public static final CharacterSetECI SJIS = null;
    public static final CharacterSetECI UTF8 = null;
    public static final CharacterSetECI UnicodeBigUnmarked = null;
    private static final Map<Integer, CharacterSetECI> VALUE_TO_ECI = null;
    private final String[] otherEncodingNames;
    private final int[] values;

    static {
        CharacterSetECI r1 = new CharacterSetECI("Cp437", 0, new int[]{0, 2}, new String[0]);
        Cp437 = r1;
        CharacterSetECI r3 = new CharacterSetECI("ISO8859_1", 1, new int[]{1, 3}, new String[]{"ISO-8859-1"});
        ISO8859_1 = r3;
        CharacterSetECI r32 = new CharacterSetECI("ISO8859_2", 2, 4, new String[]{"ISO-8859-2"});
        ISO8859_2 = r32;
        CharacterSetECI r4 = new CharacterSetECI("ISO8859_3", 3, 5, new String[]{"ISO-8859-3"});
        ISO8859_3 = r4;
        CharacterSetECI r5 = new CharacterSetECI("ISO8859_4", 4, 6, new String[]{"ISO-8859-4"});
        ISO8859_4 = r5;
        CharacterSetECI r6 = new CharacterSetECI("ISO8859_5", 5, 7, new String[]{"ISO-8859-5"});
        ISO8859_5 = r6;
        CharacterSetECI r7 = new CharacterSetECI("ISO8859_6", 6, 8, new String[]{"ISO-8859-6"});
        ISO8859_6 = r7;
        CharacterSetECI r8 = new CharacterSetECI("ISO8859_7", 7, 9, new String[]{"ISO-8859-7"});
        ISO8859_7 = r8;
        CharacterSetECI r9 = new CharacterSetECI("ISO8859_8", 8, 10, new String[]{"ISO-8859-8"});
        ISO8859_8 = r9;
        CharacterSetECI r10 = new CharacterSetECI("ISO8859_9", 9, 11, new String[]{"ISO-8859-9"});
        ISO8859_9 = r10;
        CharacterSetECI r11 = new CharacterSetECI("ISO8859_10", 10, 12, new String[]{"ISO-8859-10"});
        ISO8859_10 = r11;
        CharacterSetECI r12 = new CharacterSetECI("ISO8859_11", 11, 13, new String[]{"ISO-8859-11"});
        ISO8859_11 = r12;
        CharacterSetECI r13 = new CharacterSetECI("ISO8859_13", 12, 15, new String[]{"ISO-8859-13"});
        ISO8859_13 = r13;
        CharacterSetECI r14 = new CharacterSetECI("ISO8859_14", 13, 16, new String[]{"ISO-8859-14"});
        ISO8859_14 = r14;
        CharacterSetECI r15 = new CharacterSetECI("ISO8859_15", 14, 17, new String[]{"ISO-8859-15"});
        ISO8859_15 = r15;
        CharacterSetECI r02 = new CharacterSetECI("ISO8859_16", 15, 18, new String[]{"ISO-8859-16"});
        ISO8859_16 = r02;
        CharacterSetECI r16 = new CharacterSetECI(StringUtils.SHIFT_JIS, 16, 20, new String[]{"Shift_JIS"});
        SJIS = r16;
        CharacterSetECI r03 = new CharacterSetECI("Cp1250", 17, 21, new String[]{"windows-1250"});
        Cp1250 = r03;
        CharacterSetECI r17 = new CharacterSetECI("Cp1251", 18, 22, new String[]{"windows-1251"});
        Cp1251 = r17;
        CharacterSetECI r04 = new CharacterSetECI("Cp1252", 19, 23, new String[]{"windows-1252"});
        Cp1252 = r04;
        CharacterSetECI r2 = new CharacterSetECI("Cp1256", 20, 24, new String[]{"windows-1256"});
        Cp1256 = r2;
        CharacterSetECI r05 = new CharacterSetECI("UnicodeBigUnmarked", 21, 25, new String[]{"UTF-16BE", "UnicodeBig"});
        UnicodeBigUnmarked = r05;
        CharacterSetECI r18 = new CharacterSetECI("UTF8", 22, 26, new String[]{"UTF-8"});
        UTF8 = r18;
        CharacterSetECI r06 = new CharacterSetECI("ASCII", 23, new int[]{27, 170}, new String[]{"US-ASCII"});
        ASCII = r06;
        CharacterSetECI r19 = new CharacterSetECI("Big5", 24, 28);
        Big5 = r19;
        CharacterSetECI r22 = new CharacterSetECI("GB18030", 25, 29, new String[]{StringUtils.GB2312, "EUC_CN", "GBK"});
        GB18030 = r22;
        CharacterSetECI r07 = new CharacterSetECI("EUC_KR", 26, 30, new String[]{"EUC-KR"});
        EUC_KR = r07;
        $VALUES = new CharacterSetECI[]{r1, r3, r32, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r02, r16, r03, r17, r04, r2, r05, r18, r06, r19, r22, r07};
        VALUE_TO_ECI = new HashMap();
        NAME_TO_ECI = new HashMap();
        CharacterSetECI[] r08 = values();
        int r110 = r08.length;
        int r23 = 0;
    L3:
        if (r23 >= r110) goto L11;
        CharacterSetECI r33 = r08[r23];
        int[] r42 = r33.values;
        int r52 = r42.length;
        int r62 = 0;
    L5:
        if (r62 >= r52) goto L7;
        int r72 = r42[r62];
        VALUE_TO_ECI.put(Integer.valueOf(r72), r33);
        r62 = r62 + 1;
        goto L5
    L7:
        NAME_TO_ECI.put(r33.name(), r33);
        String[] r43 = r33.otherEncodingNames;
        int r53 = r43.length;
        int r63 = 0;
    L8:
        if (r63 >= r53) goto L10;
        String r73 = r43[r63];
        NAME_TO_ECI.put(r73, r33);
        r63 = r63 + 1;
        goto L8
    L10:
        r23 = r23 + 1;
        goto L3
    }

    CharacterSetECI(String r2, int r3, int r4) {
        this(r2, r3, new int[]{r4}, new String[0]);
    }

    public static CharacterSetECI getCharacterSetECIByName(String r1) {
        return NAME_TO_ECI.get(r1);
    }

    public static CharacterSetECI getCharacterSetECIByValue(int r1) throws FormatException {
        if (r1 < 0) goto L8;
        if (r1 >= 900) goto L8;
        return VALUE_TO_ECI.get(Integer.valueOf(r1));
    L8:
        throw FormatException.getFormatInstance();
    }

    public static CharacterSetECI valueOf(String r1) {
        return (CharacterSetECI) Enum.valueOf(CharacterSetECI.class, r1);
    }

    public static CharacterSetECI[] values() {
        return (CharacterSetECI[]) $VALUES.clone();
    }

    public int getValue() {
        return this.values[0];
    }

    CharacterSetECI(String r1, int r2, int r3, String... r4) {
        this.values = new int[]{r3};
        this.otherEncodingNames = r4;
    }

    CharacterSetECI(String r1, int r2, int[] r3, String... r4) {
        this.values = r3;
        this.otherEncodingNames = r4;
    }
}
