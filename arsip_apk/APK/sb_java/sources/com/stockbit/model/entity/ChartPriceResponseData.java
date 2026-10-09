package com.stockbit.model.entity;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u007f\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00102\u001a\u000203HÖ\u0081\u0004J\n\u00104\u001a\u00020\u0003HÖ\u0081\u0004R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0011R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0011R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0011¨\u00065"}, d2 = {"Lcom/stockbit/model/entity/ChartPriceResponseData;", "", Constants.KEY_DATE, "", "formattedDate", "xlabel", "value", "percentage", "change", "", "open", Constants.PRIORITY_HIGH, "low", "volume", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "getFormattedDate", "setFormattedDate", "getXlabel", "setXlabel", "getValue", "setValue", "getPercentage", "setPercentage", "getChange", "()D", "setChange", "(D)V", "getOpen", "getHigh", "getLow", "getVolume", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ChartPriceResponseData {

    @SerializedName("change")
    @Expose
    private double change;

    @SerializedName(Constants.KEY_DATE)
    @Expose
    private String date;

    @SerializedName("formatted_date")
    @Expose
    private String formattedDate;

    @SerializedName(Constants.PRIORITY_HIGH)
    @Expose
    private final String high;

    @SerializedName("low")
    @Expose
    private final String low;

    @SerializedName("open")
    @Expose
    private final String open;

    @SerializedName("percentage")
    @Expose
    private String percentage;

    @SerializedName("value")
    @Expose
    private String value;

    @SerializedName("volume")
    @Expose
    private final String volume;

    @SerializedName("xlabel")
    @Expose
    private String xlabel;

    public ChartPriceResponseData() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        double r6 = 0.0d;
        String r8 = null;
        String r9 = null;
        String r10 = null;
        String r11 = null;
        this(r1, r2, r3, r4, r5, r6, r8, r9, r10, r11, 1023, null);
    }

    public final double a() {
        return this.change;
    }

    public final String b() {
        return this.date;
    }

    public final String c() {
        return this.formattedDate;
    }

    public final String d() {
        return this.high;
    }

    public final String e() {
        return this.low;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof ChartPriceResponseData) == true) goto L8;
        return false;
    L8:
        ChartPriceResponseData r82 = (ChartPriceResponseData) r8;
        if (p.g(this.date, r82.date) == true) goto L12;
        return false;
    L12:
        if (p.g(this.formattedDate, r82.formattedDate) == true) goto L15;
        return false;
    L15:
        if (p.g(this.xlabel, r82.xlabel) == true) goto L18;
        return false;
    L18:
        if (p.g(this.value, r82.value) == true) goto L21;
        return false;
    L21:
        if (p.g(this.percentage, r82.percentage) == true) goto L24;
        return false;
    L24:
        if (Double.compare(this.change, r82.change) == 0) goto L27;
        return false;
    L27:
        if (p.g(this.open, r82.open) == true) goto L30;
        return false;
    L30:
        if (p.g(this.high, r82.high) == true) goto L33;
        return false;
    L33:
        if (p.g(this.low, r82.low) == true) goto L36;
        return false;
    L36:
        if (p.g(this.volume, r82.volume) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.open;
    }

    public final String g() {
        return this.percentage;
    }

    public final String h() {
        return this.value;
    }

    public int hashCode() {
        String r02 = this.date;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.formattedDate;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.xlabel;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.value;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.percentage;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (((r07 + r28) * 31) + Double.hashCode(this.change)) * 31;
        String r29 = this.open;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.high;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.low;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.volume;
        if (r215 == null) goto L39;
        r1 = r215.hashCode();
    L39:
        return r011 + r1;
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
        return this.volume;
    }

    public final String j() {
        return this.xlabel;
    }

    public String toString() {
        return "ChartPriceResponseData(date=" + this.date + ", formattedDate=" + this.formattedDate + ", xlabel=" + this.xlabel + ", value=" + this.value + ", percentage=" + this.percentage + ", change=" + this.change + ", open=" + this.open + ", high=" + this.high + ", low=" + this.low + ", volume=" + this.volume + ')';
    }

    public ChartPriceResponseData(String r1, String r2, String r3, String r4, String r5, double r6, String r8, String r9, String r10, String r11) {
        this.date = r1;
        this.formattedDate = r2;
        this.xlabel = r3;
        this.value = r4;
        this.percentage = r5;
        this.change = r6;
        this.open = r8;
        this.high = r9;
        this.low = r10;
        this.volume = r11;
    }

    public /* synthetic */ ChartPriceResponseData(String r2, String r3, String r4, String r5, String r6, double r7, String r9, String r10, String r11, String r12, int r13, i r14) {
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
        r7 = 0.0d;
    L21:
        if ((r13 & 64) == 0) goto L24;
        r9 = "";
    L24:
        if ((r13 & 128) == 0) goto L27;
        r10 = "";
    L27:
        if ((r13 & 256) == 0) goto L30;
        r11 = "";
    L30:
        if ((r13 & 512) == 0) goto L33;
        String r132 = "";
    L32:
        String r122 = r11;
        double r8 = r7;
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        this(r2, r3, r52, r62, r72, r8, r9, r10, r122, r132);
        return;
    L33:
        r132 = r12;
        goto L32
    }
}
