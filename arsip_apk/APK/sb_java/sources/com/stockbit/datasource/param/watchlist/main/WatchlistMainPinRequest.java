package com.stockbit.datasource.param.watchlist.main;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/stockbit/datasource/param/watchlist/main/WatchlistMainPinRequest;", "", "companies", "", "Lcom/stockbit/datasource/param/watchlist/main/WatchlistMainPinCompanyParam;", "<init>", "(Ljava/util/List;)V", "getCompanies", "()Ljava/util/List;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WatchlistMainPinRequest {

    @SerializedName("companies")
    private final List<WatchlistMainPinCompanyParam> companies;

    public WatchlistMainPinRequest(List<WatchlistMainPinCompanyParam> r2) {
        p.l(r2, "companies");
        this.companies = r2;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof WatchlistMainPinRequest) == true) goto L9;
        return false;
    L9:
        if (p.g(this.companies, ((WatchlistMainPinRequest) r4).companies) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.companies.hashCode();
    }

    public String toString() {
        return "WatchlistMainPinRequest(companies=" + this.companies + ")";
    }
}
