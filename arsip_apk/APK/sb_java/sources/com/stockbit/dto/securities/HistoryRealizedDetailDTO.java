package com.stockbit.dto.securities;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.net.HttpHeaders;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.scheduling.WorkQueueKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0007 !\"#$%&B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, d2 = {"Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO;", "", "bondRealized", "Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$BondRealized;", "couponRealized", "Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$CouponRealized;", "dividendRealized", "Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$DividendRealized;", "stockRealized", "Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$StockRealized;", "<init>", "(Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$BondRealized;Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$CouponRealized;Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$DividendRealized;Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$StockRealized;)V", "getBondRealized", "()Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$BondRealized;", "getCouponRealized", "()Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$CouponRealized;", "getDividendRealized", "()Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$DividendRealized;", "getStockRealized", "()Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$StockRealized;", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", HttpHeaders.DATE, "Nett", "Price", "BondRealized", "CouponRealized", "DividendRealized", "StockRealized", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HistoryRealizedDetailDTO {

    @SerializedName("bond_realized")
    private final BondRealized bondRealized;

    @SerializedName("coupon_realized")
    private final CouponRealized couponRealized;

    @SerializedName("dividend_realized")
    private final DividendRealized dividendRealized;

    @SerializedName("stock_realized")
    private final StockRealized stockRealized;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$BondRealized;", "", "detail", "Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$BondRealized$Detail;", "<init>", "(Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$BondRealized$Detail;)V", "getDetail", "()Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$BondRealized$Detail;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "Detail", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BondRealized {

        @SerializedName("detail")
        private final Detail detail;

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u00019B\u0097\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0099\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0014\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00106\u001a\u000207HÖ\u0081\u0004J\n\u00108\u001a\u00020\u000bHÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001e¨\u0006:"}, d2 = {"Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$BondRealized$Detail;", "", "accruedInterest", "Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$BondRealized$Detail$AccruedInterest;", "amountNett", "Ljava/math/BigDecimal;", "bondTax", "capitalGainLossNett", Constants.KEY_DATE, "Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Date;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "profitLossNett", "Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Nett;", "sell", "sellerCoupon", "stampDuty", "totalRealizedNett", "units", "<init>", "(Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$BondRealized$Detail$AccruedInterest;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Date;Ljava/lang/String;Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Nett;Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Nett;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Nett;Ljava/lang/String;)V", "getAccruedInterest", "()Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$BondRealized$Detail$AccruedInterest;", "getAmountNett", "()Ljava/math/BigDecimal;", "getBondTax", "getCapitalGainLossNett", "getDate", "()Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Date;", "getName", "()Ljava/lang/String;", "getProfitLossNett", "()Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Nett;", "getSell", "getSellerCoupon", "getStampDuty", "getTotalRealizedNett", "getUnits", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "AccruedInterest", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Detail {

            @SerializedName("accrued_interest")
            private final AccruedInterest accruedInterest;

            @SerializedName("amount_nett")
            private final BigDecimal amountNett;

            @SerializedName("bond_tax")
            private final BigDecimal bondTax;

            @SerializedName("capital_gain_loss_nett")
            private final BigDecimal capitalGainLossNett;

            @SerializedName(Constants.KEY_DATE)
            private final Date date;

            @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
            private final String name;

            @SerializedName("profit_loss_nett")
            private final Nett profitLossNett;

            @SerializedName("sell")
            private final Nett sell;

            @SerializedName("seller_coupon")
            private final BigDecimal sellerCoupon;

            @SerializedName("stamp_duty")
            private final BigDecimal stampDuty;

            @SerializedName("total_realized_nett")
            private final Nett totalRealizedNett;

            @SerializedName("units")
            private final String units;

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$BondRealized$Detail$AccruedInterest;", "", "amount", "Ljava/math/BigDecimal;", "amountExcludeTax", "amountNett", "dailyAmountNett", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getAmount", "()Ljava/math/BigDecimal;", "getAmountExcludeTax", "getAmountNett", "getDailyAmountNett", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class AccruedInterest {

                @SerializedName("amount")
                private final BigDecimal amount;

                @SerializedName("amount_exclude_tax")
                private final BigDecimal amountExcludeTax;

                @SerializedName("amount_nett")
                private final BigDecimal amountNett;

                @SerializedName("daily_amount_nett")
                private final BigDecimal dailyAmountNett;

                public AccruedInterest() {
                    BigDecimal r1 = null;
                    BigDecimal r2 = null;
                    BigDecimal r3 = null;
                    BigDecimal r4 = null;
                    this(r1, r2, r3, r4, 15, null);
                }

                public final BigDecimal a() {
                    return this.amount;
                }

                public final BigDecimal b() {
                    return this.amountExcludeTax;
                }

                public final BigDecimal c() {
                    return this.amountNett;
                }

                public final BigDecimal d() {
                    return this.dailyAmountNett;
                }

                public boolean equals(Object r5) {
                    if (this != r5) goto L6;
                    return true;
                L6:
                    if ((r5 instanceof AccruedInterest) == true) goto L8;
                    return false;
                L8:
                    AccruedInterest r52 = (AccruedInterest) r5;
                    if (p.g(this.amount, r52.amount) == true) goto L12;
                    return false;
                L12:
                    if (p.g(this.amountExcludeTax, r52.amountExcludeTax) == true) goto L15;
                    return false;
                L15:
                    if (p.g(this.amountNett, r52.amountNett) == true) goto L18;
                    return false;
                L18:
                    if (p.g(this.dailyAmountNett, r52.dailyAmountNett) == true) goto L20;
                    return false;
                L20:
                    return true;
                }

                public int hashCode() {
                    BigDecimal r02 = this.amount;
                    int r1 = 0;
                    if (r02 != null) goto L5;
                    int r03 = 0;
                L6:
                    int r04 = r03 * 31;
                    BigDecimal r2 = this.amountExcludeTax;
                    if (r2 != null) goto L9;
                    int r22 = 0;
                L10:
                    int r05 = (r04 + r22) * 31;
                    BigDecimal r23 = this.amountNett;
                    if (r23 != null) goto L13;
                    int r24 = 0;
                L14:
                    int r06 = (r05 + r24) * 31;
                    BigDecimal r25 = this.dailyAmountNett;
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
                    return "AccruedInterest(amount=" + this.amount + ", amountExcludeTax=" + this.amountExcludeTax + ", amountNett=" + this.amountNett + ", dailyAmountNett=" + this.dailyAmountNett + ")";
                }

                public AccruedInterest(BigDecimal r1, BigDecimal r2, BigDecimal r3, BigDecimal r4) {
                    this.amount = r1;
                    this.amountExcludeTax = r2;
                    this.amountNett = r3;
                    this.dailyAmountNett = r4;
                }

                public /* synthetic */ AccruedInterest(BigDecimal r2, BigDecimal r3, BigDecimal r4, BigDecimal r5, int r6, i r7) {
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

            public Detail() {
                AccruedInterest r1 = null;
                BigDecimal r2 = null;
                BigDecimal r3 = null;
                BigDecimal r4 = null;
                Date r5 = null;
                String r6 = null;
                Nett r7 = null;
                Nett r8 = null;
                BigDecimal r9 = null;
                BigDecimal r10 = null;
                Nett r11 = null;
                String r12 = null;
                this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, 4095, null);
            }

            public final AccruedInterest a() {
                return this.accruedInterest;
            }

            public final BigDecimal b() {
                return this.amountNett;
            }

            public final BigDecimal c() {
                return this.bondTax;
            }

            public final BigDecimal d() {
                return this.capitalGainLossNett;
            }

            public final Date e() {
                return this.date;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof Detail) == true) goto L8;
                return false;
            L8:
                Detail r52 = (Detail) r5;
                if (p.g(this.accruedInterest, r52.accruedInterest) == true) goto L12;
                return false;
            L12:
                if (p.g(this.amountNett, r52.amountNett) == true) goto L15;
                return false;
            L15:
                if (p.g(this.bondTax, r52.bondTax) == true) goto L18;
                return false;
            L18:
                if (p.g(this.capitalGainLossNett, r52.capitalGainLossNett) == true) goto L21;
                return false;
            L21:
                if (p.g(this.date, r52.date) == true) goto L24;
                return false;
            L24:
                if (p.g(this.name, r52.name) == true) goto L27;
                return false;
            L27:
                if (p.g(this.profitLossNett, r52.profitLossNett) == true) goto L30;
                return false;
            L30:
                if (p.g(this.sell, r52.sell) == true) goto L33;
                return false;
            L33:
                if (p.g(this.sellerCoupon, r52.sellerCoupon) == true) goto L36;
                return false;
            L36:
                if (p.g(this.stampDuty, r52.stampDuty) == true) goto L39;
                return false;
            L39:
                if (p.g(this.totalRealizedNett, r52.totalRealizedNett) == true) goto L42;
                return false;
            L42:
                if (p.g(this.units, r52.units) == true) goto L44;
                return false;
            L44:
                return true;
            }

            public final String f() {
                return this.name;
            }

            public final Nett g() {
                return this.profitLossNett;
            }

            public final Nett h() {
                return this.sell;
            }

            public int hashCode() {
                AccruedInterest r02 = this.accruedInterest;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                BigDecimal r2 = this.amountNett;
                if (r2 != null) goto L9;
                int r22 = 0;
            L10:
                int r05 = (r04 + r22) * 31;
                BigDecimal r23 = this.bondTax;
                if (r23 != null) goto L13;
                int r24 = 0;
            L14:
                int r06 = (r05 + r24) * 31;
                BigDecimal r25 = this.capitalGainLossNett;
                if (r25 != null) goto L17;
                int r26 = 0;
            L18:
                int r07 = (r06 + r26) * 31;
                Date r27 = this.date;
                if (r27 != null) goto L21;
                int r28 = 0;
            L22:
                int r08 = (r07 + r28) * 31;
                String r29 = this.name;
                if (r29 != null) goto L25;
                int r210 = 0;
            L26:
                int r09 = (r08 + r210) * 31;
                Nett r211 = this.profitLossNett;
                if (r211 != null) goto L29;
                int r212 = 0;
            L30:
                int r010 = (r09 + r212) * 31;
                Nett r213 = this.sell;
                if (r213 != null) goto L33;
                int r214 = 0;
            L34:
                int r011 = (r010 + r214) * 31;
                BigDecimal r215 = this.sellerCoupon;
                if (r215 != null) goto L37;
                int r216 = 0;
            L38:
                int r012 = (r011 + r216) * 31;
                BigDecimal r217 = this.stampDuty;
                if (r217 != null) goto L41;
                int r218 = 0;
            L42:
                int r013 = (r012 + r218) * 31;
                Nett r219 = this.totalRealizedNett;
                if (r219 != null) goto L45;
                int r220 = 0;
            L46:
                int r014 = (r013 + r220) * 31;
                String r221 = this.units;
                if (r221 == null) goto L51;
                r1 = r221.hashCode();
            L51:
                return r014 + r1;
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

            public final BigDecimal i() {
                return this.sellerCoupon;
            }

            public final BigDecimal j() {
                return this.stampDuty;
            }

            public final Nett k() {
                return this.totalRealizedNett;
            }

            public final String l() {
                return this.units;
            }

            public String toString() {
                return "Detail(accruedInterest=" + this.accruedInterest + ", amountNett=" + this.amountNett + ", bondTax=" + this.bondTax + ", capitalGainLossNett=" + this.capitalGainLossNett + ", date=" + this.date + ", name=" + this.name + ", profitLossNett=" + this.profitLossNett + ", sell=" + this.sell + ", sellerCoupon=" + this.sellerCoupon + ", stampDuty=" + this.stampDuty + ", totalRealizedNett=" + this.totalRealizedNett + ", units=" + this.units + ")";
            }

            public Detail(AccruedInterest r1, BigDecimal r2, BigDecimal r3, BigDecimal r4, Date r5, String r6, Nett r7, Nett r8, BigDecimal r9, BigDecimal r10, Nett r11, String r12) {
                this.accruedInterest = r1;
                this.amountNett = r2;
                this.bondTax = r3;
                this.capitalGainLossNett = r4;
                this.date = r5;
                this.name = r6;
                this.profitLossNett = r7;
                this.sell = r8;
                this.sellerCoupon = r9;
                this.stampDuty = r10;
                this.totalRealizedNett = r11;
                this.units = r12;
            }

            public /* synthetic */ Detail(AccruedInterest r2, BigDecimal r3, BigDecimal r4, BigDecimal r5, Date r6, String r7, Nett r8, Nett r9, BigDecimal r10, BigDecimal r11, Nett r12, String r13, int r14, i r15) {
                if ((r14 & 1) == 0) goto L6;
                r2 = null;
            L6:
                if ((r14 & 2) == 0) goto L9;
                r3 = null;
            L9:
                if ((r14 & 4) == 0) goto L12;
                r4 = null;
            L12:
                if ((r14 & 8) == 0) goto L15;
                r5 = null;
            L15:
                if ((r14 & 16) == 0) goto L18;
                r6 = null;
            L18:
                if ((r14 & 32) == 0) goto L21;
                r7 = null;
            L21:
                if ((r14 & 64) == 0) goto L24;
                r8 = null;
            L24:
                if ((r14 & 128) == 0) goto L27;
                r9 = null;
            L27:
                if ((r14 & 256) == 0) goto L30;
                r10 = null;
            L30:
                if ((r14 & 512) == 0) goto L33;
                r11 = null;
            L33:
                if ((r14 & 1024) == 0) goto L36;
                r12 = null;
            L36:
                if ((r14 & 2048) == 0) goto L39;
                String r142 = null;
            L38:
                Nett r132 = r12;
                BigDecimal r122 = r11;
                BigDecimal r112 = r10;
                Nett r102 = r9;
                Nett r92 = r8;
                String r82 = r7;
                Date r72 = r6;
                BigDecimal r62 = r5;
                BigDecimal r52 = r4;
                this(r2, r3, r52, r62, r72, r82, r92, r102, r112, r122, r132, r142);
                return;
            L39:
                r142 = r13;
                goto L38
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BondRealized() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final Detail a() {
            return this.detail;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof BondRealized) == true) goto L9;
            return false;
        L9:
            if (p.g(this.detail, ((BondRealized) r4).detail) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            Detail r02 = this.detail;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "BondRealized(detail=" + this.detail + ")";
        }

        public BondRealized(Detail r1) {
            this.detail = r1;
        }

        public /* synthetic */ BondRealized(Detail r1, int r2, i r3) {
            if ((r2 & 1) == 0) goto L5;
            r1 = null;
        L5:
            this(r1);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$CouponRealized;", "", "detail", "Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$CouponRealized$Detail;", "<init>", "(Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$CouponRealized$Detail;)V", "getDetail", "()Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$CouponRealized$Detail;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "Detail", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CouponRealized {

        @SerializedName("detail")
        private final Detail detail;

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010#\u001a\u00020$HÖ\u0081\u0004J\n\u0010%\u001a\u00020\u0006HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006&"}, d2 = {"Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$CouponRealized$Detail;", "", "amount", "Ljava/math/BigDecimal;", "amountNett", "couponRate", "", "couponTax", Constants.KEY_DATE, "Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Date;", AppMeasurementSdk.ConditionalUserProperty.NAME, "shares", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Date;Ljava/lang/String;Ljava/math/BigDecimal;)V", "getAmount", "()Ljava/math/BigDecimal;", "getAmountNett", "getCouponRate", "()Ljava/lang/String;", "getCouponTax", "getDate", "()Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Date;", "getName", "getShares", "component1", "component2", "component3", "component4", "component5", "component6", "component7", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Detail {

            @SerializedName("amount")
            private final BigDecimal amount;

            @SerializedName("amount_nett")
            private final BigDecimal amountNett;

            @SerializedName("coupon_rate")
            private final String couponRate;

            @SerializedName("coupon_tax")
            private final BigDecimal couponTax;

            @SerializedName(Constants.KEY_DATE)
            private final Date date;

            @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
            private final String name;

            @SerializedName("shares")
            private final BigDecimal shares;

            public Detail() {
                BigDecimal r1 = null;
                BigDecimal r2 = null;
                String r3 = null;
                BigDecimal r4 = null;
                Date r5 = null;
                String r6 = null;
                BigDecimal r7 = null;
                this(r1, r2, r3, r4, r5, r6, r7, WorkQueueKt.MASK, null);
            }

            public final BigDecimal a() {
                return this.amount;
            }

            public final BigDecimal b() {
                return this.amountNett;
            }

            public final String c() {
                return this.couponRate;
            }

            public final BigDecimal d() {
                return this.couponTax;
            }

            public final Date e() {
                return this.date;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof Detail) == true) goto L8;
                return false;
            L8:
                Detail r52 = (Detail) r5;
                if (p.g(this.amount, r52.amount) == true) goto L12;
                return false;
            L12:
                if (p.g(this.amountNett, r52.amountNett) == true) goto L15;
                return false;
            L15:
                if (p.g(this.couponRate, r52.couponRate) == true) goto L18;
                return false;
            L18:
                if (p.g(this.couponTax, r52.couponTax) == true) goto L21;
                return false;
            L21:
                if (p.g(this.date, r52.date) == true) goto L24;
                return false;
            L24:
                if (p.g(this.name, r52.name) == true) goto L27;
                return false;
            L27:
                if (p.g(this.shares, r52.shares) == true) goto L29;
                return false;
            L29:
                return true;
            }

            public final String f() {
                return this.name;
            }

            public final BigDecimal g() {
                return this.shares;
            }

            public int hashCode() {
                BigDecimal r02 = this.amount;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                BigDecimal r2 = this.amountNett;
                if (r2 != null) goto L9;
                int r22 = 0;
            L10:
                int r05 = (r04 + r22) * 31;
                String r23 = this.couponRate;
                if (r23 != null) goto L13;
                int r24 = 0;
            L14:
                int r06 = (r05 + r24) * 31;
                BigDecimal r25 = this.couponTax;
                if (r25 != null) goto L17;
                int r26 = 0;
            L18:
                int r07 = (r06 + r26) * 31;
                Date r27 = this.date;
                if (r27 != null) goto L21;
                int r28 = 0;
            L22:
                int r08 = (r07 + r28) * 31;
                String r29 = this.name;
                if (r29 != null) goto L25;
                int r210 = 0;
            L26:
                int r09 = (r08 + r210) * 31;
                BigDecimal r211 = this.shares;
                if (r211 == null) goto L31;
                r1 = r211.hashCode();
            L31:
                return r09 + r1;
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
                return "Detail(amount=" + this.amount + ", amountNett=" + this.amountNett + ", couponRate=" + this.couponRate + ", couponTax=" + this.couponTax + ", date=" + this.date + ", name=" + this.name + ", shares=" + this.shares + ")";
            }

            public Detail(BigDecimal r1, BigDecimal r2, String r3, BigDecimal r4, Date r5, String r6, BigDecimal r7) {
                this.amount = r1;
                this.amountNett = r2;
                this.couponRate = r3;
                this.couponTax = r4;
                this.date = r5;
                this.name = r6;
                this.shares = r7;
            }

            public /* synthetic */ Detail(BigDecimal r2, BigDecimal r3, String r4, BigDecimal r5, Date r6, String r7, BigDecimal r8, int r9, i r10) {
                if ((r9 & 1) == 0) goto L6;
                r2 = null;
            L6:
                if ((r9 & 2) == 0) goto L9;
                r3 = null;
            L9:
                if ((r9 & 4) == 0) goto L12;
                r4 = null;
            L12:
                if ((r9 & 8) == 0) goto L15;
                r5 = null;
            L15:
                if ((r9 & 16) == 0) goto L18;
                r6 = null;
            L18:
                if ((r9 & 32) == 0) goto L21;
                r7 = null;
            L21:
                if ((r9 & 64) == 0) goto L24;
                BigDecimal r92 = null;
            L23:
                String r82 = r7;
                Date r72 = r6;
                BigDecimal r62 = r5;
                String r52 = r4;
                this(r2, r3, r52, r62, r72, r82, r92);
                return;
            L24:
                r92 = r8;
                goto L23
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CouponRealized() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final Detail a() {
            return this.detail;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof CouponRealized) == true) goto L9;
            return false;
        L9:
            if (p.g(this.detail, ((CouponRealized) r4).detail) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            Detail r02 = this.detail;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "CouponRealized(detail=" + this.detail + ")";
        }

        public CouponRealized(Detail r1) {
            this.detail = r1;
        }

        public /* synthetic */ CouponRealized(Detail r1, int r2, i r3) {
            if ((r2 & 1) == 0) goto L5;
            r1 = null;
        L5:
            this(r1);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Date;", "", "day", "", "month", "year", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getDay", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMonth", "getYear", "component1", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Date;", "equals", "", "other", "hashCode", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Date {

        @SerializedName("day")
        private final Integer day;

        @SerializedName("month")
        private final Integer month;

        @SerializedName("year")
        private final Integer year;

        public Date() {
            Integer r1 = null;
            Integer r2 = null;
            Integer r3 = null;
            this(r1, r2, r3, 7, null);
        }

        public final Integer a() {
            return this.day;
        }

        public final Integer b() {
            return this.month;
        }

        public final Integer c() {
            return this.year;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof Date) == true) goto L8;
            return false;
        L8:
            Date r52 = (Date) r5;
            if (p.g(this.day, r52.day) == true) goto L12;
            return false;
        L12:
            if (p.g(this.month, r52.month) == true) goto L15;
            return false;
        L15:
            if (p.g(this.year, r52.year) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            Integer r02 = this.day;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            Integer r2 = this.month;
            if (r2 != null) goto L9;
            int r22 = 0;
        L10:
            int r05 = (r04 + r22) * 31;
            Integer r23 = this.year;
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
            return "Date(day=" + this.day + ", month=" + this.month + ", year=" + this.year + ")";
        }

        public Date(Integer r1, Integer r2, Integer r3) {
            this.day = r1;
            this.month = r2;
            this.year = r3;
        }

        public /* synthetic */ Date(Integer r2, Integer r3, Integer r4, int r5, i r6) {
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$DividendRealized;", "", "detail", "Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$DividendRealized$Detail;", "<init>", "(Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$DividendRealized$Detail;)V", "getDetail", "()Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$DividendRealized$Detail;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "Detail", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DividendRealized {

        @SerializedName("detail")
        private final Detail detail;

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\bHÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006 "}, d2 = {"Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$DividendRealized$Detail;", "", "amount", "Ljava/math/BigDecimal;", Constants.KEY_DATE, "Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Date;", "dividendPerShares", "shares", "", "type", "<init>", "(Ljava/math/BigDecimal;Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Date;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/math/BigDecimal;", "getDate", "()Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Date;", "getDividendPerShares", "getShares", "()Ljava/lang/String;", "getType", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Detail {

            @SerializedName("amount")
            private final BigDecimal amount;

            @SerializedName(Constants.KEY_DATE)
            private final Date date;

            @SerializedName("dividend_per_shares")
            private final BigDecimal dividendPerShares;

            @SerializedName("shares")
            private final String shares;

            @SerializedName("type")
            private final String type;

            public Detail() {
                BigDecimal r1 = null;
                Date r2 = null;
                BigDecimal r3 = null;
                String r4 = null;
                String r5 = null;
                this(r1, r2, r3, r4, r5, 31, null);
            }

            public final BigDecimal a() {
                return this.amount;
            }

            public final Date b() {
                return this.date;
            }

            public final BigDecimal c() {
                return this.dividendPerShares;
            }

            public final String d() {
                return this.shares;
            }

            public final String e() {
                return this.type;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof Detail) == true) goto L8;
                return false;
            L8:
                Detail r52 = (Detail) r5;
                if (p.g(this.amount, r52.amount) == true) goto L12;
                return false;
            L12:
                if (p.g(this.date, r52.date) == true) goto L15;
                return false;
            L15:
                if (p.g(this.dividendPerShares, r52.dividendPerShares) == true) goto L18;
                return false;
            L18:
                if (p.g(this.shares, r52.shares) == true) goto L21;
                return false;
            L21:
                if (p.g(this.type, r52.type) == true) goto L23;
                return false;
            L23:
                return true;
            }

            public int hashCode() {
                BigDecimal r02 = this.amount;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                Date r2 = this.date;
                if (r2 != null) goto L9;
                int r22 = 0;
            L10:
                int r05 = (r04 + r22) * 31;
                BigDecimal r23 = this.dividendPerShares;
                if (r23 != null) goto L13;
                int r24 = 0;
            L14:
                int r06 = (r05 + r24) * 31;
                String r25 = this.shares;
                if (r25 != null) goto L17;
                int r26 = 0;
            L18:
                int r07 = (r06 + r26) * 31;
                String r27 = this.type;
                if (r27 == null) goto L23;
                r1 = r27.hashCode();
            L23:
                return r07 + r1;
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
                return "Detail(amount=" + this.amount + ", date=" + this.date + ", dividendPerShares=" + this.dividendPerShares + ", shares=" + this.shares + ", type=" + this.type + ")";
            }

            public Detail(BigDecimal r1, Date r2, BigDecimal r3, String r4, String r5) {
                this.amount = r1;
                this.date = r2;
                this.dividendPerShares = r3;
                this.shares = r4;
                this.type = r5;
            }

            public /* synthetic */ Detail(BigDecimal r2, Date r3, BigDecimal r4, String r5, String r6, int r7, i r8) {
                if ((r7 & 1) == 0) goto L6;
                r2 = null;
            L6:
                if ((r7 & 2) == 0) goto L9;
                r3 = null;
            L9:
                if ((r7 & 4) == 0) goto L12;
                r4 = null;
            L12:
                if ((r7 & 8) == 0) goto L15;
                r5 = null;
            L15:
                if ((r7 & 16) == 0) goto L18;
                String r72 = null;
            L17:
                String r62 = r5;
                BigDecimal r52 = r4;
                this(r2, r3, r52, r62, r72);
                return;
            L18:
                r72 = r6;
                goto L17
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DividendRealized() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final Detail a() {
            return this.detail;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof DividendRealized) == true) goto L9;
            return false;
        L9:
            if (p.g(this.detail, ((DividendRealized) r4).detail) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            Detail r02 = this.detail;
            if (r02 != null) goto L7;
            return 0;
        L7:
            return r02.hashCode();
        }

        public String toString() {
            return "DividendRealized(detail=" + this.detail + ")";
        }

        public DividendRealized(Detail r1) {
            this.detail = r1;
        }

        public /* synthetic */ DividendRealized(Detail r1, int r2, i r3) {
            if ((r2 & 1) == 0) goto L5;
            r1 = null;
        L5:
            this(r1);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Nett;", "", "amount", "Ljava/math/BigDecimal;", "percentage", "", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/Double;)V", "getAmount", "()Ljava/math/BigDecimal;", "getPercentage", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", Constants.COPY_TYPE, "(Ljava/math/BigDecimal;Ljava/lang/Double;)Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Nett;", "equals", "", "other", "hashCode", "", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Nett {

        @SerializedName("amount")
        private final BigDecimal amount;

        @SerializedName(alternate = {"price_percentage"}, value = "percentage")
        private final Double percentage;

        /* JADX WARN: Multi-variable type inference failed */
        public Nett() {
            Object[] r02 = 0 == true ? 1 : 0;
            this(null, r02, 3, 0 == true ? 1 : 0);
        }

        public final BigDecimal a() {
            return this.amount;
        }

        public final Double b() {
            return this.percentage;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof Nett) == true) goto L8;
            return false;
        L8:
            Nett r52 = (Nett) r5;
            if (p.g(this.amount, r52.amount) == true) goto L12;
            return false;
        L12:
            if (p.g(this.percentage, r52.percentage) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            BigDecimal r02 = this.amount;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            Double r2 = this.percentage;
            if (r2 == null) goto L11;
            r1 = r2.hashCode();
        L11:
            return r04 + r1;
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "Nett(amount=" + this.amount + ", percentage=" + this.percentage + ")";
        }

        public Nett(BigDecimal r1, Double r2) {
            this.amount = r1;
            this.percentage = r2;
        }

        public /* synthetic */ Nett(BigDecimal r2, Double r3, int r4, i r5) {
            if ((r4 & 1) == 0) goto L6;
            r2 = null;
        L6:
            if ((r4 & 2) == 0) goto L8;
            r3 = null;
        L8:
            this(r2, r3);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Price;", "", "buy", "Ljava/math/BigDecimal;", "sell", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getBuy", "()Ljava/math/BigDecimal;", "getSell", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Price {

        @SerializedName("buy")
        private final BigDecimal buy;

        @SerializedName("sell")
        private final BigDecimal sell;

        /* JADX WARN: Multi-variable type inference failed */
        public Price() {
            Object[] r02 = 0 == true ? 1 : 0;
            this(null, r02, 3, 0 == true ? 1 : 0);
        }

        public final BigDecimal a() {
            return this.buy;
        }

        public final BigDecimal b() {
            return this.sell;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof Price) == true) goto L8;
            return false;
        L8:
            Price r52 = (Price) r5;
            if (p.g(this.buy, r52.buy) == true) goto L12;
            return false;
        L12:
            if (p.g(this.sell, r52.sell) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            BigDecimal r02 = this.buy;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            BigDecimal r2 = this.sell;
            if (r2 == null) goto L11;
            r1 = r2.hashCode();
        L11:
            return r04 + r1;
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "Price(buy=" + this.buy + ", sell=" + this.sell + ")";
        }

        public Price(BigDecimal r1, BigDecimal r2) {
            this.buy = r1;
            this.sell = r2;
        }

        public /* synthetic */ Price(BigDecimal r2, BigDecimal r3, int r4, i r5) {
            if ((r4 & 1) == 0) goto L6;
            r2 = null;
        L6:
            if ((r4 & 2) == 0) goto L8;
            r3 = null;
        L8:
            this(r2, r3);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$StockRealized;", "", "detail", "Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$StockRealized$Detail;", "trades", "", "Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$StockRealized$Trade;", "<init>", "(Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$StockRealized$Detail;Ljava/util/List;)V", "getDetail", "()Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$StockRealized$Detail;", "getTrades", "()Ljava/util/List;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "Detail", "Trade", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class StockRealized {

        @SerializedName("detail")
        private final Detail detail;

        @SerializedName("trades")
        private final List<Trade> trades;

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003Jb\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010%J\u0014\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010)\u001a\u00020*HÖ\u0081\u0004J\n\u0010+\u001a\u00020,HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018¨\u0006-"}, d2 = {"Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$StockRealized$Detail;", "", "averagePrice", "Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Price;", Constants.KEY_DATE, "Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Date;", "lot", "", "netAmount", "Ljava/math/BigDecimal;", "realizedAmount", "realizedGain", "Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Nett;", "totalFee", "<init>", "(Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Price;Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Date;Ljava/lang/Double;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Nett;Ljava/math/BigDecimal;)V", "getAveragePrice", "()Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Price;", "getDate", "()Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Date;", "getLot", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getNetAmount", "()Ljava/math/BigDecimal;", "getRealizedAmount", "getRealizedGain", "()Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Nett;", "getTotalFee", "component1", "component2", "component3", "component4", "component5", "component6", "component7", Constants.COPY_TYPE, "(Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Price;Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Date;Ljava/lang/Double;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Nett;Ljava/math/BigDecimal;)Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$StockRealized$Detail;", "equals", "", "other", "hashCode", "", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Detail {

            @SerializedName("average_price")
            private final Price averagePrice;

            @SerializedName(Constants.KEY_DATE)
            private final Date date;

            @SerializedName("lot")
            private final Double lot;

            @SerializedName("net_amount")
            private final BigDecimal netAmount;

            @SerializedName("realized_amount")
            private final BigDecimal realizedAmount;

            @SerializedName("realized_gain")
            private final Nett realizedGain;

            @SerializedName("total_fee")
            private final BigDecimal totalFee;

            public Detail() {
                Price r1 = null;
                Date r2 = null;
                Double r3 = null;
                BigDecimal r4 = null;
                BigDecimal r5 = null;
                Nett r6 = null;
                BigDecimal r7 = null;
                this(r1, r2, r3, r4, r5, r6, r7, WorkQueueKt.MASK, null);
            }

            public final Price a() {
                return this.averagePrice;
            }

            public final Date b() {
                return this.date;
            }

            public final Double c() {
                return this.lot;
            }

            public final BigDecimal d() {
                return this.netAmount;
            }

            public final BigDecimal e() {
                return this.realizedAmount;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof Detail) == true) goto L8;
                return false;
            L8:
                Detail r52 = (Detail) r5;
                if (p.g(this.averagePrice, r52.averagePrice) == true) goto L12;
                return false;
            L12:
                if (p.g(this.date, r52.date) == true) goto L15;
                return false;
            L15:
                if (p.g(this.lot, r52.lot) == true) goto L18;
                return false;
            L18:
                if (p.g(this.netAmount, r52.netAmount) == true) goto L21;
                return false;
            L21:
                if (p.g(this.realizedAmount, r52.realizedAmount) == true) goto L24;
                return false;
            L24:
                if (p.g(this.realizedGain, r52.realizedGain) == true) goto L27;
                return false;
            L27:
                if (p.g(this.totalFee, r52.totalFee) == true) goto L29;
                return false;
            L29:
                return true;
            }

            public final Nett f() {
                return this.realizedGain;
            }

            public final BigDecimal g() {
                return this.totalFee;
            }

            public int hashCode() {
                Price r02 = this.averagePrice;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                Date r2 = this.date;
                if (r2 != null) goto L9;
                int r22 = 0;
            L10:
                int r05 = (r04 + r22) * 31;
                Double r23 = this.lot;
                if (r23 != null) goto L13;
                int r24 = 0;
            L14:
                int r06 = (r05 + r24) * 31;
                BigDecimal r25 = this.netAmount;
                if (r25 != null) goto L17;
                int r26 = 0;
            L18:
                int r07 = (r06 + r26) * 31;
                BigDecimal r27 = this.realizedAmount;
                if (r27 != null) goto L21;
                int r28 = 0;
            L22:
                int r08 = (r07 + r28) * 31;
                Nett r29 = this.realizedGain;
                if (r29 != null) goto L25;
                int r210 = 0;
            L26:
                int r09 = (r08 + r210) * 31;
                BigDecimal r211 = this.totalFee;
                if (r211 == null) goto L31;
                r1 = r211.hashCode();
            L31:
                return r09 + r1;
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
                return "Detail(averagePrice=" + this.averagePrice + ", date=" + this.date + ", lot=" + this.lot + ", netAmount=" + this.netAmount + ", realizedAmount=" + this.realizedAmount + ", realizedGain=" + this.realizedGain + ", totalFee=" + this.totalFee + ")";
            }

            public Detail(Price r1, Date r2, Double r3, BigDecimal r4, BigDecimal r5, Nett r6, BigDecimal r7) {
                this.averagePrice = r1;
                this.date = r2;
                this.lot = r3;
                this.netAmount = r4;
                this.realizedAmount = r5;
                this.realizedGain = r6;
                this.totalFee = r7;
            }

            public /* synthetic */ Detail(Price r2, Date r3, Double r4, BigDecimal r5, BigDecimal r6, Nett r7, BigDecimal r8, int r9, i r10) {
                if ((r9 & 1) == 0) goto L6;
                r2 = null;
            L6:
                if ((r9 & 2) == 0) goto L9;
                r3 = null;
            L9:
                if ((r9 & 4) == 0) goto L12;
                r4 = null;
            L12:
                if ((r9 & 8) == 0) goto L15;
                r5 = null;
            L15:
                if ((r9 & 16) == 0) goto L18;
                r6 = null;
            L18:
                if ((r9 & 32) == 0) goto L21;
                r7 = null;
            L21:
                if ((r9 & 64) == 0) goto L24;
                BigDecimal r92 = null;
            L23:
                Nett r82 = r7;
                BigDecimal r72 = r6;
                BigDecimal r62 = r5;
                Double r52 = r4;
                this(r2, r3, r52, r62, r72, r82, r92);
                return;
            L24:
                r92 = r8;
                goto L23
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001eJb\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010(J\u0014\u0010)\u001a\u00020\u000e2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010+\u001a\u00020,HÖ\u0081\u0004J\n\u0010-\u001a\u00020\u0005HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001e¨\u0006."}, d2 = {"Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$StockRealized$Trade;", "", "amountInvested", "Ljava/math/BigDecimal;", "createdAt", "", "lot", "", "market", FirebaseAnalytics.Param.PRICE, "Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Price;", "profitLoss", "Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Nett;", "forcedSell", "", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Price;Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Nett;Ljava/lang/Boolean;)V", "getAmountInvested", "()Ljava/math/BigDecimal;", "getCreatedAt", "()Ljava/lang/String;", "getLot", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMarket", "getPrice", "()Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Price;", "getProfitLoss", "()Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Nett;", "getForcedSell", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", Constants.COPY_TYPE, "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Price;Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$Nett;Ljava/lang/Boolean;)Lcom/stockbit/dto/securities/HistoryRealizedDetailDTO$StockRealized$Trade;", "equals", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Trade {

            @SerializedName("amount_invested")
            private final BigDecimal amountInvested;

            @SerializedName("created_at")
            private final String createdAt;

            @SerializedName("forced_sell")
            private final Boolean forcedSell;

            @SerializedName("lot")
            private final Double lot;

            @SerializedName("market")
            private final Double market;

            @SerializedName(FirebaseAnalytics.Param.PRICE)
            private final Price price;

            @SerializedName("profit_loss")
            private final Nett profitLoss;

            public Trade() {
                BigDecimal r1 = null;
                String r2 = null;
                Double r3 = null;
                Double r4 = null;
                Price r5 = null;
                Nett r6 = null;
                Boolean r7 = null;
                this(r1, r2, r3, r4, r5, r6, r7, WorkQueueKt.MASK, null);
            }

            public final BigDecimal a() {
                return this.amountInvested;
            }

            public final String b() {
                return this.createdAt;
            }

            public final Boolean c() {
                return this.forcedSell;
            }

            public final Double d() {
                return this.lot;
            }

            public final Double e() {
                return this.market;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof Trade) == true) goto L8;
                return false;
            L8:
                Trade r52 = (Trade) r5;
                if (p.g(this.amountInvested, r52.amountInvested) == true) goto L12;
                return false;
            L12:
                if (p.g(this.createdAt, r52.createdAt) == true) goto L15;
                return false;
            L15:
                if (p.g(this.lot, r52.lot) == true) goto L18;
                return false;
            L18:
                if (p.g(this.market, r52.market) == true) goto L21;
                return false;
            L21:
                if (p.g(this.price, r52.price) == true) goto L24;
                return false;
            L24:
                if (p.g(this.profitLoss, r52.profitLoss) == true) goto L27;
                return false;
            L27:
                if (p.g(this.forcedSell, r52.forcedSell) == true) goto L29;
                return false;
            L29:
                return true;
            }

            public final Price f() {
                return this.price;
            }

            public final Nett g() {
                return this.profitLoss;
            }

            public int hashCode() {
                BigDecimal r02 = this.amountInvested;
                int r1 = 0;
                if (r02 != null) goto L5;
                int r03 = 0;
            L6:
                int r04 = r03 * 31;
                String r2 = this.createdAt;
                if (r2 != null) goto L9;
                int r22 = 0;
            L10:
                int r05 = (r04 + r22) * 31;
                Double r23 = this.lot;
                if (r23 != null) goto L13;
                int r24 = 0;
            L14:
                int r06 = (r05 + r24) * 31;
                Double r25 = this.market;
                if (r25 != null) goto L17;
                int r26 = 0;
            L18:
                int r07 = (r06 + r26) * 31;
                Price r27 = this.price;
                if (r27 != null) goto L21;
                int r28 = 0;
            L22:
                int r08 = (r07 + r28) * 31;
                Nett r29 = this.profitLoss;
                if (r29 != null) goto L25;
                int r210 = 0;
            L26:
                int r09 = (r08 + r210) * 31;
                Boolean r211 = this.forcedSell;
                if (r211 == null) goto L31;
                r1 = r211.hashCode();
            L31:
                return r09 + r1;
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
                return "Trade(amountInvested=" + this.amountInvested + ", createdAt=" + this.createdAt + ", lot=" + this.lot + ", market=" + this.market + ", price=" + this.price + ", profitLoss=" + this.profitLoss + ", forcedSell=" + this.forcedSell + ")";
            }

            public Trade(BigDecimal r1, String r2, Double r3, Double r4, Price r5, Nett r6, Boolean r7) {
                this.amountInvested = r1;
                this.createdAt = r2;
                this.lot = r3;
                this.market = r4;
                this.price = r5;
                this.profitLoss = r6;
                this.forcedSell = r7;
            }

            public /* synthetic */ Trade(BigDecimal r2, String r3, Double r4, Double r5, Price r6, Nett r7, Boolean r8, int r9, i r10) {
                if ((r9 & 1) == 0) goto L6;
                r2 = null;
            L6:
                if ((r9 & 2) == 0) goto L9;
                r3 = null;
            L9:
                if ((r9 & 4) == 0) goto L12;
                r4 = null;
            L12:
                if ((r9 & 8) == 0) goto L15;
                r5 = null;
            L15:
                if ((r9 & 16) == 0) goto L18;
                r6 = null;
            L18:
                if ((r9 & 32) == 0) goto L21;
                r7 = null;
            L21:
                if ((r9 & 64) == 0) goto L24;
                Boolean r92 = null;
            L23:
                Nett r82 = r7;
                Price r72 = r6;
                Double r62 = r5;
                Double r52 = r4;
                this(r2, r3, r52, r62, r72, r82, r92);
                return;
            L24:
                r92 = r8;
                goto L23
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public StockRealized() {
            Object[] r02 = 0 == true ? 1 : 0;
            this(null, r02, 3, 0 == true ? 1 : 0);
        }

        public final Detail a() {
            return this.detail;
        }

        public final List b() {
            return this.trades;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof StockRealized) == true) goto L8;
            return false;
        L8:
            StockRealized r52 = (StockRealized) r5;
            if (p.g(this.detail, r52.detail) == true) goto L12;
            return false;
        L12:
            if (p.g(this.trades, r52.trades) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            Detail r02 = this.detail;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            List<Trade> r2 = this.trades;
            if (r2 == null) goto L11;
            r1 = r2.hashCode();
        L11:
            return r04 + r1;
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "StockRealized(detail=" + this.detail + ", trades=" + this.trades + ")";
        }

        public StockRealized(Detail r1, List<Trade> r2) {
            this.detail = r1;
            this.trades = r2;
        }

        public /* synthetic */ StockRealized(Detail r2, List r3, int r4, i r5) {
            if ((r4 & 1) == 0) goto L6;
            r2 = null;
        L6:
            if ((r4 & 2) == 0) goto L8;
            r3 = null;
        L8:
            this(r2, r3);
        }
    }

    public HistoryRealizedDetailDTO() {
        BondRealized r1 = null;
        CouponRealized r2 = null;
        DividendRealized r3 = null;
        StockRealized r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public final BondRealized a() {
        return this.bondRealized;
    }

    public final CouponRealized b() {
        return this.couponRealized;
    }

    public final DividendRealized c() {
        return this.dividendRealized;
    }

    public final StockRealized d() {
        return this.stockRealized;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof HistoryRealizedDetailDTO) == true) goto L8;
        return false;
    L8:
        HistoryRealizedDetailDTO r52 = (HistoryRealizedDetailDTO) r5;
        if (p.g(this.bondRealized, r52.bondRealized) == true) goto L12;
        return false;
    L12:
        if (p.g(this.couponRealized, r52.couponRealized) == true) goto L15;
        return false;
    L15:
        if (p.g(this.dividendRealized, r52.dividendRealized) == true) goto L18;
        return false;
    L18:
        if (p.g(this.stockRealized, r52.stockRealized) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        BondRealized r02 = this.bondRealized;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        CouponRealized r2 = this.couponRealized;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        DividendRealized r23 = this.dividendRealized;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        StockRealized r25 = this.stockRealized;
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
        return "HistoryRealizedDetailDTO(bondRealized=" + this.bondRealized + ", couponRealized=" + this.couponRealized + ", dividendRealized=" + this.dividendRealized + ", stockRealized=" + this.stockRealized + ")";
    }

    public HistoryRealizedDetailDTO(BondRealized r1, CouponRealized r2, DividendRealized r3, StockRealized r4) {
        this.bondRealized = r1;
        this.couponRealized = r2;
        this.dividendRealized = r3;
        this.stockRealized = r4;
    }

    public /* synthetic */ HistoryRealizedDetailDTO(BondRealized r2, CouponRealized r3, DividendRealized r4, StockRealized r5, int r6, i r7) {
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
