package com.stockbit.canvas.ui.compose.ui.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/canvas/ui/compose/ui/model/CanvasPriceChangeColorType;", "", "<init>", "(Ljava/lang/String;I)V", "UP", "DOWN", "NEUTRAL", "canvas_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum CanvasPriceChangeColorType extends Enum<CanvasPriceChangeColorType> {
    public static final CanvasPriceChangeColorType DOWN = null;
    public static final CanvasPriceChangeColorType NEUTRAL = null;
    public static final CanvasPriceChangeColorType UP = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CanvasPriceChangeColorType[] f51782a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f51783b = null;

    static {
        UP = new CanvasPriceChangeColorType("UP", 0);
        DOWN = new CanvasPriceChangeColorType("DOWN", 1);
        NEUTRAL = new CanvasPriceChangeColorType("NEUTRAL", 2);
        CanvasPriceChangeColorType[] r02 = a();
        f51782a = r02;
        f51783b = kotlin.enums.b.a(r02);
    }

    CanvasPriceChangeColorType(String r1, int r2) {
    }

    public static final /* synthetic */ CanvasPriceChangeColorType[] a() {
        return new CanvasPriceChangeColorType[]{UP, DOWN, NEUTRAL};
    }

    public static kotlin.enums.a getEntries() {
        return f51783b;
    }

    public static CanvasPriceChangeColorType valueOf(String r1) {
        return (CanvasPriceChangeColorType) Enum.valueOf(CanvasPriceChangeColorType.class, r1);
    }

    public static CanvasPriceChangeColorType[] values() {
        return (CanvasPriceChangeColorType[]) f51782a.clone();
    }
}
