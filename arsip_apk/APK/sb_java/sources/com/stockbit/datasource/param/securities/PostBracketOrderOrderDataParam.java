package com.stockbit.datasource.param.securities;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002&'BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003JQ\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0014\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010#\u001a\u00020$HÖ\u0081\u0004J\n\u0010%\u001a\u00020\u0005HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006("}, d2 = {"Lcom/stockbit/datasource/param/securities/PostBracketOrderOrderDataParam;", "", "asset", "Lcom/stockbit/datasource/param/securities/PostBracketOrderOrderDataParam$BracketOrderOrderAssetRequest;", "buyOrderPrice", "", "shares", "stopLossTrigger", "Lcom/stockbit/datasource/param/securities/PostBracketOrderOrderDataParam$BracketOrderOrderTypeTriggerRequest;", "takeProfitTrigger", "uiRef", "orderExpiryType", "<init>", "(Lcom/stockbit/datasource/param/securities/PostBracketOrderOrderDataParam$BracketOrderOrderAssetRequest;Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/datasource/param/securities/PostBracketOrderOrderDataParam$BracketOrderOrderTypeTriggerRequest;Lcom/stockbit/datasource/param/securities/PostBracketOrderOrderDataParam$BracketOrderOrderTypeTriggerRequest;Ljava/lang/String;Ljava/lang/String;)V", "getAsset", "()Lcom/stockbit/datasource/param/securities/PostBracketOrderOrderDataParam$BracketOrderOrderAssetRequest;", "getBuyOrderPrice", "()Ljava/lang/String;", "getShares", "getStopLossTrigger", "()Lcom/stockbit/datasource/param/securities/PostBracketOrderOrderDataParam$BracketOrderOrderTypeTriggerRequest;", "getTakeProfitTrigger", "getUiRef", "getOrderExpiryType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "BracketOrderOrderAssetRequest", "BracketOrderOrderTypeTriggerRequest", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PostBracketOrderOrderDataParam {

    @SerializedName("asset")
    private final BracketOrderOrderAssetRequest asset;

    @SerializedName("buy_order_price")
    private final String buyOrderPrice;

    @SerializedName("order_expiry_type")
    private final String orderExpiryType;

    @SerializedName("shares")
    private final String shares;

    @SerializedName("stop_loss_trigger")
    private final BracketOrderOrderTypeTriggerRequest stopLossTrigger;

    @SerializedName("take_profit_trigger")
    private final BracketOrderOrderTypeTriggerRequest takeProfitTrigger;

    @SerializedName("ui_ref")
    private final String uiRef;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/stockbit/datasource/param/securities/PostBracketOrderOrderDataParam$BracketOrderOrderAssetRequest;", "", "code", "", "marketBoard", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getMarketBoard", "getType", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BracketOrderOrderAssetRequest {

        @SerializedName("code")
        private final String code;

        @SerializedName("market_board")
        private final String marketBoard;

        @SerializedName("type")
        private final String type;

        public BracketOrderOrderAssetRequest(String r2, String r3, String r4) {
            p.l(r2, "code");
            p.l(r3, "marketBoard");
            p.l(r4, "type");
            this.code = r2;
            this.marketBoard = r3;
            this.type = r4;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof BracketOrderOrderAssetRequest) == true) goto L8;
            return false;
        L8:
            BracketOrderOrderAssetRequest r52 = (BracketOrderOrderAssetRequest) r5;
            if (p.g(this.code, r52.code) == true) goto L12;
            return false;
        L12:
            if (p.g(this.marketBoard, r52.marketBoard) == true) goto L15;
            return false;
        L15:
            if (p.g(this.type, r52.type) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.code.hashCode() * 31) + this.marketBoard.hashCode()) * 31) + this.type.hashCode();
        }

        public String toString() {
            return "BracketOrderOrderAssetRequest(code=" + this.code + ", marketBoard=" + this.marketBoard + ", type=" + this.type + ")";
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/stockbit/datasource/param/securities/PostBracketOrderOrderDataParam$BracketOrderOrderTypeTriggerRequest;", "", NotificationCompat.CATEGORY_STATUS, "", "triggerPrice", "orderType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "getTriggerPrice", "getOrderType", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BracketOrderOrderTypeTriggerRequest {

        @SerializedName("order_type")
        private final String orderType;

        @SerializedName(NotificationCompat.CATEGORY_STATUS)
        private final String status;

        @SerializedName("trigger_price")
        private final String triggerPrice;

        public BracketOrderOrderTypeTriggerRequest(String r2, String r3, String r4) {
            p.l(r2, NotificationCompat.CATEGORY_STATUS);
            p.l(r4, "orderType");
            this.status = r2;
            this.triggerPrice = r3;
            this.orderType = r4;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof BracketOrderOrderTypeTriggerRequest) == true) goto L8;
            return false;
        L8:
            BracketOrderOrderTypeTriggerRequest r52 = (BracketOrderOrderTypeTriggerRequest) r5;
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
            int r02 = this.status.hashCode() * 31;
            String r1 = this.triggerPrice;
            if (r1 != null) goto L5;
            int r12 = 0;
        L7:
            return ((r02 + r12) * 31) + this.orderType.hashCode();
        L5:
            r12 = r1.hashCode();
            goto L7
        }

        public String toString() {
            return "BracketOrderOrderTypeTriggerRequest(status=" + this.status + ", triggerPrice=" + this.triggerPrice + ", orderType=" + this.orderType + ")";
        }
    }

    public PostBracketOrderOrderDataParam(BracketOrderOrderAssetRequest r2, String r3, String r4, BracketOrderOrderTypeTriggerRequest r5, BracketOrderOrderTypeTriggerRequest r6, String r7, String r8) {
        p.l(r2, "asset");
        p.l(r3, "buyOrderPrice");
        p.l(r4, "shares");
        p.l(r5, "stopLossTrigger");
        p.l(r6, "takeProfitTrigger");
        p.l(r8, "orderExpiryType");
        this.asset = r2;
        this.buyOrderPrice = r3;
        this.shares = r4;
        this.stopLossTrigger = r5;
        this.takeProfitTrigger = r6;
        this.uiRef = r7;
        this.orderExpiryType = r8;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof PostBracketOrderOrderDataParam) == true) goto L8;
        return false;
    L8:
        PostBracketOrderOrderDataParam r52 = (PostBracketOrderOrderDataParam) r5;
        if (p.g(this.asset, r52.asset) == true) goto L12;
        return false;
    L12:
        if (p.g(this.buyOrderPrice, r52.buyOrderPrice) == true) goto L15;
        return false;
    L15:
        if (p.g(this.shares, r52.shares) == true) goto L18;
        return false;
    L18:
        if (p.g(this.stopLossTrigger, r52.stopLossTrigger) == true) goto L21;
        return false;
    L21:
        if (p.g(this.takeProfitTrigger, r52.takeProfitTrigger) == true) goto L24;
        return false;
    L24:
        if (p.g(this.uiRef, r52.uiRef) == true) goto L27;
        return false;
    L27:
        if (p.g(this.orderExpiryType, r52.orderExpiryType) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public int hashCode() {
        int r02 = ((((((((this.asset.hashCode() * 31) + this.buyOrderPrice.hashCode()) * 31) + this.shares.hashCode()) * 31) + this.stopLossTrigger.hashCode()) * 31) + this.takeProfitTrigger.hashCode()) * 31;
        String r1 = this.uiRef;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((r02 + r12) * 31) + this.orderExpiryType.hashCode();
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "PostBracketOrderOrderDataParam(asset=" + this.asset + ", buyOrderPrice=" + this.buyOrderPrice + ", shares=" + this.shares + ", stopLossTrigger=" + this.stopLossTrigger + ", takeProfitTrigger=" + this.takeProfitTrigger + ", uiRef=" + this.uiRef + ", orderExpiryType=" + this.orderExpiryType + ")";
    }
}
