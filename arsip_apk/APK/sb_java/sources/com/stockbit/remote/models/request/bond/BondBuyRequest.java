package com.stockbit.remote.models.request.bond;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/stockbit/remote/models/request/bond/BondBuyRequest;", "", "proudctId", "", "unit", "", "priceRate", "", "<init>", "(Ljava/lang/String;ID)V", "getProudctId", "()Ljava/lang/String;", "getUnit", "()I", "getPriceRate", "()D", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BondBuyRequest {

    @SerializedName("price_rate")
    private final double priceRate;

    @SerializedName("product_id")
    private final String proudctId;

    @SerializedName("unit")
    private final int unit;

    public BondBuyRequest(String r2, int r3, double r4) {
        p.l(r2, "proudctId");
        this.proudctId = r2;
        this.unit = r3;
        this.priceRate = r4;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BondBuyRequest) == true) goto L8;
        return false;
    L8:
        BondBuyRequest r82 = (BondBuyRequest) r8;
        if (p.g(this.proudctId, r82.proudctId) == true) goto L12;
        return false;
    L12:
        if (this.unit == r82.unit) goto L15;
        return false;
    L15:
        if (Double.compare(this.priceRate, r82.priceRate) == 0) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.proudctId.hashCode() * 31) + Integer.hashCode(this.unit)) * 31) + Double.hashCode(this.priceRate);
    }

    public String toString() {
        return "BondBuyRequest(proudctId=" + this.proudctId + ", unit=" + this.unit + ", priceRate=" + this.priceRate + ')';
    }
}
