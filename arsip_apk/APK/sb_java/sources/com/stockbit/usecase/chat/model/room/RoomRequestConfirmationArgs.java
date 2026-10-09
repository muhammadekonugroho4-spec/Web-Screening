package com.stockbit.usecase.chat.model.room;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/stockbit/usecase/chat/model/room/RoomRequestConfirmationArgs;", "Ljava/io/Serializable;", "isAccept", "", "totalMessageRequest", "", "isDeleteAll", "<init>", "(ZIZ)V", "()Z", "getTotalMessageRequest", "()I", "component1", "component2", "component3", Constants.COPY_TYPE, "equals", "other", "", "hashCode", "toString", "", "usecase-chat"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RoomRequestConfirmationArgs implements Serializable {
    private final boolean isAccept;
    private final boolean isDeleteAll;
    private final int totalMessageRequest;

    public RoomRequestConfirmationArgs(boolean r1, int r2, boolean r3) {
        this.isAccept = r1;
        this.totalMessageRequest = r2;
        this.isDeleteAll = r3;
    }

    public final int a() {
        return this.totalMessageRequest;
    }

    public final boolean b() {
        return this.isAccept;
    }

    public final boolean c() {
        return this.isDeleteAll;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof RoomRequestConfirmationArgs) == true) goto L8;
        return false;
    L8:
        RoomRequestConfirmationArgs r52 = (RoomRequestConfirmationArgs) r5;
        if (this.isAccept == r52.isAccept) goto L12;
        return false;
    L12:
        if (this.totalMessageRequest == r52.totalMessageRequest) goto L15;
        return false;
    L15:
        if (this.isDeleteAll == r52.isDeleteAll) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isAccept) * 31) + Integer.hashCode(this.totalMessageRequest)) * 31) + Boolean.hashCode(this.isDeleteAll);
    }

    public String toString() {
        return "RoomRequestConfirmationArgs(isAccept=" + this.isAccept + ", totalMessageRequest=" + this.totalMessageRequest + ", isDeleteAll=" + this.isDeleteAll + ")";
    }
}
