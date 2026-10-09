package com.stockbit.model.type;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/stockbit/model/type/ScreenerRulesType;", "", "valueInt", "", "valueString", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getValueInt", "()I", "getValueString", "()Ljava/lang/String;", "BASIC_RATIO", "RATIO_VS_RATIO", "ALL_OPERATOR", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum ScreenerRulesType extends Enum<ScreenerRulesType> {
    public static final ScreenerRulesType ALL_OPERATOR = null;
    public static final ScreenerRulesType BASIC_RATIO = null;
    public static final ScreenerRulesType RATIO_VS_RATIO = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ScreenerRulesType[] f122203a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f122204b = null;
    private final int valueInt;
    private final String valueString;

    static {
        BASIC_RATIO = new ScreenerRulesType("BASIC_RATIO", 0, 0, "basic");
        RATIO_VS_RATIO = new ScreenerRulesType("RATIO_VS_RATIO", 1, 1, "compare");
        ALL_OPERATOR = new ScreenerRulesType("ALL_OPERATOR", 2, -1, "all");
        ScreenerRulesType[] r02 = a();
        f122203a = r02;
        f122204b = kotlin.enums.b.a(r02);
    }

    ScreenerRulesType(String r1, int r2, int r3, String r4) {
        this.valueInt = r3;
        this.valueString = r4;
    }

    public static final /* synthetic */ ScreenerRulesType[] a() {
        return new ScreenerRulesType[]{BASIC_RATIO, RATIO_VS_RATIO, ALL_OPERATOR};
    }

    public static kotlin.enums.a getEntries() {
        return f122204b;
    }

    public static ScreenerRulesType valueOf(String r1) {
        return (ScreenerRulesType) Enum.valueOf(ScreenerRulesType.class, r1);
    }

    public static ScreenerRulesType[] values() {
        return (ScreenerRulesType[]) f122203a.clone();
    }

    public final int getValueInt() {
        return this.valueInt;
    }

    public final String getValueString() {
        return this.valueString;
    }
}
