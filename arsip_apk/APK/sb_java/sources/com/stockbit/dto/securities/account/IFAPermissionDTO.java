package com.stockbit.dto.securities.account;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJJ\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0014\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/stockbit/dto/securities/account/IFAPermissionDTO;", "", "stockTransferIn", "", "stockTransferOut", "cashTransferIn", "cashTransferOut", "withdrawal", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getStockTransferIn", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getStockTransferOut", "getCashTransferIn", "getCashTransferOut", "getWithdrawal", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/stockbit/dto/securities/account/IFAPermissionDTO;", "equals", "other", "hashCode", "", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IFAPermissionDTO {

    @SerializedName("cash_transfer_in")
    private final Boolean cashTransferIn;

    @SerializedName("cash_transfer_out")
    private final Boolean cashTransferOut;

    @SerializedName("stock_transfer_in")
    private final Boolean stockTransferIn;

    @SerializedName("stock_transfer_out")
    private final Boolean stockTransferOut;

    @SerializedName("withdrawal")
    private final Boolean withdrawal;

    public IFAPermissionDTO() {
        Boolean r1 = null;
        Boolean r2 = null;
        Boolean r3 = null;
        Boolean r4 = null;
        Boolean r5 = null;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    public final Boolean a() {
        return this.cashTransferIn;
    }

    public final Boolean b() {
        return this.cashTransferOut;
    }

    public final Boolean c() {
        return this.stockTransferIn;
    }

    public final Boolean d() {
        return this.stockTransferOut;
    }

    public final Boolean e() {
        return this.withdrawal;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof IFAPermissionDTO) == true) goto L8;
        return false;
    L8:
        IFAPermissionDTO r52 = (IFAPermissionDTO) r5;
        if (p.g(this.stockTransferIn, r52.stockTransferIn) == true) goto L12;
        return false;
    L12:
        if (p.g(this.stockTransferOut, r52.stockTransferOut) == true) goto L15;
        return false;
    L15:
        if (p.g(this.cashTransferIn, r52.cashTransferIn) == true) goto L18;
        return false;
    L18:
        if (p.g(this.cashTransferOut, r52.cashTransferOut) == true) goto L21;
        return false;
    L21:
        if (p.g(this.withdrawal, r52.withdrawal) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        Boolean r02 = this.stockTransferIn;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Boolean r2 = this.stockTransferOut;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Boolean r23 = this.cashTransferIn;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Boolean r25 = this.cashTransferOut;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        Boolean r27 = this.withdrawal;
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
        return "IFAPermissionDTO(stockTransferIn=" + this.stockTransferIn + ", stockTransferOut=" + this.stockTransferOut + ", cashTransferIn=" + this.cashTransferIn + ", cashTransferOut=" + this.cashTransferOut + ", withdrawal=" + this.withdrawal + ")";
    }

    public IFAPermissionDTO(Boolean r1, Boolean r2, Boolean r3, Boolean r4, Boolean r5) {
        this.stockTransferIn = r1;
        this.stockTransferOut = r2;
        this.cashTransferIn = r3;
        this.cashTransferOut = r4;
        this.withdrawal = r5;
    }

    public /* synthetic */ IFAPermissionDTO(Boolean r2, Boolean r3, Boolean r4, Boolean r5, Boolean r6, int r7, i r8) {
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
        Boolean r72 = null;
    L17:
        Boolean r62 = r5;
        Boolean r52 = r4;
        this(r2, r3, r52, r62, r72);
        return;
    L18:
        r72 = r6;
        goto L17
    }
}
