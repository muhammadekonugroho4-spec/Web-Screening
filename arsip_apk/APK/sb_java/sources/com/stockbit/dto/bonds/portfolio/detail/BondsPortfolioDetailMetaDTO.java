package com.stockbit.dto.bonds.portfolio.detail;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0005HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/stockbit/dto/bonds/portfolio/detail/BondsPortfolioDetailMetaDTO;", "", "couponRate", "", "maturityDate", "", "nextCouponDate", "sellPriceRate", "<init>", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "getCouponRate", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMaturityDate", "()Ljava/lang/String;", "getNextCouponDate", "getSellPriceRate", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)Lcom/stockbit/dto/bonds/portfolio/detail/BondsPortfolioDetailMetaDTO;", "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BondsPortfolioDetailMetaDTO {

    @SerializedName("coupon_rate")
    private final Double couponRate;

    @SerializedName("maturity_date")
    private final String maturityDate;

    @SerializedName("next_coupon_date")
    private final String nextCouponDate;

    @SerializedName("sell_price_rate")
    private final Double sellPriceRate;

    public BondsPortfolioDetailMetaDTO() {
        Double r1 = null;
        String r2 = null;
        String r3 = null;
        Double r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public final Double a() {
        return this.couponRate;
    }

    public final String b() {
        return this.maturityDate;
    }

    public final String c() {
        return this.nextCouponDate;
    }

    public final Double d() {
        return this.sellPriceRate;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BondsPortfolioDetailMetaDTO) == true) goto L8;
        return false;
    L8:
        BondsPortfolioDetailMetaDTO r52 = (BondsPortfolioDetailMetaDTO) r5;
        if (p.g(this.couponRate, r52.couponRate) == true) goto L12;
        return false;
    L12:
        if (p.g(this.maturityDate, r52.maturityDate) == true) goto L15;
        return false;
    L15:
        if (p.g(this.nextCouponDate, r52.nextCouponDate) == true) goto L18;
        return false;
    L18:
        if (p.g(this.sellPriceRate, r52.sellPriceRate) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        Double r02 = this.couponRate;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.maturityDate;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.nextCouponDate;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Double r25 = this.sellPriceRate;
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
        return "BondsPortfolioDetailMetaDTO(couponRate=" + this.couponRate + ", maturityDate=" + this.maturityDate + ", nextCouponDate=" + this.nextCouponDate + ", sellPriceRate=" + this.sellPriceRate + ")";
    }

    public BondsPortfolioDetailMetaDTO(Double r1, String r2, String r3, Double r4) {
        this.couponRate = r1;
        this.maturityDate = r2;
        this.nextCouponDate = r3;
        this.sellPriceRate = r4;
    }

    public /* synthetic */ BondsPortfolioDetailMetaDTO(Double r2, String r3, String r4, Double r5, int r6, i r7) {
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
