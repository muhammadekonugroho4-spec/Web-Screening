package com.stockbit.dto.company;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010,\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010!J\u008c\u0001\u0010-\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010.J\u0014\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00102\u001a\u000203HÖ\u0081\u0004J\n\u00104\u001a\u00020\u0006HÖ\u0081\u0004R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001f\u0010\u001aR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!¨\u00065"}, d2 = {"Lcom/stockbit/dto/company/CompanyChartDTO;", "", "prices", "", "Lcom/stockbit/dto/company/CompanyChartPriceDTO;", "timeframe", "", "xaxisopt", "markingpoint", "change", "", "percentage", "cagr", "drawdown", "previous", "lineWeight", "", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Float;)V", "getPrices", "()Ljava/util/List;", "getTimeframe", "()Ljava/lang/String;", "getXaxisopt", "getMarkingpoint", "getChange", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPercentage", "getCagr", "getDrawdown", "getPrevious", "getLineWeight", "()Ljava/lang/Float;", "Ljava/lang/Float;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", Constants.COPY_TYPE, "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Float;)Lcom/stockbit/dto/company/CompanyChartDTO;", "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CompanyChartDTO {

    @SerializedName("cagr")
    private final String cagr;

    @SerializedName("change")
    private final Double change;

    @SerializedName("drawdown")
    private final String drawdown;

    @SerializedName("line_weight")
    private final Float lineWeight;

    @SerializedName("markingpoint")
    private final String markingpoint;

    @SerializedName("percentage")
    private final String percentage;

    @SerializedName("previous")
    private final Double previous;

    @SerializedName("prices")
    private final List<CompanyChartPriceDTO> prices;

    @SerializedName("timeframe")
    private final String timeframe;

    @SerializedName("xaxisopt")
    private final String xaxisopt;

    public CompanyChartDTO(List<CompanyChartPriceDTO> r1, String r2, String r3, String r4, Double r5, String r6, String r7, String r8, Double r9, Float r10) {
        this.prices = r1;
        this.timeframe = r2;
        this.xaxisopt = r3;
        this.markingpoint = r4;
        this.change = r5;
        this.percentage = r6;
        this.cagr = r7;
        this.drawdown = r8;
        this.previous = r9;
        this.lineWeight = r10;
    }

    public final String a() {
        return this.cagr;
    }

    public final Double b() {
        return this.change;
    }

    public final String c() {
        return this.drawdown;
    }

    public final Float d() {
        return this.lineWeight;
    }

    public final String e() {
        return this.percentage;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CompanyChartDTO) == true) goto L8;
        return false;
    L8:
        CompanyChartDTO r52 = (CompanyChartDTO) r5;
        if (p.g(this.prices, r52.prices) == true) goto L12;
        return false;
    L12:
        if (p.g(this.timeframe, r52.timeframe) == true) goto L15;
        return false;
    L15:
        if (p.g(this.xaxisopt, r52.xaxisopt) == true) goto L18;
        return false;
    L18:
        if (p.g(this.markingpoint, r52.markingpoint) == true) goto L21;
        return false;
    L21:
        if (p.g(this.change, r52.change) == true) goto L24;
        return false;
    L24:
        if (p.g(this.percentage, r52.percentage) == true) goto L27;
        return false;
    L27:
        if (p.g(this.cagr, r52.cagr) == true) goto L30;
        return false;
    L30:
        if (p.g(this.drawdown, r52.drawdown) == true) goto L33;
        return false;
    L33:
        if (p.g(this.previous, r52.previous) == true) goto L36;
        return false;
    L36:
        if (p.g(this.lineWeight, r52.lineWeight) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final Double f() {
        return this.previous;
    }

    public final List g() {
        return this.prices;
    }

    public final String h() {
        return this.timeframe;
    }

    public int hashCode() {
        List<CompanyChartPriceDTO> r02 = this.prices;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.timeframe;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.xaxisopt;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.markingpoint;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        Double r27 = this.change;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.percentage;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.cagr;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.drawdown;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        Double r215 = this.previous;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        Float r217 = this.lineWeight;
        if (r217 == null) goto L43;
        r1 = r217.hashCode();
    L43:
        return r012 + r1;
    L37:
        r216 = r215.hashCode();
        goto L38
    L33:
        r214 = r213.hashCode();
        goto L34
    L29:
        r212 = r211.hashCode();
        goto L30
    L25:
        r210 = r29.hashCode();
        goto L26
    L21:
        r28 = r27.hashCode();
        goto L22
    L17:
        r26 = r25.hashCode();
        goto L18
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "CompanyChartDTO(prices=" + this.prices + ", timeframe=" + this.timeframe + ", xaxisopt=" + this.xaxisopt + ", markingpoint=" + this.markingpoint + ", change=" + this.change + ", percentage=" + this.percentage + ", cagr=" + this.cagr + ", drawdown=" + this.drawdown + ", previous=" + this.previous + ", lineWeight=" + this.lineWeight + ")";
    }
}
