package com.gojek.ojosdk.exif;

import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/* loaded from: classes4.dex */
public class ExifTag {
    private static final long LONG_MAX = 2147483647L;
    private static final long LONG_MIN = -2147483648L;
    static final int SIZE_UNDEFINED = 0;
    private static final SimpleDateFormat TIME_FORMAT = null;
    public static final short TYPE_ASCII = 2;
    public static final short TYPE_LONG = 9;
    public static final short TYPE_RATIONAL = 10;
    private static final int[] TYPE_TO_SIZE_MAP = null;
    public static final short TYPE_UNDEFINED = 7;
    public static final short TYPE_UNSIGNED_BYTE = 1;
    public static final short TYPE_UNSIGNED_LONG = 4;
    public static final short TYPE_UNSIGNED_RATIONAL = 5;
    public static final short TYPE_UNSIGNED_SHORT = 3;
    private static final long UNSIGNED_LONG_MAX = 4294967295L;
    private static final int UNSIGNED_SHORT_MAX = 65535;
    private static Charset US_ASCII;
    private int mComponentCountActual;
    private final short mDataType;
    private boolean mHasDefinedDefaultComponentCount;
    private int mIfd;
    private int mOffset;
    private final short mTagId;
    private Object mValue;

    static {
        US_ASCII = Charset.forName("US-ASCII");
        TYPE_TO_SIZE_MAP = new int[]{0, 1, 1, 2, 4, 8, 0, 1, 0, 4, 8};
        TIME_FORMAT = new SimpleDateFormat("yyyy:MM:dd kk:mm:ss");
    }

    public ExifTag(short r1, short r2, int r3, int r4, boolean r5) {
        this.mTagId = r1;
        this.mDataType = r2;
        this.mComponentCountActual = r3;
        this.mHasDefinedDefaultComponentCount = r5;
        this.mIfd = r4;
        this.mValue = null;
    }

    private boolean checkBadComponentCount(int r2) {
        if (this.mHasDefinedDefaultComponentCount == true) goto L5;
        return false;
    L5:
        if (this.mComponentCountActual == r2) goto L10;
        return true;
    L10:
        return false;
    }

    private boolean checkOverflowForRational(Rational[] r9) {
        int r02 = r9.length;
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L16;
        Rational r3 = r9[r2];
        if (r3.getNumerator() < LONG_MIN) goto L14;
        if (r3.getDenominator() < LONG_MIN) goto L22;
        if (r3.getNumerator() > LONG_MAX) goto L23;
        if (r3.getDenominator() > LONG_MAX) goto L24;
        r2 = r2 + 1;
        goto L3
    L24:
        return true;
    L23:
        return true;
    L22:
        return true;
    L14:
        return true;
    L16:
        return false;
    }

    private boolean checkOverflowForUnsignedLong(long[] r8) {
        int r02 = r8.length;
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L12;
        long r3 = r8[r2];
        if (r3 < 0) goto L10;
        if (r3 > UNSIGNED_LONG_MAX) goto L16;
        r2 = r2 + 1;
        goto L3
    L16:
        return true;
    L10:
        return true;
    L12:
        return false;
    }

    private boolean checkOverflowForUnsignedRational(Rational[] r9) {
        int r02 = r9.length;
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L16;
        Rational r3 = r9[r2];
        if (r3.getNumerator() < 0) goto L14;
        if (r3.getDenominator() < 0) goto L22;
        if (r3.getNumerator() > UNSIGNED_LONG_MAX) goto L23;
        if (r3.getDenominator() > UNSIGNED_LONG_MAX) goto L24;
        r2 = r2 + 1;
        goto L3
    L24:
        return true;
    L23:
        return true;
    L22:
        return true;
    L14:
        return true;
    L16:
        return false;
    }

    private boolean checkOverflowForUnsignedShort(int[] r6) {
        int r02 = r6.length;
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L11;
        int r3 = r6[r2];
        if (r3 > UNSIGNED_SHORT_MAX) goto L9;
        if (r3 < 0) goto L15;
        r2 = r2 + 1;
        goto L3
    L15:
        return true;
    L9:
        return true;
    L11:
        return false;
    }

    private static String convertTypeToString(short r02) {
        switch(r02) {
            case 1: goto L19;
            case 2: goto L17;
            case 3: goto L15;
            case 4: goto L13;
            case 5: goto L11;
            case 6: goto L3;
            case 7: goto L9;
            case 8: goto L3;
            case 9: goto L7;
            case 10: goto L5;
            default: goto L3;
        };
    L3:
        return "";
    L5:
        return "RATIONAL";
    L7:
        return "LONG";
    L9:
        return "UNDEFINED";
    L11:
        return "UNSIGNED_RATIONAL";
    L13:
        return "UNSIGNED_LONG";
    L15:
        return "UNSIGNED_SHORT";
    L17:
        return "ASCII";
    L19:
        return "UNSIGNED_BYTE";
    }

    public static int getElementSize(short r1) {
        return TYPE_TO_SIZE_MAP[r1];
    }

    public static boolean isValidIfd(int r2) {
        if (r2 == 0) goto L14;
        if (r2 == 1) goto L14;
        if (r2 == 2) goto L14;
        if (r2 == 3) goto L14;
        if (r2 == 4) goto L14;
        return false;
    L14:
        return true;
    }

    public static boolean isValidType(short r2) {
        if (r2 != 1) goto L5;
    L21:
        return true;
    L5:
        if (r2 == 2) goto L21;
        if (r2 == 3) goto L21;
        if (r2 == 4) goto L21;
        if (r2 == 5) goto L21;
        if (r2 == 7) goto L21;
        if (r2 == 9) goto L21;
        if (r2 == 10) goto L21;
        return false;
    }

    public boolean equals(Object r4) {
        if (r4 != null) goto L6;
        return false;
    L6:
        if ((r4 instanceof ExifTag) == false) goto L46;
        ExifTag r42 = (ExifTag) r4;
        if (r42.mTagId != this.mTagId) goto L46;
        if (r42.mComponentCountActual != this.mComponentCountActual) goto L46;
        if (r42.mDataType != this.mDataType) goto L46;
        Object r1 = this.mValue;
        if (r1 == null) goto L43;
        Object r43 = r42.mValue;
        if (r43 != null) goto L20;
        return false;
    L20:
        if ((r1 instanceof long[]) == false) goto L27;
        if ((r43 instanceof long[]) == true) goto L25;
        return false;
    L25:
        return Arrays.equals((long[]) r1, (long[]) r43);
    L27:
        if ((r1 instanceof Rational[]) == false) goto L34;
        if ((r43 instanceof Rational[]) == true) goto L32;
        return false;
    L32:
        return Arrays.equals((Rational[]) r1, (Rational[]) r43);
    L34:
        if ((r1 instanceof byte[]) == false) goto L41;
        if ((r43 instanceof byte[]) == true) goto L39;
        return false;
    L39:
        return Arrays.equals((byte[]) r1, (byte[]) r43);
    L41:
        return r1.equals(r43);
    L43:
        if (r42.mValue != null) goto L46;
        return true;
    L46:
        return false;
    }

    public long forceGetValueAsLong(long r8) {
        long[] r02 = getValueAsLongs();
        if (r02 != null) goto L5;
    L8:
        byte[] r03 = getValueAsBytes();
        if (r03 != null) goto L11;
    L14:
        Rational[] r04 = getValueAsRationals();
        if (r04 != null) goto L17;
        return r8;
    L17:
        if (r04.length >= 1) goto L19;
        return r8;
    L19:
        if (r04[0].getDenominator() != 0) goto L21;
        return r8;
    L21:
        return (long) r04[0].toDouble();
    L11:
        if (r03.length < 1) goto L14;
        return r03[0];
    L5:
        if (r02.length < 1) goto L8;
        return r02[0];
    }

    public String forceGetValueAsString() {
        Object r02 = this.mValue;
        if (r02 != null) goto L6;
        return "";
    L6:
        if ((r02 instanceof byte[]) == false) goto L14;
        if (this.mDataType != 2) goto L12;
        return new String((byte[]) r02, US_ASCII);
    L12:
        return Arrays.toString((byte[]) r02);
    L14:
        if ((r02 instanceof long[]) == false) goto L22;
        long[] r03 = (long[]) r02;
        if (r03.length != 1) goto L20;
        return String.valueOf(r03[0]);
    L20:
        return Arrays.toString(r03);
    L22:
        if ((r02 instanceof Object[]) == false) goto L33;
        Object[] r04 = (Object[]) r02;
        if (r04.length != 1) goto L31;
        Object r05 = r04[0];
        if (r05 != null) goto L29;
        return "";
    L29:
        return r05.toString();
    L31:
        return Arrays.toString(r04);
    L33:
        return r02.toString();
    }

    public void forceSetComponentCount(int r1) {
        this.mComponentCountActual = r1;
    }

    public void getBytes(byte[] r3) {
        getBytes(r3, 0, r3.length);
    }

    public int getComponentCount() {
        return this.mComponentCountActual;
    }

    public int getDataSize() {
        int r02 = getComponentCount();
        return getElementSize(getDataType()) * r02;
    }

    public short getDataType() {
        return this.mDataType;
    }

    public int getIfd() {
        return this.mIfd;
    }

    public int getOffset() {
        return this.mOffset;
    }

    public Rational getRational(int r3) {
        short r02 = this.mDataType;
        if (r02 == 10) goto L10;
        if (r02 == 5) goto L10;
        throw new IllegalArgumentException("Cannot get RATIONAL value from " + convertTypeToString(this.mDataType));
    L10:
        return ((Rational[]) this.mValue)[r3];
    }

    public String getString() {
        if (this.mDataType != 2) goto L7;
        return new String((byte[]) this.mValue, US_ASCII);
    L7:
        throw new IllegalArgumentException("Cannot get ASCII value from " + convertTypeToString(this.mDataType));
    }

    public byte[] getStringByte() {
        return (byte[]) this.mValue;
    }

    public short getTagId() {
        return this.mTagId;
    }

    public Object getValue() {
        return this.mValue;
    }

    public byte getValueAsByte(byte r4) {
        byte[] r02 = getValueAsBytes();
        if (r02 != null) goto L5;
        return r4;
    L5:
        if (r02.length >= 1) goto L8;
        return r4;
    L8:
        return r02[0];
    }

    public byte[] getValueAsBytes() {
        Object r02 = this.mValue;
        if ((r02 instanceof byte[]) == true) goto L5;
        return null;
    L5:
        return (byte[]) r02;
    }

    public int getValueAsInt(int r4) {
        int[] r02 = getValueAsInts();
        if (r02 != null) goto L5;
        return r4;
    L5:
        if (r02.length >= 1) goto L8;
        return r4;
    L8:
        return r02[0];
    }

    public int[] getValueAsInts() {
        Object r02 = this.mValue;
        int[] r1 = null;
        if (r02 != null) goto L6;
        return null;
    L6:
        if ((r02 instanceof long[]) == false) goto L11;
        long[] r03 = (long[]) r02;
        r1 = new int[r03.length];
        int r2 = 0;
    L9:
        if (r2 >= r03.length) goto L11;
        r1[r2] = (int) r03[r2];
        r2 = r2 + 1;
    L11:
        return r1;
    }

    public long getValueAsLong(long r4) {
        long[] r02 = getValueAsLongs();
        if (r02 != null) goto L5;
        return r4;
    L5:
        if (r02.length >= 1) goto L8;
        return r4;
    L8:
        return r02[0];
    }

    public long[] getValueAsLongs() {
        Object r02 = this.mValue;
        if ((r02 instanceof long[]) == true) goto L5;
        return null;
    L5:
        return (long[]) r02;
    }

    public Rational getValueAsRational(Rational r4) {
        Rational[] r02 = getValueAsRationals();
        if (r02 != null) goto L5;
        return r4;
    L5:
        if (r02.length >= 1) goto L8;
        return r4;
    L8:
        return r02[0];
    }

    public Rational[] getValueAsRationals() {
        Object r02 = this.mValue;
        if ((r02 instanceof Rational[]) == true) goto L5;
        return null;
    L5:
        return (Rational[]) r02;
    }

    public String getValueAsString() {
        Object r02 = this.mValue;
        if (r02 != null) goto L6;
        return null;
    L6:
        if ((r02 instanceof String) == false) goto L10;
        return (String) r02;
    L10:
        if ((r02 instanceof byte[]) == true) goto L12;
        return null;
    L12:
        return new String((byte[]) r02, US_ASCII);
    }

    public long getValueAt(int r4) {
        Object r02 = this.mValue;
        if ((r02 instanceof long[]) == false) goto L7;
        return ((long[]) r02)[r4];
    L7:
        if ((r02 instanceof byte[]) == false) goto L11;
        return ((byte[]) r02)[r4];
    L11:
        throw new IllegalArgumentException("Cannot get integer value from " + convertTypeToString(this.mDataType));
    }

    public boolean hasDefinedCount() {
        return this.mHasDefinedDefaultComponentCount;
    }

    public boolean hasValue() {
        if (this.mValue == null) goto L6;
        return true;
    L6:
        return false;
    }

    public void setHasDefinedCount(boolean r1) {
        this.mHasDefinedDefaultComponentCount = r1;
    }

    public void setIfd(int r1) {
        this.mIfd = r1;
    }

    public void setOffset(int r1) {
        this.mOffset = r1;
    }

    public boolean setTimeValue(long r3) {
        SimpleDateFormat r02 = TIME_FORMAT;
        monitor-enter(r02);
        boolean r32 = setValue(r02.format(new Date(r3)));     // Catch: Throwable -> L7
        monitor-exit(r02);     // Catch: Throwable -> L7
        return r32;
    L7:
        th = move-exception;
        throw th;
    }

    public boolean setValue(int[] r6) {
        int r1 = 0;
        if (checkBadComponentCount(r6.length) == false) goto L5;
        return false;
    L5:
        short r02 = this.mDataType;
        if (r02 != 3) goto L8;
    L11:
        if (r02 != 3) goto L16;
        if (checkOverflowForUnsignedShort(r6) == false) goto L16;
        return false;
    L16:
        if (this.mDataType == 4) goto L18;
    L20:
        long[] r03 = new long[r6.length];
    L22:
        if (r1 >= r6.length) goto L24;
        r03[r1] = r6[r1];
        r1 = r1 + 1;
        goto L22
    L24:
        this.mValue = r03;
        this.mComponentCountActual = r6.length;
        return true;
    L18:
        if (checkOverflowForUnsignedLong(r6) == false) goto L20;
        return false;
    L8:
        if (r02 == 9) goto L11;
        if (r02 == 4) goto L11;
        return false;
    }

    public String toString() {
        return String.format("tag id: %04X\n", new Object[]{Short.valueOf(this.mTagId)}) + "ifd id: " + this.mIfd + "\ntype: " + convertTypeToString(this.mDataType) + "\ncount: " + this.mComponentCountActual + "\noffset: " + this.mOffset + "\nvalue: " + forceGetValueAsString() + "\n";
    }

    private boolean checkOverflowForUnsignedLong(int[] r5) {
        int r02 = r5.length;
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L9;
        if (r5[r2] < 0) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return true;
    L9:
        return false;
    }

    public void getBytes(byte[] r3, int r4, int r5) {
        short r02 = this.mDataType;
        if (r02 != 7) goto L5;
    L9:
        Object r03 = this.mValue;
        int r1 = this.mComponentCountActual;
        if (r5 <= r1) goto L12;
        r5 = r1;
    L12:
        System.arraycopy(r03, 0, r3, r4, r5);
        return;
    L5:
        if (r02 == 1) goto L9;
        throw new IllegalArgumentException("Cannot get BYTE value from " + convertTypeToString(this.mDataType));
    }

    public Rational getValueAsRational(long r4) {
        return getValueAsRational(new Rational(r4, 1));
    }

    public String getValueAsString(String r2) {
        String r02 = getValueAsString();
        if (r02 != null) goto L5;
        return r2;
    L5:
        return r02;
    }

    public boolean setValue(int r1) {
        return setValue(new int[]{r1});
    }

    public boolean setValue(long[] r4) {
        if (checkBadComponentCount(r4.length) == false) goto L5;
    L12:
        return false;
    L5:
        if (this.mDataType != 4) goto L12;
        if (checkOverflowForUnsignedLong(r4) == false) goto L10;
        return false;
    L10:
        this.mValue = r4;
        this.mComponentCountActual = r4.length;
        return true;
    }

    public boolean setValue(long r3) {
        return setValue(new long[]{r3});
    }

    public boolean setValue(String r6) {
        short r02 = this.mDataType;
        if (r02 == 2) goto L6;
        if (r02 == 7) goto L6;
        return false;
    L6:
        byte[] r62 = r6.getBytes(US_ASCII);
        if (r62.length <= 0) goto L15;
        if (r62[r62.length - 1] != 0) goto L11;
    L19:
        int r03 = r62.length;
        if (checkBadComponentCount(r03) == false) goto L22;
        return false;
    L22:
        this.mComponentCountActual = r03;
        this.mValue = r62;
        return true;
    L11:
        if (this.mDataType == 7) goto L19;
        r62 = Arrays.copyOf(r62, r62.length + 1);
        goto L19
    L15:
        if (this.mDataType != 2) goto L19;
        if (this.mComponentCountActual != 1) goto L19;
        r62 = new byte[]{0};
        goto L19
    }

    public boolean setValue(Rational[] r5) {
        if (checkBadComponentCount(r5.length) == false) goto L5;
        return false;
    L5:
        short r02 = this.mDataType;
        if (r02 == 5) goto L9;
        if (r02 == 10) goto L9;
        return false;
    L9:
        if (r02 != 5) goto L14;
        if (checkOverflowForUnsignedRational(r5) == false) goto L14;
        return false;
    L14:
        if (this.mDataType == 10) goto L16;
    L18:
        this.mValue = r5;
        this.mComponentCountActual = r5.length;
        return true;
    L16:
        if (checkOverflowForRational(r5) == false) goto L18;
        return false;
    }

    public boolean setValue(Rational r1) {
        return setValue(new Rational[]{r1});
    }

    public boolean setValue(byte[] r5, int r6, int r7) {
        if (checkBadComponentCount(r7) == false) goto L5;
        return false;
    L5:
        short r02 = this.mDataType;
        if (r02 != 1) goto L8;
    L10:
        byte[] r03 = new byte[r7];
        this.mValue = r03;
        System.arraycopy(r5, r6, r03, 0, r7);
        this.mComponentCountActual = r7;
        return true;
    L8:
        if (r02 == 7) goto L10;
        return false;
    }

    public boolean setValue(byte[] r3) {
        return setValue(r3, 0, r3.length);
    }

    public boolean setValue(byte r3) {
        return setValue(new byte[]{r3});
    }

    public boolean setValue(Object r6) {
        int r02 = 0;
        if (r6 != null) goto L6;
        return false;
    L6:
        if ((r6 instanceof Short) == false) goto L10;
        return setValue(((Short) r6).shortValue() & UNSIGNED_SHORT_MAX);
    L10:
        if ((r6 instanceof String) == false) goto L14;
        return setValue((String) r6);
    L14:
        if ((r6 instanceof int[]) == false) goto L18;
        return setValue((int[]) r6);
    L18:
        if ((r6 instanceof long[]) == false) goto L22;
        return setValue((long[]) r6);
    L22:
        if ((r6 instanceof Rational) == false) goto L26;
        return setValue((Rational) r6);
    L26:
        if ((r6 instanceof Rational[]) == false) goto L30;
        return setValue((Rational[]) r6);
    L30:
        if ((r6 instanceof byte[]) == false) goto L34;
        return setValue((byte[]) r6);
    L34:
        if ((r6 instanceof Integer) == false) goto L38;
        return setValue(((Integer) r6).intValue());
    L38:
        if ((r6 instanceof Long) == false) goto L42;
        return setValue(((Long) r6).longValue());
    L42:
        if ((r6 instanceof Byte) == false) goto L46;
        return setValue(((Byte) r6).byteValue());
    L46:
        if ((r6 instanceof Short[]) == false) goto L58;
        Short[] r62 = (Short[]) r6;
        int[] r1 = new int[r62.length];
        int r3 = 0;
    L49:
        if (r3 >= r62.length) goto L56;
        Short r4 = r62[r3];
        if (r4 != null) goto L53;
        int r42 = 0;
    L54:
        r1[r3] = r42;
        r3 = r3 + 1;
        goto L49
    L53:
        r42 = r4.shortValue() & UNSIGNED_SHORT_MAX;
        goto L54
    L56:
        return setValue(r1);
    L58:
        if ((r6 instanceof Integer[]) == false) goto L70;
        Integer[] r63 = (Integer[]) r6;
        int[] r12 = new int[r63.length];
        int r2 = 0;
    L61:
        if (r2 >= r63.length) goto L68;
        Integer r32 = r63[r2];
        if (r32 != null) goto L65;
        int r33 = 0;
    L66:
        r12[r2] = r33;
        r2 = r2 + 1;
        goto L61
    L65:
        r33 = r32.intValue();
        goto L66
    L68:
        return setValue(r12);
    L70:
        if ((r6 instanceof Long[]) == false) goto L82;
        Long[] r64 = (Long[]) r6;
        long[] r13 = new long[r64.length];
    L73:
        if (r02 >= r64.length) goto L80;
        Long r22 = r64[r02];
        if (r22 != null) goto L77;
        long r23 = 0;
    L78:
        r13[r02] = r23;
        r02 = r02 + 1;
        goto L73
    L77:
        r23 = r22.longValue();
        goto L78
    L80:
        return setValue(r13);
    L82:
        if ((r6 instanceof Byte[]) == false) goto L93;
        Byte[] r65 = (Byte[]) r6;
        byte[] r14 = new byte[r65.length];
        int r24 = 0;
    L85:
        if (r24 >= r65.length) goto L92;
        Byte r34 = r65[r24];
        if (r34 != null) goto L89;
        byte r35 = 0;
    L90:
        r14[r24] = r35;
        r24 = r24 + 1;
        goto L85
    L89:
        r35 = r34.byteValue();
        goto L90
    L92:
        return setValue(r14);
    L93:
        return false;
    }
}
