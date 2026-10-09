package com.stockbit.datasource.param.securities;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010#\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010$\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006%"}, d2 = {"Lcom/stockbit/datasource/param/securities/PostSellTrailingStopDataParam;", "", "symbol", "", "type", "boardType", "shares", "", "trailPercentage", "", "priceAlgorithm", "orderType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IFLjava/lang/String;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getType", "getBoardType", "getShares", "()I", "getTrailPercentage", "()F", "getPriceAlgorithm", "getOrderType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PostSellTrailingStopDataParam {

    @SerializedName("board_type")
    private final String boardType;

    @SerializedName("order_type")
    private final String orderType;

    @SerializedName("price_algorithm")
    private final String priceAlgorithm;

    @SerializedName("shares")
    private final int shares;

    @SerializedName("symbol")
    private final String symbol;

    @SerializedName("trail_percentage")
    private final float trailPercentage;

    @SerializedName("type")
    private final String type;

    public PostSellTrailingStopDataParam(String r2, String r3, String r4, int r5, float r6, String r7, String r8) {
        p.l(r2, "symbol");
        p.l(r3, "type");
        p.l(r4, "boardType");
        p.l(r7, "priceAlgorithm");
        p.l(r8, "orderType");
        this.symbol = r2;
        this.type = r3;
        this.boardType = r4;
        this.shares = r5;
        this.trailPercentage = r6;
        this.priceAlgorithm = r7;
        this.orderType = r8;
    }

    public final String a() {
        return this.boardType;
    }

    public final String b() {
        return this.orderType;
    }

    public final String c() {
        return this.priceAlgorithm;
    }

    public final int d() {
        return this.shares;
    }

    public final String e() {
        return this.symbol;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof PostSellTrailingStopDataParam) == true) goto L8;
        return false;
    L8:
        PostSellTrailingStopDataParam r52 = (PostSellTrailingStopDataParam) r5;
        if (p.g(this.symbol, r52.symbol) == true) goto L12;
        return false;
    L12:
        if (p.g(this.type, r52.type) == true) goto L15;
        return false;
    L15:
        if (p.g(this.boardType, r52.boardType) == true) goto L18;
        return false;
    L18:
        if (this.shares == r52.shares) goto L21;
        return false;
    L21:
        if (Float.compare(this.trailPercentage, r52.trailPercentage) == 0) goto L24;
        return false;
    L24:
        if (p.g(this.priceAlgorithm, r52.priceAlgorithm) == true) goto L27;
        return false;
    L27:
        if (p.g(this.orderType, r52.orderType) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final float f() {
        return this.trailPercentage;
    }

    public final String g() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((((this.symbol.hashCode() * 31) + this.type.hashCode()) * 31) + this.boardType.hashCode()) * 31) + Integer.hashCode(this.shares)) * 31) + Float.hashCode(this.trailPercentage)) * 31) + this.priceAlgorithm.hashCode()) * 31) + this.orderType.hashCode();
    }

    public String toString() {
        return "PostSellTrailingStopDataParam(symbol=" + this.symbol + ", type=" + this.type + ", boardType=" + this.boardType + ", shares=" + this.shares + ", trailPercentage=" + this.trailPercentage + ", priceAlgorithm=" + this.priceAlgorithm + ", orderType=" + this.orderType + ")";
    }
}
