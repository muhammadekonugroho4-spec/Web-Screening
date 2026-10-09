package com.stockbit.feature.transferasset.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/feature/transferasset/model/TransferStockErrorType;", "", "<init>", "(Ljava/lang/String;I)V", "SUB_ACCOUNT", "TRANSFERABLE_STOCK", "transferasset_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum TransferStockErrorType extends Enum<TransferStockErrorType> {
    public static final TransferStockErrorType SUB_ACCOUNT = null;
    public static final TransferStockErrorType TRANSFERABLE_STOCK = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TransferStockErrorType[] f116870a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f116871b = null;

    static {
        SUB_ACCOUNT = new TransferStockErrorType("SUB_ACCOUNT", 0);
        TRANSFERABLE_STOCK = new TransferStockErrorType("TRANSFERABLE_STOCK", 1);
        TransferStockErrorType[] r02 = a();
        f116870a = r02;
        f116871b = kotlin.enums.b.a(r02);
    }

    TransferStockErrorType(String r1, int r2) {
    }

    public static final /* synthetic */ TransferStockErrorType[] a() {
        return new TransferStockErrorType[]{SUB_ACCOUNT, TRANSFERABLE_STOCK};
    }

    public static kotlin.enums.a getEntries() {
        return f116871b;
    }

    public static TransferStockErrorType valueOf(String r1) {
        return (TransferStockErrorType) Enum.valueOf(TransferStockErrorType.class, r1);
    }

    public static TransferStockErrorType[] values() {
        return (TransferStockErrorType[]) f116870a.clone();
    }
}
