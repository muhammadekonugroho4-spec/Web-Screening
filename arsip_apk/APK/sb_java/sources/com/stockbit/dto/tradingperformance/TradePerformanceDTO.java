package com.stockbit.dto.tradingperformance;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.scheduling.WorkQueueKt;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001:\u000b3456789:;<=By\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0012HÆ\u0003J{\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0014\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010/\u001a\u000200HÖ\u0081\u0004J\n\u00101\u001a\u000202HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006>"}, d2 = {"Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO;", "", "loss", "Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$Loss;", "mostTradedStocks", "", "Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$MostTradedStock;", "dividends", "Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$DividendDto;", "realizedChartData", "Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$RealizedChartData;", "performanceRating", "Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$PerformanceRating;", "profit", "Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$Profit;", "tradeSum", "Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$TradeSum;", "topStocks", "Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$TopStocks;", "<init>", "(Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$Loss;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$PerformanceRating;Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$Profit;Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$TradeSum;Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$TopStocks;)V", "getLoss", "()Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$Loss;", "getMostTradedStocks", "()Ljava/util/List;", "getDividends", "getRealizedChartData", "getPerformanceRating", "()Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$PerformanceRating;", "getProfit", "()Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$Profit;", "getTradeSum", "()Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$TradeSum;", "getTopStocks", "()Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$TopStocks;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "Loss", "MostTradedStock", "DividendDto", "RealizedChartData", "PerformanceRating", "Profit", "TradeSum", "Performance", "StockPerformanceItem", "GainerLoserDetail", "TopStocks", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TradePerformanceDTO {

    @SerializedName("dividends")
    private final List<DividendDto> dividends;

    @SerializedName("loss")
    private final Loss loss;

    @SerializedName("most_traded_stocks")
    private final List<MostTradedStock> mostTradedStocks;

    @SerializedName("performance_rating")
    private final PerformanceRating performanceRating;

    @SerializedName("profit")
    private final Profit profit;

    @SerializedName("realized_chart_data")
    private final List<RealizedChartData> realizedChartData;

    @SerializedName("top_stocks")
    private final TopStocks topStocks;

    @SerializedName("trade_sum")
    private final TradeSum tradeSum;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$DividendDto;", "", "stockCode", "", Constants.KEY_DATE, "amount", "", "iconUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V", "getStockCode", "()Ljava/lang/String;", "getDate", "getAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getIconUrl", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$DividendDto;", "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DividendDto {

        @SerializedName("amount")
        private final Double amount;

        @SerializedName(Constants.KEY_DATE)
        private final String date;

        @SerializedName("icon_url")
        private final String iconUrl;

        @SerializedName("stock_code")
        private final String stockCode;

        public DividendDto() {
            String r1 = null;
            String r2 = null;
            Double r3 = null;
            String r4 = null;
            this(r1, r2, r3, r4, 15, null);
        }

        public final Double a() {
            return this.amount;
        }

        public final String b() {
            return this.date;
        }

        public final String c() {
            return this.iconUrl;
        }

        public final String d() {
            return this.stockCode;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof DividendDto) == true) goto L8;
            return false;
        L8:
            DividendDto r52 = (DividendDto) r5;
            if (p.g(this.stockCode, r52.stockCode) == true) goto L12;
            return false;
        L12:
            if (p.g(this.date, r52.date) == true) goto L15;
            return false;
        L15:
            if (p.g(this.amount, r52.amount) == true) goto L18;
            return false;
        L18:
            if (p.g(this.iconUrl, r52.iconUrl) == true) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            String r02 = this.stockCode;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.date;
            if (r2 != null) goto L9;
            int r22 = 0;
        L10:
            int r05 = (r04 + r22) * 31;
            Double r23 = this.amount;
            if (r23 != null) goto L13;
            int r24 = 0;
        L14:
            int r06 = (r05 + r24) * 31;
            String r25 = this.iconUrl;
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
            return "DividendDto(stockCode=" + this.stockCode + ", date=" + this.date + ", amount=" + this.amount + ", iconUrl=" + this.iconUrl + ")";
        }

        public DividendDto(String r1, String r2, Double r3, String r4) {
            this.stockCode = r1;
            this.date = r2;
            this.amount = r3;
            this.iconUrl = r4;
        }

        public /* synthetic */ DividendDto(String r2, String r3, Double r4, String r5, int r6, i r7) {
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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$GainerLoserDetail;", "", "byNominal", "", "Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$StockPerformanceItem;", "byPercentage", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getByNominal", "()Ljava/util/List;", "getByPercentage", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class GainerLoserDetail {

        @SerializedName("by_nominal")
        private final List<StockPerformanceItem> byNominal;

        @SerializedName("by_percentage")
        private final List<StockPerformanceItem> byPercentage;

        /* JADX WARN: Multi-variable type inference failed */
        public GainerLoserDetail() {
            Object[] r02 = 0 == true ? 1 : 0;
            this(null, r02, 3, 0 == true ? 1 : 0);
        }

        public final List a() {
            return this.byNominal;
        }

        public final List b() {
            return this.byPercentage;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof GainerLoserDetail) == true) goto L8;
            return false;
        L8:
            GainerLoserDetail r52 = (GainerLoserDetail) r5;
            if (p.g(this.byNominal, r52.byNominal) == true) goto L12;
            return false;
        L12:
            if (p.g(this.byPercentage, r52.byPercentage) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            List<StockPerformanceItem> r02 = this.byNominal;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            List<StockPerformanceItem> r2 = this.byPercentage;
            if (r2 == null) goto L11;
            r1 = r2.hashCode();
        L11:
            return r04 + r1;
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "GainerLoserDetail(byNominal=" + this.byNominal + ", byPercentage=" + this.byPercentage + ")";
        }

        public GainerLoserDetail(List<StockPerformanceItem> r1, List<StockPerformanceItem> r2) {
            this.byNominal = r1;
            this.byPercentage = r2;
        }

        public /* synthetic */ GainerLoserDetail(List r2, List r3, int r4, i r5) {
            if ((r4 & 1) == 0) goto L6;
            r2 = null;
        L6:
            if ((r4 & 2) == 0) goto L8;
            r3 = null;
        L8:
            this(r2, r3);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$Loss;", "", "averageAmount", "", "tradeMaxPerformance", "Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$Performance;", "<init>", "(Ljava/lang/String;Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$Performance;)V", "getAverageAmount", "()Ljava/lang/String;", "getTradeMaxPerformance", "()Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$Performance;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Loss {

        @SerializedName("average_amount")
        private final String averageAmount;

        @SerializedName("trade_max_performance")
        private final Performance tradeMaxPerformance;

        /* JADX WARN: Multi-variable type inference failed */
        public Loss() {
            Object[] r02 = 0 == true ? 1 : 0;
            this(null, r02, 3, 0 == true ? 1 : 0);
        }

        public final String a() {
            return this.averageAmount;
        }

        public final Performance b() {
            return this.tradeMaxPerformance;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof Loss) == true) goto L8;
            return false;
        L8:
            Loss r52 = (Loss) r5;
            if (p.g(this.averageAmount, r52.averageAmount) == true) goto L12;
            return false;
        L12:
            if (p.g(this.tradeMaxPerformance, r52.tradeMaxPerformance) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            String r02 = this.averageAmount;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            Performance r2 = this.tradeMaxPerformance;
            if (r2 == null) goto L11;
            r1 = r2.hashCode();
        L11:
            return r04 + r1;
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "Loss(averageAmount=" + this.averageAmount + ", tradeMaxPerformance=" + this.tradeMaxPerformance + ")";
        }

        public Loss(String r1, Performance r2) {
            this.averageAmount = r1;
            this.tradeMaxPerformance = r2;
        }

        public /* synthetic */ Loss(String r2, Performance r3, int r4, i r5) {
            if ((r4 & 1) == 0) goto L6;
            r2 = null;
        L6:
            if ((r4 & 2) == 0) goto L8;
            r3 = null;
        L8:
            this(r2, r3);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$MostTradedStock;", "", "iconUrl", "", "symbol", "totalTrade", "tradePerformance", "Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$Performance;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$Performance;)V", "getIconUrl", "()Ljava/lang/String;", "getSymbol", "getTotalTrade", "getTradePerformance", "()Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$Performance;", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class MostTradedStock {

        @SerializedName("icon_url")
        private final String iconUrl;

        @SerializedName("symbol")
        private final String symbol;

        @SerializedName("total_trade")
        private final String totalTrade;

        @SerializedName("trade_performance")
        private final Performance tradePerformance;

        public MostTradedStock() {
            String r1 = null;
            String r2 = null;
            String r3 = null;
            Performance r4 = null;
            this(r1, r2, r3, r4, 15, null);
        }

        public final String a() {
            return this.iconUrl;
        }

        public final String b() {
            return this.symbol;
        }

        public final String c() {
            return this.totalTrade;
        }

        public final Performance d() {
            return this.tradePerformance;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof MostTradedStock) == true) goto L8;
            return false;
        L8:
            MostTradedStock r52 = (MostTradedStock) r5;
            if (p.g(this.iconUrl, r52.iconUrl) == true) goto L12;
            return false;
        L12:
            if (p.g(this.symbol, r52.symbol) == true) goto L15;
            return false;
        L15:
            if (p.g(this.totalTrade, r52.totalTrade) == true) goto L18;
            return false;
        L18:
            if (p.g(this.tradePerformance, r52.tradePerformance) == true) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            String r02 = this.iconUrl;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.symbol;
            if (r2 != null) goto L9;
            int r22 = 0;
        L10:
            int r05 = (r04 + r22) * 31;
            String r23 = this.totalTrade;
            if (r23 != null) goto L13;
            int r24 = 0;
        L14:
            int r06 = (r05 + r24) * 31;
            Performance r25 = this.tradePerformance;
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
            return "MostTradedStock(iconUrl=" + this.iconUrl + ", symbol=" + this.symbol + ", totalTrade=" + this.totalTrade + ", tradePerformance=" + this.tradePerformance + ")";
        }

        public MostTradedStock(String r1, String r2, String r3, Performance r4) {
            this.iconUrl = r1;
            this.symbol = r2;
            this.totalTrade = r3;
            this.tradePerformance = r4;
        }

        public /* synthetic */ MostTradedStock(String r2, String r3, String r4, Performance r5, int r6, i r7) {
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

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$Performance;", "", "amount", "", "percentage", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;)V", "getAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPercentage", "component1", "component2", Constants.COPY_TYPE, "(Ljava/lang/Double;Ljava/lang/Double;)Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$Performance;", "equals", "", "other", "hashCode", "", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Performance {

        @SerializedName("amount")
        private final Double amount;

        @SerializedName("percentage")
        private final Double percentage;

        /* JADX WARN: Multi-variable type inference failed */
        public Performance() {
            Object[] r02 = 0 == true ? 1 : 0;
            this(null, r02, 3, 0 == true ? 1 : 0);
        }

        public final Double a() {
            return this.amount;
        }

        public final Double b() {
            return this.percentage;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof Performance) == true) goto L8;
            return false;
        L8:
            Performance r52 = (Performance) r5;
            if (p.g(this.amount, r52.amount) == true) goto L12;
            return false;
        L12:
            if (p.g(this.percentage, r52.percentage) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            Double r02 = this.amount;
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
            return "Performance(amount=" + this.amount + ", percentage=" + this.percentage + ")";
        }

        public Performance(Double r1, Double r2) {
            this.amount = r1;
            this.percentage = r2;
        }

        public /* synthetic */ Performance(Double r2, Double r3, int r4, i r5) {
            if ((r4 & 1) == 0) goto L6;
            r2 = null;
        L6:
            if ((r4 & 2) == 0) goto L8;
            r3 = null;
        L8:
            this(r2, r3);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jb\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0014\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010#\u001a\u00020$HÖ\u0081\u0004J\n\u0010%\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006&"}, d2 = {"Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$PerformanceRating;", "", "profitFactor", "", "totalLoss", "totalTrade", "totalWin", "winRate", "totalTpv", "", "totalOrder", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V", "getProfitFactor", "()Ljava/lang/String;", "getTotalLoss", "getTotalTrade", "getTotalWin", "getWinRate", "getTotalTpv", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getTotalOrder", "component1", "component2", "component3", "component4", "component5", "component6", "component7", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$PerformanceRating;", "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PerformanceRating {

        @SerializedName("profit_factor")
        private final String profitFactor;

        @SerializedName("total_loss")
        private final String totalLoss;

        @SerializedName("total_order")
        private final String totalOrder;

        @SerializedName("total_tpv")
        private final Double totalTpv;

        @SerializedName("total_trade")
        private final String totalTrade;

        @SerializedName("total_win")
        private final String totalWin;

        @SerializedName("win_rate")
        private final String winRate;

        public PerformanceRating() {
            String r1 = null;
            String r2 = null;
            String r3 = null;
            String r4 = null;
            String r5 = null;
            Double r6 = null;
            String r7 = null;
            this(r1, r2, r3, r4, r5, r6, r7, WorkQueueKt.MASK, null);
        }

        public final String a() {
            return this.profitFactor;
        }

        public final String b() {
            return this.totalLoss;
        }

        public final String c() {
            return this.totalOrder;
        }

        public final Double d() {
            return this.totalTpv;
        }

        public final String e() {
            return this.totalTrade;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof PerformanceRating) == true) goto L8;
            return false;
        L8:
            PerformanceRating r52 = (PerformanceRating) r5;
            if (p.g(this.profitFactor, r52.profitFactor) == true) goto L12;
            return false;
        L12:
            if (p.g(this.totalLoss, r52.totalLoss) == true) goto L15;
            return false;
        L15:
            if (p.g(this.totalTrade, r52.totalTrade) == true) goto L18;
            return false;
        L18:
            if (p.g(this.totalWin, r52.totalWin) == true) goto L21;
            return false;
        L21:
            if (p.g(this.winRate, r52.winRate) == true) goto L24;
            return false;
        L24:
            if (p.g(this.totalTpv, r52.totalTpv) == true) goto L27;
            return false;
        L27:
            if (p.g(this.totalOrder, r52.totalOrder) == true) goto L29;
            return false;
        L29:
            return true;
        }

        public final String f() {
            return this.totalWin;
        }

        public final String g() {
            return this.winRate;
        }

        public int hashCode() {
            String r02 = this.profitFactor;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.totalLoss;
            if (r2 != null) goto L9;
            int r22 = 0;
        L10:
            int r05 = (r04 + r22) * 31;
            String r23 = this.totalTrade;
            if (r23 != null) goto L13;
            int r24 = 0;
        L14:
            int r06 = (r05 + r24) * 31;
            String r25 = this.totalWin;
            if (r25 != null) goto L17;
            int r26 = 0;
        L18:
            int r07 = (r06 + r26) * 31;
            String r27 = this.winRate;
            if (r27 != null) goto L21;
            int r28 = 0;
        L22:
            int r08 = (r07 + r28) * 31;
            Double r29 = this.totalTpv;
            if (r29 != null) goto L25;
            int r210 = 0;
        L26:
            int r09 = (r08 + r210) * 31;
            String r211 = this.totalOrder;
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
            return "PerformanceRating(profitFactor=" + this.profitFactor + ", totalLoss=" + this.totalLoss + ", totalTrade=" + this.totalTrade + ", totalWin=" + this.totalWin + ", winRate=" + this.winRate + ", totalTpv=" + this.totalTpv + ", totalOrder=" + this.totalOrder + ")";
        }

        public PerformanceRating(String r1, String r2, String r3, String r4, String r5, Double r6, String r7) {
            this.profitFactor = r1;
            this.totalLoss = r2;
            this.totalTrade = r3;
            this.totalWin = r4;
            this.winRate = r5;
            this.totalTpv = r6;
            this.totalOrder = r7;
        }

        public /* synthetic */ PerformanceRating(String r2, String r3, String r4, String r5, String r6, Double r7, String r8, int r9, i r10) {
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
            String r92 = null;
        L23:
            Double r82 = r7;
            String r72 = r6;
            String r62 = r5;
            String r52 = r4;
            this(r2, r3, r52, r62, r72, r82, r92);
            return;
        L24:
            r92 = r8;
            goto L23
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$Profit;", "", "averageAmount", "", "tradeMaxPerformance", "Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$Performance;", "<init>", "(Ljava/lang/String;Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$Performance;)V", "getAverageAmount", "()Ljava/lang/String;", "getTradeMaxPerformance", "()Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$Performance;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Profit {

        @SerializedName("average_amount")
        private final String averageAmount;

        @SerializedName("trade_max_performance")
        private final Performance tradeMaxPerformance;

        /* JADX WARN: Multi-variable type inference failed */
        public Profit() {
            Object[] r02 = 0 == true ? 1 : 0;
            this(null, r02, 3, 0 == true ? 1 : 0);
        }

        public final String a() {
            return this.averageAmount;
        }

        public final Performance b() {
            return this.tradeMaxPerformance;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof Profit) == true) goto L8;
            return false;
        L8:
            Profit r52 = (Profit) r5;
            if (p.g(this.averageAmount, r52.averageAmount) == true) goto L12;
            return false;
        L12:
            if (p.g(this.tradeMaxPerformance, r52.tradeMaxPerformance) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            String r02 = this.averageAmount;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            Performance r2 = this.tradeMaxPerformance;
            if (r2 == null) goto L11;
            r1 = r2.hashCode();
        L11:
            return r04 + r1;
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "Profit(averageAmount=" + this.averageAmount + ", tradeMaxPerformance=" + this.tradeMaxPerformance + ")";
        }

        public Profit(String r1, Performance r2) {
            this.averageAmount = r1;
            this.tradeMaxPerformance = r2;
        }

        public /* synthetic */ Profit(String r2, Performance r3, int r4, i r5) {
            if ((r4 & 1) == 0) goto L6;
            r2 = null;
        L6:
            if ((r4 & 2) == 0) goto L8;
            r3 = null;
        L8:
            this(r2, r3);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$RealizedChartData;", "", Constants.KEY_DATE, "", "amount", "tradeSum", "Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$TradeSum;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$TradeSum;)V", "getDate", "()Ljava/lang/String;", "getAmount", "getTradeSum", "()Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$TradeSum;", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RealizedChartData {

        @SerializedName("amount")
        private final String amount;

        @SerializedName(Constants.KEY_DATE)
        private final String date;

        @SerializedName("trade_sum")
        private final TradeSum tradeSum;

        public RealizedChartData(String r2, String r3, TradeSum r4) {
            p.l(r4, "tradeSum");
            this.date = r2;
            this.amount = r3;
            this.tradeSum = r4;
        }

        public final String a() {
            return this.amount;
        }

        public final String b() {
            return this.date;
        }

        public final TradeSum c() {
            return this.tradeSum;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof RealizedChartData) == true) goto L8;
            return false;
        L8:
            RealizedChartData r52 = (RealizedChartData) r5;
            if (p.g(this.date, r52.date) == true) goto L12;
            return false;
        L12:
            if (p.g(this.amount, r52.amount) == true) goto L15;
            return false;
        L15:
            if (p.g(this.tradeSum, r52.tradeSum) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            String r02 = this.date;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.amount;
            if (r2 == null) goto L11;
            r1 = r2.hashCode();
        L11:
            return ((r04 + r1) * 31) + this.tradeSum.hashCode();
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "RealizedChartData(date=" + this.date + ", amount=" + this.amount + ", tradeSum=" + this.tradeSum + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$StockPerformanceItem;", "", "symbol", "", "totalTrade", "tradePerformance", "Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$Performance;", "iconUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$Performance;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getTotalTrade", "getTradePerformance", "()Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$Performance;", "getIconUrl", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class StockPerformanceItem {

        @SerializedName("icon_url")
        private final String iconUrl;

        @SerializedName("symbol")
        private final String symbol;

        @SerializedName("total_trade")
        private final String totalTrade;

        @SerializedName("trade_performance")
        private final Performance tradePerformance;

        public StockPerformanceItem() {
            String r1 = null;
            String r2 = null;
            Performance r3 = null;
            String r4 = null;
            this(r1, r2, r3, r4, 15, null);
        }

        public final String a() {
            return this.iconUrl;
        }

        public final String b() {
            return this.symbol;
        }

        public final String c() {
            return this.totalTrade;
        }

        public final Performance d() {
            return this.tradePerformance;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof StockPerformanceItem) == true) goto L8;
            return false;
        L8:
            StockPerformanceItem r52 = (StockPerformanceItem) r5;
            if (p.g(this.symbol, r52.symbol) == true) goto L12;
            return false;
        L12:
            if (p.g(this.totalTrade, r52.totalTrade) == true) goto L15;
            return false;
        L15:
            if (p.g(this.tradePerformance, r52.tradePerformance) == true) goto L18;
            return false;
        L18:
            if (p.g(this.iconUrl, r52.iconUrl) == true) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            String r02 = this.symbol;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.totalTrade;
            if (r2 != null) goto L9;
            int r22 = 0;
        L10:
            int r05 = (r04 + r22) * 31;
            Performance r23 = this.tradePerformance;
            if (r23 != null) goto L13;
            int r24 = 0;
        L14:
            int r06 = (r05 + r24) * 31;
            String r25 = this.iconUrl;
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
            return "StockPerformanceItem(symbol=" + this.symbol + ", totalTrade=" + this.totalTrade + ", tradePerformance=" + this.tradePerformance + ", iconUrl=" + this.iconUrl + ")";
        }

        public StockPerformanceItem(String r1, String r2, Performance r3, String r4) {
            this.symbol = r1;
            this.totalTrade = r2;
            this.tradePerformance = r3;
            this.iconUrl = r4;
        }

        public /* synthetic */ StockPerformanceItem(String r2, String r3, Performance r4, String r5, int r6, i r7) {
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

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$TopStocks;", "", "gainer", "Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$GainerLoserDetail;", "loser", "<init>", "(Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$GainerLoserDetail;Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$GainerLoserDetail;)V", "getGainer", "()Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$GainerLoserDetail;", "getLoser", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TopStocks {

        @SerializedName("gainer")
        private final GainerLoserDetail gainer;

        @SerializedName("loser")
        private final GainerLoserDetail loser;

        /* JADX WARN: Multi-variable type inference failed */
        public TopStocks() {
            Object[] r02 = 0 == true ? 1 : 0;
            this(null, r02, 3, 0 == true ? 1 : 0);
        }

        public final GainerLoserDetail a() {
            return this.gainer;
        }

        public final GainerLoserDetail b() {
            return this.loser;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof TopStocks) == true) goto L8;
            return false;
        L8:
            TopStocks r52 = (TopStocks) r5;
            if (p.g(this.gainer, r52.gainer) == true) goto L12;
            return false;
        L12:
            if (p.g(this.loser, r52.loser) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            GainerLoserDetail r02 = this.gainer;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            GainerLoserDetail r2 = this.loser;
            if (r2 == null) goto L11;
            r1 = r2.hashCode();
        L11:
            return r04 + r1;
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "TopStocks(gainer=" + this.gainer + ", loser=" + this.loser + ")";
        }

        public TopStocks(GainerLoserDetail r1, GainerLoserDetail r2) {
            this.gainer = r1;
            this.loser = r2;
        }

        public /* synthetic */ TopStocks(GainerLoserDetail r2, GainerLoserDetail r3, int r4, i r5) {
            if ((r4 & 1) == 0) goto L6;
            r2 = null;
        L6:
            if ((r4 & 2) == 0) goto L8;
            r3 = null;
        L8:
            this(r2, r3);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/stockbit/dto/tradingperformance/TradePerformanceDTO$TradeSum;", "", "realizedGain", "", "realizedLoss", "totalDividendReceived", "totalRealized", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRealizedGain", "()Ljava/lang/String;", "getRealizedLoss", "getTotalDividendReceived", "getTotalRealized", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TradeSum {

        @SerializedName("realized_gain")
        private final String realizedGain;

        @SerializedName("realized_loss")
        private final String realizedLoss;

        @SerializedName("total_dividend_received")
        private final String totalDividendReceived;

        @SerializedName("total_realized")
        private final String totalRealized;

        public TradeSum() {
            String r1 = null;
            String r2 = null;
            String r3 = null;
            String r4 = null;
            this(r1, r2, r3, r4, 15, null);
        }

        public final String a() {
            return this.realizedGain;
        }

        public final String b() {
            return this.realizedLoss;
        }

        public final String c() {
            return this.totalDividendReceived;
        }

        public final String d() {
            return this.totalRealized;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof TradeSum) == true) goto L8;
            return false;
        L8:
            TradeSum r52 = (TradeSum) r5;
            if (p.g(this.realizedGain, r52.realizedGain) == true) goto L12;
            return false;
        L12:
            if (p.g(this.realizedLoss, r52.realizedLoss) == true) goto L15;
            return false;
        L15:
            if (p.g(this.totalDividendReceived, r52.totalDividendReceived) == true) goto L18;
            return false;
        L18:
            if (p.g(this.totalRealized, r52.totalRealized) == true) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            String r02 = this.realizedGain;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.realizedLoss;
            if (r2 != null) goto L9;
            int r22 = 0;
        L10:
            int r05 = (r04 + r22) * 31;
            String r23 = this.totalDividendReceived;
            if (r23 != null) goto L13;
            int r24 = 0;
        L14:
            int r06 = (r05 + r24) * 31;
            String r25 = this.totalRealized;
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
            return "TradeSum(realizedGain=" + this.realizedGain + ", realizedLoss=" + this.realizedLoss + ", totalDividendReceived=" + this.totalDividendReceived + ", totalRealized=" + this.totalRealized + ")";
        }

        public TradeSum(String r1, String r2, String r3, String r4) {
            this.realizedGain = r1;
            this.realizedLoss = r2;
            this.totalDividendReceived = r3;
            this.totalRealized = r4;
        }

        public /* synthetic */ TradeSum(String r2, String r3, String r4, String r5, int r6, i r7) {
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

    public TradePerformanceDTO() {
        Loss r1 = null;
        List r2 = null;
        List r3 = null;
        List r4 = null;
        PerformanceRating r5 = null;
        Profit r6 = null;
        TradeSum r7 = null;
        TopStocks r8 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, com.google.firebase.perf.util.Constants.MAX_HOST_LENGTH, null);
    }

    public final List a() {
        return this.dividends;
    }

    public final Loss b() {
        return this.loss;
    }

    public final List c() {
        return this.mostTradedStocks;
    }

    public final PerformanceRating d() {
        return this.performanceRating;
    }

    public final Profit e() {
        return this.profit;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TradePerformanceDTO) == true) goto L8;
        return false;
    L8:
        TradePerformanceDTO r52 = (TradePerformanceDTO) r5;
        if (p.g(this.loss, r52.loss) == true) goto L12;
        return false;
    L12:
        if (p.g(this.mostTradedStocks, r52.mostTradedStocks) == true) goto L15;
        return false;
    L15:
        if (p.g(this.dividends, r52.dividends) == true) goto L18;
        return false;
    L18:
        if (p.g(this.realizedChartData, r52.realizedChartData) == true) goto L21;
        return false;
    L21:
        if (p.g(this.performanceRating, r52.performanceRating) == true) goto L24;
        return false;
    L24:
        if (p.g(this.profit, r52.profit) == true) goto L27;
        return false;
    L27:
        if (p.g(this.tradeSum, r52.tradeSum) == true) goto L30;
        return false;
    L30:
        if (p.g(this.topStocks, r52.topStocks) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final List f() {
        return this.realizedChartData;
    }

    public final TopStocks g() {
        return this.topStocks;
    }

    public final TradeSum h() {
        return this.tradeSum;
    }

    public int hashCode() {
        Loss r02 = this.loss;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        List<MostTradedStock> r2 = this.mostTradedStocks;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        List<DividendDto> r23 = this.dividends;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        List<RealizedChartData> r25 = this.realizedChartData;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        PerformanceRating r27 = this.performanceRating;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        Profit r29 = this.profit;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        TradeSum r211 = this.tradeSum;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        TopStocks r213 = this.topStocks;
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
        return "TradePerformanceDTO(loss=" + this.loss + ", mostTradedStocks=" + this.mostTradedStocks + ", dividends=" + this.dividends + ", realizedChartData=" + this.realizedChartData + ", performanceRating=" + this.performanceRating + ", profit=" + this.profit + ", tradeSum=" + this.tradeSum + ", topStocks=" + this.topStocks + ")";
    }

    public TradePerformanceDTO(Loss r1, List<MostTradedStock> r2, List<DividendDto> r3, List<RealizedChartData> r4, PerformanceRating r5, Profit r6, TradeSum r7, TopStocks r8) {
        this.loss = r1;
        this.mostTradedStocks = r2;
        this.dividends = r3;
        this.realizedChartData = r4;
        this.performanceRating = r5;
        this.profit = r6;
        this.tradeSum = r7;
        this.topStocks = r8;
    }

    public /* synthetic */ TradePerformanceDTO(Loss r2, List r3, List r4, List r5, PerformanceRating r6, Profit r7, TradeSum r8, TopStocks r9, int r10, i r11) {
        if ((r10 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r7 = null;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r8 = null;
    L24:
        if ((r10 & 128) == 0) goto L27;
        TopStocks r102 = null;
    L26:
        TradeSum r92 = r8;
        Profit r82 = r7;
        PerformanceRating r72 = r6;
        List r62 = r5;
        List r52 = r4;
        this(r2, r3, r52, r62, r72, r82, r92, r102);
        return;
    L27:
        r102 = r9;
        goto L26
    }
}
