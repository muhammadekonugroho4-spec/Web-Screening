package com.stockbit.datasource.param.securities;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/stockbit/datasource/param/securities/GetOrderListDataParam;", "", FirebaseAnalytics.Param.PRICE, "", Constants.KEY_ACTION, "boardType", NotificationCompat.CATEGORY_STATUS, "<init>", "(IIII)V", "getPrice", "()I", "getAction", "getBoardType", "getStatus", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GetOrderListDataParam {

    @SerializedName(Constants.KEY_ACTION)
    private final int action;

    @SerializedName("board_type")
    private final int boardType;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private final int price;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final int status;

    public GetOrderListDataParam(int r1, int r2, int r3, int r4) {
        this.price = r1;
        this.action = r2;
        this.boardType = r3;
        this.status = r4;
    }

    public final int a() {
        return this.action;
    }

    public final int b() {
        return this.boardType;
    }

    public final int c() {
        return this.price;
    }

    public final int d() {
        return this.status;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof GetOrderListDataParam) == true) goto L8;
        return false;
    L8:
        GetOrderListDataParam r52 = (GetOrderListDataParam) r5;
        if (this.price == r52.price) goto L12;
        return false;
    L12:
        if (this.action == r52.action) goto L15;
        return false;
    L15:
        if (this.boardType == r52.boardType) goto L18;
        return false;
    L18:
        if (this.status == r52.status) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.price) * 31) + Integer.hashCode(this.action)) * 31) + Integer.hashCode(this.boardType)) * 31) + Integer.hashCode(this.status);
    }

    public String toString() {
        return "GetOrderListDataParam(price=" + this.price + ", action=" + this.action + ", boardType=" + this.boardType + ", status=" + this.status + ")";
    }
}
