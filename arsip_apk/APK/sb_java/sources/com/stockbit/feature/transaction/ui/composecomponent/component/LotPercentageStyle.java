package com.stockbit.feature.transaction.ui.composecomponent.component;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/feature/transaction/ui/composecomponent/component/LotPercentageStyle;", "", "<init>", "(Ljava/lang/String;I)V", "Sell", "Buy", "transaction_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum LotPercentageStyle extends Enum<LotPercentageStyle> {
    public static final LotPercentageStyle Buy = null;
    public static final LotPercentageStyle Sell = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ LotPercentageStyle[] f112179a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f112180b = null;

    static {
        Sell = new LotPercentageStyle("Sell", 0);
        Buy = new LotPercentageStyle("Buy", 1);
        LotPercentageStyle[] r02 = a();
        f112179a = r02;
        f112180b = kotlin.enums.b.a(r02);
    }

    LotPercentageStyle(String r1, int r2) {
    }

    public static final /* synthetic */ LotPercentageStyle[] a() {
        return new LotPercentageStyle[]{Sell, Buy};
    }

    public static kotlin.enums.a getEntries() {
        return f112180b;
    }

    public static LotPercentageStyle valueOf(String r1) {
        return (LotPercentageStyle) Enum.valueOf(LotPercentageStyle.class, r1);
    }

    public static LotPercentageStyle[] values() {
        return (LotPercentageStyle[]) f112179a.clone();
    }
}
