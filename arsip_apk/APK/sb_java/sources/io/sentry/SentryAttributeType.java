package io.sentry;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public enum SentryAttributeType extends Enum<SentryAttributeType> {
    private static final /* synthetic */ SentryAttributeType[] $VALUES = null;
    public static final SentryAttributeType ARRAY = null;
    public static final SentryAttributeType BOOLEAN = null;
    public static final SentryAttributeType DOUBLE = null;
    public static final SentryAttributeType INTEGER = null;
    public static final SentryAttributeType STRING = null;

    private static /* synthetic */ SentryAttributeType[] $values() {
        return new SentryAttributeType[]{STRING, BOOLEAN, INTEGER, DOUBLE, ARRAY};
    }

    static {
        STRING = new SentryAttributeType("STRING", 0);
        BOOLEAN = new SentryAttributeType("BOOLEAN", 1);
        INTEGER = new SentryAttributeType("INTEGER", 2);
        DOUBLE = new SentryAttributeType("DOUBLE", 3);
        ARRAY = new SentryAttributeType("ARRAY", 4);
        $VALUES = $values();
    }

    SentryAttributeType(String r1, int r2) {
    }

    public static SentryAttributeType inferFrom(Object r1) {
        if ((r1 instanceof Boolean) == false) goto L7;
        return BOOLEAN;
    L7:
        if ((r1 instanceof Integer) == true) goto L36;
        if ((r1 instanceof Long) == true) goto L36;
        if ((r1 instanceof Short) == true) goto L36;
        if ((r1 instanceof Byte) == true) goto L36;
        if ((r1 instanceof BigInteger) == true) goto L36;
        if ((r1 instanceof AtomicInteger) == true) goto L36;
        if ((r1 instanceof AtomicLong) == true) goto L36;
        if ((r1 instanceof Number) == false) goto L26;
        return DOUBLE;
    L26:
        if ((r1 instanceof Collection) == true) goto L34;
        if (r1 == null) goto L32;
        if (r1.getClass().isArray() == true) goto L34;
    L32:
        return STRING;
    L34:
        return ARRAY;
    L36:
        return INTEGER;
    }

    public static SentryAttributeType valueOf(String r1) {
        return (SentryAttributeType) Enum.valueOf(SentryAttributeType.class, r1);
    }

    public static SentryAttributeType[] values() {
        return (SentryAttributeType[]) $VALUES.clone();
    }

    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
