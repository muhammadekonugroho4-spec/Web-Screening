package com.stockbit.dto.securities.order;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stockbit/dto/securities/order/OrderBuyDTO;", "", "orderId", "", "orderLimitInfo", "Lcom/stockbit/dto/securities/order/OrderBuyDTO$OrderLimitInfoDTO;", "<init>", "(Ljava/lang/String;Lcom/stockbit/dto/securities/order/OrderBuyDTO$OrderLimitInfoDTO;)V", "getOrderId", "()Ljava/lang/String;", "getOrderLimitInfo", "()Lcom/stockbit/dto/securities/order/OrderBuyDTO$OrderLimitInfoDTO;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "OrderLimitInfoDTO", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OrderBuyDTO {

    @SerializedName("order_id")
    private final String orderId;

    @SerializedName("order_limit_info")
    private final OrderLimitInfoDTO orderLimitInfo;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stockbit/dto/securities/order/OrderBuyDTO$OrderLimitInfoDTO;", "", "todayLimit", "", "<init>", "(Ljava/lang/Integer;)V", "getTodayLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", Constants.COPY_TYPE, "(Ljava/lang/Integer;)Lcom/stockbit/dto/securities/order/OrderBuyDTO$OrderLimitInfoDTO;", "equals", "", "other", "hashCode", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OrderLimitInfoDTO {

        @SerializedName("today_count")
        private final Integer todayLimit;

        /* JADX WARN: Multi-variable type inference failed */
        public OrderLimitInfoDTO() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final Integer a() {
            return this.todayLimit;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof OrderLimitInfoDTO) == true) goto L9;
            return false;
        L9:
            if (p.g(this.todayLimit, ((OrderLimitInfoDTO) r4).todayLimit) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            Integer r02 = this.todayLimit;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "OrderLimitInfoDTO(todayLimit=" + this.todayLimit + ")";
        }

        public OrderLimitInfoDTO(Integer r1) {
            this.todayLimit = r1;
        }

        public /* synthetic */ OrderLimitInfoDTO(Integer r1, int r2, i r3) {
            if ((r2 & 1) == 0) goto L5;
            r1 = null;
        L5:
            this(r1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OrderBuyDTO() {
        Object[] r02 = 0 == true ? 1 : 0;
        this(null, r02, 3, 0 == true ? 1 : 0);
    }

    public final String a() {
        return this.orderId;
    }

    public final OrderLimitInfoDTO b() {
        return this.orderLimitInfo;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof OrderBuyDTO) == true) goto L8;
        return false;
    L8:
        OrderBuyDTO r52 = (OrderBuyDTO) r5;
        if (p.g(this.orderId, r52.orderId) == true) goto L12;
        return false;
    L12:
        if (p.g(this.orderLimitInfo, r52.orderLimitInfo) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        String r02 = this.orderId;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        OrderLimitInfoDTO r2 = this.orderLimitInfo;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "OrderBuyDTO(orderId=" + this.orderId + ", orderLimitInfo=" + this.orderLimitInfo + ")";
    }

    public OrderBuyDTO(String r1, OrderLimitInfoDTO r2) {
        this.orderId = r1;
        this.orderLimitInfo = r2;
    }

    public /* synthetic */ OrderBuyDTO(String r2, OrderLimitInfoDTO r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = null;
    L8:
        this(r2, r3);
    }
}
