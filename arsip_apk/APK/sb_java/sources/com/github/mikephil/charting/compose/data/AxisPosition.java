package com.github.mikephil.charting.compose.data;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/github/mikephil/charting/compose/data/AxisPosition;", "", "<init>", "(Ljava/lang/String;I)V", "Top", "Bottom", "MPChartCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum AxisPosition extends Enum<AxisPosition> {
    private static final /* synthetic */ a $ENTRIES = null;
    private static final /* synthetic */ AxisPosition[] $VALUES = null;
    public static final AxisPosition Bottom = null;
    public static final AxisPosition Top = null;

    private static final /* synthetic */ AxisPosition[] $values() {
        return new AxisPosition[]{Top, Bottom};
    }

    static {
        Top = new AxisPosition("Top", 0);
        Bottom = new AxisPosition("Bottom", 1);
        AxisPosition[] r02 = $values();
        $VALUES = r02;
        $ENTRIES = b.a(r02);
    }

    AxisPosition(String r1, int r2) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static AxisPosition valueOf(String r1) {
        return (AxisPosition) Enum.valueOf(AxisPosition.class, r1);
    }

    public static AxisPosition[] values() {
        return (AxisPosition[]) $VALUES.clone();
    }
}
