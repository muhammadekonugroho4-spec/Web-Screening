package com.stockbit.usecase.securities.model.order;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\bj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\n"}, d2 = {"Lcom/stockbit/usecase/securities/model/order/OrderActionType;", "", "<init>", "(Ljava/lang/String;I)V", "BUY", "SELL", "UNSPECIFIED", "isEmpty", "", "Companion", "usecase-securities"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum OrderActionType extends Enum<OrderActionType> {
    public static final OrderActionType BUY = null;
    public static final a Companion = null;
    public static final OrderActionType SELL = null;
    public static final OrderActionType UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OrderActionType[] f161174a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f161175b = null;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final OrderActionType a(String r6) {
            OrderActionType[] r02 = OrderActionType.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L12;
            OrderActionType r3 = r02[r2];
            if (kotlin.jvm.internal.p.g(r3.name(), r6) == true) goto L13;
            if (r3 != OrderActionType.SELL) goto L11;
            if (kotlin.jvm.internal.p.g(r6, "SEL") == true) goto L13;
        L11:
            r2 = r2 + 1;
        L13:
            if (r3 == null) goto L15;
            return r3;
        L15:
            return OrderActionType.UNSPECIFIED;
        L12:
            r3 = null;
            goto L13
        }

        public a() {
        }
    }

    static {
        BUY = new OrderActionType("BUY", 0);
        SELL = new OrderActionType("SELL", 1);
        UNSPECIFIED = new OrderActionType("UNSPECIFIED", 2);
        OrderActionType[] r02 = a();
        f161174a = r02;
        f161175b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    OrderActionType(String r1, int r2) {
    }

    public static final /* synthetic */ OrderActionType[] a() {
        return new OrderActionType[]{BUY, SELL, UNSPECIFIED};
    }

    public static kotlin.enums.a getEntries() {
        return f161175b;
    }

    public static OrderActionType valueOf(String r1) {
        return (OrderActionType) Enum.valueOf(OrderActionType.class, r1);
    }

    public static OrderActionType[] values() {
        return (OrderActionType[]) f161174a.clone();
    }

    public final boolean isEmpty() {
        if (this != UNSPECIFIED) goto L6;
        return true;
    L6:
        return false;
    }
}
