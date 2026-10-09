package com.stockbit.datasource.param.securities;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003Jw\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0014\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010+\u001a\u00020,HÖ\u0081\u0004J\n\u0010-\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006."}, d2 = {"Lcom/stockbit/datasource/param/securities/PostSellDataParam;", "", FirebaseAnalytics.Param.PRICE, "", "shares", "gtc", "uiref", "symbol", "boardtype", "splitMethod", "splitQty", "splitRangeMin", "splitRangeMax", "platformOrderType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPrice", "()Ljava/lang/String;", "getShares", "getGtc", "getUiref", "getSymbol", "getBoardtype", "getSplitMethod", "getSplitQty", "getSplitRangeMin", "getSplitRangeMax", "getPlatformOrderType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PostSellDataParam {

    /* renamed from: a, reason: collision with root package name */
    public final String f80072a;

    @SerializedName("board_type")
    private final String boardtype;

    @SerializedName("gtc")
    private final String gtc;

    @SerializedName("platform_order_type")
    private final String platformOrderType;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private final String price;

    @SerializedName("shares")
    private final String shares;

    @SerializedName("split_qty")
    private final String splitMethod;

    @SerializedName("split_range_max")
    private final String splitRangeMax;

    @SerializedName("split_range_min")
    private final String splitRangeMin;

    @SerializedName("symbol")
    private final String symbol;

    @SerializedName("uiref")
    private final String uiref;

    public PostSellDataParam(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12) {
        p.l(r2, FirebaseAnalytics.Param.PRICE);
        p.l(r3, "shares");
        p.l(r4, "gtc");
        p.l(r5, "uiref");
        p.l(r6, "symbol");
        p.l(r7, "boardtype");
        p.l(r8, "splitMethod");
        p.l(r9, "splitQty");
        p.l(r10, "splitRangeMin");
        p.l(r11, "splitRangeMax");
        p.l(r12, "platformOrderType");
        this.price = r2;
        this.shares = r3;
        this.gtc = r4;
        this.uiref = r5;
        this.symbol = r6;
        this.boardtype = r7;
        this.splitMethod = r8;
        this.f80072a = r9;
        this.splitRangeMin = r10;
        this.splitRangeMax = r11;
        this.platformOrderType = r12;
    }

    public final String a() {
        return this.boardtype;
    }

    public final String b() {
        return this.gtc;
    }

    public final String c() {
        return this.platformOrderType;
    }

    public final String d() {
        return this.price;
    }

    public final String e() {
        return this.shares;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof PostSellDataParam) == true) goto L8;
        return false;
    L8:
        PostSellDataParam r52 = (PostSellDataParam) r5;
        if (p.g(this.price, r52.price) == true) goto L12;
        return false;
    L12:
        if (p.g(this.shares, r52.shares) == true) goto L15;
        return false;
    L15:
        if (p.g(this.gtc, r52.gtc) == true) goto L18;
        return false;
    L18:
        if (p.g(this.uiref, r52.uiref) == true) goto L21;
        return false;
    L21:
        if (p.g(this.symbol, r52.symbol) == true) goto L24;
        return false;
    L24:
        if (p.g(this.boardtype, r52.boardtype) == true) goto L27;
        return false;
    L27:
        if (p.g(this.splitMethod, r52.splitMethod) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f80072a, r52.f80072a) == true) goto L33;
        return false;
    L33:
        if (p.g(this.splitRangeMin, r52.splitRangeMin) == true) goto L36;
        return false;
    L36:
        if (p.g(this.splitRangeMax, r52.splitRangeMax) == true) goto L39;
        return false;
    L39:
        if (p.g(this.platformOrderType, r52.platformOrderType) == true) goto L41;
        return false;
    L41:
        return true;
    }

    public final String f() {
        return this.splitMethod;
    }

    public final String g() {
        return this.f80072a;
    }

    public final String h() {
        return this.splitRangeMax;
    }

    public int hashCode() {
        return (((((((((((((((((((this.price.hashCode() * 31) + this.shares.hashCode()) * 31) + this.gtc.hashCode()) * 31) + this.uiref.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.boardtype.hashCode()) * 31) + this.splitMethod.hashCode()) * 31) + this.f80072a.hashCode()) * 31) + this.splitRangeMin.hashCode()) * 31) + this.splitRangeMax.hashCode()) * 31) + this.platformOrderType.hashCode();
    }

    public final String i() {
        return this.splitRangeMin;
    }

    public final String j() {
        return this.symbol;
    }

    public String toString() {
        return "PostSellDataParam(price=" + this.price + ", shares=" + this.shares + ", gtc=" + this.gtc + ", uiref=" + this.uiref + ", symbol=" + this.symbol + ", boardtype=" + this.boardtype + ", splitMethod=" + this.splitMethod + ", splitQty=" + this.f80072a + ", splitRangeMin=" + this.splitRangeMin + ", splitRangeMax=" + this.splitRangeMax + ", platformOrderType=" + this.platformOrderType + ")";
    }
}
