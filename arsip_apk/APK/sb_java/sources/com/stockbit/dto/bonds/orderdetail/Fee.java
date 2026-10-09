package com.stockbit.dto.bonds.orderdetail;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJn\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010 J\u0014\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020%HÖ\u0081\u0004J\n\u0010&\u001a\u00020'HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0013\u0010\u000eR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0014\u0010\u000eR\u001a\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0015\u0010\u000eR\u001a\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0016\u0010\u000e¨\u0006("}, d2 = {"Lcom/stockbit/dto/bonds/orderdetail/Fee;", "", "accruedInterestExcludeTax", "", "accruedInterestTax", "capitalGainTax", "commissionFee", "estimationAmountExcludeTax", "stampDuty", "taxPercent", "totalTax", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getAccruedInterestExcludeTax", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAccruedInterestTax", "getCapitalGainTax", "getCommissionFee", "getEstimationAmountExcludeTax", "getStampDuty", "getTaxPercent", "getTotalTax", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", Constants.COPY_TYPE, "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/stockbit/dto/bonds/orderdetail/Fee;", "equals", "", "other", "hashCode", "", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Fee {

    @SerializedName("accrued_interest_exclude_tax")
    private final Double accruedInterestExcludeTax;

    @SerializedName("accrued_interest_tax")
    private final Double accruedInterestTax;

    @SerializedName("capital_gain_tax")
    private final Double capitalGainTax;

    @SerializedName("commission_fee")
    private final Double commissionFee;

    @SerializedName("estimation_amount_exclude_tax")
    private final Double estimationAmountExcludeTax;

    @SerializedName("stamp_duty")
    private final Double stampDuty;

    @SerializedName("tax_percent")
    private final Double taxPercent;

    @SerializedName("total_tax")
    private final Double totalTax;

    public Fee(Double r1, Double r2, Double r3, Double r4, Double r5, Double r6, Double r7, Double r8) {
        this.accruedInterestExcludeTax = r1;
        this.accruedInterestTax = r2;
        this.capitalGainTax = r3;
        this.commissionFee = r4;
        this.estimationAmountExcludeTax = r5;
        this.stampDuty = r6;
        this.taxPercent = r7;
        this.totalTax = r8;
    }

    public final Double a() {
        return this.accruedInterestExcludeTax;
    }

    public final Double b() {
        return this.estimationAmountExcludeTax;
    }

    public final Double c() {
        return this.stampDuty;
    }

    public final Double d() {
        return this.totalTax;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Fee) == true) goto L8;
        return false;
    L8:
        Fee r52 = (Fee) r5;
        if (p.g(this.accruedInterestExcludeTax, r52.accruedInterestExcludeTax) == true) goto L12;
        return false;
    L12:
        if (p.g(this.accruedInterestTax, r52.accruedInterestTax) == true) goto L15;
        return false;
    L15:
        if (p.g(this.capitalGainTax, r52.capitalGainTax) == true) goto L18;
        return false;
    L18:
        if (p.g(this.commissionFee, r52.commissionFee) == true) goto L21;
        return false;
    L21:
        if (p.g(this.estimationAmountExcludeTax, r52.estimationAmountExcludeTax) == true) goto L24;
        return false;
    L24:
        if (p.g(this.stampDuty, r52.stampDuty) == true) goto L27;
        return false;
    L27:
        if (p.g(this.taxPercent, r52.taxPercent) == true) goto L30;
        return false;
    L30:
        if (p.g(this.totalTax, r52.totalTax) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public int hashCode() {
        Double r02 = this.accruedInterestExcludeTax;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Double r2 = this.accruedInterestTax;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Double r23 = this.capitalGainTax;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Double r25 = this.commissionFee;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        Double r27 = this.estimationAmountExcludeTax;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        Double r29 = this.stampDuty;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        Double r211 = this.taxPercent;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        Double r213 = this.totalTax;
        if (r213 == null) goto L35;
        r1 = r213.hashCode();
    L35:
        return r010 + r1;
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
        return "Fee(accruedInterestExcludeTax=" + this.accruedInterestExcludeTax + ", accruedInterestTax=" + this.accruedInterestTax + ", capitalGainTax=" + this.capitalGainTax + ", commissionFee=" + this.commissionFee + ", estimationAmountExcludeTax=" + this.estimationAmountExcludeTax + ", stampDuty=" + this.stampDuty + ", taxPercent=" + this.taxPercent + ", totalTax=" + this.totalTax + ")";
    }
}
