package com.stockbit.feature.transaction.ui.fasttrade.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/stockbit/feature/transaction/ui/fasttrade/model/OhlcMarkerType;", "", "leftLabel", "", "rightLabel", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getLeftLabel", "()Ljava/lang/String;", "getRightLabel", "NONE", "OPEN", "HIGH", "LOW", "HIGH_AND_LOW", "transaction_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum OhlcMarkerType extends Enum<OhlcMarkerType> {
    public static final OhlcMarkerType HIGH = null;
    public static final OhlcMarkerType HIGH_AND_LOW = null;
    public static final OhlcMarkerType LOW = null;
    public static final OhlcMarkerType NONE = null;
    public static final OhlcMarkerType OPEN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OhlcMarkerType[] f114040a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f114041b = null;
    private final String leftLabel;
    private final String rightLabel;

    static {
        NONE = new OhlcMarkerType("NONE", 0, null, null);
        OPEN = new OhlcMarkerType("OPEN", 1, "O", null);
        HIGH = new OhlcMarkerType("HIGH", 2, "H", null);
        LOW = new OhlcMarkerType("LOW", 3, "L", null);
        HIGH_AND_LOW = new OhlcMarkerType("HIGH_AND_LOW", 4, "H", "L");
        OhlcMarkerType[] r02 = a();
        f114040a = r02;
        f114041b = kotlin.enums.b.a(r02);
    }

    OhlcMarkerType(String r1, int r2, String r3, String r4) {
        this.leftLabel = r3;
        this.rightLabel = r4;
    }

    public static final /* synthetic */ OhlcMarkerType[] a() {
        return new OhlcMarkerType[]{NONE, OPEN, HIGH, LOW, HIGH_AND_LOW};
    }

    public static kotlin.enums.a getEntries() {
        return f114041b;
    }

    public static OhlcMarkerType valueOf(String r1) {
        return (OhlcMarkerType) Enum.valueOf(OhlcMarkerType.class, r1);
    }

    public static OhlcMarkerType[] values() {
        return (OhlcMarkerType[]) f114040a.clone();
    }

    public final String getLeftLabel() {
        return this.leftLabel;
    }

    public final String getRightLabel() {
        return this.rightLabel;
    }
}
