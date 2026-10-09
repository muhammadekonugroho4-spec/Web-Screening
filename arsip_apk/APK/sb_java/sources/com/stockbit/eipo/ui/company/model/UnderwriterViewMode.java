package com.stockbit.eipo.ui.company.model;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/eipo/ui/company/model/UnderwriterViewMode;", "", "<init>", "(Ljava/lang/String;I)V", "Card", "Table", "eipo_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum UnderwriterViewMode extends Enum<UnderwriterViewMode> {
    public static final UnderwriterViewMode Card = null;
    public static final UnderwriterViewMode Table = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ UnderwriterViewMode[] f89530a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f89531b = null;

    static {
        Card = new UnderwriterViewMode("Card", 0);
        Table = new UnderwriterViewMode("Table", 1);
        UnderwriterViewMode[] r02 = a();
        f89530a = r02;
        f89531b = b.a(r02);
    }

    UnderwriterViewMode(String r1, int r2) {
    }

    public static final /* synthetic */ UnderwriterViewMode[] a() {
        return new UnderwriterViewMode[]{Card, Table};
    }

    public static a getEntries() {
        return f89531b;
    }

    public static UnderwriterViewMode valueOf(String r1) {
        return (UnderwriterViewMode) Enum.valueOf(UnderwriterViewMode.class, r1);
    }

    public static UnderwriterViewMode[] values() {
        return (UnderwriterViewMode[]) f89530a.clone();
    }
}
