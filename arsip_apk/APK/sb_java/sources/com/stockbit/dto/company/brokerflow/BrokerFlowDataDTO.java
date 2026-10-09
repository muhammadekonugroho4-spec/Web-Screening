package com.stockbit.dto.company.brokerflow;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.stockbit.dto.company.runningtrade.RunningTradeValueDTO;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J]\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010!\u001a\u00020\"HÖ\u0081\u0004J\n\u0010#\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011¨\u0006$"}, d2 = {"Lcom/stockbit/dto/company/brokerflow/BrokerFlowDataDTO;", "", Constants.KEY_DATE, "", CrashHianalyticsData.TIME, "value", "Lcom/stockbit/dto/company/runningtrade/RunningTradeValueDTO;", "datetimeLabel", "open", Constants.PRIORITY_HIGH, "low", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/dto/company/runningtrade/RunningTradeValueDTO;Ljava/lang/String;Lcom/stockbit/dto/company/runningtrade/RunningTradeValueDTO;Lcom/stockbit/dto/company/runningtrade/RunningTradeValueDTO;Lcom/stockbit/dto/company/runningtrade/RunningTradeValueDTO;)V", "getDate", "()Ljava/lang/String;", "getTime", "getValue", "()Lcom/stockbit/dto/company/runningtrade/RunningTradeValueDTO;", "getDatetimeLabel", "getOpen", "getHigh", "getLow", "component1", "component2", "component3", "component4", "component5", "component6", "component7", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BrokerFlowDataDTO {

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

    @SerializedName(CrashHianalyticsData.TIME)
    private final String time;

    @SerializedName("value")
    private final RunningTradeValueDTO value;

    public BrokerFlowDataDTO(String r1, String r2, RunningTradeValueDTO r3, String r4, RunningTradeValueDTO r5, RunningTradeValueDTO r6, RunningTradeValueDTO r7) {
        this.date = r1;
        this.time = r2;
        this.value = r3;
        this.datetimeLabel = r4;
        this.open = r5;
        this.high = r6;
        this.low = r7;
    }

    public final String a() {
        return this.date;
    }

    public final String b() {
        return this.datetimeLabel;
    }

    public final RunningTradeValueDTO c() {
        return this.high;
    }

    public final RunningTradeValueDTO d() {
        return this.low;
    }

    public final RunningTradeValueDTO e() {
        return this.open;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BrokerFlowDataDTO) == true) goto L8;
        return false;
    L8:
        BrokerFlowDataDTO r52 = (BrokerFlowDataDTO) r5;
        if (p.g(this.date, r52.date) == true) goto L12;
        return false;
    L12:
        if (p.g(this.time, r52.time) == true) goto L15;
        return false;
    L15:
        if (p.g(this.value, r52.value) == true) goto L18;
        return false;
    L18:
        if (p.g(this.datetimeLabel, r52.datetimeLabel) == true) goto L21;
        return false;
    L21:
        if (p.g(this.open, r52.open) == true) goto L24;
        return false;
    L24:
        if (p.g(this.high, r52.high) == true) goto L27;
        return false;
    L27:
        if (p.g(this.low, r52.low) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.time;
    }

    public final RunningTradeValueDTO g() {
        return this.value;
    }

    public int hashCode() {
        String r02 = this.date;
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
        RunningTradeValueDTO r23 = this.value;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.datetimeLabel;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        RunningTradeValueDTO r27 = this.open;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        RunningTradeValueDTO r29 = this.high;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        RunningTradeValueDTO r211 = this.low;
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
        return "BrokerFlowDataDTO(date=" + this.date + ", time=" + this.time + ", value=" + this.value + ", datetimeLabel=" + this.datetimeLabel + ", open=" + this.open + ", high=" + this.high + ", low=" + this.low + ")";
    }

    public /* synthetic */ BrokerFlowDataDTO(String r2, String r3, RunningTradeValueDTO r4, String r5, RunningTradeValueDTO r6, RunningTradeValueDTO r7, RunningTradeValueDTO r8, int r9, i r10) {
        if ((r9 & 16) == 0) goto L6;
        r6 = null;
    L6:
        if ((r9 & 32) == 0) goto L9;
        r7 = null;
    L9:
        if ((r9 & 64) == 0) goto L12;
        RunningTradeValueDTO r92 = null;
    L13:
        this(r2, r3, r4, r5, r6, r7, r92);
        return;
    L12:
        r92 = r8;
        goto L13
    }
}
