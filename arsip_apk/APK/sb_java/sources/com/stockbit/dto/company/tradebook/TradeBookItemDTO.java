package com.stockbit.dto.company.tradebook;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J]\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010!\u001a\u00020\"HÖ\u0081\u0004J\n\u0010#\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011¨\u0006$"}, d2 = {"Lcom/stockbit/dto/company/tradebook/TradeBookItemDTO;", "", FirebaseAnalytics.Param.PRICE, "", CrashHianalyticsData.TIME, "buy", "Lcom/stockbit/dto/company/tradebook/TradeBookBuySellDTO;", "sell", "preOpen", "postClose", "total", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/dto/company/tradebook/TradeBookBuySellDTO;Lcom/stockbit/dto/company/tradebook/TradeBookBuySellDTO;Lcom/stockbit/dto/company/tradebook/TradeBookBuySellDTO;Lcom/stockbit/dto/company/tradebook/TradeBookBuySellDTO;Lcom/stockbit/dto/company/tradebook/TradeBookBuySellDTO;)V", "getPrice", "()Ljava/lang/String;", "getTime", "getBuy", "()Lcom/stockbit/dto/company/tradebook/TradeBookBuySellDTO;", "getSell", "getPreOpen", "getPostClose", "getTotal", "component1", "component2", "component3", "component4", "component5", "component6", "component7", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TradeBookItemDTO {

    @SerializedName("buy")
    private final TradeBookBuySellDTO buy;

    @SerializedName("post_close")
    private final TradeBookBuySellDTO postClose;

    @SerializedName("pre_open")
    private final TradeBookBuySellDTO preOpen;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private final String price;

    @SerializedName("sell")
    private final TradeBookBuySellDTO sell;

    @SerializedName(CrashHianalyticsData.TIME)
    private final String time;

    @SerializedName("total")
    private final TradeBookBuySellDTO total;

    public TradeBookItemDTO(String r1, String r2, TradeBookBuySellDTO r3, TradeBookBuySellDTO r4, TradeBookBuySellDTO r5, TradeBookBuySellDTO r6, TradeBookBuySellDTO r7) {
        this.price = r1;
        this.time = r2;
        this.buy = r3;
        this.sell = r4;
        this.preOpen = r5;
        this.postClose = r6;
        this.total = r7;
    }

    public final TradeBookBuySellDTO a() {
        return this.buy;
    }

    public final TradeBookBuySellDTO b() {
        return this.postClose;
    }

    public final TradeBookBuySellDTO c() {
        return this.preOpen;
    }

    public final String d() {
        return this.price;
    }

    public final TradeBookBuySellDTO e() {
        return this.sell;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TradeBookItemDTO) == true) goto L8;
        return false;
    L8:
        TradeBookItemDTO r52 = (TradeBookItemDTO) r5;
        if (p.g(this.price, r52.price) == true) goto L12;
        return false;
    L12:
        if (p.g(this.time, r52.time) == true) goto L15;
        return false;
    L15:
        if (p.g(this.buy, r52.buy) == true) goto L18;
        return false;
    L18:
        if (p.g(this.sell, r52.sell) == true) goto L21;
        return false;
    L21:
        if (p.g(this.preOpen, r52.preOpen) == true) goto L24;
        return false;
    L24:
        if (p.g(this.postClose, r52.postClose) == true) goto L27;
        return false;
    L27:
        if (p.g(this.total, r52.total) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.time;
    }

    public final TradeBookBuySellDTO g() {
        return this.total;
    }

    public int hashCode() {
        String r02 = this.price;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.time;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        TradeBookBuySellDTO r23 = this.buy;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        TradeBookBuySellDTO r25 = this.sell;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        TradeBookBuySellDTO r27 = this.preOpen;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        TradeBookBuySellDTO r29 = this.postClose;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        TradeBookBuySellDTO r211 = this.total;
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
        return "TradeBookItemDTO(price=" + this.price + ", time=" + this.time + ", buy=" + this.buy + ", sell=" + this.sell + ", preOpen=" + this.preOpen + ", postClose=" + this.postClose + ", total=" + this.total + ")";
    }
}
