package com.stockbit.model.entity.virtual;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/stockbit/model/entity/virtual/VirtualPortfolioSellOpenExodusResponseData;", "", "today", "", "total", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;)V", "getToday", "()Ljava/lang/Double;", "setToday", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getTotal", "setTotal", "component1", "component2", Constants.COPY_TYPE, "(Ljava/lang/Double;Ljava/lang/Double;)Lcom/stockbit/model/entity/virtual/VirtualPortfolioSellOpenExodusResponseData;", "equals", "", "other", "hashCode", "", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class VirtualPortfolioSellOpenExodusResponseData {

    @SerializedName("today")
    private Double today;

    @SerializedName("total")
    private Double total;

    public VirtualPortfolioSellOpenExodusResponseData(Double r1, Double r2) {
        this.today = r1;
        this.total = r2;
    }

    public final Double a() {
        return this.today;
    }

    public final Double b() {
        return this.total;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof VirtualPortfolioSellOpenExodusResponseData) == true) goto L8;
        return false;
    L8:
        VirtualPortfolioSellOpenExodusResponseData r52 = (VirtualPortfolioSellOpenExodusResponseData) r5;
        if (p.g(this.today, r52.today) == true) goto L12;
        return false;
    L12:
        if (p.g(this.total, r52.total) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        Double r02 = this.today;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Double r2 = this.total;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "VirtualPortfolioSellOpenExodusResponseData(today=" + this.today + ", total=" + this.total + ')';
    }
}
