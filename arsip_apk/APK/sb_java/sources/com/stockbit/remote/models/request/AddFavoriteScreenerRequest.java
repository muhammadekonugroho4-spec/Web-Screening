package com.stockbit.remote.models.request;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/stockbit/remote/models/request/AddFavoriteScreenerRequest;", "", "type", "", "screenerId", "<init>", "(II)V", "getType", "()I", "setType", "(I)V", "getScreenerId", "setScreenerId", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "", "remote_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AddFavoriteScreenerRequest {

    @SerializedName("screenerid")
    private int screenerId;

    @SerializedName("type")
    private int type;

    public AddFavoriteScreenerRequest(int r1, int r2) {
        this.type = r1;
        this.screenerId = r2;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AddFavoriteScreenerRequest) == true) goto L8;
        return false;
    L8:
        AddFavoriteScreenerRequest r52 = (AddFavoriteScreenerRequest) r5;
        if (this.type == r52.type) goto L12;
        return false;
    L12:
        if (this.screenerId == r52.screenerId) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.type) * 31) + Integer.hashCode(this.screenerId);
    }

    public String toString() {
        return "AddFavoriteScreenerRequest(type=" + this.type + ", screenerId=" + this.screenerId + ')';
    }
}
