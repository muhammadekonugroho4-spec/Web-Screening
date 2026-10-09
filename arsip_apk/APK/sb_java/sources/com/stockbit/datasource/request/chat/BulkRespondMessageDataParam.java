package com.stockbit.datasource.request.chat;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0004HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0006HÖ\u0081\u0004R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/stockbit/datasource/request/chat/BulkRespondMessageDataParam;", "", "roomIds", "", "", Constants.KEY_ACTION, "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getRoomIds", "()Ljava/util/List;", "getAction", "()Ljava/lang/String;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BulkRespondMessageDataParam {

    @SerializedName(Constants.KEY_ACTION)
    private final String action;

    @SerializedName("room_ids")
    private final List<Integer> roomIds;

    public BulkRespondMessageDataParam(List<Integer> r2, String r3) {
        p.l(r2, "roomIds");
        p.l(r3, Constants.KEY_ACTION);
        this.roomIds = r2;
        this.action = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BulkRespondMessageDataParam) == true) goto L8;
        return false;
    L8:
        BulkRespondMessageDataParam r52 = (BulkRespondMessageDataParam) r5;
        if (p.g(this.roomIds, r52.roomIds) == true) goto L12;
        return false;
    L12:
        if (p.g(this.action, r52.action) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.roomIds.hashCode() * 31) + this.action.hashCode();
    }

    public String toString() {
        return "BulkRespondMessageDataParam(roomIds=" + this.roomIds + ", action=" + this.action + ")";
    }
}
