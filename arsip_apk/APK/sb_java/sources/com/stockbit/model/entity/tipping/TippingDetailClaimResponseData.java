package com.stockbit.model.entity.tipping;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\fHÆ\u0003J]\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0014\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00101\u001a\u00020\nHÖ\u0081\u0004J\n\u00102\u001a\u00020\fHÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR \u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!¨\u00063"}, d2 = {"Lcom/stockbit/model/entity/tipping/TippingDetailClaimResponseData;", "", "amount", "Lcom/stockbit/model/entity/tipping/TippingDetailAmountResponseData;", "percentFee", "", "claimAmount", "amountFee", "totalAmount", "statusFee", "", NotificationCompat.CATEGORY_STATUS, "", Constants.KEY_DATE, "<init>", "(Lcom/stockbit/model/entity/tipping/TippingDetailAmountResponseData;DDDDILjava/lang/String;Ljava/lang/String;)V", "getAmount", "()Lcom/stockbit/model/entity/tipping/TippingDetailAmountResponseData;", "getPercentFee", "()D", "setPercentFee", "(D)V", "getClaimAmount", "setClaimAmount", "getAmountFee", "setAmountFee", "getTotalAmount", "setTotalAmount", "getStatusFee", "()I", "setStatusFee", "(I)V", "getStatus", "()Ljava/lang/String;", "setStatus", "(Ljava/lang/String;)V", "getDate", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TippingDetailClaimResponseData {

    @SerializedName("amount")
    private final TippingDetailAmountResponseData amount;

    @SerializedName("amount_fee")
    private double amountFee;

    @SerializedName("claim_amount")
    private double claimAmount;

    @SerializedName(Constants.KEY_DATE)
    private final String date;

    @SerializedName("percent_fee")
    private double percentFee;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private String status;

    @SerializedName("status_fee")
    private int statusFee;

    @SerializedName("total_amount")
    private double totalAmount;

    public TippingDetailClaimResponseData(TippingDetailAmountResponseData r2, double r3, double r5, double r7, double r9, int r11, String r12, String r13) {
        p.l(r2, "amount");
        this.amount = r2;
        this.percentFee = r3;
        this.claimAmount = r5;
        this.amountFee = r7;
        this.totalAmount = r9;
        this.statusFee = r11;
        this.status = r12;
        this.date = r13;
    }

    public final TippingDetailAmountResponseData a() {
        return this.amount;
    }

    public final String b() {
        return this.date;
    }

    public final String c() {
        return this.status;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof TippingDetailClaimResponseData) == true) goto L8;
        return false;
    L8:
        TippingDetailClaimResponseData r82 = (TippingDetailClaimResponseData) r8;
        if (p.g(this.amount, r82.amount) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.percentFee, r82.percentFee) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.claimAmount, r82.claimAmount) == 0) goto L18;
        return false;
    L18:
        if (Double.compare(this.amountFee, r82.amountFee) == 0) goto L21;
        return false;
    L21:
        if (Double.compare(this.totalAmount, r82.totalAmount) == 0) goto L24;
        return false;
    L24:
        if (this.statusFee == r82.statusFee) goto L27;
        return false;
    L27:
        if (p.g(this.status, r82.status) == true) goto L30;
        return false;
    L30:
        if (p.g(this.date, r82.date) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public int hashCode() {
        int r02 = ((((((((((this.amount.hashCode() * 31) + Double.hashCode(this.percentFee)) * 31) + Double.hashCode(this.claimAmount)) * 31) + Double.hashCode(this.amountFee)) * 31) + Double.hashCode(this.totalAmount)) * 31) + Integer.hashCode(this.statusFee)) * 31;
        String r1 = this.status;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.date;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "TippingDetailClaimResponseData(amount=" + this.amount + ", percentFee=" + this.percentFee + ", claimAmount=" + this.claimAmount + ", amountFee=" + this.amountFee + ", totalAmount=" + this.totalAmount + ", statusFee=" + this.statusFee + ", status=" + this.status + ", date=" + this.date + ')';
    }

    public /* synthetic */ TippingDetailClaimResponseData(TippingDetailAmountResponseData r17, double r18, double r20, double r22, double r24, int r26, String r27, String r28, int r29, i r30) {
        if ((r29 & 2) == 0) goto L5;
        double r5 = 0.0d;
    L7:
        if ((r29 & 4) == 0) goto L9;
        double r7 = 0.0d;
    L11:
        if ((r29 & 8) == 0) goto L13;
        double r9 = 0.0d;
    L15:
        if ((r29 & 16) == 0) goto L17;
        double r11 = 0.0d;
    L19:
        if ((r29 & 32) == 0) goto L22;
        int r13 = 0;
    L23:
        this(r17, r5, r7, r9, r11, r13, r27, r28);
        return;
    L22:
        r13 = r26;
        goto L23
    L17:
        r11 = r24;
        goto L19
    L13:
        r9 = r22;
        goto L15
    L9:
        r7 = r20;
        goto L11
    L5:
        r5 = r18;
        goto L7
    }
}
