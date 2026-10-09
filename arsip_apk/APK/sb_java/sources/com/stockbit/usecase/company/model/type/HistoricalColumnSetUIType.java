package com.stockbit.usecase.company.model.type;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/usecase/company/model/type/HistoricalColumnSetUIType;", "", "<init>", "(Ljava/lang/String;I)V", "COMPANY", "IHSG", "usecase-company"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum HistoricalColumnSetUIType extends Enum<HistoricalColumnSetUIType> {
    public static final HistoricalColumnSetUIType COMPANY = null;
    public static final HistoricalColumnSetUIType IHSG = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ HistoricalColumnSetUIType[] f156662a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f156663b = null;

    static {
        COMPANY = new HistoricalColumnSetUIType("COMPANY", 0);
        IHSG = new HistoricalColumnSetUIType("IHSG", 1);
        HistoricalColumnSetUIType[] r02 = a();
        f156662a = r02;
        f156663b = b.a(r02);
    }

    HistoricalColumnSetUIType(String r1, int r2) {
    }

    public static final /* synthetic */ HistoricalColumnSetUIType[] a() {
        return new HistoricalColumnSetUIType[]{COMPANY, IHSG};
    }

    public static a getEntries() {
        return f156663b;
    }

    public static HistoricalColumnSetUIType valueOf(String r1) {
        return (HistoricalColumnSetUIType) Enum.valueOf(HistoricalColumnSetUIType.class, r1);
    }

    public static HistoricalColumnSetUIType[] values() {
        return (HistoricalColumnSetUIType[]) f156662a.clone();
    }
}
