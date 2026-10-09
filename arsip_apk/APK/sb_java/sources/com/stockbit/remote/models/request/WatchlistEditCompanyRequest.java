package com.stockbit.remote.models.request;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0019B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0006HÖ\u0081\u0004R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/stockbit/remote/models/request/WatchlistEditCompanyRequest;", "", "companies", "", "Lcom/stockbit/remote/models/request/WatchlistEditCompanyRequest$Item;", "sortBy", "", "sortDirection", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getCompanies", "()Ljava/util/List;", "getSortBy", "()Ljava/lang/String;", "getSortDirection", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Item", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class WatchlistEditCompanyRequest {

    @SerializedName("companies")
    private final List<Item> companies;

    @SerializedName("sort_by")
    private final String sortBy;

    @SerializedName("sort_dir")
    private final String sortDirection;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/stockbit/remote/models/request/WatchlistEditCompanyRequest$Item;", "", "companyId", "", "sort", "", "isPinned", "", "<init>", "(JIZ)V", "getCompanyId", "()J", "getSort", "()I", "()Z", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "other", "hashCode", "toString", "", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Item {

        @SerializedName("company_id")
        private final long companyId;

        @SerializedName("is_pinned")
        private final boolean isPinned;

        @SerializedName("sort")
        private final int sort;

        public Item(long r1, int r3, boolean r4) {
            this.companyId = r1;
            this.sort = r3;
            this.isPinned = r4;
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
            if (this.sort == r82.sort) goto L15;
            return false;
        L15:
            if (this.isPinned == r82.isPinned) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((Long.hashCode(this.companyId) * 31) + Integer.hashCode(this.sort)) * 31) + Boolean.hashCode(this.isPinned);
        }

        public String toString() {
            return "Item(companyId=" + this.companyId + ", sort=" + this.sort + ", isPinned=" + this.isPinned + ')';
        }
    }

    public WatchlistEditCompanyRequest(List<Item> r2, String r3, String r4) {
        p.l(r2, "companies");
        p.l(r3, "sortBy");
        p.l(r4, "sortDirection");
        this.companies = r2;
        this.sortBy = r3;
        this.sortDirection = r4;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof WatchlistEditCompanyRequest) == true) goto L8;
        return false;
    L8:
        WatchlistEditCompanyRequest r52 = (WatchlistEditCompanyRequest) r5;
        if (p.g(this.companies, r52.companies) == true) goto L12;
        return false;
    L12:
        if (p.g(this.sortBy, r52.sortBy) == true) goto L15;
        return false;
    L15:
        if (p.g(this.sortDirection, r52.sortDirection) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.companies.hashCode() * 31) + this.sortBy.hashCode()) * 31) + this.sortDirection.hashCode();
    }

    public String toString() {
        return "WatchlistEditCompanyRequest(companies=" + this.companies + ", sortBy=" + this.sortBy + ", sortDirection=" + this.sortDirection + ')';
    }
}
