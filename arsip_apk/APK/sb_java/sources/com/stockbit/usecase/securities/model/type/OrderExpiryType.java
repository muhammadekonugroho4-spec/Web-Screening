package com.stockbit.usecase.securities.model.type;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lcom/stockbit/usecase/securities/model/type/OrderExpiryType;", "", "value", "", "nameType", "", "stringName", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", "getValue", "()I", "getNameType", "()Ljava/lang/String;", "getStringName", "ORDER_EXPIRY_TYPE_GFD", "ORDER_EXPIRY_TYPE_GTC", "ORDER_EXPIRY_TYPE_FAK", "UNSPECIFIED", "Companion", "usecase-securities"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum OrderExpiryType extends Enum<OrderExpiryType> {
    public static final a Companion = null;
    public static final OrderExpiryType ORDER_EXPIRY_TYPE_FAK = null;
    public static final OrderExpiryType ORDER_EXPIRY_TYPE_GFD = null;
    public static final OrderExpiryType ORDER_EXPIRY_TYPE_GTC = null;
    public static final OrderExpiryType UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OrderExpiryType[] f161899a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f161900b = null;
    private final String nameType;
    private final String stringName;
    private final int value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final OrderExpiryType a(int r4) {
            Iterator<E> r02 = OrderExpiryType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (((OrderExpiryType) r1).getValue() != r4) goto L4;
        L9:
            OrderExpiryType r12 = (OrderExpiryType) r1;
            if (r12 == null) goto L12;
            return r12;
        L12:
            return OrderExpiryType.ORDER_EXPIRY_TYPE_GFD;
        L8:
            r1 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        ORDER_EXPIRY_TYPE_GFD = new OrderExpiryType("ORDER_EXPIRY_TYPE_GFD", 0, 0, "Good For Day", "Good For Day");
        ORDER_EXPIRY_TYPE_GTC = new OrderExpiryType("ORDER_EXPIRY_TYPE_GTC", 1, 1, "Good Till Cancel", "Good Till Cancelled");
        ORDER_EXPIRY_TYPE_FAK = new OrderExpiryType("ORDER_EXPIRY_TYPE_FAK", 2, 2, "Fill and Kill", "Fill and Kill (FAK)");
        UNSPECIFIED = new OrderExpiryType("UNSPECIFIED", 3, -1, "UNSPECIFIED", "UNSPECIFIED");
        OrderExpiryType[] r02 = a();
        f161899a = r02;
        f161900b = b.a(r02);
        Companion = new a(null);
    }

    OrderExpiryType(String r1, int r2, int r3, String r4, String r5) {
        this.value = r3;
        this.nameType = r4;
        this.stringName = r5;
    }

    public static final /* synthetic */ OrderExpiryType[] a() {
        return new OrderExpiryType[]{ORDER_EXPIRY_TYPE_GFD, ORDER_EXPIRY_TYPE_GTC, ORDER_EXPIRY_TYPE_FAK, UNSPECIFIED};
    }

    public static kotlin.enums.a getEntries() {
        return f161900b;
    }

    public static OrderExpiryType valueOf(String r1) {
        return (OrderExpiryType) Enum.valueOf(OrderExpiryType.class, r1);
    }

    public static OrderExpiryType[] values() {
        return (OrderExpiryType[]) f161899a.clone();
    }

    public final String getNameType() {
        return this.nameType;
    }

    public final String getStringName() {
        return this.stringName;
    }

    public final int getValue() {
        return this.value;
    }
}
