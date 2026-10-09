package com.stockbit.cryptodetail.ui.detail.model;

import kotlin.Metadata;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stockbit/cryptodetail/ui/detail/model/CryptoChartViewType;", "", "apiValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getApiValue", "()Ljava/lang/String;", "LINE", "CANDLE", "crypto-detail_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum CryptoChartViewType extends Enum<CryptoChartViewType> {
    public static final CryptoChartViewType CANDLE = null;
    public static final CryptoChartViewType LINE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CryptoChartViewType[] f79663a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f79664b = null;
    private final String apiValue;

    static {
        LINE = new CryptoChartViewType("LINE", 0, "PRICE_CHART_TYPE_LINE");
        CANDLE = new CryptoChartViewType("CANDLE", 1, "PRICE_CHART_TYPE_CANDLE");
        CryptoChartViewType[] r02 = a();
        f79663a = r02;
        f79664b = b.a(r02);
    }

    CryptoChartViewType(String r1, int r2, String r3) {
        this.apiValue = r3;
    }

    public static final /* synthetic */ CryptoChartViewType[] a() {
        return new CryptoChartViewType[]{LINE, CANDLE};
    }

    public static kotlin.enums.a getEntries() {
        return f79664b;
    }

    public static CryptoChartViewType valueOf(String r1) {
        return (CryptoChartViewType) Enum.valueOf(CryptoChartViewType.class, r1);
    }

    public static CryptoChartViewType[] values() {
        return (CryptoChartViewType[]) f79663a.clone();
    }

    public final String getApiValue() {
        return this.apiValue;
    }
}
