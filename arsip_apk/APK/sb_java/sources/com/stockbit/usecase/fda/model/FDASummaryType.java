package com.stockbit.usecase.fda.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/usecase/fda/model/FDASummaryType;", "", "<init>", "(Ljava/lang/String;I)V", "VALUE", "VOLUME", "usecase-fda"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum FDASummaryType extends Enum<FDASummaryType> {
    public static final FDASummaryType VALUE = null;
    public static final FDASummaryType VOLUME = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ FDASummaryType[] f157795a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f157796b = null;

    static {
        VALUE = new FDASummaryType("VALUE", 0);
        VOLUME = new FDASummaryType("VOLUME", 1);
        FDASummaryType[] r02 = a();
        f157795a = r02;
        f157796b = kotlin.enums.b.a(r02);
    }

    FDASummaryType(String r1, int r2) {
    }

    public static final /* synthetic */ FDASummaryType[] a() {
        return new FDASummaryType[]{VALUE, VOLUME};
    }

    public static kotlin.enums.a getEntries() {
        return f157796b;
    }

    public static FDASummaryType valueOf(String r1) {
        return (FDASummaryType) Enum.valueOf(FDASummaryType.class, r1);
    }

    public static FDASummaryType[] values() {
        return (FDASummaryType[]) f157795a.clone();
    }
}
