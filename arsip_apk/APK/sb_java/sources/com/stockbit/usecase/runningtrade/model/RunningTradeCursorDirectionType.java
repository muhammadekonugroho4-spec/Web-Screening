package com.stockbit.usecase.runningtrade.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/usecase/runningtrade/model/RunningTradeCursorDirectionType;", "", "<init>", "(Ljava/lang/String;I)V", "CURSOR_DIRECTION_UNSPECIFIED", "CURSOR_DIRECTION_NEXT", "CURSOR_DIRECTION_PREVIOUS", "usecase-runningtrade"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum RunningTradeCursorDirectionType extends Enum<RunningTradeCursorDirectionType> {
    public static final RunningTradeCursorDirectionType CURSOR_DIRECTION_NEXT = null;
    public static final RunningTradeCursorDirectionType CURSOR_DIRECTION_PREVIOUS = null;
    public static final RunningTradeCursorDirectionType CURSOR_DIRECTION_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ RunningTradeCursorDirectionType[] f159570a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f159571b = null;

    static {
        CURSOR_DIRECTION_UNSPECIFIED = new RunningTradeCursorDirectionType("CURSOR_DIRECTION_UNSPECIFIED", 0);
        CURSOR_DIRECTION_NEXT = new RunningTradeCursorDirectionType("CURSOR_DIRECTION_NEXT", 1);
        CURSOR_DIRECTION_PREVIOUS = new RunningTradeCursorDirectionType("CURSOR_DIRECTION_PREVIOUS", 2);
        RunningTradeCursorDirectionType[] r02 = a();
        f159570a = r02;
        f159571b = kotlin.enums.b.a(r02);
    }

    RunningTradeCursorDirectionType(String r1, int r2) {
    }

    public static final /* synthetic */ RunningTradeCursorDirectionType[] a() {
        return new RunningTradeCursorDirectionType[]{CURSOR_DIRECTION_UNSPECIFIED, CURSOR_DIRECTION_NEXT, CURSOR_DIRECTION_PREVIOUS};
    }

    public static kotlin.enums.a getEntries() {
        return f159571b;
    }

    public static RunningTradeCursorDirectionType valueOf(String r1) {
        return (RunningTradeCursorDirectionType) Enum.valueOf(RunningTradeCursorDirectionType.class, r1);
    }

    public static RunningTradeCursorDirectionType[] values() {
        return (RunningTradeCursorDirectionType[]) f159570a.clone();
    }
}
