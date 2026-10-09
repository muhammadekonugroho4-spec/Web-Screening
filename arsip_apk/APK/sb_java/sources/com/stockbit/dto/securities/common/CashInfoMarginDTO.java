package com.stockbit.dto.securities.common;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0005HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0011\u0010\fR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, d2 = {"Lcom/stockbit/dto/securities/common/CashInfoMarginDTO;", "", "buyingPower", "", NotificationCompat.CATEGORY_STATUS, "", "tradingBalance", "totalDebt", "totalCollateral", "<init>", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getBuyingPower", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getStatus", "()Ljava/lang/String;", "getTradingBalance", "getTotalDebt", "getTotalCollateral", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/stockbit/dto/securities/common/CashInfoMarginDTO;", "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CashInfoMarginDTO {

    @SerializedName("buying_power")
    private final Double buyingPower;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final String status;

    @SerializedName("total_collateral")
    private final Double totalCollateral;

    @SerializedName("total_debt")
    private final Double totalDebt;

    @SerializedName("trading_balance")
    private final Double tradingBalance;

    public CashInfoMarginDTO() {
        Double r1 = null;
        String r2 = null;
        Double r3 = null;
        Double r4 = null;
        Double r5 = null;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    public final Double a() {
        return this.buyingPower;
    }

    public final Double b() {
        return this.totalCollateral;
    }

    public final Double c() {
        return this.totalDebt;
    }

    public final Double d() {
        return this.tradingBalance;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CashInfoMarginDTO) == true) goto L8;
        return false;
    L8:
        CashInfoMarginDTO r52 = (CashInfoMarginDTO) r5;
        if (p.g(this.buyingPower, r52.buyingPower) == true) goto L12;
        return false;
    L12:
        if (p.g(this.status, r52.status) == true) goto L15;
        return false;
    L15:
        if (p.g(this.tradingBalance, r52.tradingBalance) == true) goto L18;
        return false;
    L18:
        if (p.g(this.totalDebt, r52.totalDebt) == true) goto L21;
        return false;
    L21:
        if (p.g(this.totalCollateral, r52.totalCollateral) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        Double r02 = this.buyingPower;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.status;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Double r23 = this.tradingBalance;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Double r25 = this.totalDebt;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        Double r27 = this.totalCollateral;
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
        return "CashInfoMarginDTO(buyingPower=" + this.buyingPower + ", status=" + this.status + ", tradingBalance=" + this.tradingBalance + ", totalDebt=" + this.totalDebt + ", totalCollateral=" + this.totalCollateral + ")";
    }

    public CashInfoMarginDTO(Double r1, String r2, Double r3, Double r4, Double r5) {
        this.buyingPower = r1;
        this.status = r2;
        this.tradingBalance = r3;
        this.totalDebt = r4;
        this.totalCollateral = r5;
    }

    public /* synthetic */ CashInfoMarginDTO(Double r2, String r3, Double r4, Double r5, Double r6, int r7, i r8) {
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
        Double r72 = null;
    L17:
        Double r62 = r5;
        Double r52 = r4;
        this(r2, r3, r52, r62, r72);
        return;
    L18:
        r72 = r6;
        goto L17
    }
}
