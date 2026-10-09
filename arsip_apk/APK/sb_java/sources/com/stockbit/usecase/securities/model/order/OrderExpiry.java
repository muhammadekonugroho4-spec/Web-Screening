package com.stockbit.usecase.securities.model.order;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stockbit/usecase/securities/model/order/OrderExpiry;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DAY", "GTC", "FAK", "Companion", "usecase-securities"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.e
/* loaded from: classes2.dex */
public enum OrderExpiry extends Enum<OrderExpiry> {
    public static final a Companion = null;
    public static final OrderExpiry DAY = null;
    public static final OrderExpiry FAK = null;
    public static final OrderExpiry GTC = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OrderExpiry[] f161178a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f161179b = null;
    private final int value;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final OrderExpiry a(Integer r5) {
            Iterator<E> r02 = OrderExpiry.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L11;
            Object r1 = r02.next();
            int r2 = ((OrderExpiry) r1).ordinal();
            if (r5 == null) goto L4;
            if (r2 != r5.intValue()) goto L4;
        L12:
            OrderExpiry r12 = (OrderExpiry) r1;
            if (r12 == null) goto L15;
            return r12;
        L15:
            return OrderExpiry.DAY;
        L11:
            r1 = null;
            goto L12
        }

        public a() {
        }
    }

    static {
        DAY = new OrderExpiry("DAY", 0, 0);
        GTC = new OrderExpiry("GTC", 1, 1);
        FAK = new OrderExpiry("FAK", 2, 2);
        OrderExpiry[] r02 = a();
        f161178a = r02;
        f161179b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    OrderExpiry(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static final /* synthetic */ OrderExpiry[] a() {
        return new OrderExpiry[]{DAY, GTC, FAK};
    }

    public static kotlin.enums.a getEntries() {
        return f161179b;
    }

    public static OrderExpiry valueOf(String r1) {
        return (OrderExpiry) Enum.valueOf(OrderExpiry.class, r1);
    }

    public static OrderExpiry[] values() {
        return (OrderExpiry[]) f161178a.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
