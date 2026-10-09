package com.stockbit.protobuf.securities.transactional.datafeed.consumer.entity.v1.datafeed;

import com.google.protobuf.Internal;

/* loaded from: classes10.dex */
public enum HotlistType extends Enum<HotlistType> implements Internal.EnumLite {
    private static final /* synthetic */ HotlistType[] $VALUES = null;
    public static final HotlistType HOTLIST_TYPE_MOST_ACTIVE = null;
    public static final int HOTLIST_TYPE_MOST_ACTIVE_VALUE = 3;
    public static final HotlistType HOTLIST_TYPE_TOP_GAINER = null;
    public static final int HOTLIST_TYPE_TOP_GAINER_VALUE = 1;
    public static final HotlistType HOTLIST_TYPE_TOP_LOSER = null;
    public static final int HOTLIST_TYPE_TOP_LOSER_VALUE = 2;
    public static final HotlistType HOTLIST_TYPE_UNSPECIFIED = null;
    public static final int HOTLIST_TYPE_UNSPECIFIED_VALUE = 0;
    public static final HotlistType UNRECOGNIZED = null;
    private static final Internal.EnumLiteMap<HotlistType> internalValueMap = null;
    private final int value;

    public static final class HotlistTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = null;

        static {
            INSTANCE = new HotlistTypeVerifier();
        }

        private HotlistTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (HotlistType.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    private static /* synthetic */ HotlistType[] $values() {
        return new HotlistType[]{HOTLIST_TYPE_UNSPECIFIED, HOTLIST_TYPE_TOP_GAINER, HOTLIST_TYPE_TOP_LOSER, HOTLIST_TYPE_MOST_ACTIVE, UNRECOGNIZED};
    }

    static {
        HOTLIST_TYPE_UNSPECIFIED = new HotlistType("HOTLIST_TYPE_UNSPECIFIED", 0, 0);
        HOTLIST_TYPE_TOP_GAINER = new HotlistType("HOTLIST_TYPE_TOP_GAINER", 1, 1);
        HOTLIST_TYPE_TOP_LOSER = new HotlistType("HOTLIST_TYPE_TOP_LOSER", 2, 2);
        HOTLIST_TYPE_MOST_ACTIVE = new HotlistType("HOTLIST_TYPE_MOST_ACTIVE", 3, 3);
        UNRECOGNIZED = new HotlistType("UNRECOGNIZED", 4, -1);
        $VALUES = $values();
        internalValueMap = new AnonymousClass1();
    }

    HotlistType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static HotlistType forNumber(int r1) {
        if (r1 == 0) goto L18;
        if (r1 == 1) goto L16;
        if (r1 == 2) goto L14;
        if (r1 == 3) goto L12;
        return null;
    L12:
        return HOTLIST_TYPE_MOST_ACTIVE;
    L14:
        return HOTLIST_TYPE_TOP_LOSER;
    L16:
        return HOTLIST_TYPE_TOP_GAINER;
    L18:
        return HOTLIST_TYPE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<HotlistType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return HotlistTypeVerifier.INSTANCE;
    }

    public static HotlistType valueOf(String r1) {
        return (HotlistType) Enum.valueOf(HotlistType.class, r1);
    }

    public static HotlistType[] values() {
        return (HotlistType[]) $VALUES.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static HotlistType valueOf(int r02) {
        return forNumber(r02);
    }
}
