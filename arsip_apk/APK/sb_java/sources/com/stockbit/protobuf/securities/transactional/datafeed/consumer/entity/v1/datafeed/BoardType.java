package com.stockbit.protobuf.securities.transactional.datafeed.consumer.entity.v1.datafeed;

import com.google.protobuf.Internal;

/* loaded from: classes10.dex */
public enum BoardType extends Enum<BoardType> implements Internal.EnumLite {
    private static final /* synthetic */ BoardType[] $VALUES = null;
    public static final BoardType BOARD_TYPE_NG = null;
    public static final int BOARD_TYPE_NG_VALUE = 3;
    public static final BoardType BOARD_TYPE_RG = null;
    public static final int BOARD_TYPE_RG_VALUE = 1;
    public static final BoardType BOARD_TYPE_TN = null;
    public static final int BOARD_TYPE_TN_VALUE = 2;
    public static final BoardType BOARD_TYPE_UNSPECIFIED = null;
    public static final int BOARD_TYPE_UNSPECIFIED_VALUE = 0;
    public static final BoardType UNRECOGNIZED = null;
    private static final Internal.EnumLiteMap<BoardType> internalValueMap = null;
    private final int value;

    public static final class BoardTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = null;

        static {
            INSTANCE = new BoardTypeVerifier();
        }

        private BoardTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (BoardType.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    private static /* synthetic */ BoardType[] $values() {
        return new BoardType[]{BOARD_TYPE_UNSPECIFIED, BOARD_TYPE_RG, BOARD_TYPE_TN, BOARD_TYPE_NG, UNRECOGNIZED};
    }

    static {
        BOARD_TYPE_UNSPECIFIED = new BoardType("BOARD_TYPE_UNSPECIFIED", 0, 0);
        BOARD_TYPE_RG = new BoardType("BOARD_TYPE_RG", 1, 1);
        BOARD_TYPE_TN = new BoardType("BOARD_TYPE_TN", 2, 2);
        BOARD_TYPE_NG = new BoardType("BOARD_TYPE_NG", 3, 3);
        UNRECOGNIZED = new BoardType("UNRECOGNIZED", 4, -1);
        $VALUES = $values();
        internalValueMap = new AnonymousClass1();
    }

    BoardType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static BoardType forNumber(int r1) {
        if (r1 == 0) goto L18;
        if (r1 == 1) goto L16;
        if (r1 == 2) goto L14;
        if (r1 == 3) goto L12;
        return null;
    L12:
        return BOARD_TYPE_NG;
    L14:
        return BOARD_TYPE_TN;
    L16:
        return BOARD_TYPE_RG;
    L18:
        return BOARD_TYPE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<BoardType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return BoardTypeVerifier.INSTANCE;
    }

    public static BoardType valueOf(String r1) {
        return (BoardType) Enum.valueOf(BoardType.class, r1);
    }

    public static BoardType[] values() {
        return (BoardType[]) $VALUES.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static BoardType valueOf(int r02) {
        return forNumber(r02);
    }
}
