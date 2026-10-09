package com.stockbit.remote.models.request.watchlist;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import com.stockbit.calendar.CalendarEntryPoint;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0006HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/stockbit/remote/models/request/watchlist/WatchlistStockSymbolRequest;", "", CalendarEntryPoint.KEY_PAGE_DETAIL, "", Constants.KEY_LIMIT, "sortBy", "", "sortDirection", "companies", "", "Lcom/stockbit/remote/models/request/watchlist/WatchlistStockSymbolCompanyRequest;", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getPage", "()I", "getLimit", "getSortBy", "()Ljava/lang/String;", "getSortDirection", "getCompanies", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class WatchlistStockSymbolRequest {

    @SerializedName("companies")
    private final List<Object> companies;

    @SerializedName(Constants.KEY_LIMIT)
    private final int limit;

    @SerializedName(CalendarEntryPoint.KEY_PAGE_DETAIL)
    private final int page;

    @SerializedName("sort_by")
    private final String sortBy;

    @SerializedName("sort_dir")
    private final String sortDirection;

    public WatchlistStockSymbolRequest(int r2, int r3, String r4, String r5, List<Object> r6) {
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
        if ((r5 instanceof WatchlistStockSymbolRequest) == true) goto L8;
        return false;
    L8:
        WatchlistStockSymbolRequest r52 = (WatchlistStockSymbolRequest) r5;
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
        return "WatchlistStockSymbolRequest(page=" + this.page + ", limit=" + this.limit + ", sortBy=" + this.sortBy + ", sortDirection=" + this.sortDirection + ", companies=" + this.companies + ')';
    }

    public /* synthetic */ WatchlistStockSymbolRequest(int r2, int r3, String r4, String r5, List r6, int r7, i r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r7 & 2) == 0) goto L9;
        List r72 = r6;
        String r62 = r5;
        String r52 = r4;
        int r42 = 0;
    L10:
        this(r2, r42, r52, r62, r72);
        return;
    L9:
        r72 = r6;
        r62 = r5;
        r52 = r4;
        r42 = r3;
        goto L10
    }
}
