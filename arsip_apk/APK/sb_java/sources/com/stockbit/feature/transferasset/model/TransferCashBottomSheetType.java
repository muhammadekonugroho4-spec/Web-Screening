package com.stockbit.feature.transferasset.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/feature/transferasset/model/TransferCashBottomSheetType;", "", "<init>", "(Ljava/lang/String;I)V", "CONFIRMATION", "SUCCESS", "MARGIN_REACHED_MAX_ALLOWED", "transferasset_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum TransferCashBottomSheetType extends Enum<TransferCashBottomSheetType> {
    public static final TransferCashBottomSheetType CONFIRMATION = null;
    public static final TransferCashBottomSheetType MARGIN_REACHED_MAX_ALLOWED = null;
    public static final TransferCashBottomSheetType SUCCESS = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TransferCashBottomSheetType[] f116866a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f116867b = null;

    static {
        CONFIRMATION = new TransferCashBottomSheetType("CONFIRMATION", 0);
        SUCCESS = new TransferCashBottomSheetType("SUCCESS", 1);
        MARGIN_REACHED_MAX_ALLOWED = new TransferCashBottomSheetType("MARGIN_REACHED_MAX_ALLOWED", 2);
        TransferCashBottomSheetType[] r02 = a();
        f116866a = r02;
        f116867b = kotlin.enums.b.a(r02);
    }

    TransferCashBottomSheetType(String r1, int r2) {
    }

    public static final /* synthetic */ TransferCashBottomSheetType[] a() {
        return new TransferCashBottomSheetType[]{CONFIRMATION, SUCCESS, MARGIN_REACHED_MAX_ALLOWED};
    }

    public static kotlin.enums.a getEntries() {
        return f116867b;
    }

    public static TransferCashBottomSheetType valueOf(String r1) {
        return (TransferCashBottomSheetType) Enum.valueOf(TransferCashBottomSheetType.class, r1);
    }

    public static TransferCashBottomSheetType[] values() {
        return (TransferCashBottomSheetType[]) f116866a.clone();
    }
}
