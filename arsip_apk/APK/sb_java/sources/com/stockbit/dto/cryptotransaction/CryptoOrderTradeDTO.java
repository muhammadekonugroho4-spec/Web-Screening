package com.stockbit.dto.cryptotransaction;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ju\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020%HÖ\u0081\u0004J\n\u0010&\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR$\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006'"}, d2 = {"Lcom/stockbit/dto/cryptotransaction/CryptoOrderTradeDTO;", "", Constants.KEY_ID, "", "baseQty", "quoteQty", FirebaseAnalytics.Param.PRICE, "extraCharges", "", "realizedPnl", "realizedPnlPct", "executedAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getBaseQty", "getQuoteQty", "getPrice", "getExtraCharges", "()Ljava/util/Map;", "getRealizedPnl", "getRealizedPnlPct", "getExecutedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CryptoOrderTradeDTO {

    @SerializedName("base_qty")
    private final String baseQty;

    @SerializedName("executed_at")
    private final String executedAt;

    @SerializedName("extra_charges")
    private final Map<String, String> extraCharges;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(Constants.KEY_ID)
    private final String f88639id;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private final String price;

    @SerializedName("quote_qty")
    private final String quoteQty;

    @SerializedName("realized_pnl")
    private final String realizedPnl;

    @SerializedName("realized_pnl_pct")
    private final String realizedPnlPct;

    public CryptoOrderTradeDTO() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        Map r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, com.google.firebase.perf.util.Constants.MAX_HOST_LENGTH, null);
    }

    public final String a() {
        return this.baseQty;
    }

    public final String b() {
        return this.executedAt;
    }

    public final String c() {
        return this.price;
    }

    public final String d() {
        return this.quoteQty;
    }

    public final String e() {
        return this.realizedPnl;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof CryptoOrderTradeDTO) == true) goto L8;
        return false;
    L8:
        CryptoOrderTradeDTO r52 = (CryptoOrderTradeDTO) r5;
        if (p.g(this.f88639id, r52.f88639id) == true) goto L12;
        return false;
    L12:
        if (p.g(this.baseQty, r52.baseQty) == true) goto L15;
        return false;
    L15:
        if (p.g(this.quoteQty, r52.quoteQty) == true) goto L18;
        return false;
    L18:
        if (p.g(this.price, r52.price) == true) goto L21;
        return false;
    L21:
        if (p.g(this.extraCharges, r52.extraCharges) == true) goto L24;
        return false;
    L24:
        if (p.g(this.realizedPnl, r52.realizedPnl) == true) goto L27;
        return false;
    L27:
        if (p.g(this.realizedPnlPct, r52.realizedPnlPct) == true) goto L30;
        return false;
    L30:
        if (p.g(this.executedAt, r52.executedAt) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.realizedPnlPct;
    }

    public int hashCode() {
        String r02 = this.f88639id;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.baseQty;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.quoteQty;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.price;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        Map<String, String> r27 = this.extraCharges;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.realizedPnl;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.realizedPnlPct;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.executedAt;
        if (r213 == null) goto L35;
        r1 = r213.hashCode();
    L35:
        return r010 + r1;
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
        return "CryptoOrderTradeDTO(id=" + this.f88639id + ", baseQty=" + this.baseQty + ", quoteQty=" + this.quoteQty + ", price=" + this.price + ", extraCharges=" + this.extraCharges + ", realizedPnl=" + this.realizedPnl + ", realizedPnlPct=" + this.realizedPnlPct + ", executedAt=" + this.executedAt + ")";
    }

    public CryptoOrderTradeDTO(String r1, String r2, String r3, String r4, Map<String, String> r5, String r6, String r7, String r8) {
        this.f88639id = r1;
        this.baseQty = r2;
        this.quoteQty = r3;
        this.price = r4;
        this.extraCharges = r5;
        this.realizedPnl = r6;
        this.realizedPnlPct = r7;
        this.executedAt = r8;
    }

    public /* synthetic */ CryptoOrderTradeDTO(String r2, String r3, String r4, String r5, Map r6, String r7, String r8, String r9, int r10, i r11) {
        if ((r10 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r7 = null;
    L21:
        if ((r10 & 64) == 0) goto L24;
        r8 = null;
    L24:
        if ((r10 & 128) == 0) goto L27;
        String r102 = null;
    L26:
        String r92 = r8;
        String r82 = r7;
        Map r72 = r6;
        String r62 = r5;
        String r52 = r4;
        this(r2, r3, r52, r62, r72, r82, r92, r102);
        return;
    L27:
        r102 = r9;
        goto L26
    }
}
