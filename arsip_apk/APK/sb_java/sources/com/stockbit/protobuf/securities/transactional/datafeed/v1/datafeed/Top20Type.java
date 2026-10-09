package com.stockbit.protobuf.securities.transactional.datafeed.v1.datafeed;

import com.google.protobuf.Internal;

/* loaded from: classes10.dex */
public enum Top20Type extends Enum<Top20Type> implements Internal.EnumLite {
    private static final /* synthetic */ Top20Type[] $VALUES = null;
    public static final Top20Type TOP20_TYPE_FREQUENCY_RG = null;
    public static final int TOP20_TYPE_FREQUENCY_RG_VALUE = 2;
    public static final Top20Type TOP20_TYPE_PERCENTAGE_GAINER_RG = null;
    public static final int TOP20_TYPE_PERCENTAGE_GAINER_RG_VALUE = 5;
    public static final Top20Type TOP20_TYPE_PERCENTAGE_LOSER_RG = null;
    public static final int TOP20_TYPE_PERCENTAGE_LOSER_RG_VALUE = 6;
    public static final Top20Type TOP20_TYPE_UNSPECIFIED = null;
    public static final int TOP20_TYPE_UNSPECIFIED_VALUE = 0;
    public static final Top20Type UNRECOGNIZED = null;
    private static final Internal.EnumLiteMap<Top20Type> internalValueMap = null;
    private final int value;

    public static final class Top20TypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = null;

        static {
            INSTANCE = new Top20TypeVerifier();
        }

        private Top20TypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (Top20Type.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    private static /* synthetic */ Top20Type[] $values() {
        return new Top20Type[]{TOP20_TYPE_UNSPECIFIED, TOP20_TYPE_FREQUENCY_RG, TOP20_TYPE_PERCENTAGE_GAINER_RG, TOP20_TYPE_PERCENTAGE_LOSER_RG, UNRECOGNIZED};
    }

    static {
        TOP20_TYPE_UNSPECIFIED = new Top20Type("TOP20_TYPE_UNSPECIFIED", 0, 0);
        TOP20_TYPE_FREQUENCY_RG = new Top20Type("TOP20_TYPE_FREQUENCY_RG", 1, 2);
        TOP20_TYPE_PERCENTAGE_GAINER_RG = new Top20Type("TOP20_TYPE_PERCENTAGE_GAINER_RG", 2, 5);
        TOP20_TYPE_PERCENTAGE_LOSER_RG = new Top20Type("TOP20_TYPE_PERCENTAGE_LOSER_RG", 3, 6);
        UNRECOGNIZED = new Top20Type("UNRECOGNIZED", 4, -1);
        $VALUES = $values();
        internalValueMap = new AnonymousClass1();
    }

    Top20Type(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static Top20Type forNumber(int r1) {
        if (r1 == 0) goto L18;
        if (r1 == 2) goto L16;
        if (r1 == 5) goto L14;
        if (r1 == 6) goto L12;
        return null;
    L12:
        return TOP20_TYPE_PERCENTAGE_LOSER_RG;
    L14:
        return TOP20_TYPE_PERCENTAGE_GAINER_RG;
    L16:
        return TOP20_TYPE_FREQUENCY_RG;
    L18:
        return TOP20_TYPE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<Top20Type> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return Top20TypeVerifier.INSTANCE;
    }

    public static Top20Type valueOf(String r1) {
        return (Top20Type) Enum.valueOf(Top20Type.class, r1);
    }

    public static Top20Type[] values() {
        return (Top20Type[]) $VALUES.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Top20Type valueOf(int r02) {
        return forNumber(r02);
    }
}
