package com.stockbit.remote.models.request.sharetrade;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b#\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003Jk\u0010(\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\nHÆ\u0001J\u0014\u0010)\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010+\u001a\u00020\nHÖ\u0081\u0004J\n\u0010,\u001a\u00020\bHÖ\u0081\u0004R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0016\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0016\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0016\u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0016\u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019¨\u0006-"}, d2 = {"Lcom/stockbit/remote/models/request/sharetrade/ShareTradeOrderRequest;", "", "targets", "", "Lcom/stockbit/remote/models/request/sharetrade/TargetShareTradeOrder;", "saveAsAutoshare", "", "orderId", "", FirebaseAnalytics.Param.PRICE, "", "symbol", "type", NotificationCompat.CATEGORY_STATUS, "orderTime", "qty", "<init>", "(Ljava/util/List;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getTargets", "()Ljava/util/List;", "getSaveAsAutoshare", "()Z", "getOrderId", "()Ljava/lang/String;", "getPrice", "()I", "getSymbol", "getType", "getStatus", "getOrderTime", "getQty", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", Constants.COPY_TYPE, "equals", "other", "hashCode", "toString", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ShareTradeOrderRequest {

    @SerializedName("order_id")
    private final String orderId;

    @SerializedName("order_time")
    private final String orderTime;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private final int price;

    @SerializedName("qty")
    private final int qty;

    @SerializedName("save_as_autoshare")
    private final boolean saveAsAutoshare;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final String status;

    @SerializedName("symbol")
    private final String symbol;

    @SerializedName("targets")
    private final List<TargetShareTradeOrder> targets;

    @SerializedName("type")
    private final String type;

    public ShareTradeOrderRequest(List<TargetShareTradeOrder> r2, boolean r3, String r4, int r5, String r6, String r7, String r8, String r9, int r10) {
        p.l(r4, "orderId");
        p.l(r6, "symbol");
        p.l(r7, "type");
        p.l(r8, NotificationCompat.CATEGORY_STATUS);
        p.l(r9, "orderTime");
        this.targets = r2;
        this.saveAsAutoshare = r3;
        this.orderId = r4;
        this.price = r5;
        this.symbol = r6;
        this.type = r7;
        this.status = r8;
        this.orderTime = r9;
        this.qty = r10;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ShareTradeOrderRequest) == true) goto L8;
        return false;
    L8:
        ShareTradeOrderRequest r52 = (ShareTradeOrderRequest) r5;
        if (p.g(this.targets, r52.targets) == true) goto L12;
        return false;
    L12:
        if (this.saveAsAutoshare == r52.saveAsAutoshare) goto L15;
        return false;
    L15:
        if (p.g(this.orderId, r52.orderId) == true) goto L18;
        return false;
    L18:
        if (this.price == r52.price) goto L21;
        return false;
    L21:
        if (p.g(this.symbol, r52.symbol) == true) goto L24;
        return false;
    L24:
        if (p.g(this.type, r52.type) == true) goto L27;
        return false;
    L27:
        if (p.g(this.status, r52.status) == true) goto L30;
        return false;
    L30:
        if (p.g(this.orderTime, r52.orderTime) == true) goto L33;
        return false;
    L33:
        if (this.qty == r52.qty) goto L35;
        return false;
    L35:
        return true;
    }

    public int hashCode() {
        List<TargetShareTradeOrder> r02 = this.targets;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (((((((((((((((r03 * 31) + Boolean.hashCode(this.saveAsAutoshare)) * 31) + this.orderId.hashCode()) * 31) + Integer.hashCode(this.price)) * 31) + this.symbol.hashCode()) * 31) + this.type.hashCode()) * 31) + this.status.hashCode()) * 31) + this.orderTime.hashCode()) * 31) + Integer.hashCode(this.qty);
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "ShareTradeOrderRequest(targets=" + this.targets + ", saveAsAutoshare=" + this.saveAsAutoshare + ", orderId=" + this.orderId + ", price=" + this.price + ", symbol=" + this.symbol + ", type=" + this.type + ", status=" + this.status + ", orderTime=" + this.orderTime + ", qty=" + this.qty + ')';
    }

    public /* synthetic */ ShareTradeOrderRequest(List r1, boolean r2, String r3, int r4, String r5, String r6, String r7, String r8, int r9, int r10, i r11) {
        if ((r10 & 1) == 0) goto L5;
        r1 = null;
    L5:
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9);
    }
}
