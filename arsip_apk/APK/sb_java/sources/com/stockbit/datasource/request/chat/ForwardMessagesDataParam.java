package com.stockbit.datasource.request.chat;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\bHÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0006HÖ\u0081\u0004R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/stockbit/datasource/request/chat/ForwardMessagesDataParam;", "", "receivers", "", "Lcom/stockbit/datasource/request/chat/ReceiverDataParam;", Constants.KEY_TEXT, "", "messageIds", "", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getReceivers", "()Ljava/util/List;", "getText", "()Ljava/lang/String;", "getMessageIds", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "remote-datasource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ForwardMessagesDataParam {

    @SerializedName("message_ids")
    private final List<Integer> messageIds;

    @SerializedName("receivers")
    private final List<ReceiverDataParam> receivers;

    @SerializedName(Constants.KEY_TEXT)
    private final String text;

    public ForwardMessagesDataParam(List<ReceiverDataParam> r2, String r3, List<Integer> r4) {
        p.l(r2, "receivers");
        p.l(r4, "messageIds");
        this.receivers = r2;
        this.text = r3;
        this.messageIds = r4;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ForwardMessagesDataParam) == true) goto L8;
        return false;
    L8:
        ForwardMessagesDataParam r52 = (ForwardMessagesDataParam) r5;
        if (p.g(this.receivers, r52.receivers) == true) goto L12;
        return false;
    L12:
        if (p.g(this.text, r52.text) == true) goto L15;
        return false;
    L15:
        if (p.g(this.messageIds, r52.messageIds) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = this.receivers.hashCode() * 31;
        String r1 = this.text;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((r02 + r12) * 31) + this.messageIds.hashCode();
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "ForwardMessagesDataParam(receivers=" + this.receivers + ", text=" + this.text + ", messageIds=" + this.messageIds + ")";
    }
}
