package com.github.mikephil.charting.compose.data;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/github/mikephil/charting/compose/data/YAxisPosition;", "", "<init>", "(Ljava/lang/String;I)V", "Left", "Right", "MPChartCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum YAxisPosition extends Enum<YAxisPosition> {
    private static final /* synthetic */ a $ENTRIES = null;
    private static final /* synthetic */ YAxisPosition[] $VALUES = null;
    public static final YAxisPosition Left = null;
    public static final YAxisPosition Right = null;

    private static final /* synthetic */ YAxisPosition[] $values() {
        return new YAxisPosition[]{Left, Right};
    }

    static {
        Left = new YAxisPosition("Left", 0);
        Right = new YAxisPosition("Right", 1);
        YAxisPosition[] r02 = $values();
        $VALUES = r02;
        $ENTRIES = b.a(r02);
    }

    YAxisPosition(String r1, int r2) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static YAxisPosition valueOf(String r1) {
        return (YAxisPosition) Enum.valueOf(YAxisPosition.class, r1);
    }

    public static YAxisPosition[] values() {
        return (YAxisPosition[]) $VALUES.clone();
    }
}
