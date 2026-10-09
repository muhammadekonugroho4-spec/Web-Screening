package com.stockbit.dto.company.tradebook;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/stockbit/dto/company/tradebook/TradeBookBuySellDTO;", "", "lot", "", Constants.KEY_FREQUENCY, "percent", "value", "valuePercentage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLot", "()Ljava/lang/String;", "getFrequency", "getPercent", "getValue", "getValuePercentage", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TradeBookBuySellDTO {

    @SerializedName(Constants.KEY_FREQUENCY)
    private final String frequency;

    @SerializedName("lot")
    private final String lot;

    @SerializedName("percentage")
    private final String percent;

    @SerializedName("value")
    private final String value;

    @SerializedName("value_percentage")
    private final String valuePercentage;

    public TradeBookBuySellDTO(String r1, String r2, String r3, String r4, String r5) {
        this.lot = r1;
        this.frequency = r2;
        this.percent = r3;
        this.value = r4;
        this.valuePercentage = r5;
    }

    public final String a() {
        return this.frequency;
    }

    public final String b() {
        return this.lot;
    }

    public final String c() {
        return this.percent;
    }

    public final String d() {
        return this.value;
    }

    public final String e() {
        return this.valuePercentage;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof TradeBookBuySellDTO) == true) goto L8;
        return false;
    L8:
        TradeBookBuySellDTO r52 = (TradeBookBuySellDTO) r5;
        if (p.g(this.lot, r52.lot) == true) goto L12;
        return false;
    L12:
        if (p.g(this.frequency, r52.frequency) == true) goto L15;
        return false;
    L15:
        if (p.g(this.percent, r52.percent) == true) goto L18;
        return false;
    L18:
        if (p.g(this.value, r52.value) == true) goto L21;
        return false;
    L21:
        if (p.g(this.valuePercentage, r52.valuePercentage) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        String r02 = this.lot;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.frequency;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.percent;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.value;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.valuePercentage;
        if (r27 == null) goto L23;
        r1 = r27.hashCode();
    L23:
        return r07 + r1;
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
        return "TradeBookBuySellDTO(lot=" + this.lot + ", frequency=" + this.frequency + ", percent=" + this.percent + ", value=" + this.value + ", valuePercentage=" + this.valuePercentage + ")";
    }

    public /* synthetic */ TradeBookBuySellDTO(String r2, String r3, String r4, String r5, String r6, int r7, i r8) {
        if ((r7 & 8) == 0) goto L6;
        r5 = null;
    L6:
        if ((r7 & 16) == 0) goto L9;
        String r72 = null;
    L10:
        this(r2, r3, r4, r5, r72);
        return;
    L9:
        r72 = r6;
        goto L10
    }
}
