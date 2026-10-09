package com.stockbit.remote.models.request.bond;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/stockbit/remote/models/request/bond/BondSellRequest;", "", "productId", "", "unit", "", "priceRate", "", "buyOrderId", "<init>", "(Ljava/lang/String;IDLjava/lang/String;)V", "getProductId", "()Ljava/lang/String;", "getUnit", "()I", "getPriceRate", "()D", "getBuyOrderId", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BondSellRequest {

    @SerializedName("buy_order_id")
    private final String buyOrderId;

    @SerializedName("price_rate")
    private final double priceRate;

    @SerializedName("product_id")
    private final String productId;

    @SerializedName("unit")
    private final int unit;

    public BondSellRequest(String r2, int r3, double r4, String r6) {
        p.l(r2, "productId");
        p.l(r6, "buyOrderId");
        this.productId = r2;
        this.unit = r3;
        this.priceRate = r4;
        this.buyOrderId = r6;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BondSellRequest) == true) goto L8;
        return false;
    L8:
        BondSellRequest r82 = (BondSellRequest) r8;
        if (p.g(this.productId, r82.productId) == true) goto L12;
        return false;
    L12:
        if (this.unit == r82.unit) goto L15;
        return false;
    L15:
        if (Double.compare(this.priceRate, r82.priceRate) == 0) goto L18;
        return false;
    L18:
        if (p.g(this.buyOrderId, r82.buyOrderId) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.productId.hashCode() * 31) + Integer.hashCode(this.unit)) * 31) + Double.hashCode(this.priceRate)) * 31) + this.buyOrderId.hashCode();
    }

    public String toString() {
        return "BondSellRequest(productId=" + this.productId + ", unit=" + this.unit + ", priceRate=" + this.priceRate + ", buyOrderId=" + this.buyOrderId + ')';
    }
}
