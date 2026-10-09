package com.stockbit.dto.securities;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001<B£\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010.\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010/\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u00100\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003Jª\u0001\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u00105J\u0014\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00109\u001a\u00020:HÖ\u0081\u0004J\n\u0010;\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b \u0010\u001eR\u001a\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b!\u0010\u001eR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b$\u0010\u001eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019¨\u0006="}, d2 = {"Lcom/stockbit/dto/securities/RealizedBondsDTO;", "", "productName", "", Constants.KEY_ICON, "stampDuty", "Ljava/math/BigDecimal;", "accruedInterest", "bondsPrice", "couponTaxPercentage", "sellerCoupon", "", "totalRealizedAmount", "totalRealizedAmountPercentage", "capitalGainLoss", "Lcom/stockbit/dto/securities/RealizedBondsDTO$RealizedBondsCapitalGainLossDTO;", "dailyAccruedInterest", "accruedInterestExcludeTax", "accruedInterestNett", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/stockbit/dto/securities/RealizedBondsDTO$RealizedBondsCapitalGainLossDTO;Ljava/lang/Double;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getProductName", "()Ljava/lang/String;", "getIcon", "getStampDuty", "()Ljava/math/BigDecimal;", "getAccruedInterest", "getBondsPrice", "getCouponTaxPercentage", "getSellerCoupon", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getTotalRealizedAmount", "getTotalRealizedAmountPercentage", "getCapitalGainLoss", "()Lcom/stockbit/dto/securities/RealizedBondsDTO$RealizedBondsCapitalGainLossDTO;", "getDailyAccruedInterest", "getAccruedInterestExcludeTax", "getAccruedInterestNett", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/stockbit/dto/securities/RealizedBondsDTO$RealizedBondsCapitalGainLossDTO;Ljava/lang/Double;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lcom/stockbit/dto/securities/RealizedBondsDTO;", "equals", "", "other", "hashCode", "", "toString", "RealizedBondsCapitalGainLossDTO", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RealizedBondsDTO {

    @SerializedName("accrued_interest")
    private final BigDecimal accruedInterest;

    @SerializedName("accrued_interest_exclude_tax")
    private final BigDecimal accruedInterestExcludeTax;

    @SerializedName("accrued_interest_nett")
    private final BigDecimal accruedInterestNett;

    @SerializedName("bonds_price")
    private final String bondsPrice;

    @SerializedName("capital_gain_loss")
    private final RealizedBondsCapitalGainLossDTO capitalGainLoss;

    @SerializedName("coupon_tax_percentage")
    private final String couponTaxPercentage;

    @SerializedName("daily_accrued_interest")
    private final Double dailyAccruedInterest;

    @SerializedName(Constants.KEY_ICON)
    private final String icon;

    @SerializedName("product_name")
    private final String productName;

    @SerializedName("seller_coupon")
    private final Double sellerCoupon;

    @SerializedName("stamp_duty")
    private final BigDecimal stampDuty;

    @SerializedName("total_realized_amount")
    private final Double totalRealizedAmount;

    @SerializedName("total_realized_amount_percentage")
    private final Double totalRealizedAmountPercentage;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/stockbit/dto/securities/RealizedBondsDTO$RealizedBondsCapitalGainLossDTO;", "", "amount", "", "amountNett", "amountPercentage", "amountNettPercentage", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAmountNett", "getAmountPercentage", "getAmountNettPercentage", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/stockbit/dto/securities/RealizedBondsDTO$RealizedBondsCapitalGainLossDTO;", "equals", "", "other", "hashCode", "", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RealizedBondsCapitalGainLossDTO {

        @SerializedName("amount")
        private final Double amount;

        @SerializedName("amount_nett")
        private final Double amountNett;

        @SerializedName("amount_nett_percentage")
        private final Double amountNettPercentage;

        @SerializedName("amount_percentage")
        private final Double amountPercentage;

        public RealizedBondsCapitalGainLossDTO() {
            Double r1 = null;
            Double r2 = null;
            Double r3 = null;
            Double r4 = null;
            this(r1, r2, r3, r4, 15, null);
        }

        public final Double a() {
            return this.amountNett;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof RealizedBondsCapitalGainLossDTO) == true) goto L8;
            return false;
        L8:
            RealizedBondsCapitalGainLossDTO r52 = (RealizedBondsCapitalGainLossDTO) r5;
            if (p.g(this.amount, r52.amount) == true) goto L12;
            return false;
        L12:
            if (p.g(this.amountNett, r52.amountNett) == true) goto L15;
            return false;
        L15:
            if (p.g(this.amountPercentage, r52.amountPercentage) == true) goto L18;
            return false;
        L18:
            if (p.g(this.amountNettPercentage, r52.amountNettPercentage) == true) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            Double r02 = this.amount;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            Double r2 = this.amountNett;
            if (r2 != null) goto L9;
            int r22 = 0;
        L10:
            int r05 = (r04 + r22) * 31;
            Double r23 = this.amountPercentage;
            if (r23 != null) goto L13;
            int r24 = 0;
        L14:
            int r06 = (r05 + r24) * 31;
            Double r25 = this.amountNettPercentage;
            if (r25 == null) goto L19;
            r1 = r25.hashCode();
        L19:
            return r06 + r1;
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
            return "RealizedBondsCapitalGainLossDTO(amount=" + this.amount + ", amountNett=" + this.amountNett + ", amountPercentage=" + this.amountPercentage + ", amountNettPercentage=" + this.amountNettPercentage + ")";
        }

        public RealizedBondsCapitalGainLossDTO(Double r1, Double r2, Double r3, Double r4) {
            this.amount = r1;
            this.amountNett = r2;
            this.amountPercentage = r3;
            this.amountNettPercentage = r4;
        }

        public /* synthetic */ RealizedBondsCapitalGainLossDTO(Double r2, Double r3, Double r4, Double r5, int r6, i r7) {
            if ((r6 & 1) == 0) goto L6;
            r2 = null;
        L6:
            if ((r6 & 2) == 0) goto L9;
            r3 = null;
        L9:
            if ((r6 & 4) == 0) goto L12;
            r4 = null;
        L12:
            if ((r6 & 8) == 0) goto L14;
            r5 = null;
        L14:
            this(r2, r3, r4, r5);
        }
    }

    public RealizedBondsDTO() {
        String r1 = null;
        String r2 = null;
        BigDecimal r3 = null;
        BigDecimal r4 = null;
        String r5 = null;
        String r6 = null;
        Double r7 = null;
        Double r8 = null;
        Double r9 = null;
        RealizedBondsCapitalGainLossDTO r10 = null;
        Double r11 = null;
        BigDecimal r12 = null;
        BigDecimal r13 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, 8191, null);
    }

    public final BigDecimal a() {
        return this.accruedInterest;
    }

    public final BigDecimal b() {
        return this.accruedInterestExcludeTax;
    }

    public final BigDecimal c() {
        return this.accruedInterestNett;
    }

    public final String d() {
        return this.bondsPrice;
    }

    public final RealizedBondsCapitalGainLossDTO e() {
        return this.capitalGainLoss;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof RealizedBondsDTO) == true) goto L8;
        return false;
    L8:
        RealizedBondsDTO r52 = (RealizedBondsDTO) r5;
        if (p.g(this.productName, r52.productName) == true) goto L12;
        return false;
    L12:
        if (p.g(this.icon, r52.icon) == true) goto L15;
        return false;
    L15:
        if (p.g(this.stampDuty, r52.stampDuty) == true) goto L18;
        return false;
    L18:
        if (p.g(this.accruedInterest, r52.accruedInterest) == true) goto L21;
        return false;
    L21:
        if (p.g(this.bondsPrice, r52.bondsPrice) == true) goto L24;
        return false;
    L24:
        if (p.g(this.couponTaxPercentage, r52.couponTaxPercentage) == true) goto L27;
        return false;
    L27:
        if (p.g(this.sellerCoupon, r52.sellerCoupon) == true) goto L30;
        return false;
    L30:
        if (p.g(this.totalRealizedAmount, r52.totalRealizedAmount) == true) goto L33;
        return false;
    L33:
        if (p.g(this.totalRealizedAmountPercentage, r52.totalRealizedAmountPercentage) == true) goto L36;
        return false;
    L36:
        if (p.g(this.capitalGainLoss, r52.capitalGainLoss) == true) goto L39;
        return false;
    L39:
        if (p.g(this.dailyAccruedInterest, r52.dailyAccruedInterest) == true) goto L42;
        return false;
    L42:
        if (p.g(this.accruedInterestExcludeTax, r52.accruedInterestExcludeTax) == true) goto L45;
        return false;
    L45:
        if (p.g(this.accruedInterestNett, r52.accruedInterestNett) == true) goto L47;
        return false;
    L47:
        return true;
    }

    public final String f() {
        return this.couponTaxPercentage;
    }

    public final Double g() {
        return this.dailyAccruedInterest;
    }

    public final String h() {
        return this.icon;
    }

    public int hashCode() {
        String r02 = this.productName;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.icon;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        BigDecimal r23 = this.stampDuty;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        BigDecimal r25 = this.accruedInterest;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.bondsPrice;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.couponTaxPercentage;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        Double r211 = this.sellerCoupon;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        Double r213 = this.totalRealizedAmount;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        Double r215 = this.totalRealizedAmountPercentage;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        RealizedBondsCapitalGainLossDTO r217 = this.capitalGainLoss;
        if (r217 != null) goto L41;
        int r218 = 0;
    L42:
        int r013 = (r012 + r218) * 31;
        Double r219 = this.dailyAccruedInterest;
        if (r219 != null) goto L45;
        int r220 = 0;
    L46:
        int r014 = (r013 + r220) * 31;
        BigDecimal r221 = this.accruedInterestExcludeTax;
        if (r221 != null) goto L49;
        int r222 = 0;
    L50:
        int r015 = (r014 + r222) * 31;
        BigDecimal r223 = this.accruedInterestNett;
        if (r223 == null) goto L55;
        r1 = r223.hashCode();
    L55:
        return r015 + r1;
    L49:
        r222 = r221.hashCode();
        goto L50
    L45:
        r220 = r219.hashCode();
        goto L46
    L41:
        r218 = r217.hashCode();
        goto L42
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

    public final String i() {
        return this.productName;
    }

    public final Double j() {
        return this.sellerCoupon;
    }

    public final BigDecimal k() {
        return this.stampDuty;
    }

    public final Double l() {
        return this.totalRealizedAmount;
    }

    public final Double m() {
        return this.totalRealizedAmountPercentage;
    }

    public String toString() {
        return "RealizedBondsDTO(productName=" + this.productName + ", icon=" + this.icon + ", stampDuty=" + this.stampDuty + ", accruedInterest=" + this.accruedInterest + ", bondsPrice=" + this.bondsPrice + ", couponTaxPercentage=" + this.couponTaxPercentage + ", sellerCoupon=" + this.sellerCoupon + ", totalRealizedAmount=" + this.totalRealizedAmount + ", totalRealizedAmountPercentage=" + this.totalRealizedAmountPercentage + ", capitalGainLoss=" + this.capitalGainLoss + ", dailyAccruedInterest=" + this.dailyAccruedInterest + ", accruedInterestExcludeTax=" + this.accruedInterestExcludeTax + ", accruedInterestNett=" + this.accruedInterestNett + ")";
    }

    public RealizedBondsDTO(String r1, String r2, BigDecimal r3, BigDecimal r4, String r5, String r6, Double r7, Double r8, Double r9, RealizedBondsCapitalGainLossDTO r10, Double r11, BigDecimal r12, BigDecimal r13) {
        this.productName = r1;
        this.icon = r2;
        this.stampDuty = r3;
        this.accruedInterest = r4;
        this.bondsPrice = r5;
        this.couponTaxPercentage = r6;
        this.sellerCoupon = r7;
        this.totalRealizedAmount = r8;
        this.totalRealizedAmountPercentage = r9;
        this.capitalGainLoss = r10;
        this.dailyAccruedInterest = r11;
        this.accruedInterestExcludeTax = r12;
        this.accruedInterestNett = r13;
    }

    public /* synthetic */ RealizedBondsDTO(String r14, String r15, BigDecimal r16, BigDecimal r17, String r18, String r19, Double r20, Double r21, Double r22, RealizedBondsCapitalGainLossDTO r23, Double r24, BigDecimal r25, BigDecimal r26, int r27, i r28) {
        if ((r27 & 1) == 0) goto L6;
        r14 = null;
    L6:
        if ((r27 & 2) == 0) goto L8;
        String r1 = null;
    L10:
        if ((r27 & 4) == 0) goto L12;
        BigDecimal r3 = null;
    L14:
        if ((r27 & 8) == 0) goto L16;
        BigDecimal r4 = null;
    L18:
        if ((r27 & 16) == 0) goto L20;
        String r5 = null;
    L22:
        if ((r27 & 32) == 0) goto L24;
        String r6 = null;
    L26:
        if ((r27 & 64) == 0) goto L28;
        Double r7 = null;
    L30:
        if ((r27 & 128) == 0) goto L32;
        Double r8 = null;
    L34:
        if ((r27 & 256) == 0) goto L36;
        Double r9 = null;
    L38:
        if ((r27 & 512) == 0) goto L40;
        RealizedBondsCapitalGainLossDTO r10 = null;
    L42:
        if ((r27 & 1024) == 0) goto L44;
        Double r11 = null;
    L46:
        if ((r27 & 2048) == 0) goto L48;
        BigDecimal r12 = null;
    L50:
        if ((r27 & 4096) == 0) goto L53;
        BigDecimal r272 = null;
    L54:
        this(r14, r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r272);
        return;
    L53:
        r272 = r26;
        goto L54
    L48:
        r12 = r25;
        goto L50
    L44:
        r11 = r24;
        goto L46
    L40:
        r10 = r23;
        goto L42
    L36:
        r9 = r22;
        goto L38
    L32:
        r8 = r21;
        goto L34
    L28:
        r7 = r20;
        goto L30
    L24:
        r6 = r19;
        goto L26
    L20:
        r5 = r18;
        goto L22
    L16:
        r4 = r17;
        goto L18
    L12:
        r3 = r16;
        goto L14
    L8:
        r1 = r15;
        goto L10
    }
}
