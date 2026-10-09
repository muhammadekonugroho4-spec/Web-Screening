package com.stockbit.remote.models.request;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/stockbit/remote/models/request/AmendBracketOrderParentRequest;", "", "buyOrderPrice", "", "shares", "stopLossTrigger", "Lcom/stockbit/remote/models/request/AmendBracketOrderParentRequest$StopLossTriggerRequest;", "takeProfitTrigger", "Lcom/stockbit/remote/models/request/AmendBracketOrderParentRequest$TakeProfitTriggerRequest;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/remote/models/request/AmendBracketOrderParentRequest$StopLossTriggerRequest;Lcom/stockbit/remote/models/request/AmendBracketOrderParentRequest$TakeProfitTriggerRequest;)V", "getBuyOrderPrice", "()Ljava/lang/String;", "getShares", "getStopLossTrigger", "()Lcom/stockbit/remote/models/request/AmendBracketOrderParentRequest$StopLossTriggerRequest;", "getTakeProfitTrigger", "()Lcom/stockbit/remote/models/request/AmendBracketOrderParentRequest$TakeProfitTriggerRequest;", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "StopLossTriggerRequest", "TakeProfitTriggerRequest", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AmendBracketOrderParentRequest {

    @SerializedName("buy_order_price")
    private final String buyOrderPrice;

    @SerializedName("shares")
    private final String shares;

    @SerializedName("stop_loss_trigger")
    private final StopLossTriggerRequest stopLossTrigger;

    @SerializedName("take_profit_trigger")
    private final TakeProfitTriggerRequest takeProfitTrigger;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/stockbit/remote/models/request/AmendBracketOrderParentRequest$StopLossTriggerRequest;", "", NotificationCompat.CATEGORY_STATUS, "", "triggerPrice", "orderType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "getTriggerPrice", "getOrderType", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class StopLossTriggerRequest {

        @SerializedName("order_type")
        private final String orderType;

        @SerializedName(NotificationCompat.CATEGORY_STATUS)
        private final String status;

        @SerializedName("trigger_price")
        private final String triggerPrice;

        public StopLossTriggerRequest() {
            String r1 = null;
            String r2 = null;
            String r3 = null;
            this(r1, r2, r3, 7, null);
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof StopLossTriggerRequest) == true) goto L8;
            return false;
        L8:
            StopLossTriggerRequest r52 = (StopLossTriggerRequest) r5;
            if (p.g(this.status, r52.status) == true) goto L12;
            return false;
        L12:
            if (p.g(this.triggerPrice, r52.triggerPrice) == true) goto L15;
            return false;
        L15:
            if (p.g(this.orderType, r52.orderType) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            String r02 = this.status;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.triggerPrice;
            if (r2 != null) goto L9;
            int r22 = 0;
        L10:
            int r05 = (r04 + r22) * 31;
            String r23 = this.orderType;
            if (r23 == null) goto L15;
            r1 = r23.hashCode();
        L15:
            return r05 + r1;
        L9:
            r22 = r2.hashCode();
            goto L10
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "StopLossTriggerRequest(status=" + this.status + ", triggerPrice=" + this.triggerPrice + ", orderType=" + this.orderType + ')';
        }

        public StopLossTriggerRequest(String r1, String r2, String r3) {
            this.status = r1;
            this.triggerPrice = r2;
            this.orderType = r3;
        }

        public /* synthetic */ StopLossTriggerRequest(String r2, String r3, String r4, int r5, i r6) {
            if ((r5 & 1) == 0) goto L6;
            r2 = null;
        L6:
            if ((r5 & 2) == 0) goto L9;
            r3 = null;
        L9:
            if ((r5 & 4) == 0) goto L11;
            r4 = null;
        L11:
            this(r2, r3, r4);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/stockbit/remote/models/request/AmendBracketOrderParentRequest$TakeProfitTriggerRequest;", "", NotificationCompat.CATEGORY_STATUS, "", "triggerPrice", "orderType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "getTriggerPrice", "getOrderType", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TakeProfitTriggerRequest {

        @SerializedName("order_type")
        private final String orderType;

        @SerializedName(NotificationCompat.CATEGORY_STATUS)
        private final String status;

        @SerializedName("trigger_price")
        private final String triggerPrice;

        public TakeProfitTriggerRequest() {
            String r1 = null;
            String r2 = null;
            String r3 = null;
            this(r1, r2, r3, 7, null);
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof TakeProfitTriggerRequest) == true) goto L8;
            return false;
        L8:
            TakeProfitTriggerRequest r52 = (TakeProfitTriggerRequest) r5;
            if (p.g(this.status, r52.status) == true) goto L12;
            return false;
        L12:
            if (p.g(this.triggerPrice, r52.triggerPrice) == true) goto L15;
            return false;
        L15:
            if (p.g(this.orderType, r52.orderType) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            String r02 = this.status;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.triggerPrice;
            if (r2 != null) goto L9;
            int r22 = 0;
        L10:
            int r05 = (r04 + r22) * 31;
            String r23 = this.orderType;
            if (r23 == null) goto L15;
            r1 = r23.hashCode();
        L15:
            return r05 + r1;
        L9:
            r22 = r2.hashCode();
            goto L10
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "TakeProfitTriggerRequest(status=" + this.status + ", triggerPrice=" + this.triggerPrice + ", orderType=" + this.orderType + ')';
        }

        public TakeProfitTriggerRequest(String r1, String r2, String r3) {
            this.status = r1;
            this.triggerPrice = r2;
            this.orderType = r3;
        }

        public /* synthetic */ TakeProfitTriggerRequest(String r2, String r3, String r4, int r5, i r6) {
            if ((r5 & 1) == 0) goto L6;
            r2 = null;
        L6:
            if ((r5 & 2) == 0) goto L9;
            r3 = null;
        L9:
            if ((r5 & 4) == 0) goto L11;
            r4 = null;
        L11:
            this(r2, r3, r4);
        }
    }

    public AmendBracketOrderParentRequest() {
        String r1 = null;
        String r2 = null;
        StopLossTriggerRequest r3 = null;
        TakeProfitTriggerRequest r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AmendBracketOrderParentRequest) == true) goto L8;
        return false;
    L8:
        AmendBracketOrderParentRequest r52 = (AmendBracketOrderParentRequest) r5;
        if (p.g(this.buyOrderPrice, r52.buyOrderPrice) == true) goto L12;
        return false;
    L12:
        if (p.g(this.shares, r52.shares) == true) goto L15;
        return false;
    L15:
        if (p.g(this.stopLossTrigger, r52.stopLossTrigger) == true) goto L18;
        return false;
    L18:
        if (p.g(this.takeProfitTrigger, r52.takeProfitTrigger) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        String r02 = this.buyOrderPrice;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.shares;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        StopLossTriggerRequest r23 = this.stopLossTrigger;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        TakeProfitTriggerRequest r25 = this.takeProfitTrigger;
        if (r25 == null) goto L19;
        r1 = r25.hashCode();
    L19:
        return r06 + r1;
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "AmendBracketOrderParentRequest(buyOrderPrice=" + this.buyOrderPrice + ", shares=" + this.shares + ", stopLossTrigger=" + this.stopLossTrigger + ", takeProfitTrigger=" + this.takeProfitTrigger + ')';
    }

    public AmendBracketOrderParentRequest(String r1, String r2, StopLossTriggerRequest r3, TakeProfitTriggerRequest r4) {
        this.buyOrderPrice = r1;
        this.shares = r2;
        this.stopLossTrigger = r3;
        this.takeProfitTrigger = r4;
    }

    public /* synthetic */ AmendBracketOrderParentRequest(String r2, String r3, StopLossTriggerRequest r4, TakeProfitTriggerRequest r5, int r6, i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = null;
    L14:
        this(r2, r3, r4, r5);
    }
}
