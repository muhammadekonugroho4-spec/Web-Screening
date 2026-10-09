package com.stockbit.remote.models.request;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.stockbit.calendar.CalendarEntryPoint;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001 B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0006HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/stockbit/remote/models/request/WatchlistStocksSymbolOnlyRequest;", "", CalendarEntryPoint.KEY_PAGE_DETAIL, "", Constants.KEY_LIMIT, "sortBy", "", "sortDirection", "companies", "", "Lcom/stockbit/remote/models/request/WatchlistStocksSymbolOnlyRequest$Item;", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getPage", "()I", "getLimit", "getSortBy", "()Ljava/lang/String;", "getSortDirection", "getCompanies", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "Item", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class WatchlistStocksSymbolOnlyRequest {

    @SerializedName("companies")
    private final List<Item> companies;

    @SerializedName(Constants.KEY_LIMIT)
    private final int limit;

    @SerializedName(CalendarEntryPoint.KEY_PAGE_DETAIL)
    private final int page;

    @SerializedName("sort_by")
    private final String sortBy;

    @SerializedName("sort_dir")
    private final String sortDirection;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b&\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010!Jf\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010.J\u0014\u0010/\u001a\u00020\r2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00101\u001a\u00020\nHÖ\u0081\u0004J\n\u00102\u001a\u00020\u0005HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0013\"\u0004\b\u0015\u0010\u0016R \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0016R \u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0016R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010\u0016R\"\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b\f\u0010!\"\u0004\b\"\u0010#¨\u00063"}, d2 = {"Lcom/stockbit/remote/models/request/WatchlistStocksSymbolOnlyRequest$Item;", "", "companyId", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "symbol", "symbol_2", "symbol_3", "sequenceNo", "", "iconUrl", "isPinned", "", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Boolean;)V", "getCompanyId", "()J", "getName", "()Ljava/lang/String;", "getSymbol", "setSymbol", "(Ljava/lang/String;)V", "getSymbol_2", "setSymbol_2", "getSymbol_3", "setSymbol_3", "getSequenceNo", "()I", "setSequenceNo", "(I)V", "getIconUrl", "setIconUrl", "()Ljava/lang/Boolean;", "setPinned", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", Constants.COPY_TYPE, "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Boolean;)Lcom/stockbit/remote/models/request/WatchlistStocksSymbolOnlyRequest$Item;", "equals", "other", "hashCode", "toString", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Item {

        @SerializedName("company_id")
        private final long companyId;

        @SerializedName("icon_url")
        @Expose
        private String iconUrl;

        @SerializedName("is_pinned")
        private Boolean isPinned;

        @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
        private final String name;

        @SerializedName("sequence_no")
        @Expose
        private int sequenceNo;

        @SerializedName("symbol")
        @Expose
        private String symbol;

        @SerializedName("symbol_2")
        @Expose
        private String symbol_2;

        @SerializedName("symbol_3")
        @Expose
        private String symbol_3;

        public Item(long r2, String r4, String r5, String r6, String r7, int r8, String r9, Boolean r10) {
            p.l(r4, AppMeasurementSdk.ConditionalUserProperty.NAME);
            p.l(r9, "iconUrl");
            this.companyId = r2;
            this.name = r4;
            this.symbol = r5;
            this.symbol_2 = r6;
            this.symbol_3 = r7;
            this.sequenceNo = r8;
            this.iconUrl = r9;
            this.isPinned = r10;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof Item) == true) goto L8;
            return false;
        L8:
            Item r82 = (Item) r8;
            if (this.companyId == r82.companyId) goto L12;
            return false;
        L12:
            if (p.g(this.name, r82.name) == true) goto L15;
            return false;
        L15:
            if (p.g(this.symbol, r82.symbol) == true) goto L18;
            return false;
        L18:
            if (p.g(this.symbol_2, r82.symbol_2) == true) goto L21;
            return false;
        L21:
            if (p.g(this.symbol_3, r82.symbol_3) == true) goto L24;
            return false;
        L24:
            if (this.sequenceNo == r82.sequenceNo) goto L27;
            return false;
        L27:
            if (p.g(this.iconUrl, r82.iconUrl) == true) goto L30;
            return false;
        L30:
            if (p.g(this.isPinned, r82.isPinned) == true) goto L32;
            return false;
        L32:
            return true;
        }

        public int hashCode() {
            int r02 = ((Long.hashCode(this.companyId) * 31) + this.name.hashCode()) * 31;
            String r1 = this.symbol;
            int r2 = 0;
            if (r1 != null) goto L5;
            int r12 = 0;
        L6:
            int r03 = (r02 + r12) * 31;
            String r13 = this.symbol_2;
            if (r13 != null) goto L9;
            int r14 = 0;
        L10:
            int r04 = (r03 + r14) * 31;
            String r15 = this.symbol_3;
            if (r15 != null) goto L13;
            int r16 = 0;
        L14:
            int r05 = (((((r04 + r16) * 31) + Integer.hashCode(this.sequenceNo)) * 31) + this.iconUrl.hashCode()) * 31;
            Boolean r17 = this.isPinned;
            if (r17 == null) goto L19;
            r2 = r17.hashCode();
        L19:
            return r05 + r2;
        L13:
            r16 = r15.hashCode();
            goto L14
        L9:
            r14 = r13.hashCode();
            goto L10
        L5:
            r12 = r1.hashCode();
            goto L6
        }

        public String toString() {
            return "Item(companyId=" + this.companyId + ", name=" + this.name + ", symbol=" + this.symbol + ", symbol_2=" + this.symbol_2 + ", symbol_3=" + this.symbol_3 + ", sequenceNo=" + this.sequenceNo + ", iconUrl=" + this.iconUrl + ", isPinned=" + this.isPinned + ')';
        }

        public /* synthetic */ Item(long r2, String r4, String r5, String r6, String r7, int r8, String r9, Boolean r10, int r11, i r12) {
            if ((r11 & 4) == 0) goto L6;
            r5 = null;
        L6:
            if ((r11 & 8) == 0) goto L9;
            r6 = null;
        L9:
            if ((r11 & 16) == 0) goto L12;
            r7 = null;
        L12:
            if ((r11 & 32) == 0) goto L15;
            r8 = 0;
        L15:
            if ((r11 & 64) == 0) goto L18;
            r9 = "";
        L18:
            if ((r11 & 128) == 0) goto L21;
            Boolean r112 = null;
        L20:
            String r102 = r9;
            int r92 = r8;
            String r82 = r7;
            this(r2, r4, r5, r6, r82, r92, r102, r112);
            return;
        L21:
            r112 = r10;
            goto L20
        }
    }

    public WatchlistStocksSymbolOnlyRequest(int r2, int r3, String r4, String r5, List<Item> r6) {
        p.l(r4, "sortBy");
        p.l(r5, "sortDirection");
        p.l(r6, "companies");
        this.page = r2;
        this.limit = r3;
        this.sortBy = r4;
        this.sortDirection = r5;
        this.companies = r6;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof WatchlistStocksSymbolOnlyRequest) == true) goto L8;
        return false;
    L8:
        WatchlistStocksSymbolOnlyRequest r52 = (WatchlistStocksSymbolOnlyRequest) r5;
        if (this.page == r52.page) goto L12;
        return false;
    L12:
        if (this.limit == r52.limit) goto L15;
        return false;
    L15:
        if (p.g(this.sortBy, r52.sortBy) == true) goto L18;
        return false;
    L18:
        if (p.g(this.sortDirection, r52.sortDirection) == true) goto L21;
        return false;
    L21:
        if (p.g(this.companies, r52.companies) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.page) * 31) + Integer.hashCode(this.limit)) * 31) + this.sortBy.hashCode()) * 31) + this.sortDirection.hashCode()) * 31) + this.companies.hashCode();
    }

    public String toString() {
        return "WatchlistStocksSymbolOnlyRequest(page=" + this.page + ", limit=" + this.limit + ", sortBy=" + this.sortBy + ", sortDirection=" + this.sortDirection + ", companies=" + this.companies + ')';
    }
}
