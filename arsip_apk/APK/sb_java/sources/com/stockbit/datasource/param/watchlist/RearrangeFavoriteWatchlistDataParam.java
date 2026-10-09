package com.stockbit.datasource.param.watchlist;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/stockbit/datasource/param/watchlist/RearrangeFavoriteWatchlistDataParam;", "", "watchlist", "", "Lcom/stockbit/datasource/param/watchlist/RearrangeFavoriteWatchlistItemDataParam;", "<init>", "(Ljava/util/List;)V", "getWatchlist", "()Ljava/util/List;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RearrangeFavoriteWatchlistDataParam {

    @SerializedName("watchlist")
    private final List<RearrangeFavoriteWatchlistItemDataParam> watchlist;

    public RearrangeFavoriteWatchlistDataParam(List<RearrangeFavoriteWatchlistItemDataParam> r2) {
        p.l(r2, "watchlist");
        this.watchlist = r2;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof RearrangeFavoriteWatchlistDataParam) == true) goto L9;
        return false;
    L9:
        if (p.g(this.watchlist, ((RearrangeFavoriteWatchlistDataParam) r4).watchlist) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.watchlist.hashCode();
    }

    public String toString() {
        return "RearrangeFavoriteWatchlistDataParam(watchlist=" + this.watchlist + ")";
    }
}
