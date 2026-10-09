package com.github.mikephil.charting.compose.data;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/github/mikephil/charting/compose/data/LegendPosition;", "", "<init>", "(Ljava/lang/String;I)V", "Top", "Bottom", "Left", "Right", "MPChartCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum LegendPosition extends Enum<LegendPosition> {
    private static final /* synthetic */ a $ENTRIES = null;
    private static final /* synthetic */ LegendPosition[] $VALUES = null;
    public static final LegendPosition Bottom = null;
    public static final LegendPosition Left = null;
    public static final LegendPosition Right = null;
    public static final LegendPosition Top = null;

    private static final /* synthetic */ LegendPosition[] $values() {
        return new LegendPosition[]{Top, Bottom, Left, Right};
    }

    static {
        Top = new LegendPosition("Top", 0);
        Bottom = new LegendPosition("Bottom", 1);
        Left = new LegendPosition("Left", 2);
        Right = new LegendPosition("Right", 3);
        LegendPosition[] r02 = $values();
        $VALUES = r02;
        $ENTRIES = b.a(r02);
    }

    LegendPosition(String r1, int r2) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static LegendPosition valueOf(String r1) {
        return (LegendPosition) Enum.valueOf(LegendPosition.class, r1);
    }

    public static LegendPosition[] values() {
        return (LegendPosition[]) $VALUES.clone();
    }
}
