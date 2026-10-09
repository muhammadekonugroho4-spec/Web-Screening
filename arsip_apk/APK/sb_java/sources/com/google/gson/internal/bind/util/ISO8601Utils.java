package com.google.gson.internal.bind.util;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes6.dex */
public class ISO8601Utils {
    private static final TimeZone TIMEZONE_UTC = null;
    private static final String UTC_ID = "UTC";

    static {
        TIMEZONE_UTC = TimeZone.getTimeZone(UTC_ID);
    }

    public ISO8601Utils() {
    }

    private static boolean checkOffset(String r1, int r2, char r3) {
        if (r2 < r1.length()) goto L5;
        return false;
    L5:
        if (r1.charAt(r2) != r3) goto L10;
        return true;
    L10:
        return false;
    }

    public static String format(Date r2) {
        return format(r2, false, TIMEZONE_UTC);
    }

    private static int indexOfNonDigit(String r2, int r3) {
    L3:
        if (r3 >= r2.length()) goto L12;
        char r02 = r2.charAt(r3);
        if (r02 < '0') goto L10;
        if (r02 > '9') goto L10;
        r3 = r3 + 1;
    L10:
        return r3;
    L12:
        return r2.length();
    }

    private static void padInt(StringBuilder r1, int r2, int r3) {
        String r22 = Integer.toString(r2);
        int r32 = r3 - r22.length();
    L3:
        if (r32 <= 0) goto L5;
        r1.append('0');
        r32 = r32 - 1;
        goto L3
    L5:
        r1.append(r22);
    }

    public static Date parse(String r18, ParsePosition r19) throws ParseException {
        int r02 = r19.getIndex();     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        int r3 = r02 + 4;     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        int r4 = parseInt(r18, r02, r3);     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        if (checkOffset(r18, r3, '-') == false) goto L6;
        r3 = r02 + 5;     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
    L6:
        int r03 = r3 + 2;     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        int r6 = parseInt(r18, r3, r03);     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        if (checkOffset(r18, r03, '-') == false) goto L9;
        r03 = r3 + 3;     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
    L9:
        int r32 = r03 + 2;     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        int r8 = parseInt(r18, r03, r32);     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        boolean r9 = checkOffset(r18, r32, 'T');     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        if (r9 == true) goto L22;
        if (r18.length() > r32) goto L22;
        GregorianCalendar r04 = new GregorianCalendar(r4, r6 - 1, r8);     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        r04.setLenient(false);     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        r19.setIndex(r32);     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        return r04.getTime();
    L22:
        if (r9 == false) goto L52;
        int r92 = r03 + 5;     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        int r33 = parseInt(r18, r03 + 3, r92);     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        if (checkOffset(r18, r92, ':') == false) goto L26;
        r92 = r03 + 6;     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
    L26:
        int r05 = r92 + 2;     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        int r16 = parseInt(r18, r92, r05);     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        if (checkOffset(r18, r05, ':') == false) goto L30;
        r05 = r92 + 3;     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
    L30:
        if (r18.length() <= r05) goto L50;
        char r93 = r18.charAt(r05);     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        if (r93 == 'Z') goto L50;
        if (r93 == '+') goto L50;
        if (r93 == '-') goto L50;
        int r94 = r05 + 2;     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        int r15 = parseInt(r18, r05, r94);     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        if (r15 <= 59) goto L41;
        if (r15 >= 63) goto L41;
        r15 = 59;
    L41:
        if (checkOffset(r18, r94, '.') == false) goto L49;
        int r95 = r05 + 3;     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        int r11 = indexOfNonDigit(r18, r05 + 4);     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        int r06 = Math.min(r11, r05 + 6);     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        int r17 = parseInt(r18, r95, r06);     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        int r07 = r06 - r95;     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        if (r07 == 1) goto L47;
        if (r07 != 2) goto L48;
        r17 = r17 * 10;     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
    L48:
        int r08 = r33;
        r32 = r11;
        int r96 = r16;
        int r112 = r17;
    L54:
        if (r18.length() <= r32) goto L84;
        char r14 = r18.charAt(r32);     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        if (r14 != 'Z') goto L58;
        TimeZone r5 = TIMEZONE_UTC;     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        int r34 = r32 + 1;     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
    L81:
        GregorianCalendar r7 = new GregorianCalendar(r5);     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        r7.setLenient(false);     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        r7.set(1, r4);     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        r7.set(2, r6 - 1);     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        r7.set(5, r8);     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        r7.set(11, r08);     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        r7.set(12, r96);     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        r7.set(13, r15);     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        r7.set(14, r112);     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        r19.setIndex(r34);     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        return r7.getTime();
    L58:
        if (r14 == '+') goto L63;
        if (r14 == '-') goto L63;
        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + r14 + "'");     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
    L63:
        String r52 = r18.substring(r32);     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        if (r52.length() >= 5) goto L67;
        r52 = r52 + "00";     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
    L67:
        r34 = r32 + r52.length();     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        if ("+0000".equals(r52) == false) goto L70;
    L80:
        r5 = TIMEZONE_UTC;     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        goto L81
    L70:
        if ("+00:00".equals(r52) == true) goto L80;
        String r53 = "GMT" + r52;     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        TimeZone r12 = TimeZone.getTimeZone(r53);     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        String r13 = r12.getID();     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        if (r13.equals(r53) == false) goto L75;
    L79:
        r5 = r12;
        goto L81
    L75:
        if (r13.replace(":", "").equals(r53) == true) goto L79;
        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + r53 + " given, resolves to " + r12.getID());     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
    L84:
        throw new IllegalArgumentException("No time zone indicator");     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
    L47:
        r17 = r17 * 100;     // Catch: IllegalArgumentException -> L15 NumberFormatException -> L17 IndexOutOfBoundsException -> L19
        goto L48
    L49:
        r08 = r33;
        r32 = r94;
        r96 = r16;
        r112 = 0;
    L50:
        r32 = r05;
        r08 = r33;
        r96 = r16;
    L51:
        r112 = 0;
        r15 = 0;
        goto L54
    L52:
        r08 = 0;
        r96 = 0;
    L19:
        e = e;
    L85:
        if (r18 != null) goto L87;
        String r1 = null;
    L88:
        String r35 = e.getMessage();
        if (r35 != null) goto L91;
    L92:
        r35 = "(" + e.getClass().getName() + ")";
    L93:
        ParseException r42 = new ParseException("Failed to parse date [" + r1 + "]: " + r35, r19.getIndex());
        r42.initCause(e);
        throw r42;
    L91:
        if (r35.isEmpty() == false) goto L93;
    L87:
        r1 = '\"' + r18 + '\"';
    L17:
        e = e;
    L15:
        e = e;
        goto L85
    }

    private static int parseInt(String r5, int r6, int r7) throws NumberFormatException {
        if (r6 < 0) goto L23;
        if (r7 > r5.length()) goto L23;
        if (r6 > r7) goto L23;
        if (r6 >= r7) goto L13;
        int r2 = r6 + 1;
        int r3 = Character.digit(r5.charAt(r6), 10);
        if (r3 < 0) goto L12;
        int r32 = -r3;
    L14:
        if (r2 >= r7) goto L21;
        int r4 = r2 + 1;
        int r22 = Character.digit(r5.charAt(r2), 10);
        if (r22 < 0) goto L19;
        r32 = (r32 * 10) - r22;
        r2 = r4;
        goto L14
    L19:
        throw new NumberFormatException("Invalid number: " + r5.substring(r6, r7));
    L21:
        return -r32;
    L12:
        throw new NumberFormatException("Invalid number: " + r5.substring(r6, r7));
    L13:
        r32 = 0;
        r2 = r6;
    L23:
        throw new NumberFormatException(r5);
    }

    public static String format(Date r1, boolean r2) {
        return format(r1, r2, TIMEZONE_UTC);
    }

    public static String format(Date r6, boolean r7, TimeZone r8) {
        GregorianCalendar r02 = new GregorianCalendar(r8, Locale.US);
        r02.setTime(r6);
        if (r7 == false) goto L5;
        int r1 = 4;
    L6:
        int r2 = 19 + r1;
        if (r8.getRawOffset() != 0) goto L9;
        int r12 = 1;
    L10:
        StringBuilder r13 = new StringBuilder(r2 + r12);
        padInt(r13, r02.get(1), 4);
        char r62 = '-';
        r13.append('-');
        padInt(r13, r02.get(2) + 1, 2);
        r13.append('-');
        padInt(r13, r02.get(5), 2);
        r13.append('T');
        padInt(r13, r02.get(11), 2);
        r13.append(':');
        padInt(r13, r02.get(12), 2);
        r13.append(':');
        padInt(r13, r02.get(13), 2);
        if (r7 == false) goto L13;
        r13.append('.');
        padInt(r13, r02.get(14), 3);
    L13:
        int r72 = r8.getOffset(r02.getTimeInMillis());
        if (r72 == 0) goto L20;
        int r82 = r72 / 60000;
        int r03 = Math.abs(r82 / 60);
        int r83 = Math.abs(r82 % 60);
        if (r72 < 0) goto L19;
        r62 = '+';
    L19:
        r13.append(r62);
        padInt(r13, r03, 2);
        r13.append(':');
        padInt(r13, r83, 2);
    L22:
        return r13.toString();
    L20:
        r13.append('Z');
        goto L22
    L9:
        r12 = 6;
        goto L10
    L5:
        r1 = 0;
        goto L6
    }
}
