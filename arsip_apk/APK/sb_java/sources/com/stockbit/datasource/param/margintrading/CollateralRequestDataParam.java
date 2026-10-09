package com.stockbit.datasource.param.margintrading;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC11777v;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u0012\u0013\u0014B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/stockbit/datasource/param/margintrading/CollateralRequestDataParam;", "", "collaterals", "", "Lcom/stockbit/datasource/param/margintrading/CollateralRequestDataParam$CollateralRequestData;", "<init>", "(Ljava/util/List;)V", "getCollaterals", "()Ljava/util/List;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "CollateralRequestData", "CollateralCashRequest", "CollateralStockRequest", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CollateralRequestDataParam {

    @SerializedName("collaterals")
    private final List<CollateralRequestData> collaterals;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/stockbit/datasource/param/margintrading/CollateralRequestDataParam$CollateralCashRequest;", "", "amount", "", "<init>", "(J)V", "getAmount", "()J", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CollateralCashRequest {

        @SerializedName("amount")
        private final long amount;

        public CollateralCashRequest(long r1) {
            this.amount = r1;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof CollateralCashRequest) == true) goto L9;
            return false;
        L9:
            if (this.amount == ((CollateralCashRequest) r8).amount) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Long.hashCode(this.amount);
        }

        public String toString() {
            return "CollateralCashRequest(amount=" + this.amount + ")";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/stockbit/datasource/param/margintrading/CollateralRequestDataParam$CollateralRequestData;", "", "accountNumber", "", "cash", "Lcom/stockbit/datasource/param/margintrading/CollateralRequestDataParam$CollateralCashRequest;", "stocks", "", "Lcom/stockbit/datasource/param/margintrading/CollateralRequestDataParam$CollateralStockRequest;", "<init>", "(Ljava/lang/String;Lcom/stockbit/datasource/param/margintrading/CollateralRequestDataParam$CollateralCashRequest;Ljava/util/List;)V", "getAccountNumber", "()Ljava/lang/String;", "getCash", "()Lcom/stockbit/datasource/param/margintrading/CollateralRequestDataParam$CollateralCashRequest;", "getStocks", "()Ljava/util/List;", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CollateralRequestData {

        @SerializedName("account_number")
        private final String accountNumber;

        @SerializedName("cash")
        private final CollateralCashRequest cash;

        @SerializedName("stocks")
        private final List<CollateralStockRequest> stocks;

        public CollateralRequestData(String r2, CollateralCashRequest r3, List<CollateralStockRequest> r4) {
            p.l(r2, "accountNumber");
            p.l(r3, "cash");
            p.l(r4, "stocks");
            this.accountNumber = r2;
            this.cash = r3;
            this.stocks = r4;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof CollateralRequestData) == true) goto L8;
            return false;
        L8:
            CollateralRequestData r52 = (CollateralRequestData) r5;
            if (p.g(this.accountNumber, r52.accountNumber) == true) goto L12;
            return false;
        L12:
            if (p.g(this.cash, r52.cash) == true) goto L15;
            return false;
        L15:
            if (p.g(this.stocks, r52.stocks) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.accountNumber.hashCode() * 31) + this.cash.hashCode()) * 31) + this.stocks.hashCode();
        }

        public String toString() {
            return "CollateralRequestData(accountNumber=" + this.accountNumber + ", cash=" + this.cash + ", stocks=" + this.stocks + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/stockbit/datasource/param/margintrading/CollateralRequestDataParam$CollateralStockRequest;", "", "stockCode", "", "shares", "", "<init>", "(Ljava/lang/String;I)V", "getStockCode", "()Ljava/lang/String;", "getShares", "()I", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CollateralStockRequest {

        @SerializedName("shares")
        private final int shares;

        @SerializedName("stock_code")
        private final String stockCode;

        public CollateralStockRequest(String r2, int r3) {
            p.l(r2, "stockCode");
            this.stockCode = r2;
            this.shares = r3;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof CollateralStockRequest) == true) goto L8;
            return false;
        L8:
            CollateralStockRequest r52 = (CollateralStockRequest) r5;
            if (p.g(this.stockCode, r52.stockCode) == true) goto L12;
            return false;
        L12:
            if (this.shares == r52.shares) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.stockCode.hashCode() * 31) + Integer.hashCode(this.shares);
        }

        public String toString() {
            return "CollateralStockRequest(stockCode=" + this.stockCode + ", shares=" + this.shares + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CollateralRequestDataParam() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof CollateralRequestDataParam) == true) goto L9;
        return false;
    L9:
        if (p.g(this.collaterals, ((CollateralRequestDataParam) r4).collaterals) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.collaterals.hashCode();
    }

    public String toString() {
        return "CollateralRequestDataParam(collaterals=" + this.collaterals + ")";
    }

    public CollateralRequestDataParam(List<CollateralRequestData> r2) {
        p.l(r2, "collaterals");
        this.collaterals = r2;
    }

    public /* synthetic */ CollateralRequestDataParam(List r1, int r2, i r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = AbstractC11777v.o();
    L5:
        this(r1);
    }
}
