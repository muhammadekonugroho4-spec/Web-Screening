package com.stockbit.datasource.param.securities.stoporder;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u00010Bu\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u008d\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010-\u001a\u00020.HÖ\u0081\u0004J\n\u0010/\u001a\u00020\u0005HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014¨\u00061"}, d2 = {"Lcom/stockbit/datasource/param/securities/stoporder/PostStopOrderParentDataParam;", "", "asset", "Lcom/stockbit/datasource/param/securities/stoporder/PostStopOrderParentDataParam$PostStopOrderAssetDataParam;", "orderExpiryType", "", "orderPrice", "orderSide", "orderType", "productCode", "shares", "triggerPrice", "triggerType", "uiRef", "portfolioPositionType", "<init>", "(Lcom/stockbit/datasource/param/securities/stoporder/PostStopOrderParentDataParam$PostStopOrderAssetDataParam;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAsset", "()Lcom/stockbit/datasource/param/securities/stoporder/PostStopOrderParentDataParam$PostStopOrderAssetDataParam;", "getOrderExpiryType", "()Ljava/lang/String;", "getOrderPrice", "getOrderSide", "getOrderType", "getProductCode", "getShares", "getTriggerPrice", "getTriggerType", "getUiRef", "getPortfolioPositionType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "PostStopOrderAssetDataParam", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PostStopOrderParentDataParam {

    @SerializedName("asset")
    private final PostStopOrderAssetDataParam asset;

    @SerializedName("order_expiry_type")
    private final String orderExpiryType;

    @SerializedName("order_price")
    private final String orderPrice;

    @SerializedName("order_side")
    private final String orderSide;

    @SerializedName("order_type")
    private final String orderType;

    @SerializedName("portfolio_position_type")
    private final String portfolioPositionType;

    @SerializedName("product_code")
    private final String productCode;

    @SerializedName("shares")
    private final String shares;

    @SerializedName("trigger_price")
    private final String triggerPrice;

    @SerializedName("trigger_type")
    private final String triggerType;

    @SerializedName("ui_ref")
    private final String uiRef;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/stockbit/datasource/param/securities/stoporder/PostStopOrderParentDataParam$PostStopOrderAssetDataParam;", "", "code", "", "marketBoard", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getMarketBoard", "getType", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PostStopOrderAssetDataParam {

        @SerializedName("code")
        private final String code;

        @SerializedName("market_board")
        private final String marketBoard;

        @SerializedName("type")
        private final String type;

        public PostStopOrderAssetDataParam(String r1, String r2, String r3) {
            this.code = r1;
            this.marketBoard = r2;
            this.type = r3;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof PostStopOrderAssetDataParam) == true) goto L8;
            return false;
        L8:
            PostStopOrderAssetDataParam r52 = (PostStopOrderAssetDataParam) r5;
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
            String r02 = this.code;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.marketBoard;
            if (r2 != null) goto L9;
            int r22 = 0;
        L10:
            int r05 = (r04 + r22) * 31;
            String r23 = this.type;
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
            return "PostStopOrderAssetDataParam(code=" + this.code + ", marketBoard=" + this.marketBoard + ", type=" + this.type + ")";
        }
    }

    public PostStopOrderParentDataParam(PostStopOrderAssetDataParam r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11) {
        this.asset = r1;
        this.orderExpiryType = r2;
        this.orderPrice = r3;
        this.orderSide = r4;
        this.orderType = r5;
        this.productCode = r6;
        this.shares = r7;
        this.triggerPrice = r8;
        this.triggerType = r9;
        this.uiRef = r10;
        this.portfolioPositionType = r11;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof PostStopOrderParentDataParam) == true) goto L8;
        return false;
    L8:
        PostStopOrderParentDataParam r52 = (PostStopOrderParentDataParam) r5;
        if (p.g(this.asset, r52.asset) == true) goto L12;
        return false;
    L12:
        if (p.g(this.orderExpiryType, r52.orderExpiryType) == true) goto L15;
        return false;
    L15:
        if (p.g(this.orderPrice, r52.orderPrice) == true) goto L18;
        return false;
    L18:
        if (p.g(this.orderSide, r52.orderSide) == true) goto L21;
        return false;
    L21:
        if (p.g(this.orderType, r52.orderType) == true) goto L24;
        return false;
    L24:
        if (p.g(this.productCode, r52.productCode) == true) goto L27;
        return false;
    L27:
        if (p.g(this.shares, r52.shares) == true) goto L30;
        return false;
    L30:
        if (p.g(this.triggerPrice, r52.triggerPrice) == true) goto L33;
        return false;
    L33:
        if (p.g(this.triggerType, r52.triggerType) == true) goto L36;
        return false;
    L36:
        if (p.g(this.uiRef, r52.uiRef) == true) goto L39;
        return false;
    L39:
        if (p.g(this.portfolioPositionType, r52.portfolioPositionType) == true) goto L41;
        return false;
    L41:
        return true;
    }

    public int hashCode() {
        PostStopOrderAssetDataParam r02 = this.asset;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.orderExpiryType;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.orderPrice;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.orderSide;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.orderType;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.productCode;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.shares;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.triggerPrice;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.triggerType;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.uiRef;
        if (r217 != null) goto L41;
        int r218 = 0;
    L42:
        int r013 = (r012 + r218) * 31;
        String r219 = this.portfolioPositionType;
        if (r219 == null) goto L47;
        r1 = r219.hashCode();
    L47:
        return r013 + r1;
    L41:
        r218 = r217.hashCode();
        goto L42
    L37:
        r216 = r215.hashCode();
        goto L38
    L33:
        r214 = r213.hashCode();
        goto L34
    L29:
        r212 = r211.hashCode();
        goto L30
    L25:
        r210 = r29.hashCode();
        goto L26
    L21:
        r28 = r27.hashCode();
        goto L22
    L17:
        r26 = r25.hashCode();
        goto L18
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
        return "PostStopOrderParentDataParam(asset=" + this.asset + ", orderExpiryType=" + this.orderExpiryType + ", orderPrice=" + this.orderPrice + ", orderSide=" + this.orderSide + ", orderType=" + this.orderType + ", productCode=" + this.productCode + ", shares=" + this.shares + ", triggerPrice=" + this.triggerPrice + ", triggerType=" + this.triggerType + ", uiRef=" + this.uiRef + ", portfolioPositionType=" + this.portfolioPositionType + ")";
    }
}
