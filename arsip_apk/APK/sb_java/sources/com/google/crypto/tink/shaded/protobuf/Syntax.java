package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.Internal;

/* loaded from: classes6.dex */
public enum Syntax extends java.lang.Enum<Syntax> implements Internal.EnumLite {
    private static final /* synthetic */ Syntax[] $VALUES = null;
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

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
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
        Syntax r2 = new Syntax("UNRECOGNIZED", 2, -1);
        UNRECOGNIZED = r2;
        $VALUES = new Syntax[]{r02, r1, r2};
        internalValueMap = new AnonymousClass1();
    }

    Syntax(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static Syntax forNumber(int r1) {
        if (r1 == 0) goto L10;
        if (r1 == 1) goto L8;
        return null;
    L8:
        return SYNTAX_PROTO3;
    L10:
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

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
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
