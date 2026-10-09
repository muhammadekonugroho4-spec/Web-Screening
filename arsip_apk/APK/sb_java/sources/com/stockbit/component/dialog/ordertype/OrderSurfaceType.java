package com.stockbit.component.dialog.ordertype;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/stockbit/component/dialog/ordertype/OrderSurfaceType;", "", "isBuySide", "", "showsInfoTooltip", "<init>", "(Ljava/lang/String;IZZ)V", "()Z", "getShowsInfoTooltip", "BUY", "SELL", "FAST_TRADE_BUY", "FAST_TRADE_SELL", "SMART_ORDER", "dialog_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum OrderSurfaceType extends Enum<OrderSurfaceType> {
    public static final OrderSurfaceType BUY = null;
    public static final OrderSurfaceType FAST_TRADE_BUY = null;
    public static final OrderSurfaceType FAST_TRADE_SELL = null;
    public static final OrderSurfaceType SELL = null;
    public static final OrderSurfaceType SMART_ORDER = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OrderSurfaceType[] f70319a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f70320b = null;
    private final boolean isBuySide;
    private final boolean showsInfoTooltip;

    static {
        BUY = new OrderSurfaceType("BUY", 0, true, true);
        SELL = new OrderSurfaceType("SELL", 1, false, true);
        FAST_TRADE_BUY = new OrderSurfaceType("FAST_TRADE_BUY", 2, true, true);
        FAST_TRADE_SELL = new OrderSurfaceType("FAST_TRADE_SELL", 3, false, true);
        SMART_ORDER = new OrderSurfaceType("SMART_ORDER", 4, false, false);
        OrderSurfaceType[] r02 = a();
        f70319a = r02;
        f70320b = kotlin.enums.b.a(r02);
    }

    OrderSurfaceType(String r1, int r2, boolean r3, boolean r4) {
        this.isBuySide = r3;
        this.showsInfoTooltip = r4;
    }

    public static final /* synthetic */ OrderSurfaceType[] a() {
        return new OrderSurfaceType[]{BUY, SELL, FAST_TRADE_BUY, FAST_TRADE_SELL, SMART_ORDER};
    }

    public static kotlin.enums.a getEntries() {
        return f70320b;
    }

    public static OrderSurfaceType valueOf(String r1) {
        return (OrderSurfaceType) Enum.valueOf(OrderSurfaceType.class, r1);
    }

    public static OrderSurfaceType[] values() {
        return (OrderSurfaceType[]) f70319a.clone();
    }

    public final boolean getShowsInfoTooltip() {
        return this.showsInfoTooltip;
    }

    public final boolean isBuySide() {
        return this.isBuySide;
    }
}
