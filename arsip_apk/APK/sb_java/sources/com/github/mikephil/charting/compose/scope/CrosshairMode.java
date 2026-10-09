package com.github.mikephil.charting.compose.scope;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/github/mikephil/charting/compose/scope/CrosshairMode;", "", "<init>", "(Ljava/lang/String;I)V", "Both", "VerticalOnly", "HorizontalOnly", "MPChartCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum CrosshairMode extends Enum<CrosshairMode> {
    private static final /* synthetic */ a $ENTRIES = null;
    private static final /* synthetic */ CrosshairMode[] $VALUES = null;
    public static final CrosshairMode Both = null;
    public static final CrosshairMode HorizontalOnly = null;
    public static final CrosshairMode VerticalOnly = null;

    private static final /* synthetic */ CrosshairMode[] $values() {
        return new CrosshairMode[]{Both, VerticalOnly, HorizontalOnly};
    }

    static {
        Both = new CrosshairMode("Both", 0);
        VerticalOnly = new CrosshairMode("VerticalOnly", 1);
        HorizontalOnly = new CrosshairMode("HorizontalOnly", 2);
        CrosshairMode[] r02 = $values();
        $VALUES = r02;
        $ENTRIES = b.a(r02);
    }

    CrosshairMode(String r1, int r2) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static CrosshairMode valueOf(String r1) {
        return (CrosshairMode) Enum.valueOf(CrosshairMode.class, r1);
    }

    public static CrosshairMode[] values() {
        return (CrosshairMode[]) $VALUES.clone();
    }
}
