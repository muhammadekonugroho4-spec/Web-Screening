package com.stockbit.dto.emitten;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010$J\u0011\u00105\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eHÆ\u0003J\u008c\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u00107J\u0014\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010;\u001a\u00020<HÖ\u0081\u0004J\n\u0010=\u001a\u00020\u0003HÖ\u0081\u0004R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0014R\"\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R&\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006>"}, d2 = {"Lcom/stockbit/dto/emitten/EmittenCatalogItemDTO;", "", "previous", "", "last", "change", "percent", "type", "symbol", "symbol2", Constants.KEY_ICON, "companyId", "", "prices", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;)V", "getPrevious", "()Ljava/lang/String;", "setPrevious", "(Ljava/lang/String;)V", "getLast", "setLast", "getChange", "setChange", "getPercent", "setPercent", "getType", "setType", "getSymbol", "setSymbol", "getSymbol2", "setSymbol2", "getIcon", "setIcon", "getCompanyId", "()Ljava/lang/Long;", "setCompanyId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getPrices", "()Ljava/util/List;", "setPrices", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;)Lcom/stockbit/dto/emitten/EmittenCatalogItemDTO;", "equals", "", "other", "hashCode", "", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EmittenCatalogItemDTO {

    @SerializedName("change")
    private String change;

    @SerializedName(Constants.KEY_ID)
    private Long companyId;

    @SerializedName(Constants.KEY_ICON)
    private String icon;

    @SerializedName("last")
    private String last;

    @SerializedName("percent")
    private String percent;

    @SerializedName("previous")
    private String previous;

    @SerializedName("prices")
    private List<String> prices;

    @SerializedName("symbol")
    private String symbol;

    @SerializedName("symbol_2")
    private String symbol2;

    @SerializedName("type")
    private String type;

    public EmittenCatalogItemDTO() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        Long r9 = null;
        List r10 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, 1023, null);
    }

    public final String a() {
        return this.change;
    }

    public final Long b() {
        return this.companyId;
    }

    public final String c() {
        return this.icon;
    }

    public final String d() {
        return this.last;
    }

    public final String e() {
        return this.percent;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof EmittenCatalogItemDTO) == true) goto L8;
        return false;
    L8:
        EmittenCatalogItemDTO r52 = (EmittenCatalogItemDTO) r5;
        if (p.g(this.previous, r52.previous) == true) goto L12;
        return false;
    L12:
        if (p.g(this.last, r52.last) == true) goto L15;
        return false;
    L15:
        if (p.g(this.change, r52.change) == true) goto L18;
        return false;
    L18:
        if (p.g(this.percent, r52.percent) == true) goto L21;
        return false;
    L21:
        if (p.g(this.type, r52.type) == true) goto L24;
        return false;
    L24:
        if (p.g(this.symbol, r52.symbol) == true) goto L27;
        return false;
    L27:
        if (p.g(this.symbol2, r52.symbol2) == true) goto L30;
        return false;
    L30:
        if (p.g(this.icon, r52.icon) == true) goto L33;
        return false;
    L33:
        if (p.g(this.companyId, r52.companyId) == true) goto L36;
        return false;
    L36:
        if (p.g(this.prices, r52.prices) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.previous;
    }

    public final List g() {
        return this.prices;
    }

    public final String h() {
        return this.symbol;
    }

    public int hashCode() {
        String r02 = this.previous;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.last;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.change;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.percent;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.type;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.symbol;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.symbol2;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.icon;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        Long r215 = this.companyId;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        List<String> r217 = this.prices;
        if (r217 == null) goto L43;
        r1 = r217.hashCode();
    L43:
        return r012 + r1;
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
        return this.symbol2;
    }

    public final String j() {
        return this.type;
    }

    public String toString() {
        return "EmittenCatalogItemDTO(previous=" + this.previous + ", last=" + this.last + ", change=" + this.change + ", percent=" + this.percent + ", type=" + this.type + ", symbol=" + this.symbol + ", symbol2=" + this.symbol2 + ", icon=" + this.icon + ", companyId=" + this.companyId + ", prices=" + this.prices + ")";
    }

    public EmittenCatalogItemDTO(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, Long r9, List<String> r10) {
        this.previous = r1;
        this.last = r2;
        this.change = r3;
        this.percent = r4;
        this.type = r5;
        this.symbol = r6;
        this.symbol2 = r7;
        this.icon = r8;
        this.companyId = r9;
        this.prices = r10;
    }

    public /* synthetic */ EmittenCatalogItemDTO(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, Long r10, List r11, int r12, i r13) {
        if ((r12 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r12 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r12 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r12 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r12 & 32) == 0) goto L21;
        r7 = null;
    L21:
        if ((r12 & 64) == 0) goto L24;
        r8 = null;
    L24:
        if ((r12 & 128) == 0) goto L27;
        r9 = null;
    L27:
        if ((r12 & 256) == 0) goto L30;
        r10 = null;
    L30:
        if ((r12 & 512) == 0) goto L33;
        List r122 = null;
    L32:
        Long r112 = r10;
        String r102 = r9;
        String r92 = r8;
        String r82 = r7;
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        this(r2, r3, r52, r62, r72, r82, r92, r102, r112, r122);
        return;
    L33:
        r122 = r11;
        goto L32
    }
}
