package com.stockbit.usecase.securities.model.type;

import com.clevertap.android.sdk.Constants;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/stockbit/usecase/securities/model/type/OrderTriggerType;", "", Constants.KEY_ICON, "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "getIcon", "()Ljava/lang/String;", "getValue", "()I", "ORDER_TRIGGER_TYPE_GTE", "ORDER_TRIGGER_TYPE_LTE", "UNSPECIFIED", "Companion", "usecase-securities"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum OrderTriggerType extends Enum<OrderTriggerType> {
    public static final a Companion = null;
    public static final OrderTriggerType ORDER_TRIGGER_TYPE_GTE = null;
    public static final OrderTriggerType ORDER_TRIGGER_TYPE_LTE = null;
    public static final OrderTriggerType UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OrderTriggerType[] f161907a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f161908b = null;
    private final String icon;
    private final int value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final OrderTriggerType a(int r4) {
            Iterator<E> r02 = OrderTriggerType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (((OrderTriggerType) r1).getValue() != r4) goto L4;
        L9:
            OrderTriggerType r12 = (OrderTriggerType) r1;
            if (r12 == null) goto L12;
            return r12;
        L12:
            return OrderTriggerType.UNSPECIFIED;
        L8:
            r1 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        ORDER_TRIGGER_TYPE_GTE = new OrderTriggerType("ORDER_TRIGGER_TYPE_GTE", 0, "≥", 1);
        ORDER_TRIGGER_TYPE_LTE = new OrderTriggerType("ORDER_TRIGGER_TYPE_LTE", 1, "≤", 2);
        UNSPECIFIED = new OrderTriggerType("UNSPECIFIED", 2, "", 0);
        OrderTriggerType[] r02 = a();
        f161907a = r02;
        f161908b = b.a(r02);
        Companion = new a(null);
    }

    OrderTriggerType(String r1, int r2, String r3, int r4) {
        this.icon = r3;
        this.value = r4;
    }

    public static final /* synthetic */ OrderTriggerType[] a() {
        return new OrderTriggerType[]{ORDER_TRIGGER_TYPE_GTE, ORDER_TRIGGER_TYPE_LTE, UNSPECIFIED};
    }

    public static kotlin.enums.a getEntries() {
        return f161908b;
    }

    public static OrderTriggerType valueOf(String r1) {
        return (OrderTriggerType) Enum.valueOf(OrderTriggerType.class, r1);
    }

    public static OrderTriggerType[] values() {
        return (OrderTriggerType[]) f161907a.clone();
    }

    public final String getIcon() {
        return this.icon;
    }

    public final int getValue() {
        return this.value;
    }
}
