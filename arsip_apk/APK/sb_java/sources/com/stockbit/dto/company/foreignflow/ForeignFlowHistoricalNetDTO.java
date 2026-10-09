package com.stockbit.dto.company.foreignflow;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import com.stockbit.dto.company.runningtrade.RunningTradeValueDTO;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0099\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0014\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00100\u001a\u000201HÖ\u0081\u0004J\n\u00102\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017¨\u00063"}, d2 = {"Lcom/stockbit/dto/company/foreignflow/ForeignFlowHistoricalNetDTO;", "", Constants.KEY_DATE, "", "datetimeLabel", "datetimeLabelTable", "netForeign", "Lcom/stockbit/dto/company/runningtrade/RunningTradeValueDTO;", "foreignBuy", "foreignSell", "foreignFlow", "netLot", "netFrequency", "averagePrice", "percentageForeignValue", "percentageDomesticValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stockbit/dto/company/runningtrade/RunningTradeValueDTO;Lcom/stockbit/dto/company/runningtrade/RunningTradeValueDTO;Lcom/stockbit/dto/company/runningtrade/RunningTradeValueDTO;Lcom/stockbit/dto/company/runningtrade/RunningTradeValueDTO;Lcom/stockbit/dto/company/runningtrade/RunningTradeValueDTO;Lcom/stockbit/dto/company/runningtrade/RunningTradeValueDTO;Lcom/stockbit/dto/company/runningtrade/RunningTradeValueDTO;Lcom/stockbit/dto/company/runningtrade/RunningTradeValueDTO;Lcom/stockbit/dto/company/runningtrade/RunningTradeValueDTO;)V", "getDate", "()Ljava/lang/String;", "getDatetimeLabel", "getDatetimeLabelTable", "getNetForeign", "()Lcom/stockbit/dto/company/runningtrade/RunningTradeValueDTO;", "getForeignBuy", "getForeignSell", "getForeignFlow", "getNetLot", "getNetFrequency", "getAveragePrice", "getPercentageForeignValue", "getPercentageDomesticValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ForeignFlowHistoricalNetDTO {

    @SerializedName("average_price")
    private final RunningTradeValueDTO averagePrice;

    @SerializedName(Constants.KEY_DATE)
    private final String date;

    @SerializedName("datetime_label")
    private final String datetimeLabel;

    @SerializedName("datetime_label_table")
    private final String datetimeLabelTable;

    @SerializedName("foreign_buy")
    private final RunningTradeValueDTO foreignBuy;

    @SerializedName("foreign_flow")
    private final RunningTradeValueDTO foreignFlow;

    @SerializedName("foreign_sell")
    private final RunningTradeValueDTO foreignSell;

    @SerializedName("net_foreign")
    private final RunningTradeValueDTO netForeign;

    @SerializedName("net_frequency")
    private final RunningTradeValueDTO netFrequency;

    @SerializedName("net_lot")
    private final RunningTradeValueDTO netLot;

    @SerializedName("percentage_domestic_value")
    private final RunningTradeValueDTO percentageDomesticValue;

    @SerializedName("percentage_foreign_value")
    private final RunningTradeValueDTO percentageForeignValue;

    public ForeignFlowHistoricalNetDTO() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        RunningTradeValueDTO r4 = null;
        RunningTradeValueDTO r5 = null;
        RunningTradeValueDTO r6 = null;
        RunningTradeValueDTO r7 = null;
        RunningTradeValueDTO r8 = null;
        RunningTradeValueDTO r9 = null;
        RunningTradeValueDTO r10 = null;
        RunningTradeValueDTO r11 = null;
        RunningTradeValueDTO r12 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, 4095, null);
    }

    public final RunningTradeValueDTO a() {
        return this.averagePrice;
    }

    public final String b() {
        return this.date;
    }

    public final String c() {
        return this.datetimeLabel;
    }

    public final String d() {
        return this.datetimeLabelTable;
    }

    public final RunningTradeValueDTO e() {
        return this.foreignBuy;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ForeignFlowHistoricalNetDTO) == true) goto L8;
        return false;
    L8:
        ForeignFlowHistoricalNetDTO r52 = (ForeignFlowHistoricalNetDTO) r5;
        if (p.g(this.date, r52.date) == true) goto L12;
        return false;
    L12:
        if (p.g(this.datetimeLabel, r52.datetimeLabel) == true) goto L15;
        return false;
    L15:
        if (p.g(this.datetimeLabelTable, r52.datetimeLabelTable) == true) goto L18;
        return false;
    L18:
        if (p.g(this.netForeign, r52.netForeign) == true) goto L21;
        return false;
    L21:
        if (p.g(this.foreignBuy, r52.foreignBuy) == true) goto L24;
        return false;
    L24:
        if (p.g(this.foreignSell, r52.foreignSell) == true) goto L27;
        return false;
    L27:
        if (p.g(this.foreignFlow, r52.foreignFlow) == true) goto L30;
        return false;
    L30:
        if (p.g(this.netLot, r52.netLot) == true) goto L33;
        return false;
    L33:
        if (p.g(this.netFrequency, r52.netFrequency) == true) goto L36;
        return false;
    L36:
        if (p.g(this.averagePrice, r52.averagePrice) == true) goto L39;
        return false;
    L39:
        if (p.g(this.percentageForeignValue, r52.percentageForeignValue) == true) goto L42;
        return false;
    L42:
        if (p.g(this.percentageDomesticValue, r52.percentageDomesticValue) == true) goto L44;
        return false;
    L44:
        return true;
    }

    public final RunningTradeValueDTO f() {
        return this.foreignFlow;
    }

    public final RunningTradeValueDTO g() {
        return this.foreignSell;
    }

    public final RunningTradeValueDTO h() {
        return this.netForeign;
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
        String r23 = this.datetimeLabelTable;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        RunningTradeValueDTO r25 = this.netForeign;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        RunningTradeValueDTO r27 = this.foreignBuy;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        RunningTradeValueDTO r29 = this.foreignSell;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        RunningTradeValueDTO r211 = this.foreignFlow;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        RunningTradeValueDTO r213 = this.netLot;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        RunningTradeValueDTO r215 = this.netFrequency;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        RunningTradeValueDTO r217 = this.averagePrice;
        if (r217 != null) goto L41;
        int r218 = 0;
    L42:
        int r013 = (r012 + r218) * 31;
        RunningTradeValueDTO r219 = this.percentageForeignValue;
        if (r219 != null) goto L45;
        int r220 = 0;
    L46:
        int r014 = (r013 + r220) * 31;
        RunningTradeValueDTO r221 = this.percentageDomesticValue;
        if (r221 == null) goto L51;
        r1 = r221.hashCode();
    L51:
        return r014 + r1;
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

    public final RunningTradeValueDTO i() {
        return this.netFrequency;
    }

    public final RunningTradeValueDTO j() {
        return this.netLot;
    }

    public final RunningTradeValueDTO k() {
        return this.percentageDomesticValue;
    }

    public final RunningTradeValueDTO l() {
        return this.percentageForeignValue;
    }

    public String toString() {
        return "ForeignFlowHistoricalNetDTO(date=" + this.date + ", datetimeLabel=" + this.datetimeLabel + ", datetimeLabelTable=" + this.datetimeLabelTable + ", netForeign=" + this.netForeign + ", foreignBuy=" + this.foreignBuy + ", foreignSell=" + this.foreignSell + ", foreignFlow=" + this.foreignFlow + ", netLot=" + this.netLot + ", netFrequency=" + this.netFrequency + ", averagePrice=" + this.averagePrice + ", percentageForeignValue=" + this.percentageForeignValue + ", percentageDomesticValue=" + this.percentageDomesticValue + ")";
    }

    public ForeignFlowHistoricalNetDTO(String r1, String r2, String r3, RunningTradeValueDTO r4, RunningTradeValueDTO r5, RunningTradeValueDTO r6, RunningTradeValueDTO r7, RunningTradeValueDTO r8, RunningTradeValueDTO r9, RunningTradeValueDTO r10, RunningTradeValueDTO r11, RunningTradeValueDTO r12) {
        this.date = r1;
        this.datetimeLabel = r2;
        this.datetimeLabelTable = r3;
        this.netForeign = r4;
        this.foreignBuy = r5;
        this.foreignSell = r6;
        this.foreignFlow = r7;
        this.netLot = r8;
        this.netFrequency = r9;
        this.averagePrice = r10;
        this.percentageForeignValue = r11;
        this.percentageDomesticValue = r12;
    }

    public /* synthetic */ ForeignFlowHistoricalNetDTO(String r2, String r3, String r4, RunningTradeValueDTO r5, RunningTradeValueDTO r6, RunningTradeValueDTO r7, RunningTradeValueDTO r8, RunningTradeValueDTO r9, RunningTradeValueDTO r10, RunningTradeValueDTO r11, RunningTradeValueDTO r12, RunningTradeValueDTO r13, int r14, i r15) {
        if ((r14 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r14 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r14 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r14 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r14 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r14 & 32) == 0) goto L21;
        r7 = null;
    L21:
        if ((r14 & 64) == 0) goto L24;
        r8 = null;
    L24:
        if ((r14 & 128) == 0) goto L27;
        r9 = null;
    L27:
        if ((r14 & 256) == 0) goto L30;
        r10 = null;
    L30:
        if ((r14 & 512) == 0) goto L33;
        r11 = null;
    L33:
        if ((r14 & 1024) == 0) goto L36;
        r12 = null;
    L36:
        if ((r14 & 2048) == 0) goto L39;
        RunningTradeValueDTO r142 = null;
    L38:
        RunningTradeValueDTO r132 = r12;
        RunningTradeValueDTO r122 = r11;
        RunningTradeValueDTO r112 = r10;
        RunningTradeValueDTO r102 = r9;
        RunningTradeValueDTO r92 = r8;
        RunningTradeValueDTO r82 = r7;
        RunningTradeValueDTO r72 = r6;
        RunningTradeValueDTO r62 = r5;
        String r52 = r4;
        this(r2, r3, r52, r62, r72, r82, r92, r102, r112, r122, r132, r142);
        return;
    L39:
        r142 = r13;
        goto L38
    }
}
