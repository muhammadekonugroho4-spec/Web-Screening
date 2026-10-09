package com.stockbit.dto.securities.corpact;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/stockbit/dto/securities/corpact/CorpactStockDividendDTO;", "", "shares", "Ljava/math/BigDecimal;", "dividendAmount", FirebaseAnalytics.Param.PRICE, "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getShares", "()Ljava/math/BigDecimal;", "getDividendAmount", "getPrice", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CorpactStockDividendDTO {

    @SerializedName("dividend_amount")
    private final BigDecimal dividendAmount;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private final BigDecimal price;

    @SerializedName("shares")
    private final BigDecimal shares;

    public CorpactStockDividendDTO() {
        BigDecimal r1 = null;
        BigDecimal r2 = null;
        BigDecimal r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public final BigDecimal a() {
        return this.dividendAmount;
    }

    public final BigDecimal b() {
        return this.price;
    }

    public final BigDecimal c() {
        return this.shares;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CorpactStockDividendDTO) == true) goto L8;
        return false;
    L8:
        CorpactStockDividendDTO r52 = (CorpactStockDividendDTO) r5;
        if (p.g(this.shares, r52.shares) == true) goto L12;
        return false;
    L12:
        if (p.g(this.dividendAmount, r52.dividendAmount) == true) goto L15;
        return false;
    L15:
        if (p.g(this.price, r52.price) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        BigDecimal r02 = this.shares;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        BigDecimal r2 = this.dividendAmount;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        BigDecimal r23 = this.price;
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
        return "CorpactStockDividendDTO(shares=" + this.shares + ", dividendAmount=" + this.dividendAmount + ", price=" + this.price + ")";
    }

    public CorpactStockDividendDTO(BigDecimal r1, BigDecimal r2, BigDecimal r3) {
        this.shares = r1;
        this.dividendAmount = r2;
        this.price = r3;
    }

    public /* synthetic */ CorpactStockDividendDTO(BigDecimal r2, BigDecimal r3, BigDecimal r4, int r5, i r6) {
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
