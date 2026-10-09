package com.stockbit.model.entity.chatroom;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/stockbit/model/entity/chatroom/StatusRoomResponseData;", "", "isMuted", "", "isMentioned", "<init>", "(ZZ)V", "()Z", "component1", "component2", Constants.COPY_TYPE, "equals", "other", "hashCode", "", "toString", "", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class StatusRoomResponseData {

    @SerializedName("is_mentioned")
    private final boolean isMentioned;

    @SerializedName("is_muted")
    private final boolean isMuted;

    public StatusRoomResponseData(boolean r1, boolean r2) {
        this.isMuted = r1;
        this.isMentioned = r2;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof StatusRoomResponseData) == true) goto L8;
        return false;
    L8:
        StatusRoomResponseData r52 = (StatusRoomResponseData) r5;
        if (this.isMuted == r52.isMuted) goto L12;
        return false;
    L12:
        if (this.isMentioned == r52.isMentioned) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isMuted) * 31) + Boolean.hashCode(this.isMentioned);
    }

    public String toString() {
        return "StatusRoomResponseData(isMuted=" + this.isMuted + ", isMentioned=" + this.isMentioned + ')';
    }
}
