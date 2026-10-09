package com.stockbit.usecase.securities.model.order;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/usecase/securities/model/order/DividendTimelineRowState;", "", "<init>", "(Ljava/lang/String;I)V", "HIDDEN", "CONFIRMED", "ACTIVE_CONFIRMED", "ACTIVE_PENDING", "usecase-securities"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum DividendTimelineRowState extends Enum<DividendTimelineRowState> {
    public static final DividendTimelineRowState ACTIVE_CONFIRMED = null;
    public static final DividendTimelineRowState ACTIVE_PENDING = null;
    public static final DividendTimelineRowState CONFIRMED = null;
    public static final DividendTimelineRowState HIDDEN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ DividendTimelineRowState[] f161009a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f161010b = null;

    static {
        HIDDEN = new DividendTimelineRowState("HIDDEN", 0);
        CONFIRMED = new DividendTimelineRowState("CONFIRMED", 1);
        ACTIVE_CONFIRMED = new DividendTimelineRowState("ACTIVE_CONFIRMED", 2);
        ACTIVE_PENDING = new DividendTimelineRowState("ACTIVE_PENDING", 3);
        DividendTimelineRowState[] r02 = a();
        f161009a = r02;
        f161010b = kotlin.enums.b.a(r02);
    }

    DividendTimelineRowState(String r1, int r2) {
    }

    public static final /* synthetic */ DividendTimelineRowState[] a() {
        return new DividendTimelineRowState[]{HIDDEN, CONFIRMED, ACTIVE_CONFIRMED, ACTIVE_PENDING};
    }

    public static kotlin.enums.a getEntries() {
        return f161010b;
    }

    public static DividendTimelineRowState valueOf(String r1) {
        return (DividendTimelineRowState) Enum.valueOf(DividendTimelineRowState.class, r1);
    }

    public static DividendTimelineRowState[] values() {
        return (DividendTimelineRowState[]) f161009a.clone();
    }
}
