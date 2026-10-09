package com.github.mikephil.charting.compose.data;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/github/mikephil/charting/compose/data/LegendOrientation;", "", "<init>", "(Ljava/lang/String;I)V", "Horizontal", "Vertical", "MPChartCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum LegendOrientation extends Enum<LegendOrientation> {
    private static final /* synthetic */ a $ENTRIES = null;
    private static final /* synthetic */ LegendOrientation[] $VALUES = null;
    public static final LegendOrientation Horizontal = null;
    public static final LegendOrientation Vertical = null;

    private static final /* synthetic */ LegendOrientation[] $values() {
        return new LegendOrientation[]{Horizontal, Vertical};
    }

    static {
        Horizontal = new LegendOrientation("Horizontal", 0);
        Vertical = new LegendOrientation("Vertical", 1);
        LegendOrientation[] r02 = $values();
        $VALUES = r02;
        $ENTRIES = b.a(r02);
    }

    LegendOrientation(String r1, int r2) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static LegendOrientation valueOf(String r1) {
        return (LegendOrientation) Enum.valueOf(LegendOrientation.class, r1);
    }

    public static LegendOrientation[] values() {
        return (LegendOrientation[]) $VALUES.clone();
    }
}
