package com.stockbit.dto.company.foreignflow;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import com.stockbit.dto.company.runningtrade.RunningTradeValueDTO;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003JQ\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010¨\u0006!"}, d2 = {"Lcom/stockbit/dto/company/foreignflow/ForeignFlowHistoricalPriceDTO;", "", Constants.KEY_DATE, "", "datetimeLabel", "open", "Lcom/stockbit/dto/company/runningtrade/RunningTradeValueDTO;", Constants.PRIORITY_HIGH, "low", Constants.KEY_HIDE_CLOSE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/dto/company/runningtrade/RunningTradeValueDTO;Lcom/stockbit/dto/company/runningtrade/RunningTradeValueDTO;Lcom/stockbit/dto/company/runningtrade/RunningTradeValueDTO;Lcom/stockbit/dto/company/runningtrade/RunningTradeValueDTO;)V", "getDate", "()Ljava/lang/String;", "getDatetimeLabel", "getOpen", "()Lcom/stockbit/dto/company/runningtrade/RunningTradeValueDTO;", "getHigh", "getLow", "getClose", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ForeignFlowHistoricalPriceDTO {

    @SerializedName(Constants.KEY_HIDE_CLOSE)
    private final RunningTradeValueDTO close;

    @SerializedName(Constants.KEY_DATE)
    private final String date;

    @SerializedName("datetime_label")
    private final String datetimeLabel;

    @SerializedName(Constants.PRIORITY_HIGH)
    private final RunningTradeValueDTO high;

    @SerializedName("low")
    private final RunningTradeValueDTO low;

    @SerializedName("open")
    private final RunningTradeValueDTO open;

    public ForeignFlowHistoricalPriceDTO() {
        String r1 = null;
        String r2 = null;
        RunningTradeValueDTO r3 = null;
        RunningTradeValueDTO r4 = null;
        RunningTradeValueDTO r5 = null;
        RunningTradeValueDTO r6 = null;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    public final RunningTradeValueDTO a() {
        return this.close;
    }

    public final String b() {
        return this.date;
    }

    public final String c() {
        return this.datetimeLabel;
    }

    public final RunningTradeValueDTO d() {
        return this.high;
    }

    public final RunningTradeValueDTO e() {
        return this.low;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ForeignFlowHistoricalPriceDTO) == true) goto L8;
        return false;
    L8:
        ForeignFlowHistoricalPriceDTO r52 = (ForeignFlowHistoricalPriceDTO) r5;
        if (p.g(this.date, r52.date) == true) goto L12;
        return false;
    L12:
        if (p.g(this.datetimeLabel, r52.datetimeLabel) == true) goto L15;
        return false;
    L15:
        if (p.g(this.open, r52.open) == true) goto L18;
        return false;
    L18:
        if (p.g(this.high, r52.high) == true) goto L21;
        return false;
    L21:
        if (p.g(this.low, r52.low) == true) goto L24;
        return false;
    L24:
        if (p.g(this.close, r52.close) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final RunningTradeValueDTO f() {
        return this.open;
    }

    public int hashCode() {
        String r02 = this.date;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.datetimeLabel;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        RunningTradeValueDTO r23 = this.open;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        RunningTradeValueDTO r25 = this.high;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        RunningTradeValueDTO r27 = this.low;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        RunningTradeValueDTO r29 = this.close;
        if (r29 == null) goto L27;
        r1 = r29.hashCode();
    L27:
        return r08 + r1;
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
        return "ForeignFlowHistoricalPriceDTO(date=" + this.date + ", datetimeLabel=" + this.datetimeLabel + ", open=" + this.open + ", high=" + this.high + ", low=" + this.low + ", close=" + this.close + ")";
    }

    public ForeignFlowHistoricalPriceDTO(String r1, String r2, RunningTradeValueDTO r3, RunningTradeValueDTO r4, RunningTradeValueDTO r5, RunningTradeValueDTO r6) {
        this.date = r1;
        this.datetimeLabel = r2;
        this.open = r3;
        this.high = r4;
        this.low = r5;
        this.close = r6;
    }

    public /* synthetic */ ForeignFlowHistoricalPriceDTO(String r2, String r3, RunningTradeValueDTO r4, RunningTradeValueDTO r5, RunningTradeValueDTO r6, RunningTradeValueDTO r7, int r8, i r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r8 & 32) == 0) goto L21;
        RunningTradeValueDTO r82 = null;
    L20:
        RunningTradeValueDTO r72 = r6;
        RunningTradeValueDTO r62 = r5;
        RunningTradeValueDTO r52 = r4;
        this(r2, r3, r52, r62, r72, r82);
        return;
    L21:
        r82 = r7;
        goto L20
    }
}
