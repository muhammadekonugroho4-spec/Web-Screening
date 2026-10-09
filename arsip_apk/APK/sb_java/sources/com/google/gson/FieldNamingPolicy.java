package com.google.gson;

/* loaded from: classes6.dex */
public enum FieldNamingPolicy extends Enum<FieldNamingPolicy> implements FieldNamingStrategy {
    private static final /* synthetic */ FieldNamingPolicy[] $VALUES = null;
    public static final FieldNamingPolicy IDENTITY = null;
    public static final FieldNamingPolicy LOWER_CASE_WITH_DASHES = null;
    public static final FieldNamingPolicy LOWER_CASE_WITH_DOTS = null;
    public static final FieldNamingPolicy LOWER_CASE_WITH_UNDERSCORES = null;
    public static final FieldNamingPolicy UPPER_CAMEL_CASE = null;
    public static final FieldNamingPolicy UPPER_CAMEL_CASE_WITH_SPACES = null;
    public static final FieldNamingPolicy UPPER_CASE_WITH_UNDERSCORES = null;

    static {
        final String r1 = "IDENTITY";
        final int r2 = 0;
        FieldNamingPolicy r02 = new AnonymousClass1(r1, r2);
        IDENTITY = r02;
        final String r3 = "UPPER_CAMEL_CASE";
        final int r4 = 1;
        FieldNamingPolicy r12 = new AnonymousClass2(r3, r4);
        UPPER_CAMEL_CASE = r12;
        final String r5 = "UPPER_CAMEL_CASE_WITH_SPACES";
        final int r6 = 2;
        FieldNamingPolicy r32 = new AnonymousClass3(r5, r6);
        UPPER_CAMEL_CASE_WITH_SPACES = r32;
        final String r7 = "UPPER_CASE_WITH_UNDERSCORES";
        final int r8 = 3;
        FieldNamingPolicy r52 = new AnonymousClass4(r7, r8);
        UPPER_CASE_WITH_UNDERSCORES = r52;
        final String r9 = "LOWER_CASE_WITH_UNDERSCORES";
        final int r10 = 4;
        FieldNamingPolicy r72 = new AnonymousClass5(r9, r10);
        LOWER_CASE_WITH_UNDERSCORES = r72;
        final String r11 = "LOWER_CASE_WITH_DASHES";
        final int r122 = 5;
        FieldNamingPolicy r92 = new AnonymousClass6(r11, r122);
        LOWER_CASE_WITH_DASHES = r92;
        final String r13 = "LOWER_CASE_WITH_DOTS";
        final int r14 = 6;
        FieldNamingPolicy r112 = new AnonymousClass7(r13, r14);
        LOWER_CASE_WITH_DOTS = r112;
        $VALUES = new FieldNamingPolicy[]{r02, r12, r32, r52, r72, r92, r112};
    }

    FieldNamingPolicy(String r1, int r2) {
    }

    public static String separateCamelCase(String r5, char r6) {
        StringBuilder r02 = new StringBuilder();
        int r1 = r5.length();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L11;
        char r3 = r5.charAt(r2);
        if (Character.isUpperCase(r3) == false) goto L9;
        if (r02.length() == 0) goto L9;
        r02.append(r6);
    L9:
        r02.append(r3);
        r2 = r2 + 1;
        goto L3
    L11:
        return r02.toString();
    }

    public static String upperCaseFirstLetter(String r5) {
        int r02 = r5.length();
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L16;
        char r3 = r5.charAt(r2);
        if (Character.isLetter(r3) == true) goto L7;
        r2 = r2 + 1;
        goto L3
    L7:
        if (Character.isUpperCase(r3) == true) goto L16;
        char r03 = Character.toUpperCase(r3);
        if (r2 != 0) goto L14;
        return r03 + r5.substring(1);
    L14:
        return r5.substring(0, r2) + r03 + r5.substring(r2 + 1);
    L16:
        return r5;
    }

    public static FieldNamingPolicy valueOf(String r1) {
        return (FieldNamingPolicy) Enum.valueOf(FieldNamingPolicy.class, r1);
    }

    public static FieldNamingPolicy[] values() {
        return (FieldNamingPolicy[]) $VALUES.clone();
    }

    /* synthetic */ FieldNamingPolicy(String r1, int r2, AnonymousClass1 r3) {
        this(r1, r2);
    }
}
