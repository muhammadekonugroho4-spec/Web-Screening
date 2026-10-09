package com.stockbit.datasource.param.securities;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/stockbit/datasource/param/securities/PostOrderDayTradeSellDataParam;", "", FirebaseAnalytics.Param.PRICE, "", "shares", "uiref", "symbol", "platformOrderType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPrice", "()Ljava/lang/String;", "getShares", "getUiref", "getSymbol", "getPlatformOrderType", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PostOrderDayTradeSellDataParam {

    @SerializedName("platform_order_type")
    private final String platformOrderType;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private final String price;

    @SerializedName("shares")
    private final String shares;

    @SerializedName("symbol")
    private final String symbol;

    @SerializedName("uiref")
    private final String uiref;

    public PostOrderDayTradeSellDataParam(String r2, String r3, String r4, String r5, String r6) {
        p.l(r2, FirebaseAnalytics.Param.PRICE);
        p.l(r3, "shares");
        p.l(r4, "uiref");
        p.l(r5, "symbol");
        p.l(r6, "platformOrderType");
        this.price = r2;
        this.shares = r3;
        this.uiref = r4;
        this.symbol = r5;
        this.platformOrderType = r6;
    }

    public final String a() {
        return this.platformOrderType;
    }

    public final String b() {
        return this.price;
    }

    public final String c() {
        return this.shares;
    }

    public final String d() {
        return this.symbol;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof PostOrderDayTradeSellDataParam) == true) goto L8;
        return false;
    L8:
        PostOrderDayTradeSellDataParam r52 = (PostOrderDayTradeSellDataParam) r5;
        if (p.g(this.price, r52.price) == true) goto L12;
        return false;
    L12:
        if (p.g(this.shares, r52.shares) == true) goto L15;
        return false;
    L15:
        if (p.g(this.uiref, r52.uiref) == true) goto L18;
        return false;
    L18:
        if (p.g(this.symbol, r52.symbol) == true) goto L21;
        return false;
    L21:
        if (p.g(this.platformOrderType, r52.platformOrderType) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.price.hashCode() * 31) + this.shares.hashCode()) * 31) + this.uiref.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.platformOrderType.hashCode();
    }

    public String toString() {
        return "PostOrderDayTradeSellDataParam(price=" + this.price + ", shares=" + this.shares + ", uiref=" + this.uiref + ", symbol=" + this.symbol + ", platformOrderType=" + this.platformOrderType + ")";
    }
}
