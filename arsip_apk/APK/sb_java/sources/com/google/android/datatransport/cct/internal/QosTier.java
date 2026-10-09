package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;

/* loaded from: classes4.dex */
public enum QosTier extends Enum<QosTier> {
    private static final /* synthetic */ QosTier[] $VALUES = null;
    public static final QosTier DEFAULT = null;
    public static final QosTier FAST_IF_RADIO_AWAKE = null;
    public static final QosTier NEVER = null;
    public static final QosTier UNMETERED_ONLY = null;
    public static final QosTier UNMETERED_OR_DAILY = null;
    public static final QosTier UNRECOGNIZED = null;
    private static final SparseArray<QosTier> valueMap = null;
    private final int value;

    static {
        QosTier r02 = new QosTier("DEFAULT", 0, 0);
        DEFAULT = r02;
        QosTier r1 = new QosTier("UNMETERED_ONLY", 1, 1);
        UNMETERED_ONLY = r1;
        QosTier r2 = new QosTier("UNMETERED_OR_DAILY", 2, 2);
        UNMETERED_OR_DAILY = r2;
        QosTier r3 = new QosTier("FAST_IF_RADIO_AWAKE", 3, 3);
        FAST_IF_RADIO_AWAKE = r3;
        QosTier r4 = new QosTier("NEVER", 4, 4);
        NEVER = r4;
        QosTier r5 = new QosTier("UNRECOGNIZED", 5, -1);
        UNRECOGNIZED = r5;
        $VALUES = new QosTier[]{r02, r1, r2, r3, r4, r5};
        SparseArray<QosTier> r11 = new SparseArray();
        valueMap = r11;
        r11.put(0, r02);
        r11.put(1, r1);
        r11.put(2, r2);
        r11.put(3, r3);
        r11.put(4, r4);
        r11.put(-1, r5);
    }

    QosTier(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static QosTier forNumber(int r1) {
        if (r1 == 0) goto L22;
        if (r1 == 1) goto L20;
        if (r1 == 2) goto L18;
        if (r1 == 3) goto L16;
        if (r1 == 4) goto L14;
        return null;
    L14:
        return NEVER;
    L16:
        return FAST_IF_RADIO_AWAKE;
    L18:
        return UNMETERED_OR_DAILY;
    L20:
        return UNMETERED_ONLY;
    L22:
        return DEFAULT;
    }

    public static QosTier valueOf(String r1) {
        return (QosTier) Enum.valueOf(QosTier.class, r1);
    }

    public static QosTier[] values() {
        return (QosTier[]) $VALUES.clone();
    }

    public final int getNumber() {
        return this.value;
    }
}
