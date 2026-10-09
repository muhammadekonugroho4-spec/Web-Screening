package com.stockbit.feature.transferasset.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/feature/transferasset/model/TransferCashErrorType;", "", "<init>", "(Ljava/lang/String;I)V", "SUB_ACCOUNT", "BALANCE", "transferasset_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum TransferCashErrorType extends Enum<TransferCashErrorType> {
    public static final TransferCashErrorType BALANCE = null;
    public static final TransferCashErrorType SUB_ACCOUNT = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TransferCashErrorType[] f116868a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f116869b = null;

    static {
        SUB_ACCOUNT = new TransferCashErrorType("SUB_ACCOUNT", 0);
        BALANCE = new TransferCashErrorType("BALANCE", 1);
        TransferCashErrorType[] r02 = a();
        f116868a = r02;
        f116869b = kotlin.enums.b.a(r02);
    }

    TransferCashErrorType(String r1, int r2) {
    }

    public static final /* synthetic */ TransferCashErrorType[] a() {
        return new TransferCashErrorType[]{SUB_ACCOUNT, BALANCE};
    }

    public static kotlin.enums.a getEntries() {
        return f116869b;
    }

    public static TransferCashErrorType valueOf(String r1) {
        return (TransferCashErrorType) Enum.valueOf(TransferCashErrorType.class, r1);
    }

    public static TransferCashErrorType[] values() {
        return (TransferCashErrorType[]) f116868a.clone();
    }
}
