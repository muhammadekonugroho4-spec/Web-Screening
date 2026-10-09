package com.stockbit.dto.cryptotransaction;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008d\u0001\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010+\u001a\u00020,HÖ\u0081\u0004J\n\u0010-\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006."}, d2 = {"Lcom/stockbit/dto/cryptotransaction/CryptoPositionSummaryDataDTO;", "", "accNo", "", "quoteAsset", "investedValue", "totalQuoteQty", "availableQuoteQty", "reservedQuoteQty", "lockedQuoteQty", "totalMarketValue", "totalUnrealizedPnl", "totalUnrealizedGainPct", "totalEquity", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccNo", "()Ljava/lang/String;", "getQuoteAsset", "getInvestedValue", "getTotalQuoteQty", "getAvailableQuoteQty", "getReservedQuoteQty", "getLockedQuoteQty", "getTotalMarketValue", "getTotalUnrealizedPnl", "getTotalUnrealizedGainPct", "getTotalEquity", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CryptoPositionSummaryDataDTO {

    @SerializedName("acc_no")
    private final String accNo;

    @SerializedName("available_quote_qty")
    private final String availableQuoteQty;

    @SerializedName("invested_value")
    private final String investedValue;

    @SerializedName("locked_quote_qty")
    private final String lockedQuoteQty;

    @SerializedName("quote_asset")
    private final String quoteAsset;

    @SerializedName("reserved_quote_qty")
    private final String reservedQuoteQty;

    @SerializedName("total_equity")
    private final String totalEquity;

    @SerializedName("total_market_value")
    private final String totalMarketValue;

    @SerializedName("total_quote_qty")
    private final String totalQuoteQty;

    @SerializedName("total_unrealized_gain_pct")
    private final String totalUnrealizedGainPct;

    @SerializedName("total_unrealized_pnl")
    private final String totalUnrealizedPnl;

    public CryptoPositionSummaryDataDTO() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        String r9 = null;
        String r10 = null;
        String r11 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, 2047, null);
    }

    public final String a() {
        return this.availableQuoteQty;
    }

    public final String b() {
        return this.investedValue;
    }

    public final String c() {
        return this.reservedQuoteQty;
    }

    public final String d() {
        return this.totalEquity;
    }

    public final String e() {
        return this.totalUnrealizedGainPct;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CryptoPositionSummaryDataDTO) == true) goto L8;
        return false;
    L8:
        CryptoPositionSummaryDataDTO r52 = (CryptoPositionSummaryDataDTO) r5;
        if (p.g(this.accNo, r52.accNo) == true) goto L12;
        return false;
    L12:
        if (p.g(this.quoteAsset, r52.quoteAsset) == true) goto L15;
        return false;
    L15:
        if (p.g(this.investedValue, r52.investedValue) == true) goto L18;
        return false;
    L18:
        if (p.g(this.totalQuoteQty, r52.totalQuoteQty) == true) goto L21;
        return false;
    L21:
        if (p.g(this.availableQuoteQty, r52.availableQuoteQty) == true) goto L24;
        return false;
    L24:
        if (p.g(this.reservedQuoteQty, r52.reservedQuoteQty) == true) goto L27;
        return false;
    L27:
        if (p.g(this.lockedQuoteQty, r52.lockedQuoteQty) == true) goto L30;
        return false;
    L30:
        if (p.g(this.totalMarketValue, r52.totalMarketValue) == true) goto L33;
        return false;
    L33:
        if (p.g(this.totalUnrealizedPnl, r52.totalUnrealizedPnl) == true) goto L36;
        return false;
    L36:
        if (p.g(this.totalUnrealizedGainPct, r52.totalUnrealizedGainPct) == true) goto L39;
        return false;
    L39:
        if (p.g(this.totalEquity, r52.totalEquity) == true) goto L41;
        return false;
    L41:
        return true;
    }

    public final String f() {
        return this.totalUnrealizedPnl;
    }

    public int hashCode() {
        String r02 = this.accNo;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.quoteAsset;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.investedValue;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.totalQuoteQty;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.availableQuoteQty;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.reservedQuoteQty;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.lockedQuoteQty;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.totalMarketValue;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.totalUnrealizedPnl;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.totalUnrealizedGainPct;
        if (r217 != null) goto L41;
        int r218 = 0;
    L42:
        int r013 = (r012 + r218) * 31;
        String r219 = this.totalEquity;
        if (r219 == null) goto L47;
        r1 = r219.hashCode();
    L47:
        return r013 + r1;
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

    public String toString() {
        return "CryptoPositionSummaryDataDTO(accNo=" + this.accNo + ", quoteAsset=" + this.quoteAsset + ", investedValue=" + this.investedValue + ", totalQuoteQty=" + this.totalQuoteQty + ", availableQuoteQty=" + this.availableQuoteQty + ", reservedQuoteQty=" + this.reservedQuoteQty + ", lockedQuoteQty=" + this.lockedQuoteQty + ", totalMarketValue=" + this.totalMarketValue + ", totalUnrealizedPnl=" + this.totalUnrealizedPnl + ", totalUnrealizedGainPct=" + this.totalUnrealizedGainPct + ", totalEquity=" + this.totalEquity + ")";
    }

    public CryptoPositionSummaryDataDTO(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11) {
        this.accNo = r1;
        this.quoteAsset = r2;
        this.investedValue = r3;
        this.totalQuoteQty = r4;
        this.availableQuoteQty = r5;
        this.reservedQuoteQty = r6;
        this.lockedQuoteQty = r7;
        this.totalMarketValue = r8;
        this.totalUnrealizedPnl = r9;
        this.totalUnrealizedGainPct = r10;
        this.totalEquity = r11;
    }

    public /* synthetic */ CryptoPositionSummaryDataDTO(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, int r13, i r14) {
        if ((r13 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r13 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r13 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r13 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r13 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r13 & 32) == 0) goto L21;
        r7 = null;
    L21:
        if ((r13 & 64) == 0) goto L24;
        r8 = null;
    L24:
        if ((r13 & 128) == 0) goto L27;
        r9 = null;
    L27:
        if ((r13 & 256) == 0) goto L30;
        r10 = null;
    L30:
        if ((r13 & 512) == 0) goto L33;
        r11 = null;
    L33:
        if ((r13 & 1024) == 0) goto L36;
        String r132 = null;
    L35:
        String r122 = r11;
        String r112 = r10;
        String r102 = r9;
        String r92 = r8;
        String r82 = r7;
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        this(r2, r3, r52, r62, r72, r82, r92, r102, r112, r122, r132);
        return;
    L36:
        r132 = r12;
        goto L35
    }
}
