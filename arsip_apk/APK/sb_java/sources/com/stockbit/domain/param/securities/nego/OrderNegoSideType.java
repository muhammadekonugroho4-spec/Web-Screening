package com.stockbit.domain.param.securities.nego;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/stockbit/domain/param/securities/nego/OrderNegoSideType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "BUY", "SELL", "Companion", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum OrderNegoSideType extends Enum<OrderNegoSideType> {
    public static final OrderNegoSideType BUY = null;
    public static final a Companion = null;
    public static final OrderNegoSideType SELL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OrderNegoSideType[] f87536a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f87537b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final OrderNegoSideType a(String r4) {
            p.l(r4, "string");
            Iterator<E> r02 = OrderNegoSideType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (p.g(((OrderNegoSideType) r1).getValue(), r4) == false) goto L4;
        L10:
            return (OrderNegoSideType) r1;
        L8:
            r1 = null;
            goto L10
        }

        public a() {
        }
    }

    static {
        BUY = new OrderNegoSideType("BUY", 0, "ORDER_SIDE_BUY");
        SELL = new OrderNegoSideType("SELL", 1, "ORDER_SIDE_SELL");
        OrderNegoSideType[] r02 = a();
        f87536a = r02;
        f87537b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    OrderNegoSideType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ OrderNegoSideType[] a() {
        return new OrderNegoSideType[]{BUY, SELL};
    }

    public static kotlin.enums.a getEntries() {
        return f87537b;
    }

    public static OrderNegoSideType valueOf(String r1) {
        return (OrderNegoSideType) Enum.valueOf(OrderNegoSideType.class, r1);
    }

    public static OrderNegoSideType[] values() {
        return (OrderNegoSideType[]) f87536a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
