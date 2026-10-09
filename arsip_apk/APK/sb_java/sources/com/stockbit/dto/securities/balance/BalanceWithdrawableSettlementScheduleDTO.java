package com.stockbit.dto.securities.balance;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0005HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/stockbit/dto/securities/balance/BalanceWithdrawableSettlementScheduleDTO;", "", "balance", "", "formattedDate", "", Constants.KEY_TITLE, "<init>", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "getBalance", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getFormattedDate", "()Ljava/lang/String;", "getTitle", "component1", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lcom/stockbit/dto/securities/balance/BalanceWithdrawableSettlementScheduleDTO;", "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BalanceWithdrawableSettlementScheduleDTO {

    @SerializedName("balance")
    private final Double balance;

    @SerializedName("formatted_date")
    private final String formattedDate;

    @SerializedName(Constants.KEY_TITLE)
    private final String title;

    public BalanceWithdrawableSettlementScheduleDTO() {
        Double r1 = null;
        String r2 = null;
        String r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public final Double a() {
        return this.balance;
    }

    public final String b() {
        return this.formattedDate;
    }

    public final String c() {
        return this.title;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BalanceWithdrawableSettlementScheduleDTO) == true) goto L8;
        return false;
    L8:
        BalanceWithdrawableSettlementScheduleDTO r52 = (BalanceWithdrawableSettlementScheduleDTO) r5;
        if (p.g(this.balance, r52.balance) == true) goto L12;
        return false;
    L12:
        if (p.g(this.formattedDate, r52.formattedDate) == true) goto L15;
        return false;
    L15:
        if (p.g(this.title, r52.title) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        Double r02 = this.balance;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.formattedDate;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.title;
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
        return "BalanceWithdrawableSettlementScheduleDTO(balance=" + this.balance + ", formattedDate=" + this.formattedDate + ", title=" + this.title + ")";
    }

    public BalanceWithdrawableSettlementScheduleDTO(Double r1, String r2, String r3) {
        this.balance = r1;
        this.formattedDate = r2;
        this.title = r3;
    }

    public /* synthetic */ BalanceWithdrawableSettlementScheduleDTO(Double r2, String r3, String r4, int r5, i r6) {
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
