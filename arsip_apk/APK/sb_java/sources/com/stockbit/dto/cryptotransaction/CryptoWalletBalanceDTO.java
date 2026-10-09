package com.stockbit.dto.cryptotransaction;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/stockbit/dto/cryptotransaction/CryptoWalletBalanceDTO;", "", "coinSymbol", "", "availableQty", "", "lockedQty", "avgBuyPrice", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getCoinSymbol", "()Ljava/lang/String;", "getAvailableQty", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLockedQty", "getAvgBuyPrice", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/stockbit/dto/cryptotransaction/CryptoWalletBalanceDTO;", "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CryptoWalletBalanceDTO {

    @SerializedName("available_qty")
    private final Double availableQty;

    @SerializedName("avg_buy_price")
    private final Double avgBuyPrice;

    @SerializedName("coin_symbol")
    private final String coinSymbol;

    @SerializedName("locked_qty")
    private final Double lockedQty;

    public CryptoWalletBalanceDTO() {
        String r1 = null;
        Double r2 = null;
        Double r3 = null;
        Double r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    public final Double a() {
        return this.availableQty;
    }

    public final Double b() {
        return this.avgBuyPrice;
    }

    public final String c() {
        return this.coinSymbol;
    }

    public final Double d() {
        return this.lockedQty;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CryptoWalletBalanceDTO) == true) goto L8;
        return false;
    L8:
        CryptoWalletBalanceDTO r52 = (CryptoWalletBalanceDTO) r5;
        if (p.g(this.coinSymbol, r52.coinSymbol) == true) goto L12;
        return false;
    L12:
        if (p.g(this.availableQty, r52.availableQty) == true) goto L15;
        return false;
    L15:
        if (p.g(this.lockedQty, r52.lockedQty) == true) goto L18;
        return false;
    L18:
        if (p.g(this.avgBuyPrice, r52.avgBuyPrice) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        String r02 = this.coinSymbol;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Double r2 = this.availableQty;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Double r23 = this.lockedQty;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Double r25 = this.avgBuyPrice;
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
        return "CryptoWalletBalanceDTO(coinSymbol=" + this.coinSymbol + ", availableQty=" + this.availableQty + ", lockedQty=" + this.lockedQty + ", avgBuyPrice=" + this.avgBuyPrice + ")";
    }

    public CryptoWalletBalanceDTO(String r1, Double r2, Double r3, Double r4) {
        this.coinSymbol = r1;
        this.availableQty = r2;
        this.lockedQty = r3;
        this.avgBuyPrice = r4;
    }

    public /* synthetic */ CryptoWalletBalanceDTO(String r2, Double r3, Double r4, Double r5, int r6, i r7) {
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
