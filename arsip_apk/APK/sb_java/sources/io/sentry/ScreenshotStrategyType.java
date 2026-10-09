package io.sentry;

/* loaded from: classes3.dex */
public enum ScreenshotStrategyType extends Enum<ScreenshotStrategyType> {
    private static final /* synthetic */ ScreenshotStrategyType[] $VALUES = null;
    public static final ScreenshotStrategyType CANVAS = null;
    public static final ScreenshotStrategyType PIXEL_COPY = null;

    private static /* synthetic */ ScreenshotStrategyType[] $values() {
        return new ScreenshotStrategyType[]{CANVAS, PIXEL_COPY};
    }

    static {
        CANVAS = new ScreenshotStrategyType("CANVAS", 0);
        PIXEL_COPY = new ScreenshotStrategyType("PIXEL_COPY", 1);
        $VALUES = $values();
    }

    ScreenshotStrategyType(String r1, int r2) {
    }

    public static ScreenshotStrategyType valueOf(String r1) {
        return (ScreenshotStrategyType) Enum.valueOf(ScreenshotStrategyType.class, r1);
    }

    public static ScreenshotStrategyType[] values() {
        return (ScreenshotStrategyType[]) $VALUES.clone();
    }
}
