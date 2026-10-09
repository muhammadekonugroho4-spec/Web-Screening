package com.stockbit.dto.company.financial;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J]\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0001J\u0014\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006\""}, d2 = {"Lcom/stockbit/dto/company/financial/CompanyFinancialChartDataBeanDTO;", "", "legend", "", Constants.KEY_COLOR, "currencyScale", "chartType", Constants.ScionAnalytics.PARAM_LABEL, "", "yAxis", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getLegend", "()Ljava/lang/String;", "getColor", "getCurrencyScale", "getChartType", "getLabel", "()Ljava/util/List;", "getYAxis", "component1", "component2", "component3", "component4", "component5", "component6", com.clevertap.android.sdk.Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CompanyFinancialChartDataBeanDTO {

    @SerializedName("chart_type")
    private final String chartType;

    @SerializedName(com.clevertap.android.sdk.Constants.KEY_COLOR)
    private final String color;

    @SerializedName("currency_scale")
    private final String currencyScale;

    @SerializedName(Constants.ScionAnalytics.PARAM_LABEL)
    private final List<String> label;

    @SerializedName("legend")
    private final String legend;

    @SerializedName("y_axis")
    private final List<Double> yAxis;

    public CompanyFinancialChartDataBeanDTO() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        List r5 = null;
        List r6 = null;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    public final String a() {
        return this.chartType;
    }

    public final String b() {
        return this.color;
    }

    public final String c() {
        return this.currencyScale;
    }

    public final List d() {
        return this.label;
    }

    public final String e() {
        return this.legend;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CompanyFinancialChartDataBeanDTO) == true) goto L8;
        return false;
    L8:
        CompanyFinancialChartDataBeanDTO r52 = (CompanyFinancialChartDataBeanDTO) r5;
        if (p.g(this.legend, r52.legend) == true) goto L12;
        return false;
    L12:
        if (p.g(this.color, r52.color) == true) goto L15;
        return false;
    L15:
        if (p.g(this.currencyScale, r52.currencyScale) == true) goto L18;
        return false;
    L18:
        if (p.g(this.chartType, r52.chartType) == true) goto L21;
        return false;
    L21:
        if (p.g(this.label, r52.label) == true) goto L24;
        return false;
    L24:
        if (p.g(this.yAxis, r52.yAxis) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final List f() {
        return this.yAxis;
    }

    public int hashCode() {
        String r02 = this.legend;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.color;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.currencyScale;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.chartType;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        List<String> r27 = this.label;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        List<Double> r29 = this.yAxis;
        if (r29 == null) goto L27;
        r1 = r29.hashCode();
    L27:
        return r08 + r1;
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
        return "CompanyFinancialChartDataBeanDTO(legend=" + this.legend + ", color=" + this.color + ", currencyScale=" + this.currencyScale + ", chartType=" + this.chartType + ", label=" + this.label + ", yAxis=" + this.yAxis + ")";
    }

    public CompanyFinancialChartDataBeanDTO(String r1, String r2, String r3, String r4, List<String> r5, List<Double> r6) {
        this.legend = r1;
        this.color = r2;
        this.currencyScale = r3;
        this.chartType = r4;
        this.label = r5;
        this.yAxis = r6;
    }

    public /* synthetic */ CompanyFinancialChartDataBeanDTO(String r2, String r3, String r4, String r5, List r6, List r7, int r8, i r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r8 & 32) == 0) goto L21;
        List r82 = null;
    L20:
        List r72 = r6;
        String r62 = r5;
        String r52 = r4;
        this(r2, r3, r52, r62, r72, r82);
        return;
    L21:
        r82 = r7;
        goto L20
    }
}
