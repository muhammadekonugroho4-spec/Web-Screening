package com.stockbit.dto.securities.portfolio;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/stockbit/dto/securities/portfolio/PortfolioDetailUnrealisedDTO;", "", "gain", "", "marketValue", "profitLoss", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getGain", "()Ljava/lang/Double;", "setGain", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getMarketValue", "setMarketValue", "getProfitLoss", "setProfitLoss", "component1", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/stockbit/dto/securities/portfolio/PortfolioDetailUnrealisedDTO;", "equals", "", "other", "hashCode", "", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PortfolioDetailUnrealisedDTO {

    @SerializedName("gain")
    private Double gain;

    @SerializedName("market_value")
    private Double marketValue;

    @SerializedName("profit_loss")
    private Double profitLoss;

    public PortfolioDetailUnrealisedDTO() {
        Double r1 = null;
        Double r2 = null;
        Double r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public final Double a() {
        return this.gain;
    }

    public final Double b() {
        return this.marketValue;
    }

    public final Double c() {
        return this.profitLoss;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof PortfolioDetailUnrealisedDTO) == true) goto L8;
        return false;
    L8:
        PortfolioDetailUnrealisedDTO r52 = (PortfolioDetailUnrealisedDTO) r5;
        if (p.g(this.gain, r52.gain) == true) goto L12;
        return false;
    L12:
        if (p.g(this.marketValue, r52.marketValue) == true) goto L15;
        return false;
    L15:
        if (p.g(this.profitLoss, r52.profitLoss) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        Double r02 = this.gain;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Double r2 = this.marketValue;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Double r23 = this.profitLoss;
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
        return "PortfolioDetailUnrealisedDTO(gain=" + this.gain + ", marketValue=" + this.marketValue + ", profitLoss=" + this.profitLoss + ")";
    }

    public PortfolioDetailUnrealisedDTO(Double r1, Double r2, Double r3) {
        this.gain = r1;
        this.marketValue = r2;
        this.profitLoss = r3;
    }

    public /* synthetic */ PortfolioDetailUnrealisedDTO(Double r2, Double r3, Double r4, int r5, i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = null;
    L11:
        this(r2, r3, r4);
    }
}
