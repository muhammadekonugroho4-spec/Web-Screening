package com.stockbit.domain.model.entity.securities;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stockbit/domain/model/entity/securities/TransactionConfirmationType;", "", "<init>", "(Ljava/lang/String;I)V", "BUY", "SELL", "AMEND_SELL", "AMEND_BUY", "CANCEL_ORDER", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum TransactionConfirmationType extends Enum<TransactionConfirmationType> {
    public static final TransactionConfirmationType AMEND_BUY = null;
    public static final TransactionConfirmationType AMEND_SELL = null;
    public static final TransactionConfirmationType BUY = null;
    public static final TransactionConfirmationType CANCEL_ORDER = null;
    public static final TransactionConfirmationType SELL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TransactionConfirmationType[] f83401a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f83402b = null;

    static {
        BUY = new TransactionConfirmationType("BUY", 0);
        SELL = new TransactionConfirmationType("SELL", 1);
        AMEND_SELL = new TransactionConfirmationType("AMEND_SELL", 2);
        AMEND_BUY = new TransactionConfirmationType("AMEND_BUY", 3);
        CANCEL_ORDER = new TransactionConfirmationType("CANCEL_ORDER", 4);
        TransactionConfirmationType[] r02 = a();
        f83401a = r02;
        f83402b = kotlin.enums.b.a(r02);
    }

    TransactionConfirmationType(String r1, int r2) {
    }

    public static final /* synthetic */ TransactionConfirmationType[] a() {
        return new TransactionConfirmationType[]{BUY, SELL, AMEND_SELL, AMEND_BUY, CANCEL_ORDER};
    }

    public static kotlin.enums.a getEntries() {
        return f83402b;
    }

    public static TransactionConfirmationType valueOf(String r1) {
        return (TransactionConfirmationType) Enum.valueOf(TransactionConfirmationType.class, r1);
    }

    public static TransactionConfirmationType[] values() {
        return (TransactionConfirmationType[]) f83401a.clone();
    }
}
