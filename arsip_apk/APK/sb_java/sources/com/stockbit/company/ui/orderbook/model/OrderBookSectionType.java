package com.stockbit.company.ui.orderbook.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stockbit/company/ui/orderbook/model/OrderBookSectionType;", "", "thresholdPosition", "", "<init>", "(Ljava/lang/String;II)V", "getThresholdPosition", "()I", "HistoricalData", "company_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum OrderBookSectionType extends Enum<OrderBookSectionType> {
    public static final OrderBookSectionType HistoricalData = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OrderBookSectionType[] f67594a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f67595b = null;
    private final int thresholdPosition;

    static {
        HistoricalData = new OrderBookSectionType("HistoricalData", 0, 6000);
        OrderBookSectionType[] r02 = a();
        f67594a = r02;
        f67595b = kotlin.enums.b.a(r02);
    }

    OrderBookSectionType(String r1, int r2, int r3) {
        this.thresholdPosition = r3;
    }

    public static final /* synthetic */ OrderBookSectionType[] a() {
        return new OrderBookSectionType[]{HistoricalData};
    }

    public static kotlin.enums.a getEntries() {
        return f67595b;
    }

    public static OrderBookSectionType valueOf(String r1) {
        return (OrderBookSectionType) Enum.valueOf(OrderBookSectionType.class, r1);
    }

    public static OrderBookSectionType[] values() {
        return (OrderBookSectionType[]) f67594a.clone();
    }

    public final int getThresholdPosition() {
        return this.thresholdPosition;
    }
}
