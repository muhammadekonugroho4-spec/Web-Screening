package com.stockbit.feature.transaction.ui.nego.orderstock.model.type;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\bj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\t"}, d2 = {"Lcom/stockbit/feature/transaction/ui/nego/orderstock/model/type/OrderNegoConfigRequirementType;", "", "<init>", "(Ljava/lang/String;I)V", "VALID", "INVALID_MAX_AMOUNT", "INVALID_MIN_AMOUNT", "isNotValid", "", "transaction_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum OrderNegoConfigRequirementType extends Enum<OrderNegoConfigRequirementType> {
    public static final OrderNegoConfigRequirementType INVALID_MAX_AMOUNT = null;
    public static final OrderNegoConfigRequirementType INVALID_MIN_AMOUNT = null;
    public static final OrderNegoConfigRequirementType VALID = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OrderNegoConfigRequirementType[] f115008a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f115009b = null;

    static {
        VALID = new OrderNegoConfigRequirementType("VALID", 0);
        INVALID_MAX_AMOUNT = new OrderNegoConfigRequirementType("INVALID_MAX_AMOUNT", 1);
        INVALID_MIN_AMOUNT = new OrderNegoConfigRequirementType("INVALID_MIN_AMOUNT", 2);
        OrderNegoConfigRequirementType[] r02 = a();
        f115008a = r02;
        f115009b = b.a(r02);
    }

    OrderNegoConfigRequirementType(String r1, int r2) {
    }

    public static final /* synthetic */ OrderNegoConfigRequirementType[] a() {
        return new OrderNegoConfigRequirementType[]{VALID, INVALID_MAX_AMOUNT, INVALID_MIN_AMOUNT};
    }

    public static a getEntries() {
        return f115009b;
    }

    public static OrderNegoConfigRequirementType valueOf(String r1) {
        return (OrderNegoConfigRequirementType) Enum.valueOf(OrderNegoConfigRequirementType.class, r1);
    }

    public static OrderNegoConfigRequirementType[] values() {
        return (OrderNegoConfigRequirementType[]) f115008a.clone();
    }

    public final boolean isNotValid() {
        if (this == VALID) goto L6;
        return true;
    L6:
        return false;
    }
}
