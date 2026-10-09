package com.stockbit.domain.model.type;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stockbit/domain/model/type/RunningTradeSortType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SORT_BY_ASC", "SORT_BY_DESC", "SORT_BY_NONE", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum RunningTradeSortType extends Enum<RunningTradeSortType> {
    public static final RunningTradeSortType SORT_BY_ASC = null;
    public static final RunningTradeSortType SORT_BY_DESC = null;
    public static final RunningTradeSortType SORT_BY_NONE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ RunningTradeSortType[] f86236a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86237b = null;
    private final String value;

    static {
        SORT_BY_ASC = new RunningTradeSortType("SORT_BY_ASC", 0, "ASC");
        SORT_BY_DESC = new RunningTradeSortType("SORT_BY_DESC", 1, "DESC");
        SORT_BY_NONE = new RunningTradeSortType("SORT_BY_NONE", 2, "NONE");
        RunningTradeSortType[] r02 = a();
        f86236a = r02;
        f86237b = kotlin.enums.b.a(r02);
    }

    RunningTradeSortType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ RunningTradeSortType[] a() {
        return new RunningTradeSortType[]{SORT_BY_ASC, SORT_BY_DESC, SORT_BY_NONE};
    }

    public static kotlin.enums.a getEntries() {
        return f86237b;
    }

    public static RunningTradeSortType valueOf(String r1) {
        return (RunningTradeSortType) Enum.valueOf(RunningTradeSortType.class, r1);
    }

    public static RunningTradeSortType[] values() {
        return (RunningTradeSortType[]) f86236a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
