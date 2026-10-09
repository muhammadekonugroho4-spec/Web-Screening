package com.stockbit.dto.company.corpaction;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import kotlinx.coroutines.scheduling.WorkQueueKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003Jb\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010!J\u0014\u0010\"\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020%HÖ\u0081\u0004J\n\u0010&\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016¨\u0006'"}, d2 = {"Lcom/stockbit/dto/company/corpaction/CorpActionStockConversionItemDTO;", "", "companyId", "", "companySymbol", "corpActionActive", "", "recordingDate", "conversionNumber", "Ljava/math/BigDecimal;", "remainingConversion", "stockSumAfterConversion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getCompanyId", "()Ljava/lang/String;", "getCompanySymbol", "getCorpActionActive", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRecordingDate", "getConversionNumber", "()Ljava/math/BigDecimal;", "getRemainingConversion", "getStockSumAfterConversion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lcom/stockbit/dto/company/corpaction/CorpActionStockConversionItemDTO;", "equals", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CorpActionStockConversionItemDTO {

    @SerializedName("company_id")
    private final String companyId;

    @SerializedName("company_symbol")
    private final String companySymbol;

    @SerializedName("conversion_number")
    private final BigDecimal conversionNumber;

    @SerializedName("corp_action_active")
    private final Boolean corpActionActive;

    @SerializedName("recording_date")
    private final String recordingDate;

    @SerializedName("remaining_conversion")
    private final BigDecimal remainingConversion;

    @SerializedName("stock_sum_after_conversion")
    private final BigDecimal stockSumAfterConversion;

    public CorpActionStockConversionItemDTO() {
        String r1 = null;
        String r2 = null;
        Boolean r3 = null;
        String r4 = null;
        BigDecimal r5 = null;
        BigDecimal r6 = null;
        BigDecimal r7 = null;
        this(r1, r2, r3, r4, r5, r6, r7, WorkQueueKt.MASK, null);
    }

    public final BigDecimal a() {
        return this.conversionNumber;
    }

    public final String b() {
        return this.recordingDate;
    }

    public final BigDecimal c() {
        return this.remainingConversion;
    }

    public final BigDecimal d() {
        return this.stockSumAfterConversion;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CorpActionStockConversionItemDTO) == true) goto L8;
        return false;
    L8:
        CorpActionStockConversionItemDTO r52 = (CorpActionStockConversionItemDTO) r5;
        if (p.g(this.companyId, r52.companyId) == true) goto L12;
        return false;
    L12:
        if (p.g(this.companySymbol, r52.companySymbol) == true) goto L15;
        return false;
    L15:
        if (p.g(this.corpActionActive, r52.corpActionActive) == true) goto L18;
        return false;
    L18:
        if (p.g(this.recordingDate, r52.recordingDate) == true) goto L21;
        return false;
    L21:
        if (p.g(this.conversionNumber, r52.conversionNumber) == true) goto L24;
        return false;
    L24:
        if (p.g(this.remainingConversion, r52.remainingConversion) == true) goto L27;
        return false;
    L27:
        if (p.g(this.stockSumAfterConversion, r52.stockSumAfterConversion) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public int hashCode() {
        String r02 = this.companyId;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.companySymbol;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Boolean r23 = this.corpActionActive;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.recordingDate;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        BigDecimal r27 = this.conversionNumber;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        BigDecimal r29 = this.remainingConversion;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        BigDecimal r211 = this.stockSumAfterConversion;
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
        return "CorpActionStockConversionItemDTO(companyId=" + this.companyId + ", companySymbol=" + this.companySymbol + ", corpActionActive=" + this.corpActionActive + ", recordingDate=" + this.recordingDate + ", conversionNumber=" + this.conversionNumber + ", remainingConversion=" + this.remainingConversion + ", stockSumAfterConversion=" + this.stockSumAfterConversion + ")";
    }

    public CorpActionStockConversionItemDTO(String r1, String r2, Boolean r3, String r4, BigDecimal r5, BigDecimal r6, BigDecimal r7) {
        this.companyId = r1;
        this.companySymbol = r2;
        this.corpActionActive = r3;
        this.recordingDate = r4;
        this.conversionNumber = r5;
        this.remainingConversion = r6;
        this.stockSumAfterConversion = r7;
    }

    public /* synthetic */ CorpActionStockConversionItemDTO(String r2, String r3, Boolean r4, String r5, BigDecimal r6, BigDecimal r7, BigDecimal r8, int r9, i r10) {
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
        BigDecimal r92 = null;
    L23:
        BigDecimal r82 = r7;
        BigDecimal r72 = r6;
        String r62 = r5;
        Boolean r52 = r4;
        this(r2, r3, r52, r62, r72, r82, r92);
        return;
    L24:
        r92 = r8;
        goto L23
    }
}
