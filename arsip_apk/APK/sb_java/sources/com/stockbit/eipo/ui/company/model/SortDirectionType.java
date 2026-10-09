package com.stockbit.eipo.ui.company.model;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/eipo/ui/company/model/SortDirectionType;", "", "<init>", "(Ljava/lang/String;I)V", "Ascending", "Descending", "eipo_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum SortDirectionType extends Enum<SortDirectionType> {
    public static final SortDirectionType Ascending = null;
    public static final SortDirectionType Descending = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SortDirectionType[] f89526a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f89527b = null;

    static {
        Ascending = new SortDirectionType("Ascending", 0);
        Descending = new SortDirectionType("Descending", 1);
        SortDirectionType[] r02 = a();
        f89526a = r02;
        f89527b = b.a(r02);
    }

    SortDirectionType(String r1, int r2) {
    }

    public static final /* synthetic */ SortDirectionType[] a() {
        return new SortDirectionType[]{Ascending, Descending};
    }

    public static a getEntries() {
        return f89527b;
    }

    public static SortDirectionType valueOf(String r1) {
        return (SortDirectionType) Enum.valueOf(SortDirectionType.class, r1);
    }

    public static SortDirectionType[] values() {
        return (SortDirectionType[]) f89526a.clone();
    }
}
