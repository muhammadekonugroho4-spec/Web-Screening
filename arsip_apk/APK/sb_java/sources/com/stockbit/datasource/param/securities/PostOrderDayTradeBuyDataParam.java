package com.stockbit.datasource.param.securities;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/stockbit/datasource/param/securities/PostOrderDayTradeBuyDataParam;", "", "symbol", "", FirebaseAnalytics.Param.PRICE, "shares", "multiplier", "platformOrderType", "uiRef", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getPrice", "getShares", "getMultiplier", "getPlatformOrderType", "getUiRef", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PostOrderDayTradeBuyDataParam {

    @SerializedName("multiplier")
    private final String multiplier;

    @SerializedName("platform_order_type")
    private final String platformOrderType;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private final String price;

    @SerializedName("shares")
    private final String shares;

    @SerializedName("symbol")
    private final String symbol;

    @SerializedName("ui_ref")
    private final String uiRef;

    public PostOrderDayTradeBuyDataParam(String r2, String r3, String r4, String r5, String r6, String r7) {
        p.l(r2, "symbol");
        p.l(r3, FirebaseAnalytics.Param.PRICE);
        p.l(r4, "shares");
        p.l(r5, "multiplier");
        p.l(r6, "platformOrderType");
        p.l(r7, "uiRef");
        this.symbol = r2;
        this.price = r3;
        this.shares = r4;
        this.multiplier = r5;
        this.platformOrderType = r6;
        this.uiRef = r7;
    }

    public final String a() {
        return this.multiplier;
    }

    public final String b() {
        return this.platformOrderType;
    }

    public final String c() {
        return this.price;
    }

    public final String d() {
        return this.shares;
    }

    public final String e() {
        return this.symbol;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof PostOrderDayTradeBuyDataParam) == true) goto L8;
        return false;
    L8:
        PostOrderDayTradeBuyDataParam r52 = (PostOrderDayTradeBuyDataParam) r5;
        if (p.g(this.symbol, r52.symbol) == true) goto L12;
        return false;
    L12:
        if (p.g(this.price, r52.price) == true) goto L15;
        return false;
    L15:
        if (p.g(this.shares, r52.shares) == true) goto L18;
        return false;
    L18:
        if (p.g(this.multiplier, r52.multiplier) == true) goto L21;
        return false;
    L21:
        if (p.g(this.platformOrderType, r52.platformOrderType) == true) goto L24;
        return false;
    L24:
        if (p.g(this.uiRef, r52.uiRef) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.uiRef;
    }

    public int hashCode() {
        return (((((((((this.symbol.hashCode() * 31) + this.price.hashCode()) * 31) + this.shares.hashCode()) * 31) + this.multiplier.hashCode()) * 31) + this.platformOrderType.hashCode()) * 31) + this.uiRef.hashCode();
    }

    public String toString() {
        return "PostOrderDayTradeBuyDataParam(symbol=" + this.symbol + ", price=" + this.price + ", shares=" + this.shares + ", multiplier=" + this.multiplier + ", platformOrderType=" + this.platformOrderType + ", uiRef=" + this.uiRef + ")";
    }
}
