package com.stockbit.cryptodetail.ui.detail;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/cryptodetail/ui/detail/SeasonalityRowLabelType;", "", "<init>", "(Ljava/lang/String;I)V", "AVERAGE", "PROBABILITY", "YEAR", "crypto-detail_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum SeasonalityRowLabelType extends Enum<SeasonalityRowLabelType> {
    public static final SeasonalityRowLabelType AVERAGE = null;
    public static final SeasonalityRowLabelType PROBABILITY = null;
    public static final SeasonalityRowLabelType YEAR = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SeasonalityRowLabelType[] f79360a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f79361b = null;

    static {
        AVERAGE = new SeasonalityRowLabelType("AVERAGE", 0);
        PROBABILITY = new SeasonalityRowLabelType("PROBABILITY", 1);
        YEAR = new SeasonalityRowLabelType("YEAR", 2);
        SeasonalityRowLabelType[] r02 = a();
        f79360a = r02;
        f79361b = kotlin.enums.b.a(r02);
    }

    SeasonalityRowLabelType(String r1, int r2) {
    }

    public static final /* synthetic */ SeasonalityRowLabelType[] a() {
        return new SeasonalityRowLabelType[]{AVERAGE, PROBABILITY, YEAR};
    }

    public static kotlin.enums.a getEntries() {
        return f79361b;
    }

    public static SeasonalityRowLabelType valueOf(String r1) {
        return (SeasonalityRowLabelType) Enum.valueOf(SeasonalityRowLabelType.class, r1);
    }

    public static SeasonalityRowLabelType[] values() {
        return (SeasonalityRowLabelType[]) f79360a.clone();
    }
}
