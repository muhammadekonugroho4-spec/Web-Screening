package com.stockbit.dto.securities.order;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/stockbit/dto/securities/order/StopPriceDTO;", "", "currencyCode", "", "units", "nanos", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getCurrencyCode", "()Ljava/lang/String;", "getUnits", "getNanos", "()I", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StopPriceDTO {

    @SerializedName("currency_code")
    private final String currencyCode;

    @SerializedName("nanos")
    private final int nanos;

    @SerializedName("units")
    private final String units;

    public StopPriceDTO(String r2, String r3, int r4) {
        p.l(r2, "currencyCode");
        p.l(r3, "units");
        this.currencyCode = r2;
        this.units = r3;
        this.nanos = r4;
    }

    public final String a() {
        return this.units;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof StopPriceDTO) == true) goto L8;
        return false;
    L8:
        StopPriceDTO r52 = (StopPriceDTO) r5;
        if (p.g(this.currencyCode, r52.currencyCode) == true) goto L12;
        return false;
    L12:
        if (p.g(this.units, r52.units) == true) goto L15;
        return false;
    L15:
        if (this.nanos == r52.nanos) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.currencyCode.hashCode() * 31) + this.units.hashCode()) * 31) + Integer.hashCode(this.nanos);
    }

    public String toString() {
        return "StopPriceDTO(currencyCode=" + this.currencyCode + ", units=" + this.units + ", nanos=" + this.nanos + ")";
    }
}
