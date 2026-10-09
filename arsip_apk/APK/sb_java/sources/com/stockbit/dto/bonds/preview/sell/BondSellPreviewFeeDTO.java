package com.stockbit.dto.bonds.preview.sell;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJV\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010!J\u0014\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010%\u001a\u00020&HÖ\u0081\u0004J\n\u0010'\u001a\u00020(HÖ\u0081\u0004R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\"\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000e¨\u0006)"}, d2 = {"Lcom/stockbit/dto/bonds/preview/sell/BondSellPreviewFeeDTO;", "", "accruedInterestTax", "", "capitalGainTax", "commissionFee", "stampDuty", "taxPercent", "totalTax", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getAccruedInterestTax", "()Ljava/lang/Double;", "setAccruedInterestTax", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getCapitalGainTax", "setCapitalGainTax", "getCommissionFee", "setCommissionFee", "getStampDuty", "setStampDuty", "getTaxPercent", "setTaxPercent", "getTotalTax", "setTotalTax", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/stockbit/dto/bonds/preview/sell/BondSellPreviewFeeDTO;", "equals", "", "other", "hashCode", "", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BondSellPreviewFeeDTO {

    @SerializedName("accrued_interest_tax")
    private Double accruedInterestTax;

    @SerializedName("capital_gain_tax")
    private Double capitalGainTax;

    @SerializedName("commission_fee")
    private Double commissionFee;

    @SerializedName("stamp_duty")
    private Double stampDuty;

    @SerializedName("tax_percent")
    private Double taxPercent;

    @SerializedName("total_tax")
    private Double totalTax;

    public BondSellPreviewFeeDTO() {
        Double r1 = null;
        Double r2 = null;
        Double r3 = null;
        Double r4 = null;
        Double r5 = null;
        Double r6 = null;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    public final Double a() {
        return this.stampDuty;
    }

    public final Double b() {
        return this.totalTax;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BondSellPreviewFeeDTO) == true) goto L8;
        return false;
    L8:
        BondSellPreviewFeeDTO r52 = (BondSellPreviewFeeDTO) r5;
        if (p.g(this.accruedInterestTax, r52.accruedInterestTax) == true) goto L12;
        return false;
    L12:
        if (p.g(this.capitalGainTax, r52.capitalGainTax) == true) goto L15;
        return false;
    L15:
        if (p.g(this.commissionFee, r52.commissionFee) == true) goto L18;
        return false;
    L18:
        if (p.g(this.stampDuty, r52.stampDuty) == true) goto L21;
        return false;
    L21:
        if (p.g(this.taxPercent, r52.taxPercent) == true) goto L24;
        return false;
    L24:
        if (p.g(this.totalTax, r52.totalTax) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        Double r02 = this.accruedInterestTax;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Double r2 = this.capitalGainTax;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Double r23 = this.commissionFee;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Double r25 = this.stampDuty;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        Double r27 = this.taxPercent;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        Double r29 = this.totalTax;
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
        return "BondSellPreviewFeeDTO(accruedInterestTax=" + this.accruedInterestTax + ", capitalGainTax=" + this.capitalGainTax + ", commissionFee=" + this.commissionFee + ", stampDuty=" + this.stampDuty + ", taxPercent=" + this.taxPercent + ", totalTax=" + this.totalTax + ")";
    }

    public BondSellPreviewFeeDTO(Double r1, Double r2, Double r3, Double r4, Double r5, Double r6) {
        this.accruedInterestTax = r1;
        this.capitalGainTax = r2;
        this.commissionFee = r3;
        this.stampDuty = r4;
        this.taxPercent = r5;
        this.totalTax = r6;
    }

    public /* synthetic */ BondSellPreviewFeeDTO(Double r2, Double r3, Double r4, Double r5, Double r6, Double r7, int r8, i r9) {
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
        Double r82 = null;
    L20:
        Double r72 = r6;
        Double r62 = r5;
        Double r52 = r4;
        this(r2, r3, r52, r62, r72, r82);
        return;
    L21:
        r82 = r7;
        goto L20
    }
}
