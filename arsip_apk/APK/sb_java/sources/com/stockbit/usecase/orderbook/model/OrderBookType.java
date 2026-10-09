package com.stockbit.usecase.orderbook.model;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stockbit/usecase/orderbook/model/OrderBookType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", GrsBaseInfo.CountryCodeSource.UNKNOWN, "BID", "OFFER", "Companion", "usecase-orderbook"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum OrderBookType extends Enum<OrderBookType> {
    public static final OrderBookType BID = null;
    public static final a Companion = null;
    public static final OrderBookType OFFER = null;
    public static final OrderBookType UNKNOWN = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OrderBookType[] f158807a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f158808b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final OrderBookType a(String r6) {
            Iterator<E> r02 = OrderBookType.getEntries().iterator();
        L3:
            Object r2 = null;
            if (r02.hasNext() == false) goto L11;
            Object r1 = r02.next();
            String r3 = ((OrderBookType) r1).getValue();
            if (r6 == null) goto L9;
            r2 = r6.toLowerCase(Locale.ROOT);
            p.k(r2, "toLowerCase(...)");
        L9:
            if (p.g(r3, r2) == false) goto L3;
            r2 = r1;
        L11:
            OrderBookType r22 = (OrderBookType) r2;
            if (r22 == null) goto L14;
            return r22;
        L14:
            return OrderBookType.UNKNOWN;
        }

        public a() {
        }
    }

    static {
        UNKNOWN = new OrderBookType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, "-");
        BID = new OrderBookType("BID", 1, "bid");
        OFFER = new OrderBookType("OFFER", 2, "offer");
        OrderBookType[] r02 = a();
        f158807a = r02;
        f158808b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    OrderBookType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ OrderBookType[] a() {
        return new OrderBookType[]{UNKNOWN, BID, OFFER};
    }

    public static kotlin.enums.a getEntries() {
        return f158808b;
    }

    public static OrderBookType valueOf(String r1) {
        return (OrderBookType) Enum.valueOf(OrderBookType.class, r1);
    }

    public static OrderBookType[] values() {
        return (OrderBookType[]) f158807a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
