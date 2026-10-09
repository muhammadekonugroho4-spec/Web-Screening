package com.stockbit.feature.cryptotransaction.ui.buy.component.common;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/feature/cryptotransaction/ui/buy/component/common/CryptoBuyNumericField;", "", "<init>", "(Ljava/lang/String;I)V", "PRICE", "QUANTITY", "crypto-transaction_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum CryptoBuyNumericField extends Enum<CryptoBuyNumericField> {
    public static final CryptoBuyNumericField PRICE = null;
    public static final CryptoBuyNumericField QUANTITY = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CryptoBuyNumericField[] f95539a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f95540b = null;

    static {
        PRICE = new CryptoBuyNumericField("PRICE", 0);
        QUANTITY = new CryptoBuyNumericField("QUANTITY", 1);
        CryptoBuyNumericField[] r02 = a();
        f95539a = r02;
        f95540b = kotlin.enums.b.a(r02);
    }

    CryptoBuyNumericField(String r1, int r2) {
    }

    public static final /* synthetic */ CryptoBuyNumericField[] a() {
        return new CryptoBuyNumericField[]{PRICE, QUANTITY};
    }

    public static kotlin.enums.a getEntries() {
        return f95540b;
    }

    public static CryptoBuyNumericField valueOf(String r1) {
        return (CryptoBuyNumericField) Enum.valueOf(CryptoBuyNumericField.class, r1);
    }

    public static CryptoBuyNumericField[] values() {
        return (CryptoBuyNumericField[]) f95539a.clone();
    }
}
