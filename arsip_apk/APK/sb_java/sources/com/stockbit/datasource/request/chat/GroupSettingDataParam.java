package com.stockbit.datasource.request.chat;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/stockbit/datasource/request/chat/GroupSettingDataParam;", "", "shareTradePermission", "", "<init>", "(Z)V", "getShareTradePermission", "()Z", "component1", Constants.COPY_TYPE, "equals", "other", "hashCode", "", "toString", "", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GroupSettingDataParam {

    @SerializedName("sharetrade_permission")
    private final boolean shareTradePermission;

    public GroupSettingDataParam(boolean r1) {
        this.shareTradePermission = r1;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof GroupSettingDataParam) == true) goto L9;
        return false;
    L9:
        if (this.shareTradePermission == ((GroupSettingDataParam) r4).shareTradePermission) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return Boolean.hashCode(this.shareTradePermission);
    }

    public String toString() {
        return "GroupSettingDataParam(shareTradePermission=" + this.shareTradePermission + ")";
    }
}
