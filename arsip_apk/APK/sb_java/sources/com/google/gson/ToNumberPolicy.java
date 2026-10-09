package com.google.gson;

/* loaded from: classes6.dex */
public enum ToNumberPolicy extends Enum<ToNumberPolicy> implements ToNumberStrategy {
    private static final /* synthetic */ ToNumberPolicy[] $VALUES = null;
    public static final ToNumberPolicy BIG_DECIMAL = null;
    public static final ToNumberPolicy DOUBLE = null;
    public static final ToNumberPolicy LAZILY_PARSED_NUMBER = null;
    public static final ToNumberPolicy LONG_OR_DOUBLE = null;

    static {
        final String r1 = "DOUBLE";
        final int r2 = 0;
        ToNumberPolicy r02 = new AnonymousClass1(r1, r2);
        DOUBLE = r02;
        final String r3 = "LAZILY_PARSED_NUMBER";
        final int r4 = 1;
        ToNumberPolicy r12 = new AnonymousClass2(r3, r4);
        LAZILY_PARSED_NUMBER = r12;
        final String r5 = "LONG_OR_DOUBLE";
        final int r6 = 2;
        ToNumberPolicy r32 = new AnonymousClass3(r5, r6);
        LONG_OR_DOUBLE = r32;
        final String r7 = "BIG_DECIMAL";
        final int r8 = 3;
        ToNumberPolicy r52 = new AnonymousClass4(r7, r8);
        BIG_DECIMAL = r52;
        $VALUES = new ToNumberPolicy[]{r02, r12, r32, r52};
    }

    ToNumberPolicy(String r1, int r2) {
    }

    public static ToNumberPolicy valueOf(String r1) {
        return (ToNumberPolicy) Enum.valueOf(ToNumberPolicy.class, r1);
    }

    public static ToNumberPolicy[] values() {
        return (ToNumberPolicy[]) $VALUES.clone();
    }

    /* synthetic */ ToNumberPolicy(String r1, int r2, AnonymousClass1 r3) {
        this(r1, r2);
    }
}
