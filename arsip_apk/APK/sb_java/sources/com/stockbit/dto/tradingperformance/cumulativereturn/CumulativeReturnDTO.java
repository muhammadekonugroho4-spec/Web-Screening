package com.stockbit.dto.tradingperformance.cumulativereturn;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J8\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\bHÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/stockbit/dto/tradingperformance/cumulativereturn/CumulativeReturnDTO;", "", "percentage", "", "portfolioReturns", "", "Lcom/stockbit/dto/tradingperformance/cumulativereturn/PortfolioReturnDTO;", "timeFilter", "", "<init>", "(Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;)V", "getPercentage", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPortfolioReturns", "()Ljava/util/List;", "getTimeFilter", "()Ljava/lang/String;", "component1", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/Double;Ljava/util/List;Ljava/lang/String;)Lcom/stockbit/dto/tradingperformance/cumulativereturn/CumulativeReturnDTO;", "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CumulativeReturnDTO {

    @SerializedName("percentage")
    private final Double percentage;

    @SerializedName("portfolio_returns")
    private final List<PortfolioReturnDTO> portfolioReturns;

    @SerializedName("time_filter")
    private final String timeFilter;

    public CumulativeReturnDTO(Double r1, List<PortfolioReturnDTO> r2, String r3) {
        this.percentage = r1;
        this.portfolioReturns = r2;
        this.timeFilter = r3;
    }

    public final Double a() {
        return this.percentage;
    }

    public final List b() {
        return this.portfolioReturns;
    }

    public final String c() {
        return this.timeFilter;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CumulativeReturnDTO) == true) goto L8;
        return false;
    L8:
        CumulativeReturnDTO r52 = (CumulativeReturnDTO) r5;
        if (p.g(this.percentage, r52.percentage) == true) goto L12;
        return false;
    L12:
        if (p.g(this.portfolioReturns, r52.portfolioReturns) == true) goto L15;
        return false;
    L15:
        if (p.g(this.timeFilter, r52.timeFilter) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        Double r02 = this.percentage;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        List<PortfolioReturnDTO> r2 = this.portfolioReturns;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.timeFilter;
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
        return "CumulativeReturnDTO(percentage=" + this.percentage + ", portfolioReturns=" + this.portfolioReturns + ", timeFilter=" + this.timeFilter + ")";
    }
}
