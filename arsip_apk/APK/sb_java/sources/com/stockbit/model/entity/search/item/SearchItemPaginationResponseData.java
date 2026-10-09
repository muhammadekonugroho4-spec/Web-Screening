package com.stockbit.model.entity.search.item;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/stockbit/model/entity/search/item/SearchItemPaginationResponseData;", "", "hasMoreCompanies", "", "hasMoreInsiders", "hasMoreUsers", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getHasMoreCompanies", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHasMoreInsiders", "getHasMoreUsers", "component1", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/stockbit/model/entity/search/item/SearchItemPaginationResponseData;", "equals", "other", "hashCode", "", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SearchItemPaginationResponseData {

    @SerializedName("has_more_companies")
    private final Boolean hasMoreCompanies;

    @SerializedName("has_more_insiders")
    private final Boolean hasMoreInsiders;

    @SerializedName("has_more_users")
    private final Boolean hasMoreUsers;

    public SearchItemPaginationResponseData() {
        Boolean r1 = null;
        Boolean r2 = null;
        Boolean r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public final Boolean a() {
        return this.hasMoreCompanies;
    }

    public final Boolean b() {
        return this.hasMoreInsiders;
    }

    public final Boolean c() {
        return this.hasMoreUsers;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof SearchItemPaginationResponseData) == true) goto L8;
        return false;
    L8:
        SearchItemPaginationResponseData r52 = (SearchItemPaginationResponseData) r5;
        if (p.g(this.hasMoreCompanies, r52.hasMoreCompanies) == true) goto L12;
        return false;
    L12:
        if (p.g(this.hasMoreInsiders, r52.hasMoreInsiders) == true) goto L15;
        return false;
    L15:
        if (p.g(this.hasMoreUsers, r52.hasMoreUsers) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        Boolean r02 = this.hasMoreCompanies;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Boolean r2 = this.hasMoreInsiders;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Boolean r23 = this.hasMoreUsers;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return r05 + r1;
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "SearchItemPaginationResponseData(hasMoreCompanies=" + this.hasMoreCompanies + ", hasMoreInsiders=" + this.hasMoreInsiders + ", hasMoreUsers=" + this.hasMoreUsers + ')';
    }

    public SearchItemPaginationResponseData(Boolean r1, Boolean r2, Boolean r3) {
        this.hasMoreCompanies = r1;
        this.hasMoreInsiders = r2;
        this.hasMoreUsers = r3;
    }

    public /* synthetic */ SearchItemPaginationResponseData(Boolean r1, Boolean r2, Boolean r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = Boolean.FALSE;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = Boolean.FALSE;
    L9:
        if ((r4 & 4) == 0) goto L11;
        r3 = Boolean.FALSE;
    L11:
        this(r1, r2, r3);
    }
}
