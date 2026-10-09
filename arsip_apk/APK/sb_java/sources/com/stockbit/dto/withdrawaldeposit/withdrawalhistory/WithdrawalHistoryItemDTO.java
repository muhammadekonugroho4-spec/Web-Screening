package com.stockbit.dto.withdrawaldeposit.withdrawalhistory;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b-\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B£\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010%J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jª\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00109J\u0014\u0010:\u001a\u00020\u000f2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010<\u001a\u00020=HÖ\u0081\u0004J\n\u0010>\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\"\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010!R \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010$R\"\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b\u000e\u0010%\"\u0004\b&\u0010'R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0015R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0015¨\u0006?"}, d2 = {"Lcom/stockbit/dto/withdrawaldeposit/withdrawalhistory/WithdrawalHistoryItemDTO;", "", Constants.KEY_ID, "", "requestDate", "amountTransferred", "", "amountRequested", NotificationCompat.CATEGORY_STATUS, "bankName", "bankAccNo", "updatedDate", "transferFee", "transferType", "isHideTransferType", "", "referenceId", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getRequestDate", "getAmountTransferred", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAmountRequested", "getStatus", "getBankName", "getBankAccNo", "getUpdatedDate", "getTransferFee", "setTransferFee", "(Ljava/lang/Double;)V", "getTransferType", "setTransferType", "(Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "setHideTransferType", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getReferenceId", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/stockbit/dto/withdrawaldeposit/withdrawalhistory/WithdrawalHistoryItemDTO;", "equals", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WithdrawalHistoryItemDTO {

    @SerializedName("amount_requested")
    private final Double amountRequested;

    @SerializedName("amount_transferred")
    private final Double amountTransferred;

    @SerializedName("bank_acc_no")
    private final String bankAccNo;

    @SerializedName("bank_name")
    private final String bankName;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(Constants.KEY_ID)
    private final String f88720id;

    @SerializedName("is_hide_transfer_fee")
    private Boolean isHideTransferType;

    @SerializedName("reference_id")
    private final String referenceId;

    @SerializedName("request_date")
    private final String requestDate;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final String status;

    @SerializedName("transfer_fee")
    private Double transferFee;

    @SerializedName("transfer_type")
    private String transferType;

    @SerializedName("type")
    private final String type;

    @SerializedName("updated_date")
    private final String updatedDate;

    public WithdrawalHistoryItemDTO() {
        String r1 = null;
        String r2 = null;
        Double r3 = null;
        Double r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        Double r9 = null;
        String r10 = null;
        Boolean r11 = null;
        String r12 = null;
        String r13 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, 8191, null);
    }

    public final Double a() {
        return this.amountRequested;
    }

    public final Double b() {
        return this.amountTransferred;
    }

    public final String c() {
        return this.bankAccNo;
    }

    public final String d() {
        return this.bankName;
    }

    public final String e() {
        return this.referenceId;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof WithdrawalHistoryItemDTO) == true) goto L8;
        return false;
    L8:
        WithdrawalHistoryItemDTO r52 = (WithdrawalHistoryItemDTO) r5;
        if (p.g(this.f88720id, r52.f88720id) == true) goto L12;
        return false;
    L12:
        if (p.g(this.requestDate, r52.requestDate) == true) goto L15;
        return false;
    L15:
        if (p.g(this.amountTransferred, r52.amountTransferred) == true) goto L18;
        return false;
    L18:
        if (p.g(this.amountRequested, r52.amountRequested) == true) goto L21;
        return false;
    L21:
        if (p.g(this.status, r52.status) == true) goto L24;
        return false;
    L24:
        if (p.g(this.bankName, r52.bankName) == true) goto L27;
        return false;
    L27:
        if (p.g(this.bankAccNo, r52.bankAccNo) == true) goto L30;
        return false;
    L30:
        if (p.g(this.updatedDate, r52.updatedDate) == true) goto L33;
        return false;
    L33:
        if (p.g(this.transferFee, r52.transferFee) == true) goto L36;
        return false;
    L36:
        if (p.g(this.transferType, r52.transferType) == true) goto L39;
        return false;
    L39:
        if (p.g(this.isHideTransferType, r52.isHideTransferType) == true) goto L42;
        return false;
    L42:
        if (p.g(this.referenceId, r52.referenceId) == true) goto L45;
        return false;
    L45:
        if (p.g(this.type, r52.type) == true) goto L47;
        return false;
    L47:
        return true;
    }

    public final String f() {
        return this.requestDate;
    }

    public final String g() {
        return this.status;
    }

    public final Double h() {
        return this.transferFee;
    }

    public int hashCode() {
        String r02 = this.f88720id;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.requestDate;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Double r23 = this.amountTransferred;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Double r25 = this.amountRequested;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.status;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.bankName;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.bankAccNo;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.updatedDate;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        Double r215 = this.transferFee;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.transferType;
        if (r217 != null) goto L41;
        int r218 = 0;
    L42:
        int r013 = (r012 + r218) * 31;
        Boolean r219 = this.isHideTransferType;
        if (r219 != null) goto L45;
        int r220 = 0;
    L46:
        int r014 = (r013 + r220) * 31;
        String r221 = this.referenceId;
        if (r221 != null) goto L49;
        int r222 = 0;
    L50:
        int r015 = (r014 + r222) * 31;
        String r223 = this.type;
        if (r223 == null) goto L55;
        r1 = r223.hashCode();
    L55:
        return r015 + r1;
    L49:
        r222 = r221.hashCode();
        goto L50
    L45:
        r220 = r219.hashCode();
        goto L46
    L41:
        r218 = r217.hashCode();
        goto L42
    L37:
        r216 = r215.hashCode();
        goto L38
    L33:
        r214 = r213.hashCode();
        goto L34
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

    public final String i() {
        return this.transferType;
    }

    public final String j() {
        return this.type;
    }

    public final Boolean k() {
        return this.isHideTransferType;
    }

    public String toString() {
        return "WithdrawalHistoryItemDTO(id=" + this.f88720id + ", requestDate=" + this.requestDate + ", amountTransferred=" + this.amountTransferred + ", amountRequested=" + this.amountRequested + ", status=" + this.status + ", bankName=" + this.bankName + ", bankAccNo=" + this.bankAccNo + ", updatedDate=" + this.updatedDate + ", transferFee=" + this.transferFee + ", transferType=" + this.transferType + ", isHideTransferType=" + this.isHideTransferType + ", referenceId=" + this.referenceId + ", type=" + this.type + ")";
    }

    public WithdrawalHistoryItemDTO(String r1, String r2, Double r3, Double r4, String r5, String r6, String r7, String r8, Double r9, String r10, Boolean r11, String r12, String r13) {
        this.f88720id = r1;
        this.requestDate = r2;
        this.amountTransferred = r3;
        this.amountRequested = r4;
        this.status = r5;
        this.bankName = r6;
        this.bankAccNo = r7;
        this.updatedDate = r8;
        this.transferFee = r9;
        this.transferType = r10;
        this.isHideTransferType = r11;
        this.referenceId = r12;
        this.type = r13;
    }

    public /* synthetic */ WithdrawalHistoryItemDTO(String r14, String r15, Double r16, Double r17, String r18, String r19, String r20, String r21, Double r22, String r23, Boolean r24, String r25, String r26, int r27, i r28) {
        if ((r27 & 1) == 0) goto L6;
        r14 = null;
    L6:
        if ((r27 & 2) == 0) goto L8;
        String r1 = null;
    L10:
        if ((r27 & 4) == 0) goto L12;
        Double r3 = null;
    L14:
        if ((r27 & 8) == 0) goto L16;
        Double r4 = null;
    L18:
        if ((r27 & 16) == 0) goto L20;
        String r5 = null;
    L22:
        if ((r27 & 32) == 0) goto L24;
        String r6 = null;
    L26:
        if ((r27 & 64) == 0) goto L28;
        String r7 = null;
    L30:
        if ((r27 & 128) == 0) goto L32;
        String r8 = null;
    L34:
        if ((r27 & 256) == 0) goto L36;
        Double r9 = null;
    L38:
        if ((r27 & 512) == 0) goto L40;
        String r10 = null;
    L42:
        if ((r27 & 1024) == 0) goto L44;
        Boolean r11 = null;
    L46:
        if ((r27 & 2048) == 0) goto L48;
        String r12 = null;
    L50:
        if ((r27 & 4096) == 0) goto L53;
        String r272 = null;
    L54:
        this(r14, r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r272);
        return;
    L53:
        r272 = r26;
        goto L54
    L48:
        r12 = r25;
        goto L50
    L44:
        r11 = r24;
        goto L46
    L40:
        r10 = r23;
        goto L42
    L36:
        r9 = r22;
        goto L38
    L32:
        r8 = r21;
        goto L34
    L28:
        r7 = r20;
        goto L30
    L24:
        r6 = r19;
        goto L26
    L20:
        r5 = r18;
        goto L22
    L16:
        r4 = r17;
        goto L18
    L12:
        r3 = r16;
        goto L14
    L8:
        r1 = r15;
        goto L10
    }
}
