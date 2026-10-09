package com.stockbit.remote.models.request.intraservice;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0019B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/stockbit/remote/models/request/intraservice/MoveStockRequest;", "", "fromAccNo", "", "toAccNo", "stocksData", "", "Lcom/stockbit/remote/models/request/intraservice/MoveStockRequest$MoveStockData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getFromAccNo", "()Ljava/lang/String;", "getToAccNo", "getStocksData", "()Ljava/util/List;", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "MoveStockData", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MoveStockRequest {

    @SerializedName("from_acc_no")
    private final String fromAccNo;

    @SerializedName("stocks_data")
    private final List<MoveStockData> stocksData;

    @SerializedName("to_acc_no")
    private final String toAccNo;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/stockbit/remote/models/request/intraservice/MoveStockRequest$MoveStockData;", "", "stockCode", "", "shares", "", "<init>", "(Ljava/lang/String;I)V", "getStockCode", "()Ljava/lang/String;", "getShares", "()I", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class MoveStockData {

        @SerializedName("shares")
        private final int shares;

        @SerializedName("stock_code")
        private final String stockCode;

        public MoveStockData(String r2, int r3) {
            p.l(r2, "stockCode");
            this.stockCode = r2;
            this.shares = r3;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof MoveStockData) == true) goto L8;
            return false;
        L8:
            MoveStockData r52 = (MoveStockData) r5;
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
            return "MoveStockData(stockCode=" + this.stockCode + ", shares=" + this.shares + ')';
        }
    }

    public MoveStockRequest(String r2, String r3, List<MoveStockData> r4) {
        p.l(r2, "fromAccNo");
        p.l(r3, "toAccNo");
        p.l(r4, "stocksData");
        this.fromAccNo = r2;
        this.toAccNo = r3;
        this.stocksData = r4;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof MoveStockRequest) == true) goto L8;
        return false;
    L8:
        MoveStockRequest r52 = (MoveStockRequest) r5;
        if (p.g(this.fromAccNo, r52.fromAccNo) == true) goto L12;
        return false;
    L12:
        if (p.g(this.toAccNo, r52.toAccNo) == true) goto L15;
        return false;
    L15:
        if (p.g(this.stocksData, r52.stocksData) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.fromAccNo.hashCode() * 31) + this.toAccNo.hashCode()) * 31) + this.stocksData.hashCode();
    }

    public String toString() {
        return "MoveStockRequest(fromAccNo=" + this.fromAccNo + ", toAccNo=" + this.toAccNo + ", stocksData=" + this.stocksData + ')';
    }
}
