package com.stockbit.dto.cryptotransaction;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b4\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÉ\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010:\u001a\u00020;HÖ\u0081\u0004J\n\u0010<\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016¨\u0006="}, d2 = {"Lcom/stockbit/dto/cryptotransaction/CryptoPositionDTO;", "", "accNo", "", "baseAsset", "quoteAsset", "position", "avgPrice", "realizedPnl", "soldPosition", "cumulativeCost", "cumulativeRevenue", "lastCommitNumber", "updatedAt", "sbSymbol", "unrealizedPnl", "unrealizedGainPct", "livePrice", "marketValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccNo", "()Ljava/lang/String;", "getBaseAsset", "getQuoteAsset", "getPosition", "getAvgPrice", "getRealizedPnl", "getSoldPosition", "getCumulativeCost", "getCumulativeRevenue", "getLastCommitNumber", "getUpdatedAt", "getSbSymbol", "getUnrealizedPnl", "getUnrealizedGainPct", "getLivePrice", "getMarketValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CryptoPositionDTO {

    @SerializedName("acc_no")
    private final String accNo;

    @SerializedName("avg_price")
    private final String avgPrice;

    @SerializedName("base_asset")
    private final String baseAsset;

    @SerializedName("cumulative_cost")
    private final String cumulativeCost;

    @SerializedName("cumulative_revenue")
    private final String cumulativeRevenue;

    @SerializedName("last_commit_number")
    private final String lastCommitNumber;

    @SerializedName("live_price")
    private final String livePrice;

    @SerializedName("market_value")
    private final String marketValue;

    @SerializedName("position")
    private final String position;

    @SerializedName("quote_asset")
    private final String quoteAsset;

    @SerializedName("realized_pnl")
    private final String realizedPnl;

    @SerializedName("sb_symbol")
    private final String sbSymbol;

    @SerializedName("sold_position")
    private final String soldPosition;

    @SerializedName("unrealized_gain_pct")
    private final String unrealizedGainPct;

    @SerializedName("unrealized_pnl")
    private final String unrealizedPnl;

    @SerializedName("updated_at")
    private final String updatedAt;

    public CryptoPositionDTO() {
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
        String r12 = null;
        String r13 = null;
        String r14 = null;
        String r15 = null;
        String r16 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, 65535, null);
    }

    public final String a() {
        return this.avgPrice;
    }

    public final String b() {
        return this.baseAsset;
    }

    public final String c() {
        return this.cumulativeCost;
    }

    public final String d() {
        return this.livePrice;
    }

    public final String e() {
        return this.marketValue;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CryptoPositionDTO) == true) goto L8;
        return false;
    L8:
        CryptoPositionDTO r52 = (CryptoPositionDTO) r5;
        if (p.g(this.accNo, r52.accNo) == true) goto L12;
        return false;
    L12:
        if (p.g(this.baseAsset, r52.baseAsset) == true) goto L15;
        return false;
    L15:
        if (p.g(this.quoteAsset, r52.quoteAsset) == true) goto L18;
        return false;
    L18:
        if (p.g(this.position, r52.position) == true) goto L21;
        return false;
    L21:
        if (p.g(this.avgPrice, r52.avgPrice) == true) goto L24;
        return false;
    L24:
        if (p.g(this.realizedPnl, r52.realizedPnl) == true) goto L27;
        return false;
    L27:
        if (p.g(this.soldPosition, r52.soldPosition) == true) goto L30;
        return false;
    L30:
        if (p.g(this.cumulativeCost, r52.cumulativeCost) == true) goto L33;
        return false;
    L33:
        if (p.g(this.cumulativeRevenue, r52.cumulativeRevenue) == true) goto L36;
        return false;
    L36:
        if (p.g(this.lastCommitNumber, r52.lastCommitNumber) == true) goto L39;
        return false;
    L39:
        if (p.g(this.updatedAt, r52.updatedAt) == true) goto L42;
        return false;
    L42:
        if (p.g(this.sbSymbol, r52.sbSymbol) == true) goto L45;
        return false;
    L45:
        if (p.g(this.unrealizedPnl, r52.unrealizedPnl) == true) goto L48;
        return false;
    L48:
        if (p.g(this.unrealizedGainPct, r52.unrealizedGainPct) == true) goto L51;
        return false;
    L51:
        if (p.g(this.livePrice, r52.livePrice) == true) goto L54;
        return false;
    L54:
        if (p.g(this.marketValue, r52.marketValue) == true) goto L56;
        return false;
    L56:
        return true;
    }

    public final String f() {
        return this.position;
    }

    public final String g() {
        return this.quoteAsset;
    }

    public final String h() {
        return this.sbSymbol;
    }

    public int hashCode() {
        String r02 = this.accNo;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.baseAsset;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.quoteAsset;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.position;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.avgPrice;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.realizedPnl;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.soldPosition;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.cumulativeCost;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.cumulativeRevenue;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.lastCommitNumber;
        if (r217 != null) goto L41;
        int r218 = 0;
    L42:
        int r013 = (r012 + r218) * 31;
        String r219 = this.updatedAt;
        if (r219 != null) goto L45;
        int r220 = 0;
    L46:
        int r014 = (r013 + r220) * 31;
        String r221 = this.sbSymbol;
        if (r221 != null) goto L49;
        int r222 = 0;
    L50:
        int r015 = (r014 + r222) * 31;
        String r223 = this.unrealizedPnl;
        if (r223 != null) goto L53;
        int r224 = 0;
    L54:
        int r016 = (r015 + r224) * 31;
        String r225 = this.unrealizedGainPct;
        if (r225 != null) goto L57;
        int r226 = 0;
    L58:
        int r017 = (r016 + r226) * 31;
        String r227 = this.livePrice;
        if (r227 != null) goto L61;
        int r228 = 0;
    L62:
        int r018 = (r017 + r228) * 31;
        String r229 = this.marketValue;
        if (r229 == null) goto L67;
        r1 = r229.hashCode();
    L67:
        return r018 + r1;
    L61:
        r228 = r227.hashCode();
        goto L62
    L57:
        r226 = r225.hashCode();
        goto L58
    L53:
        r224 = r223.hashCode();
        goto L54
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
        return this.unrealizedGainPct;
    }

    public final String j() {
        return this.unrealizedPnl;
    }

    public String toString() {
        return "CryptoPositionDTO(accNo=" + this.accNo + ", baseAsset=" + this.baseAsset + ", quoteAsset=" + this.quoteAsset + ", position=" + this.position + ", avgPrice=" + this.avgPrice + ", realizedPnl=" + this.realizedPnl + ", soldPosition=" + this.soldPosition + ", cumulativeCost=" + this.cumulativeCost + ", cumulativeRevenue=" + this.cumulativeRevenue + ", lastCommitNumber=" + this.lastCommitNumber + ", updatedAt=" + this.updatedAt + ", sbSymbol=" + this.sbSymbol + ", unrealizedPnl=" + this.unrealizedPnl + ", unrealizedGainPct=" + this.unrealizedGainPct + ", livePrice=" + this.livePrice + ", marketValue=" + this.marketValue + ")";
    }

    public CryptoPositionDTO(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, String r13, String r14, String r15, String r16) {
        this.accNo = r1;
        this.baseAsset = r2;
        this.quoteAsset = r3;
        this.position = r4;
        this.avgPrice = r5;
        this.realizedPnl = r6;
        this.soldPosition = r7;
        this.cumulativeCost = r8;
        this.cumulativeRevenue = r9;
        this.lastCommitNumber = r10;
        this.updatedAt = r11;
        this.sbSymbol = r12;
        this.unrealizedPnl = r13;
        this.unrealizedGainPct = r14;
        this.livePrice = r15;
        this.marketValue = r16;
    }

    public /* synthetic */ CryptoPositionDTO(String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30, String r31, String r32, String r33, int r34, i r35) {
        if ((r34 & 1) == 0) goto L5;
        String r1 = null;
    L7:
        if ((r34 & 2) == 0) goto L9;
        String r3 = null;
    L11:
        if ((r34 & 4) == 0) goto L13;
        String r4 = null;
    L15:
        if ((r34 & 8) == 0) goto L17;
        String r5 = null;
    L19:
        if ((r34 & 16) == 0) goto L21;
        String r6 = null;
    L23:
        if ((r34 & 32) == 0) goto L25;
        String r7 = null;
    L27:
        if ((r34 & 64) == 0) goto L29;
        String r8 = null;
    L31:
        if ((r34 & 128) == 0) goto L33;
        String r9 = null;
    L35:
        if ((r34 & 256) == 0) goto L37;
        String r10 = null;
    L39:
        if ((r34 & 512) == 0) goto L41;
        String r11 = null;
    L43:
        if ((r34 & 1024) == 0) goto L45;
        String r12 = null;
    L47:
        if ((r34 & 2048) == 0) goto L49;
        String r13 = null;
    L51:
        if ((r34 & 4096) == 0) goto L53;
        String r14 = null;
    L55:
        if ((r34 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        String r15 = null;
    L59:
        if ((r34 & 16384) == 0) goto L61;
        String r2 = null;
    L63:
        if ((r34 & 32768) == 0) goto L66;
        String r342 = null;
    L67:
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r342);
        return;
    L66:
        r342 = r33;
        goto L67
    L61:
        r2 = r32;
        goto L63
    L57:
        r15 = r31;
        goto L59
    L53:
        r14 = r30;
        goto L55
    L49:
        r13 = r29;
        goto L51
    L45:
        r12 = r28;
        goto L47
    L41:
        r11 = r27;
        goto L43
    L37:
        r10 = r26;
        goto L39
    L33:
        r9 = r25;
        goto L35
    L29:
        r8 = r24;
        goto L31
    L25:
        r7 = r23;
        goto L27
    L21:
        r6 = r22;
        goto L23
    L17:
        r5 = r21;
        goto L19
    L13:
        r4 = r20;
        goto L15
    L9:
        r3 = r19;
        goto L11
    L5:
        r1 = r18;
        goto L7
    }
}
