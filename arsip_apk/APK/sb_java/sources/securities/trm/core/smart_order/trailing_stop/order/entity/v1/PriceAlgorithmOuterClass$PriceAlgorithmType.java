package securities.trm.core.smart_order.trailing_stop.order.entity.v1;

import com.google.protobuf.Internal;

/* loaded from: classes3.dex */
public enum PriceAlgorithmOuterClass$PriceAlgorithmType extends Enum<PriceAlgorithmOuterClass$PriceAlgorithmType> implements Internal.EnumLite {
    public static final PriceAlgorithmOuterClass$PriceAlgorithmType PRICE_ALGORITHM_TYPE_TRAILING_STOP_PERCENTAGE = null;
    public static final int PRICE_ALGORITHM_TYPE_TRAILING_STOP_PERCENTAGE_VALUE = 1;
    public static final PriceAlgorithmOuterClass$PriceAlgorithmType PRICE_ALGORITHM_TYPE_UNSPECIFIED = null;
    public static final int PRICE_ALGORITHM_TYPE_UNSPECIFIED_VALUE = 0;
    public static final PriceAlgorithmOuterClass$PriceAlgorithmType UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f184014a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PriceAlgorithmOuterClass$PriceAlgorithmType[] f184015b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f184016a = null;

        static {
            f184016a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (PriceAlgorithmOuterClass$PriceAlgorithmType.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        PRICE_ALGORITHM_TYPE_UNSPECIFIED = new PriceAlgorithmOuterClass$PriceAlgorithmType("PRICE_ALGORITHM_TYPE_UNSPECIFIED", 0, 0);
        PRICE_ALGORITHM_TYPE_TRAILING_STOP_PERCENTAGE = new PriceAlgorithmOuterClass$PriceAlgorithmType("PRICE_ALGORITHM_TYPE_TRAILING_STOP_PERCENTAGE", 1, 1);
        UNRECOGNIZED = new PriceAlgorithmOuterClass$PriceAlgorithmType("UNRECOGNIZED", 2, -1);
        f184015b = a();
        f184014a = new a();
    }

    PriceAlgorithmOuterClass$PriceAlgorithmType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ PriceAlgorithmOuterClass$PriceAlgorithmType[] a() {
        return new PriceAlgorithmOuterClass$PriceAlgorithmType[]{PRICE_ALGORITHM_TYPE_UNSPECIFIED, PRICE_ALGORITHM_TYPE_TRAILING_STOP_PERCENTAGE, UNRECOGNIZED};
    }

    public static PriceAlgorithmOuterClass$PriceAlgorithmType forNumber(int r1) {
        if (r1 == 0) goto L10;
        if (r1 == 1) goto L8;
        return null;
    L8:
        return PRICE_ALGORITHM_TYPE_TRAILING_STOP_PERCENTAGE;
    L10:
        return PRICE_ALGORITHM_TYPE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<PriceAlgorithmOuterClass$PriceAlgorithmType> internalGetValueMap() {
        return f184014a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f184016a;
    }

    public static PriceAlgorithmOuterClass$PriceAlgorithmType valueOf(String r1) {
        return (PriceAlgorithmOuterClass$PriceAlgorithmType) Enum.valueOf(PriceAlgorithmOuterClass$PriceAlgorithmType.class, r1);
    }

    public static PriceAlgorithmOuterClass$PriceAlgorithmType[] values() {
        return (PriceAlgorithmOuterClass$PriceAlgorithmType[]) f184015b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static PriceAlgorithmOuterClass$PriceAlgorithmType valueOf(int r02) {
        return forNumber(r02);
    }
}
