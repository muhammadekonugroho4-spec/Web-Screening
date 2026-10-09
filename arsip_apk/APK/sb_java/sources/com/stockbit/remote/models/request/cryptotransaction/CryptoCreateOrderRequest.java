package com.stockbit.remote.models.request.cryptotransaction;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ja\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\"\u001a\u00020#HÖ\u0081\u0004J\n\u0010$\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006%"}, d2 = {"Lcom/stockbit/remote/models/request/cryptotransaction/CryptoCreateOrderRequest;", "", "baseAsset", "", "quoteAsset", "side", "type", FirebaseAnalytics.Param.PRICE, "baseQty", "quoteQty", "grossQuoteQty", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBaseAsset", "()Ljava/lang/String;", "getQuoteAsset", "getSide", "getType", "getPrice", "getBaseQty", "getQuoteQty", "getGrossQuoteQty", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CryptoCreateOrderRequest {

    @SerializedName("base_asset")
    private final String baseAsset;

    @SerializedName("base_qty")
    private final String baseQty;

    @SerializedName("gross_quote_qty")
    private final String grossQuoteQty;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private final String price;

    @SerializedName("quote_asset")
    private final String quoteAsset;

    @SerializedName("quote_qty")
    private final String quoteQty;

    @SerializedName("side")
    private final String side;

    @SerializedName("type")
    private final String type;

    public CryptoCreateOrderRequest(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9) {
        p.l(r2, "baseAsset");
        p.l(r3, "quoteAsset");
        p.l(r4, "side");
        p.l(r5, "type");
        this.baseAsset = r2;
        this.quoteAsset = r3;
        this.side = r4;
        this.type = r5;
        this.price = r6;
        this.baseQty = r7;
        this.quoteQty = r8;
        this.grossQuoteQty = r9;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CryptoCreateOrderRequest) == true) goto L8;
        return false;
    L8:
        CryptoCreateOrderRequest r52 = (CryptoCreateOrderRequest) r5;
        if (p.g(this.baseAsset, r52.baseAsset) == true) goto L12;
        return false;
    L12:
        if (p.g(this.quoteAsset, r52.quoteAsset) == true) goto L15;
        return false;
    L15:
        if (p.g(this.side, r52.side) == true) goto L18;
        return false;
    L18:
        if (p.g(this.type, r52.type) == true) goto L21;
        return false;
    L21:
        if (p.g(this.price, r52.price) == true) goto L24;
        return false;
    L24:
        if (p.g(this.baseQty, r52.baseQty) == true) goto L27;
        return false;
    L27:
        if (p.g(this.quoteQty, r52.quoteQty) == true) goto L30;
        return false;
    L30:
        if (p.g(this.grossQuoteQty, r52.grossQuoteQty) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public int hashCode() {
        int r02 = ((((((this.baseAsset.hashCode() * 31) + this.quoteAsset.hashCode()) * 31) + this.side.hashCode()) * 31) + this.type.hashCode()) * 31;
        String r1 = this.price;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.baseQty;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.quoteQty;
        if (r15 != null) goto L13;
        int r16 = 0;
    L14:
        int r05 = (r04 + r16) * 31;
        String r17 = this.grossQuoteQty;
        if (r17 == null) goto L19;
        r2 = r17.hashCode();
    L19:
        return r05 + r2;
    L13:
        r16 = r15.hashCode();
        goto L14
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "CryptoCreateOrderRequest(baseAsset=" + this.baseAsset + ", quoteAsset=" + this.quoteAsset + ", side=" + this.side + ", type=" + this.type + ", price=" + this.price + ", baseQty=" + this.baseQty + ", quoteQty=" + this.quoteQty + ", grossQuoteQty=" + this.grossQuoteQty + ')';
    }

    public /* synthetic */ CryptoCreateOrderRequest(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, int r10, i r11) {
        if ((r10 & 16) == 0) goto L6;
        r6 = null;
    L6:
        if ((r10 & 32) == 0) goto L9;
        r7 = null;
    L9:
        if ((r10 & 64) == 0) goto L12;
        r8 = null;
    L12:
        if ((r10 & 128) == 0) goto L15;
        String r102 = null;
    L14:
        String r92 = r8;
        this(r2, r3, r4, r5, r6, r7, r92, r102);
        return;
    L15:
        r102 = r9;
        goto L14
    }
}
