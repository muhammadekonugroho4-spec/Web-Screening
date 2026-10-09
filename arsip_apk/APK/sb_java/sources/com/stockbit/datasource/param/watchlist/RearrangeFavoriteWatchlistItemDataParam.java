package com.stockbit.datasource.param.watchlist;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/stockbit/datasource/param/watchlist/RearrangeFavoriteWatchlistItemDataParam;", "", Constants.KEY_ID, "", "isFavorite", "", "<init>", "(IZ)V", "getId", "()I", "()Z", "component1", "component2", Constants.COPY_TYPE, "equals", "other", "hashCode", "toString", "", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RearrangeFavoriteWatchlistItemDataParam {

    /* renamed from: id, reason: collision with root package name */
    @SerializedName(Constants.KEY_ID)
    private final int f80110id;

    @SerializedName("is_favorite")
    private final boolean isFavorite;

    public RearrangeFavoriteWatchlistItemDataParam(int r1, boolean r2) {
        this.f80110id = r1;
        this.isFavorite = r2;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof RearrangeFavoriteWatchlistItemDataParam) == true) goto L8;
        return false;
    L8:
        RearrangeFavoriteWatchlistItemDataParam r52 = (RearrangeFavoriteWatchlistItemDataParam) r5;
        if (this.f80110id == r52.f80110id) goto L12;
        return false;
    L12:
        if (this.isFavorite == r52.isFavorite) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f80110id) * 31) + Boolean.hashCode(this.isFavorite);
    }

    public String toString() {
        return "RearrangeFavoriteWatchlistItemDataParam(id=" + this.f80110id + ", isFavorite=" + this.isFavorite + ")";
    }
}
