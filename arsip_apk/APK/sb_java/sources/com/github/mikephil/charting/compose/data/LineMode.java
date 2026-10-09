package com.github.mikephil.charting.compose.data;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/github/mikephil/charting/compose/data/LineMode;", "", "<init>", "(Ljava/lang/String;I)V", "Linear", "CubicBezier", "HorizontalBezier", "Stepped", "MPChartCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum LineMode extends Enum<LineMode> {
    private static final /* synthetic */ a $ENTRIES = null;
    private static final /* synthetic */ LineMode[] $VALUES = null;
    public static final LineMode CubicBezier = null;
    public static final LineMode HorizontalBezier = null;
    public static final LineMode Linear = null;
    public static final LineMode Stepped = null;

    private static final /* synthetic */ LineMode[] $values() {
        return new LineMode[]{Linear, CubicBezier, HorizontalBezier, Stepped};
    }

    static {
        Linear = new LineMode("Linear", 0);
        CubicBezier = new LineMode("CubicBezier", 1);
        HorizontalBezier = new LineMode("HorizontalBezier", 2);
        Stepped = new LineMode("Stepped", 3);
        LineMode[] r02 = $values();
        $VALUES = r02;
        $ENTRIES = b.a(r02);
    }

    LineMode(String r1, int r2) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static LineMode valueOf(String r1) {
        return (LineMode) Enum.valueOf(LineMode.class, r1);
    }

    public static LineMode[] values() {
        return (LineMode[]) $VALUES.clone();
    }
}
