package com.google.zxing.client.result;

/* loaded from: classes6.dex */
public enum ParsedResultType extends Enum<ParsedResultType> {
    private static final /* synthetic */ ParsedResultType[] $VALUES = null;
    public static final ParsedResultType ADDRESSBOOK = null;
    public static final ParsedResultType CALENDAR = null;
    public static final ParsedResultType EMAIL_ADDRESS = null;
    public static final ParsedResultType GEO = null;
    public static final ParsedResultType ISBN = null;
    public static final ParsedResultType PRODUCT = null;
    public static final ParsedResultType SMS = null;
    public static final ParsedResultType TEL = null;
    public static final ParsedResultType TEXT = null;
    public static final ParsedResultType URI = null;
    public static final ParsedResultType VIN = null;
    public static final ParsedResultType WIFI = null;

    static {
        ParsedResultType r02 = new ParsedResultType("ADDRESSBOOK", 0);
        ADDRESSBOOK = r02;
        ParsedResultType r1 = new ParsedResultType("EMAIL_ADDRESS", 1);
        EMAIL_ADDRESS = r1;
        ParsedResultType r2 = new ParsedResultType("PRODUCT", 2);
        PRODUCT = r2;
        ParsedResultType r3 = new ParsedResultType("URI", 3);
        URI = r3;
        ParsedResultType r4 = new ParsedResultType("TEXT", 4);
        TEXT = r4;
        ParsedResultType r5 = new ParsedResultType("GEO", 5);
        GEO = r5;
        ParsedResultType r6 = new ParsedResultType("TEL", 6);
        TEL = r6;
        ParsedResultType r7 = new ParsedResultType("SMS", 7);
        SMS = r7;
        ParsedResultType r8 = new ParsedResultType("CALENDAR", 8);
        CALENDAR = r8;
        ParsedResultType r9 = new ParsedResultType("WIFI", 9);
        WIFI = r9;
        ParsedResultType r10 = new ParsedResultType("ISBN", 10);
        ISBN = r10;
        ParsedResultType r11 = new ParsedResultType("VIN", 11);
        VIN = r11;
        $VALUES = new ParsedResultType[]{r02, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11};
    }

    ParsedResultType(String r1, int r2) {
    }

    public static ParsedResultType valueOf(String r1) {
        return (ParsedResultType) Enum.valueOf(ParsedResultType.class, r1);
    }

    public static ParsedResultType[] values() {
        return (ParsedResultType[]) $VALUES.clone();
    }
}
