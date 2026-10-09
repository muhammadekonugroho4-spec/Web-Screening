package com.stockbit.dto.chat.room;

import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ&\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/stockbit/dto/chat/room/UnreadChatRoomDTO;", "", "count", "", "hasNewMessages", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHasNewMessages", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", Constants.COPY_TYPE, "(Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/stockbit/dto/chat/room/UnreadChatRoomDTO;", "equals", "other", "hashCode", "toString", "", "dto"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UnreadChatRoomDTO {

    @SerializedName("count")
    private final Integer count;

    @SerializedName("has_new_messages")
    private final Boolean hasNewMessages;

    /* JADX WARN: Multi-variable type inference failed */
    public UnreadChatRoomDTO() {
        Object[] r02 = 0 == true ? 1 : 0;
        this(null, r02, 3, 0 == true ? 1 : 0);
    }

    public final Integer a() {
        return this.count;
    }

    public final Boolean b() {
        return this.hasNewMessages;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof UnreadChatRoomDTO) == true) goto L8;
        return false;
    L8:
        UnreadChatRoomDTO r52 = (UnreadChatRoomDTO) r5;
        if (p.g(this.count, r52.count) == true) goto L12;
        return false;
    L12:
        if (p.g(this.hasNewMessages, r52.hasNewMessages) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        Integer r02 = this.count;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Boolean r2 = this.hasNewMessages;
        if (r2 == null) goto L11;
        r1 = r2.hashCode();
    L11:
        return r04 + r1;
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "UnreadChatRoomDTO(count=" + this.count + ", hasNewMessages=" + this.hasNewMessages + ")";
    }

    public UnreadChatRoomDTO(Integer r1, Boolean r2) {
        this.count = r1;
        this.hasNewMessages = r2;
    }

    public /* synthetic */ UnreadChatRoomDTO(Integer r1, Boolean r2, int r3, i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = null;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = Boolean.FALSE;
    L8:
        this(r1, r2);
    }
}
