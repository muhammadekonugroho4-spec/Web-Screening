package com.stockbit.domain.model.chat.message;

import com.clevertap.android.sdk.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J1\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/stockbit/domain/model/chat/message/MessageFlagEntity;", "Ljava/io/Serializable;", "isReply", "", "isForwarded", "isTimeDisplayed", "isDeleted", "<init>", "(ZZZZ)V", "()Z", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "other", "", "hashCode", "", "toString", "", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MessageFlagEntity implements Serializable {
    private final boolean isDeleted;
    private final boolean isForwarded;
    private final boolean isReply;
    private final boolean isTimeDisplayed;

    public MessageFlagEntity(boolean r1, boolean r2, boolean r3, boolean r4) {
        this.isReply = r1;
        this.isForwarded = r2;
        this.isTimeDisplayed = r3;
        this.isDeleted = r4;
    }

    public final boolean a() {
        return this.isDeleted;
    }

    public final boolean b() {
        return this.isForwarded;
    }

    public final boolean c() {
        return this.isReply;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof MessageFlagEntity) == true) goto L8;
        return false;
    L8:
        MessageFlagEntity r52 = (MessageFlagEntity) r5;
        if (this.isReply == r52.isReply) goto L12;
        return false;
    L12:
        if (this.isForwarded == r52.isForwarded) goto L15;
        return false;
    L15:
        if (this.isTimeDisplayed == r52.isTimeDisplayed) goto L18;
        return false;
    L18:
        if (this.isDeleted == r52.isDeleted) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.isReply) * 31) + Boolean.hashCode(this.isForwarded)) * 31) + Boolean.hashCode(this.isTimeDisplayed)) * 31) + Boolean.hashCode(this.isDeleted);
    }

    public String toString() {
        return "MessageFlagEntity(isReply=" + this.isReply + ", isForwarded=" + this.isForwarded + ", isTimeDisplayed=" + this.isTimeDisplayed + ", isDeleted=" + this.isDeleted + ")";
    }

    public /* synthetic */ MessageFlagEntity(boolean r2, boolean r3, boolean r4, boolean r5, int r6, i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = false;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = false;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = false;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = false;
    L14:
        this(r2, r3, r4, r5);
    }
}
