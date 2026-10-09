package com.stockbit.usecase.chat.model.room;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/stockbit/usecase/chat/model/room/UnreadMessage;", "Ljava/io/Serializable;", "total", "", "lastId", "", "<init>", "(ILjava/lang/String;)V", "getTotal", "()I", "getLastId", "()Ljava/lang/String;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "toString", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UnreadMessage implements Serializable {
    private final String lastId;
    private final int total;

    public UnreadMessage(int r2, String r3) {
        p.l(r3, "lastId");
        this.total = r2;
        this.lastId = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof UnreadMessage) == true) goto L8;
        return false;
    L8:
        UnreadMessage r52 = (UnreadMessage) r5;
        if (this.total == r52.total) goto L12;
        return false;
    L12:
        if (p.g(this.lastId, r52.lastId) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.total) * 31) + this.lastId.hashCode();
    }

    public String toString() {
        return "UnreadMessage(total=" + this.total + ", lastId=" + this.lastId + ")";
    }

    public /* synthetic */ UnreadMessage(int r1, String r2, int r3, i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = 0;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = "";
    L8:
        this(r1, r2);
    }
}
