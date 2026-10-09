package com.stockbit.domain.type;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stockbit/domain/type/StockScheduleType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "UNSPECIFIED", "SETTLED", "ALL", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum StockScheduleType extends Enum<StockScheduleType> {
    public static final StockScheduleType ALL = null;
    public static final StockScheduleType SETTLED = null;
    public static final StockScheduleType UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ StockScheduleType[] f87660a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f87661b = null;
    private final String value;

    static {
        UNSPECIFIED = new StockScheduleType("UNSPECIFIED", 0, "STOCK_SCHEDULE_UNSPECIFIED");
        SETTLED = new StockScheduleType("SETTLED", 1, "STOCK_SCHEDULE_SETTLED");
        ALL = new StockScheduleType("ALL", 2, "STOCK_SCHEDULE_ALL");
        StockScheduleType[] r02 = a();
        f87660a = r02;
        f87661b = b.a(r02);
    }

    StockScheduleType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ StockScheduleType[] a() {
        return new StockScheduleType[]{UNSPECIFIED, SETTLED, ALL};
    }

    public static a getEntries() {
        return f87661b;
    }

    public static StockScheduleType valueOf(String r1) {
        return (StockScheduleType) Enum.valueOf(StockScheduleType.class, r1);
    }

    public static StockScheduleType[] values() {
        return (StockScheduleType[]) f87660a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
