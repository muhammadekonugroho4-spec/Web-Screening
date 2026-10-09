package com.stockbit.model.type;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/stockbit/model/type/SelectionCompanyType;", "", "string", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getString", "()Ljava/lang/String;", "CATALOG", "FOR_YOU", "POPULAR", "TRENDING", "SUB_SECTOR", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum SelectionCompanyType extends Enum<SelectionCompanyType> {
    public static final SelectionCompanyType CATALOG = null;
    public static final SelectionCompanyType FOR_YOU = null;
    public static final SelectionCompanyType POPULAR = null;
    public static final SelectionCompanyType SUB_SECTOR = null;
    public static final SelectionCompanyType TRENDING = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SelectionCompanyType[] f122214a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f122215b = null;
    private final String string;

    static {
        CATALOG = new SelectionCompanyType("CATALOG", 0, "catalog");
        FOR_YOU = new SelectionCompanyType("FOR_YOU", 1, "for_you");
        POPULAR = new SelectionCompanyType("POPULAR", 2, "popular");
        TRENDING = new SelectionCompanyType("TRENDING", 3, "trending");
        SUB_SECTOR = new SelectionCompanyType("SUB_SECTOR", 4, "sub_sector");
        SelectionCompanyType[] r02 = a();
        f122214a = r02;
        f122215b = kotlin.enums.b.a(r02);
    }

    SelectionCompanyType(String r1, int r2, String r3) {
        this.string = r3;
    }

    public static final /* synthetic */ SelectionCompanyType[] a() {
        return new SelectionCompanyType[]{CATALOG, FOR_YOU, POPULAR, TRENDING, SUB_SECTOR};
    }

    public static kotlin.enums.a getEntries() {
        return f122215b;
    }

    public static SelectionCompanyType valueOf(String r1) {
        return (SelectionCompanyType) Enum.valueOf(SelectionCompanyType.class, r1);
    }

    public static SelectionCompanyType[] values() {
        return (SelectionCompanyType[]) f122214a.clone();
    }

    public final String getString() {
        return this.string;
    }
}
