package com.google.protobuf;

import com.google.protobuf.Internal;

/* loaded from: classes6.dex */
public enum Syntax extends java.lang.Enum<Syntax> implements Internal.EnumLite {
    private static final /* synthetic */ Syntax[] $VALUES = null;
    public static final Syntax SYNTAX_EDITIONS = null;
    public static final int SYNTAX_EDITIONS_VALUE = 2;
    public static final Syntax SYNTAX_PROTO2 = null;
    public static final int SYNTAX_PROTO2_VALUE = 0;
    public static final Syntax SYNTAX_PROTO3 = null;
    public static final int SYNTAX_PROTO3_VALUE = 1;
    public static final Syntax UNRECOGNIZED = null;
    private static final Internal.EnumLiteMap<Syntax> internalValueMap = null;
    private final int value;

    public static final class SyntaxVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = null;

        static {
            INSTANCE = new SyntaxVerifier();
        }

        private SyntaxVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (Syntax.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        Syntax r02 = new Syntax("SYNTAX_PROTO2", 0, 0);
        SYNTAX_PROTO2 = r02;
        Syntax r1 = new Syntax("SYNTAX_PROTO3", 1, 1);
        SYNTAX_PROTO3 = r1;
        Syntax r2 = new Syntax("SYNTAX_EDITIONS", 2, 2);
        SYNTAX_EDITIONS = r2;
        Syntax r3 = new Syntax("UNRECOGNIZED", 3, -1);
        UNRECOGNIZED = r3;
        $VALUES = new Syntax[]{r02, r1, r2, r3};
        internalValueMap = new AnonymousClass1();
    }

    Syntax(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static Syntax forNumber(int r1) {
        if (r1 == 0) goto L14;
        if (r1 == 1) goto L12;
        if (r1 == 2) goto L10;
        return null;
    L10:
        return SYNTAX_EDITIONS;
    L12:
        return SYNTAX_PROTO3;
    L14:
        return SYNTAX_PROTO2;
    }

    public static Internal.EnumLiteMap<Syntax> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return SyntaxVerifier.INSTANCE;
    }

    public static Syntax valueOf(String r1) {
        return (Syntax) java.lang.Enum.valueOf(Syntax.class, r1);
    }

    public static Syntax[] values() {
        return (Syntax[]) $VALUES.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Syntax valueOf(int r02) {
        return forNumber(r02);
    }
}
