package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
public enum BoundType extends Enum<BoundType> {
    private static final /* synthetic */ BoundType[] $VALUES = null;
    public static final BoundType CLOSED = null;
    public static final BoundType OPEN = null;
    final boolean inclusive;

    private static /* synthetic */ BoundType[] $values() {
        return new BoundType[]{OPEN, CLOSED};
    }

    static {
        OPEN = new BoundType("OPEN", 0, false);
        CLOSED = new BoundType("CLOSED", 1, true);
        $VALUES = $values();
    }

    BoundType(String r1, int r2, boolean r3) {
        this.inclusive = r3;
    }

    public static BoundType forBoolean(boolean r02) {
        if (r02 == false) goto L6;
        return CLOSED;
    L6:
        return OPEN;
    }

    public static BoundType valueOf(String r1) {
        return (BoundType) Enum.valueOf(BoundType.class, r1);
    }

    public static BoundType[] values() {
        return (BoundType[]) $VALUES.clone();
    }
}
