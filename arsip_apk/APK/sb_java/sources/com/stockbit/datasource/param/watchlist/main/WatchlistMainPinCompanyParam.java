package com.stockbit.datasource.param.watchlist.main;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/stockbit/datasource/param/watchlist/main/WatchlistMainPinCompanyParam;", "", "companyId", "", "isPinned", "", "<init>", "(Ljava/lang/String;Z)V", "getCompanyId", "()Ljava/lang/String;", "()Z", "component1", "component2", Constants.COPY_TYPE, "equals", "other", "hashCode", "", "toString", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WatchlistMainPinCompanyParam {

    @SerializedName("company_id")
    private final String companyId;

    @SerializedName("is_pinned")
    private final boolean isPinned;

    public WatchlistMainPinCompanyParam(String r2, boolean r3) {
        p.l(r2, "companyId");
        this.companyId = r2;
        this.isPinned = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof WatchlistMainPinCompanyParam) == true) goto L8;
        return false;
    L8:
        WatchlistMainPinCompanyParam r52 = (WatchlistMainPinCompanyParam) r5;
        if (p.g(this.companyId, r52.companyId) == true) goto L12;
        return false;
    L12:
        if (this.isPinned == r52.isPinned) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.companyId.hashCode() * 31) + Boolean.hashCode(this.isPinned);
    }

    public String toString() {
        return "WatchlistMainPinCompanyParam(companyId=" + this.companyId + ", isPinned=" + this.isPinned + ")";
    }
}
