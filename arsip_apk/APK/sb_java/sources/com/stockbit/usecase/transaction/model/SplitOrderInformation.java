package com.stockbit.usecase.transaction.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/usecase/transaction/model/SplitOrderInformation;", "", "<init>", "(Ljava/lang/String;I)V", "SPLIT_ORDER", "SPLIT_METHOD", "usecase-transaction"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum SplitOrderInformation extends Enum<SplitOrderInformation> {
    public static final SplitOrderInformation SPLIT_METHOD = null;
    public static final SplitOrderInformation SPLIT_ORDER = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SplitOrderInformation[] f163772a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f163773b = null;

    static {
        SPLIT_ORDER = new SplitOrderInformation("SPLIT_ORDER", 0);
        SPLIT_METHOD = new SplitOrderInformation("SPLIT_METHOD", 1);
        SplitOrderInformation[] r02 = a();
        f163772a = r02;
        f163773b = kotlin.enums.b.a(r02);
    }

    SplitOrderInformation(String r1, int r2) {
    }

    public static final /* synthetic */ SplitOrderInformation[] a() {
        return new SplitOrderInformation[]{SPLIT_ORDER, SPLIT_METHOD};
    }

    public static kotlin.enums.a getEntries() {
        return f163773b;
    }

    public static SplitOrderInformation valueOf(String r1) {
        return (SplitOrderInformation) Enum.valueOf(SplitOrderInformation.class, r1);
    }

    public static SplitOrderInformation[] values() {
        return (SplitOrderInformation[]) f163772a.clone();
    }
}
