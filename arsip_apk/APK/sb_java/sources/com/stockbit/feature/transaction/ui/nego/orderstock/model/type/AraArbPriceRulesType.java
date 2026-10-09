package com.stockbit.feature.transaction.ui.nego.orderstock.model.type;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/feature/transaction/ui/nego/orderstock/model/type/AraArbPriceRulesType;", "", "<init>", "(Ljava/lang/String;I)V", "ABOVE_ARA", "UNDER_ARB", "UNSPECIFIED", "transaction_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum AraArbPriceRulesType extends Enum<AraArbPriceRulesType> {
    public static final AraArbPriceRulesType ABOVE_ARA = null;
    public static final AraArbPriceRulesType UNDER_ARB = null;
    public static final AraArbPriceRulesType UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AraArbPriceRulesType[] f115006a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f115007b = null;

    static {
        ABOVE_ARA = new AraArbPriceRulesType("ABOVE_ARA", 0);
        UNDER_ARB = new AraArbPriceRulesType("UNDER_ARB", 1);
        UNSPECIFIED = new AraArbPriceRulesType("UNSPECIFIED", 2);
        AraArbPriceRulesType[] r02 = a();
        f115006a = r02;
        f115007b = b.a(r02);
    }

    AraArbPriceRulesType(String r1, int r2) {
    }

    public static final /* synthetic */ AraArbPriceRulesType[] a() {
        return new AraArbPriceRulesType[]{ABOVE_ARA, UNDER_ARB, UNSPECIFIED};
    }

    public static a getEntries() {
        return f115007b;
    }

    public static AraArbPriceRulesType valueOf(String r1) {
        return (AraArbPriceRulesType) Enum.valueOf(AraArbPriceRulesType.class, r1);
    }

    public static AraArbPriceRulesType[] values() {
        return (AraArbPriceRulesType[]) f115006a.clone();
    }
}
