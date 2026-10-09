package com.stockbit.domain.model.entity.calendar.type;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stockbit/domain/model/entity/calendar/type/CalendarEconomicHeaderType;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "HEADER_TYPE_CONTENT", "HEADER_TYPE_BLANK", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum CalendarEconomicHeaderType extends Enum<CalendarEconomicHeaderType> {
    public static final CalendarEconomicHeaderType HEADER_TYPE_BLANK = null;
    public static final CalendarEconomicHeaderType HEADER_TYPE_CONTENT = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CalendarEconomicHeaderType[] f82641a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f82642b = null;
    private final int value;

    static {
        HEADER_TYPE_CONTENT = new CalendarEconomicHeaderType("HEADER_TYPE_CONTENT", 0, 0);
        HEADER_TYPE_BLANK = new CalendarEconomicHeaderType("HEADER_TYPE_BLANK", 1, 1);
        CalendarEconomicHeaderType[] r02 = a();
        f82641a = r02;
        f82642b = b.a(r02);
    }

    CalendarEconomicHeaderType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static final /* synthetic */ CalendarEconomicHeaderType[] a() {
        return new CalendarEconomicHeaderType[]{HEADER_TYPE_CONTENT, HEADER_TYPE_BLANK};
    }

    public static a getEntries() {
        return f82642b;
    }

    public static CalendarEconomicHeaderType valueOf(String r1) {
        return (CalendarEconomicHeaderType) Enum.valueOf(CalendarEconomicHeaderType.class, r1);
    }

    public static CalendarEconomicHeaderType[] values() {
        return (CalendarEconomicHeaderType[]) f82641a.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
