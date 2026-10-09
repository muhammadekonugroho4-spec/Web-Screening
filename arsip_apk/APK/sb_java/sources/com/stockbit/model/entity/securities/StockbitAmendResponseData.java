package com.stockbit.model.entity.securities;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0010HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/stockbit/model/entity/securities/StockbitAmendResponseData;", "Landroid/os/Parcelable;", "orderId", "", "orderLimitInfo", "Lcom/stockbit/model/entity/securities/StockbitAmendResponseData$OrderLimitInfoDTO;", "<init>", "(Ljava/lang/String;Lcom/stockbit/model/entity/securities/StockbitAmendResponseData$OrderLimitInfoDTO;)V", "getOrderId", "()Ljava/lang/String;", "getOrderLimitInfo", "()Lcom/stockbit/model/entity/securities/StockbitAmendResponseData$OrderLimitInfoDTO;", "component1", "component2", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "OrderLimitInfoDTO", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class StockbitAmendResponseData implements Parcelable {
    public static final Parcelable.Creator<StockbitAmendResponseData> CREATOR = null;

    @SerializedName("order_id")
    private final String orderId;

    @SerializedName("order_limit_info")
    private final OrderLimitInfoDTO orderLimitInfo;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\u0003J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/stockbit/model/entity/securities/StockbitAmendResponseData$OrderLimitInfoDTO;", "Landroid/os/Parcelable;", "todayLimit", "", "<init>", "(Ljava/lang/Integer;)V", "getTodayLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", Constants.COPY_TYPE, "(Ljava/lang/Integer;)Lcom/stockbit/model/entity/securities/StockbitAmendResponseData$OrderLimitInfoDTO;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OrderLimitInfoDTO implements Parcelable {
        public static final Parcelable.Creator<OrderLimitInfoDTO> CREATOR = null;

        @SerializedName("today_count")
        private final Integer todayLimit;

        public static final class a implements Parcelable.Creator {
            public a() {
            }

            public final OrderLimitInfoDTO a(Parcel r3) {
                p.l(r3, "parcel");
                if (r3.readInt() != 0) goto L5;
                Integer r32 = null;
            L7:
                return new OrderLimitInfoDTO(r32);
            L5:
                r32 = Integer.valueOf(r3.readInt());
                goto L7
            }

            public final OrderLimitInfoDTO[] b(int r1) {
                return new OrderLimitInfoDTO[r1];
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object createFromParcel(Parcel r1) {
                return a(r1);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object[] newArray(int r1) {
                return b(r1);
            }
        }

        static {
            CREATOR = new a();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OrderLimitInfoDTO() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final Integer a() {
            return this.todayLimit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
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
            return "OrderLimitInfoDTO(todayLimit=" + this.todayLimit + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel r2, int r3) {
            p.l(r2, "dest");
            Integer r32 = this.todayLimit;
            if (r32 != null) goto L6;
            r2.writeInt(0);
            return;
        L6:
            r2.writeInt(1);
            r2.writeInt(r32.intValue());
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

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final StockbitAmendResponseData a(Parcel r4) {
            p.l(r4, "parcel");
            String r1 = r4.readString();
            if (r4.readInt() != 0) goto L5;
            OrderLimitInfoDTO r42 = null;
        L7:
            return new StockbitAmendResponseData(r1, r42);
        L5:
            r42 = OrderLimitInfoDTO.CREATOR.createFromParcel(r4);
            goto L7
        }

        public final StockbitAmendResponseData[] b(int r1) {
            return new StockbitAmendResponseData[r1];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object createFromParcel(Parcel r1) {
            return a(r1);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int r1) {
            return b(r1);
        }
    }

    static {
        CREATOR = new a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StockbitAmendResponseData() {
        Object[] r02 = 0 == true ? 1 : 0;
        this(null, r02, 3, 0 == true ? 1 : 0);
    }

    public final String a() {
        return this.orderId;
    }

    public final OrderLimitInfoDTO b() {
        return this.orderLimitInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof StockbitAmendResponseData) == true) goto L8;
        return false;
    L8:
        StockbitAmendResponseData r52 = (StockbitAmendResponseData) r5;
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
        return "StockbitAmendResponseData(orderId=" + this.orderId + ", orderLimitInfo=" + this.orderLimitInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        r3.writeString(this.orderId);
        OrderLimitInfoDTO r02 = this.orderLimitInfo;
        if (r02 != null) goto L6;
        r3.writeInt(0);
        return;
    L6:
        r3.writeInt(1);
        r02.writeToParcel(r3, r4);
    }

    public StockbitAmendResponseData(String r1, OrderLimitInfoDTO r2) {
        this.orderId = r1;
        this.orderLimitInfo = r2;
    }

    public /* synthetic */ StockbitAmendResponseData(String r1, OrderLimitInfoDTO r2, int r3, i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = "";
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = null;
    L8:
        this(r1, r2);
    }
}
