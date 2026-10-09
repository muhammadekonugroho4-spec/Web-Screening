package com.stockbit.dto.watchlist.request;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0004HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/stockbit/dto/watchlist/request/WatchlistAddCompaniesRequestDTO;", "", "companyIds", "", "", "watchlistIds", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getCompanyIds", "()Ljava/util/List;", "getWatchlistIds", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WatchlistAddCompaniesRequestDTO {

    @SerializedName("company_ids")
    private final List<Integer> companyIds;

    @SerializedName("watchlist_ids")
    private final List<Integer> watchlistIds;

    public WatchlistAddCompaniesRequestDTO(List<Integer> r2, List<Integer> r3) {
        p.l(r2, "companyIds");
        p.l(r3, "watchlistIds");
        this.companyIds = r2;
        this.watchlistIds = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof WatchlistAddCompaniesRequestDTO) == true) goto L8;
        return false;
    L8:
        WatchlistAddCompaniesRequestDTO r52 = (WatchlistAddCompaniesRequestDTO) r5;
        if (p.g(this.companyIds, r52.companyIds) == true) goto L12;
        return false;
    L12:
        if (p.g(this.watchlistIds, r52.watchlistIds) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.companyIds.hashCode() * 31) + this.watchlistIds.hashCode();
    }

    public String toString() {
        return "WatchlistAddCompaniesRequestDTO(companyIds=" + this.companyIds + ", watchlistIds=" + this.watchlistIds + ")";
    }
}
