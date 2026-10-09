package com.stockbit.usecase.screener.model.type;

import com.stockbit.company.CompanyEntryPoint;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/stockbit/usecase/screener/model/type/SortType;", "", "value", "", "viewOrdinal", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "getValue", "()Ljava/lang/String;", "getViewOrdinal", "()I", "ASC", "DESC", "REMOVE_COLUMN", "NONE", "usecase-screener"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum SortType extends Enum<SortType> {
    public static final SortType ASC = null;
    public static final SortType DESC = null;
    public static final SortType NONE = null;
    public static final SortType REMOVE_COLUMN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SortType[] f159769a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f159770b = null;
    private final String value;
    private final int viewOrdinal;

    static {
        ASC = new SortType("ASC", 0, "asc", 1);
        DESC = new SortType("DESC", 1, CompanyEntryPoint.EXTRA_DESC, 2);
        REMOVE_COLUMN = new SortType("REMOVE_COLUMN", 2, "", 3);
        NONE = new SortType("NONE", 3, "", 0);
        SortType[] r02 = a();
        f159769a = r02;
        f159770b = b.a(r02);
    }

    SortType(String r1, int r2, String r3, int r4) {
        this.value = r3;
        this.viewOrdinal = r4;
    }

    public static final /* synthetic */ SortType[] a() {
        return new SortType[]{ASC, DESC, REMOVE_COLUMN, NONE};
    }

    public static a getEntries() {
        return f159770b;
    }

    public static SortType valueOf(String r1) {
        return (SortType) Enum.valueOf(SortType.class, r1);
    }

    public static SortType[] values() {
        return (SortType[]) f159769a.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public final int getViewOrdinal() {
        return this.viewOrdinal;
    }
}
