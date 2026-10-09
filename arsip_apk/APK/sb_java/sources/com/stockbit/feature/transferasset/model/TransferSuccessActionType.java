package com.stockbit.feature.transferasset.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/feature/transferasset/model/TransferSuccessActionType;", "", "<init>", "(Ljava/lang/String;I)V", "BACK", "DONE", "transferasset_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum TransferSuccessActionType extends Enum<TransferSuccessActionType> {
    public static final TransferSuccessActionType BACK = null;
    public static final TransferSuccessActionType DONE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TransferSuccessActionType[] f116872a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f116873b = null;

    static {
        BACK = new TransferSuccessActionType("BACK", 0);
        DONE = new TransferSuccessActionType("DONE", 1);
        TransferSuccessActionType[] r02 = a();
        f116872a = r02;
        f116873b = kotlin.enums.b.a(r02);
    }

    TransferSuccessActionType(String r1, int r2) {
    }

    public static final /* synthetic */ TransferSuccessActionType[] a() {
        return new TransferSuccessActionType[]{BACK, DONE};
    }

    public static kotlin.enums.a getEntries() {
        return f116873b;
    }

    public static TransferSuccessActionType valueOf(String r1) {
        return (TransferSuccessActionType) Enum.valueOf(TransferSuccessActionType.class, r1);
    }

    public static TransferSuccessActionType[] values() {
        return (TransferSuccessActionType[]) f116872a.clone();
    }
}
