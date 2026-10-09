package com.stockbit.usecase.company.model.tradebook;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/usecase/company/model/tradebook/CellColorType;", "", "<init>", "(Ljava/lang/String;I)V", "NEUTRAL", "RED", "GREEN", "ORANGE", "usecase-company"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum CellColorType extends Enum<CellColorType> {
    public static final CellColorType GREEN = null;
    public static final CellColorType NEUTRAL = null;
    public static final CellColorType ORANGE = null;
    public static final CellColorType RED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CellColorType[] f156584a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f156585b = null;

    static {
        NEUTRAL = new CellColorType("NEUTRAL", 0);
        RED = new CellColorType("RED", 1);
        GREEN = new CellColorType("GREEN", 2);
        ORANGE = new CellColorType("ORANGE", 3);
        CellColorType[] r02 = a();
        f156584a = r02;
        f156585b = kotlin.enums.b.a(r02);
    }

    CellColorType(String r1, int r2) {
    }

    public static final /* synthetic */ CellColorType[] a() {
        return new CellColorType[]{NEUTRAL, RED, GREEN, ORANGE};
    }

    public static kotlin.enums.a getEntries() {
        return f156585b;
    }

    public static CellColorType valueOf(String r1) {
        return (CellColorType) Enum.valueOf(CellColorType.class, r1);
    }

    public static CellColorType[] values() {
        return (CellColorType[]) f156584a.clone();
    }
}
