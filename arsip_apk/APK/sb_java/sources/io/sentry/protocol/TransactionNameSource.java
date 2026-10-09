package io.sentry.protocol;

import java.util.Locale;

/* loaded from: classes3.dex */
public enum TransactionNameSource extends Enum<TransactionNameSource> {
    private static final /* synthetic */ TransactionNameSource[] $VALUES = null;
    public static final TransactionNameSource COMPONENT = null;
    public static final TransactionNameSource CUSTOM = null;
    public static final TransactionNameSource ROUTE = null;
    public static final TransactionNameSource TASK = null;
    public static final TransactionNameSource URL = null;
    public static final TransactionNameSource VIEW = null;

    private static /* synthetic */ TransactionNameSource[] $values() {
        return new TransactionNameSource[]{CUSTOM, URL, ROUTE, VIEW, COMPONENT, TASK};
    }

    static {
        CUSTOM = new TransactionNameSource("CUSTOM", 0);
        URL = new TransactionNameSource("URL", 1);
        ROUTE = new TransactionNameSource("ROUTE", 2);
        VIEW = new TransactionNameSource("VIEW", 3);
        COMPONENT = new TransactionNameSource("COMPONENT", 4);
        TASK = new TransactionNameSource("TASK", 5);
        $VALUES = $values();
    }

    TransactionNameSource(String r1, int r2) {
    }

    public static TransactionNameSource valueOf(String r1) {
        return (TransactionNameSource) Enum.valueOf(TransactionNameSource.class, r1);
    }

    public static TransactionNameSource[] values() {
        return (TransactionNameSource[]) $VALUES.clone();
    }

    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
