package com.stockbit.dto.securities;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.p;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u001c\u001d\u001eB%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/stockbit/dto/securities/HistoryRealizedDTO;", "", "history", "", "Lcom/stockbit/dto/securities/HistoryRealizedDTO$History;", "metadata", "Lcom/stockbit/dto/securities/HistoryRealizedDTO$Metadata;", "summary", "Lcom/stockbit/dto/securities/HistoryRealizedDTO$Summary;", "<init>", "(Ljava/util/List;Lcom/stockbit/dto/securities/HistoryRealizedDTO$Metadata;Lcom/stockbit/dto/securities/HistoryRealizedDTO$Summary;)V", "getHistory", "()Ljava/util/List;", "getMetadata", "()Lcom/stockbit/dto/securities/HistoryRealizedDTO$Metadata;", "getSummary", "()Lcom/stockbit/dto/securities/HistoryRealizedDTO$Summary;", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "History", "Metadata", "Summary", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HistoryRealizedDTO {

    @SerializedName("history")
    private final List<History> history;

    @SerializedName("metadata")
    private final Metadata metadata;

    @SerializedName("summary")
    private final Summary summary;

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001bB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/stockbit/dto/securities/HistoryRealizedDTO$History;", "", Constants.KEY_DATE, "", "list", "", "Lcom/stockbit/dto/securities/HistoryRealizedDTO$History$Detail;", "totalRealizedAmount", "", "<init>", "(Ljava/lang/String;Ljava/util/List;D)V", "getDate", "()Ljava/lang/String;", "getList", "()Ljava/util/List;", "getTotalRealizedAmount", "()D", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Detail", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class History {

        @SerializedName(Constants.KEY_DATE)
        private final String date;

        @SerializedName("list")
        private final List<Detail> list;

        @SerializedName("total_realized_amount")
        private final double totalRealizedAmount;

        @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u00014B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u000eHÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003Jw\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0005HÆ\u0001J\u0014\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00101\u001a\u000202HÖ\u0081\u0004J\n\u00103\u001a\u00020\u0005HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0016\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016¨\u00065"}, d2 = {"Lcom/stockbit/dto/securities/HistoryRealizedDTO$History$Detail;", "", "amount", "", Constants.KEY_DATE, "", "displayAs", "fee", "historyId", "", "lot", "netAmount", FirebaseAnalytics.Param.PRICE, "realized", "Lcom/stockbit/dto/securities/HistoryRealizedDTO$History$Detail$Realized;", "stockCode", "transactionType", "<init>", "(DLjava/lang/String;Ljava/lang/String;DJDDDLcom/stockbit/dto/securities/HistoryRealizedDTO$History$Detail$Realized;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()D", "getDate", "()Ljava/lang/String;", "getDisplayAs", "getFee", "getHistoryId", "()J", "getLot", "getNetAmount", "getPrice", "getRealized", "()Lcom/stockbit/dto/securities/HistoryRealizedDTO$History$Detail$Realized;", "getStockCode", "getTransactionType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Realized", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Detail {

            @SerializedName("amount")
            private final double amount;

            @SerializedName(Constants.KEY_DATE)
            private final String date;

            @SerializedName("display_as")
            private final String displayAs;

            @SerializedName("fee")
            private final double fee;

            @SerializedName("history_id")
            private final long historyId;

            @SerializedName("lot")
            private final double lot;

            @SerializedName("net_amount")
            private final double netAmount;

            @SerializedName(FirebaseAnalytics.Param.PRICE)
            private final double price;

            @SerializedName("realized")
            private final Realized realized;

            @SerializedName("stock_code")
            private final String stockCode;

            @SerializedName("transaction_type")
            private final String transactionType;

            @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0006HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/stockbit/dto/securities/HistoryRealizedDTO$History$Detail$Realized;", "", "amount", "", "percentage", NotificationCompat.CATEGORY_STATUS, "", "<init>", "(DDLjava/lang/String;)V", "getAmount", "()D", "getPercentage", "getStatus", "()Ljava/lang/String;", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Realized {

                @SerializedName("amount")
                private final double amount;

                @SerializedName("percentage")
                private final double percentage;

                @SerializedName(NotificationCompat.CATEGORY_STATUS)
                private final String status;

                public Realized(double r2, double r4, String r6) {
                    p.l(r6, NotificationCompat.CATEGORY_STATUS);
                    this.amount = r2;
                    this.percentage = r4;
                    this.status = r6;
                }

                public final double a() {
                    return this.amount;
                }

                public final double b() {
                    return this.percentage;
                }

                public final String c() {
                    return this.status;
                }

                public boolean equals(Object r8) {
                    if (this != r8) goto L6;
                    return true;
                L6:
                    if ((r8 instanceof Realized) == true) goto L8;
                    return false;
                L8:
                    Realized r82 = (Realized) r8;
                    if (Double.compare(this.amount, r82.amount) == 0) goto L12;
                    return false;
                L12:
                    if (Double.compare(this.percentage, r82.percentage) == 0) goto L15;
                    return false;
                L15:
                    if (p.g(this.status, r82.status) == true) goto L17;
                    return false;
                L17:
                    return true;
                }

                public int hashCode() {
                    return (((Double.hashCode(this.amount) * 31) + Double.hashCode(this.percentage)) * 31) + this.status.hashCode();
                }

                public String toString() {
                    return "Realized(amount=" + this.amount + ", percentage=" + this.percentage + ", status=" + this.status + ")";
                }
            }

            public Detail(double r5, String r7, String r8, double r9, long r11, double r13, double r15, double r17, Realized r19, String r20, String r21) {
                p.l(r7, Constants.KEY_DATE);
                p.l(r8, "displayAs");
                p.l(r19, "realized");
                p.l(r20, "stockCode");
                p.l(r21, "transactionType");
                this.amount = r5;
                this.date = r7;
                this.displayAs = r8;
                this.fee = r9;
                this.historyId = r11;
                this.lot = r13;
                this.netAmount = r15;
                this.price = r17;
                this.realized = r19;
                this.stockCode = r20;
                this.transactionType = r21;
            }

            public final double a() {
                return this.amount;
            }

            public final String b() {
                return this.date;
            }

            public final String c() {
                return this.displayAs;
            }

            public final double d() {
                return this.fee;
            }

            public final long e() {
                return this.historyId;
            }

            public boolean equals(Object r8) {
                if (this != r8) goto L6;
                return true;
            L6:
                if ((r8 instanceof Detail) == true) goto L8;
                return false;
            L8:
                Detail r82 = (Detail) r8;
                if (Double.compare(this.amount, r82.amount) == 0) goto L12;
                return false;
            L12:
                if (p.g(this.date, r82.date) == true) goto L15;
                return false;
            L15:
                if (p.g(this.displayAs, r82.displayAs) == true) goto L18;
                return false;
            L18:
                if (Double.compare(this.fee, r82.fee) == 0) goto L21;
                return false;
            L21:
                if (this.historyId == r82.historyId) goto L24;
                return false;
            L24:
                if (Double.compare(this.lot, r82.lot) == 0) goto L27;
                return false;
            L27:
                if (Double.compare(this.netAmount, r82.netAmount) == 0) goto L30;
                return false;
            L30:
                if (Double.compare(this.price, r82.price) == 0) goto L33;
                return false;
            L33:
                if (p.g(this.realized, r82.realized) == true) goto L36;
                return false;
            L36:
                if (p.g(this.stockCode, r82.stockCode) == true) goto L39;
                return false;
            L39:
                if (p.g(this.transactionType, r82.transactionType) == true) goto L41;
                return false;
            L41:
                return true;
            }

            public final double f() {
                return this.lot;
            }

            public final double g() {
                return this.netAmount;
            }

            public final double h() {
                return this.price;
            }

            public int hashCode() {
                return (((((((((((((((((((Double.hashCode(this.amount) * 31) + this.date.hashCode()) * 31) + this.displayAs.hashCode()) * 31) + Double.hashCode(this.fee)) * 31) + Long.hashCode(this.historyId)) * 31) + Double.hashCode(this.lot)) * 31) + Double.hashCode(this.netAmount)) * 31) + Double.hashCode(this.price)) * 31) + this.realized.hashCode()) * 31) + this.stockCode.hashCode()) * 31) + this.transactionType.hashCode();
            }

            public final Realized i() {
                return this.realized;
            }

            public final String j() {
                return this.stockCode;
            }

            public final String k() {
                return this.transactionType;
            }

            public String toString() {
                return "Detail(amount=" + this.amount + ", date=" + this.date + ", displayAs=" + this.displayAs + ", fee=" + this.fee + ", historyId=" + this.historyId + ", lot=" + this.lot + ", netAmount=" + this.netAmount + ", price=" + this.price + ", realized=" + this.realized + ", stockCode=" + this.stockCode + ", transactionType=" + this.transactionType + ")";
            }
        }

        public History(String r2, List<Detail> r3, double r4) {
            p.l(r2, Constants.KEY_DATE);
            p.l(r3, "list");
            this.date = r2;
            this.list = r3;
            this.totalRealizedAmount = r4;
        }

        public final String a() {
            return this.date;
        }

        public final List b() {
            return this.list;
        }

        public final double c() {
            return this.totalRealizedAmount;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof History) == true) goto L8;
            return false;
        L8:
            History r82 = (History) r8;
            if (p.g(this.date, r82.date) == true) goto L12;
            return false;
        L12:
            if (p.g(this.list, r82.list) == true) goto L15;
            return false;
        L15:
            if (Double.compare(this.totalRealizedAmount, r82.totalRealizedAmount) == 0) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.date.hashCode() * 31) + this.list.hashCode()) * 31) + Double.hashCode(this.totalRealizedAmount);
        }

        public String toString() {
            return "History(date=" + this.date + ", list=" + this.list + ", totalRealizedAmount=" + this.totalRealizedAmount + ")";
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u001b\u001c\u001dB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/stockbit/dto/securities/HistoryRealizedDTO$Metadata;", "", "colorCode", "Lcom/stockbit/dto/securities/HistoryRealizedDTO$Metadata$ColorCode;", "pagination", "Lcom/stockbit/dto/securities/HistoryRealizedDTO$Metadata$Pagination;", "tooltips", "Lcom/stockbit/dto/securities/HistoryRealizedDTO$Metadata$Tooltips;", "<init>", "(Lcom/stockbit/dto/securities/HistoryRealizedDTO$Metadata$ColorCode;Lcom/stockbit/dto/securities/HistoryRealizedDTO$Metadata$Pagination;Lcom/stockbit/dto/securities/HistoryRealizedDTO$Metadata$Tooltips;)V", "getColorCode", "()Lcom/stockbit/dto/securities/HistoryRealizedDTO$Metadata$ColorCode;", "getPagination", "()Lcom/stockbit/dto/securities/HistoryRealizedDTO$Metadata$Pagination;", "getTooltips", "()Lcom/stockbit/dto/securities/HistoryRealizedDTO$Metadata$Tooltips;", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "ColorCode", "Pagination", "Tooltips", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Metadata {

        @SerializedName("color_code")
        private final ColorCode colorCode;

        @SerializedName("pagination")
        private final Pagination pagination;

        @SerializedName("tooltips")
        private final Tooltips tooltips;

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/stockbit/dto/securities/HistoryRealizedDTO$Metadata$ColorCode;", "", "loss", "Lcom/stockbit/dto/securities/HistoryRealizedDTO$Metadata$ColorCode$Theme;", "profit", "<init>", "(Lcom/stockbit/dto/securities/HistoryRealizedDTO$Metadata$ColorCode$Theme;Lcom/stockbit/dto/securities/HistoryRealizedDTO$Metadata$ColorCode$Theme;)V", "getLoss", "()Lcom/stockbit/dto/securities/HistoryRealizedDTO$Metadata$ColorCode$Theme;", "getProfit", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "Theme", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ColorCode {

            @SerializedName("loss")
            private final Theme loss;

            @SerializedName("profit")
            private final Theme profit;

            @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/stockbit/dto/securities/HistoryRealizedDTO$Metadata$ColorCode$Theme;", "", "darkMode", "", "lightMode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDarkMode", "()Ljava/lang/String;", "getLightMode", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Theme {

                @SerializedName("dark_mode")
                private final String darkMode;

                @SerializedName("light_mode")
                private final String lightMode;

                public Theme(String r2, String r3) {
                    p.l(r2, "darkMode");
                    p.l(r3, "lightMode");
                    this.darkMode = r2;
                    this.lightMode = r3;
                }

                public final String a() {
                    return this.darkMode;
                }

                public final String b() {
                    return this.lightMode;
                }

                public boolean equals(Object r5) {
                    if (this != r5) goto L6;
                    return true;
                L6:
                    if ((r5 instanceof Theme) == true) goto L8;
                    return false;
                L8:
                    Theme r52 = (Theme) r5;
                    if (p.g(this.darkMode, r52.darkMode) == true) goto L12;
                    return false;
                L12:
                    if (p.g(this.lightMode, r52.lightMode) == true) goto L14;
                    return false;
                L14:
                    return true;
                }

                public int hashCode() {
                    return (this.darkMode.hashCode() * 31) + this.lightMode.hashCode();
                }

                public String toString() {
                    return "Theme(darkMode=" + this.darkMode + ", lightMode=" + this.lightMode + ")";
                }
            }

            public ColorCode(Theme r2, Theme r3) {
                p.l(r2, "loss");
                p.l(r3, "profit");
                this.loss = r2;
                this.profit = r3;
            }

            public final Theme a() {
                return this.loss;
            }

            public final Theme b() {
                return this.profit;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof ColorCode) == true) goto L8;
                return false;
            L8:
                ColorCode r52 = (ColorCode) r5;
                if (p.g(this.loss, r52.loss) == true) goto L12;
                return false;
            L12:
                if (p.g(this.profit, r52.profit) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                return (this.loss.hashCode() * 31) + this.profit.hashCode();
            }

            public String toString() {
                return "ColorCode(loss=" + this.loss + ", profit=" + this.profit + ")";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/stockbit/dto/securities/HistoryRealizedDTO$Metadata$Pagination;", "", "cursor", "Lcom/stockbit/dto/securities/HistoryRealizedDTO$Metadata$Pagination$Cursor;", "maxPage", "", "<init>", "(Lcom/stockbit/dto/securities/HistoryRealizedDTO$Metadata$Pagination$Cursor;J)V", "getCursor", "()Lcom/stockbit/dto/securities/HistoryRealizedDTO$Metadata$Pagination$Cursor;", "getMaxPage", "()J", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "Cursor", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Pagination {

            @SerializedName("cursor")
            private final Cursor cursor;

            @SerializedName("max_page")
            private final long maxPage;

            @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/stockbit/dto/securities/HistoryRealizedDTO$Metadata$Pagination$Cursor;", "", "next", "", "prev", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getNext", "()Ljava/lang/String;", "getPrev", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Cursor {

                @SerializedName("next")
                private final String next;

                @SerializedName("prev")
                private final String prev;

                public Cursor(String r2, String r3) {
                    p.l(r2, "next");
                    p.l(r3, "prev");
                    this.next = r2;
                    this.prev = r3;
                }

                public final String a() {
                    return this.next;
                }

                public final String b() {
                    return this.prev;
                }

                public boolean equals(Object r5) {
                    if (this != r5) goto L6;
                    return true;
                L6:
                    if ((r5 instanceof Cursor) == true) goto L8;
                    return false;
                L8:
                    Cursor r52 = (Cursor) r5;
                    if (p.g(this.next, r52.next) == true) goto L12;
                    return false;
                L12:
                    if (p.g(this.prev, r52.prev) == true) goto L14;
                    return false;
                L14:
                    return true;
                }

                public int hashCode() {
                    return (this.next.hashCode() * 31) + this.prev.hashCode();
                }

                public String toString() {
                    return "Cursor(next=" + this.next + ", prev=" + this.prev + ")";
                }
            }

            public Pagination(Cursor r2, long r3) {
                p.l(r2, "cursor");
                this.cursor = r2;
                this.maxPage = r3;
            }

            public final Cursor a() {
                return this.cursor;
            }

            public final long b() {
                return this.maxPage;
            }

            public boolean equals(Object r8) {
                if (this != r8) goto L6;
                return true;
            L6:
                if ((r8 instanceof Pagination) == true) goto L8;
                return false;
            L8:
                Pagination r82 = (Pagination) r8;
                if (p.g(this.cursor, r82.cursor) == true) goto L12;
                return false;
            L12:
                if (this.maxPage == r82.maxPage) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                return (this.cursor.hashCode() * 31) + Long.hashCode(this.maxPage);
            }

            public String toString() {
                return "Pagination(cursor=" + this.cursor + ", maxPage=" + this.maxPage + ")";
            }
        }

        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0006HÖ\u0081\u0004R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/stockbit/dto/securities/HistoryRealizedDTO$Metadata$Tooltips;", "", "contents", "", "Lcom/stockbit/dto/securities/HistoryRealizedDTO$Metadata$Tooltips$Content;", "header", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getContents", "()Ljava/util/List;", "getHeader", "()Ljava/lang/String;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Content", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Tooltips {

            @SerializedName("contents")
            private final List<Content> contents;

            @SerializedName("header")
            private final String header;

            @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/stockbit/dto/securities/HistoryRealizedDTO$Metadata$Tooltips$Content;", "", "body", "", Constants.KEY_TITLE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBody", "()Ljava/lang/String;", "getTitle", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Content {

                @SerializedName("body")
                private final String body;

                @SerializedName(Constants.KEY_TITLE)
                private final String title;

                public Content(String r2, String r3) {
                    p.l(r2, "body");
                    p.l(r3, Constants.KEY_TITLE);
                    this.body = r2;
                    this.title = r3;
                }

                public final String a() {
                    return this.body;
                }

                public final String b() {
                    return this.title;
                }

                public boolean equals(Object r5) {
                    if (this != r5) goto L6;
                    return true;
                L6:
                    if ((r5 instanceof Content) == true) goto L8;
                    return false;
                L8:
                    Content r52 = (Content) r5;
                    if (p.g(this.body, r52.body) == true) goto L12;
                    return false;
                L12:
                    if (p.g(this.title, r52.title) == true) goto L14;
                    return false;
                L14:
                    return true;
                }

                public int hashCode() {
                    return (this.body.hashCode() * 31) + this.title.hashCode();
                }

                public String toString() {
                    return "Content(body=" + this.body + ", title=" + this.title + ")";
                }
            }

            public Tooltips(List<Content> r2, String r3) {
                p.l(r2, "contents");
                p.l(r3, "header");
                this.contents = r2;
                this.header = r3;
            }

            public final List a() {
                return this.contents;
            }

            public final String b() {
                return this.header;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof Tooltips) == true) goto L8;
                return false;
            L8:
                Tooltips r52 = (Tooltips) r5;
                if (p.g(this.contents, r52.contents) == true) goto L12;
                return false;
            L12:
                if (p.g(this.header, r52.header) == true) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                return (this.contents.hashCode() * 31) + this.header.hashCode();
            }

            public String toString() {
                return "Tooltips(contents=" + this.contents + ", header=" + this.header + ")";
            }
        }

        public Metadata(ColorCode r2, Pagination r3, Tooltips r4) {
            p.l(r2, "colorCode");
            p.l(r3, "pagination");
            p.l(r4, "tooltips");
            this.colorCode = r2;
            this.pagination = r3;
            this.tooltips = r4;
        }

        public final ColorCode a() {
            return this.colorCode;
        }

        public final Pagination b() {
            return this.pagination;
        }

        public final Tooltips c() {
            return this.tooltips;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof Metadata) == true) goto L8;
            return false;
        L8:
            Metadata r52 = (Metadata) r5;
            if (p.g(this.colorCode, r52.colorCode) == true) goto L12;
            return false;
        L12:
            if (p.g(this.pagination, r52.pagination) == true) goto L15;
            return false;
        L15:
            if (p.g(this.tooltips, r52.tooltips) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.colorCode.hashCode() * 31) + this.pagination.hashCode()) * 31) + this.tooltips.hashCode();
        }

        public String toString() {
            return "Metadata(colorCode=" + this.colorCode + ", pagination=" + this.pagination + ", tooltips=" + this.tooltips + ")";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stockbit/dto/securities/HistoryRealizedDTO$Summary;", "", "realized", "Lcom/stockbit/dto/securities/HistoryRealizedDTO$Summary$Realized;", "<init>", "(Lcom/stockbit/dto/securities/HistoryRealizedDTO$Summary$Realized;)V", "getRealized", "()Lcom/stockbit/dto/securities/HistoryRealizedDTO$Summary$Realized;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "Realized", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Summary {

        @SerializedName("realized")
        private final Realized realized;

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/stockbit/dto/securities/HistoryRealizedDTO$Summary$Realized;", "", "amount", "", "percentage", "<init>", "(DD)V", "getAmount", "()D", "getPercentage", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Realized {

            @SerializedName("amount")
            private final double amount;

            @SerializedName("percentage")
            private final double percentage;

            public Realized(double r1, double r3) {
                this.amount = r1;
                this.percentage = r3;
            }

            public final double a() {
                return this.amount;
            }

            public final double b() {
                return this.percentage;
            }

            public boolean equals(Object r8) {
                if (this != r8) goto L6;
                return true;
            L6:
                if ((r8 instanceof Realized) == true) goto L8;
                return false;
            L8:
                Realized r82 = (Realized) r8;
                if (Double.compare(this.amount, r82.amount) == 0) goto L12;
                return false;
            L12:
                if (Double.compare(this.percentage, r82.percentage) == 0) goto L14;
                return false;
            L14:
                return true;
            }

            public int hashCode() {
                return (Double.hashCode(this.amount) * 31) + Double.hashCode(this.percentage);
            }

            public String toString() {
                return "Realized(amount=" + this.amount + ", percentage=" + this.percentage + ")";
            }
        }

        public Summary(Realized r2) {
            p.l(r2, "realized");
            this.realized = r2;
        }

        public final Realized a() {
            return this.realized;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof Summary) == true) goto L9;
            return false;
        L9:
            if (p.g(this.realized, ((Summary) r4).realized) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.realized.hashCode();
        }

        public String toString() {
            return "Summary(realized=" + this.realized + ")";
        }
    }

    public HistoryRealizedDTO(List<History> r2, Metadata r3, Summary r4) {
        p.l(r2, "history");
        p.l(r3, "metadata");
        p.l(r4, "summary");
        this.history = r2;
        this.metadata = r3;
        this.summary = r4;
    }

    public final List a() {
        return this.history;
    }

    public final Metadata b() {
        return this.metadata;
    }

    public final Summary c() {
        return this.summary;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof HistoryRealizedDTO) == true) goto L8;
        return false;
    L8:
        HistoryRealizedDTO r52 = (HistoryRealizedDTO) r5;
        if (p.g(this.history, r52.history) == true) goto L12;
        return false;
    L12:
        if (p.g(this.metadata, r52.metadata) == true) goto L15;
        return false;
    L15:
        if (p.g(this.summary, r52.summary) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.history.hashCode() * 31) + this.metadata.hashCode()) * 31) + this.summary.hashCode();
    }

    public String toString() {
        return "HistoryRealizedDTO(history=" + this.history + ", metadata=" + this.metadata + ", summary=" + this.summary + ")";
    }
}
