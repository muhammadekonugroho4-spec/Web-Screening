package com.stockbit.model.entity.virtual;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/stockbit/model/entity/virtual/VirtualPortfolioProfitLossExodusResponseData;", "", "realized", "", "total", "unrealized", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getRealized", "()Ljava/lang/Double;", "setRealized", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getTotal", "setTotal", "getUnrealized", "setUnrealized", "component1", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/stockbit/model/entity/virtual/VirtualPortfolioProfitLossExodusResponseData;", "equals", "", "other", "hashCode", "", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class VirtualPortfolioProfitLossExodusResponseData {

    @SerializedName("realized")
    private Double realized;

    @SerializedName("total")
    private Double total;

    @SerializedName("unrealized")
    private Double unrealized;

    public VirtualPortfolioProfitLossExodusResponseData(Double r1, Double r2, Double r3) {
        this.realized = r1;
        this.total = r2;
        this.unrealized = r3;
    }

    public final Double a() {
        return this.realized;
    }

    public final Double b() {
        return this.total;
    }

    public final Double c() {
        return this.unrealized;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof VirtualPortfolioProfitLossExodusResponseData) == true) goto L8;
        return false;
    L8:
        VirtualPortfolioProfitLossExodusResponseData r52 = (VirtualPortfolioProfitLossExodusResponseData) r5;
        if (p.g(this.realized, r52.realized) == true) goto L12;
        return false;
    L12:
        if (p.g(this.total, r52.total) == true) goto L15;
        return false;
    L15:
        if (p.g(this.unrealized, r52.unrealized) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        Double r02 = this.realized;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Double r2 = this.total;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Double r23 = this.unrealized;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return r05 + r1;
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "VirtualPortfolioProfitLossExodusResponseData(realized=" + this.realized + ", total=" + this.total + ", unrealized=" + this.unrealized + ')';
    }
}
