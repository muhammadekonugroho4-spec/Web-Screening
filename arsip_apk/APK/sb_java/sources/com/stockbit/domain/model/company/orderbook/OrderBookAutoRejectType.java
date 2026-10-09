package com.stockbit.domain.model.company.orderbook;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.text.y;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stockbit/domain/model/company/orderbook/OrderBookAutoRejectType;", "", "valueString", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValueString", "()Ljava/lang/String;", "AUTO_REJECT_TYPE_BASE", "AUTO_REJECT_TYPE_POSITIVE", "AUTO_REJECT_TYPE_NEGATIVE", "Companion", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum OrderBookAutoRejectType extends Enum<OrderBookAutoRejectType> {
    public static final OrderBookAutoRejectType AUTO_REJECT_TYPE_BASE = null;
    public static final OrderBookAutoRejectType AUTO_REJECT_TYPE_NEGATIVE = null;
    public static final OrderBookAutoRejectType AUTO_REJECT_TYPE_POSITIVE = null;
    public static final a Companion = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OrderBookAutoRejectType[] f81717a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f81718b = null;
    private final String valueString;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final OrderBookAutoRejectType a(String r5) {
            Iterator<E> r02 = OrderBookAutoRejectType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (y.J(((OrderBookAutoRejectType) r1).getValueString(), r5, true) == false) goto L4;
        L9:
            OrderBookAutoRejectType r12 = (OrderBookAutoRejectType) r1;
            if (r12 == null) goto L12;
            return r12;
        L12:
            return OrderBookAutoRejectType.AUTO_REJECT_TYPE_BASE;
        L8:
            r1 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        AUTO_REJECT_TYPE_BASE = new OrderBookAutoRejectType("AUTO_REJECT_TYPE_BASE", 0, "AUTO_REJECT_TYPE_BASE");
        AUTO_REJECT_TYPE_POSITIVE = new OrderBookAutoRejectType("AUTO_REJECT_TYPE_POSITIVE", 1, "AUTO_REJECT_TYPE_POSITIVE");
        AUTO_REJECT_TYPE_NEGATIVE = new OrderBookAutoRejectType("AUTO_REJECT_TYPE_NEGATIVE", 2, "AUTO_REJECT_TYPE_NEGATIVE");
        OrderBookAutoRejectType[] r02 = a();
        f81717a = r02;
        f81718b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    OrderBookAutoRejectType(String r1, int r2, String r3) {
        this.valueString = r3;
    }

    public static final /* synthetic */ OrderBookAutoRejectType[] a() {
        return new OrderBookAutoRejectType[]{AUTO_REJECT_TYPE_BASE, AUTO_REJECT_TYPE_POSITIVE, AUTO_REJECT_TYPE_NEGATIVE};
    }

    public static kotlin.enums.a getEntries() {
        return f81718b;
    }

    public static OrderBookAutoRejectType valueOf(String r1) {
        return (OrderBookAutoRejectType) Enum.valueOf(OrderBookAutoRejectType.class, r1);
    }

    public static OrderBookAutoRejectType[] values() {
        return (OrderBookAutoRejectType[]) f81717a.clone();
    }

    public final String getValueString() {
        return this.valueString;
    }
}
