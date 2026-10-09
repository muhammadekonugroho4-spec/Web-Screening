package androidx.glance.appwidget.proto;

import androidx.glance.appwidget.protobuf.AbstractC3997u;

/* loaded from: classes4.dex */
public enum LayoutProto$DimensionType extends Enum<LayoutProto$DimensionType> implements AbstractC3997u.a {
    public static final LayoutProto$DimensionType EXACT = null;
    public static final int EXACT_VALUE = 1;
    public static final LayoutProto$DimensionType EXPAND = null;
    public static final int EXPAND_VALUE = 4;
    public static final LayoutProto$DimensionType FILL = null;
    public static final int FILL_VALUE = 3;
    public static final LayoutProto$DimensionType UNKNOWN_DIMENSION_TYPE = null;
    public static final int UNKNOWN_DIMENSION_TYPE_VALUE = 0;
    public static final LayoutProto$DimensionType UNRECOGNIZED = null;
    public static final LayoutProto$DimensionType WRAP = null;
    public static final int WRAP_VALUE = 2;

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC3997u.b f24942a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ LayoutProto$DimensionType[] f24943b = null;
    private final int value;

    public static final class b implements AbstractC3997u.c {

        /* renamed from: a, reason: collision with root package name */
        public static final AbstractC3997u.c f24944a = null;

        static {
            f24944a = new b();
        }

        public b() {
        }

        @Override // androidx.glance.appwidget.protobuf.AbstractC3997u.c
        public boolean isInRange(int r1) {
            if (LayoutProto$DimensionType.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        UNKNOWN_DIMENSION_TYPE = new LayoutProto$DimensionType("UNKNOWN_DIMENSION_TYPE", 0, 0);
        EXACT = new LayoutProto$DimensionType("EXACT", 1, 1);
        WRAP = new LayoutProto$DimensionType("WRAP", 2, 2);
        FILL = new LayoutProto$DimensionType("FILL", 3, 3);
        EXPAND = new LayoutProto$DimensionType("EXPAND", 4, 4);
        UNRECOGNIZED = new LayoutProto$DimensionType("UNRECOGNIZED", 5, -1);
        f24943b = a();
        f24942a = new a();
    }

    LayoutProto$DimensionType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ LayoutProto$DimensionType[] a() {
        return new LayoutProto$DimensionType[]{UNKNOWN_DIMENSION_TYPE, EXACT, WRAP, FILL, EXPAND, UNRECOGNIZED};
    }

    public static LayoutProto$DimensionType forNumber(int r1) {
        if (r1 == 0) goto L22;
        if (r1 == 1) goto L20;
        if (r1 == 2) goto L18;
        if (r1 == 3) goto L16;
        if (r1 == 4) goto L14;
        return null;
    L14:
        return EXPAND;
    L16:
        return FILL;
    L18:
        return WRAP;
    L20:
        return EXACT;
    L22:
        return UNKNOWN_DIMENSION_TYPE;
    }

    public static AbstractC3997u.b internalGetValueMap() {
        return f24942a;
    }

    public static AbstractC3997u.c internalGetVerifier() {
        return b.f24944a;
    }

    public static LayoutProto$DimensionType valueOf(String r1) {
        return (LayoutProto$DimensionType) Enum.valueOf(LayoutProto$DimensionType.class, r1);
    }

    public static LayoutProto$DimensionType[] values() {
        return (LayoutProto$DimensionType[]) f24943b.clone();
    }

    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static LayoutProto$DimensionType valueOf(int r02) {
        return forNumber(r02);
    }
}
