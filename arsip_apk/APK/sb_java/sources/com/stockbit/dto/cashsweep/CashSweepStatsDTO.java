package com.stockbit.dto.cashsweep;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.scheduling.WorkQueueKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJb\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0014\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010!\u001a\u00020\"HÖ\u0081\u0004J\n\u0010#\u001a\u00020\u0005HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0002\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0015\u0010\r¨\u0006$"}, d2 = {"Lcom/stockbit/dto/cashsweep/CashSweepStatsDTO;", "", "isSharia", "", "userStatus", "", "upgradeStatus", "userBankStatus", "cashSweepStatus", "rejectReasonType", "previouslyActivated", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUserStatus", "()Ljava/lang/String;", "getUpgradeStatus", "getUserBankStatus", "getCashSweepStatus", "getRejectReasonType", "getPreviouslyActivated", "component1", "component2", "component3", "component4", "component5", "component6", "component7", Constants.COPY_TYPE, "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/stockbit/dto/cashsweep/CashSweepStatsDTO;", "equals", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CashSweepStatsDTO {

    @SerializedName("cash_sweep_status")
    private final String cashSweepStatus;

    @SerializedName("is_sharia")
    private final Boolean isSharia;

    @SerializedName("previously_activated")
    private final Boolean previouslyActivated;

    @SerializedName("reject_reason_type")
    private final String rejectReasonType;

    @SerializedName("upgrade_status")
    private final String upgradeStatus;

    @SerializedName("user_bank_status")
    private final String userBankStatus;

    @SerializedName("user_status")
    private final String userStatus;

    public CashSweepStatsDTO() {
        Boolean r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        Boolean r7 = null;
        this(r1, r2, r3, r4, r5, r6, r7, WorkQueueKt.MASK, null);
    }

    public final String a() {
        return this.cashSweepStatus;
    }

    public final Boolean b() {
        return this.previouslyActivated;
    }

    public final String c() {
        return this.rejectReasonType;
    }

    public final String d() {
        return this.upgradeStatus;
    }

    public final String e() {
        return this.userBankStatus;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CashSweepStatsDTO) == true) goto L8;
        return false;
    L8:
        CashSweepStatsDTO r52 = (CashSweepStatsDTO) r5;
        if (p.g(this.isSharia, r52.isSharia) == true) goto L12;
        return false;
    L12:
        if (p.g(this.userStatus, r52.userStatus) == true) goto L15;
        return false;
    L15:
        if (p.g(this.upgradeStatus, r52.upgradeStatus) == true) goto L18;
        return false;
    L18:
        if (p.g(this.userBankStatus, r52.userBankStatus) == true) goto L21;
        return false;
    L21:
        if (p.g(this.cashSweepStatus, r52.cashSweepStatus) == true) goto L24;
        return false;
    L24:
        if (p.g(this.rejectReasonType, r52.rejectReasonType) == true) goto L27;
        return false;
    L27:
        if (p.g(this.previouslyActivated, r52.previouslyActivated) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.userStatus;
    }

    public final Boolean g() {
        return this.isSharia;
    }

    public int hashCode() {
        Boolean r02 = this.isSharia;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.userStatus;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.upgradeStatus;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.userBankStatus;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.cashSweepStatus;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.rejectReasonType;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        Boolean r211 = this.previouslyActivated;
        if (r211 == null) goto L31;
        r1 = r211.hashCode();
    L31:
        return r09 + r1;
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

    public String toString() {
        return "CashSweepStatsDTO(isSharia=" + this.isSharia + ", userStatus=" + this.userStatus + ", upgradeStatus=" + this.upgradeStatus + ", userBankStatus=" + this.userBankStatus + ", cashSweepStatus=" + this.cashSweepStatus + ", rejectReasonType=" + this.rejectReasonType + ", previouslyActivated=" + this.previouslyActivated + ")";
    }

    public CashSweepStatsDTO(Boolean r1, String r2, String r3, String r4, String r5, String r6, Boolean r7) {
        this.isSharia = r1;
        this.userStatus = r2;
        this.upgradeStatus = r3;
        this.userBankStatus = r4;
        this.cashSweepStatus = r5;
        this.rejectReasonType = r6;
        this.previouslyActivated = r7;
    }

    public /* synthetic */ CashSweepStatsDTO(Boolean r2, String r3, String r4, String r5, String r6, String r7, Boolean r8, int r9, i r10) {
        if ((r9 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r7 = null;
    L21:
        if ((r9 & 64) == 0) goto L24;
        Boolean r92 = null;
    L23:
        String r82 = r7;
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        this(r2, r3, r52, r62, r72, r82, r92);
        return;
    L24:
        r92 = r8;
        goto L23
    }
}
