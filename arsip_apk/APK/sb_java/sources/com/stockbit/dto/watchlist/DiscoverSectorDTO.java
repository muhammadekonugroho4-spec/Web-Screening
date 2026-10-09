package com.stockbit.dto.watchlist;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001aJJ\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010$J\u0014\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010(\u001a\u00020\tHÖ\u0081\u0004J\n\u0010)\u001a\u00020\u0005HÖ\u0081\u0004R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\"\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006*"}, d2 = {"Lcom/stockbit/dto/watchlist/DiscoverSectorDTO;", "", "companyId", "", "symbol", "", "symbol2", Constants.KEY_ICON, "totalStock", "", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getCompanyId", "()Ljava/lang/Long;", "setCompanyId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getSymbol", "()Ljava/lang/String;", "setSymbol", "(Ljava/lang/String;)V", "getSymbol2", "setSymbol2", "getIcon", "setIcon", "getTotalStock", "()Ljava/lang/Integer;", "setTotalStock", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/stockbit/dto/watchlist/DiscoverSectorDTO;", "equals", "", "other", "hashCode", "toString", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DiscoverSectorDTO {

    @SerializedName(alternate = {"companyid"}, value = "company_id")
    private Long companyId;

    @SerializedName(Constants.KEY_ICON)
    private String icon;

    @SerializedName("symbol")
    private String symbol;

    @SerializedName("symbol_2")
    private String symbol2;

    @SerializedName("total_stock")
    private Integer totalStock;

    public DiscoverSectorDTO() {
        Long r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        Integer r5 = null;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    public final Long a() {
        return this.companyId;
    }

    public final String b() {
        return this.icon;
    }

    public final String c() {
        return this.symbol;
    }

    public final String d() {
        return this.symbol2;
    }

    public final Integer e() {
        return this.totalStock;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof DiscoverSectorDTO) == true) goto L8;
        return false;
    L8:
        DiscoverSectorDTO r52 = (DiscoverSectorDTO) r5;
        if (p.g(this.companyId, r52.companyId) == true) goto L12;
        return false;
    L12:
        if (p.g(this.symbol, r52.symbol) == true) goto L15;
        return false;
    L15:
        if (p.g(this.symbol2, r52.symbol2) == true) goto L18;
        return false;
    L18:
        if (p.g(this.icon, r52.icon) == true) goto L21;
        return false;
    L21:
        if (p.g(this.totalStock, r52.totalStock) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        Long r02 = this.companyId;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.symbol;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.symbol2;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.icon;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        Integer r27 = this.totalStock;
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
        return "DiscoverSectorDTO(companyId=" + this.companyId + ", symbol=" + this.symbol + ", symbol2=" + this.symbol2 + ", icon=" + this.icon + ", totalStock=" + this.totalStock + ")";
    }

    public DiscoverSectorDTO(Long r1, String r2, String r3, String r4, Integer r5) {
        this.companyId = r1;
        this.symbol = r2;
        this.symbol2 = r3;
        this.icon = r4;
        this.totalStock = r5;
    }

    public /* synthetic */ DiscoverSectorDTO(Long r2, String r3, String r4, String r5, Integer r6, int r7, i r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r7 & 16) == 0) goto L18;
        Integer r72 = null;
    L17:
        String r62 = r5;
        String r52 = r4;
        this(r2, r3, r52, r62, r72);
        return;
    L18:
        r72 = r6;
        goto L17
    }
}
